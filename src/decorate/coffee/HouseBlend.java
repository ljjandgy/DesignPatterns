package decorate.coffee;

/**
 * 综合coffee
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        this.description = "HouseBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
