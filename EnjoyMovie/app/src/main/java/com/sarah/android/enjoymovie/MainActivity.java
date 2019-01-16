package com.sarah.android.enjoymovie;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

// api : afe1bf49290012fa8f3230d9993f1e2d
//http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=afe1bf49290012fa8f3230d9993f1e2d
//http://api.themoviedb.org/3/discover/movie?sort_by=vote_average.desc&api_key=afe1bf49290012fa8f3230d9993f1e2d
//https://api.themoviedb.org/3/search/movie?api_key={api_key}&query=Jack+Reacher
//https://api.themoviedb.org/3/movies/movie/movieid?api_key={api_key}
public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TabLayout mTablayout;
    private TabsPagerAdapter mAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = findViewById(R.id.viewpager);
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new PopFragment(), "Popular Movie");
        mAdapter.addFragment(new TopFragment(), "Top Movie");
        mAdapter.addFragment(new SearchFragment(), "Search Movie");
        mViewPager.setAdapter(mAdapter);

        mTablayout = (TabLayout) findViewById(R.id.tabs);
        mTablayout.setupWithViewPager(mViewPager);
        //       setupTabIcons();


    }
/*
    private void setupTabIcons() {
        mTablayout.getTabAt(0).setIcon(tabIcons[0]);
        mTablayout.getTabAt(1).setIcon(tabIcons[1]);
        mTablayout.getTabAt(2).setIcon(tabIcons[2]);
    }
*/


}
