package com.ddh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController1 implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("hello");
      modelAndView.addObject("msg","hello");
        return modelAndView;
    }
}
