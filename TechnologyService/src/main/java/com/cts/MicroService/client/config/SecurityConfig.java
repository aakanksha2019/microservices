package com.cts.MicroService.client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurerAdapter{

	public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**");
	  }

}
