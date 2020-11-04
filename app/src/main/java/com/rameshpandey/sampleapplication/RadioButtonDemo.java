package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonDemo extends AppCompatActivity {
    private RadioButton radioButton;
    private RadioGroup radioGroup;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);

        radioGroup=(RadioGroup)findViewById(R.id.radiogrpID);
        editText=(EditText)findViewById(R.id.editTextAnswer);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioButton=(RadioButton)findViewById(checkedId);
                switch (radioButton.getId()){
                    case R.id.yesID:
                        editText.setText(R.string.yes);
                        break;
                    case R.id.noID:
                        editText.setText(R.string.no);
                        break;
                    case R.id.maybeID:
                        editText.setText(R.string.maybe);
                        break;
                }
            }
        });
    }
}