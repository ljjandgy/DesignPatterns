package commandmode.base;

/**
 * Invoker对象，持有命令对象，并负责触发命令（执行命令的execute（）方法）
 */
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
