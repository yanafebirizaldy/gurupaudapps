package yana.febirizaldy.gurupaudapps.bunga;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import yana.febirizaldy.gurupaudapps.R;

public class Bunga extends AppCompatActivity {

    ImageView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunga);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button14);
        btn15 = findViewById(R.id.button15);
        btn16 = findViewById(R.id.button16);
        btn17 = findViewById(R.id.button17);

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
                                Baca("Bunga Adelweis");
                                return;
                            }
                        });
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Adenium");
                                return;
                            }
                        });
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Alamanda");
                                return;
                            }
                        });
                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Anggrek");
                                return;
                            }
                        });
                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Asoka");
                                return;
                            }
                        });
                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Bougenvil");
                                return;
                            }
                        });
                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Sepatu");
                                return;
                            }
                        });
                        btn7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Kemuning");
                                return;
                            }
                        });
                        btn8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Kenanga");
                                return;
                            }
                        });
                        btn9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Lavender");
                                return;
                            }
                        });
                        btn10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Lili");
                                return;
                            }
                        });
                        btn11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Matahari");
                                return;
                            }
                        });
                        btn12.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Mawar");
                                return;
                            }
                        });
                        btn13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Melati");
                                return;
                            }
                        });
                        btn14.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Pukul Empat");
                                return;
                            }
                        });
                        btn15.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Raflesia");
                                return;
                            }
                        });
                        btn16.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Teratai");
                                return;
                            }
                        });
                        btn17.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bunga Tulip");
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


