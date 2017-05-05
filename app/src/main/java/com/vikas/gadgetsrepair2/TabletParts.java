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
public class TabletParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayoutts1, expandableLayoutts2, expandableLayoutts3, expandableLayoutts4,expandableLayoutts5, expandableLayoutts6;
    ExpandableLinearLayout expandableLayoutta1, expandableLayoutta2, expandableLayoutta3, expandableLayoutta4,expandableLayoutta5, expandableLayoutta6;
    ExpandableLinearLayout expandableLayouttm1, expandableLayouttm2, expandableLayouttm3, expandableLayouttm4,expandableLayouttm5, expandableLayouttm6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager3);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs3);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOneFrag(), "APPLE");
        adapter.addFragment(new TabTwoFrag(), "SAMSUNG");
        adapter.addFragment(new TabThreeFrag(), "MICROSOFT");
        adapter.addFragment(new TabFourFrag(), "GOOGLE");
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


    public void expandableButtonta1(View view) {
        expandableLayoutta1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta1);
        expandableLayoutta1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonta2(View view) {
        expandableLayoutta2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta2);
        expandableLayoutta2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonta3(View view) {
        expandableLayoutta3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta3);
        expandableLayoutta3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonta4(View view) {
        expandableLayoutta4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta4);
        expandableLayoutta4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonta5(View view) {
        expandableLayoutta5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta5);
        expandableLayoutta5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonta6(View view) {
        expandableLayoutta6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutta6);
        expandableLayoutta6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonts1(View view) {
        expandableLayoutts1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts1);
        expandableLayoutts1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonts2(View view) {
        expandableLayoutts2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts2);
        expandableLayoutts2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonts3(View view) {
        expandableLayoutts3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts3);
        expandableLayoutts3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonts4(View view) {
        expandableLayoutts4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts4);
        expandableLayoutts4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonts5(View view) {
        expandableLayoutts5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts5);
        expandableLayoutts5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonts6(View view) {
        expandableLayoutts6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutts6);
        expandableLayoutts6.toggle(); // toggle expand and collapse
    }

    public void expandableButtontm1(View view) {
        expandableLayouttm1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm1);
        expandableLayouttm1.toggle(); // toggle expand and collapse
    }
    public void expandableButtontm2(View view) {
        expandableLayouttm2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm2);
        expandableLayouttm2.toggle(); // toggle expand and collapse
    }
    public void expandableButtontm3(View view) {
        expandableLayouttm3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm3);
        expandableLayouttm3.toggle(); // toggle expand and collapse
    }
    public void expandableButtontm4(View view) {
        expandableLayouttm4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm4);
        expandableLayouttm4.toggle(); // toggle expand and collapse
    }
    public void expandableButtontm5(View view) {
        expandableLayouttm5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm5);
        expandableLayouttm5.toggle(); // toggle expand and collapse
    }
    public void expandableButtontm6(View view) {
        expandableLayouttm6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayouttm6);
        expandableLayouttm6.toggle(); // toggle expand and collapse
    }
}