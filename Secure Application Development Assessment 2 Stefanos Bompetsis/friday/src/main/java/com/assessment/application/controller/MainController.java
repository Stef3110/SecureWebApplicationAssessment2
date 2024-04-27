package com.assessment.application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/member/dashboard")
    public String member_dashboard() {
        return "memberDashboard";
    }
    @GetMapping("/manager/dashboard")
    public String manager_dashboard() {
        return "managerDashboard";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
