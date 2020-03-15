<h1 align="center"><a href="README.md">Nuts - Spring Annotation Sample</a></h1>  

**<p align="right">「Spring」IoC框架 </p>**
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
Spring框架拥有自己的AOP框架，该框架在概念上易于理解，并且成功解决了Java企业编程中AOP要求的80％的难题。   

## <a id="dev">1.1. 开发环境</a>  
- **JDK 1.8.0_211+**
- **Gradle 5.2+**
- **IntelliJ IDEA ULTIMATE 2019.1+**

<p align="right"><a href="#">返回顶部</a></p>  

## <a id="word">1.2. 术语与缩写解释</a>  
| 术语、缩写                                                    | 解释                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| IoC | Inversion of Control |
| *「术语、缩写」* | *对「术语、缩写」的解释说明。*  |
|  |  |
> **提示：**列出本文档中的相关术语、缩写的解释。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="config">2. 安装配置</a>
## <a id="step">2.1. 配置步骤</a>  

+ **步骤一**  
    子项目添加spring-context依赖
```groovy
    // 子项目都配置相关插件、属性
    subprojects {
        dependencies {
            // https://mvnrepository.com/artifact/org.springframework/spring-context
            implementation 'org.springframework:spring-context:5.2.4.RELEASE'
        }
    }
```  
> **提示：** 需要注意的地方  

+ **步骤二** 
    相关操作的简要说明
```html
    <html>
        <!-- config/code 示例 -->
    </html>
```  
> **提示：** 需要注意的地方  


<p align="right"><a href="#">返回顶部</a></p>  

## <a id="focus">2.2. 注意事项</a>
| 框架、组件                                                    | 注意事项                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *「框架、组件」* | *「框架、组件」的引入/配置的注意事项。* |
|   |   |

> **提示：**列出项目开发中引入其他框架或技术需要特别关注或配置的事项。

<p align="right"><a href="#">返回顶部</a></p>  

# <a id="ref">3. 参考链接</a>  
| 框架、组件                                                    | 参考链接                                                      | 关键概念/步骤                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 「spring-context」| [https://docs.spring.io/...](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html) | 参考文档的这一部分涵盖了Spring框架绝对必要的所有技术。|
| *「框架、组件」*  | *「框架、组件」的参考链接*  |  *其中的关键概念/步骤*  |
|  |  |  |

> **提示：**列出本文档的所有参考文献（可以是非正式出版物，或是开源项目）.  

<p align="right"><a href="#">返回顶部</a></p>  

&copy;Copyright 2020 Sleeber(anch8apparition@163.com) Apache License 2.0, 详情见 LICENSE 文件。
