
package SearchIDs;

import java.util.List;
import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SearchCollection {

    @Expose
    private Aggregations aggregations;
    @Expose
    private Double currentPage;
    @Expose
    private FoodSearchCriteria foodSearchCriteria;
    @Expose
    private List<Food> foods;
    @Expose
    private List<Long> pageList;
    @Expose
    private Double totalHits;
    @Expose
    private Double totalPages;

    public Aggregations getAggregations() {
        return aggregations;
    }

    public void setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
    }

    public Double getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Double currentPage) {
        this.currentPage = currentPage;
    }

    public FoodSearchCriteria getFoodSearchCriteria() {
        return foodSearchCriteria;
    }

    public void setFoodSearchCriteria(FoodSearchCriteria foodSearchCriteria) {
        this.foodSearchCriteria = foodSearchCriteria;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Long> getPageList() {
        return pageList;
    }

    public void setPageList(List<Long> pageList) {
        this.pageList = pageList;
    }

    public Double getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Double totalHits) {
        this.totalHits = totalHits;
    }

    public Double getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Double totalPages) {
        this.totalPages = totalPages;
    }

}
