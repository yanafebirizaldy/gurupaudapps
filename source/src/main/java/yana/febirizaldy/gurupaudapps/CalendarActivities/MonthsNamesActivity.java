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

public class MonthsNamesActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private LinearLayout januari, februari, maret, april, mei, juni, juli, agustus, september, oktober, november, desember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_names);

        Toolbar toolbar = findViewById(R.id.monthsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        januari = findViewById(R.id.januari_id);
        februari = findViewById(R.id.februari_id);
        maret = findViewById(R.id.maret_id);
        april = findViewById(R.id.april_id);
        mei = findViewById(R.id.mei_id);
        juni = findViewById(R.id.juni_id);
        juli = findViewById(R.id.juli_id);
        agustus = findViewById(R.id.agustus_id);
        september = findViewById(R.id.september_id);
        oktober = findViewById(R.id.oktober_id);
        november = findViewById(R.id.november_id);
        desember = findViewById(R.id.desember_id);

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
                        januari.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("januari");
                                return;
                            }
                        });
                        februari.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("februari");
                                return;
                            }
                        });
                        maret.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("maret");
                                return;
                            }
                        });
                        april.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("april");
                                return;
                            }
                        });
                        mei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("mei");
                                return;
                            }
                        });
                        juni.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("juni");
                                return;
                            }
                        });
                        agustus.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("agustus");
                                return;
                            }
                        });
                        september.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("september");
                                return;
                            }
                        });
                        oktober.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("oktober");
                                return;
                            }
                        });
                        november.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("november");
                                return;
                            }
                        });
                        desember.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("desember");
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


