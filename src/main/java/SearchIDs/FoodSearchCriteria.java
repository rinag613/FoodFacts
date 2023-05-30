
package SearchIDs;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodSearchCriteria {

    @Expose
    private String generalSearchInput;
    @Expose
    private Double numberOfResultsPerPage;
    @Expose
    private Double pageNumber;
    @Expose
    private Double pageSize;
    @Expose
    private String query;
    @Expose
    private Boolean requireAllWords;

    public String getGeneralSearchInput() {
        return generalSearchInput;
    }

    public void setGeneralSearchInput(String generalSearchInput) {
        this.generalSearchInput = generalSearchInput;
    }

    public Double getNumberOfResultsPerPage() {
        return numberOfResultsPerPage;
    }

    public void setNumberOfResultsPerPage(Double numberOfResultsPerPage) {
        this.numberOfResultsPerPage = numberOfResultsPerPage;
    }

    public Double getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Double pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Double getPageSize() {
        return pageSize;
    }

    public void setPageSize(Double pageSize) {
        this.pageSize = pageSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Boolean getRequireAllWords() {
        return requireAllWords;
    }

    public void setRequireAllWords(Boolean requireAllWords) {
        this.requireAllWords = requireAllWords;
    }

}
