package com.dtechterminal.drcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Hashtable;

public class Prescription extends AppCompatActivity {
    EditText et1,docname;
    Hashtable<String,String> hm=new Hashtable<String,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //-----------------------------------/
        hm.put("General Medicine","Amit Kumar Yadav");
        hm.put("Gynecology","Ankur Pandey");
        hm.put("Sexology","Driviz");
        hm.put("Psychiatry","Divit Gautam");
        hm.put("Pregenancy","Aditya VijayVargiya");
        hm.put("Dentistry","Ajay Namona");
        hm.put("Paediatrics","Robin Nain");
        hm.put("Dermatologyst","Shivaji Chaprana");
        hm.put("Cardiologist","Dhruv Rana");
        //-----------------------------------//
        setContentView(R.layout.activity_prescription);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("abc");
        et1 =(EditText) findViewById(R.id.value);
        docname =(EditText) findViewById(R.id.docname);
        et1.setText(message);
        et1.setEnabled(false);
        if(hm.containsKey(message )){
            String value = (String) hm.get(message);
            docname.setText(value);
            docname.setEnabled(false);
        }
    }
}