package commandmode.control;

/**
 * 遥控器对象（Invoker）
 */
public class RemoteControl {
    //遥控器上打开命令的集合
    Command[] onCommands;
    //遥控器上关闭命令的集合
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    /**
     * 往遥控器中输入命令
     * @param slot 槽位
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 触发开的命令
     * @param slot 槽位位置
     */
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    /**
     * 触发关的命令
     * @param slot 槽位位置
     */
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("\n----- Remote Control ------\n");
        for (int i=0;i<onCommands.length;++i){
            sb.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("  ")
                    .append(offCommands.getClass().getName())
                    .append("\n");
        }
        return sb.toString();
    }
}
