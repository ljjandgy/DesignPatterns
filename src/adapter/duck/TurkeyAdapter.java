package adapter.duck;

/**
 * 火鸡的鸭子适配器，可以在鸭子数量不足时让火鸡去装鸭子
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        //当需要鸭子叫时，只能用火鸡叫来充数
        turkey.gobble();
    }

    @Override
    public void fly() {
        //因为火鸡飞的距离短，所以需要多飞几次才能更像鸭子飞行
        for (int i=0;i<5;++i){
            turkey.fly();
        }
    }
}
