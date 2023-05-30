
package SearchIDs;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DataType {

    @SerializedName("Branded")
    private Double branded;
    @SerializedName("Foundation")
    private Double foundation;
    @SerializedName("SR Legacy")
    private Double sRLegacy;
    @SerializedName("Survey (FNDDS)")
    private Double surveyFNDDS;

    public Double getBranded() {
        return branded;
    }

    public void setBranded(Double branded) {
        this.branded = branded;
    }

    public Double getFoundation() {
        return foundation;
    }

    public void setFoundation(Double foundation) {
        this.foundation = foundation;
    }

    public Double getSRLegacy() {
        return sRLegacy;
    }

    public void setSRLegacy(Double sRLegacy) {
        this.sRLegacy = sRLegacy;
    }

    public Double getSurveyFNDDS() {
        return surveyFNDDS;
    }

    public void setSurveyFNDDS(Double surveyFNDDS) {
        this.surveyFNDDS = surveyFNDDS;
    }

}
