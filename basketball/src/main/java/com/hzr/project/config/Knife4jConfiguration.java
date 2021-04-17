package com.hzr.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author Hu Zirui
 * @version 1.0.0
 * @ClassName Knife4jConfiguration.java
 * @Description TODO
 * @createTime 2021年04月16日 10:30:00
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .contact("胡梓锐 蔡正海 吴雨涵")
                        .license("懂球帝小组")
                        .description("懂球帝 RESTFUL API文档")
                        .termsOfServiceUrl("http://101.132.45.226/#/")
                        .version("2.0")
                        .build())
                //分组名称
                .groupName("2.0版本")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.hzr.project.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
