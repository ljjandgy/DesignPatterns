package templatemethod.recipe.complate;

/**
 * 咖啡类
 */
public class Coffee extends CaffeineBeverage {

    /**
     * 通过过滤器制作滴流咖啡
     */
    @Override
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }
    /**
     * 加入糖和牛奶
     */
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
