package templatemethod.recipe.optimize;

/**
 * 咖啡类
 */
public class Coffee extends CaffeineBeverage {

    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugerAndMilk();
    }

    /**
     * 通过过滤器制作滴流咖啡
     */
    private void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }
    /**
     * 加入糖和牛奶
     */
    private void addSugerAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
