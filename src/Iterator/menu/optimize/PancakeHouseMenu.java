package Iterator.menu.optimize;

import java.util.Iterator;
import java.util.List;

/**
 * 煎饼菜单，由ArrayList组成菜单信息
 */
public class PancakeHouseMenu implements Menu{
    private List<MenuItem> menuItems;

    @Override
    public Iterator<MenuItem> createIterator() {
        return null;
    }

    /**
     * 添加菜单项
     * @param menuItem 菜单项
     */
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
}
