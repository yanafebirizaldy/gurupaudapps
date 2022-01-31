package yana.febirizaldy.gurupaudapps.Shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class ShapesActivity extends AppCompatActivity
{
    private TextToSpeech textToSpeech;
    private LinearLayout square, rectangle, triangle, circle, oval, heart, star, crescent, cross;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        Toolbar toolbar = findViewById(R.id.shapesToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        square = findViewById(R.id.squareshape_id);
        rectangle = findViewById(R.id.rectangleshape_id);
        triangle = findViewById(R.id.trianlgeshape_id);
        circle = findViewById(R.id.circleshape_id);
        oval = findViewById(R.id.ovalshape_id);
        heart = findViewById(R.id.heartshape_id);
        star = findViewById(R.id.starshape_id);
        crescent = findViewById(R.id.cresentshape_id);
        cross = findViewById(R.id.crossshape_id);

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
                        square.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bujur Sangkar");
                                return;
                            }
                        });
                        rectangle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Persegi Panjang");
                                return;
                            }
                        });
                        triangle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Segitiga");
                                return;
                            }
                        });
                        circle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Lingkaran");
                                return;
                            }
                        });
                        oval.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Lonjong");
                                return;
                            }
                        });
                        heart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Hati");
                                return;
                            }
                        });
                        star.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bintang");
                                return;
                            }
                        });
                        crescent.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Bulan Sabit");
                                return;
                            }
                        });
                        cross.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Baca("Salib");
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
