package commandmode.base;

import org.junit.Test;

/**
 * 遥控器测试
 */
public class RemoteControlTest {
    @Test
    public void test(){
        //实例化Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //实例化receiver
        Light light = new IncandescentLight();
        //实例化command
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

    }
}
