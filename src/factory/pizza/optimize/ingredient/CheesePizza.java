package factory.pizza.optimize.ingredient;

import factory.pizza.optimize.PizzaIngredientFactory;

/**
 * 具体的披萨类，在引入原料工厂之后一个类型的披萨就可以用一个披萨类表示了，因为不用再由类自己来记录特定的材料属性（不用写死属性）
 * 现在都有材料工厂动态觉得披萨需要的原料，更加披萨店的不同
 */
public class CheesePizza extends Pizza {
    //引入材料工厂，用于动态生成原料,用什么原料工厂由使用对象决定（披萨店）
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing"+name);
        //由原料工厂提供披萨店做披萨所需要的原料
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
