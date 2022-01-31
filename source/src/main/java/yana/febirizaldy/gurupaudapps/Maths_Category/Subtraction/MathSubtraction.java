package yana.febirizaldy.gurupaudapps.Maths_Category.Subtraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import yana.febirizaldy.gurupaudapps.Maths_Category.MathsDashboard;
import yana.febirizaldy.gurupaudapps.R;

public class MathSubtraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_subtraction);
    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }
}
