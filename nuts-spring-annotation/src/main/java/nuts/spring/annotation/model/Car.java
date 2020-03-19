package nuts.spring.annotation.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.Resource;

public class Car implements ApplicationContextAware {
    //Autowired 先按照 type，若是存在多个按照 id/name , 或是由Qualifier/Primary指定,可以指定是否必须
    @Qualifier("door2")
    @Autowired
    private Door door;

    @Autowired
    private Wheel wheel;

    @Resource
    private Seat seat2;

    public Seat getSeat2() {
        return seat2;
    }

    public void setSeat2(Seat seat2) {
        this.seat2 = seat2;
    }

    public Door getDoor() {
        return door;
    }


    public void setDoor(Door door) {
        this.door = door;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", wheel=" + wheel +
                ", seat2=" + seat2 +
                '}';
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //实现XXXAware,获取Spring内部组件
        System.out.println(applicationContext);
    }
}
