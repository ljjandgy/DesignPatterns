package observer.weather;

import lombok.Data;

import java.util.ArrayList;

/**
 * 观察者模式模式中的生产者（被订阅的对象，也叫出版者），该对象一旦发生变化，就会让消费者（观察者）产生适应性变化
 */
@Data
public class WeatherData implements Subject{
    //当前主题的观察者集合
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        //注册观察者
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //观察者取消注册
        int index = observers.indexOf(observer);
        if (index>0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        //通知所有的观察者
        observers.forEach(observer -> observer.update(temperature,humidity,pressure));
    }

    /**
     * 模拟气象站采集数据的动作
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }
}
