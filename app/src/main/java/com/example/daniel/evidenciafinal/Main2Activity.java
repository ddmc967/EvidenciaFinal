package com.example.daniel.evidenciafinal;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Cliente user = intent.getParcelableExtra("user");

        ((TextView) findViewById(R.id.a)).setText(user.nombre);
        ((TextView) findViewById(R.id.b)).setText(user.apellidopa);
        ((TextView) findViewById(R.id.c)).setText(user.apellidoma);
        ((TextView) findViewById(R.id.d)).setText(user.sexo);
        ((TextView) findViewById(R.id.e)).setText(user.nacionalidad);
        ((TextView) findViewById(R.id.f)).setText(user.estado);


    }

    public void salirApp(View view){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu elmenu){
        getMenuInflater().inflate(R.menu.menu,elmenu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem opcion_menu) {

        int id = opcion_menu.getItemId();
        if (id == R.id.cerrar_cesion) {
            salirApp(null);
            return true;

        }

        return super.onOptionsItemSelected(opcion_menu);
    }


}
