package com.example.demo.common.config.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xiaoh on 2018/2/2.
 */
public class IndexFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
