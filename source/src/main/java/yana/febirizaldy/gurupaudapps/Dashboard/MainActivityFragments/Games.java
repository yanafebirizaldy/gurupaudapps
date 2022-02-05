package yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import yana.febirizaldy.gurupaudapps.English_Category.EnglishActivity;
import yana.febirizaldy.gurupaudapps.R;
import yana.febirizaldy.gurupaudapps.gamebalon.ColorClickLV2;
import yana.febirizaldy.gurupaudapps.puzzle.PuzzleX;

public class Games extends Fragment {

    private ImageView ban1, ban2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.fragment_games, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.goodHabits_toolbar_Id);
        toolbar.setTitle("Permainan");

        ban1 = view.findViewById(R.id.banner1);
        ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), ColorClickLV2.class));
                return;
            }
        });

        ban2 = view.findViewById(R.id.banner2);
        ban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), PuzzleX.class));
                return;
            }
        });

        return view;
    }

}
