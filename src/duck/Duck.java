package duck;

/**
 * duck的超类，包含公共行为及属性，子类继承后可直接使用
 */
public class Duck {
    private String sex;

    private double weight;

    private IFlyBehavior flyBehavior;

    public void display(){
        System.out.println("鸭子展示自己的外貌");
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
