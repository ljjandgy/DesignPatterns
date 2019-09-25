package singleton.base;

/**
 * 基础单例类,只是单纯的保证对象只会存在一个，并且是在使用时才创建
 */
public class Singleton {
    //使用静态变量记录对象,为了防止其被JVM回收。静态变量的生命周期和class一致，如果不是静态的则和对象一致。
    private static Singleton uniqueInstance;
    //私有化构造器，防止对象被多次创建
    private Singleton(){};

    /**
     * 获取单例对象
     * @return 单例对象---全局唯一的对象
     */
    public static Singleton getInstance(){
        if (uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
