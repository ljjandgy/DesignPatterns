package singleton.optimization;

/**
 * 利用类的静态初始化器创建实例，这样一来只要类被加载进JVM，实例就会被创建，这样就不用担心有线程安全问题了
 * 在一开始就初始化实例的单例模式又被称为饿汉式单例模式
 * 缺点在于无论是否使用单例对象，对象都会被创建
 */
public class StaticSingleton {
    //静态变量是使用静态初始化器创建对象的
    private static StaticSingleton singleton = new StaticSingleton();

    private StaticSingleton(){};

    public static StaticSingleton getInstance(){
        //因为对象已经被初始化过了，所以直接获取即可
        return singleton;
    }
}
