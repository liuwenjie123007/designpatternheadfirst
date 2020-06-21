package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:26
 * @Version 1.0
 **/
public interface Command {
    void execute();
    void undo();
}
