package com.firstapp.darkdreamer.fxpfileexplorerandplaylistcreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewer extends AppCompatActivity implements View.OnClickListener {

    ImageView iv1;
    Button del,setas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);
        iv1=findViewById(R.id.imageView4);
        del=findViewById(R.id.button);
        setas=findViewById(R.id.button2);

        iv1.setOnClickListener(this);
        del.setOnClickListener(this);
        setas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                //delete the current image
                break;
            case R.id.button2:
                //set the current image as wallpaper

                break;
        }
    }
}
