package decorate.coffee;

/**
 * 装饰器抽象类
 */
public abstract class CondimentDecorator extends Beverage{
    @Override
    public abstract String getDescription();
}
