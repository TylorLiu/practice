package org.tylor.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.tylor.interceptor.StaticResourceInterceptor;

/**
 * @author liubin10  2018/3/20
 */
//@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private StaticResourceInterceptor resourceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截器
        registry.addInterceptor(resourceInterceptor).addPathPatterns("/**");

//        registry.addInterceptor(new HandlerInterceptorAdapter() {
//            @Override
//            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//                // 当请求结束时，清除当前线程中的变量。使用了线程池，因此每次线程用完后都要数据清除
//                ThreadLocalUtil.remove();
//            }
//        }).addPathPatterns("/**");

        super.addInterceptors(registry);
    }

}
