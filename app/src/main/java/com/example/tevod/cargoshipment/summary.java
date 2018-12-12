package com.example.tevod.cargoshipment;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class summary extends AppCompatActivity {

    Button cargo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        cargo = (Button)findViewById(R.id.btnCargo);
        cargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder build = new AlertDialog.Builder(summary.this);

                build.setCancelable(true);
                build.setTitle("This is the test alert");
                build.setMessage("This is the alert message");

                build.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                build.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(summary.this,Question1.class);
                        startActivity(intent);
                    }
                });
                build.show();
            }
        });


    }

    public void goBack(View v){
        NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
