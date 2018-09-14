package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class SriVenkateshaActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sri_venkatesha);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Venkatesa Stotram\n" +
                "\n\n" +
               "Kamalaakucha choochuka kumkumato\n" +
                "niyataa runitaa tulaneelatano\n" +
                "kamalaayata lochana lokapate\n" +
                "vijayeebhava venkata shailapate ||     (1)\n" +
                "\n" +
                "Lotus like breasts of Lord are ever red with the colour of kumkum that is being sprinkled on his chest during daily worships, whereas his body is blue coloured. Victory to Thee, O Lord of Venkata hill, whose eyes are wide like lotus petals.\n" +
                "\n" +
                "\n" +
                "Sachaturmukha, shanmukha, panchamukha\n" +
                "pramukhaakila daivata moulimane\n" +
                "sharanaagata vatsala saaranidhe\n" +
                "paripaalayamaam vrisha shailapate ||  (2)\n" +
                "\n" +
                "Including the four-faced Brahma, six-faced Kumaraswamy (Subrahmanya swami) and five-faced Hanuman, you are the greatest crown jewel among all angels. You are the abode of kindness to those who submit themselves at your feet. O Lord of Vrisha hill, save me.\n" +
                "\n" +
                "\n" +
                "Ativelatayaa tava durvishahai\n" +
                "anuvela kritair aparaadha shatai\n" +
                "bharitam tvaritam vrisha shailapate\n" +
                "parayaa krupayaa paripaahi hare ||    (3)\n" +
                "\n" +
                "Extremely trembling on being committed various sins and hundreds of wrong deeds, I came running speedily to submit myself at your feet. O Lord of Vrisha hill, shower mercy on me.\n" +
                "\n" +
                "\n" +
                "Adhivenkata shaila mudaaramate\n" +
                "janataabhi mataadhika daanarataat\n" +
                "para devatayaa gaditaannigamai\n" +
                "kamalaa dayitaanna param kalaye ||   (4)\n" +
                "\n" +
                "O bounteous Lord of Venkata hill, who gives away always more than your devotees desire, all the other  angels (gods) salute to you, and none is equal to you.     \n" +
                "\n" +
                "\n" +
                "Kalavenuravaa vasha gopa vadhoo\n" +
                "shatakoti vrutaatsmarakoti samaat\n" +
                "prativallavi kaabhi mataatsukhadaat\n" +
                "vasudeva sutaa nnaparam kalaye ||    (5)\n" +
                "\n" +
                "With an enchanting music from your flute, you attracted the gopis and bestowed each one of them with their desired happiness that is equal to that obtained from hundred crore penances or crores of prayers. O Son of Vasudeva, none is equal to you.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Abhiraama gunaakara daasharathe\n" +
                "jagadeka dhanurdhara dheera mate\n" +
                "Raghunaayaka raama ramesha vibho\n" +
                "varadobhava deva dayaajaladhe ||     (6) \n" +
                "\n" +
                "You have been the lovely and virtuous son of Dasharatha, the only courageous and great archer of entire world, the chief of Raghukula, the pleasing and entertaining Lord. Please grant boon to me, O Lord and ocean of mercy.       \n" +
                "\n" +
                "\n" +
                "Avanee tanayaa kamaneeyakaram\n" +
                "rajaneekara chaaru mukhaamburuham\n" +
                "rajaneechara raaja tamomihiram\n" +
                "mahaneeya maham raghuraama maye || (7)\n" +
                "\n" +
                "Your pretty hands are held by daughter of Earth, Sita and you are beautiful with your lotus-like face resembling moon. You are the king dispelling darkness by walking in nights. Grant me refuge O Rama of Raghu clan.        \n" +
                "\n" +
                "\n" +
                "Sumukham suhrudam sulabham sukhadam\n" +
                "svanujam cha sukhaaya mamogha sharam\n" +
                "apahaaya raghoodvaha manyamaham\n" +
                "na kathancha na kanchana jaatu bhaje || (8)\n" +
                "\n" +
                "You are pleasant faced, good hearted, easily reachable and provider of happiness; along with your brothers and with a never ending flow of arrows. So, I never pray anyone else even for a while except you, O Rama.\n" +
                "\n" +
                "                                                                                                                                                  Vinaa venkatesam nanaadho nanaadha:\n" +
                "sadaa venkatesam smaraami smaraami\n" +
                "hare venkatesa praseeda praseeda\n" +
                "priyam venkatesa prayachcha prayachcha || (9) \n" +
                "\n" +
                "Without you, O Venkateshwara, I am an orphan. I always keep remembering your name. O Venkatesa be pleased with me, bestow me with your love and grace.\n" +
                "\n" +
                "\n" +
                "Aham doorataste padaambhoja yugma\n" +
                "pranaamechcha yaagatya sevaam karomi\n" +
                "sakrutsevayaa nitya sevaa phalam tvam\n" +
                "prayachcha prayachcha prabho venkatesa || (10)\n" +
                "\n" +
                "I have been far away from your lotus like feet and have come now with a wish to serve the feet; so, Lord Venkatesha, I request you again and again to please allow me the benefit of performing a good service to you.\n" +
                "\n" +
                "\n" +
                "Ajnaaninaa mayaa doshaa naseshaan vihitaan hare:\n" +
                "kshamasva tvam kshamasva tvam sesha saila shikhaamane || (11) \n" +
                "\n" +
                "The sins committed by me are all simply due to sheer ignorance of mine; so kindly please pardon me, pardon me, O jewel of Sesha saila mountain.\n\n";

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
