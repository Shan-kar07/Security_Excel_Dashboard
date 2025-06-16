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
        return "Hello, this is a demo endpoint2 from sonu!";
    }

    @GetMapping("/greetfromsonu")
    public String demo300() {
        return "Hello, this is a demo for to raise conflict!";
    }
    
    @GetMapping("/greet-by-leela")
    public String demoByLeela() {
        return "Hello, this is a demo endpoint!";
    }

    @GetMapping("/greetfromsheela")
    public String demo3() {
        return "Hello, this is a demo endpoint3!";
    }
    @GetMapping("/greetfromsheela1")
    public String test() {
        return "Hello, this is a demo endpoint12!";
    }

    @GetMapping("/greetfromaishwarya")
    public String demo12() {
        return "Hello, this is a demo endpoint12!";
    }

    @GetMapping("/greetfromaishwarya1")
    public String demo14() {
        return "Hello, this is a demo endpoint12!";
    }

}
