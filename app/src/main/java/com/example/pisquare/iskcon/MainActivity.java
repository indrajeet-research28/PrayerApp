package com.example.pisquare.iskcon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnMangala;
    private Button btnDarshana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMangala = (Button)findViewById(R.id.btntulsi);
        btnMangala.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MainActivity.this,MangalaActivity.class);
                startActivity(intent);
            }
        });
        btnDarshana = (Button)findViewById(R.id.btndarsana);
        btnDarshana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MainActivity.this,DarshanaActivity.class);
                startActivity(intent);
            }
        });
    }
}
