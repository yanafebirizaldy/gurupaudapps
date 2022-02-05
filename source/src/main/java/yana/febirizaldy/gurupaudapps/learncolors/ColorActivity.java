package yana.febirizaldy.gurupaudapps.learncolors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;


public class ColorActivity extends Activity {

    private static final String TAG = "LearnColorsSTT";
    private TextToSpeech textToSpeech;

    private Pair mCurrentColor;
    private SpeechRecognizer sr;
    private Intent intent;
    private TextView screenText;
    private Button suara;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final LinearLayout rootLayout = new LinearLayout(this);
		setTheme(android.R.style.Theme_Holo_Light);

		final Pair[] colorArray = {
				new Pair(Color.BLUE, "blue"),
				new Pair(Color.BLACK, "black"),
				new Pair(Color.RED, "red"),
				new Pair(Color.GREEN, "green"),
				new Pair(Color.YELLOW, "yellow"),
				new Pair(Color.WHITE, "white"),
				new Pair(Color.GRAY, "gray"),
				new Pair(Color.rgb(255, 102, 0), "orange"),
				new Pair(Color.rgb(128, 0, 128), "purple"),
				new Pair(Color.rgb(92, 51, 23), "brown"),
				new Pair(Color.rgb(255, 192, 203), "pink")
		};


		final RandomItemList<Pair> colors = new RandomItemList<Pair>(colorArray);

		screenText = new TextView(this);
		screenText.setText("Tab untuk warna selanjutnya");
		screenText.setTextSize(20);
		screenText.setGravity(Gravity.CENTER);

		suara = new Button(this);
		suara.setText("Warna");
		suara.setTextSize(20);
		suara.setGravity(Gravity.CENTER);

        // Set initial color
		mCurrentColor = colors.nextItem();
		screenText.setBackgroundColor(mCurrentColor.key);

		screenText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentColor = colors.nextItem();
                screenText.setBackgroundColor(mCurrentColor.key);
                Log.i("Color", mCurrentColor.value);
            }
        });


                textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status == TextToSpeech.SUCCESS)
                        {
                            int langResult = textToSpeech.setLanguage(new Locale("id", "ID"));
                            if(langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA)
                            {
                                Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                //blue,black,red,greem,yellow,white,gray,orange,purple,brown,pink
                                suara.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //screenText.setText(mCurrentColor.value);
                                        if(mCurrentColor.value.equals("blue"))  Baca("biru");
                                        if(mCurrentColor.value.equals("black"))  Baca("hitam");
                                        if(mCurrentColor.value.equals("red"))  Baca("merah");
                                        if(mCurrentColor.value.equals("green"))  Baca("hijau");
                                        if(mCurrentColor.value.equals("yellow"))  Baca("kuning");
                                        if(mCurrentColor.value.equals("white"))  Baca("putih");
                                        if(mCurrentColor.value.equals("gray"))  Baca("abu abu");
                                        if(mCurrentColor.value.equals("orange"))  Baca("jingga");
                                        if(mCurrentColor.value.equals("purple"))  Baca("ungu");
                                        if(mCurrentColor.value.equals("brown"))  Baca("cokelat");
                                        if(mCurrentColor.value.equals("pink"))  Baca("merah muda");
                                    }
                                });



                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


		//LinearLayout.LayoutParams screenTextParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //rootLayout.addView(screenText, screenTextParams);
        //startListening();
        //setContentView(rootLayout);

        //LinearLayout linearLayout = (LinearLayout) findViewById(R.id.LinearLayout1);

        LinearLayout L2 = new LinearLayout(this);
        L2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        L2.setGravity(Gravity.CENTER);

        L2.addView(suara,(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.MATCH_PARENT,0.8f)));
        L2.addView(screenText,(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,0.8f)));

        rootLayout.addView(L2);
        startListening();
        setContentView(rootLayout);
	}

    private void startListening() {
        sr = SpeechRecognizer.createSpeechRecognizer(this);
        sr.setRecognitionListener(new listener());

        intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, "voice.recognition.test");

        intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 5);
        sr.startListening(intent);

    }

	class Pair {
		Integer key;
		String value;
		public Pair(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}


    class listener implements RecognitionListener {
        public void onReadyForSpeech(Bundle params) {
            Log.d(TAG, "onReadyForSpeech");
        }
        public void onBeginningOfSpeech() {
            Log.d(TAG, "onBeginningOfSpeech");
        }
        public void onRmsChanged(float rmsdB) {
            Log.d(TAG, "onRmsChanged");
        }
        public void onBufferReceived(byte[] buffer) {
            Log.d(TAG, "onBufferReceived");
        }
        public void onEndOfSpeech() {
            Log.d(TAG, "onEndofSpeech");
        }
        public void onError(int error) {
            Log.d(TAG,  "error " +  error);
            sr.destroy();
            sr = SpeechRecognizer.createSpeechRecognizer(getApplicationContext());
            sr.setRecognitionListener(new listener());
            sr.startListening(intent);
        }
        public void onResults(Bundle results) {
            ArrayList data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
            if (data.contains(mCurrentColor.value)) {
                screenText.callOnClick();
                startListening();
            }
            else {
                startListening();
            }
        }
        public void onPartialResults(Bundle partialResults) {
            Log.d(TAG, "onPartialResults");
        }
        public void onEvent(int eventType, Bundle params) {
            Log.d(TAG, "onEvent " + eventType);
        }
    }

    void Baca(final String baca)
    {
        textToSpeech.speak(baca, TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
}
