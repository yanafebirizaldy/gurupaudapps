package yana.febirizaldy.gurupaudapps.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import yana.febirizaldy.gurupaudapps.R;

public class EnglishAlphabets_Activity extends AppCompatActivity {
    private ImageView voiceBtn, AlphabetImage;
    private TextView alphabetLetter, alphabetName;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets_);

        voiceBtn = (ImageView) findViewById(R.id.voicePlay_btnID);
        AlphabetImage = (ImageView) findViewById(R.id.alphabetImage_ID);
        alphabetLetter = (TextView) findViewById(R.id.alphabet_TxtId);
        alphabetName = (TextView) findViewById(R.id.alphabetName_TxtId);

        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("A");
                return;
            }
        });

    }

    void Baca(final String baca) {

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int langResult = textToSpeech.setLanguage(new Locale("id", "ID"));
                    // Locale.setDefault(new Locale("id"));
                    if (langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA) {
                        Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    } else {
                        textToSpeech.speak(baca, TextToSpeech.QUEUE_FLUSH, null);
                        textToSpeech.setSpeechRate(1.0f);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void LaunchEnglishActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
    }



    public void EnglishAlphabetAct_A(View view) {
        AlphabetImage.setImageResource(R.drawable.apple);
        alphabetLetter.setText(R.string.aa);
        alphabetName.setText("Apel");

        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("A");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_B(View view) {
        AlphabetImage.setImageResource(R.drawable.doll_img);
        alphabetLetter.setText(R.string.bb);
        alphabetName.setText("Boneka");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("B");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_C(View view) {
        AlphabetImage.setImageResource(R.drawable.jug_img);
        alphabetLetter.setText(R.string.cc);
        alphabetName.setText("Ceret");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("C");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_D(View view) {
        AlphabetImage.setImageResource(R.drawable.goat_img);
        alphabetLetter.setText(R.string.dd);
        alphabetName.setText("Domba");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("D");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_E(View view) {
        AlphabetImage.setImageResource(R.drawable.elang);
        alphabetLetter.setText(R.string.ee);
        alphabetName.setText("Elang");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("E");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_F(View view) {
        AlphabetImage.setImageResource(R.drawable.feri);
        alphabetLetter.setText(R.string.ff);
        alphabetName.setText("Feri");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("F");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_G(View view) {
        AlphabetImage.setImageResource(R.drawable.elephant_image);
        alphabetLetter.setText(R.string.gg);
        alphabetName.setText("Gajah");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("G");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_H(View view) {
        AlphabetImage.setImageResource(R.drawable.harimau);
        alphabetLetter.setText(R.string.hh);
        alphabetName.setText("Harimau");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("H");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_I(View view) {
        AlphabetImage.setImageResource(R.drawable.fish_img);
        alphabetLetter.setText(R.string.Ii);
        alphabetName.setText("Ikan");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("I");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_J(View view) {
        AlphabetImage.setImageResource(R.drawable.orange_image);
        alphabetLetter.setText(R.string.Jj);
        alphabetName.setText("Jeruk");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("J");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_K(View view) {
        AlphabetImage.setImageResource(R.drawable.rabbit_img);
        alphabetLetter.setText(R.string.kk);
        alphabetName.setText("Kelinci");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("K");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_L(View view) {
        AlphabetImage.setImageResource(R.drawable.dolphin_img);
        alphabetLetter.setText(R.string.ll);
        alphabetName.setText("Lumba-Lumba");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("L");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_M(View view) {
        AlphabetImage.setImageResource(R.drawable.monkey_img);
        alphabetLetter.setText(R.string.mm);
        alphabetName.setText("Monyet");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("M");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_N(View view) {
        AlphabetImage.setImageResource(R.drawable.nyamuk);
        alphabetLetter.setText(R.string.nn);
        alphabetName.setText("Nyamuk");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("N");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_O(View view) {
        AlphabetImage.setImageResource(R.drawable.obeng);
        alphabetLetter.setText(R.string.oo);
        alphabetName.setText("Obeng");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("O");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_P(View view) {
        AlphabetImage.setImageResource(R.drawable.banana_fruit);
        alphabetLetter.setText(R.string.pp);
        alphabetName.setText("Pisang");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("P");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_Q(View view) {
        AlphabetImage.setImageResource(R.drawable.quran);
        alphabetLetter.setText(R.string.qq);
        alphabetName.setText("Qur'an");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("Q");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_R(View view) {
        AlphabetImage.setImageResource(R.drawable.queen_img);
        alphabetLetter.setText(R.string.rr);
        alphabetName.setText("Ratu");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("R");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_S(View view) {
        AlphabetImage.setImageResource(R.drawable.nest_img);
        alphabetLetter.setText(R.string.ss);
        alphabetName.setText("Sarang");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("S");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_T(View view) {
        AlphabetImage.setImageResource(R.drawable.telur);
        alphabetLetter.setText(R.string.tt);
        alphabetName.setText("Telur");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("T");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_U(View view) {
        AlphabetImage.setImageResource(R.drawable.ular);
        alphabetLetter.setText(R.string.uu);
        alphabetName.setText("Ular");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("U");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_V(View view) {
        AlphabetImage.setImageResource(R.drawable.vas);
        alphabetLetter.setText(R.string.vv);
        alphabetName.setText("Vas");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("V");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_W(View view) {
        AlphabetImage.setImageResource(R.drawable.carrot);
        alphabetLetter.setText(R.string.ww);
        alphabetName.setText("Wortel");
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("W");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_X(View view) {
        AlphabetImage.setImageResource(R.drawable.xray_img);
        alphabetLetter.setText(R.string.xx);
        alphabetName.setText(R.string.Xray);
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("X");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_Y(View view) {
        AlphabetImage.setImageResource(R.drawable.yoyo_img);
        alphabetLetter.setText(R.string.yy);
        alphabetName.setText(R.string.Yoyo);
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("Y");
                return;
            }
        });
    }

    public void EnglishAlphabetAct_Z(View view) {
        AlphabetImage.setImageResource(R.drawable.zebra_img);
        alphabetLetter.setText(R.string.zz);
        alphabetName.setText(R.string.Zebra);
        voiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Baca("Z");
                return;
            }
        });
    }
}
