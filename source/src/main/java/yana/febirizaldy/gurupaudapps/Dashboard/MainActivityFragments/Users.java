package yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import yana.febirizaldy.gurupaudapps.R;

public class Users extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_users, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.badHabits_toolbar_Id);
        toolbar.setTitle("Pengguna");
        return view;
    }

}
