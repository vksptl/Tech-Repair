package com.vikas.gadgetsrepair2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.github.aakira.expandablelayout.ExpandableLinearLayout;
import com.vikas.gadgetsrepair2.R;
public class WatchParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayoutws1, expandableLayoutws2, expandableLayoutws3, expandableLayoutws4;
    ExpandableLinearLayout expandableLayoutwa1, expandableLayoutwa2, expandableLayoutwa3, expandableLayoutwa4;
    ExpandableLinearLayout expandableLayoutwl1, expandableLayoutwl2, expandableLayoutwl3, expandableLayoutwl4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager5);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs5);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WatchOneFrag(), "APPLE");
        adapter.addFragment(new WatchTwoFrag(), "SAMSUNG");
        adapter.addFragment(new WatchThreeFrag(), "LG");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void expandableButtonwa1(View view) {
        expandableLayoutwa1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwa1);
        expandableLayoutwa1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwa2(View view) {
        expandableLayoutwa2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwa2);
        expandableLayoutwa2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwa3(View view) {
        expandableLayoutwa3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwa3);
        expandableLayoutwa3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwa4(View view) {
        expandableLayoutwa4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwa4);
        expandableLayoutwa4.toggle(); // toggle expand and collapse
    }

    public void expandableButtonws1(View view) {
        expandableLayoutws1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutws1);
        expandableLayoutws1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonws2(View view) {
        expandableLayoutws2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutws2);
        expandableLayoutws2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonws3(View view) {
        expandableLayoutws3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutws3);
        expandableLayoutws3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonws4(View view) {
        expandableLayoutws4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutws4);
        expandableLayoutws4.toggle(); // toggle expand and collapse
    }


    public void expandableButtonwl1(View view) {
        expandableLayoutwl1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwl1);
        expandableLayoutwl1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwl2(View view) {
        expandableLayoutwl2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwl2);
        expandableLayoutwl2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwl3(View view) {
        expandableLayoutwl3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwl3);
        expandableLayoutwl3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonwl4(View view) {
        expandableLayoutwl4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutwl4);
        expandableLayoutwl4.toggle(); // toggle expand and collapse
    }
}