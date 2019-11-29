package templatenethod.sort;

import org.junit.Test;
import templatemethod.sort.Duck;

import java.util.Arrays;

/**
 * 鸭子排序测试类
 */
public class DuckSortTest {
    @Test
    public void test(){
        Duck[] ducks = {new Duck("duck1",1),
                new Duck("duck2",2),
                new Duck("duck5",5),
                new Duck("duck4",4)};
        System.out.println(" before sorting ：");
        display(ducks);
        /**
         * 针对sort方法，compareTo方法返回值为1时才会交换顺序
         * 现在sort方法针对Array和list实现方法是不一样的，数组的话是调用数组中对象的compareTo方法进行比较
         * 针对非数组则不是
         */
        Arrays.sort(ducks);

        System.out.println(" after sorting ：");
        display(ducks);

    }

    private void display(Duck[] ducks){
        for (Duck duck:ducks){
            System.out.println(duck);
        }
    }
}
