import observer.weather.CurrentConditionsDisplay;
import observer.weather.Subject;
import observer.weather.WeatherData;
import org.junit.Test;

public class WeatherTest {
    @Test
    public void test(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
        currentConditionsDisplay.display();
    }

}
