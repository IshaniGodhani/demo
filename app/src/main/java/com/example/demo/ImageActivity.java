package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {
    ImageView imageView;
    Button share,delete;
    String uri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        imageView=findViewById(R.id.imageview);
        share=findViewById(R.id.share);
        delete=findViewById(R.id.delete);

        uri=getIntent().getStringExtra("uri");
        Picasso.get()
                .load(uri)
                .into(imageView);



    }
}