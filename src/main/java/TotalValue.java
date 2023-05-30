public class TotalValue {
    String name = "";
     Double  amount=0.0;
    public TotalValue(String name, Double newAmount){
        this.name = name;
        amount = amount+newAmount;
    }
    public String getName() {
        return name;
    }
    public Double getAmount(){
        return amount;
    }
    public void addToAmount(Double newAmount){
        amount = amount+newAmount;
    }
}
