package commandmode.base;

/**
 * 普通的白炽灯
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
