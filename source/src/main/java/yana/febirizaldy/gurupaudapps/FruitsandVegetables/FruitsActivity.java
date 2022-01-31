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

public class FruitsActivity extends AppCompatActivity
{
    private TextToSpeech textToSpeech;
    private LinearLayout apel, jeruk, pisang, jeruknipis, stroberi, nanas, mangga, delima, blackberry, aprikot, semangka, frambos, anggur, pir, ceri;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        Toolbar toolbar = findViewById(R.id.fruitsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        apel = findViewById(R.id.apel_id);
        jeruk = findViewById(R.id.jeruk_id);
        pisang = findViewById(R.id.pisang_id);
        jeruknipis = findViewById(R.id.jeruknipis_id);
        stroberi = findViewById(R.id.stroberi_id);
        nanas = findViewById(R.id.nanas_id);
        mangga = findViewById(R.id.mangga_id);
        delima = findViewById(R.id.delima_id);
        blackberry = findViewById(R.id.blackberry_id);
        aprikot = findViewById(R.id.aprikot_id);
        semangka = findViewById(R.id.semangka_id);
        frambos = findViewById(R.id.frambos_id);
        anggur = findViewById(R.id.anggur_id);
        pir = findViewById(R.id.pir_id);
        ceri = findViewById(R.id.ceri_id);

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
                        apel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("apel");
                                return;
                            }
                        });
                        jeruk.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jeruk");
                                return;
                            }
                        });
                        pisang.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("pisang");
                                return;
                            }
                        });
                        jeruknipis.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jeruk nipis");
                                return;
                            }
                        });
                        stroberi.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("stroberi");
                                return;
                            }
                        });
                        nanas.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("nanas");
                                return;
                            }
                        });
                        mangga.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("mangga");
                                return;
                            }
                        });
                        delima.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("delima");
                                return;
                            }
                        });
                        blackberry.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("blackberry");
                                return;
                            }
                        });
                        aprikot.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("aprikot");
                                return;
                            }
                        });
                        semangka.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("semangka");
                                return;
                            }
                        });
                        frambos.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("frambos");
                                return;
                            }
                        });
                        anggur.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("anggur");
                                return;
                            }
                        });
                        blackberry.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("blackberry");
                                return;
                            }
                        });
                        pir.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("pir");
                                return;
                            }
                        });
                        ceri.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("ceri");
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


