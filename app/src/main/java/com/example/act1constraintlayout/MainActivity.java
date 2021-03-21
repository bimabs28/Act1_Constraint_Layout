package com.example.act1constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btSignin;
    EditText edemail, edpassword;
    String Name,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSignin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = edemail.getText().toString();
                Password = edpassword.getText().toString();

                if (Name.equals("bimabayusaputra111@gmail.com") && Password.equals("00000000")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login SUKSES!!!" + "", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("Parameter1", Name.trim());
                    b.putString("Parameter2", Name.trim());

                    Intent intentBaru = new Intent( getApplicationContext(), act2.class);
                    intentBaru.putExtras(b);
                    startActivity(intentBaru);
                }

                else if(!Name.equals("bimabayusaputra111@gmail.com") && Password.equals("00000000")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email SALAH!!!", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(Name.equals("bimabayusaputra111@gmail.com") && !Password.equals("00000000")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password SALAH!!!",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email atau Password SALAH!!!", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}
