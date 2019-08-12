package duck;

/**
 * 因为不是所有的鸭子（比如橡皮鸭子）都有飞这个动作，所以飞行是一个变化的行为，根据开闭原则，需要单独封装
 */
public interface IFlyBehavior {
    void fly();
}
