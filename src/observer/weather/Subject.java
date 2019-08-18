package observer.weather;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer 观察者对象
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 把自己的变化通知所有的观察者
     */
    void notifyObservers();

}
