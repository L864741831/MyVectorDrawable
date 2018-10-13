package com.edu.vectordrawable.myvectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView imageView = (ImageView) findViewById(R.id.rocket_image);
        Drawable drawable = imageView.getDrawable();
//AnimatedVectorDrawableCompat实现了Animatable接口
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }




        ImageView one_image = (ImageView) findViewById(R.id.one_image);
        Drawable drawable1 = one_image.getDrawable();
//AnimatedVectorDrawableCompat实现了Animatable接口
        if (drawable1 instanceof Animatable) {
            ((Animatable) drawable1).start();
        }







        /*
        支持5.0以下设置

        //对于2级插件
 android {
   defaultConfig {
     vectorDrawables.useSupportLibrary = true
    }
 }









 //对于1.5或以下的年级插件
android {
  defaultConfig {
    // 停止渐变插件的矢量自动栅格化
    generatedDensities = []
  }
  // 标志通知AAPT将属性ID保持在周围。
  aaptOptions {
    additionalParameters "--no-version-vectors"
  }
}





         */






    }
}
