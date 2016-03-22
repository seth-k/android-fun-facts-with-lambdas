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
    private TextView mFactLabel;
    private Button mShowFactButton;
    private Button mSpecialFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign the Views from the layout
        mLayout = (RelativeLayout) findViewById(R.id.FunFactsLayout);
        mFactLabel = (TextView) findViewById(R.id.fact);
        mShowFactButton = (Button) findViewById(R.id.button);
        mSpecialFactButton = (Button) findViewById(R.id.special_button);
        mShowFactButton.setOnClickListener(v -> {
            String fact = mFactBook.getFact();
            // Update the label with our dynamic fact
            mFactLabel.setText(fact);
            int color = mColorWheel.getColor();
            mLayout.setBackgroundColor(color);
            mShowFactButton.setTextColor(color);
            mSpecialFactButton.setTextColor(color);
        });
        mSpecialFactButton.setOnClickListener(this::showSpecialFact);

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method.");
    }

    public void showSpecialFact(View v) {
        mFactLabel.setText("You can now use Java 8 lambdas and method references in Android.");
        int color = mColorWheel.getColor();
        mLayout.setBackgroundColor(color);
        mShowFactButton.setTextColor(color);
        mSpecialFactButton.setTextColor(color);

    }
}
