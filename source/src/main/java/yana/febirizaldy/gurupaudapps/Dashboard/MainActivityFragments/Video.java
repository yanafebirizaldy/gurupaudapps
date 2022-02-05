package yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import yana.febirizaldy.gurupaudapps.R;
import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.VideoAdapter;
import yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.YouTubeVideos;

public class Video extends Fragment {

    RecyclerView recyclerView;
    Vector<yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.fragment_video, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.goodHabits_toolbar_Id);
        toolbar.setTitle("Video Pembelajaran");

        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()));

        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M3J2hy8XoeQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jufQOPo6fhg\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-292I9naeH8\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/G42xvC20JKQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EbJ9sek5FwI\" frameborder=\"0\" allowfullscreen></iframe>") );

        yana.febirizaldy.gurupaudapps.Dashboard.MainActivityFragments.VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

        return view;
    }

}
