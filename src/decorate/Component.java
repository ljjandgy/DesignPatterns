package decorate;

/**
 * 所有装饰器相关对象（含装饰器对象和被装饰的对象）的公共超类，超类的方法就是被装饰对象最后需要暴露的方法
 */
public interface Component {
    //所有对象的公用方法
    void methodA();
}
