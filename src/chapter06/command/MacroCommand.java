package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:47
 * @Version 1.0
 **/
public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command: commands) {
            command.undo();
        }
    }
}
