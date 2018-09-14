package com.example.pisquare.iskcon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DarshanaActivity extends AppCompatActivity {

    private Button btnGovindam;
    private Button btnSavarana;
    private Button btnNama;
    private Button btnNaarati;
    private Button btnVenkat;
    private Button btnSriVandana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darshana);

        btnGovindam = (Button)findViewById(R.id.btnguru);
        btnGovindam.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,GovindamActivity.class);
                startActivity(intent);
            }
        });

        btnSavarana = (Button)findViewById(R.id.btntulsi);
        btnSavarana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,SavaranaActivity.class);
                startActivity(intent);
            }
        });

        btnNama = (Button)findViewById(R.id.btnnarasimha);
        btnNama.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,NamaActivity.class);
                startActivity(intent);
            }
        });

        btnNaarati = (Button)findViewById(R.id.btnkavaca);
        btnNaarati.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,NaraAActivity.class);
                startActivity(intent);
            }
        });

        btnVenkat = (Button)findViewById(R.id.button3);
        btnVenkat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,SriVenkateshaActivity.class);
                startActivity(intent);
            }
        });

        btnSriVandana = (Button)findViewById(R.id.button4);
        btnSriVandana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(DarshanaActivity.this,SriVandanaActivity.class);
                startActivity(intent);
            }
        });


    }
}
