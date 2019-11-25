package templatemethod.recipe.optimize;

/**
 * 茶的制作
 */
public class Tea extends CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    /**
     * 冲泡茶包
     */
    private void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    /**
     * 添加柠檬
     */
    private void addLemon(){
        System.out.println("Adding Lemon");
    }
}
