package com.itweixiang.annotation.entity;

import lombok.Data;

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
