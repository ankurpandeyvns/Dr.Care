package com.dtechterminal.drcare;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FirstLogin extends AppCompatActivity {
    private static final String TAG = "FirstLogin";

    //add Firebase Database stuff
    private FirebaseDatabase mFirebaseDatabase;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myRef;
    private String userID;
    User uInfo = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void Doctor(View view){
            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
            mAuth = FirebaseAuth.getInstance();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            myRef = mFirebaseDatabase.getReference();
            FirebaseUser user = mAuth.getCurrentUser();
            userID = user.getUid();
            uInfo.setFlogin("False");
            uInfo.setuType("Doctor");
            uInfo.setName(user.getDisplayName());
            uInfo.setEmail(user.getEmail());
            rootRef.child(user.getUid()).setValue(uInfo);
            startActivity(new Intent(this,GetAppointment.class));
        Toast.makeText(this, "Welcome "+user.getDisplayName(), Toast.LENGTH_SHORT).show();
    }
     public void Patient(View view){
            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
            mAuth = FirebaseAuth.getInstance();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            myRef = mFirebaseDatabase.getReference();
            FirebaseUser user = mAuth.getCurrentUser();
            userID = user.getUid();
            uInfo.setFlogin("False");
            uInfo.setuType("Patient");
            uInfo.setName(user.getDisplayName());
            uInfo.setEmail(user.getEmail());
            rootRef.child(user.getUid()).setValue(uInfo);
            startActivity(new Intent(this,Ambulance.class));
            Toast.makeText(this, "Welcome "+user.getDisplayName(), Toast.LENGTH_SHORT).show();
        }
}