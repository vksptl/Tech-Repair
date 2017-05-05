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
public class TrackerParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayouttf1, expandableLayouttf2;
    ExpandableLinearLayout expandableLayoutfs1, expandableLayoutfs2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar8);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager8);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs8);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TrackOneFrag(), "FITBIT");
        adapter.addFragment(new TrackTwoFrag(), "SAMSUNG GEAR");
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

    public void expandableButtontf1(View view) {
        expandableLayouttf1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttf1);
        expandableLayouttf1.toggle(); // toggle expand and collapse
    }
    public void expandableButtontf2(View view) {
        expandableLayouttf2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttf2);
        expandableLayouttf2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonfs1(View view) {
        expandableLayoutfs1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutfs1);
        expandableLayoutfs1.toggle(); // toggle expand and collapse
    }

    public void expandableButtonfs2(View view) {
        expandableLayoutfs2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutfs2);
        expandableLayoutfs2.toggle(); // toggle expand and collapse
    }

}