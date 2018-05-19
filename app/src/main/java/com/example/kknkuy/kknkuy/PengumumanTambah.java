package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.text.TextUtils.isEmpty;

/**
 * Created by ASUS on 06/04/2018.
 */

public class PengumumanTambah extends AppCompatActivity {

    private DatabaseReference databasePengumuman;
    private Button btSumbit;
    private EditText etJudul;
    private EditText etLink;
    private EditText etDeskripsi;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengumuman_tambah);

        etJudul = (EditText) findViewById(R.id.judulPengumuman);
        etLink = (EditText) findViewById(R.id.linkPengumuman);
        etDeskripsi = (EditText) findViewById(R.id.deskripsiPengumuman);
        btSumbit = (Button) findViewById(R.id.submit_pengumuman);
        databasePengumuman = FirebaseDatabase.getInstance().getReference();

        btSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmpty(etJudul.getText().toString()) && !isEmpty(etLink.getText().toString()) && !isEmpty(etDeskripsi.getText().toString()))
                    submitPengumuman(new DataPengumuman(etJudul.getText().toString(), etLink.getText().toString(), etDeskripsi.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.submit_pengumuman), "Data barang tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        etJudul.getWindowToken(), 0);
            }
        });
    }

    private boolean isEmpty(String s) {
        return TextUtils.isEmpty(s);
    }

    private void submitPengumuman(DataPengumuman dataPengumuman){
        databasePengumuman.child("barang").push().setValue(dataPengumuman).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                etJudul.setText("");
                etLink.setText("");
                etDeskripsi.setText("");
                Snackbar.make(findViewById(R.id.submit_pengumuman), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, PengumumanTambah.class);
    }


}