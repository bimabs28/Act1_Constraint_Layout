package com.example.act1constraintlayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class act2 extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);
        Bundle b2 = getIntent().getExtras();

        String email = b2.getString("Parameter1");
        String pass = b2.getString("Parameter2");

        txEmail.setText(email);
        txPassword.setText(pass);

    }
}
