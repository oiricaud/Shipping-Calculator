package edu.utep.cs.cs4330.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = ""; // Debugging

    // MODEL
    private Calculate calculator;

    // VIEWS
    private TextView weightPackageView;
    private TextView baseCostView;
    private TextView addedCostView;
    private TextView totalShippingCostView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculate();
        weightPackageView = (TextView) findViewById(R.id.editText); // get the input from the  the user
        baseCostView = (TextView) findViewById(R.id.textView4);
        addedCostView = (TextView) findViewById(R.id.textView5);
        totalShippingCostView = (TextView) findViewById(R.id.textView6);

        baseCostView.setText("$0.00");
        addedCostView.setText("$0.00");
        totalShippingCostView.setText("$0.00");

        weightPackageView.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() >= 1) {
                    int convertEditable = Integer.parseInt(s.toString());

                    calculator.addWeight(convertEditable);
                    calculator.addBaseCost(Integer.parseInt(s.toString()));
                    calculator.addaddedCost(Integer.parseInt(s.toString()));
                    calculator.addtotalShippingCost(Integer.parseInt(s.toString()));

                    baseCostView.setText(calculator.getBaseCost());
                    addedCostView.setText(calculator.getaddedCost());
                    totalShippingCostView.setText(calculator.gettotalShippingCost());
                }
                else{
                    calculator.addWeight(0);
                }
          //
            }
        });
    }
}
