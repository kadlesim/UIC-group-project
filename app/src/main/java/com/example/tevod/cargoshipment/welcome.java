package com.example.tevod.cargoshipment;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    Button initButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initButton = (Button)findViewById(R.id.btnInit);

    }

    public void openNext(View v){
        Intent intent = new Intent(this, Question1.class);
//        PendingIntent pendingIntent =
//                TaskStackBuilder.create(this)
//                        .addNextIntentWithParentStack(intent)
//                        .getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

        startActivity(intent);
        //overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

}
