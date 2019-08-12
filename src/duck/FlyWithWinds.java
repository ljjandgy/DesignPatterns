package duck;

/**
 * 针对用翅膀飞行的鸭子
 */
public class FlyWithWinds implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
