package com.example.springboot_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // specify that class below is the traffic handler for application
public class HomeController {
    @RequestMapping("/")  // setting up a route or endpoint
    public String homePage() {  //method which returns a string specifying the name of an HTML template
     return "index" ;  //  the name of the forwarding template is index.html
    }
}
