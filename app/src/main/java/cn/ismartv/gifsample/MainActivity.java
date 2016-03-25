package cn.ismartv.gifsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.image);

        Glide.with(this)
                .load(R.drawable.test)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(mImageView);

//        Picasso.with(this).load(R.drawable.test)
//
//                .into(mImageView);
    }
}
