package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;

public class Desktop extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6;
    private Picasso picasso;
    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop);
        i1= (ImageView) findViewById(R.id.d_iv1);
        i1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // Intent i = new Intent(Desktop.this, DesktopParts.class);
               // startActivity(i);

                Intent i = new Intent(getApplicationContext(),
                        DesktopParts.class);
                i.putExtra("fragmentNumber", 1);
                startActivity(i);
            }
        });
        picasso = Picasso.with(this);
        inflater = getLayoutInflater();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<String> imageList = new ArrayList<String>();
        imageList.add("https://dixplore.com/wp-content/uploads/2016/04/lenovo-ideacentre-y900-3-470-75.jpg");
        imageList.add("https://store.storeimages.cdn-apple.com/4974/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ma/imac/gallery2/imac-gallery2-2015?wid=2000&hei=1536&fmt=jpeg&qlt=95&op_sharpen=0&resMode=bicub&op_usm=0.5,0.5,0,0&iccEmbed=0&layer=comp&.v=1473964720645");
        imageList.add("http://previewcf.turbosquid.com/Preview/2014/07/08__21_04_16/DELL_Alienware_Computer_01.jpg4a83de64-c705-43a0-be01-69ed3afd6268Large.jpg");
        imageList.add("https://www.walldevil.com/wallpapers/a21/computer-gaming-room-super-art-keeganwest.jpg");
        showImages(imageList);

    }

    private void showImages(final ArrayList<String> imageList) {
        CarouselView imageCarousel = (CarouselView) findViewById(R.id.carousel3);

        imageCarousel.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(int position) {
                View customView = inflater.inflate(R.layout.simple_image, null, false);


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


