package com.cts.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cts.user.repository.UserRepository;

@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurerAdapter{

	public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**");
	  }

}