package com.login.Spring.Security.Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "this is Home Page";
    }
    @GetMapping("/admin")
    public  String admin(){
        return "Admin home page";
    }

}
