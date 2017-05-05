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
public class GameParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayoutgs1, expandableLayoutgs2, expandableLayoutgs3;
    ExpandableLinearLayout expandableLayoutgx1, expandableLayoutgx2, expandableLayoutgx3;
    ExpandableLinearLayout expandableLayoutgn1, expandableLayoutgn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager6);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs6);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new GameOneFrag(), "SONY");
        adapter.addFragment(new GameTwoFrag(), "XBOX");
        adapter.addFragment(new GameThreeFrag(), "NINTENDO");
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

    public void expandableButtongs1(View view) {
        expandableLayoutgs1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgs1);
        expandableLayoutgs1.toggle(); // toggle expand and collapse
    }
    public void expandableButtongs2(View view) {
        expandableLayoutgs2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgs2);
        expandableLayoutgs2.toggle(); // toggle expand and collapse
    }
    public void expandableButtongs3(View view) {
        expandableLayoutgs3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgs3);
        expandableLayoutgs3.toggle(); // toggle expand and collapse
    }

    public void expandableButtongx1(View view) {
        expandableLayoutgx1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgx1);
        expandableLayoutgx1.toggle(); // toggle expand and collapse
    }
    public void expandableButtongx2(View view) {
        expandableLayoutgx2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgx2);
        expandableLayoutgx2.toggle(); // toggle expand and collapse
    }
    public void expandableButtongx3(View view) {
        expandableLayoutgx3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgx3);
        expandableLayoutgx3.toggle(); // toggle expand and collapse
    }

    public void expandableButtongn1(View view) {
        expandableLayoutgn1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgn1);
        expandableLayoutgn1.toggle(); // toggle expand and collapse
    }
    public void expandableButtongn2(View view) {
        expandableLayoutgn2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutgn2);
        expandableLayoutgn2.toggle(); // toggle expand and collapse
    }
}