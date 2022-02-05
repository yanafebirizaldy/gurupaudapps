package yana.febirizaldy.gurupaudapps.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.Dashboard.MainActivity;
import yana.febirizaldy.gurupaudapps.R;

public class EnglishActivity extends AppCompatActivity
{
    private TextToSpeech textToSpeech;
    private ImageView alphbatesBtn, traceLettersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        alphbatesBtn = (ImageView) findViewById(R.id.alphabets_image_ID);
        traceLettersBtn = (ImageView) findViewById(R.id.traceletters_image_ID);

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int langResult = textToSpeech.setLanguage(new Locale("id","ID"));
                   // Locale.setDefault(new Locale("id"));
                    if (langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA) {
                        Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    }
                    else
                     {
                        alphbatesBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view)
                            {
                                speakAlphabets();
                                startActivity(new Intent(getApplicationContext(), EnglishAlphabets_Activity.class));
                                return;
                            }
                        });

                        traceLettersBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view)
                            {
                                speakLetterTracing();
                                startActivity(new Intent(getApplicationContext(), TraceLetters_Activity.class));
                                return;
                            }
                        });
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void speakAlphabets()
    {
        textToSpeech.speak("Belajar Membaca", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.0f);
    }
    private void speakLetterTracing()
    {
        textToSpeech.speak("Belajar Menulis", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.0f);
    }

    public void LaunchDashboard(View view)
    {
        //startActivity(new Intent(getApplicationContext(), MainActivity.class));
        this.finish();
    }
}
