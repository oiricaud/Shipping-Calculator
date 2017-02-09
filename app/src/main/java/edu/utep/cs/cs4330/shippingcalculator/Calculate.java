package edu.utep.cs.cs4330.shippingcalculator;

class Calculate {
    private Integer oz;
    private Double baseCost;
    private Double addedCost;
    private Double totalShippingCost;


    public Calculate(){
       oz = 0;
       baseCost = 0.0;
       addedCost = 0.0;
       totalShippingCost = 0.0;
    }
    public void addWeight(Integer convertEditable){
        oz = convertEditable;
    }
    public Integer getWeight(){
        return oz;
    }

    public void addBaseCost(int convertEditable) {
        baseCost = convertEditable * .10;
    }

    public String getBaseCost() {
        double calculateTotal = getWeight() * .10;
        return "$" + String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
    }

    public void addaddedCost(int convertEditable) {
        addedCost = convertEditable * .20;
    }

    public String getaddedCost() {
        double calculateTotal = getWeight() * .20;
        return "$" + String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
    }

    public void addtotalShippingCost(int convertEditable) {
        totalShippingCost = convertEditable * 1.0;
    }

    public String gettotalShippingCost() {
        double calculateTotal = baseCost + addedCost + 5.993;
        return "$" + String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
    }
}
