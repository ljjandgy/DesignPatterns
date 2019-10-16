package commandmode.base;

/**
 * 普通的白炽灯（receiver对象，负责被命令对象操作（也就是在Invoker调用命令的execute（）方法后实际进行动作的对象））
 */
public class IncandescentLight implements Light{
    @Override
    public void on() {
        System.out.println("白炽灯被打开了");
    }

    @Override
    public void off() {
        System.out.println("白炽灯被关闭了");
    }
}
