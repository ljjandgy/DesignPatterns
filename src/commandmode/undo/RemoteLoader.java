package commandmode.undo;

import commandmode.control.Light;
import org.junit.Test;

public class RemoteLoader {
    @Test
    public void test(){
        //初始化遥控器（Invoker）
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        //初始化receiver
        Light light = new Light();

        //初始化Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControlWithUndo.setCommand(0,lightOnCommand,lightOffCommand);

        //执行命令
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
