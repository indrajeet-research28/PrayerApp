package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class NaraAActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nara_a);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Narasimha Aarati"+
                "\n\nLord Narasimha is the half-man half-lion incarnation of Lord Krishna who appeared to protect his young devotee Prahlada from his envious and atheistic demoniac father, Hiranyakashipu.\n" +
                "\n" +
                "sri-narasimha, jaya narasimha, jaya jaya narasimha \n" +
                "prahladesa jaya padma-mukha-padma-bhrnga\n" +
                "\n" +
                "All glories to Lord Narasimhadeva! All glories to Lord Narasimhadeva, who is the Lord of Prahlada Maharaja and, like the honeybee, is always engaged in beholding the lotuslike face of the goddess of fortune.\n" +
                "\n" +
                "Narasimha Pranama\n" +
                "\n" +
                "namas te narasimhaya, prahladahlada-dayine\n" +
                "hiranyakasipor vakshah, sila-tanka-nakhalaye\n" +
                "\n" +
                "“I offer my respectful obeisances unto You, Lord Narasimhadeva. You are the giver of pleasure to Maharaja Prahlada, and Your nails cut the chest of Hiranyakashipu like a chisel cutting stone.”\n" +
                "\n" +
                "ito narasimhah parato narasimho, yato yato yami tato narasimhah\n" +
                "bahir narasimho hrdaye narasimho, narasimham adim sharanam prapadye\n" +
                "\n" +
                "“Lord Narasimhadeva is here, and He is also there on the opposite side. Wherever I go, there I see Lord Narasimhadeva. He is outside and within my heart. Therefore I take shelter of Lord Narasimhadeva, the original Supreme Personality of Godhead.”\n" +
                "\n" +
                "Sri Jayadeva Goswami\n" +
                "\n" +
                "tava kara-kamala-vare nakham adbhuta-shrngam\n" +
                "dalita-hiranyakashipu-tanu-bhrngam\n" +
                "keshava dhrta-narahari-rupa jaya jagadisa hare\n" +
                "\n" +
                "“O my Lord, Your hands are very beautiful, like the lotus flower, but with Your long nails You have ripped apart the wasp Hiranyakashipu. Unto You, Lord of the universe, I offer my humble obeisance.”\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
