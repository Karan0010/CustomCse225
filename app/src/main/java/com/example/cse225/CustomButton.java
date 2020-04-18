package com.example.cse225;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;




public class CustomButton extends AppCompatActivity {

    Button btn;

    private AnimationDrawable anim, anim2;
    private Button button, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custombutton);

        init();
        anim = (AnimationDrawable) button.getBackground();
        anim.setEnterFadeDuration(2500);
        anim.setExitFadeDuration(2500);

        init();
        anim2 = (AnimationDrawable) button.getBackground();
        anim2.setEnterFadeDuration(3000);
        anim2.setExitFadeDuration(3000);

    }

    private void init() {
        this.button = findViewById(R.id.button);
        this.button2 = findViewById(R.id.button2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning()) {
            anim.start();
        }
        if (anim2 != null && !anim2.isRunning()) {
            anim2.start();
        }

    }

        @Override
        protected void onPause () {
            super.onPause();
            if (anim != null && anim.isRunning()) {
                anim.stop();
            }
            if (anim2 != null && anim2.isRunning()) {
                anim2.stop();
            }


            btn=findViewById(R.id.button2);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent= new Intent(CustomButton.this,MainActivity.class);
                    startActivity(intent);
                }
            });

    }
}
