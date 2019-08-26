package factory.pizza.simple;

/**
 * 披萨生成类，其应用了简单工厂模式（简单工厂模式并不算是工厂模式，也不是一种设计模式，只是单纯的业务拆分、封装而已）
 * 可以看到，简单工厂模式还是没有摆脱if else的魔咒
 */
public class SimplePizzaFactory {
    /**
     * 生产原始披萨
     * @param type 客户点的披萨类型
     * @return 原始披萨
     */
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }else if("clam".equals(type)){
            pizza = new CheesePizza();
        }else if("veggie".equals(type)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
