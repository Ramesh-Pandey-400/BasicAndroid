package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class NextScreen extends AppCompatActivity {
    private Button btnRadioDemo;
    private Button btnSeekbarDemo;
    private Button btnAlertDemo;
    private Button btnCheckboxDemo;
    private Button btnToggleDemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next_screen);

        btnRadioDemo=(Button)findViewById(R.id.btnRadioDemo);
        btnAlertDemo=(Button)findViewById(R.id.btnAlertDemo);
        btnCheckboxDemo=(Button)findViewById(R.id.btnCheckboxDemo);
        btnSeekbarDemo=(Button)findViewById(R.id.btnSeekbarDemo);
        btnToggleDemo=(Button)findViewById(R.id.btnToggleDemo);



        btnRadioDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NextScreen.this,RadioButtonDemo.class);
                startActivity(intent);
            }
        });


    }

}