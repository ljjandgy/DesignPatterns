package commandmode.undo;

import commandmode.control.Light;

/**
 * 带撤销行为的关闭电灯的命令类
 */
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
