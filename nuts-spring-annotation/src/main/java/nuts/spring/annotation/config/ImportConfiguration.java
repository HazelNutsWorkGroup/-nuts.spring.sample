package nuts.spring.annotation.config;


import nuts.spring.annotation.model.Group;
import nuts.spring.annotation.model.Person;
import nuts.spring.annotation.util.MyImportBeanDefinitionRegistrar;
import nuts.spring.annotation.util.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Group.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class ImportConfiguration {

    /**
     * ComponentScan
     * Bean
     * Import
     */
    @Bean
    public Person person() {
        System.out.println("Instance person...");
        return new Person();
    }
}
