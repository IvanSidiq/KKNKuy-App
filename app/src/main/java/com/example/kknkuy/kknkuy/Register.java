package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by ASUS on 07/04/2018.
 */

public class Register extends Activity {

    private DatabaseReference database;

    private Button btSubmit;
    private EditText etName;
    private EditText etEmail;
    private EditText etNimp;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        etName = (EditText) findViewById(R.id.et_name);
        etEmail = (EditText) findViewById(R.id.et_email);
        etNimp = (EditText) findViewById(R.id.et_nimp);
        btSubmit = (Button) findViewById(R.id.bt_reg);

        database =FirebaseDatabase.getInstance().getReference();

        btSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!isEmpty(etName.getText().toString()) && !isEmpty(etEmail.getText().toString()) && !isEmpty(etNimp.getText().toString()))
                    submitUser(new User(etName.getText().toString(), etEmail.getText().toString(), etNimp.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.bt_reg), "Data barang tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        etName.getWindowToken(), 0);
            }
        });

    }

    private Boolean isEmpty(String s){
        return TextUtils.isEmpty(s);
    }

    private void updateUser(User user){

    }

    private void submitUser(User user){
        database.child("user").push().setValue(user).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                etName.setText("");
                etEmail.setText("");
                etNimp.setText("");
                Snackbar.make(findViewById(R.id.bt_reg), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity, Register.class);
    }
}



