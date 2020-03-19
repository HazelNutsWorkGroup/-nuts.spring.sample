package nuts.spring.annotation.config;

import nuts.spring.annotation.model.Car;
import nuts.spring.annotation.model.Door;
import nuts.spring.annotation.model.Seat;
import nuts.spring.annotation.model.Wheel;
import org.springframework.context.annotation.*;

//@PropertySource(value = {"classpath:application.properties"})
//@Configuration
public class BeanAutowiredConfiguration {

    @Bean
    public Door door1() {
        Door door = new Door();
        door.setName("door1");
        return door;
    }

    @Bean
    public Door door2() {
        Door door = new Door();
        door.setName("door2");
        return door;
    }

    @Profile("dev")
    @Primary
    @Bean
    public Wheel wheel1() {
        Wheel wheel = new Wheel();
        wheel.setName("wheel1");
        return wheel;
    }

    @Bean
    public Wheel wheel2() {
        Wheel wheel = new Wheel();
        wheel.setName("wheel2");
        return wheel;
    }

    @Bean
    public Seat seat() {
        Seat seat = new Seat();
        seat.setName("seat");
        return seat;
    }

    @Bean
    public Seat seat2() {
        Seat seat = new Seat();
        seat.setName("seat2");
        return seat;
    }



    @Bean
    public Car car() {
        return new Car();
    }
}
