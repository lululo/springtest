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