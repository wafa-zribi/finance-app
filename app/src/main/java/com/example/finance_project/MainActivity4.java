package com.example.finance_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity4 extends AppCompatActivity {
    Button btnsign_up;
    TextInputEditText nom,mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnsign_up = findViewById(R.id.sign_up);
        nom = findViewById(R.id.nom);
        mdp = findViewById(R.id.pswd);

        btnsign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ouvrir Activity_2
                Intent i = new Intent(MainActivity4.this, MainActivity2.class);
                i.putExtra("nom", nom.getText().toString());
                startActivity(i);
            }
        });

    }
}