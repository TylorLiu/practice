package org.tylor.config;

import java.security.Principal;
import javax.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tylor.filter.AuthenticationFilter;

/**
 * @author liubin10  2018/3/19
 */
@Configuration
//@EnableOAuth2Sso
@EnableOAuth2Client
public class OAuthConfig  extends  WebSecurityConfigurerAdapter {

    @Qualifier("oauth2ClientContext")
    @Autowired
    OAuth2ClientContext oauth2ClientContext;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
//        http.addFilterBefore(ssoFilter(),BasicAuthenticationFilter.class);
        http.antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/webjars/**")
            .permitAll().anyRequest()
//            .authenticated()
//            .and()
//            .exceptionHandling()
//            .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/")).and().logout()
//            .logoutSuccessUrl("/")
            .permitAll().and().csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
            .addFilterBefore(ssoFilter(), BasicAuthenticationFilter.class);
        // @formatter:on
    }


    @Bean
    public FilterRegistrationBean oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
        registration.setOrder(-100);
        return registration;
    }

    private Filter ssoFilter() {
        OAuth2ClientAuthenticationProcessingFilter githubFilter = new OAuth2ClientAuthenticationProcessingFilter(
            "/login/github");
        OAuth2RestTemplate facebookTemplate = new OAuth2RestTemplate(github(),
            oauth2ClientContext);
        githubFilter.setRestTemplate(facebookTemplate);
        UserInfoTokenServices tokenServices = new UserInfoTokenServices(
            githubResource().getUserInfoUri(),
            github().getClientId());
        tokenServices.setRestTemplate(facebookTemplate);
        githubFilter.setTokenServices(
            new UserInfoTokenServices(githubResource().getUserInfoUri(),
                github().getClientId()));
        return githubFilter;
    }

    @Bean
    @ConfigurationProperties("github.client")
    public AuthorizationCodeResourceDetails github() {
        return new AuthorizationCodeResourceDetails();
    }

    @Bean
    @ConfigurationProperties("github.resource")
    public ResourceServerProperties githubResource() {
        return new ResourceServerProperties();
    }
}