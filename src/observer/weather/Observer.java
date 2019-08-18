package observer.weather;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 根据气象值直接更新观察者（本例中观察者为展示的面板）的值
     * 参数分别为温度，湿度和气压
     */
    void update(float temp,float humidity,float pressure);

    /**
     * 取消注册
     */
    void cancelRegister();
}
