package nuts.spring.annotation.config;


import nuts.spring.annotation.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

//@Configuration
public class LazyConfiguration {

    @Lazy
    @Bean
    public Person person() {
        System.out.println("Instance person...");
        return new Person();
    }
}
