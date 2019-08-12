package duck;

/**
 * duck的超类，包含公共行为及属性，子类继承后可直接使用
 */
public abstract class Duck {
    private String sex;

    private double weight;

    private IFlyBehavior flyBehavior;

    /**
     * 因为外貌可能大家都不一样，所以需要子类去表达自己的外貌。对于子类必须重写的方法就用抽象方法去定义
     */
    public abstract void display();

    /**
     * 所以鸭子都会在水上漂，无论是不是活的。对于所有子类实现一致的方法，就直接在父类实现即可，子类可以直接去用
     */
    public void swim(){
        System.out.println("所有鸭子都能在水上漂");
    }
    //利用多态去实现非公共行为
    public void fly(){
        flyBehavior.fly();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
