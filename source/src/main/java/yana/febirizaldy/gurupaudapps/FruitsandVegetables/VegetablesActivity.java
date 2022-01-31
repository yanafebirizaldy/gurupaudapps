package yana.febirizaldy.gurupaudapps.FruitsandVegetables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class VegetablesActivity extends AppCompatActivity
{
    private TextToSpeech textToSpeech;
    private LinearLayout tomat, wortel, ketimun, kembangkol, kubis, bawang, paprikahijau, paprikamerah, paprikakuning, jagung, petai, lombokmerah, terong, kentang, selada, labu, lobakputih, lobakmerah;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        Toolbar toolbar = findViewById(R.id.vegetablesToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tomat = findViewById(R.id.tomat_id);
        wortel = findViewById(R.id.wortel_id);
        ketimun  = findViewById(R.id.ketimun_id);
        kembangkol = findViewById(R.id.kembangkol_id);
        kubis = findViewById(R.id.kubis_id);
        bawang = findViewById(R.id.bawang_id);
        paprikahijau = findViewById(R.id.paprikahijau_id);
        paprikamerah = findViewById(R.id.paprikamerah_id);
        paprikakuning = findViewById(R.id.paprikakuning_id);
        jagung = findViewById(R.id.jagung_id);
        petai = findViewById(R.id.petai_id);
        lombokmerah = findViewById(R.id.lombokmerah_id);
        terong = findViewById(R.id.terong_id);
        kentang = findViewById(R.id.kentang_id);
        selada = findViewById(R.id.selada_id);
        labu = findViewById(R.id.labu_id);
        lobakputih = findViewById(R.id.lobakputih_id);
        lobakmerah = findViewById(R.id.lobakmerah_id);

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    int langResult = textToSpeech.setLanguage(new Locale("id", "ID"));
                    if(langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA)
                    {
                        Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        tomat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("tomat");
                                return;
                            }
                        });
                        wortel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("wortel");
                                return;
                            }
                        });
                        ketimun.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("ketimun");
                                return;
                            }
                        });
                        kembangkol.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kembang kol");
                                return;
                            }
                        });
                        kubis.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kubis");
                                return;
                            }
                        });
                        bawang.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("bawang");
                                return;
                            }
                        });
                        paprikahijau.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("paprika hijau");
                                return;
                            }
                        });
                        paprikamerah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("paprika merah");
                                return;
                            }
                        });
                        paprikakuning.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("paprika kuning");
                                return;
                            }
                        });
                        jagung.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jagung");
                                return;
                            }
                        });
                        petai.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("petai");
                                return;
                            }
                        });
                        lombokmerah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("lombok merah");
                                return;
                            }
                        });
                        terong.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("terong");
                                return;
                            }
                        });
                        kentang.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kentang");
                                return;
                            }
                        });
                        selada.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("selada");
                                return;
                            }
                        });
                        labu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("labu");
                                return;
                            }
                        });
                        lobakputih.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("lobak putih");
                                return;
                            }
                        });
                        lobakmerah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("lobak merah");
                                return;
                            }
                        });

                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    void Baca(final String baca)
    {
        textToSpeech.speak(baca, TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
}
