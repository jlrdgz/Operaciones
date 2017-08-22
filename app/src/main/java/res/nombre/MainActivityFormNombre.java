package res.nombre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import jlrdgz.com.mx.calculadora.R;

public class MainActivityFormNombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form_nombre);
    }

    public  void lanzar(View view){
        Intent i = new Intent(this,MainActivityResultadoNombre.class);
        startActivity(i);
    }
}
