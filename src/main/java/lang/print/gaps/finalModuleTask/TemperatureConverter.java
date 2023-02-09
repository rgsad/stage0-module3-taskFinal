package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahrenheit = (9 / 5f) * temperatureCelsius + 32;
        System.out.println(fahrenheit);
    }
}
