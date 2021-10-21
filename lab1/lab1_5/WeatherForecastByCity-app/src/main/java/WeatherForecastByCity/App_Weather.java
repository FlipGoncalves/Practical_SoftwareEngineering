package WeatherForecastByCity;

import IpmaApiClient.App;
import IpmaApiClient.CityForecast;

public class App_Weather 
{
    public static void main(String[] args) {
        CityForecast api = App.getAllData(args[0]);
        System.out.println("Max temp for today:" + api.getTMax());
    }
}