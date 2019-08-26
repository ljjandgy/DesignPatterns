package factory.pizza.simple;

/**
 * 披萨商店类，是出售披萨的地方，它需要工厂类为其生成披萨
 */
public class PizzaStore {
    SimplePizzaFactory  simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }
    /**
     * 当有客人点披萨时，店里面需要生产披萨（先生产出基本披萨，然后进行具体加工）
     * @param type 披萨的类型
     * @return 完成生产的披萨
     */
    public Pizza orderPizza(String type){
        //通过工厂方法获取原始披萨
        Pizza pizza = simplePizzaFactory.createPizza(type);
        //加工披萨
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
