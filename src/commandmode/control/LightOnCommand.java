package commandmode.control;

/**
 * 打开灯的命令，持有灯的对象，用于触发灯的打开动作
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
