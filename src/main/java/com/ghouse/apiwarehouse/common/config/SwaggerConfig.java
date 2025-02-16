package com.ghouse.apiwarehouse.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfigDocket() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ghouse.apiwarehouse")).build().apiInfo(swaggerApiInfo());
	}

	public ApiInfo swaggerApiInfo() {

		return new ApiInfo("APIWarehouse API", "APIWarehouse-Spring Boot Application developed by TonyGhouse", "v 1.0",
				"No Terms & Conditions",
				new springfox.documentation.service.Contact("Tony Ghouse", "tonyghouse.com", "tonyghosueofficial@gmail.com"),
				"GPL-2.0 License", "https://opensource.org/licenses/GPL-2.0", Collections.emptyList());

	}

}
