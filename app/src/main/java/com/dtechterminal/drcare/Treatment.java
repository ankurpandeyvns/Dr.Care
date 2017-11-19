package com.dtechterminal.drcare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Treatment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    void submit(View view){
        if(view.getId() == R.id.generalmedicine){
            String message = "General Medicine";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.gynecology){
            String message = "Gynecology";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.sexology){
            String message = "Sexology";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.psychiatry){
            String message = "Psychiatry";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.pregenancy){
            String message = "Pregenancy";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.dentistry){
            String message = "Dentistry";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.paediatrics){
            String message = "Paediatrics";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }else if(view.getId() == R.id.dermatologyst){
            String message = "Dermatologyst";
            Bundle basket= new Bundle();
            basket.putString("abc", message);
            Intent intent = new Intent(this, Prescription.class);
            intent.putExtras(basket);
            startActivity(intent);
        }

    }
}
