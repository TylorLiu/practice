package org.tylor.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tylor.filter.AuthenticationFilter;
import org.tylor.filter.StaticResourceFilter;

/**
 * @author liubin10  2018/3/20
 */
//@Configuration
public class FilterConfig {
    @Bean(name = "resourceFilter")
    public FilterRegistrationBean resourceFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new StaticResourceFilter());
        registration.addUrlPatterns("*");
        return registration;
    }

   @Bean(name = "authenticationFilter")
    public FilterRegistrationBean authenticationFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new AuthenticationFilter());
        registration.addUrlPatterns("*");
        return registration;
    }
}
