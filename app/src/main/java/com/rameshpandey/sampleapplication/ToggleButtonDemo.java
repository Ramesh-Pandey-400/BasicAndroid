package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonDemo extends AppCompatActivity {

    ConstraintLayout constraintLayoutToggleDemo;
    private ToggleButton toggleButton;
    private TextView textViewToogleStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_demo);
        constraintLayoutToggleDemo=findViewById(R.id.constToggleDemo);
        textViewToogleStatus=findViewById(R.id.textViewToggleStaus);
        toggleButton=findViewById(R.id.toggleButton);



        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    constraintLayoutToggleDemo.setBackgroundColor(Color.BLACK);
                    textViewToogleStatus.setTextColor(getResources().getColor(R.color.black));
                    textViewToogleStatus.setBackgroundColor(getResources().getColor(R.color.white));
                    textViewToogleStatus.setText(":)");
                }
                else{
                    constraintLayoutToggleDemo.setBackgroundColor(Color.WHITE);
                    textViewToogleStatus.setTextColor(getResources().getColor(R.color.white));
                    textViewToogleStatus.setText(":(");
                    textViewToogleStatus.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
    }
}