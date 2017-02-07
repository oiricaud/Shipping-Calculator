package edu.utep.cs.cs4330.shippingcalculator;


import android.widget.TextView;

class MainModel {
    private int weightOfPackage;
    /**
     * Creates textview placeholders as default, $0.00
     * @param baseCost is the % of order to which you will charge the customer from the total order.
     * @param addedCost is the % or order to which you will charge the customer from the total order.
     * @param totalShippingCost is the % of order to which you will charge the customer from the total order.
     */
    public void setDefault(TextView baseCost, TextView addedCost, TextView totalShippingCost) {
        baseCost.setText("$0.00");
        addedCost.setText("$0.00");
        totalShippingCost.setText("$0.00");
    }

    public int getWeightOfPackage() {
        return weightOfPackage;
    }

    public void setWeightOfPackage(int weightOfPackage) {
        this.weightOfPackage = weightOfPackage;
    }

    /**
     * @param baseCost choose % to which you will charge the customer from the total order.
     */
    public void setBaseCost(TextView baseCost) {
        double baseCostPrice = 0.30; // 30% base cost.
        double calculateTotal = (getWeightOfPackage() - (getWeightOfPackage() * baseCostPrice));
        String formatMe = String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
        baseCost.setText("$" + formatMe);
    }

    /**
     * @param addedCost choose % to which you will charge the customer from the total order.
     */
    public void setAddedCost(TextView addedCost) {
        double baseCostPrice = 0.10; // 10% added cost.
        double calculateTotal = (getWeightOfPackage() - (getWeightOfPackage() * baseCostPrice));
        String formatMe = String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
        addedCost.setText("$" + formatMe);
    }

    /**
     * @param shippingCost choose % to which you will charge the customer from the total order.
     */
    public void totalShippingCost(TextView shippingCost) {
        double baseCostPrice = 0.5; // 5% shipping cost total price.
        double calculateTotal = (getWeightOfPackage() - (getWeightOfPackage() * baseCostPrice));
        String formatMe = String.format("%.2f", calculateTotal); // ROUND UP 2 DECIMALS
        shippingCost.setText("$" + formatMe);
    }
}
