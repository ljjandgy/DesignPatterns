package duck;

/**
 * @ClassName ModuleDuck
 * @Description 模型鸭子
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-08-13 19:27:19
 */
public class ModuleDuck extends Duck{
    public ModuleDuck(){
        this.setFlyBehavior(new FlyNoway());
    }

    @Override
    public void display() {
        System.out.println("我是一只酷酷的模型鸭子");
    }
}
