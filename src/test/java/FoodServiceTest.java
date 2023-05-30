import fromIDs.FoodCollection;
import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FoodServiceTest {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build();
    FoodService service = retrofit.create(FoodService.class);

    @Test
    public void getFoodInfo() {

        Observable<FoodCollection> collection = service.getFoodInfo("534358");
        assertNotNull(collection);
    }
}
