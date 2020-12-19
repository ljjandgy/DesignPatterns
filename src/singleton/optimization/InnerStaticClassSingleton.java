package singleton.optimization;

/**
 * 利用静态内部类实现单例模式
 */
public class InnerStaticClassSingleton {
    private static InnerStaticClassSingleton instance;

    private static class SingletonHolder{
        private static final InnerStaticClassSingleton instance = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance(){
        //主动加载静态内部类，实现lazy-load
        return SingletonHolder.instance;
    }
}
