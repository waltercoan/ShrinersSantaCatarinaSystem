package br.univille.ShrinersSantaCatarinaSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("doctor").password("doctor").roles("USER")
			.and()
			.withUser("shriner").password("shriner").roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		String[] resources = new String[]{
                "/", "/home","/pictureCheckCode","/include/**",
                "/css/**","/icons/**","/images/**","/js/**","/layer/**"
        };
		
		http
		.authorizeRequests()
			.anyRequest().authenticated()
			.antMatchers(resources).permitAll()
		.and()
			.formLogin()
			.loginPage("/login")
            .permitAll();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}























/*
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication()
		.withUser("user").password("user").roles("USER")
		.and()
		.withUser("admin").password("admin").roles("ADMIN");
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	http
		.authorizeRequests()
			.anyRequest().fullyAuthenticated()
		.and()
			.httpBasic()
		.and()
			.logout()                 
			.logoutUrl("/logout")
			.logoutSuccessUrl("/")                                           
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.permitAll()
		.and()
			.formLogin()
			//.loginPage("/eunaoacredito")
			.permitAll();
}
@Bean
public PasswordEncoder passwordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}*/