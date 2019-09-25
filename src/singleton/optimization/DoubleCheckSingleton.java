package singleton.optimization;

/**
 * 采用双检方式实现线程安全的单例模式，因为是延迟创建对象的，所以也是懒汉式的单例模式
 * 该单例创建模式适用于java5之后的项目
 */
public class DoubleCheckSingleton {
    //volatile关键字作用是让变量让所有变量所共享，也就是所有变量可见
    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){};

    public static DoubleCheckSingleton getInstance(){
        //单例没有被实例化才进行实例化操作
        if (singleton==null){
            //把同步操作放到了第一次调用该方法的时候了
            synchronized (DoubleCheckSingleton.class){
                //第二次检查，也就是双检名称由来，防止阻塞的线程进入后重复创建实例
                if (null == singleton){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
