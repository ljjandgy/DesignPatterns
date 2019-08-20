package decorate;

/**
 * 装饰器对象的公共父类，用于设置装饰器的公共方法
 */
public abstract class Decorator implements Component{
    @Override
    public void methodA() {
        //书写公共代码
    }
    //需要子类去实现的方法B
    public abstract void methodB();
}
