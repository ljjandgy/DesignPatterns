package duck;

public class WoodDuck extends Duck {
    public WoodDuck(){
        this.setFlyBehavior(new FlyNoway());
    }

    @Override
    public void display() {
        System.out.println("我是木头鸭");
    }
}
