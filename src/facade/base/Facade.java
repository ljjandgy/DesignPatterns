package facade.base;

/**
 * 外观类（可以是接口，然后由实现类进行子系统整合操作）用于对子系统也就是复杂的接口/类集合进行整合，从而提供一系列简单接口供客户使用
 * 简单接口通常为大量类的某些行为的整合，这样能让客户通过外观类来快速的实现某个功能
 * 这样做还能实现子系统和客户之间的解耦，从而使得程序设计人员能方便的对子系统进行升级（修改）
 */
public class Facade {
    //外观类由两部分组成，第一部分肯定就是子系统的类/接口
    private ChildSystem1 childSystem1;
    private ChildSystem2 childSystem2;
    private ChildSystem3 childSystem3;
    private ChildSystem4 childSystem4;

    //第二部分为提供给客户的整合行为
    public void doSomething13(){
        childSystem1.doSomething();
        childSystem3.doSomething();
    }
    public void doSomething24(){
        childSystem2.doSomething();
        childSystem4.doSomething();
    }
    //使用上述方法，客户就不用知道子系统具体实现了，只需要知道外观类的方法的作用即可，而且只用整合外观类就能实现想要的行为了

}
