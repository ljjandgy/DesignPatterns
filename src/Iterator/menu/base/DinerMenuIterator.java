package Iterator.menu.base;

/**
 * 遍历午餐菜单的迭代器,用于让业务代码遍历自身使用
 * 其封装了遍历动作，让存在差异的遍历行为在业务类中可以统一
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
