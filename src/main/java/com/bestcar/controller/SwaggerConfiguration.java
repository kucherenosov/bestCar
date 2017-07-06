package com.bestcar.controller;

import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by skucherenosov on 7/6/17.
 */
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}
