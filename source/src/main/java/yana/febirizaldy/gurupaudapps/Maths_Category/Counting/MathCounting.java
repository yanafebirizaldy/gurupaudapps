package yana.febirizaldy.gurupaudapps.Maths_Category.Counting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.Maths_Category.MathsDashboard;
import yana.febirizaldy.gurupaudapps.R;

public class MathCounting extends AppCompatActivity
{
    private ImageView voiceBtn, AlphabetImage;
    private TextView alphabetLetter, alphabetName;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_counting);

        voiceBtn = (ImageView) findViewById(R.id.voicePlay_btnID);
        AlphabetImage = (ImageView) findViewById(R.id.alphabetImage_ID);
        alphabetLetter = (TextView) findViewById(R.id.alphabet_TxtId);
        alphabetName = (TextView) findViewById(R.id.alphabetName_TxtId);

        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("Satu");
                return;
            }
        });

    }

    void Baca(final String baca) {

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int langResult = textToSpeech.setLanguage(new Locale("id", "ID"));
                    // Locale.setDefault(new Locale("id"));
                    if (langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA) {
                        Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    } else {
                        textToSpeech.speak(baca, TextToSpeech.QUEUE_FLUSH, null);
                        textToSpeech.setSpeechRate(1.0f);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }

    public void EnglishAlphabetAct_1(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_one);
        alphabetLetter.setText("1");
        alphabetName.setText("Satu");

        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("satu");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_2(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_two);
        alphabetLetter.setText("2");
        alphabetName.setText("Dua");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("dua");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_3(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_three);
        alphabetLetter.setText("3");
        alphabetName.setText("Tiga");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("Tiga");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_4(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_four);
        alphabetLetter.setText("4");
        alphabetName.setText("Empat");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("empat");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_5(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_five);
        alphabetLetter.setText("5");
        alphabetName.setText("Lima");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("lima");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_6(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_six);
        alphabetLetter.setText("6");
        alphabetName.setText("Enam");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("enam");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_7(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_seven);
        alphabetLetter.setText("7");
        alphabetName.setText("Tujuh");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("tujuh");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_8(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_eight);
        alphabetLetter.setText("8");
        alphabetName.setText("Delapan");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("delapan");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_9(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_nine);
        alphabetLetter.setText("9");
        alphabetName.setText("Sembilan");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("sembilan");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_10(View view) {
        AlphabetImage.setImageResource(R.drawable.ic_ten);
        alphabetLetter.setText("10");
        alphabetName.setText("Sepuluh");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("sepuluh");
                return;
            }
        });
    }

}
