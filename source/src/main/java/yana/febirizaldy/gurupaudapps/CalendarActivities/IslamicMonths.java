package yana.febirizaldy.gurupaudapps.CalendarActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class IslamicMonths extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private LinearLayout muharam, safar, rabiulawal, rabiulakhir, jumadilula, jumadilakhir, rajab, syakban, ramadhan, syawal, zulkaidah, zulhijjah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic_months);

        Toolbar toolbar = findViewById(R.id.islamicMonthsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        muharam = findViewById(R.id.muharam_id);
        safar = findViewById(R.id.safar_id);
        rabiulawal = findViewById(R.id.rabiulawal_id);
        rabiulakhir = findViewById(R.id.rabiulakhir_id);
        jumadilula = findViewById(R.id.jumadilula_id);
        jumadilakhir = findViewById(R.id.jumadilakhir_id);
        rajab = findViewById(R.id.rajab_id);
        syakban = findViewById(R.id.syakban_id);
        ramadhan = findViewById(R.id.ramadhan_id);
        syawal = findViewById(R.id.syawal_id);
        zulkaidah = findViewById(R.id.zulkaidah_id);
        zulhijjah = findViewById(R.id.zulhijjah_id);

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
                        muharam.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("muharam");
                                return;
                            }
                        });
                        safar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("safar");
                                return;
                            }
                        });
                        rabiulawal.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("rabiul awal");
                                return;
                            }
                        });
                        rabiulakhir.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("rabiul akhir");
                                return;
                            }
                        });
                        jumadilula.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jumadil ula");
                                return;
                            }
                        });
                        jumadilakhir.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jumadil akhir");
                                return;
                            }
                        });
                        rajab.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("rajab");
                                return;
                            }
                        });
                        syakban.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("syakban");
                                return;
                            }
                        });
                        ramadhan.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("ramadhan");
                                return;
                            }
                        });
                        syawal.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("syawal");
                                return;
                            }
                        });
                        zulkaidah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("zulkaidah");
                                return;
                            }
                        });
                        zulhijjah.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("zulhijjah");
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

