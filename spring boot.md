# 一、Spring Boot 入门

## 1:主程序入口

### 	@springBootApplication来标注主程序类

```java
@SpringBootApplication

public class SpringtestApplication {

    public static void main(String[] args){
       
        SpringApplication.run(SpringtestApplication.class, args);
    }
}
```

## 2：方便部署

### 	2.1打包成jar跟war包

​		可以在电脑上直接使用java的方式运行

# 二、Springboot 常用的配置文件的形式yml与properties
# 三、日志文件的形式
### 3.1日志面向接口开发的原则，只需要替换掉实现的jar包就能替换掉使用的框架

![1538651253105](C:\Users\lulu\AppData\Roaming\Typora\typora-user-images\1538651253105.png)

### 3.2slf4j的使用

# 四、映入静态资源

静态资源的访问位置如下物种

1. classpath:/META-INF/resources/
2. classpath:/resources
3. classpath:/static/
4. classpath:/public/
5. /当前项目的根目录 也就是resource下

### 4.1模板引擎 springboot 推荐使用的Thymeleaf（内嵌的tomcat插件是不支持jsp原生编写的，因为程序打包的是jar文件）



