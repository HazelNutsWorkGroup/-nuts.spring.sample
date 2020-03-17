package nuts.spring.annotation.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

    public Student(){
        System.out.println("Student constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Student destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Student afterPropertiesSet...");
    }
}
