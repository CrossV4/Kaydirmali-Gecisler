package com.stibircan.youtubeogrenimkaydirmaligecisler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.am_viewPager);

        SlideAdapter slideAdapter = new SlideAdapter(getSupportFragmentManager());

        slideAdapter.add(new FragmentHome());
        slideAdapter.add(new FragmentExplore());
        slideAdapter.add(new FragmentShare());
        slideAdapter.add(new FragmentWorld());

        viewPager.setAdapter(slideAdapter);
        viewPager.setCurrentItem(0);

        viewPager.setOffscreenPageLimit(1);
    }


    private static class SlideAdapter extends FragmentPagerAdapter
    {
        private final List<Fragment> fragmentList = new ArrayList<>();

        public SlideAdapter(@NonNull FragmentManager fm)
        {
            super(fm);
        }

        void add(Fragment fragment)
        {
            fragmentList.add(fragment);
        }

        @NonNull
        @Override
        public Fragment getItem(int position)
        {
            return fragmentList.get(position);
        }

        @Override
        public int getCount()
        {
            return fragmentList.size();
        }
    }
}