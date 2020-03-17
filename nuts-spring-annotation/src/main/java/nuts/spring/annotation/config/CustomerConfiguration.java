package nuts.spring.annotation.config;

import nuts.spring.annotation.model.Person;
import nuts.spring.annotation.util.CustomerFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author Sleeber
 */
//@Configuration
//@ComponentScan(value = "nuts.spring.annotation", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {
//                CustomerFilter.class
//        })
//}, useDefaultFilters = false)
public class CustomerConfiguration {

    @Bean("person")
    public Person getPerson() {
        return new Person();
    }
}
