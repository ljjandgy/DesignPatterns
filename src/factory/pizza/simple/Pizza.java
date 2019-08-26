package factory.pizza.simple;

/**
 * 披萨抽象类，是所有披萨类型的公共基类
 */
public abstract class Pizza {
    /**
     * 披萨准备
     */
    public abstract void prepare();

    /**
     * 披萨烘焙
     */
    public abstract void bake();

    /**
     * 切分披萨
     */
    public abstract void cut();

    /**
     * 披萨装盘
     */
    public abstract void box();

}
