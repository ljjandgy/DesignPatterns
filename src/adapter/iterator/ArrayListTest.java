package adapter.iterator;

import org.junit.Test;

import java.util.Enumeration;

/**
 * 利用ArrayList只支持迭代器（Iterator）的特性，测试适配器
 */
public class ArrayListTest {
    @Test
    public void test(){
        EnumerationIterator enumerationIterator = new EnumerationIterator(new Enumeration() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public Object nextElement() {
                return null;
            }
        });
        while(enumerationIterator.hasNext()){

        }
    }

}
