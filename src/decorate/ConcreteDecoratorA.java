package decorate;

public class ConcreteDecoratorA extends Decorator {
    //需要一个成员变量来记录被包含的被装饰对象
    Component wrappedObj;
    @Override
    public void methodA(){
        super.methodA();
        //do something--对原方法的拓展
    }
    @Override
    public void methodB() {
        //do something
    }
    public void newBehavior(){
        //new behavior
    }
}
