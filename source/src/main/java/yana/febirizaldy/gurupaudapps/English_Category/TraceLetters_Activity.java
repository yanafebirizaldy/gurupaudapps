package yana.febirizaldy.gurupaudapps.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import yana.febirizaldy.gurupaudapps.R;

public class TraceLetters_Activity extends AppCompatActivity
{
    private ImageView imageReplacer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_letters_);

        imageReplacer = findViewById(R.id.EnglishTraceLetterImageID);
    }


    public void LaunchEnglishActivity(View view)
    {
       // startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
        this.finish();
    }

    public void TraceAlphabetA(View view) {
        imageReplacer.setImageResource(R.drawable.trace_a);
    }

    public void TraceAlphabetB(View view) {
        imageReplacer.setImageResource(R.drawable.trace_b);
    }

    public void TraceAlphabetC(View view) {
        imageReplacer.setImageResource(R.drawable.trace_c);
    }

    public void TraceAlphabetD(View view) {
        imageReplacer.setImageResource(R.drawable.trace_d);
    }

    public void TraceAlphabetE(View view) {
        imageReplacer.setImageResource(R.drawable.trace_e);
    }

    public void TraceAlphabetF(View view) {
        imageReplacer.setImageResource(R.drawable.trace_f);
    }

    public void TraceAlphabetG(View view) {
        imageReplacer.setImageResource(R.drawable.trace_g);
    }

    public void TraceAlphabetH(View view) {
        imageReplacer.setImageResource(R.drawable.trace_h);
    }

    public void TraceAlphabetI(View view) {
        imageReplacer.setImageResource(R.drawable.trace_i);
    }

    public void TraceAlphabetJ(View view) {
        imageReplacer.setImageResource(R.drawable.trace_j);
    }

    public void TraceAlphabetK(View view) {
        imageReplacer.setImageResource(R.drawable.trace_k);
    }

    public void TraceAlphabetL(View view) {
        imageReplacer.setImageResource(R.drawable.trace_l);
    }

    public void TraceAlphabetM(View view) {
        imageReplacer.setImageResource(R.drawable.trace_m);
    }

    public void TraceAlphabetN(View view) {
        imageReplacer.setImageResource(R.drawable.trace_n);
    }

    public void TraceAlphabetO(View view) {
        imageReplacer.setImageResource(R.drawable.trace_o);
    }

    public void TraceAlphabetP(View view) {
        imageReplacer.setImageResource(R.drawable.trace_p);
    }

    public void TraceAlphabetQ(View view) {
        imageReplacer.setImageResource(R.drawable.trace_q);
    }

    public void TraceAlphabetR(View view) {
        imageReplacer.setImageResource(R.drawable.trace_r);
    }

    public void TraceAlphabetS(View view) {
        imageReplacer.setImageResource(R.drawable.trace_s);
    }

    public void TraceAlphabetT(View view) {
        imageReplacer.setImageResource(R.drawable.trace_t);
    }

    public void TraceAlphabetU(View view) {
        imageReplacer.setImageResource(R.drawable.trace_u);
    }

    public void TraceAlphabetV(View view) {
        imageReplacer.setImageResource(R.drawable.trace_v);
    }

    public void TraceAlphabetW(View view) {
        imageReplacer.setImageResource(R.drawable.trace_w);
    }

    public void TraceAlphabetX(View view) {
        imageReplacer.setImageResource(R.drawable.trace_x);
    }

    public void TraceAlphabetY(View view) {
        imageReplacer.setImageResource(R.drawable.trace_y);
    }

    public void TraceAlphabetZ(View view) {
        imageReplacer.setImageResource(R.drawable.trace_z);
    }
}
