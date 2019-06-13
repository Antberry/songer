package com.yadayada1z2a.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotARestController {

    @GetMapping("/notresthello")
    public String getnotresthello(){
        return "hello";
    }
}
