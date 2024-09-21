package com.example.eduworldskillscxx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import adapter.NewsAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFlipper viewFlipper = findViewById(R.id.flipper);
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.slide));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.out));
        TabLayout tabLayout = findViewById(R.id.tab);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
        NewsAdapter newsAdapter = new NewsAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(newsAdapter);

        new TabLayoutMediator(tabLayout,viewPager2,(tab,position)->{
            if(position == 0){
              tab.setText("推荐");
            } else if (position == 1) {
                tab.setText("娱乐");
            } else if (position == 2) {
                tab.setText("文化");
            }
        }).attach();
    }
}