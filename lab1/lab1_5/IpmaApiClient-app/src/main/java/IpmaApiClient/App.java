package IpmaApiClient;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.*;

public class App
{
    public static List<CityForecast> getAllData(String local) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);

        Call<IpmaDistricts> alldistricts = service.getAll();

        try {
            Response<IpmaDistricts> api = alldistricts.execute();
            IpmaDistricts districts = api.body();
            List<Districts> dis = districts.getData();
            int idlocal = 0;
            for (Districts d: dis) {
                if (d.getLocal().equalsIgnoreCase(local)) {
                    idlocal = d.getGlobalIdLocal();
                }
            }
            Call<IpmaCityForecast> callSync = service.getForecastForACity(idlocal);

            try {
                Response<IpmaCityForecast> apiResponse = callSync.execute();
                IpmaCityForecast forecast = apiResponse.body();

                return forecast.getData();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
    