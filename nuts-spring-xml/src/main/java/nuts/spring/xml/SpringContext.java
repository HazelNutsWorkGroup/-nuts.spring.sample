package nuts.spring.xml;

import nuts.spring.xml.model.Person;
import nuts.spring.xml.util.ContextType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        context = new ClassPathXmlApplicationContext("spring-default.xml");
    }

    public SpringContext(ContextType contextType) {
        switch (contextType) {
            case Exclude: {
                context = new ClassPathXmlApplicationContext("spring-exclude.xml");
                break;
            }
            case Include: {
                context = new ClassPathXmlApplicationContext("spring-include.xml");
                break;
            }
            case Custom: {
                context = new ClassPathXmlApplicationContext("spring-custom.xml");
                break;
            }

            default: {
                context = new ClassPathXmlApplicationContext("spring-default.xml");
            }
        }
    }

    public Person getPersonBean() {
        return (Person) context.getBean("person");
    }

    public String[] getBeanNames() {
        return context.getBeanDefinitionNames();
    }

}
