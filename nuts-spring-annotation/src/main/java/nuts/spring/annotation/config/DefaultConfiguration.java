package nuts.spring.annotation.config;

import nuts.spring.annotation.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sleeber
 */
//@Configuration
//@ComponentScan("nuts.spring.annotation")
public class DefaultConfiguration {

    @Bean("person")
    public Person getPerson() {
        return new Person();
    }
}
