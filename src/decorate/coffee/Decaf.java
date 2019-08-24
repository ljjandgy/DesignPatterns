package decorate.coffee;

public class Decaf extends Beverage {
    /**
     * 因为需要展示商品名称，所以再生成饮料对象时需要制定这个饮料是什么，也就是需要给描述赋值
     */
    public Decaf(){
        this.description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
