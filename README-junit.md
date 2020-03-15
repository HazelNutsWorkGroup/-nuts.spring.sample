<h1 align="center"><a href="README.md">Nuts - Spring Annotation Sample</a></h1>  

**<p align="right">「JUnit 5」测试工具</p>**
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
与以前的JUnit版本不同，JUnit 5由来自三个不同子项目的几个不同模块组成。  
   **JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage**

## <a id="dev">1.1. 开发环境</a>  
- **JDK 1.8.0_211+**
- **Gradle 5.2+**
- **IntelliJ IDEA ULTIMATE 2019.1+**

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="word">1.2. 术语与缩写解释</a>  
| 术语、缩写                                                    | 解释                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *「术语、缩写」*                                               | *对「术语、缩写」的解释说明。*                                  |
|                                                              |                                                              |
> **提示：**列出本文档中的相关术语、缩写的解释。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="config">2. 安装配置</a>
## <a id="step">2.1. 配置步骤</a>  

+ **步骤一**  
    配置 Junit 5 测试环境
```groovy
    // 子项目都配置相关插件、属性
    subprojects {
        dependencies {
            // https://mvnrepository.com/artifact/org.springframework/spring-context
            implementation 'org.springframework:spring-context:5.2.4.RELEASE'
    
    //        // https://mvnrepository.com/artifact/org.springframework/spring-test
    //        testImplementation group: 'org.springframework', name: 'spring-test', version: '5.2.4.RELEASE'
            testImplementation 'org.junit.jupiter:junit-jupiter:5.6.0'
        }
    
        test {
            useJUnitPlatform()
            testLogging {
                events "passed", "skipped", "failed"
            }
        }
    }
```  
> **提示：** junit 5 使用JUnit Platform + JUnit Jupiter，需要引入`junit-jupiter`, 
>并为子项目配置 test任务。


<p align="right"><a href="#">返回顶部</a></p>  

## <a id="focus">2.2. 注意事项</a>
| 框架、组件                                                    | 注意事项                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| junit-jupiter | 需要在所有的子项目中配置`test closure`,否则报子项目没有找到`test`任务 |
| junit 5 | 使用JUnit Platform + JUnit Jupiter，需要引入`junit-jupiter` |
| *「框架、组件」* | *「框架、组件」的引入/配置的注意事项。* |
|   |   |

> **提示：**列出项目开发中引入其他框架或技术需要特别关注或配置的事项。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="ref">3. 参考链接</a>  
| 框架、组件                                                    | 参考链接                                                      | 关键概念/步骤                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 「JUnit 5 User Guide」 | [https://junit.org/...](https://junit.org/junit5/docs/current/user-guide/) | 本文档的目的是为使用者提供全面的参考文档。 |
| *「框架、组件」*  | *「框架、组件」的参考链接*  |  *其中的关键概念/步骤*  |
|  |  |  |

> **提示：**列出本文档的所有参考文献（可以是非正式出版物，或是开源项目）.  

<p align="right"><a href="#">返回顶部</a></p>  

&copy;Copyright 2020 Sleeber(anch8apparition@163.com) Apache License 2.0, 详情见 LICENSE 文件。
