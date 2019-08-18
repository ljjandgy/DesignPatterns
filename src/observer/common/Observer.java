package observer.common;

/**
 * 观察者的接口，用于和主题接口进行直接关联
 */
public interface Observer {
    /**
     * 更新接口，当主题发生变化时会自动触发该方法对观察者进行更新
     */
    void update();
}
