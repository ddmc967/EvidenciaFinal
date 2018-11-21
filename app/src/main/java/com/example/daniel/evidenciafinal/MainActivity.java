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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarclick(View view)

    {
        Cliente b = new Cliente(null);
        b.Nombre = ((EditText)findViewById(R.id.editText2)).getText().toString();
        b.ApellidoMaterno = ((EditText)findViewById(R.id.editText4)).getText().toString();
        b.ApellidoPaterno = ((EditText)findViewById(R.id.editText3)).getText().toString();
        b.Nacionalidad = ((EditText)findViewById(R.id.editText5)).getText().toString();
        b.Estado = ((Spinner)findViewById(R.id.spinner)).getSelectedItem().toString();
        b.sexo = ((RadioButton)findViewById(((RadioGroup)findViewById(R.id.radioGroup2)).getCheckedRadioButtonId())).getText().toString();



        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra( "user", (Parcelable) b);
        startActivity(intent);
    }

    // de clarar en modo publico lo que hara la opcion que esta en el menu.
    public void salirApp(View view){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu elmenu){
        getMenuInflater().inflate(R.menu.menu,elmenu);
        return true;
    }
    //la accion que ara la opcioncion del menu
    public boolean onOptionsItemSelected (MenuItem opcion_menu) {

        int id = opcion_menu.getItemId();
        if (id == R.id.cerrar_cesion) {
            salirApp(null);
            return true;

        }
        //  devolver hacia el metodo publico
        return super.onOptionsItemSelected(opcion_menu);
    }


}