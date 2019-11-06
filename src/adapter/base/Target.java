package adapter.base;

/**
 * 目标接口，也就是适配器需要让被适配对象转换成的类型
 */
public interface Target {
    /**
     * 请求方法
     */
    void request();

}
