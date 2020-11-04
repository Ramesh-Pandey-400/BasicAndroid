package com.rameshpandey.sampleapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDemo extends AppCompatActivity {
    private Button buttonShowDialog;
    private AlertDialog.Builder alertDialog;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_demo);
        buttonShowDialog=findViewById(R.id.buttonShowDialogID);

        buttonShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //actual Dialog (Alert Dialog)

                 alertDialog=new AlertDialog.Builder(AlertDemo.this);


                 //set thing up -- setup titles

                alertDialog.setTitle(R.string.alertDialogTitle);

                //Setting up Message
                alertDialog.setMessage(getResources().getString(R.string.alertDialogMessage));


                //setting up Cancellable
                alertDialog.setCancelable(false);


                //setting up button postive and negative
                alertDialog.setPositiveButton(R.string.alertDialogPositive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //exit our main window
                        AlertDemo.this.finish();
                    }
                });


                //negative Button
                alertDialog.setNegativeButton(R.string.alertDialogNegative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


                //create a actual Diaolg
                AlertDialog dialog=alertDialog.create();


                //show a alert Dialog
                dialog.show();
            }
        });
    }
}