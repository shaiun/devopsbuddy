package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shaiun on 09-Mar-17.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }
}
