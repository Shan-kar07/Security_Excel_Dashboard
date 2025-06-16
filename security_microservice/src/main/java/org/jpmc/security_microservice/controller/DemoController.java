package org.jpmc.security_microservice.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo")
public class DemoController {
    
    @GetMapping("/greet")
    public String demo() {
        return "Hello, this is a demo endpoint!";
    }
}
