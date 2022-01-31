package yana.febirizaldy.gurupaudapps.Maths_Category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.Dashboard.MainActivity;
import yana.febirizaldy.gurupaudapps.Maths_Category.Addition.MathAddition;
import yana.febirizaldy.gurupaudapps.Maths_Category.Counting.MathCounting;
import yana.febirizaldy.gurupaudapps.Maths_Category.Subtraction.MathSubtraction;
import yana.febirizaldy.gurupaudapps.Maths_Category.Tables.MathTables;
import yana.febirizaldy.gurupaudapps.R;

public class MathsDashboard extends AppCompatActivity
{
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_dashboard);
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

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void GoToCounting(View view)
    {
        Baca("Belajar Angka");
        startActivity(new Intent(getApplicationContext(), MathCounting.class));
    }

    public void GoToTables(View view)
    {
        Baca("Belajar Perkalian");
        startActivity(new Intent(getApplicationContext(), MathTables.class));
    }

    public void GoToSubtract(View view)
    {
        Baca("Belajar Pengurangan");
        startActivity(new Intent(getApplicationContext(), MathSubtraction.class));
    }

    public void GoToAddition(View view)
    {
        Baca("Belajar Penjumlahan");
        startActivity(new Intent(getApplicationContext(), MathAddition.class));
    }
}
