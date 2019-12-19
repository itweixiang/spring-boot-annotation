package com.itweixiang.annotation.config;

import com.itweixiang.annotation.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Author lwx
 * @Date 2019-12-17
 * @Configuration标识的类为spring的配置类。配置类的作用与spring3的applicationContext.xml文件相同
 */
@Configuration
@ComponentScan(
        value = "com.itweixiang",//包扫描
//        excludeFilters = {//排除，excludeFilters = Filter[]
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})//排除Controller和Service
//        },
        includeFilters = {//导入,includeFilters= Filter[],需要配合useDefaultFilters = false使用
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomFilterType.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {AppService.class})//根据类的类型匹配
        }, useDefaultFilters = false)
public class AppConfig {
    /**
     * @return
     * @Bean：表示以组件的形式返回bean，bean的id默认为方法名，也可以在value="xxx"中指定beanId
     */
    @Bean(value = "person")
    public Person person() {
        return new Person("aaa", 12);
    }
}
