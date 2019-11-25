package templatemethod.recipe.complate;

/**
 * 含咖啡因的饮料类，为茶和咖啡的抽象类.
 * 在本类中，会对流程进行抽象化，也就是定义标准化的流程，然后由子类去重写需要自定义的流程项
 */
public abstract class CaffeineBeverage {
    /**
     * 现在由父类定义标准流程，子类除了继承功能流程项以外，还需要重写需要自定义的流程
     * 加final只是为了防止子类重写该方法
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    //需要重写的方法

    /**
     * 冲泡饮料
     */
    public abstract void brew();

    /**
     * 添加配料
     */
    public abstract void addCondiments();
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
