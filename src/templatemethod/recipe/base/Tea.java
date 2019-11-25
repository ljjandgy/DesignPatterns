package templatemethod.recipe.base;

/**
 * 茶的制作
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    /**
     * 把水煮沸
     */
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    /**
     * 冲泡茶包
     */
    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    /**
     * 添加柠檬
     */
    public void addLemon(){
        System.out.println("Adding Lemon");
    }
    /**
     * 倒进杯子
     */
    public void pourInCup(){
        System.out.println("Pour into cup");
    }
}
