package com.patient1.patient1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping(path = "/403")
    public String noAuthorised(){
       return "403";
    }
}
