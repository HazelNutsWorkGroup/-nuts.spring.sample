package nuts.spring.xml.service.impl;

import nuts.spring.xml.service.HelloService;
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
