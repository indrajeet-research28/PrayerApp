package com.example.pisquare.iskcon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.widget.TextView;

public class NkavacaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nkavaca);

        textView = (TextView) findViewById(R.id.txt1);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
        tv1.setTypeface(tv1.getTypeface(), Typeface.BOLD);

        String par="\n\nSri Narasimha Kavacha Mantra\n" +
                "\n\n" +
                "narasimha-kavacham vakshye\n" +
                "prahladenoditam pura\n" +
                "sarva-raksha-karam punyam\n" +
                "sarvopadrava-nashanam\n" +
                "\n" +
                "I shall now recite the Narasimha-kavaca, formerly spoken by Prahlada Maharaja. It is most pious, vanquishes all kinds of impediments, and provides one all protection."
                +"\n\n\n" +
                "sarva-sampat-karam chaiva\n" +
                "svarga-moksha-pradayakam\n" +
                "dhyatva narasimham devesham\n" +
                "hema-simhasana-sthitam\n" +
                "\n"+
                "It bestows upon one all opulences and can give one elevation to the heavenly planets or liberation. One should meditate on Lord Narasimha, Lord of the Demigods, seated upon a golden throne."
                +"\n\n\n" +
                "vivrtasyam tri-nayanam\n" +
                "sharad-indu-sama-prabham\n" +
                "lakshmyalingita-vamangam\n" +
                "vibhutibhir upashritam\n" +
                "\n" +
                "His mouth is wide open, He has three eyes, and He is as radiant as the autumn moon. He is embraced by Lakshmidevi on his left side, and His form is the shelter of all opulences, both material and spiritual."
                +"\n\n\n" +
                "catur-bhujam komalangam\n" +
                "svarna-kundala-shobhitam\n" +
                "saroja-shobitoraskam\n" +
                "ratna-keyura-mudritam\n" +
                "\n"+
                "The Lord has four arms, and His limbs are very soft. He is decorated with golden earrings. His chest is resplendent like the lotus flower, and His arms are decorated with jewel-studded ornaments."
                +"\n\n\n" +
                "tapta-kancana-sankasham\n" +
                "pita-nirmala-vasasam\n" +
                "indradi-sura-maulishthah\n" +
                "sphuran manikya-diptibhih\n" +
                "\n"+
                "He is dressed in a spotless yellow garment, which exactly resembles molten gold. He is the original cause of existence, beyond the mundane sphere, for the great demigods headed by Indra. He appears bedecked with rubies which are blazingly effulgent."
                +"\n\n\n" +
                "virajita-pada-dvandvam\n" +
                "shankha-chakradi-hetibhih\n" +
                "garutmata cha vinayat\n" +
                "stuyamanam mudanvitam\n" +
                "\n"+
                "His two feet are very attractive, and He is armed with various weapons such as the conch, disc, etc. Garuda joyfully offers prayers with great reverence."
                +"\n\n\n" +
                "sva-hrt-kamala-samvasam\n" +
                "krtva tu kavacham pathet\n"+
                "nrsimho me shirah patu\n" +
                "loka-rakshartha-sambhavah\n" +
                "\n"+
                "Having seated Lord Narasimhadeva upon the lotus of one's heart, one should recite the following mantra: May Lord Narasimha, who protects all the planetary systems, protect my head."
                +"\n\n\n" +
                "sarvago ’pi stambha-vasah\n" +
                "phalam me rakshatu dhvanim\n" +
                "nrsimho me drshau patu\n" +
                "soma-suryagni-lochanah\n" +
                "\n" +
                "Although the Lord is all-pervading, He hid Himself within a pillar. May He protect my speech and the results of my activities. May Lord Narasimha, whose eyes are the sun, and fire, protect my eyes."
                +"\n\n\n" +
                "smrtam me patu naraharih\n" +
                "muni-varya-stuti-priyah\n" +
                "nasam me simha-nashas tu\n" +
                "mukham lakshmi-mukha-priyah\n" +
                "\n"+
                "May Lord Nrhari, who is pleased by the prayers offered by the best of sages, protect my memory. May He who has the nose of a lion protect my nose, and may He whose face is very dear to the goddess of fortune protect my mouth."
                +"\n\n\n" +
                "sarva-vidyadhipah patu\n" +
                "nrsimho rasanam mama\n" +
                "vaktram patv indu-vadanam\n" +
                "sada prahlada-vanditah\n" +
                "\n"+
                "May Lord Narasimha, who is the knower of all sciences, protect my sense of taste. May He whose face is beautiful as the full moon and who is offered prayers by Prahlada Maharaja protect my face."
                +"\n\n\n" +
                "narasimhah patu me kantham\n" +
                "skandhau bhu-bhrd ananta-krt\n" +
                "divyastra-shobhita-bhujah\n" +
                "narasimhah patu me bhujau\n" +
                "\n" +
                "May Lord Narasimha protect my throat. He is the sustainer of the earth and the performer of unlimitedly wonderful activities. May He protect my shoulders. His arms are resplendent with transcendental weapons. May He protect my shoulders."
                +"\n\n\n" +
                "karau me deva-varado\n" +
                "narasimhah patu sarvatah\n" +
                "hrdayam yogi-sadhyash cha\n" +
                "nivasam patu me harih\n" +
                "\n" +
                "May the Lord, who bestows benedictions upon the demigods, protect my hands, and may He protect me from all sides. May He who is achieved by the perfect yogis protect my heart, and may Lord Hari protect my dwelling place."
                +"\n\n\n" +
                "madhyam patu hiranyaksha-\n" +
                "vakshah-kukshi-vidaranah\n" +
                "nabhim me patu naraharih\n" +
                "sva-nabhi-brahma-samstutah\n" +
                "\n"+
                "May He who ripped apart the chest and abdomen of the great demon Hiranyaksha protect my waist, and may Lord Nrhari protect my navel. He is offered prayers by Lord Brahma, who has sprung from his own navel."
                +"\n\n\n" +
                "brahmanda-kotayah katyam\n" +
                "yasyasau patu me katim\n" +
                "guhyam me patu guhyanam\n" +
                "mantranam guhya-rupa-dhrk\n" +
                "\n" +
                "May He on whose hips rest all the universes protect my hips. May the Lord protect my private parts. He is the knower of all mantras and all mysteries, but He Himself is not visible."
                +"\n\n\n" +
                "uru manobhavah patu\n" +
                "januni nara-rupa-drk\n" +
                "janghe patu dhara-bhara-\n" +
                "harta yo ’sau nr-keshari\n" +
                "\n" +
                "May He who is the original Cupid protect my thighs. May He who exhibits a human-like form protect my knees. May the remover of the burden of the earth, who appears in a form which is half-man and half-lion, protect my calves."
                +"\n\n\n" +
                "sura-rajya-pradah patu\n" +
                "padau me nrharishvarah\n" +
                "sahasra-shirsha-purushah\n" +
                "patu me sarvashas tanum\n" +
                "\n" +
                "May the bestower of heavenly opulence protect my feet. He is the Supreme Controller in the form of a man and lion combined. May the thousand-headed Supreme enjoyer protect my body from all sides and in all respects."
                +"\n\n\n" +
                "manograh purvatah patu\n" +
                "maha-viragrajo ’gnitah\n" +
                "maha-vishnur dakshine tu\n" +
                "maha-jvalas tu nairrtah\n" +
                "\n" +
                "May that most ferocious personality protect me from the east. May He who is superior to the greatest heroes protect me from the southeast, which is presided over by Agni. May the Supreme Vishnu protect me from the south, and may that person of blazing luster protect me from the southwest."
                +"\n\n\n" +
                "pashchime patu sarvesho\n" +
                "dishi me sarvatomukhah\n" +
                "narasimhah patu vayavyam\n" +
                "saumyam bhushana-vigrahah\n" +
                "\n" +
                "May the Lord of everything protect me from the west. His faces are everywhere, so please may He protect me from this direction. May Lord Narasimha protect me from the northwest, which is predominated by Vayu, and may He whose form is in itself the supreme ornament protect me from the north, where Soma resides."
                +"\n\n\n" +
                "ishanyam patu bhadro me\n" +
                "sarva-mangala-dayakah\n" +
                "samsara-bhayatah patu\n" +
                "mrtyor mrtyur nr-keshari\n" +
                "\n" +
                "May the all-auspicious Lord, who Himself bestows all-auspiciousness, protect from the northeast, the direction of the sun-god, and may He who is death personified protect me from fear of death and rotation in this material world."
                +"\n\n\n" +
                "idam narasimha-kavacham\n" +
                "prahlada-mukha-manditam\n" +
                "bhaktiman yah pathenaityam\n" +
                "sarva-papaih pramucyate\n" +
                "\n" +
                "This Narasimha-kavaca has been ornamented by issuing from the mouth of Prahlada Maharaja. A devotee who reads this becomes freed from all sins."
                +"\n\n\n" +
                "putravan dhanavan loke\n" +
                "dirghayur upajayate\n" +
                "yam yam kamayate kamam\n" +
                "tam tam prapnoty asamshayam\n" +
                "\n" +
                "Whatever one desires in this world he can attain without doubt. One can have wealth, many sons, and a long life."
                +"\n\n\n" +
                "sarvatra jayam apnoti\n" +
                "sarvatra vijayi bhavet\n" +
                "bhumy antariksha-divyanam\n" +
                "grahanam vinivaranam\n" +
                "\n" +
                "He becomes victorious who desires victory, and indeed becomes a conqueror. He wards off the influence of all planets, earthly, heavenly, and everything in between."
                +"\n\n\n" +
                "vrshchikoraga-sambhuta-\n" +
                "vishapaharanam param\n" +
                "brahma-rakshasa-yakshanam\n" +
                "durotsarana-karanam\n" +
                "\n" +
                "This is the supreme remedy for the poisonous effects of serpents and scorpions, and Brahma-rakshasa ghosts and Yakshas are driven away."
                +"\n\n\n" +
                "bhuje va tala-patre va\n" +
                "kavacam likhitam shubham\n" +
                "kara-mule dhrtam yena\n" +
                "sidhyeyuh karma-siddhayah\n" +
                "\n" +
                "One may write this most auspicious prayer on his arm, or inscribe it on a palm-leaf and attach it to his wrist, and all his activities will become perfect."
                +"\n\n\n" +
                "devasura-manushyeshu\n" +
                "svam svam eva jayam labhet\n" +
                "eka-sandhyam tri-sandhyam va\n" +
                "yah pathen niyato narah\n" +
                "\n" +
                "One who regularly chants this prayer, whether once or thrice (daily), he becomes victorious whether among demigods, demons, or human beings."
                +"\n\n\n" +
                "sarva-mangala-mangalyam\n" +
                "bhuktim muktim cha vindati\n" +
                "dva-trimshati-sahasrani\n" +
                "pathet shuddhatmanam nrnam\n" +
                "\n" +
                "One who with purified heart recites this prayer 32,000 times attains the most auspicious of all auspicious things, and material enjoyment and liberation are already understood to be available to such a person."
                +"\n\n\n" +
                "kavachasyasya mantrasya\n" +
                "mantra-siddhih prajayate\n" +
                "anena mantra-rajena\n" +
                "krtva bhasmabhir mantranam\n" +
                "\n" +
                "This Kavaca-mantra is the king of all mantras. One attains by it what would be attained by anointing oneself with ashes and chanting all other mantras."
                +"\n\n\n" +
                "tilakam bibhriyad yas tu\n" +
                "tasya graha-bhayam haret\n" +
                "tri-varam japamanas tu\n" +
                "dattam varyabhimantrya ca\n" +
                "\n" +
                "Having marked ones body with tilaka, taking acamana with water, and reciting this mantra three times, one will find that the fear of all inauspicious planets is removed."
                +"\n\n\n" +
                "prasayed yo naro mantram\n" +
                "narasimha-dhyanam acharet\n" +
                "tasya rogah pranashyanti\n" +
                "ye cha syuh kukshi-sambhavah\n"+
                "\n"+
                "That Person who recites this mantra, meditating upon Lord Narasimhadeva, has all of his diseases vanquished, including those of the abdomen. "
                +"\n\n\n" +
                "kimatra bahunoketena nrsimha sadro bhvet\n" +
                "manasa cintitam yattu sa taccapnotya\n" +
                "samsayam\n"+
                "\n"+
                "Why Should more be Said? One acquires qualitative oneness with Narasimha himself. There is no doubt that the desires in the mind of one who meditates will be granted."
                +"\n\n\n"+
                "garjantam garjayantam nija-bhuja-patalam sphotayantam hatantam\n" +
                "dipyantam tapayantam divi bhuvi ditijam kshepayantam kshipantam\n" +
                "krandantam roshayantam dishi dishi satatam samharantam bharantam\n" +
                "vikshantam purnayantam kara-nikara-shatair divya-simham namami\n" +
                "\n" +
                "Lord Narasimha roars loudly and causes others to roar. With His multitudes of arms He tears the demons asunder and kills them in this way. He is always seeking out and tormenting the demoniac descendants of Diti, both on this earth planet and in the higher planets, and He throws them down and scatters them. He cries with great anger as He destroys the demons in all directions, yet with His unlimited hands He sustains, protects, and nourishes the cosmic manifestation. I offer my respectful obeisances to the Lord, who has assumed the form of a transcendental lion.\n" +
                "\n" +
                "iti shri-brahmanda-purane prahladoktam shri-narasimha-kavacam sampurnam\n" +
                "\n" +
                "Thus ends the Narasimha-kavaca as it is described by Prahlada Maharaja in the Brahmanda Purana.\n" +
                "\n\n"
                ;

        textView.setText(par);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
