package commandmode.macro;

import commandmode.undo.Command;

/**
 * 宏命令，本质为多个命令同时触发
 */
public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    /**
     * 撤销所有的命令
     */
    @Override
    public void undo() {
        //从后往前一个命令一个命令的撤销
        for (int i=commands.length-1;i>=0;i--){
            commands[i].undo();
        }
    }
}
