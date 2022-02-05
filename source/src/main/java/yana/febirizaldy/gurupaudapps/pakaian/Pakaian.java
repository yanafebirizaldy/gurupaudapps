package yana.febirizaldy.gurupaudapps.pakaian;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import yana.febirizaldy.gurupaudapps.Maths_Category.MathsDashboard;
import yana.febirizaldy.gurupaudapps.R;

public class Pakaian extends AppCompatActivity {

    ImageView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);

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
                        btn0.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Baju");
                                return;
                            }
                        });
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Celana");
                                return;
                            }
                        });
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Sepatu");
                                return;
                            }
                        });
                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Tas");
                                return;
                            }
                        });
                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Dasi");
                                return;
                            }
                        });
                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Topi");
                                return;
                            }
                        });
                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Kacamata");
                                return;
                            }
                        });
                        btn7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Jam");
                                return;
                            }
                        });
                        btn8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Cincin");
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

    public void LaunchDashboard(View view)
    {
        //startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
        this.finish();
    }
}


