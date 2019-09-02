package factory.pizza.optimize.ingredient;

import factory.pizza.optimize.PizzaIngredientFactory;

import java.util.List;

/**
 * @ClassName ChicagoPizzaIngredientFactory
 * @Description 芝加哥原料工厂类
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-09-02 21:17:21
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        //芝加哥披萨店用的是厚壳面团
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //梅子番茄酱汁
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
