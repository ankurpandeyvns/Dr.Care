package com.dtechterminal.drcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DocProf extends AppCompatActivity {
    String[] country = { "Cardiologist", "Gynaecologist", "Obstetrician", "Radiologist", "Nephrology",
            "Pulmonology", "Dentistry", "Hematology", "Geriatrics", "Surgery",  };
    DatabaseReference databaseArtists;
    EditText name,phone,email,workexp;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doc_prof);
        databaseArtists  = FirebaseDatabase.getInstance().getReference("Doctors");
        //---------------------------------------//
        name = findViewById(R.id.docname);
        phone = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        workexp = findViewById(R.id.workexp);
        //---------------------------------------//
        spin = findViewById(R.id.spinner1);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    void Submit(View view){
        Toast.makeText(this,"Form have been Submited , Thank You",Toast.LENGTH_SHORT).show();
        System.exit(0);
    }
}
