package yana.febirizaldy.gurupaudapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import yana.febirizaldy.gurupaudapps.Dashboard.MainActivity;

public class SplashScreen extends AppCompatActivity
{
    ImageView splashImage;
    TextView welcomeText;
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage = (ImageView) findViewById(R.id.splashImage);
        splashImage.startAnimation(AnimationUtils.loadAnimation(this,R.anim.top_animation));

        welcomeText = findViewById(R.id.welcomeText);
        welcomeText.startAnimation(AnimationUtils.loadAnimation(this,R.anim.lefttoright));

        mySong= MediaPlayer.create(SplashScreen.this,R.raw.wstart);
        mySong.setVolume(1,1);
        mySong.start();
        mySong.setLooping(false);

        new Handler().postDelayed(new Runnable()
        {
            // Using handler with postDelayed called runnable run method
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                // close this activity
                finish();
            }
        }, 3*1000); // wait for 3 seconds

    }
}
