package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // This method handles errors and returns the error view
        return "error"; // This should be an HTML page or template named 'error.html'
    }

    // In Spring Boot 2.x or later, you can remove this method.
    // @Override
    // public String getErrorPath() {
    //     return "/error";
    // }
}

