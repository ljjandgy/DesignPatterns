package duck;

/**
 * @ClassName FlyRocketPower
 * @Description
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-08-13 19:30:50
 */
public class FlyRocketPower implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用火箭来飞行");
    }
}
