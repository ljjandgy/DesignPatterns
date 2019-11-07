package adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 枚举器的适配器，用于去伪装迭代器（目标接口）
 */
public class EnumerationIterator implements Iterator {
    /**
     * 持有枚举器对象，让其去伪装迭代器（为了和新代码统一格式，但是老代码只提供了迭代器方法）
     */
    private Enumeration enumeration;
    public EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
