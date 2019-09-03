package factory.pizza.optimize.ingredient;

import factory.pizza.optimize.PizzaIngredientFactory;

/**
 * 引入了材料工厂的纽约披萨店。这下不用一些特别的实体类去记录纽约披萨需要的特别材料了，因为原料都是由工厂去提供了。
 * 披萨店所需要做的就是在生产披萨时制定披萨所需要使用的原料工厂（厂子里面的生产线）类型即可
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if("clam".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
