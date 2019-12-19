# springboot常用注解学习



相关代码请参见：https://github.com/itweixiang/spring-boot-annotation



## 一、创建项目和bean的添加方式

### 1、导入依赖

创建maven项目，并导入一下依赖

```xml
<!--spring 核心组件-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.1.12.RELEASE</version>
</dependency>
<!--junit测试-->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
<!--lombok为实体类生成getter或setter方法-->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.10</version>
    <scope>provided</scope>
</dependency>    
```



### 2、创建实体类

```java
/**
 * @Author lwx
 * @Date 2019-12-17
 * 使用@Data注解的实体类动态生成getter和setter方法
 */
@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
```



### 3、创建配置类

```java

```



### 4、创建service类



### 5、创建controller类





### 6、bean的添加方式

#### 1）、配置类中添加



#### 2）、指定路径



#### 3）、排除或导入