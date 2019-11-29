package templatemethod.hook;

/**
 * 模板方法模式中的抽象类，用于定义模板方法（标准化流程）以及定义什么样的行为可以被子类改变
 */
public abstract class AbstractClass {
    //模板方法，用于规定算法流程,子类无法继承
    public final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }
    //原始的方法1，也就是需要子类去实现的方法
    abstract void primitiveOperation1();
    //原始的方法2
    abstract void primitiveOperation2();
    //具体的方法，也就是不允许子类修改的操作（子类都一样的操作）,加上final就是为了不让子类重写该方法
    final void concreteOperation(){
        //do something
    }

    /**
     * 钩子方法，也就是允许子类重写的方法，相当于给了子类选择是否自定义行为的权利
     */
    public void hook(){};
}
