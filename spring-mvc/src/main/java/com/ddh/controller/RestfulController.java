package com.ddh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestfulController {

    @GetMapping("add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg", "结果为: "+(a+b));
        return "hello";
    }
    @PostMapping("add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg", "结果为: "+(a+b));
        return "hello";
    }
}
