package com.ddh.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //如果是登录页面或者第一次登录放行
        if (request.getRequestURI().contains("login"))
        {
            return  true;
        }
        if (session.getAttribute("userInfo")!=null){
            return  true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);


        return false;
    }
}
