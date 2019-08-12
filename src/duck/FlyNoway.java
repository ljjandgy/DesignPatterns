package duck;

/**
 * 针对无法飞行的鸭子
 */
public class FlyNoway implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞不起来");
    }
}
