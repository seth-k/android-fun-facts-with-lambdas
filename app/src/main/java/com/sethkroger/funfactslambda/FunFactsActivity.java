package com.sethkroger.funfactslambda;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private RelativeLayout mLayout;
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign the Views from the layout
        mLayout = (RelativeLayout) findViewById(R.id.FunFactsLayout);
        final TextView factLabel = (TextView) findViewById(R.id.fact);
        final Button showFactButton = (Button) findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                // Update the label with our dynamic fact
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                mLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method.");
    }
}
