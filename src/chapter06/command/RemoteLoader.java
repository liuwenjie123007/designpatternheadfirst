package chapter06.command;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/17 12:43
 * @Version 1.0
 **/
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        Command[] partyOn = {lightOnCommand, lightOffCommand};
        Command[] partyOff = {lightOffCommand, lightOnCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(1, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(1);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(1);
    }
}
