<h1 align="center"><a href="README.md">Nuts - Spring Annotation Sample</a></h1>  

**<p align="right">「nuts.spring.annotation」配置说明</p>**
*引言*   
# <a id="nav">目录</a>

1. **[介绍](#info)**  
    1.1. [开发环境](#dev)  
    1.2. [术语与缩写解释](#word)
2. **[安装配置](#config)**  
    2.1. [配置步骤](#step)  
    2.2. [注意事项](#focus) 
3. **[参考链接](#ref)** 

# <a id="info">1. 介绍</a>
「nuts.spring.annotation」采用org.springframework 5.2.4.RELEASE的annotation配置方式, 并使用Junit 5进行单元测试。 

## <a id="dev">1.1. 开发环境</a>  
- **JDK 1.8.0_211+**
- **Gradle 5.2+**
- **IntelliJ IDEA ULTIMATE 2019.1+**

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="word">1.2. 术语与缩写解释</a>  
| 术语、缩写                                                    | 解释                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *「术语、缩写」* | *对「术语、缩写」的解释说明。*  |
|  |  |
> **提示：**列出本文档中的相关术语、缩写的解释。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="config">2. 安装配置</a>
## <a id="step">2.1. 配置步骤</a>  

+ **步骤十一**  
    使用FactoryBean加载组件
```java
    @Test
    @DisplayName("testFactoryBean")
    void testFactoryBean() {
        SpringContext springContext = new SpringContext(ContextType.FactoryBean);
        System.out.println("Spring Context initialized...");
        String[] beanNames = springContext.getBeanNames();
        printBeanNames(beanNames);
        Object personFactory = springContext.getBean("personFactory");
        System.out.println(personFactory);      //FactoryBean 返回的是要创建的目标对象
        Object personFactory1 = springContext.getBean("&personFactory");
        System.out.println(personFactory1);      //FactoryBean &前缀返回的是自身实例

    }
```  
> **提示：** 对应测试方法 testFactoryBean  

+ **步骤十二** 
    Bean 生命周期initMethod, destroyMethod
```java
    @Configuration
    public class LifeCycleConfiguration {
    
        @Scope("prototype")
        @Bean(initMethod = "init",destroyMethod = "destroy")
        public School school(){
            return new School();
        }
    }
```  
> **提示：** 对应测试方法 testBeanLifeCycle  

+ **步骤十三** 
    Bean 生命周期InitializingBean, DisposableBean
```java
    public class Student implements InitializingBean, DisposableBean {
    
        public Student(){
            System.out.println("Student constructor...");
        }
    
        @Override
        public void destroy() throws Exception {
            System.out.println("Student destroy...");
        }
    
        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println("Student afterPropertiesSet...");
        }
    }
```  
> **提示：** 对应测试方法 testBeanLifeCycle  

+ **步骤十四** 
    Bean 生命周期BeanPostProcessor
```java
    public class MyBeanPostProcessor implements BeanPostProcessor {
        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("postProcessBeforeInitialization:" + beanName + ", Instance:" + beanName);
            return bean;
        }
    
        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("postProcessAfterInitialization:" + beanName + ", Instance:" + beanName);
            return bean;
        }
    }
```  
> **提示：** 对应测试方法 testBeanLifeCycle  

+ **步骤十五** 
    @Value 支持直接赋值、SpEL“#{}”、properties“${}”
```java
    public class Door {
    
        @Value("#{2*2}")
        private int number;
    
        @Value("Door")
        private String name;
    }

    public class Wheel {
        //需要指明属性文件 @PropertySource(value = {"classpath:application.properties"})
        @Value("${car.wheel.number}")
        private int number;
    
        @Value("${car.wheel.name}")
        private String name;
    }
```  
> **提示：** 对应测试方法 testBeanAutowired  

+ **步骤十六** 
    Autowired 自动装配
```java
    public class Car implements ApplicationContextAware {
        //Autowired 先按照 type，若是存在多个按照 id/name , 或是由Qualifier/Primary指定,可以指定是否必须
        @Qualifier("door2")
        @Autowired
        private Door door;
    
        @Autowired
        private Wheel wheel;
    
        @Resource
        private Seat seat2;
        
        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            //实现XXXAware,获取Spring内部组件
            System.out.println(applicationContext);
        }
    }
```  
> **提示：** 对应测试方法 testBeanAutowired  

+ **步骤十七** 
    Profile 按照指定配置加载环境变量、或是配置文件
```java
    @Profile("dev")
    @Primary
    @Bean
    public Wheel wheel1() {
        Wheel wheel = new Wheel();
        wheel.setName("wheel1");
        return wheel;
    }
```  
> **提示：** 对应测试方法 testBeanAutowired

+ **步骤十八** 
    Aspect 使用
```java
    //需要在@Configuration配置类上标注@EnableAspectJAutoProxy，来开启AspectJAutoProxy
    @Aspect
    public class DivisionAspect {
    
        @Pointcut("execution(public int nuts.spring.annotation.model.DivisionCalculation.*(..))")
        public void divisionPointCut() {
        }
    
        @Before("divisionPointCut()")
        public void beforeDivision() {
            System.out.println("Before...");
        }
    
        @After("divisionPointCut()")
        public void afterDivision() {
            System.out.println("After...");
        }
    
        @AfterReturning("divisionPointCut()")
        public void afterReturningDivision() {
            System.out.println("AfterReturning...");
        }
    
        @AfterThrowing("divisionPointCut()")
        public void afterThrowingDivision() {
            System.out.println("AfterThrowing...");
        }
    
    //    @Around("divisionPointCut()")
    //    public void aroundDivision() {
    //        System.out.println("Around...");
    //    }
    
    }

```  
> **提示：** 对应测试方法 testConditional   

+ **步骤十九** 
    Import 快速引入第三方组件
```java
//
```  
> **提示：** 对应测试方法 testImportBean

+ **步骤二十** 
    ImportSelector 方式引入第三方组件
```java
//
```  
> **提示：** 对应测试方法 testImportBean  


<p align="right"><a href="#">返回顶部</a></p>  

## <a id="focus">2.2. 注意事项</a>
| 框架、组件                                                    | 注意事项                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *@Configuration* | 配置类为了防止相关影响，建议只开启测试对应的配置类 |
| *「框架、组件」* | *「框架、组件」的引入/配置的注意事项。*  |
|  |  |

> **提示：**列出项目开发中引入其他框架或技术需要特别关注或配置的事项。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="ref">3. 参考链接</a>  
| 框架、组件                                                    | 参考链接                                                      | 关键概念/步骤                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| @Autowired、@Inject、@Resource | https://www.cnblogs.com/pjfmeng/p/7551340.html | 三者区别 |
| *「框架、组件」*  | *「框架、组件」的参考链接*  |  *其中的关键概念/步骤*  |
|  |  |  |

> **提示：**列出本文档的所有参考文献（可以是非正式出版物，或是开源项目）.  

<p align="right"><a href="#">返回顶部</a></p>  

&copy;Copyright 2020 Sleeber(anch8apparition@163.com) Apache License 2.0, 详情见 LICENSE 文件。
