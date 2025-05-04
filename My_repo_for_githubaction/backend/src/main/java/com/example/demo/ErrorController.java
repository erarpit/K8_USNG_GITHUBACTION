package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // You can return a custom error page
        return "error";  // "error" refers to an error.html view template (optional)
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

