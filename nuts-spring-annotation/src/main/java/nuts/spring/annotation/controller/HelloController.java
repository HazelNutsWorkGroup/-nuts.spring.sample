package nuts.spring.annotation.controller;

import nuts.spring.annotation.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *
 * </p>
 *
 * @author Sleeber
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHelloWorld();
    }
}
