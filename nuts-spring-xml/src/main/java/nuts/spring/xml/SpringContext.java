package nuts.spring.xml;

import nuts.spring.xml.model.Person;
import org.springframework.context.ApplicationContext;
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
    public SpringContext(){
         context = new ClassPathXmlApplicationContext("spring-beans.xml");
    }

    public Person getPersonBean(){
        return (Person)context.getBean("person");
    }

    public String[] getBeanNames(){
        return context.getBeanDefinitionNames();
    }

}
