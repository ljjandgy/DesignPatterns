package observer.common;

/**
 * 某个具体的主题，其会实现抽象主题的各种方法
 */
public class ConcreteSubject implements Subject{
    private String state;
    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
