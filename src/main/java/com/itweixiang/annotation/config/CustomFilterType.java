package com.itweixiang.annotation.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author lwx
 * @Date 2019-12-17
 */
public class CustomFilterType implements TypeFilter {
    /**
     * 常用的FilterType有：
     * ANNOTATION：根据注解匹配
     * ASSIGNABLE_TYPE：指定类的类型
     * ASPECTJ：根据aspectj表达式匹配
     * REGEX：根据正则表达式匹配
     * CUSTOM：以本类为例子
     *
     * @param metadataReader，扫描到的类信息
     * @param metadataReaderFactory，可以其他任何类的工厂
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("scan class name : -->" + className);
        //只添加类名中含有Service的类
        if (className.contains("Service")) {
            return true;
        } else {
            return false;
        }
    }
}
