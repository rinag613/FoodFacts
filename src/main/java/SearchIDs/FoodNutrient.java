
package SearchIDs;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodNutrient {

    @Expose
    private String derivationCode;
    @Expose
    private String derivationDescription;
    @Expose
    private Double derivationId;
    @Expose
    private Double foodNutrientId;
    @Expose
    private String foodNutrientSourceCode;
    @Expose
    private String foodNutrientSourceDescription;
    @Expose
    private Double foodNutrientSourceId;
    @Expose
    private Double indentLevel;
    @Expose
    private Double nutrientId;
    @Expose
    private String nutrientName;
    @Expose
    private String nutrientNumber;
    @Expose
    private Double rank;
    @Expose
    private String unitName;
    @Expose
    private Double value;

    public String getDerivationCode() {
        return derivationCode;
    }

    public void setDerivationCode(String derivationCode) {
        this.derivationCode = derivationCode;
    }

    public String getDerivationDescription() {
        return derivationDescription;
    }

    public void setDerivationDescription(String derivationDescription) {
        this.derivationDescription = derivationDescription;
    }

    public Double getDerivationId() {
        return derivationId;
    }

    public void setDerivationId(Double derivationId) {
        this.derivationId = derivationId;
    }

    public Double getFoodNutrientId() {
        return foodNutrientId;
    }

    public void setFoodNutrientId(Double foodNutrientId) {
        this.foodNutrientId = foodNutrientId;
    }

    public String getFoodNutrientSourceCode() {
        return foodNutrientSourceCode;
    }

    public void setFoodNutrientSourceCode(String foodNutrientSourceCode) {
        this.foodNutrientSourceCode = foodNutrientSourceCode;
    }

    public String getFoodNutrientSourceDescription() {
        return foodNutrientSourceDescription;
    }

    public void setFoodNutrientSourceDescription(String foodNutrientSourceDescription) {
        this.foodNutrientSourceDescription = foodNutrientSourceDescription;
    }

    public Double getFoodNutrientSourceId() {
        return foodNutrientSourceId;
    }

    public void setFoodNutrientSourceId(Double foodNutrientSourceId) {
        this.foodNutrientSourceId = foodNutrientSourceId;
    }

    public Double getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(Double indentLevel) {
        this.indentLevel = indentLevel;
    }

    public Double getNutrientId() {
        return nutrientId;
    }

    public void setNutrientId(Double nutrientId) {
        this.nutrientId = nutrientId;
    }

    public String getNutrientName() {
        return nutrientName;
    }

    public void setNutrientName(String nutrientName) {
        this.nutrientName = nutrientName;
    }

    public String getNutrientNumber() {
        return nutrientNumber;
    }

    public void setNutrientNumber(String nutrientNumber) {
        this.nutrientNumber = nutrientNumber;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
