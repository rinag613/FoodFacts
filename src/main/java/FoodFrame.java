import com.google.gson.Gson;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Map.entry;


public class FoodFrame extends JFrame{
    private final JTextField getId;
    private final JTextField getSearched;

    @Inject
    public FoodFrame(FoodController controller,
                     @Named("chosenFoodName") JLabel nameOfFood,
                     @Named("ingredientsList") JLabel ingredients,
                     @Named("nutrientsList") JLabel nutrients,
                     @Named("totalsList") JLabel totals,
                     @Named("idsList") JLabel idsList) {

        setSize(1400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel mainPanel = new JPanel();
       // mainPanel.setLayout(new GridLayout(1,2));

        getId = new JTextField("534358");
        mainPanel.add(getId);

        JButton select = new JButton("Select");
        select.addActionListener(e -> controller.updateInfo(getId.getText()));
        mainPanel.add(select);
        mainPanel.add(nameOfFood);
        mainPanel.add(ingredients);
        mainPanel.add(nutrients);
        mainPanel.add(totals);

        JPanel searchPanel = new JPanel();
        getSearched = new JTextField("Cheddar Cheese");
        JButton selectSearched = new JButton("Select");
        selectSearched.addActionListener(e -> controller.updateSearchInfo(getSearched.getText()));
        searchPanel.add(getSearched);
        searchPanel.add(selectSearched);
        searchPanel.add(idsList);
        mainPanel.add(searchPanel);


//        JLabel totalFrame = new JLabel();
//        for (int i = 0; i < totalValues.size(); i++) {
//            JButton value = new JButton();
//            value.setText(totalValues.get(i).getName()+": " +totalValues.get(i).getAmount());
//            totalFrame.add(value);
//        }
//        totalsFrame.add(nutrientsFrame);
//        totalsFrame.add(totalFrame);

//        mainFrame.add(mainPanel);
//        mainFrame.add(totalsFrame);
       // totalsFrame.add(getTotalsFrame());

        setContentPane(mainPanel);

    }


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
//                    fromIDs.FoodCollection  foodCollection = gson.fromJson(reader, fromIDs.FoodCollection.class);
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
