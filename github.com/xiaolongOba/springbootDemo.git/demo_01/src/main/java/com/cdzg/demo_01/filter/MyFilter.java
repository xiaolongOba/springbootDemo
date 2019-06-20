package com.cdzg.demo_01.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.cdzg.demo_01.config.CdzgProperties;

public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("拦截器生成");
	}
	@Override
	public void doFilter(ServletRequest requests, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) requests;
		System.out.println("This is My Url :" + request.getRequestURL());
		CdzgProperties cdzgProperties = new CdzgProperties();
		System.out.println(cdzgProperties.getTitle()+":"+cdzgProperties.getDescription());
		chain.doFilter(requests, response);

	}
	@Override
	public void destroy() {
	}
}
