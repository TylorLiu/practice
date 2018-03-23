package org.tylor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author liubin10  2018/3/20
 */
@Component
public class StaticResourceInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!request.getRequestURI().endsWith("index.html")){
            response.sendRedirect(request.getServletPath()+"index.html");
            return false;
        }
        return true;
    }
}
