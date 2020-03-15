<h1 align="center"><a href="README.md">Nuts - Spring Annotation Sample</a></h1>  

**<p align="right">「Gradle」构建工具</p>**
`Gradle`是一个基于`Apache Ant`和`Apache Maven`概念的项目自动化构建开源工具。
它使用一种基于`Groovy`的特定领域语言(DSL)来声明项目设置，目前也增加了基于Kotlin语言的kotlin-based DSL，
抛弃了基于XML的各种繁琐配置。面向Java应用为主。当前其支持的语言限于Java、Groovy、Kotlin和Scala，计划未来将支持更多的语言。
# <a id="nav">目录</a>

1. **[介绍](#info)**  
    1.1. [开发环境](#dev)  
    1.2. [术语与缩写解释](#word)
2. **[安装配置](#config)**  
    2.1. [配置步骤](#step)  
    2.2. [注意事项](#focus) 
3. **[参考链接](#ref)** 

# <a id="info">1. 介绍</a>
从移动应用程序到微服务，从小型创业公司到大型企业，「Gradle」可以帮助团队更快地构建，自动化和交付更好的软件。  

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
    多项目配置--根项目的build.gradle
```groovy
    // 根项目及子项目都配置相关插件、属性
    allprojects {
        apply plugin: 'java'
    
        group 'org.hazulnut'
        version '1.0-SNAPSHOT'
        setProperty('sourceCompatibility', 1.8)
        setProperty('targetCompatibility', 1.8)
    
        repositories {
            maven { url 'https://maven.aliyun.com/repository/public/' }
            maven { url 'https://maven.aliyun.com/repository/central' }
            maven { url 'https://maven.aliyun.com/repository/jcenter'}
            maven { url 'https://maven.aliyun.com/repository/spring/' }
            maven { url 'https://maven.aliyun.com/repository/spring-plugin'}
            maven { url 'https://maven.aliyun.com/repository/gradle-plugin'}
            mavenLocal()
            mavenCentral()
            jcenter()
        }
    }

    // 子项目都配置相关插件、属性
    subprojects {
    
    }
```  
> **提示：** root项目中的build.gradle优先被处理，然后按照项目引入顺序依次处理

+ **步骤二** 
    自定义配置build.gradle文件名称
```groovy
    // 修改子项目的build.gradle文件名称
    rootProject.children.each {
        project ->
            def fileName = project.name.substring(project.name.lastIndexOf('.') + 1)+".gradle"
            project.setBuildFileName(fileName)
    }
```  
> **提示：** 注：所有项目都是使用同一种命名方式，即nuts.springboot.MODEL, 则上面运行效果是：按照MODEL.gradle作为子项目的构建文件名称。
>这段代码要放置在setting.gradle 文件的最后，否则这段代码之后引入的项目的构建文件名称还是build.gradle。
>若是配置在build.gradle中，无论是根项目还是子项目，都会编译错误：buildFileName字段是只读的。 


<p align="right"><a href="#">返回顶部</a></p>  

## <a id="focus">2.2. 注意事项</a>
| 框架、组件                                                    | 注意事项                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| gradle                                                       | 包含wrapper路径,初始可以开发本地不安装gradle。                   |
|  |  |
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
