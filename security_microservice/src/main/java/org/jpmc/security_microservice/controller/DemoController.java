package org.jpmc.security_microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo")
public class DemoController {
    
    @GetMapping("/greet")
    public String demo1() {
        return "Hello, this is a demo endpoint1!";
    }

    @GetMapping("/rxith")
    public String greetMe(){
        return "Rakshith Updating Something";
    }

    @GetMapping("/greetfromsonu")
    public String demo2() {
        return "Hello, this is a demo endpoint2!";
    }
    @GetMapping("/greetfromsheela")
    public String demo3() {
        return "Hello, this is a demo endpoint3!";
    }

    @GetMapping("/greetfromaishwarya")
    public String demo12() {
        return "Hello, this is a demo endpoint12!";
    }

}
