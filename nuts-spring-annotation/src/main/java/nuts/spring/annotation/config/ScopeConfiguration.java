package nuts.spring.annotation.config;


import nuts.spring.annotation.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class ScopeConfiguration {

    /**
     * Scope's parameter
     * singleton Single instance, created during container initialization
     * prototype multi instance, created only when getting examples
     */
    @Scope("prototype")
    @Bean
    public Person person() {
        System.out.println("Instance person...");
        return new Person();
    }
}
