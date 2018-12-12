package com.example.tevod.cargoshipment;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
    }

    public void openNext(View v){
        RadioGroup payments = (RadioGroup) findViewById(R.id.paymentMethods);
        RadioButton payment = (RadioButton) findViewById(payments.getCheckedRadioButtonId());
        MyDataStorage.setPaymentMethod(payment.getText().toString());

        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }
    public void goBack(View v){
        NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }


}
