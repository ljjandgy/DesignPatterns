package singleton.optimization;

/**
 * 利用synchronize关键字实现同步的单例模式。
 * 牺牲性能以保证线程安全,如果程序对性能没有特殊要求，那么这种书写格式就可以满足需求单例的所有场景了
 * 其中延迟实例化单例的这种操作也被成为懒汉式单例模式
 */
public class SynchronizeSingleton {
    public static SynchronizeSingleton singleton;

    private SynchronizeSingleton(){};

    public static synchronized SynchronizeSingleton getInstance(){
        //没有初始化才初始化
        if (null == singleton){
            singleton = new SynchronizeSingleton();
        }
        return singleton;
    }
}
