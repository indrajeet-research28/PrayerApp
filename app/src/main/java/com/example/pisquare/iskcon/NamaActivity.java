package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class NamaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Nama-Kirtana \n" +
                "(by Shrila Bhaktivinoda Thakura)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "(1) \n" +
                "yashomati-nandana, braja-baro-nagara \n" +
                "gokula-ranjana kana \n" +
                "gopi-parana-dhana, madana-manohara \n" +
                "kaliya-damana-vidhana\n" +
                "\n" +
                "(2) \n" +
                "amala harinam amiya-vilasa \n" +
                "vipina-purandara, navina nagara-bora \n" +
                "bamshi-badana suvasa\n" +
                "\n" +
                "(3) \n" +
                "braja-jana-palana, asura-kula-nashana \n" +
                "nanda-godhana-rakhowala \n" +
                "govinda madhava, navanita-taskara \n" +
                "sundara nanda-gopala\n" +
                "\n" +
                "(4) \n" +
                "jamuna-tata-chara, gopi-basana-hara \n" +
                "rasa-rasika kripamoya \n" +
                "shri-radha-vallabha, brindabana-natabara \n" +
                "bhakativinod-ashraya \n" +
                "\n" +
                "Translation\n" +
                "\n" +
                "(1) Lord Krishna is the beloved son of mother Yashoda; the transcendental lover in the land of Vraja; the delight of Gokula; Kana [a nickname of Krishna]; the wealth of the lives of the gopis. He steals the mind of even Cupid and punishes the Kaliya serpent.\n" +
                "\n" +
                "(2) These pure, holy names of Lord Hari are full of sweet, nectarean pastimes. Krishna is the Lord of the twelve forests of Vraja. He is ever-youthful and is the best of lovers. He is always playing on a flute, and He is an excellent dresser.\n" +
                "\n" +
                "(3) Krishna is the protector of the inhabitants of Vraja; the destroyer of various demoniac dynasties; the keeper and tender of Nanda Maharaja's cows; the giver of pleasure to the cows, land, and spiritual senses; the husband of the goddess of fortune; the butter thief; and the beautiful cowherd boy of Nanda Maharaja.\n" +
                "\n" +
                "(4) Krishna wanders along the banks of the River Yamuna. He stole the garments of the young damsels of Vraja who were bathing there. He delights in the mellows of the rasa dance; He is very merciful; the lover and beloved of Shrimati Radharani; the great dancer of Vrindavana; and the shelter and only refuge of Thakura Bhaktivinoda.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
