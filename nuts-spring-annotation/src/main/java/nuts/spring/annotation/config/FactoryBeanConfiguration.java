package nuts.spring.annotation.config;

import nuts.spring.annotation.util.PersonFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FactoryBeanConfiguration {

    @Bean("personFactory")
    public PersonFactory personFactory() {
        System.out.println("PersonFactory initialized...");
        return new PersonFactory();
    }
}
