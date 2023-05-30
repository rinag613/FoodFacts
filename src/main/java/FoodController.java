import SearchIDs.SearchCollection;
import fromIDs.FoodCollection;
import fromIDs.FoodNutrient;
import hu.akarnokd.rxjava3.swing.SwingSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.*;
import java.util.ArrayList;

public class FoodController {
    public FoodService service;
    public FoodService searchService;
    private final JLabel nameOfFood;
    private final JLabel ingredients;
    private final JLabel nutrients;
    private final JLabel totals;
    private final JLabel idsList;
    private  ArrayList<TotalValue> totalValues = new ArrayList<>(0);
    @Inject
    public FoodController(FoodService foodService,
                         @Named("chosenFoodName") JLabel nameOfFood,
                          @Named("ingredientsList") JLabel ingredients,
                          @Named("nutrientsList") JLabel nutrients,
                          @Named("totalsList") JLabel totals,
                          FoodService searchService,
                          @Named("idsList") JLabel idsList){
        this.service=foodService;
        this.nameOfFood = nameOfFood;
        this.ingredients = ingredients;
        this.nutrients = nutrients;
        this.totals = totals;
        this.idsList = idsList;
        this.searchService = searchService;
    }

    public void updateInfo(String id){
        service.getFoodInfo(id)
                .subscribeOn(Schedulers.io())
                .observeOn(SwingSchedulers.edt())
                .subscribe(this::setInfo, Throwable::printStackTrace);
    }
    public void setInfo(FoodCollection foodCollection){
        updateNameOfFood(foodCollection);
        updateIngredients(foodCollection);
        updateNutrients(foodCollection);
        updateTotals();
    }
    public void updateNameOfFood(FoodCollection foodCollection){
        nameOfFood.setText(foodCollection.getDescription());
    }
    public void updateIngredients(FoodCollection foodCollection){
        ingredients.setText(foodCollection.getIngredients());
    }
    public void updateNutrients(FoodCollection foodCollection){
        String list = "";
        for (int i = 0; i < foodCollection.getFoodNutrients().size(); i++) {
            String name = foodCollection.getFoodNutrients().get(i).getNutrient().getName();
            Double amount = foodCollection.getFoodNutrients().get(i).getAmount();
            boolean found = false;
            for (int j = 0;  j< totalValues.size(); j++) {
                if(totalValues.get(j).getName().equals(name)) {
                    totalValues.get(j).addToAmount(amount);
                    found = true;
//                }else{
//                    TotalValue totalValue = new TotalValue(name, amount);
//                    totalValues.add(totalValue);
//                    System.out.println(1);
                }
            }
            if(!found){
                TotalValue totalValue = new TotalValue(name, amount);
                totalValues.add(totalValue);
            }
            list=list+name + ": " + amount+", ";
        }
        nutrients.setText(list);
        System.out.println(totalValues.size());
    }
    public void updateTotals(){
        String totalsList="";
        for (int i = 0; i < totalValues.size(); i++) {
            totalsList=totalsList+totalValues.get(i).getName() +": " +totalValues.get(i).getAmount() +" ,";
        }
        totals.setText(totalsList);
    }
    public void updateSearchInfo(String word){
        searchService.getSearchInfo(word)
                .subscribeOn(Schedulers.io())
                .observeOn(SwingSchedulers.edt())
                .subscribe(this::getSearchInfo, Throwable::printStackTrace);
    }
    public void getSearchInfo(SearchCollection collection) {
        String totalSearched="";
        String foodName ="";
        String brandName = "";
        String brandOwner = "";
        Double ids=0.0;
        for (int i = 0; i < collection.getFoods().size(); i++) {
             foodName = collection.getFoods().get(i).getDescription();
             brandName = collection.getFoods().get(i).getBrandName();
             brandOwner = collection.getFoods().get(i).getBrandOwner();
             ids = collection.getFoods().get(i).getFdcId();
             totalSearched = totalSearched+foodName+brandName+brandOwner+ids;
        }
        idsList.setText(totalSearched);
    }
}
