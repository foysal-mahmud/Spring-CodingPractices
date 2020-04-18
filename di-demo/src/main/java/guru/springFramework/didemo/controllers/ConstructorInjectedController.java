package guru.springFramework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import guru.springFramework.didemo.services.GreetingService;
import guru.springFramework.didemo.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */
@Component
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
