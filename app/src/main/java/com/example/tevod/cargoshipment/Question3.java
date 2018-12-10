package com.example.tevod.cargoshipment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        Spinner spin = (Spinner)findViewById(R.id.spnCurrency);
        ArrayAdapter<String> arr = new ArrayAdapter<>(Question3.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.currencyValues));
        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arr);

    }

    public void openNext(View v){
        Intent intent = new Intent(this, Question4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }


}
