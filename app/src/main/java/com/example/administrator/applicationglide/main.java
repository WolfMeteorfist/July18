package com.example.administrator.applicationglide;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import static com.example.administrator.applicationglide.R.id.my_btn;

public class main extends AppCompatActivity implements View.OnClickListener{

    private Button mButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(my_btn);

        mImageView = (ImageView) findViewById(R.id.my_iv);
        mButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_btn:
                Glide.with(this).load("http://p1.pstatp.com/large/166200019850062839d3").diskCacheStrategy(DiskCacheStrategy.NONE).into(mImageView);
                break;
        }
    }
}
