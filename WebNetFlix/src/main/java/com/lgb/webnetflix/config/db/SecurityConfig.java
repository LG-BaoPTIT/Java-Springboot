package com.lgb.webnetflix.config.db;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.mysql.cj.x.protobuf.MysqlxSession.AuthenticateContinueOrBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers( "/home","/src/main/resources/static/css/login.css").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/login?ok=true")
				.failureUrl("/login?ok=false")
			)
			.logout((logout) -> logout.permitAll());

		return http.build();
	}
	
	
	


}