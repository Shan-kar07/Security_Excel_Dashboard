package org.jpmc.security_microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo")
public class DemoController {
    
    // This is a demo controller to test the security microservice
    @GetMapping("/greet")
    public String demo1() {
        return "Hello, this is a demo endpoint1!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/rxith")
    public String greetMe(){
        return "Rakshith Updating Something";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromsonu")
    public String demo2() {
        return "Hello, this is a demo endpoint2 from sonu!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromsonu")
    public String demo300() {
        return "Hello, this is a demo for to raise conflict!";
    }
    
    // This is a demo controller to test the security microservice
    @GetMapping("/greet-by-leela")
    public String demoByLeela() {
        return "Hello, this is a demo endpoint!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromsheela")
    public String demo3() {
        return "Hello, this is a demo endpoint3!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromsheela1")
    public String test() {
        return "Hello, this is a demo endpoint12!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromaishwarya")
    public String demo12() {
        return "Hello, this is a demo endpoint12!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromaishwarya1")
    public String demo14() {
        return "Hello, this is a demo endpoint12!";
    }

    // This is a demo controller to test the security microservice
    @GetMapping("/greetfromaishwarya1")
    public String demo15() {
        return "Hello, this is a demo endpoint12!";
    }
}
