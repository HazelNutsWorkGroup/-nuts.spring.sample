package nuts.spring.annotation.config;

import nuts.spring.annotation.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Sleeber
 */
//@Configuration
//@ComponentScan(value = "nuts.spring.annotation", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//})
public class ExcludeConfiguration {

    @Bean("person")
    public Person getPerson() {
        return new Person();
    }
}
