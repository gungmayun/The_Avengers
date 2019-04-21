package com.example.gungmayun.the_avengers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AvengersDetail extends AppCompatActivity {
    private static final String TAG = "AvengersDetail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        if (getIntent().hasExtra("image_url")&& getIntent().hasExtra("image_name"));
        Log.d(TAG, "getIncomingIntent: found intent extras.");

        String imageurl = getIntent().getStringExtra("image_url");
        String imagename = getIntent().getStringExtra("image_name");
        String remarks = getIntent().getStringExtra("name_remarks");
        String actors = getIntent().getStringExtra("name_actors");
        String descriptions = getIntent().getStringExtra("image_description");
        setImage(imageurl, imagename, remarks, actors, descriptions);
    }

    private void setImage(String imageurl, String imagename, String remarks, String actors, String descriptions){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_name);
        name.setText(imagename);

        TextView remark = findViewById(R.id.name_remarks);
        remark.setText(remarks);

        TextView actor = findViewById(R.id.actor);
        actor.setText(actors);

        TextView description = findViewById(R.id.image_description);
        description.setText(descriptions);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(image);
    }
}
