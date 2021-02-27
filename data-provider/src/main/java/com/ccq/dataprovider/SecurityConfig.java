package com.ccq.dataprovider;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: ccq
 * @Date: 2021-02-26 12:02
 * @Version v1.0.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .anyRequest().permitAll().and().logout().permitAll()
                .and().csrf().disable();//配置不需要登录验证
    }
}
