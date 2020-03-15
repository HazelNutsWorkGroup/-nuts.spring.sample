package nuts.spring.xml.controller;

import nuts.spring.xml.service.HelloService;
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
