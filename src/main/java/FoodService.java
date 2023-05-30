import SearchIDs.SearchCollection;
import fromIDs.FoodCollection;
import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FoodService {
    @GET("fdc/v1/food/{id}?api_key=vdxDlEMpybArya3fOg6Ba26WUMgwRJW3jsKds1JV")
    Observable<FoodCollection> getFoodInfo(@Path("id") String id);
    //534358
    @GET("fdc/v1/foods/search?api_key=vdxDlEMpybArya3fOg6Ba26WUMgwRJW3jsKds1JV&?")
    Observable<SearchCollection> getSearchInfo(@Query("query") String query);

    

}
