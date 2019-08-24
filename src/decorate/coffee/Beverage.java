package decorate.coffee;

/**
 * 饮料最基本的抽象类，是装饰对象和被装饰对象公共的抽象类
 */
public abstract class Beverage {
    String description = "unknown beverage";
    /**
     * 获取描述
     * @return 描述
     */
    public String getDescription(){
        return description;
    }

    /**
     * 计算咖啡价格
     * @return 价格
     */
    public abstract double cost();

}
