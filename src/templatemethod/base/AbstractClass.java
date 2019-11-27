package templatemethod.base;

/**
 * 模板方法模式中的抽象类，用于定义模板方法（标准化流程）以及定义什么样的行为可以被子类改变
 */
public abstract class AbstractClass {
    //模板方法，用于规定算法流程
    public final void templateMethod(){
        primitiveOperation1();
        primitiveOpearation2();
        concreteOperation();
    }
    //原始的方法1，也就是需要子类去实现的方法
    abstract void primitiveOperation1();
    //原始的方法2
    abstract void primitiveOpearation2();
    //具体的方法，也就是不允许子类修改的操作（子类都一样的操作）
    void concreteOperation(){
        //do something
    }
}
