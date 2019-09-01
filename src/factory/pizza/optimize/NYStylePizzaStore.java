package factory.pizza.optimize;

import factory.pizza.simple.Pizza;

/**
 * 具体的披萨商店，其拥有属于自己的生成披萨的方法（工厂方法）
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return null;
    }
}
