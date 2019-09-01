package factory.pizza.optimize;

import factory.pizza.simple.Pizza;

/**
 * 具体工厂类，生成产品的具体逻辑都放到工厂类中封装起来
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }else if("pepperoni".equals(type)){
            return new ChicagoPepperoniPizza();
        }
        //没有符合的类型就返回null
        return null;
    }
}
