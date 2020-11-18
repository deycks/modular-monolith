package com.example.microservice.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
			new HashSet<>(Arrays.asList("application/json"));
	
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any())
				.paths(apiPaths())
				.build();
	}

	private Predicate<String> apiPaths() {
		return Predicates.or(
				regex("/v1/user.*"),
				regex("/v2/user.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Titulo para el template")
				.license("Neoris")
				.licenseUrl("https://www.neoris.com/")
				.version("1.0.0").build();
	}
	

}