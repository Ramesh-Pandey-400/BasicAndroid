package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxDemo extends AppCompatActivity {

    CheckBox checkBoxChowmein;
    CheckBox checkBoxMomo;
    CheckBox checkBoxBurger;
    TextView textViewchkbxResult;
    Button buttonShowResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);

        checkBoxBurger=findViewById(R.id.checkBoxBurger);
        checkBoxChowmein=findViewById(R.id.checkBoxChowmein);
        checkBoxMomo=findViewById(R.id.checkBoxMomo);
        textViewchkbxResult=findViewById(R.id.textViewCheckboxResult);
        buttonShowResult=findViewById(R.id.buttonChkbxShowResult);

        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                StringBuilder stringBuilder=new StringBuilder();
//                stringBuilder.append(checkBoxBurger.getText().toString()+
//                        " status is:"+checkBoxBurger.isChecked()+"\n");
//                stringBuilder.append(checkBoxChowmein.getText().toString()+
//                        " status is:"+checkBoxChowmein.isChecked()+"\n");
//                stringBuilder.append(checkBoxMomo.getText().toString()+
//                        " status is:"+checkBoxMomo.isChecked()+"\n");
//
//                textViewchkbxResult.setText(stringBuilder);

                if(checkBoxMomo.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxMomo.getText().toString());
                }
                if(checkBoxChowmein.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxChowmein.getText().toString());
                }
                if(checkBoxBurger.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxBurger.getText().toString());
                }
                if(checkBoxMomo.isChecked() && checkBoxBurger.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxMomo.getText().toString()
                                                +" \n\t"+checkBoxBurger.getText().toString());
                }
                if(checkBoxMomo.isChecked() && checkBoxChowmein.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxMomo.getText().toString()
                            +" \n\t"+checkBoxChowmein.getText().toString());
                }
                if(checkBoxBurger.isChecked() && checkBoxChowmein.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxChowmein.getText().toString()
                            +" \n\t"+checkBoxBurger.getText().toString());
                }
                if(checkBoxChowmein.isChecked() && checkBoxBurger.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxChowmein.getText().toString()
                            +" \n\t"+checkBoxBurger.getText().toString());
                }
                if(checkBoxMomo.isChecked() && checkBoxBurger.isChecked() && checkBoxChowmein.isChecked()){
                    textViewchkbxResult.setText("You Choose \n\t"+checkBoxMomo.getText().toString()
                            +" \n\t"+checkBoxBurger.getText().toString()
                            +" \n\t"+checkBoxChowmein.getText().toString());
                }





            }
        });



    }
}