package factory.pizza.optimize;

import factory.pizza.simple.Pizza;

/**
 * 新版披萨类，和简单工厂方法的区别是它把工厂方法（生成原始披萨的方法）放到自己的类中
 * 这个类对应的就是工厂对象加工类，如果我们需要对工厂方法生产出来的对象进行加工时，就需要这个类
 */
public abstract class PizzaStore {
    /**
     * 点单
     * @param type 披萨类型
     * @return 生成完成的披萨
     */
    public Pizza orderPizza(String type){
        //利用自己类中的工厂方法创建对象
        Pizza pizza = createPizza(type);
        if (pizza == null){
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法，用于生成对象，如果类型较多时，可以把生产对象的过程放到子类中进行
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
