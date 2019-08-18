package observer.java;

import observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    //被观察者对象
    private Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        //把自己注册为观察者
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            //主动去拉取被观察者的内容
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前温度为:"+temperature+"湿度为："+humidity+"%");
    }
}
