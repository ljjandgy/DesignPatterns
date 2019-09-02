package factory.pizza.optimize.ingredient;

import factory.pizza.optimize.PizzaIngredientFactory;

import java.util.List;

/**
 * @ClassName NYPizzaIngredientFactory
 * @Description 纽约原料工厂类（具体的原料工厂类）---用于生产具体的原料。其代表的是一个工厂的一部分，类似于一条生产线
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-09-02 21:13:56
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        //生产纽约风味的面团
        return null;
    }

    @Override
    public Sauce createSauce() {
        //生产纽约风味的酱汁
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public List<Veggies> createVeggies() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }
}
