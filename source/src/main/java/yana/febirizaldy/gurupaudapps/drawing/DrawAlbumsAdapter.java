package yana.febirizaldy.gurupaudapps.drawing;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.load.engine.DiskCacheStrategy;


import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import yana.febirizaldy.gurupaudapps.R;


public class DrawAlbumsAdapter extends RecyclerView.Adapter<DrawAlbumsAdapter.MyViewHolder> {
    String levelget;
    private Context mContext;
    private List<Album> albumList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
          //  count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            thumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s=title.getText().toString();
                    if(s.equals("Apple")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.apple2);
                        intent.putExtras(bundle);

                        v.getContext().startActivity(intent);
                    }

                    else if(s.equals("Frock")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.frock);
                        intent.putExtras(bundle);

                        v.getContext().startActivity(intent); }
                    else if(s.equals("Strawberry")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.strawberry);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Flower")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.flow);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Dog")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.dog1);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Butterfly")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.butterfly1);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }

                }
            });
        }
    }


    public DrawAlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        Album album = albumList.get(position);
        holder.title.setText(album.getName());

        //holder.imgView.setImageResource(dataset[position]);
        holder.thumbnail.setImageResource(album.getThumbnail());

        //  holder.count.setText(album.getNumOfSongs());

        // loading album cover using Glide library
        //Glide.with(holder.count.getContext()).load(album.getThumbnail()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.thumbnail);

    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
