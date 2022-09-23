package com.example.navegaoactivities.menudeopcoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Recuperar um objeto "inflador" de menus
        MenuInflater inflater = getMenuInflater();
        // Inflando o menu que foi criado em res/menu
        inflater.inflate(R.menu.meumenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // É preciso identificar qual item do menu foi clicado
        // Isso é feito recuperando o ID do item
        switch ((item.getItemId())) {
            case R.id.menAct1:
                // Abrir a activity 1
                Intent i1 = new Intent(getApplicationContext(), UmActivity.class);
                startActivity(i1);
                return true;

            case R.id.menAct2:
                // Abrir a activity 2
                Intent i2 = new Intent(getApplicationContext(), DoisActivity.class);
                startActivity(i2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}