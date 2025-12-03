package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rng;
    Button btn;
    ImageView iV;
    int num;
    int dup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rng = new Random();
        btn = findViewById(R.id.btn);
        iV = findViewById(R.id.iV);
        dup = 4;
    }

    public void go(View view) {
        num = rng.nextInt(3)+1;
        while(dup == num)
            num = rng.nextInt(3)+1;
        btn.setText(num+"");
        if(num == 1)
            iV.setImageResource(R.drawable.one);
        else if(num == 2)
            iV.setImageResource(R.drawable.two);
        else
            iV.setImageResource(R.drawable.three);
        dup = num;
    }
}