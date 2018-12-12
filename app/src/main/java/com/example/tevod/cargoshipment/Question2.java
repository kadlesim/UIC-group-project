package com.example.tevod.cargoshipment;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void openNext(View v){
        EditText amount = (EditText) findViewById(R.id.editTextAmount);
        MyDataStorage.setAmount(Integer.parseInt(amount.getText().toString()));
        RadioGroup units = (RadioGroup) findViewById(R.id.radionBtnGroupUnits);
        RadioButton unit = (RadioButton) findViewById(units.getCheckedRadioButtonId());
        MyDataStorage.setUnits(unit.getText().toString());

        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

    public void goBack(View v){
        NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

}
