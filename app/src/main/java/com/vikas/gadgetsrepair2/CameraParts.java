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
public class CameraParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ExpandableLinearLayout expandableLayoutcc1, expandableLayoutcc2, expandableLayoutcc3, expandableLayoutcc4;
    ExpandableLinearLayout expandableLayoutcn1, expandableLayoutcn2, expandableLayoutcn3, expandableLayoutcn4;
    ExpandableLinearLayout expandableLayoutcs1, expandableLayoutcs2, expandableLayoutcs3, expandableLayoutcs4;
    ExpandableLinearLayout expandableLayoutck1, expandableLayoutck2, expandableLayoutck3, expandableLayoutck4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager4);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs4);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CamOneFrag(), "CANON");
        adapter.addFragment(new CamTwoFrag(), "NIKON");
        adapter.addFragment(new CamThreeFrag(), "SONY");
        adapter.addFragment(new CamFourFrag(), "KODAK");
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

    public void expandableButtoncc1(View view) {
        expandableLayoutcc1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcc1);
        expandableLayoutcc1.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncc2(View view) {
        expandableLayoutcc2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcc2);
        expandableLayoutcc2.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncc3(View view) {
        expandableLayoutcc3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcc3);
        expandableLayoutcc3.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncc4(View view) {
        expandableLayoutcc4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcc4);
        expandableLayoutcc4.toggle(); // toggle expand and collapse
    }

    public void expandableButtoncn1(View view) {
        expandableLayoutcn1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcn1);
        expandableLayoutcn1.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncn2(View view) {
        expandableLayoutcn2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcn2);
        expandableLayoutcn2.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncn3(View view) {
        expandableLayoutcn3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcn3);
        expandableLayoutcn3.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncn4(View view) {
        expandableLayoutcn4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcn4);
        expandableLayoutcn4.toggle(); // toggle expand and collapse
    }

    public void expandableButtoncs1(View view) {
        expandableLayoutcs1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcs1);
        expandableLayoutcs1.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncs2(View view) {
        expandableLayoutcs2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcs2);
        expandableLayoutcs2.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncs3(View view) {
        expandableLayoutcs3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcs3);
        expandableLayoutcs3.toggle(); // toggle expand and collapse
    }
    public void expandableButtoncs4(View view) {
        expandableLayoutcs4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutcs4);
        expandableLayoutcs4.toggle(); // toggle expand and collapse
    }

    public void expandableButtonck1(View view) {
        expandableLayoutck1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutck1);
        expandableLayoutck1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonck2(View view) {
        expandableLayoutck2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutck2);
        expandableLayoutck2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonck3(View view) {
        expandableLayoutck3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutck3);
        expandableLayoutck3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonck4(View view) {
        expandableLayoutck4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutck4);
        expandableLayoutck4.toggle(); // toggle expand and collapse
    }
}
