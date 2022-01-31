package yana.febirizaldy.gurupaudapps.Animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import yana.febirizaldy.gurupaudapps.Dashboard.MainActivity;
import yana.febirizaldy.gurupaudapps.R;

public class AnimalsActivity extends AppCompatActivity {

    private ArrayList<Animals_Model> listOf_Animals;
    private RecyclerView recyclerView_animals;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        recyclerView_animals = findViewById(R.id.recyclerview_animalsID);
        recyclerView_animals.setLayoutManager(new LinearLayoutManager(this));
        listOf_Animals = new ArrayList<>();

        listOf_Animals.add(new Animals_Model("Singa", "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan & banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.", R.drawable.lion_img, R.color.lion_color));
        listOf_Animals.add(new Animals_Model("Gajah", "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika dan gajah asia, walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda.", R.drawable.elephant_image, R.color.elephant_color));
        listOf_Animals.add(new Animals_Model("Kucing", "Kucing dalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.", R.drawable.cat_img, R.color.cat_color));
        listOf_Animals.add(new Animals_Model("Monyet", "Monyet adalah istilah untuk semua anggota primata yang bukan prosimia atau kera, baik yang tinggal di Dunia Lama maupun Dunia Baru. Hingga saat ini dikenal 264 jenis monyet yang hidup di dunia. Tidak seperti kera, monyet biasanya berekor dan berukuran lebih kecil.", R.drawable.monkey_img, R.color.monkey_color));
        listOf_Animals.add(new Animals_Model("Kelinci", "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembang biak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa.", R.drawable.rabbit_img, R.color.tortoise_color));
        listOf_Animals.add(new Animals_Model("Zebra", "Zebra adalah hewan dari Afrika yang dikenal akan tubuhnya yang berbelang hitam-putih. Terdapat tiga spesies yang masih ada saat ini, yaitu zebra grévy, zebra dataran, dan zebra gunung. Zebra merupakan bagian dari genus Equus seperti halnya kuda dan keledai.", R.drawable.zebra_img, R.color.dolphin_color));
        listOf_Animals.add(new Animals_Model("Beruang", "Beruang adalah binatang dalam kelas mamalia yang tergolong ordo Carnivora, familia Ursidae.", R.drawable.beruang, R.color.dolphin_color));
        listOf_Animals.add(new Animals_Model("Kuda", "Kuda adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.", R.drawable.horse_img, R.color.dolphin_color));
        listOf_Animals.add(new Animals_Model("Serigala", "Serigala adalah binatang mamalia karnivora. Serigala abu-abu mempunyai asal usul yang sama dengan anjing luar negeri dari keluarga Canis lupus melalui bukti pengurutan DNA dan penyelidikan genetika.", R.drawable.srigala, R.color.dolphin_color));

        Animals_Adapter adapter = new Animals_Adapter(listOf_Animals, getApplicationContext());
        recyclerView_animals.setAdapter(adapter);

    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
