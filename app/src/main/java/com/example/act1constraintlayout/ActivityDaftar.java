package com.example.act1constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityDaftar extends AppCompatActivity {

    EditText edtNama,edtAlamat,edtEmail,edtPass,edtRepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.enama);
        edtAlamat = findViewById(R.id.ealamat);
        edtEmail = findViewById(R.id.eemail);
        edtPass = findViewById(R.id.epass);
        edtRepass = findViewById(R.id.erepass);
        fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty() || edtAlamat.getText().toString().isEmpty() || edtPass.getText().toString().isEmpty() || edtEmail.getText().toString().isEmpty() || edtRepass.getText().toString().isEmpty()){
                    Snackbar.make(view ,"SEMUA DATA WAJIB DIISI!!!",Snackbar.LENGTH_LONG).show();
                }else{
                    if(edtPass.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Selamat Pendaftaran Berhasil :)",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }else{
                        Snackbar.make(view,"Password tidak sesuai",Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}