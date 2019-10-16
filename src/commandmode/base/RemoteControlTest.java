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
        //实例化command---由client实现，故当前这个测试类充当的就是客户端角色
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

    }
}
