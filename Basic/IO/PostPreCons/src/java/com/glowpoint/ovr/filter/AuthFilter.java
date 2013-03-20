/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glowpoint.ovr.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Masudul Haque
 */
public class AuthFilter implements Filter {
    private String firstValue;
    
    private FilterConfig filterConfig = null;
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
            HttpServletRequest req= (HttpServletRequest) request;
            HttpServletResponse res= (HttpServletResponse) response;
            
            if(req.getSession().getAttribute("login")==null){
                 setFirstValue("2");
                res.sendRedirect("faces/login.xhtml");
               
            }       
            chain.doFilter(request, response);
        }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            setFirstValue(filterConfig.getInitParameter("first"));
        }
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }
     
    

}
