package com.yaolong.oauth2.server.config;

import com.yaolong.oauth2.server.config.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceImpl();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .passwordEncoder(passwordEncoder())
//                .withUser("admin").password(passwordEncoder().encode("123")).roles("ADMIN")
//                .and()
//                .withUser("admin1").password(passwordEncoder()
//                .encode("123")).roles("USER");
        auth.userDetailsService(userDetailsService());


    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("secret"));
//    }
}
