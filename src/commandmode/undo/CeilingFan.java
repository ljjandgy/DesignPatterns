package commandmode.undo;

/**
 * 电扇类，用于实践使用状态实现撤销
 */
public class CeilingFan {
    /** 定义电扇的档位 **/
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static  final int OFF = 0;
    private String location;
    private int speed;
    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }
    /** 设置电风扇档位 **/
    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }
    public void off(){
        speed = OFF;
    }

    /**
     * 获取当前转速
     * @return 转速
     */
    public int getSpeed(){
        return speed;
    }

}
