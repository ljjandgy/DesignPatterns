import duck.FlyRocketPower;
import duck.ModuleDuck;
import duck.WoodDuck;
import org.junit.Test;

public class DuckTest {
    @Test
    public void woodDuckTest(){
        WoodDuck woodDuck = new WoodDuck();
        woodDuck.fly();
        woodDuck.display();
    }
    @Test
    public void moduleDuckTest(){
        ModuleDuck moduleDuck = new ModuleDuck();
        //默认动作
        moduleDuck.fly();
        //动态修改动作
        moduleDuck.setFlyBehavior(new FlyRocketPower());
        //新的飞行动作
        moduleDuck.fly();
    }
}
