Java Web

---

## 1.基本概念

### 1.1前言

---

web开发：

- web ,网页的意思
- 静态web
  - html css
  - 提供给所有人看的数据书中不会发生变化！

- 动态web
  - 提供给所有人看的数据会发生变化，每个人在不同的时间，不同的地点看到的信息各不相同！
  - 淘宝，几乎所有的网站；
  - 技术栈：Servlet , ASP ,PHP

在java中，动态web资源的开发的技术统称为javaweb

### 1.2 web应用程序

---

web应用程序：可以提供浏览器访问的程序；

- a.html 、b.html ......多个资源可以被外界访问，对外界进行访问
- 你们能访问的任何一个页面或者资源，都存在这个世界的某一个角落的计算机上
- URL:
- 这些统一的web资源会被放在同一个文件夹下，web应用程序-->Tomcat:服务器
- 一个web应用由多部份组成（静态web，动态web）
  - html ,css ,js
  - jsp , servlet
  - java程序
  - jar包
  - 配置文件（Properties）

web应用程序编写完毕后，若想提供给外界访问：需要一个服务器来统一管理

### 1.3 静态web

---

- *.htm , *.html.这些都是网页的后缀，如果服务器上一直存在这些东西，我们就可以直接进行读取。（通网络）
- 静态web存在的缺点
  - Web页面无法动态更新，所有用户看到的都是同一个页面
    - 轮播图 ，点击特效：伪动态
    - JavaScript [实际开发中，他用的最多]
    - VBScript
  - 他无法和数据库交互（数据无法持久化，用户无法交互）

### 1.4 动态web

页面会动态显示：“web的页面展示效果因人而异”

缺点：

- 假如服务器的动态web出了错误，我们需要重新编写**后台程序**，重新发布
  - 停机维护

优点：

- web页面可以动态更新，所有用户看到的都不是一个页面
- 它可以与数据库交互（数据持久化：注册，商品信息，用户信息....）

新手村：（看源码）

## 2.web服务器

### 2.1技术详解

ASP:

- 微软：国内最早流行的就是asp
- 在HTML中嵌入了VB的脚本，asp+com
- 在asp开发中，基本每一个页面都有几千行的业务代码，页面及其混乱
- 维护成本高
- C#
- IS

php:

- php开发速度快，功能很轻大，跨平台，代码很简单（70%，wp）
- 无法承载大访问量的情况（局限性）

JSP/Servlet

B/S:浏览和服务器

C/S:客户端和服务器

- sun公司主推的B/S架构
- 基于java语言（所有的大公司，或者一些开源的组件，都是java写的）
- 可以承载三高带来的问题
- 语法像ASP ,ASP->JSP，加强市场强度

### 2.2 web服务器

服务器是一种被动的操作，用来处理用户的一些请求和用户的一些响应信息；

**IIS**

微软的；ASP ...,Windows中自带的

**Tomcat**

面向百度编程

工作3-5年后，可以尝试手写Tomact服务器；

...

下载tomcat:

- 1.安装 or 解压
- 2.了解配置文件及目录结构
- 这个东西的作用

## 3.tomcat

### 3.1安装

### 3.2启动 关闭

测试访问：127.0.0.1:8080

![image-20221228205808865](D:\Code\idea\java-study\study-notes-imgs\image-20221228205808865.png)

### 3.3配置

可能遇到的问题：

- java环境变量没有配置
- 闪退问题：需要配置兼容性
- 乱码问题：配置文件中修改

可以配置启动的端口号

- tomcat:8080

- mysql: 3306

- http: 80

- https : 443

- ![image-20221228203234019](D:\Code\idea\java-study\study-notes-imgs\image-20221228203234019.png)

- 可以配置主机名称

  ``` java
   <Host name="localhost"  appBase="webapps"
              unpackWARs="true" autoDeploy="true">
  ```

  **高难度面试题：**

  请你谈谈网站是如何进行访问的！

  - 1.输入一个域名；回车
  
  - 2.检查本机的C:\windows\system32\drivers\etc\hosts配置文件下有没有这个域名映射；
    - 有：直接返回对应的ip地址，这个地址中，有我们需要访问的web程序，可以直接访问
    
    - 没有：去DNS服务器找，找到的话就返回，找不到就返回找不到
    

