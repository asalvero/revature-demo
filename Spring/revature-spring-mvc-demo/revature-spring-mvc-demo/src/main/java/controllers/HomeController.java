package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("this is home controller home method");
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("this is home controller about method");
        return "about";
    }

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("this is home controller contact method");
        return "contact";
    }
}
