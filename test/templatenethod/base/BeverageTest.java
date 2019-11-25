package templatenethod.base;

import org.junit.Test;
import templatemethod.recipe.complate.CaffeineBeverage;
import templatemethod.recipe.complate.Coffee;
import templatemethod.recipe.complate.Tea;

public class BeverageTest {
    @Test
    public void prepareTest(){
        CaffeineBeverage tea = new Tea();
        //准备茶
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        //准备coffee
        coffee.prepareRecipe();
    }
}
