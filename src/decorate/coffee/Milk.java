package decorate.coffee;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    /**
     * 装饰对象在实例化时需要把被装饰对象注入进来才行
     * 在本例中饮料（coffee）就是被装饰对象，所以装饰对象在实例化时需要注入饮料的统一抽象类）
     */
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+.10;
    }
}
