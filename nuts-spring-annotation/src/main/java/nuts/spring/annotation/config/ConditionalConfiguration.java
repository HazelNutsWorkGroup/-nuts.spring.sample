package nuts.spring.annotation.config;


import nuts.spring.annotation.model.Person;
import nuts.spring.annotation.util.LinuxCondition;
import nuts.spring.annotation.util.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConditionalConfiguration {

    @Conditional(WindowsCondition.class)
    @Bean("windows")
    public Person getWindows() {
        System.out.println("Instance Windows...");
        return new Person();
    }

    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person getLinux() {
        System.out.println("Instance Linux...");
        return new Person();
    }
}
