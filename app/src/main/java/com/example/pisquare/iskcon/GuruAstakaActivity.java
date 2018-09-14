package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class GuruAstakaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_astaka);


        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Guru Ashtaka"+
                "\n"+
                "\n"+
                "\n"+
                "Sri Sri Guru-ashtaka Eight Prayers to the Guru\n" +
                "by Srila Visvanatha Cakravarti Thakura\n" +
                "\n" +
                "\n" +
                "Srila Visvanatha Cakravarti Thakura, who appeared in the middle of the seventeenth century, is a great spiritual master in the Krishna conscious chain of gurus and disciples. He says, \"One who, with great care and attention, loudly recites this beautiful prayer to the spiritual master during the brahma-muhurta obtains direct service to Krishna, the Lord of Vrindavana, at the time of his death.\"\n" +
                "\n" +
                "(1)\n" +
                "samsara-davanala-lidha-loka\n" +
                "tranaya karunya-ghanaghanatvam\n" +
                "praptasya kalyana-gunarnavasya\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is receiving benediction from the ocean of mercy. Just as a cloud pours water on a forest fire to extinguish it, so the spiritual master delivers the materially afflicted world by extinguishing the blazing fire of material existence. I offer my respectful obeisances unto the lotus feet of such a spiritual master, who is an ocean of auspicious qualities.\n" +
                "\n" +
                "(2)\n" +
                "mahaprabhoh kirtana-nritya-gita\n" +
                "vaditra-madyan-manaso rasena\n" +
                "romanca -kampasru-taranga-bhajo\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "Chanting the holy name, dancing in ecstasy, singing, and playing musical instruments, the spiritual master is always gladdened by the sankirtana movement of Lord Caitanya Mahaprabhu. Because he is relishing the mellows of pure devotion within his mind, sometimes his hair stands on end, he feels quivering in his body, and tears flow from his eyes like waves. I offer my respectful obeisances unto the lotus feet of such a spiritual master.\n" +
                "\n" +
                "(3)\n" +
                "sri-vigraharadhana-nitya-nana\n" +
                "sringara-tan-mandira-marjanadau\n" +
                "yuktasya bhaktams ca niyunjato ’pi\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is always engaged in the temple worship of Sri Sri Radha and Krishna. He also engages his disciples in such worship. They dress the Deities in beautiful clothes and ornaments, clean Their temple, and perform other similar worship of the Lord. I offer my respectful obeisances unto the lotus feet of such a spiritual master.\n" +
                "\n" +
                "(4)\n" +
                "catur-vidha-sri-bhagavat-prasada\n" +
                "svadv-anna-triptan hari-bhakta-sanghan\n" +
                "kritvaiva triptim bhajatah sadaiva\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is always offering Krishna four kinds of delicious food [analyzed as that which is licked, chewed, drunk, and sucked]. When the spiritual master sees that the devotees are satisfied by eating bhagavat-prasada, he is satisfied. I offer my respectful obeisances unto the lotus feet of such a spiritual master.\n" +
                "\n" +
                "(5)\n" +
                "sri-radhika-madhavayor apara\n" +
                "madhurya-lila guna-rupa-namnam\n" +
                "prati-kshanasvadana-lolupasya\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is always eager to hear and chant about the unlimited conjugal pastimes of Radhika and Madhava, and Their qualities, names, and forms. The spiritual master aspires to relish these at every moment. I offer my respectful obeisances unto the lotus feet of such a spiritual master.\n" +
                "\n" +
                "(6)\n" +
                "nikunja-yuno rati-keli-siddhyai\n" +
                "ya yalibhir yuktir apekshaniya\n" +
                "tatrati-dakshyad ati-vallabhasya\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is very dear, because he is expert in assisting the gopis, who at different times make different tasteful arrangements for the perfection of Radha and Krishna’s conjugal loving affairs within the groves of Vrindavana. I offer my most humble obeisances unto the lotus feet of such a spiritual master.\n" +
                "\n" +
                "(7)\n" +
                "sakshad-dharitvena samasta-sastrair\n" +
                "uktas tatha bhavyata eva sadbhih\n" +
                "kintu prabhor yah priya eva tasya\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "The spiritual master is to be honored as much as the Supreme Lord, because he is the most confidential servitor of the Lord. This is acknowledged in all revealed scriptures and followed by all authorities. Therefore I offer my respectful obeisances unto the lotus feet of such a spiritual master, who is a bona fide representative of Sri Hari [Krishna].\n" +
                "\n" +
                "(8)\n" +
                "yasya prasadad bhagavat-prasado\n" +
                "yasyaprasadan na gatih kuto ’pi\n" +
                "dhyayan stuvams tasya yasas tri-sandhyam\n" +
                "vande guroh sri-caranaravindam\n" +
                "\n" +
                "\n" +
                "By the mercy of the spiritual master one receives the benediction of Krishna. Without the grace of the spiritual master, one cannot make any advancement. Therefore, I should always remember and praise the spiritual master. At least three times a day I should offer my respectful obeisances unto the lotus feet of my spiritual master.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
