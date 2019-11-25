package templatemethod.recipe.complate;

/**
 * 茶的制作
 */
public class Tea extends CaffeineBeverage {
    /**
     * 冲泡茶包
     */
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
    /**
     * 添加柠檬
     */
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
