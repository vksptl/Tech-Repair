package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;

public class Contact extends AppCompatActivity {
    private Picasso picasso;
    private LayoutInflater inflater;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        picasso= Picasso.with(this);
        inflater=getLayoutInflater();

        image1= (ImageView) findViewById(R.id.img1);
        image2= (ImageView) findViewById(R.id.img2);
        image3= (ImageView) findViewById(R.id.img3);
        image4= (ImageView) findViewById(R.id.img4);

        ArrayList<String> imageList=new ArrayList<String>();
        imageList.add("https://cdn.shutterstock.com/shutterstock/videos/3430504/thumb/1.jpg");
        imageList.add("http://il8.picdn.net/shutterstock/videos/8046286/thumb/1.jpg");
        imageList.add("http://st2.depositphotos.com/2069237/5494/v/450/depositphotos_54949477-stock-video-man-taking-photo.jpg");
        showImages(imageList);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(i);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/"));
                startActivity(i);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(i);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/"));
                startActivity(i);
            }
        });

    }


    private void showImages(final ArrayList<String> imageList)
    {
        CarouselView imageCarousel=(CarouselView)findViewById(R.id.carousel1);

        imageCarousel.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(int position) {
                View customView = inflater.inflate(R.layout.simple_image, null);

                ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);

                picasso.load(imageList.get(position))
                        .fit()
                        .centerCrop()
                        .into(imageView);

                return customView;
            }
        });

        imageCarousel.setPageCount(imageList.size());

    }


}
