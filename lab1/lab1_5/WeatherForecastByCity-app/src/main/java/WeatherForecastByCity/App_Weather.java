package WeatherForecastByCity;

import java.util.*;
import IpmaApiClient.*;

/**
 * Hello world!
 *
 */
public class App_Weather 
{
    public static void main(String[] args) {
        List<CityForecast> api = App.getAllData(args[0]);
        for (int i = 0; i < api.size(); i++) {
            System.out.println(api.get(i));
        }
    }
}
    