package com.kritsanaro.week4app.week4;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageOutputActivity extends AppCompatActivity {

    TextView tv_output;
    Button btn_goback;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageoutput_activity);

        //bind widget
        tv_output = findViewById(R.id.tv_output);
        btn_goback = findViewById(R.id.btn_goback);


        String input = getIntent().getExtras().getString("input");

        tv_output.setText(input);

        btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack = new Intent(PageOutputActivity.this,MainActivity.class);
                startActivity(goBack);
                finish();
            }
        });



    }

}
