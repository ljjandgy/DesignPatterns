package commandmode.base;

public class SimpleRemoteControl {
    private Command slot;

    /**
     * 把命令放到插槽中，以便触发命令操作
     * @param command
     */
    public void setCommand(Command command){
        slot = command;
    }

    /**
     * 当插槽对应按钮被按下时，命令就会触发
     */
    public void buttonWasPressed(){
        slot.execute();
    }
}
