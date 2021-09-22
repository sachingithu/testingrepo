package com.marlabs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("Sachin").password("{noop}sachin").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("Bhavesh").password("{noop}bhavesh").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("Tapas").password("{noop}tapas").authorities("STUDENT");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 //URL And their Access-Type
		http.authorizeRequests()
			.antMatchers("/home").permitAll() 			//Everyone can access
			.antMatchers("/welcome").authenticated()	//Only after login
			.antMatchers("/admin").hasAuthority("ADMIN")		//Only after login By Admin Role
			.antMatchers("/emp").hasAuthority("EMPLOYEE")		//Only after login By Employee Role
			.antMatchers("/student").hasAuthority("STUDENT")
		//Login Details
				
				  .and() .formLogin() .defaultSuccessUrl("/welcome",true)
				 
		//Logout Details
		
		  .and() .logout() .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		 
		
		//Exception Details
		  .and()
		  .exceptionHandling()
		  .accessDeniedPage("/denied")
			
			
	;		
	}
}
