package com.example.a21746033.appturtleriot;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        //TextView tv1 = (TextView)findViewById(R.id.tvPText1);
        TextView tv2 = (TextView)findViewById(R.id.tvPText2);
        ImageView logo = (ImageView)findViewById(R.id.ivLOGO);



        //Typeface fuente = getResources().getFont(R.font.armalite); //error en API me pide la 26.
       // tv1.setTypeface(fuente);
       // tv2.setTypeface(fuente);

        Animation animacionTexto = AnimationUtils.loadAnimation(this,R.anim.desaparece);
        Animation animacionLogo = AnimationUtils.loadAnimation(this,R.anim.subir_arriba);
        //tv1.startAnimation(animacionTexto);
        tv2.startAnimation(animacionTexto);
        logo.startAnimation(animacionLogo);


        abrirApp(true);





    }

    private void abrirApp(boolean localPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen
                        .this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },4000);
    }
}
