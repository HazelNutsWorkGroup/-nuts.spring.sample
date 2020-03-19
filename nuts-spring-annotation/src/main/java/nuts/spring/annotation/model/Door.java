package nuts.spring.annotation.model;

import org.springframework.beans.factory.annotation.Value;

public class Door {

    @Value("#{2*2}")
    private int number;

//    @Value("Door")
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Door{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
