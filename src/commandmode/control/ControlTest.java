package commandmode.control;

import org.junit.Test;

/**
 * 遥控器测试类，相当于client
 */
public class ControlTest {
    @Test
    public void controlTest(){
        //实例化遥控器
        RemoteControl remoteControl = new RemoteControl();

        //实例化receiver
        Light light = new Light();
        Stereo stereo = new Stereo();

        //实例电灯command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        //实例音响command
        StareOnWithRadioCommand stareOnWithRadioCommand = new StareOnWithRadioCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOnWithVCDCommand stereoOnWithVCDCommand = new StereoOnWithVCDCommand(stereo);
        StereoOffCommand offCommand = new StereoOffCommand(stereo);

        //把命令放到遥控器（Invoker）中去
        remoteControl.setCommand(1,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(2,stareOnWithRadioCommand,offCommand);
        remoteControl.setCommand(3,stereoOnWithCDCommand,offCommand);
        remoteControl.setCommand(4,stereoOnWithVCDCommand,offCommand);

        //使用按钮
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);


    }

}
