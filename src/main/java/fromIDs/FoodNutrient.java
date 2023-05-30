package fromIDs;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodNutrient {

    private Double id;
    private Double amount;
    private Double dataPoints;
    private Double min;
    private Double max;
    private Double median;
    private String type;
    private Nutrient nutrient;
    private FoodNutrientDerivation foodNutrientDerivation;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(Double dataPoints) {
        this.dataPoints = dataPoints;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMedian() {
        return median;
    }

    public void setMedian(Double median) {
        this.median = median;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public FoodNutrientDerivation getFoodNutrientDerivation() {
        return foodNutrientDerivation;
    }

    public void setFoodNutrientDerivation(FoodNutrientDerivation foodNutrientDerivation) {
        this.foodNutrientDerivation = foodNutrientDerivation;
    }




}
