package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:42
 * @Version 1.0
 **/
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
