package nuts.spring.annotation.model;

import org.springframework.beans.factory.annotation.Value;

public class Seat {

    @Value("#{4+1}")
    private int number;

    //    @Value("Seat")
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
        return "Seat{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
