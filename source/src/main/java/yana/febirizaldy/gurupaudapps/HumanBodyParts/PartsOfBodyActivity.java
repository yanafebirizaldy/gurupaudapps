package yana.febirizaldy.gurupaudapps.HumanBodyParts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class PartsOfBodyActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private LinearLayout telinga, hidung, mata, tangan, mulut, kepala, punggung, dada, leher, jari, lengan, kakibawah, kaki, perut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_of_body);

        Toolbar toolbar = findViewById(R.id.bodyPartsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        telinga = findViewById(R.id.telinga_id);
        hidung = findViewById(R.id.hidung_id);
        mata = findViewById(R.id.mata_id);
        tangan = findViewById(R.id.tangan_id);
        mulut = findViewById(R.id.mulut_id);
        kepala = findViewById(R.id.kepala_id);
        punggung = findViewById(R.id.punggung_id);
        dada = findViewById(R.id.dada_id);
        leher = findViewById(R.id.leher_id);
        jari = findViewById(R.id.jari_id);
        lengan = findViewById(R.id.lengan_id);
        kakibawah = findViewById(R.id.kakibawah_id);
        kaki = findViewById(R.id.kaki_id);
        perut = findViewById(R.id.perut_id);

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
                        telinga.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("telinga");
                                return;
                            }
                        });
                        hidung.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("hidung");
                                return;
                            }
                        });
                        mata.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("mata");
                                return;
                            }
                        });
                        tangan.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("tangan");
                                return;
                            }
                        });
                        mulut.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("mulut");
                                return;
                            }
                        });
                        kepala.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kepala");
                                return;
                            }
                        });
                        punggung.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("punggung");
                                return;
                            }
                        });
                        dada.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("dada");
                                return;
                            }
                        });
                        leher.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("leher");
                                return;
                            }
                        });
                        jari.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jari");
                                return;
                            }
                        });
                        lengan.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("lengan");
                                return;
                            }
                        });
                        kakibawah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kaki bawah");
                                return;
                            }
                        });
                        kaki.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kaki");
                                return;
                            }
                        });
                        perut.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("perut");
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


