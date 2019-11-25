package templatemethod.recipe.base;

/**
 * 咖啡类
 */
public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugerAndMilk();
    }

    /**
     * 烧水
     */
    public void boilWater(){
        System.out.println("Boiling water");
    }

    /**
     * 通过过滤器制作滴流咖啡
     */
    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    /**
     * 把滴流咖啡倒进杯子
     */
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 加入糖和牛奶
     */
    public void addSugerAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
