package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class SriVandanaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sri_vandana);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Guru Vandana"+"\n\nsri-guru-charana-padma, kevala-bhakati-sadma,\n" +
                "bando mui savadhana mate\n" +
                "jahara prasade bhai, e bhava toriya jai,\n" +
                "krishna-prapti hoy jaha haite\n" +
                "\n" +
                "The lotus feet of our spiritual master are the abode of pure devotional service. I bow down to his lotus feet with great care and attention. My dear brothers! It is through the grace of our spiritual master that we can cross over this material existence and attain Krishna.\n" +
                "\n" +
                "\n" +
                "guru-mukha-padma-vakya, chittete koriya aikya,\n" +
                "ar na koriho mane asha\n" +
                "sri-guru-charane rati, ei se uttama-gati,\n" +
                "je prasade pure sarva asha\n" +
                "\n" +
                "Make the teachings emanating from the lotus mouth of our spiritual master one with your heart, and do not desire anything else.  Attachment to his lotus feet is the best way to make spiritual advancement. His mercy fulfills all desires for spiritual perfection.\n" +
                "\n" +
                "\n" +
                "chakhu-dan dilo jei, janme janme prabhu sei,\n" +
                "divya jnan hride prokashito\n" +
                "prema-bhakti jaha hoite, avidya vinasha jate,\n" +
                "vede gay jahara charito\n" +
                "\n" +
                "He who has given us the gift of transcendental vision is our lord, birth after birth. It is by his mercy that divine knowledge is revealed within our hearts, bestowing pure love for Krishna and destroying ignorance. The Vedic scriptures sing of his character.\n" +
                "\n" +
                "\n" +
                "sri-guru karuna-sindhu, adhama janara bandhu,\n" +
                "lokanath lokera jivana\n" +
                "ha ha prabhu koro doya, deho more pada-chaya,\n" +
                "ebe jasha ghusuk tribhuvana\n" +
                "\n" +
                "O spiritual master, O ocean of mercy and friend of the fallen! O universal teacher and life of all people! Be merciful unto us, O master, and give us the shade of your lotus feet. May your glories now be proclaimed throughout the three worlds.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
