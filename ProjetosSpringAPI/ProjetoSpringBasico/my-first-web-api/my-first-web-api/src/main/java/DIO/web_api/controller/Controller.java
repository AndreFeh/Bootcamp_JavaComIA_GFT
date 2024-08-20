package DIO.web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/Welcome")
    public String welcomeController(){
        return "Welcome to My Spring Web API";
    }
}
