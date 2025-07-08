package com.rathee.shcube;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView cubeFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cubeFace = findViewById(R.id.cubeImage);

        startCubeAnimation();
    }

    private void startCubeAnimation() {
        Rotate3dAnimation anim = new Rotate3dAnimation(0, 360, 100, 100, 0, true);
        anim.setDuration(2000);
        anim.setRepeatCount(Animation.INFINITE);
        cubeFace.startAnimation(anim);
    }
}
