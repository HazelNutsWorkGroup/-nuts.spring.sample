package nuts.spring.annotation.config;

import nuts.spring.annotation.model.DivisionCalculation;
import nuts.spring.annotation.util.DivisionAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringAspectConfiguration {

    @Bean
    public DivisionCalculation divisionCalculation() {
        return new DivisionCalculation();
    }

    @Bean
    public DivisionAspect divisionAspect() {
        return new DivisionAspect();
    }

}
