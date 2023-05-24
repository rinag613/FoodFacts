import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodNutrient {

    @Expose
    private Double amount;
    @Expose
    private FoodNutrientDerivation foodNutrientDerivation;
    @Expose
    private Double id;
    @Expose
    private Nutrient nutrient;
    @Expose
    private String type;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FoodNutrientDerivation getFoodNutrientDerivation() {
        return foodNutrientDerivation;
    }

    public void setFoodNutrientDerivation(FoodNutrientDerivation foodNutrientDerivation) {
        this.foodNutrientDerivation = foodNutrientDerivation;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
