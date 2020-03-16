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

+ **步骤一**  
    加载Spring Java配置文件
```java
    //Java配置文件加载
    ApplicationContext context = new AnnotationConfigApplicationContext(ModelConfig.class);
```  
    Bean 定义
```java
    @Configuration
    public class ModelConfig {
    
        @Bean("person")
        public Person getPerson() {
            return new Person();
        }
    }
```  
> **提示：** 对应测试方法 testGetPersonBean  

+ **步骤二** 
    包扫描路径
```java
    @Configuration
    @ComponentScan("nuts.spring.annotation")
    public class ModelConfig {
    
        @Bean("person")
        public Person getPerson() {
            return new Person();
        }
    }
```  
> **提示：** 对应测试方法 testGetBeanNames  

+ **步骤三** 
    excludeFilters
```java
    @Configuration
    @ComponentScan(value = "nuts.spring.annotation", excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Configuration.class})
    })
    public class ExcludeConfiguration {
    
    }
```  
> **提示：** 对应测试方法 testExcludeBeanNames  

+ **步骤四** 
    includeFilters
```java
    @Configuration
    @ComponentScan(value = "nuts.spring.annotation", includeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})
    }, useDefaultFilters = false) //需要禁用默认引入规则
    public class IncludeConfiguration {
    
    }
```  
> **提示：** 对应测试方法 testIncludeBeanNames  

+ **步骤五** 
    自定义Filter类型
```java
    @Configuration
    @ComponentScan(value = "nuts.spring.annotation", includeFilters = {
            @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {
                    CustomerFilter.class
            })
    })
    public class CustomerConfiguration {
    }
```  
> **提示：** 对应测试方法 testIncludeBeanNames  

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
| *「框架、组件」*  | *「框架、组件」的参考链接*  |  *其中的关键概念/步骤*  |
|  |  |  |

> **提示：**列出本文档的所有参考文献（可以是非正式出版物，或是开源项目）.  

<p align="right"><a href="#">返回顶部</a></p>  

&copy;Copyright 2020 Sleeber(anch8apparition@163.com) Apache License 2.0, 详情见 LICENSE 文件。
