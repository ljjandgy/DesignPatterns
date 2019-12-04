package Iterator.menu.optimize;

/**
 * 午餐迭代器，因为数组没有java提供的迭代器，所以需要我们自己去实现迭代器
 */
public class DinerMenuIterator implements Iterator{
    private MenuItem[] menuItems;
    //序号
    private int index = 0;
    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public void removeNext() {
        if (menuItems[index - 1] !=null&&index>0){
            for (int i=index-1;i<menuItems.length;++i){
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
        menuItems[index] = null;
    }

    @Override
    public boolean hasNext() {
        return index<(menuItems.length-1);
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[index];
        ++index;
        return menuItem;
    }
}
