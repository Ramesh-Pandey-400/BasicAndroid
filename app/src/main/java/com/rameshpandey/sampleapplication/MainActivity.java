package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayoutMain;
    private Button buttonChangeBackg;
    private int colors[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        constraintLayoutMain=(ConstraintLayout)findViewById(R.id.mainBackgroundView);
        buttonChangeBackg=(Button)findViewById(R.id.change_color_btn);


        colors=new int[]{Color.RED, Color.BLACK, Color.YELLOW,
                            Color.BLUE, Color.MAGENTA, Color.GREEN,
                            Color.CYAN, Color.GRAY, Color.DKGRAY, Color.LTGRAY};

        buttonChangeBackg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int randomColor=random.nextInt(colors.length);
                constraintLayoutMain.setBackgroundColor(colors[randomColor]);

            }
        });
    }
}