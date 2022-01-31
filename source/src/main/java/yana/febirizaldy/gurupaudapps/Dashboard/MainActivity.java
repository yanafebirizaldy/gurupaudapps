package yana.febirizaldy.gurupaudapps.Dashboard;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.Dashboard;
import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.Games;
import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.Video;
import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.Users;
import yana.febirizaldy.gurupaudapps.R;

public class MainActivity extends AppCompatActivity
{
    private TextView mTextMessage;
    MediaPlayer mySong;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_video:
                {
                    Fragment fragmentVideos = new Video();
                    FragmentManager fragmentManagerVideos = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionHabits = fragmentManagerVideos.beginTransaction();
                    fragmentTransactionHabits.replace(R.id.fragment_container_ID, fragmentVideos);
                    fragmentTransactionHabits.commit();
                    return true;
                }
                case R.id.navigation_dashboard:
                {
                    Fragment fragmentDashboard = new Dashboard();
                    FragmentManager fragmentManagerDashboard = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionDashbaord = fragmentManagerDashboard.beginTransaction();
                    fragmentTransactionDashbaord.replace(R.id.fragment_container_ID, fragmentDashboard);
                    fragmentTransactionDashbaord.commit();
                    return true;
                }
                case R.id.navigation_user:
                {
                    Fragment fragmentUsers = new Users();
                    FragmentManager fragmentManagerUsers = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionPrayers = fragmentManagerUsers.beginTransaction();
                    fragmentTransactionPrayers.replace(R.id.fragment_container_ID, fragmentUsers);
                    fragmentTransactionPrayers.commit();
                    return true;
                }
                case R.id.navigation_game:
                {
                    Fragment fragmentGames = new Games();
                    FragmentManager fragmentManagerGames = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionPrayers = fragmentManagerGames.beginTransaction();
                    fragmentTransactionPrayers.replace(R.id.fragment_container_ID, fragmentGames);
                    fragmentTransactionPrayers.commit();
                    return true;
                }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.fragment_container_ID, new Dashboard());
        tx.commit();

        mySong= MediaPlayer.create(MainActivity.this,R.raw.carefree);
        mySong.setVolume(1,1);
        //mySong.start();
        mySong.setLooping(true);
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mySong != null) {
            mySong.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mySong != null) {
            mySong.start();
        }
    }

}
