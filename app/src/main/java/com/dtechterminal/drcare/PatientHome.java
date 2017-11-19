package com.dtechterminal.drcare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PatientHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    void appointment(View view){
        startActivity(new Intent(this,GetAppointment.class));
    }
    void prescription(View view){
        startActivity(new Intent(this,Treatment.class));
    }
    void ambulance(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "102", null)));
    }
}