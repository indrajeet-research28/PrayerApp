package com.example.pisquare.iskcon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MangalaActivity extends AppCompatActivity {

    private Button btnguruashtaka;
    private Button btntulsi;
    private Button btnnarasimha;
    private Button btnNkavaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangala);

        btnguruashtaka = (Button)findViewById(R.id.btnguru);
        btnguruashtaka.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MangalaActivity.this,GuruAstakaActivity.class);
                startActivity(intent);
            }
        });

        btntulsi = (Button)findViewById(R.id.btntulsi);
        btntulsi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MangalaActivity.this,TulsiActivity.class);
                startActivity(intent);
            }
        });

        btnnarasimha = (Button)findViewById(R.id.btnnarasimha);
        btnnarasimha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MangalaActivity.this,NarasimhaActivity.class);
                startActivity(intent);
            }
        });
        btnNkavaca = (Button)findViewById(R.id.btnkavaca);
        btnNkavaca.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent =new Intent(MangalaActivity.this,NkavacaActivity.class);
                startActivity(intent);
            }
        });

    }
}
