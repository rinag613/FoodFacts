package fromIDs;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodCollection {

    @Expose
    private String availableDate;
    @Expose
    private String brandOwner;
    @Expose
    private String brandedFoodCategory;
    @Expose
    private String dataSource;
    @Expose
    private String dataType;
    @Expose
    private String description;
    @Expose
    private String discontinuedDate;
    @Expose
    private Double fdcId;
    @Expose
    private List<Object> foodAttributes;
    @Expose
    private String foodClass;
    @Expose
    private List<Object> foodComponents;
    @Expose
    private List<FoodNutrient> foodNutrients;
    @Expose
    private List<Object> foodPortions;
    @Expose
    private List<FoodUpdateLog> foodUpdateLog;
    @Expose
    private String gtinUpc;
    @Expose
    private String householdServingFullText;
    @Expose
    private String ingredients;
    @Expose
    private LabelNutrients labelNutrients;
    @Expose
    private String marketCountry;
    @Expose
    private String modifiedDate;
    @Expose
    private String publicationDate;
    @Expose
    private Double servingSize;
    @Expose
    private String servingSizeUnit;

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    public String getBrandOwner() {
        return brandOwner;
    }

    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    public String getBrandedFoodCategory() {
        return brandedFoodCategory;
    }

    public void setBrandedFoodCategory(String brandedFoodCategory) {
        this.brandedFoodCategory = brandedFoodCategory;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscontinuedDate() {
        return discontinuedDate;
    }

    public void setDiscontinuedDate(String discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
    }

    public Double getFdcId() {
        return fdcId;
    }

    public void setFdcId(Double fdcId) {
        this.fdcId = fdcId;
    }

    public List<Object> getFoodAttributes() {
        return foodAttributes;
    }

    public void setFoodAttributes(List<Object> foodAttributes) {
        this.foodAttributes = foodAttributes;
    }

    public String getFoodClass() {
        return foodClass;
    }

    public void setFoodClass(String foodClass) {
        this.foodClass = foodClass;
    }

    public List<Object> getFoodComponents() {
        return foodComponents;
    }

    public void setFoodComponents(List<Object> foodComponents) {
        this.foodComponents = foodComponents;
    }

    public List<FoodNutrient> getFoodNutrients() {
        return foodNutrients;
    }

    public void setFoodNutrients(List<FoodNutrient> foodNutrients) {
        this.foodNutrients = foodNutrients;
    }

    public List<Object> getFoodPortions() {
        return foodPortions;
    }

    public void setFoodPortions(List<Object> foodPortions) {
        this.foodPortions = foodPortions;
    }

    public List<FoodUpdateLog> getFoodUpdateLog() {
        return foodUpdateLog;
    }

    public void setFoodUpdateLog(List<FoodUpdateLog> foodUpdateLog) {
        this.foodUpdateLog = foodUpdateLog;
    }

    public String getGtinUpc() {
        return gtinUpc;
    }

    public void setGtinUpc(String gtinUpc) {
        this.gtinUpc = gtinUpc;
    }

    public String getHouseholdServingFullText() {
        return householdServingFullText;
    }

    public void setHouseholdServingFullText(String householdServingFullText) {
        this.householdServingFullText = householdServingFullText;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public LabelNutrients getLabelNutrients() {
        return labelNutrients;
    }

    public void setLabelNutrients(LabelNutrients labelNutrients) {
        this.labelNutrients = labelNutrients;
    }

    public String getMarketCountry() {
        return marketCountry;
    }

    public void setMarketCountry(String marketCountry) {
        this.marketCountry = marketCountry;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Double getServingSize() {
        return servingSize;
    }

    public void setServingSize(Double servingSize) {
        this.servingSize = servingSize;
    }

    public String getServingSizeUnit() {
        return servingSizeUnit;
    }

    public void setServingSizeUnit(String servingSizeUnit) {
        this.servingSizeUnit = servingSizeUnit;
    }

}
