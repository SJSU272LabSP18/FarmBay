package com.farmbay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecommendationResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation_result);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null)
        {
            String crop1 = intent.getStringExtra("crop1");
            System.out.println("****"+crop1);
            String crop2 = intent.getStringExtra("crop2");
            String crop3 = intent.getStringExtra("crop3");
            TextView cropText1 =findViewById(R.id.crop1);
            cropText1.setText(crop1);
            TextView cropText2 =findViewById(R.id.crop2);
            cropText2.setText(crop2);
            TextView cropText3 =findViewById(R.id.crop3);
            cropText3.setText(crop3);
        }
    }
}
