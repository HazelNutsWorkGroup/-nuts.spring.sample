package nuts.spring.annotation;

import nuts.spring.annotation.config.ModelConfig;
import nuts.spring.annotation.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * Spring Context Instance
 * </p>
 *
 * @author sleeber
 * @date 2020-03-15
 */
public class SpringContext {

    private ApplicationContext context;

    public SpringContext() {
        context = new AnnotationConfigApplicationContext(ModelConfig.class);
    }

    public Person getPersonBean() {
        return (Person) context.getBean("person");
    }

    public String[] getBeanNames() {
        return context.getBeanDefinitionNames();
    }

    public
}
