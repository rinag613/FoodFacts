import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface FoodService {
    @GET("/fdc/v1/food/534358?api_key=vdxDlEMpybArya3fOg6Ba26WUMgwRJ")
    Observable<FoodCollection> getFoodInfo();

}
