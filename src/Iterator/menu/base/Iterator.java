package Iterator.menu.base;

/**
 * 迭代器接口，用于定义遍历对象的方式
 */
public interface Iterator {
    /**
     * 用于获取是否还有下个对象
     * @return 是否还有下个对象
     */
    boolean hasNext();

    /**
     * 获取下一个对象
     * @return 下一个对象
     */
    Object next();

}
