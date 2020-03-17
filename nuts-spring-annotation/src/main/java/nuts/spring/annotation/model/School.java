package nuts.spring.annotation.model;

public class School {
    public School(){
        System.out.println("School Structure...");
    }

    public void init(){
        System.out.println("School initializing...");
    }

    public void destroy(){
        System.out.println("school destroy...");
    }
}
