import com.google.gson.Gson;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

public class FoodFrame extends Container {
    public FoodFrame(){
        JFrame mainFrame = new JFrame("Food Facts");
        mainFrame.setLayout(new GridLayout(3,1));

        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl("https://api.nal.usda.gov//")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        FoodService service = retrofit.create(FoodService.class);

        try{
            URL url = new URL("https://api.nal.usda.gov/fdc/v1/food/534357?api_key=vdxDlEMpybArya3fOg6Ba26WUMgwRJW3jsKds1JV");
            URLConnection connection =url.openConnection();
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader((inputStream)));
            Gson gson = new Gson();
            FoodCollection  foodCollection = gson.fromJson(reader, FoodCollection.class);
            JLabel nameOfFood = new JLabel();
            nameOfFood.setText(foodCollection.getDescription());
            mainFrame.add(nameOfFood);
            JLabel ingredients = new JLabel();
            ingredients.setText(foodCollection.getIngredients());
            mainFrame.add(ingredients);
            JLabel nutrientsFrame = new JLabel();
            nutrientsFrame.setLayout(new GridLayout(foodCollection.getFoodNutrients().size()+2,1));
            for (int i = 0; i <foodCollection.getFoodNutrients().size(); i++) {
                String name = foodCollection.getFoodNutrients().get(i).getNutrient().getName();
                Double amount = foodCollection.getFoodNutrients().get(i).getAmount();
                JLabel nutrientLabel = new JLabel();
                nutrientLabel.setText(name +": " +amount);
                nutrientsFrame.add(nutrientLabel);
            }
            mainFrame.add(nutrientsFrame);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainFrame.setSize(1400, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

//
//        Disposable disposable = Observable.interval(0,30, TimeUnit.SECONDS)
//                .flatMap((Long) -> service.getFoodInfo())
//                .subscribeOn(Schedulers.io())
//                .observeOn(Schedulers.newThread())
//                .subscribe(
//                        foodCollection -> {
//                            String ingredients = foodCollection.getIngredients();
//                            label.setText(ingredients);
//                           // i++;
//                        }
//                        ,
//                        Throwable::printStackTrace
//                );


//        Thread thread = new Thread(){
//            public void run(){
//                try{
//                    URL url = new URL("https://api.nal.usda.gov/fdc/v1/food/534358?api_key=vdxDlEMpybArya3fOg6Ba26WUMgwRJW3jsKds1JV");
//                    URLConnection connection =url.openConnection();
//                    InputStream inputStream = connection.getInputStream();
//                    BufferedReader reader = new BufferedReader(new InputStreamReader((inputStream)));
//                    Gson gson = new Gson();
//                    FoodCollection  foodCollection = gson.fromJson(reader, FoodCollection.class);
//                    label.setText(foodCollection.getIngredients());
//                } catch (MalformedURLException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        thread.start();
    }

}
