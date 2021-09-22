package com.marlabs.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource ds;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			//Creates DB Connection
				.dataSource(ds)
			//Fetch uname,pwd,enabled using username input entered in login page	
				.usersByUsernameQuery("select uname,upwd,uenabled from usertab where uname=?")
			//Fetch uname,role using username input entered in login page	
				.authoritiesByUsernameQuery("select uname,urole from usertab where uname=?")
			//provide password encoder object refference	
				.passwordEncoder(passwordEncoder);
		;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/home").permitAll()
				.antMatchers("/welcome").authenticated()
				.antMatchers("/admin").hasAuthority("ADMIN")
				.antMatchers("/std").hasAuthority("STUDENT")
				.antMatchers("/emp").hasAuthority("EMPLOYEE")
				.anyRequest().authenticated()
				
				.and()
				.formLogin()
				.defaultSuccessUrl("/welcome", true)
				
				.and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				
				.and()
				.exceptionHandling()
				.accessDeniedPage("/denied");
	}

/*
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("sam").password("{noop}sam").
 * authorities("ADMIN");
 * auth.inMemoryAuthentication().withUser("syed").password("{noop}syed").
 * authorities("EMPLOYEE");
 * auth.inMemoryAuthentication().withUser("jai").password("{noop}jai").
 * authorities("STUDENT"); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * //URL-AccessType http.authorizeRequests() .antMatchers("/home").permitAll()
 * .antMatchers("/welcome").authenticated()
 * .antMatchers("/admin").hasAuthority("ADMIN")
 * .antMatchers("/emp").hasAuthority("EMPLOYEE")
 * .antMatchers("/std").hasAuthority("STUDENT")
 * 
 * //LoginForm Details .and() .formLogin() .defaultSuccessUrl("/welcome", true)
 * 
 * //Logout Details .and() .logout() .logoutRequestMatcher(new
 * AntPathRequestMatcher("/logout"))
 * 
 * //exception Details .and() .exceptionHandling() .accessDeniedPage("/denied")
 * 
 * ;}
 * 
 **/ 
 
}
