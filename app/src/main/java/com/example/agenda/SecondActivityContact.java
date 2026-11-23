package com.example.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityContact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_contact);

        Button btnAceptar = findViewById(R.id.btnAceptar);
        Button btnCancelar= findViewById(R.id.btnCancelar);

        int posicio = getIntent().getIntExtra("posicio", -1);

        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText telefono = findViewById(R.id.telefono);
        EditText email = findViewById(R.id.email);
        EditText fechaNac = findViewById(R.id.fechaNac);

        EditText via = findViewById(R.id.nomVia);
        EditText numero = findViewById(R.id.numero);
        EditText ciudad = findViewById(R.id.ciudad);
        EditText codigoP = findViewById(R.id.codigoPostal);
        EditText provincia = findViewById(R.id.provincia);
        EditText pais = findViewById(R.id.pais);

        if (posicio != -1) {
            nombre.setText(getIntent().getStringExtra("nombre"));
            apellido.setText(getIntent().getStringExtra("apellido"));
            telefono.setText(String.valueOf(getIntent().getIntExtra("telefono", 0)));
            email.setText(getIntent().getStringExtra("email"));
            fechaNac.setText(getIntent().getStringExtra("fechaNac"));

            via.setText(getIntent().getStringExtra("via"));
            numero.setText(getIntent().getStringExtra("numero"));
            ciudad.setText(getIntent().getStringExtra("ciudad"));
            codigoP.setText(getIntent().getStringExtra("codigoP"));
            provincia.setText(getIntent().getStringExtra("provincia"));
            pais.setText(getIntent().getStringExtra("pais"));
        }

        btnAceptar.setOnClickListener(v -> {
            Intent guardarDatos = new Intent();

            guardarDatos.putExtra("posicio", posicio);
            guardarDatos.putExtra("nombre", nombre.getText().toString());
            guardarDatos.putExtra("apellido", apellido.getText().toString());
            guardarDatos.putExtra("telefono", telefono.getText().toString());
            guardarDatos.putExtra("email", email.getText().toString());
            guardarDatos.putExtra("fechaNac", fechaNac.getText().toString());

            guardarDatos.putExtra("via", via.getText().toString());
            guardarDatos.putExtra("numero", numero.getText().toString());
            guardarDatos.putExtra("ciudad", ciudad.getText().toString());
            guardarDatos.putExtra("codigoP", codigoP.getText().toString());
            guardarDatos.putExtra("provincia", provincia.getText().toString());
            guardarDatos.putExtra("pais", pais.getText().toString());

            setResult(RESULT_OK, guardarDatos);
            finish();
        });

        btnCancelar.setOnClickListener(v -> {
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}
