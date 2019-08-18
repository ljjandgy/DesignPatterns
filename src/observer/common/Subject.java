package observer.common;

/**
 * 包下所有类代表的是观察者模式的通用写法
 * 主题接口，也就是被订阅对象的接口，用于直接和被订阅对象进行关联，其能对于很多实际的对象
 */
public interface Subject {
    /**
     * 用于注册观察者
     */
    void registerObserver();

    /**
     * 用户删除观察者
     */
    void removeObserver();

    /**
     * 自身发生更新时调用此方法去通知所有观察者发生改变
     */
    void notifyObserver();
}
