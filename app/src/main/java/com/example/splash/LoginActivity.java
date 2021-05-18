package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    ImageButton sisImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        /*sisImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri sis = Uri.parse("https://afiliacion.sis.gob.pe/sisAfiliacionVirtual");
                Intent intent = new Intent(Intent.ACTION_VIEW,sis);
                startActivity(intent);
            }
        });*/

    }

    public void actividadInformacion(View view) {
        startActivity(new Intent(this,MotionLayoutInformacion.class));
    }
}