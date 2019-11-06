package adapter.base;

/**
 * 适配器，相当于是客户的代理人（这一点很像命令模式的Invoker），但是实际进行的操作却像命令模式中的command对象（调用实际的方法）
 */
public class Adapter implements Target {
    //持有被适配对象（被迫营业的对象）的抽象
    private IAdaptee adaptee;
    public Adapter(IAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //实际上调用的是被适配者的方法（类似于客户给公司提需求，公司让你实现，你就是被适配对象）
        adaptee.request();
    }
}
