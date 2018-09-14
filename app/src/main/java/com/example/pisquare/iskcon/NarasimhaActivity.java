package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class NarasimhaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narasimha2);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Nrisimha Pranama\n" +
                "\n" +
                "(1)\n" +
                "namas te narasimhaya\n" +
                "prahladahlada-dayine\n" +
                "hiranyakasipor vakshahsila-\n" +
                "tanka-nakhalaye\n" +
                "\n" +
                "I offer my obeisances to Lord Narasimha who gives joy to Prahlada Maharaja and whose nails are like chisels\n" +
                "on the stonelike chest of the demon Hiranyakasipu.\n" +
                "\n" +
                "(2)\n" +
                "ito nrisimhah parato nrisimho\n" +
                "yato yato yami tato nrisimhah\n" +
                "bahir nrisimho hridaye nrisimho\n" +
                "nrisimham adim saranam prapadye\n" +
                "\n" +
                "Lord Nrisimha is here and also there. Wherever I go Lord Nrisimha is there. He is in the heart and is outside\n" +
                "as well. I surrender to Lord Nrisimha, the origin of all things and the supreme refuge.\n" +
                "Prayer to Lord Nrisimha\n" +
                "by Jayadeva Gosvami\n" +
                "\n" +
                "(3)\n" +
                "tava kara-kamala-vare nakham adbhuta-sringam\n" +
                "dalita-hiranyakasipu-tanu-bhringam\n" +
                "kesava dhrita-narahari-rupa jaya jagadisa hare\n" +
                "\n" +
                "O Kesava! O Lord of the universe! O Lord Hari, who have assumed the form of half-man, half-lion! All glories\n" +
                "to You! Just as one can easily crush a wasp between one’s fingernails, so in the same way the body of the\n" +
                "wasplike demon Hiranyakasipu has been ripped apart by the wonderful pointed nails on Your beautiful\n" +
                "lotus hands.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
