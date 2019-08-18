package observer.java;

import lombok.Data;

import java.util.Observable;

/**
 * 本例不仅会采用jdk自带的观察者模式，还会让观察者自己去拉数据
 */
@Data
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    private void measurementChanged(){
        //在使用jdk提供的观察者模式时，如果想要把通知发到订阅者处的话就需要先调用setChanged方法，再使用通知方法
        setChanged();
        //通知观察者已经发生改变
        notifyObservers();
    }

    /**
     * 模仿被观察者内容被改变的操作
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //自身改变完成后通知观察者
        measurementChanged();
    }

}
