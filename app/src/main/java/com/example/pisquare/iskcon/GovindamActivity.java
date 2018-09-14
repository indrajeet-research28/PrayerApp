package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class GovindamActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govindam);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par= "\n\nGovindam adi-Purusham \n\n"+
                "govindam ādi-puruṣaṁ tam ahaṁ bhajāmi\n" +
                        "govindam ādi-puruṣaṁ tam ahaṁ bhajāmi\n" +
                        "govindam ādi-puruṣaṁ tam ahaṁ bhajāmi\n" +
                "veṇuṁ kvaṇantam aravinda-dalāyatākṣam-\n" +
                "barhāvataṁsam asitāmbuda-sundarāṅgam\n" +
                "kandarpa-koṭi-kamanīya-viśeṣa-śobhaṁ\n" +
                "govindam ādi-puruṣaṁ tam ahaṁ bhajāmi\n" +
                "\n" +
                "I worship Govinda, the primeval Lord, who is adept in playing on His flute, with blooming eyes like lotus petals with head decked with peacock’s feather, with the figure of beauty tinged with the hue of blue clouds, and His unique loveliness charming millions of Cupids.\n" +
                "\n" +
                "\n"+
                "aṅgāni yasya sakalendriya-vṛtti-manti\n" +
                "paśyanti pānti kalayanti ciraṁ jaganti\n" +
                "ānanda-cinmaya-sad-ujjvala-vigrahasya\n" +
                "govindam ādi-puruṣaṁ tam ahaṁ bhajāmi\n" +
                "\n" +
                "\n" +
                "I worship Govinda, the primeval Lord, whose transcendental form is full of bliss, truth, substantiality and is thus full of the most dazzling splendor. Each of the limbs of that transcendental figure possesses in Himself, the full-fledged functions of all the organs, and eternally sees, maintains and manifests the infinite universes, both spiritual and mundane.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
