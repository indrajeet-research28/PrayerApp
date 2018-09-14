package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class TulsiActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulsi);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Tulasi-Aarti\n" +
                "\n" +
                "(1)\n" +
                "namo namah tulasi krishna-preyasi namo namah\n" +
                "radha-krishna-seva pabo ei abilashi\n" +
                "\n" +
                "(2)\n" +
                "ye tomara sarana loy, tara vancha purna hoy\n" +
                "kripa kori’ koro tare vrindavana-vasi\n" +
                "\n" +
                "(3)\n" +
                "mora ei abhilasha, vilasa kunje dio vasa\n" +
                "nayana heribo sada yugala-rupa-rasi\n" +
                "\n" +
                "(4)\n" +
                "ei nivedana dhara, sakhira anugata koro\n" +
                "seva-adhikara diye koro nija dasi\n" +
                "\n" +
                "(5)\n" +
                "dina krishna-dase koy, ei yena mora hoy\n" +
                "sri-radha-govinda-preme sada yena bhasi\n" +
                "\n" +
                "\n" +
                "Translation:\n" +
                "\n" +
                "(1) O Tulasi, beloved of Krishna, I bow before you again and again. My desire is to obtain the service of Sri Sri Radha and Krishna.\n" +
                "\n" +
                "(2) Whoever takes shelter of you has his wishes fulfilled. Bestowing your mercy on him, you make him a resident of Vrindavana.\n" +
                "\n" +
                "(3) My desire is that you will also give me a residence in the pleasure groves of Sri Vrindavana-dhama. Thus within my vision I will always behold the beautiful pastimes of Radha and Krishna.\n" +
                "\n" +
                "(4) I beg you to make me a follower of the cowherd damsels of Vraja. Please give me the privilege of devotional service and make me your own maidservant.\n" +
                "\n" +
                "(5) This very fallen and lowly servant of Krsna prays, \"May I always swim in the love of Sri Radha and Govinda.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Sri Tulasi Pranama\n" +
                "\n" +
                "\n" +
                "vrindayai tulasi-devyai\n" +
                "priyayai kesavasya ca\n" +
                "krishna-bhakti-prade devi\n" +
                "satya vatyai namo namah\n" +
                "\n" +
                "\n" +
                "I offer my repeated obeisances unto Vrinda, Srimati Tulasi Devi, who is very dear to Lord Kesava. O goddess, you bestow devotional service to Krishna and you possess the highest truth.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sri Tulasi Pradakshina Mantra\n" +
                "\n" +
                "\n" +
                "yani kani ca papani\n" +
                "brahma-hatyadikani ca\n" +
                "tani tani pranasyanti\n" +
                "pradakshinah pade pade\n" +
                "\n" +
                "\n" +
                "By the circumambulation of Srimati Tulasi Devi all the sins that one may have committed are destroyed at every step, even the sin of killing a brahmana.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
