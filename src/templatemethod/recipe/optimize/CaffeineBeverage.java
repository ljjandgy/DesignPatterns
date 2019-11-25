package templatemethod.recipe.optimize;

/**
 * 含咖啡因的饮料类，为茶和咖啡的抽象类
 */
public abstract class CaffeineBeverage {
    /** 制作方法都不一样，故为抽象方法，让子类重写 **/
    public abstract void prepareRecipe();

    //抽取公共方法

    /**
     * 烧水
     */
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    /**
     * 导入杯子
     */
    public void pourInCup(){
        System.out.println("Pour Into Cup");
    }
}
