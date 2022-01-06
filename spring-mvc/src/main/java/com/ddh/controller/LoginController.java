package com.ddh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping("main")
    public String main() {

        return "main";
    }
    @RequestMapping("goLogin")
    public String goLogin() {


        return "login";
    }
    @RequestMapping("login")
    public String login(HttpSession httpSession, String username, String password, Model model) {

        httpSession.setAttribute("userInfo", username);
          model.addAttribute("username", username);
        return "main";
    }
    @RequestMapping("logout")
    public String logout(HttpSession httpSession) {

       httpSession.removeAttribute("userInfo");

        return "login";
    }
}
