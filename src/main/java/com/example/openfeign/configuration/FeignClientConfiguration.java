package com.example.openfeign.configuration;

import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("user", "password");
	}

	@Bean
	public RequestInterceptor requestInterceptor() {
		return requestTemplate -> {
			requestTemplate.header("Content-Type", "application/json");
			requestTemplate.header("Accept", "application/json");
			requestTemplate.header("header_1", "value_1");
			requestTemplate.header("header_2", "value_2");
			requestTemplate.header("header_3", "value_3");
		};
	}

}
