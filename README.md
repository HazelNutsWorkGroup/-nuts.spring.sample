<h1 align="center"><a href="README.md">Nuts - Spring Annotation Sample</a></h1>  

**<p align="right">「Nuts-Spring-Sample」项目框架技术</p>**
`Spring Annotation Sample`是使用`Spring`注解的示例项目。同时会对照传统XML配置方式

# <a id="nav">目录</a>

1. **[介绍](#info)**  
    1.1. [开发环境](#dev)  
    1.2. [术语与缩写解释](#word)
2. **[软件结构](#soft)**  
    2.1. [项目目录结构](#dir)  
    2.2. [Module列表](#list)
3. **[注意事项](#focus)**  
4. **[参考链接](#ref)** 


# <a id="info">1. 介绍</a>
「Nuts-Spring-Sample」基于org.springframework的5.2.4.RELEASE版本进行开发的，并采用Gradle进行项目构建。
由于Gradle是初次使用，且org.springframework采用的版本也是项目开发时最新的版本，不推荐应用到实际生产项目中。
过程中参考的开源项目会列到参考文献章节中，感谢其作者的无私奉献。  

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="dev">1.1. 开发环境</a>  
- **JDK 1.8.0_211+**
- **Gradle 5.2+**
- **IntelliJ IDEA ULTIMATE 2019.1+**

> **提示：**项目中使用的其他组件版本及其配置要求会在`README-[组件名称].md`文件中进行详细的描述。
> 具体请参阅`README-[组件名称].md文件`  

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="word">1.2. 术语与缩写解释</a>  
| 术语、缩写                                                    | 解释                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *「术语、缩写」*                                               | *对「术语、缩写」的解释说明。*                                  |
|                                                              |                                                              |
> **提示：**列出本文档中的相关术语、缩写的解释。


<p align="right"><a href="#">返回顶部</a></p>  

# <a id="soft">2. 软件结构</a>
## <a id="dir">2.1. 项目目录结构</a>  
| 文件/目录名称                                                 | 文件/目录介绍                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| src                                                          | 源码目录，项目根目录中的src未存放源码，源码分布在具体的`Module`中  |
| build.gradle                                                 | 可以理解为一个Project框架，文件包含项目构建所使用的脚本。          |
| gradle                                                       | 包含wrapper路径,可以利用它进行安装项目默认的gradle.              |
| gradlew                                                      | linux下的构建命令脚本，与使用已安装的Gradle运行构建是一样的。      |
| gradlew.bat                                                  | windows下的构建命令脚本，与使用已安装的Gradle运行构建是一样的。    |
| setting.gradle                                               | 包含必要的一些设置，例如，任务或项目之间的依懒关系等.              |
| README.md                                                    | 项目说明文档                                                  |
| [README-gradle.md](./README-gradle.md)                       | Gradle介绍及相关配置说明                                       |
| [README-spring.md](./README-spring.md)                       | Spring Core 介绍及相关配置说明                                 |
| [README-junit.md](./README-junit.md)                         | Junit5介绍及相关配置说明                                       |
| [README-Template.md](./README-Template.md)                   | 组件/模块的MarkDown文档模板                                    |
| `「nuts.spring.annotation」`                                 | Module项目，具体Module说明，请参阅Module项目中的[`README-annotation.md`](./nuts-spring-annotation/README-annotation.md)文件 |
| `「nuts.spring.xml」`                                        | Module项目，具体Module说明，请参阅Module项目中的[`README-xml.md`](./nuts-spring-xml/README-xml.md)文件 |
|                                                              |                                                              |

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="list">2.2. Module列表</a>
## Module列表
| Module名称                                                   | Module介绍                                                    |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| `nuts.spring.annotation` | 使用 annotation 和 javaconfig 方式 |
| `nuts.spring.xml` | 使用 xml 配置文件方式 |
|  |  |

> **提示：**这里Module列是指相对独立的软件设计单元，即项目中的子模块项目。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="focus">3. 注意事项</a>  
| 框架、组件                                                    | 注意事项                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 「Gradle」 | 请参照[`README-gradle.md`](./README-gradle.md)中的相关配置说明 |
| 「Spring-Context」 | 请参照[`README-spring.md`](./README-spring.md)中的相关配置说明 |
| 「Junit 5」 | 请参照[`README-junit.md`](./README-junit.md)中的相关配置说明 |
| *「框架、组件」* | *「框架、组件」的引入/配置的注意事项。* |
|   |   |

> **提示：**列出项目开发中引入其他框架或技术需要特别关注或配置的事项。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="ref">4. 参考链接</a>  
| 框架、组件                                                    | 参考链接                                                      | 关键概念/步骤                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 「Spring注解驱动开发」 | [https://edu.csdn.net/...](https://edu.csdn.net/course/detail/7600) | 一套帮助我们深入了解Spring原理机制的教程 |
| *「框架、组件」*  | *「框架、组件」的参考链接*  |  *其中的关键概念/步骤*  |
|  |  |  |

> **提示：**列出本文档的所有参考文献（可以是非正式出版物，或是开源项目）.  

<p align="right"><a href="#">返回顶部</a></p>  

&copy;Copyright 2020 Sleeber(anch8apparition@163.com) Apache License 2.0, 详情见 LICENSE 文件。
