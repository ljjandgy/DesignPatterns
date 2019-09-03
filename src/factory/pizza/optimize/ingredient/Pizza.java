package factory.pizza.optimize.ingredient;

/**
 * @ClassName Pizza
 * @Description 带原料工厂的披萨类
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-09-02 21:42:27
 */
public abstract class Pizza {
    /** 依赖的都是抽象类，不会去依赖实际的类 **/
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    /** 抽象披萨的准备流程，现在由子类去实现它，材料工厂在子类中应用 **/
    abstract void prepare();
    /** 公共的烘焙的方法 **/
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

}
