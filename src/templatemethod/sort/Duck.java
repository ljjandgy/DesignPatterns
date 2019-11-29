package templatemethod.sort;

/**
 * 新增鸭子类，在模板方法模式中充当concreteClass角色，用于实现compareTo方法。
 * compareTo方法为sort流程（模板方法中的一个步骤），我们重写compareTo方法就能实现sort行为的改变
 */
public class Duck implements Comparable {
    private String name;
    private int weight;
    public Duck(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name+" weights "+weight;
    }

    /**
     * 根据鸭子重量进行排序
     * @param object 需要比较的另外一只鸭子（当前鸭子的后一只鸭子）
     * @return 比较的结果
     */
    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;
        //小于返回-1
        if (this.weight<otherDuck.weight){
            return -1;
        }else if (this.weight == otherDuck.weight){
            return 0;
        }else{
            //大于返回1
            return 1;
        }
    }
}
