package com.simpleteen.wandering.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("流浪所后端接口文档")
                        .description("通过此文档可以查看和测试后端api")
                        .termsOfServiceUrl("http://localhost:8080")
                        .contact(new Contact("沈金勇","https://github.com/","438217638@qq.com"))
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("wandering")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.simpleteen.wandering.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}