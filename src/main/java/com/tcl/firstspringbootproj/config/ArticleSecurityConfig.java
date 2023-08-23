package com.tcl.firstspringbootproj.config;

import com.tcl.firstspringbootproj.repository.ArticleRepository;
import com.tcl.firstspringbootproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity(debug = true)
public class ArticleSecurityConfig {
	
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private UserRepository artUserRepository;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.requestMatchers("/article/welcome").permitAll()
		
		.requestMatchers("/article/addarticle").authenticated()
		.requestMatchers("/article/findbyid/**").authenticated()
		.requestMatchers("/article/updateart/**").authenticated()
		.requestMatchers("/article/deleteart/**").authenticated()
		.requestMatchers("/artuser/adduser").permitAll()
		.requestMatchers("/artuser/findbyuserid/**").authenticated()
		.requestMatchers("/artuser/listalluser").permitAll()
		.requestMatchers("/article/listall").authenticated().and().httpBasic();

		http.csrf().disable();			
		return http.build();
	}
}