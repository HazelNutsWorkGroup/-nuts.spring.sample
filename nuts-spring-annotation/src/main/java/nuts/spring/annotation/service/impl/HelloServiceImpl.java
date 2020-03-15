package nuts.spring.annotation.service.impl;

import nuts.spring.annotation.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Sleeber
 *
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHelloWorld() {
        return "Hello World!";
    }
}
