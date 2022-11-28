package com.llkj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 10:25
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.llkj"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION)})
public class MyConfig {

}
