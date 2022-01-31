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

public class DaysNamesActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private LinearLayout senin, selasa, rabu, kamis, jumat, sabtu, minggu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_names);

        Toolbar toolbar = findViewById(R.id.daysToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        senin = findViewById(R.id.senin_id);
        selasa = findViewById(R.id.selasa_id);
        rabu = findViewById(R.id.rabu_id);
        kamis = findViewById(R.id.kamis_id);
        jumat = findViewById(R.id.jumat_id);
        sabtu = findViewById(R.id.sabtu_id);
        minggu = findViewById(R.id.minggu_id);

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
                        senin.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("senin");
                                return;
                            }
                        });
                        selasa.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("selasa");
                                return;
                            }
                        });
                        rabu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("rabu");
                                return;
                            }
                        });
                        kamis.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("kamis");
                                return;
                            }
                        });
                        jumat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("jum'at");
                                return;
                            }
                        });
                        sabtu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("sabtu");
                                return;
                            }
                        });
                        minggu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("minggu");
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


