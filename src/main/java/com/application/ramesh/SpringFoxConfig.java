package com.application.ramesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
public class SpringFoxConfig {                                    
    @Bean
    public Docket api() {                
        return new Docket(DocumentationType.SWAGGER_2)          
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.application.ramesh"))
          .paths(PathSelectors.any()	)
          .build()
          .apiInfo(apiInfo());
    }
     
    private ApiInfo apiInfo() {
    	return new ApiInfo("Patient Info", "Patient Info API", "1", "All this services are Strictly prohibited to use from external sources", new springfox.documentation.service.Contact("Ramesh", "", "chattyramesh412@gmail.com"), "", null, null);
    	
    }
} 