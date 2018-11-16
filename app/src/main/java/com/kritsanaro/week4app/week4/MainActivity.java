package com.kritsanaro.week4app.week4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_input;
    Button btn_send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind widget
        et_input = findViewById(R.id.et_input);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = ""+et_input.getText();

                if(input.isEmpty()){

                    Toast.makeText(MainActivity.this, "กรุณาป้อนข้อความ", Toast.LENGTH_SHORT).show();

                }else{

                    Intent goPage2 = new Intent(MainActivity.this,PageOutputActivity.class);
                    goPage2.putExtra("input",input);
                    startActivity(goPage2);
                    finish();

                    Toast.makeText(MainActivity.this, ""+input, Toast.LENGTH_SHORT).show();

                }


            }
        });



    }
}
