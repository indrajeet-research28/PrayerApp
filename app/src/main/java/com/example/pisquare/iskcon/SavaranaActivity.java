package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class SavaranaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savarana);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSavarana-Sri-Gaura-Pada-Padme \n\n"+
                "(1)\n" +
                "śrī-kṛṣṇa-caitanya prabhu doyā koro more\n" +
                "tomā binā ke doyālu jagat-saḿsāre\n" +
                " \n" +
                "\n" +
                "(2)\n" +
                "patita-pāvana-hetu tava avatāra\n" +
                "mo sama patita prabhu nā pāibe āra\n" +
                " \n" +
                "\n" +
                "(3)\n" +
                "hā hā prabhu nityānanda, premānanda sukhī\n" +
                "kṛpābalokana koro āmi boro duḥkhī\n" +
                " \n" +
                "\n" +
                "(4)\n" +
                "doyā koro sītā-pati adwaita gosāi\n" +
                "tava kṛpā-bale pāi caitanya-nitāi\n" +
                " \n" +
                "\n" +
                "(5)\n" +
                "\n" +
                "gaura premamaya tanu paṇḍita gadādhara\n" +
                "srīnivāsa haridāsa doyāra sāgara\n" +
                " \n" +
                "\n" +
                "(6)\n" +
                "hā hā swarūp, sanātana, rūpa, raghunātha\n" +
                "bhaṭṭa-juga, śrī-jīva hā prabhu lokanātha\n" +
                " \n" +
                "\n" +
                "(7)\n" +
                "doyā koro śrī-ācārya prabhu śrīnivāsa\n" +
                "rāmacandra-sańga māge narottama-dāsa\n" +
                "\n" +
                " \n" +
                " \n" +
                "\n" +
                "TRANSLATION\n" +
                "\n" +
                "1) My dear Lord Caitanya, please be merciful to me, because who can be more merciful than Your Lordship within these three worlds?\n" +
                " \n" +
                "\n" +
                "2) Your incarnation is just to reclaim the conditioned, fallen souls, but I assure You that You will not find a greater fallen soul than me. Therefore, my claim is first.\n" +
                " \n" +
                "\n" +
                "3) My dear Lord Nityananda, You are always joyful in spiritual bliss. Since You always appear very happy, I have come to You because I am most unhappy. If You kindly put Your glance over me, then I may also become happy.\n" +
                " \n" +
                "\n" +
                "4) My dear Advaita Prabhu, husband of Sita, You are so kind. Please be merciful to me. If You are kind to me, naturally Lord Caitanya and Nityananda will also be kind to me.\n" +
                " \n" +
                "\n" +
                "5) Gaura’s love embodiment is shown by Gadadhara Pandita. Srinivasa Pandita and Haridasa Thakura are the ocean of mercy.\n" +
                " \n" +
                "\n" +
                "6) O Svarupa Damodara, personal secretary of Lord Caitanya, O six Gosvamis O Sri Rupa Gosvami, Sri Sanatana Gosvami, Sri Raghunatha Bhatta Gosvami, Sri Gopala Bhatta Gosvami, Sri Jiva Gosvami, and Sri Raghunatha dasa Gosvami! O Lokanatha Gosvami, my beloved spiritual master! Narottama dasa also prays for your mercy.\n" +
                " \n" +
                "\n" +
                "7) O Srinivasa Acarya, successor to the six Gosvamis! Please be merciful to me. Narottama dasa always desires the company of Ramacandra Cakravarti.\n" +
                "\n";
        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
