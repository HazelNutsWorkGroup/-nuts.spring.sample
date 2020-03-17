package nuts.spring.annotation.config;

import nuts.spring.annotation.model.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LifeCycleConfiguration {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public School school(){
        return new School();
    }
}
