package com.example.lavir.picassotest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import static com.example.lavir.picassotest.R.id.imageView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView target = (ImageView) findViewById(imageView);
        Picasso.with(this)
                .load("http://student.labranet.jamk.fi/~K8455/ttms0500-harkat/h1/kuvat/ikuva.jpg")
                .into(target);

    }
}
