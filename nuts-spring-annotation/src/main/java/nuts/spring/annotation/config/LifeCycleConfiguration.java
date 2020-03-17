package nuts.spring.annotation.config;

import nuts.spring.annotation.model.School;
import nuts.spring.annotation.model.Student;
import nuts.spring.annotation.model.Teacher;
import nuts.spring.annotation.util.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Student.class, Teacher.class, MyBeanPostProcessor.class})
public class LifeCycleConfiguration {

    //    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public School school() {
        return new School();
    }
}
