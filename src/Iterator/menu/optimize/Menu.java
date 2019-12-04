package Iterator.menu.optimize;

import java.util.Iterator;

/**
 * 菜单接口，定义了菜单类（业务对象类）的行为
 */
public interface Menu {
    /**
     * 创建迭代器，用于遍历业务对象中的集合
     * @return 迭代器对象
     */
    Iterator<MenuItem> createIterator();
}
