import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.*;
@Module
public class FoodServiceModule {
    @Provides
    public FoodService providesFoodService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nal.usda.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        FoodService foodService = retrofit.create(FoodService.class);
        return foodService;
    }


    @Provides
    @Named("chosenFoodName")
    @Singleton
    public JLabel providesChosenFoodName() {
        return new JLabel();
    }
    @Provides
    @Named("ingredientsList")
    @Singleton
    public JLabel providesIngredientsList() {
        return new JLabel();
    }
    @Provides
    @Named("nutrientsList")
    @Singleton
    public JLabel providesNutrientsList() {
        return new JLabel();
    }
    @Provides
    @Named("totalsList")
    @Singleton
    public JLabel providesTotalsList() {
        return new JLabel();
    }

    @Provides
    @Named("idsList")
    @Singleton
    public JLabel providesIdsList(){
        return new JLabel();
    }

}
