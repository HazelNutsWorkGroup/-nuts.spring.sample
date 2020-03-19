package nuts.spring.annotation.model;

import org.springframework.beans.factory.annotation.Value;

public class Wheel {

    @Value("${car.wheel.number}")
    private int number;

//    @Value("${car.wheel.name}")
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
        return "Wheel{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
