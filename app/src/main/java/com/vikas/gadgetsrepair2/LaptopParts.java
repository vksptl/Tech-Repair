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
public class LaptopParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayoutla1, expandableLayoutla2, expandableLayoutla3, expandableLayoutla4,expandableLayoutla5, expandableLayoutla6;
    ExpandableLinearLayout expandableLayoutld1, expandableLayoutld2, expandableLayoutld3, expandableLayoutld4,expandableLayoutld5, expandableLayoutld6;
    ExpandableLinearLayout expandableLayoutlh1, expandableLayoutlh2, expandableLayoutlh3, expandableLayoutlh4,expandableLayoutlh5, expandableLayoutlh6;
    ExpandableLinearLayout expandableLayoutll1, expandableLayoutll2, expandableLayoutll3, expandableLayoutll4,expandableLayoutll5, expandableLayoutll6;
    ExpandableLinearLayout expandableLayoutlaa1, expandableLayoutlaa2, expandableLayoutlaa3, expandableLayoutlaa4,expandableLayoutlaa5, expandableLayoutlaa6;
    ExpandableLinearLayout expandableLayoutlt1, expandableLayoutlt2, expandableLayoutlt3, expandableLayoutlt4,expandableLayoutlt5, expandableLayoutlt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager2);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs2);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new LapOneFrag(), "APPLE");
        adapter.addFragment(new LapTwoFrag(), "DELL");
        adapter.addFragment(new LapThreeFrag(), "HP");
        adapter.addFragment(new LapFourFrag(), "LENOVO");
        adapter.addFragment(new LapFiveFrag(), "ASUS");
        adapter.addFragment(new LapSixFrag(), "TOSHIBA");
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

    public void expandableButtonla1(View view) {
        expandableLayoutla1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla1);
        expandableLayoutla1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonla2(View view) {
        expandableLayoutla2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla2);
        expandableLayoutla2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonla3(View view) {
        expandableLayoutla3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla3);
        expandableLayoutla3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonla4(View view) {
        expandableLayoutla4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla4);
        expandableLayoutla4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonla5(View view) {
        expandableLayoutla5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla5);
        expandableLayoutla5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonla6(View view) {
        expandableLayoutla6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutla6);
        expandableLayoutla6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonlaa1(View view) {
        expandableLayoutlaa1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa1);
        expandableLayoutlaa1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlaa2(View view) {
        expandableLayoutlaa2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa2);
        expandableLayoutlaa2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlaa3(View view) {
        expandableLayoutlaa3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa3);
        expandableLayoutlaa3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlaa4(View view) {
        expandableLayoutlaa4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa4);
        expandableLayoutlaa4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlaa5(View view) {
        expandableLayoutlaa5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa5);
        expandableLayoutlaa5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlaa6(View view) {
        expandableLayoutlaa6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlaa6);
        expandableLayoutlaa6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonlh1(View view) {
        expandableLayoutlh1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh1);
        expandableLayoutlh1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlh2(View view) {
        expandableLayoutlh2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh2);
        expandableLayoutlh2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlh3(View view) {
        expandableLayoutlh3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh3);
        expandableLayoutlh3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlh4(View view) {
        expandableLayoutlh4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh4);
        expandableLayoutlh4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlh5(View view) {
        expandableLayoutlh5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh5);
        expandableLayoutlh5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlh6(View view) {
        expandableLayoutlh6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlh6);
        expandableLayoutlh6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonlt1(View view) {
        expandableLayoutlt1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt1);
        expandableLayoutlt1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlt2(View view) {
        expandableLayoutlt2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt2);
        expandableLayoutlt2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlt3(View view) {
        expandableLayoutlt3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt3);
        expandableLayoutlt3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlt4(View view) {
        expandableLayoutlt4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt4);
        expandableLayoutlt4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlt5(View view) {
        expandableLayoutlt5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt5);
        expandableLayoutlt5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonlt6(View view) {
        expandableLayoutlt6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutlt6);
        expandableLayoutlt6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonld1(View view) {
        expandableLayoutld1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld1);
        expandableLayoutld1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonld2(View view) {
        expandableLayoutld2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld2);
        expandableLayoutla2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonld3(View view) {
        expandableLayoutld3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld3);
        expandableLayoutld3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonld4(View view) {
        expandableLayoutld4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld4);
        expandableLayoutld4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonld5(View view) {
        expandableLayoutld5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld5);
        expandableLayoutld5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonld6(View view) {
        expandableLayoutld6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutld6);
        expandableLayoutld6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonll1(View view) {
        expandableLayoutll1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll1);
        expandableLayoutll1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonll2(View view) {
        expandableLayoutll2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll2);
        expandableLayoutll2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonll3(View view) {
        expandableLayoutll3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll3);
        expandableLayoutll3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonll4(View view) {
        expandableLayoutll4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll4);
        expandableLayoutll4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonll5(View view) {
        expandableLayoutll5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll5);
        expandableLayoutll5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonll6(View view) {
        expandableLayoutll6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutll6);
        expandableLayoutll6.toggle(); // toggle expand and collapse
    }
}