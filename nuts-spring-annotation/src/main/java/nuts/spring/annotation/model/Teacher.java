package nuts.spring.annotation.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {
    public Teacher(){
        System.out.println("Teacher constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Teacher PostConstruct...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Teacher PreDestroy...");
    }
}
