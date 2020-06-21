package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:36
 * @Version 1.0
 **/
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
