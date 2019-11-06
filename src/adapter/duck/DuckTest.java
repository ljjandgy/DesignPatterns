package adapter.duck;

import org.junit.Test;

/**
 * 在本例中，适配器体现出来的作用是类的类型装换（通过适配器转换类型，转换过程中，需要根据目标类型进行行为的一些变化）
 */
public class DuckTest {
    @Test
    public void duckTest(){
        //实例化鸭子类
        MallardDuck duck = new MallardDuck();

        //实例化火鸡
        WildTurkey wildTurkey = new WildTurkey();
        //实例化适配器，让火鸡装成鸭子
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        //鸭子开始操作
        duck.fly();
        duck.quack();

        //火鸡装的鸭子开始搞
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
