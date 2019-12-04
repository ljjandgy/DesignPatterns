package Iterator.menu.optimize;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private MenuItem[] menuItems;
    private int index;
    private int maxNum;

    public DinerMenu(int maxNum){
        this.maxNum = maxNum;
        menuItems = new MenuItem[maxNum];
    }
    @Override
    public Iterator<MenuItem> createIterator() {
        return null;
    }
    public void addMenuItem(MenuItem menuItem){
        if (menuItems.length == maxNum){
            System.out.println("can not add item any more");
        }else{
            menuItems[index] = menuItem;
            ++index;
        }
    }
}
