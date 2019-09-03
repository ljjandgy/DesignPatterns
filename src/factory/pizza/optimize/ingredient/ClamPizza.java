package factory.pizza.optimize.ingredient;

import factory.pizza.optimize.PizzaIngredientFactory;

/**
 * 蛤蜊披萨，同样引入材料工厂，这样才能保证蛤蜊披萨类的通用性。毕竟材料工厂能动态（运行时决定）的提供材料
 */
public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing"+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
