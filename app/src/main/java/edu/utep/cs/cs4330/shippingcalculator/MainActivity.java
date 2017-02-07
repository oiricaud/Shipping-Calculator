package edu.utep.cs.cs4330.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = ""; // Debugging
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainModel model = new MainModel(); // Call MainModel class

        final TextView weightOfPackage = (TextView) findViewById(R.id.editText); // get the input from the  the user
        final TextView baseCost = (TextView) findViewById(R.id.textView4);
        final TextView addedCost = (TextView) findViewById(R.id.textView5);
        final TextView totalShippingCost = (TextView) findViewById(R.id.textView6);

        model.setDefault(baseCost, addedCost, totalShippingCost);

        weightOfPackage.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void afterTextChanged(Editable s) {
                int convertEditable =  Integer.parseInt(s.toString());
                model.setWeightOfPackage(convertEditable);

                /* Below is where how much we will charge the customer. */
                model.setBaseCost(baseCost);
                model.setAddedCost(addedCost);
                model.totalShippingCost(totalShippingCost);
            }
        });
    }

}
