import decorate.coffee.*;
import org.junit.Test;


public class coffeeTest {
    @Test
    public void milkHouseBlendTest(){
        Beverage milkHouse = new Milk(new HouseBlend());
        System.out.println(milkHouse.cost());
    }
    @Test
    public void practiceInBookTest(){
        Beverage cost = new Mocha(
                new Mocha(
                        new Soy
                                (new Whip(
                                        new HouseBlend()))));
        System.out.println("coffee name is:"+cost.getDescription()+"cost is :"+cost.cost());
    }
}
