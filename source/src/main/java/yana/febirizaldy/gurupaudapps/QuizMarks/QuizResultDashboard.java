package yana.febirizaldy.gurupaudapps.QuizMarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import yana.febirizaldy.gurupaudapps.R;

public class QuizResultDashboard extends AppCompatActivity {

    private LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, habits;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result_dashboard);

        toolbar = (Toolbar) findViewById(R.id.quizlist_toolbar_Id);
        toolbar.setTitle("Quiz Result");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        english = findViewById(R.id.englishmarksActivityLayoutID);
        maths = findViewById(R.id.mathmarksActivityLayoutID);
        animals = findViewById(R.id.animalsmarksActivityLayoutID);
        fruits = findViewById(R.id.fruitsmarksActivityLayoutID);
        vegetables = findViewById(R.id.vegetablesmarksActivityLayoutID);
        shapes = findViewById(R.id.shapesmarksActivityLayoutID);
        bodyparts = findViewById(R.id.partsOfBodymarksActivityLayoutID);
        days = findViewById(R.id.daysmarksActivityLayoutID);
        months = findViewById(R.id.monthsmarksActivityLayoutID);
        islamicMonths = findViewById(R.id.islamicMonthsmarksActivityLayoutID);
        habits = findViewById(R.id.habitsmarksActivityLayoutID);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        bodyparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        islamicMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        habits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
    }
}
