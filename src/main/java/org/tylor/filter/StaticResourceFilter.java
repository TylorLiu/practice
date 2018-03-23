package org.tylor.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liubin10  2018/3/20
 */
public class StaticResourceFilter extends ExcludeFilter {


    @Override
    protected void doFilterIntern(ServletRequest servletRequest, ServletResponse servletResponse,
        FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest instanceof HttpServletRequest){
            String path =( (HttpServletRequest) servletRequest).getServletPath();
            if(!path.contains(".")){
                final StringBuilder sb = new StringBuilder();
                Arrays.asList(path.split("/")).stream().forEachOrdered(x->{
                    try {
                        sb.append(URLEncoder.encode(x,"UTF-8")).append("/");
                    } catch (UnsupportedEncodingException e) {
                        sb.append(x).append("/");
                    }
                });
                if (sb.length()==0){
                    sb.append("/");
                }
                sb.append("index.html");
                ((HttpServletResponse) servletResponse).sendRedirect(sb.toString());
                return;
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
