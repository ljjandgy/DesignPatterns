import duck.WoodDuck;
import org.junit.Test;

public class DuckTest {
    @Test
    public void test(){
        WoodDuck woodDuck = new WoodDuck();
        woodDuck.fly();
        woodDuck.display();
    }
}