可以配置环境变量（可选）

### 3.4 发布一个网站

不会就先模仿

- 将自己写的网站，放到服务器（Tomcat）中指定的web应用的文件夹下（webapps）下，就可以访问了
  网站应该有的结构

  ```java
  --webapps: Tomcat服务器的web目录
      -root
      -ruobing 网站的目录名
      	-WEB-INF
      		-WEB.XML
      		-classes: Java程序
      		-lib ：web应用所依赖的jar包
      		-web.xml :网站配置文件
      	-index.jsp  :默认的首页
      	-static
      		-css
      			-style.css
      		-js
      		-img
      	-...
  ```

  


## 4 http

### 4.1 什么是HTTP

HTTP(超文本传输协议)是一个简单的请求-响应协议，它通常运行在TCP之上。

- 文本：html 字符串 ~
- 超文本： 图片 音乐 视频 定位 地图.....
- 80

HTTPS:安全的

- 443

### 4.2 两个时代

- http 1.0
  - http/1.0: 客户端可以与web服务器连接后，只能获得一个web资源，断开连接

- http2.0
  - http/1.1: 客户端可以与服务器连接后，可以获得多个web资源

### 4.3Http请求

- 客户端--发请求 （Request）---服务器

  ```java
  Request URL: https://i0.hdslb.com/bfs/banner   请求地址
  Request Method: GET                get/post方法
  Status Code: 200                   状态码：200
  Remote （远程）Address: 127.0.0.1:7890     
  
  ```

  ```java
  Accept: text/html 
  Accept-Encoding: gzip, deflate, br
  Accept-Language: zh-CN,zh;q=0.9    语言
  Cache-Control: max-age=0
  Connection: keep-alive
  ```

#### 1、请求行

  - 请求行中的请求方式：GET
  - 请求方式：GET/POST,HEAD,DELETE,PUT,TRACT...
    - GET:请求能够携带的参数比较少，大小有限制，会在浏览器的URL地址栏显示，不安全，但高效
    - POST:请求能够携带的参数没有限制，大小没有限制，不会在浏览器的URL地址栏显示，安全，但不高效

#### 2、消息头

  ```java
  Accept   告诉浏览器，它所支持的数据类型
  Accept-Encoding  支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
  Accept-Language   语言环境
  Cache-Control   缓存控制
  Connection  告诉浏览器，请求完成是断开还是保持连接
  HOST:  主机.../.
  ```

  

### 4.4Http响应

- 服务器--响应----客户端

百度：

```java
Cache-Control:private       缓存控制
Connection: keep-alive      连接
Content-Encoding: gzip      编码
Content-Type: text/html; charset=utf-8 类型
```

#### 1.响应体

```java
Accept   告诉浏览器，它所支持的数据类型
Accept-Encoding  支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
Accept-Language   语言环境
Cache-Control   缓存控制
Connection  告诉浏览器，请求完成是断开还是保持连接
HOST:  主机.../.
Refresh:告诉客户端，多久刷新一次
Location: 让网页重新定位；
```

#### 2.响应状态码

200： 请求响应成功

3**：请求重定向

- 重定向：你重新给我到你新位置去；

4**：找不到资源 404

- 资源不存在

5**：服务器代码错误 500  502：网关错误

**常见面试题：**

- 当你的浏览器中地址栏输入地址的一瞬间到页面能够展示回来，经历了什么？

## 5.Maven

**我为什么要学习这个技术？**

1. 在javaweb开发中，需要大量使用jar包，我们手动去导入。
2. 如何能让一个东西自动帮我导入和配置这个jar包

### 5.1maven项目架构管理工具

我们目前用来就是方便导入jar包的！

maven的核心思想： **约定大于配置**

- 有约束，不要去违反。

maven会规定好你该如何去编写我们的java代码，必须要按照这个规范来；

### 5.2下载和安装

### 5.3配置环境变量

### 5.4阿里云镜像

```xml
  <!-- 阿里云仓库，个人配置 -->
    <mirror>
      <id>aliyunmaven</id>
      <mirrorOf>*</mirrorOf>
      <name>阿里云公共仓库</name>
      <url>https://maven.aliyun.com/repository/public</url>
    </mirror>

```

### 5.5本地仓库

### 5.6 Maven在idea中的操作

