package com.codewithgolap.cardviewnrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name, tag;
    String alphaName, alphaTag;
    int alphaImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        tag = findViewById(R.id.tag);
        //get the intent
        alphaName = getIntent().getStringExtra("name");
        alphaTag = getIntent().getStringExtra("tag");
        alphaImage = getIntent().getIntExtra("image",0);

        //now set the get values in the respective widgets
        name.setText(alphaName);
        tag.setText(alphaTag);
        imageView.setImageResource(alphaImage);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}