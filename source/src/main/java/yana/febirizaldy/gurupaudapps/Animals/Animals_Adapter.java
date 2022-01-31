package yana.febirizaldy.gurupaudapps.Animals;

import android.content.Context;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class Animals_Adapter extends RecyclerView.Adapter<Animals_Adapter.ViewHolder_Animal>
{
    private MediaPlayer mediaPlayer;
    ArrayList<Animals_Model> animals_list;
    Context getAppContext;
    private TextToSpeech textToSpeech;


    public Animals_Adapter(ArrayList<Animals_Model> animals_list, Context getAppContext) {
        this.animals_list = animals_list;
        this.getAppContext = getAppContext;
    }

    @Override
    public ViewHolder_Animal onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(getAppContext).inflate(R.layout.animals_custom_adapter_view, parent, false);
        return new ViewHolder_Animal(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder_Animal holder, int position) {
        Animals_Model model = animals_list.get(position);
        holder.ani_name.setText(model.getAnimalName());
        holder.ani_description.setText(model.getAnimal_Description());
        holder.ani_cardView.setCardBackgroundColor(model.getColor());
        Picasso.get().load(model.getAnimal_Image()).into(holder.ani_img);

    }

    @Override
    public int getItemCount() {
        return animals_list.size();
    }

    public class ViewHolder_Animal extends RecyclerView.ViewHolder
    {
        ImageView ani_img, ani_read;
        TextView ani_name, ani_description;
        CardView ani_cardView;

        public ViewHolder_Animal(View item_view) {
            super(item_view);

            ani_name = item_view.findViewById(R.id.animal_Name_txtID);
            ani_description = item_view.findViewById(R.id.animal_Description_txtID);
            ani_img = item_view.findViewById(R.id.animal_Img_ID);
            ani_read = item_view.findViewById(R.id.animal_Read);
            ani_cardView = item_view.findViewById(R.id.animal_card_ID);

            ani_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animals_Model model = animals_list.get(getAdapterPosition());
                    //Toast.makeText(getAppContext, String.valueOf(model.getAnimalName()), Toast.LENGTH_SHORT).show();
                    mediaPlayer = new MediaPlayer();
                    if(model.getAnimalName().toString().equals("Gajah"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.elephant);
                    if(model.getAnimalName().toString().equals("Singa"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.lion);
                    if(model.getAnimalName().toString().equals("Kucing"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.cat);
                    if(model.getAnimalName().toString().equals("Monyet"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.monkey);
                    if(model.getAnimalName().toString().equals("Zebra"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.horse);
                    if(model.getAnimalName().toString().equals("Beruang"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.bear);
                    if(model.getAnimalName().toString().equals("Kuda"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.horse);
                    if(model.getAnimalName().toString().equals("Serigala"))
                        mediaPlayer = MediaPlayer.create(getAppContext, R.raw.wolf);

                    mediaPlayer.start();
                }
            });

            ani_read.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animals_Model model = animals_list.get(getAdapterPosition());
                    //Toast.makeText(getAppContext, String.valueOf(model.getAnimalName()), Toast.LENGTH_SHORT).show();
                        Baca(model.getAnimal_Description());

                }
            });
        }

        void Baca(final String baca) {

            textToSpeech = new TextToSpeech(itemView.getContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status == TextToSpeech.SUCCESS) {
                        int langResult = textToSpeech.setLanguage(new Locale("id", "ID"));
                        // Locale.setDefault(new Locale("id"));
                        if (langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA) {
                            Toast.makeText(itemView.getContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                        } else {
                            textToSpeech.speak(baca, TextToSpeech.QUEUE_FLUSH, null);
                            textToSpeech.setSpeechRate(1.0f);
                        }
                    } else {
                        Toast.makeText(itemView.getContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
