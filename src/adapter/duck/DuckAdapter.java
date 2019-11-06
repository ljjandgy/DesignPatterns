package adapter.duck;

import java.util.Random;

/**
 * 鸭子的火鸡适配器，鸭子为被适配对象（客户），火鸡为被适配对象
 */
public class DuckAdapter implements Turkey{
    //适配器持有被适配对象的抽象
    private Duck duck;
    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void gobble() {
        //用鸭子叫充当火鸡叫
        duck.quack();
    }

    @Override
    public void fly() {
        //鸭子飞的远，所以其他火鸡平均飞5次，鸭子才飞一次
        Random random = new Random();
        if (random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
