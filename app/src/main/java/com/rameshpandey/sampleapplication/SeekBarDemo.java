package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarDemo extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textViewAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_demo);

        seekBar=findViewById(R.id.seekBar);
        textViewAnswer=findViewById(R.id.textViewResultSeekbar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                String str="Danger Zone is "+seekBar.getProgress()+"/"+seekBar.getMax();
                textViewAnswer.setText(str);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBar.setBackgroundColor(Color.WHITE);
                if(seekBar.getProgress() > 5){
                    seekBar.setBackgroundColor(getResources().getColor(R.color.lightred));
                    textViewAnswer.setTextColor(getResources().getColor(R.color.lightred));
                }
                if(seekBar.getProgress() < 5 ){
                    seekBar.setBackgroundColor(getResources().getColor(R.color.lightgreen));
                    textViewAnswer.setTextColor(getResources().getColor(R.color.lightgreen));
                }
                if(seekBar.getProgress() == 5 ){
                    seekBar.setBackgroundColor(getResources().getColor(R.color.lightpink));
                    textViewAnswer.setTextColor(getResources().getColor(R.color.lightpink));
                }


            }
        });
    }
}