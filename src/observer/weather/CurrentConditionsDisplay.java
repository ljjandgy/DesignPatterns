package observer.weather;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("当前环境温度为："+temperature+"度,湿度为"+humidity+"%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temp;
        display();
    }

    @Override
    public void cancelRegister() {
        weatherData.removeObserver(this);
    }
}
