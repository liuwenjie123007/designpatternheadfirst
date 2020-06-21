package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:36
 * @Version 1.0
 **/
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Light is on");
    }

    public void off(){
        System.out.println("Light is off");
    }
}
