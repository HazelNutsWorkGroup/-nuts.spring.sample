package nuts.spring.annotation;

import nuts.spring.annotation.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class SpringContextTest {

    SpringContext springContext;

    @BeforeEach
    void setUp() {
        springContext = new SpringContext();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("testGetPersonBean")
    void testGetPersonBean() {
        Person person = springContext.getPersonBean();
        Assert.isInstanceOf(Person.class, person);
    }

    @Test
    @DisplayName("testGetBeanNames")
    void testGetBeanNames() {
        String[] beanNames = springContext.getBeanNames();
        Assert.isTrue(beanNames.length > 3, "sdf");
    }
}