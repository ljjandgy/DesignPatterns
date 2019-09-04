package factory.pizza.optimize;

import factory.pizza.optimize.ingredient.Cheese;
import factory.pizza.optimize.ingredient.Clam;
import factory.pizza.optimize.ingredient.Dough;
import factory.pizza.optimize.ingredient.Pepperoni;
import factory.pizza.optimize.ingredient.Sauce;
import factory.pizza.optimize.ingredient.Veggies;

import java.util.List;

/**
 * @ClassName PizzaIngredientFactory
 * @Description 原料工厂接口，用于生产产品族（一系列的产品）
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-09-02 20:44:41
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团原料
     * @return 面团
     */
    Dough createDough();

    /**
     * 创建酱汁
     * @return 酱汁
     */
    Sauce createSauce();

    /**
     * 创建起司对象
     * @return 起司
     */
    Cheese createCheese();

    /**
     * 创建蔬菜
     * @return 蔬菜集合
     */
    List<Veggies> createVeggies();

    /**
     * 创建腊肠对象
     * @return 意式腊肠
     */
    Pepperoni createPepperoni();

    /**
     * 创建蛤蜊
     * @return 蛤蜊对象
     */
    Clam createClam();

}
