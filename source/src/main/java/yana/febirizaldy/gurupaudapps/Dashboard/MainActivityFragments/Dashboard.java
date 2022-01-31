package yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.Animals.AnimalsActivity;
import yana.febirizaldy.gurupaudapps.CalendarActivities.DaysNamesActivity;
import yana.febirizaldy.gurupaudapps.CalendarActivities.IslamicMonths;
import yana.febirizaldy.gurupaudapps.CalendarActivities.MonthsNamesActivity;
import yana.febirizaldy.gurupaudapps.English_Category.EnglishActivity;
import yana.febirizaldy.gurupaudapps.FruitsandVegetables.FruitsActivity;
import yana.febirizaldy.gurupaudapps.FruitsandVegetables.VegetablesActivity;
import yana.febirizaldy.gurupaudapps.HumanBodyParts.PartsOfBodyActivity;
import yana.febirizaldy.gurupaudapps.Maths_Category.MathsDashboard;
import yana.febirizaldy.gurupaudapps.QuizMarks.QuizResultDashboard;
import yana.febirizaldy.gurupaudapps.R;
import yana.febirizaldy.gurupaudapps.Shapes.ShapesActivity;
import yana.febirizaldy.gurupaudapps.TimeClock.MainActivity;
import yana.febirizaldy.gurupaudapps.learncolors.ColorActivity;

public class Dashboard extends Fragment
{
    private TextToSpeech mTTS;

    View view;
    private LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, clock, warna;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        setHasOptionsMenu(true);
        toolbar = (Toolbar) view.findViewById(R.id.dashboard_toolbar_Id);
        toolbar.setTitle("Pengenalan Dasar");

        english = view.findViewById(R.id.englishActivityLayoutID);
        maths = view.findViewById(R.id.mathActivityLayoutID);
        animals = view.findViewById(R.id.animalsActivityLayoutID);
        fruits = view.findViewById(R.id.fruitsActivityLayoutID);
        vegetables = view.findViewById(R.id.vegetablesActivityLayoutID);
        shapes = view.findViewById(R.id.shapesActivityLayoutID);
        bodyparts = view.findViewById(R.id.partsOfBodyActivityLayoutID);
        days = view.findViewById(R.id.daysActivityLayoutID);
        months = view.findViewById(R.id.monthsActivityLayoutID);
        islamicMonths = view.findViewById(R.id.islamicMonthsActivityLayoutID);

        clock = view.findViewById(R.id.clockActivityLayoutID);
        warna = view.findViewById(R.id.colorActivityLayoutID);

        mTTS = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    //int langResult = mTTS.setLanguage(Locale.US);
                    int langResult = mTTS.setLanguage(new Locale("id", "ID"));
                    if(langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA)
                    {
                        Toast.makeText(getContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        english.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakEnglishAlphabets();
                                startActivity(new Intent(getContext(), EnglishActivity.class));
                                return;
                            }
                        });
                        maths.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakMaths();
                                startActivity(new Intent(getContext(), MathsDashboard.class));
                                return;
                            }
                        });
                        animals.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakAnimals();
                                startActivity(new Intent(getContext(), AnimalsActivity.class));
                                return;
                            }
                        });

                        fruits.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakFruits();
                                startActivity(new Intent(getContext(), FruitsActivity.class));
                                return;
                            }
                        });
                        vegetables.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakVegetables();
                                startActivity(new Intent(getContext(), VegetablesActivity.class));
                                return;
                            }
                        });
                        bodyparts.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakBodyParts();
                                startActivity(new Intent(getContext(), PartsOfBodyActivity.class));
                                return;
                            }
                        });
                        clock.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakClock();
                                startActivity(new Intent(getContext(), MainActivity.class));
                                return;
                            }
                        });
                        warna.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakColor();
                                startActivity(new Intent(getContext(), ColorActivity.class));
                                return;
                            }
                        });
                        shapes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakShapes();
                                startActivity(new Intent(getContext(), ShapesActivity.class));
                                return;
                            }
                        });
                        days.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakDays();
                                startActivity(new Intent(getContext(), DaysNamesActivity.class));
                                return;
                            }
                        });
                        months.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakMonths();
                                startActivity(new Intent(getContext(), MonthsNamesActivity.class));
                                return;
                            }
                        });
                        islamicMonths.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakIslamicMonths();
                                startActivity(new Intent(getContext(), IslamicMonths.class));
                                return;
                            }
                        });

                    }
                }
                else
                {
                    Toast.makeText(getContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    public void speakEnglishAlphabets()
    {
        mTTS.speak("Belajar Membaca dan Menulis", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakClock()
    {
        mTTS.speak("Belajar Membaca Jam", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakColor()
    {
        mTTS.speak("Belajar Bermacam macam warna", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakMaths()
    {
        mTTS.speak("Belajar Berhitung", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakAnimals()
    {
        mTTS.speak("Belajar Mengenal Binatang", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakFruits()
    {
        mTTS.speak("Belajar Mengenal Buah", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakVegetables()
    {
        mTTS.speak("Belajar Mengenal Sayuran", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakBodyParts()
    {
        mTTS.speak("Belajar Bagian Bagian Tubuh Manusia", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakShapes()
    {
        mTTS.speak("Belajar Mengenal Bentuk", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakDays()
    {
        mTTS.speak("Belajar Nama Nama Hari", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakMonths()
    {
        mTTS.speak("Belajar Nama Nama Bulan", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.5f);
    }
    public void speakIslamicMonths()
    {
        mTTS.speak("Belajar Nama Nama Bulan Islam", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }
    public void speakQuiz()
    {
        mTTS.speak("Quiz", TextToSpeech.QUEUE_FLUSH, null);
        mTTS.setSpeechRate(1.0f);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_quizResult:
                startActivity(new Intent(getActivity(), QuizResultDashboard.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
