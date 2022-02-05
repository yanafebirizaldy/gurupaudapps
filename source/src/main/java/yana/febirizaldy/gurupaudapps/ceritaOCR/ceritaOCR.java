package yana.febirizaldy.gurupaudapps.ceritaOCR;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

import java.io.IOException;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import yana.febirizaldy.gurupaudapps.R;


public class ceritaOCR extends AppCompatActivity {

    SurfaceView cameraView;
    TextToSpeech toSpeech;
    TextView textView, textView2;
    CameraSource cameraSource;
    Button button;
    final int RCPID = 1001;
    int r;


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case RCPID:
            {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                    {
                        return;
                    }
                    try {
                        cameraSource.start(cameraView.getHolder());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cameraView = (SurfaceView) findViewById(R.id.surface_view);
        textView = (TextView) findViewById(R.id.text_view);
        textView2 = (TextView) findViewById(R.id.text_view2);


        // button = (Button) findViewById(R.id.button3);
        toSpeech=new TextToSpeech(ceritaOCR.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                r=toSpeech.setLanguage(new Locale("id", "ID"));
            }
        });

        TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();
        if (!textRecognizer.isOperational()) {
            Log.w("br", "Detector depentancies are not yet availble");

        } else {
            cameraSource = new CameraSource.Builder(getApplicationContext(), textRecognizer)
                    .setFacing(CameraSource.CAMERA_FACING_BACK)
                    .setRequestedPreviewSize(1280, 1024)
                    .setRequestedFps(2.0f)
                    .setAutoFocusEnabled(true)
                    .build();
            cameraView.getHolder().addCallback(new SurfaceHolder.Callback() {
                @Override
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    try {
                        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(ceritaOCR.this,
                                    new String[] {Manifest.permission.CAMERA},
                                    RCPID);
                            return;
                        }
                        cameraSource.start(cameraView.getHolder());
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

                @Override
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

                }

                @Override
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    cameraSource.stop();
                }
            });

            textRecognizer.setProcessor(new Detector.Processor<TextBlock>() {
                @Override
                public void release() {

                }

                @Override
                public void receiveDetections(Detector.Detections<TextBlock> detections) {

                    final SparseArray<TextBlock> items = detections.getDetectedItems();
                    if(items.size()!=0)
                    {

                        textView.post(new Runnable() {
                            @Override
                            public void run() {
                                StringBuilder stringBuilder = new StringBuilder();
                                for (int i=0;i<items.size();++i)
                                {
                                    TextBlock item=items.valueAt(i);
                                    stringBuilder.append(item.getValue());
                                    stringBuilder.append("\n");
                                }
                                textView.setText(stringBuilder.toString());
                                // cameraSource.stop();
                                //toSpeech.speak("stringBuilder.toString()",TextToSpeech.QUEUE_FLUSH,null,null);
                               // toSpeech.speak(stringBuilder.toString(),TextToSpeech.QUEUE_FLUSH,null);
                            }
                        });

                    }

                }
            });

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView2.setText(textView.getText().toString());
                    return;
                }
            });


            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    toSpeech.speak(textView2.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                    return;
                }
            });

        }


    }


}
