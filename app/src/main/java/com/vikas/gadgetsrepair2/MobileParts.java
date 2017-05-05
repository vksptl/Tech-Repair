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
public class MobileParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ExpandableLinearLayout expandableLayoutma1, expandableLayoutma2, expandableLayoutma3, expandableLayoutma4,expandableLayoutma5, expandableLayoutma6;
    ExpandableLinearLayout expandableLayoutms1, expandableLayoutms2, expandableLayoutms3, expandableLayoutms4,expandableLayoutms5, expandableLayoutms6;
    ExpandableLinearLayout expandableLayoutmo1, expandableLayoutmo2, expandableLayoutmo3, expandableLayoutmo4,expandableLayoutmo5, expandableLayoutmo6;
    ExpandableLinearLayout expandableLayoutml1, expandableLayoutml2, expandableLayoutml3, expandableLayoutml4,expandableLayoutml5, expandableLayoutml6;
    ExpandableLinearLayout expandableLayoutmm1, expandableLayoutmm2, expandableLayoutmm3, expandableLayoutmm4,expandableLayoutmm5, expandableLayoutmm6;
    ExpandableLinearLayout expandableLayoutmh1, expandableLayoutmh2, expandableLayoutmh3, expandableLayoutmh4,expandableLayoutmh5, expandableLayoutmh6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_parts);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MobOneFrag(), "APPLE");
        adapter.addFragment(new MobTwoFrag(), "SAMSUNG");
        adapter.addFragment(new MobThreeFrag(), "SONY");
        adapter.addFragment(new MobFourFrag(), "MOTO");
        adapter.addFragment(new MobFiveFrag(), "LENOVO");
        adapter.addFragment(new MobSixFrag(), "HTC");
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

    public void expandableButtonma1(View view) {
        expandableLayoutma1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma1);
        expandableLayoutma1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonma2(View view) {
        expandableLayoutma2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma2);
        expandableLayoutma2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonma3(View view) {
        expandableLayoutma3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma3);
        expandableLayoutma3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonma4(View view) {
        expandableLayoutma4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma4);
        expandableLayoutma4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonma5(View view) {
        expandableLayoutma5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma5);
        expandableLayoutma5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonma6(View view) {
        expandableLayoutma6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutma6);
        expandableLayoutma6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonms1(View view) {
        expandableLayoutms1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms1);
        expandableLayoutms1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonms2(View view) {
        expandableLayoutms2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms2);
        expandableLayoutms2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonms3(View view) {
        expandableLayoutms3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms3);
        expandableLayoutms3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonms4(View view) {
        expandableLayoutms4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms4);
        expandableLayoutms4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonms5(View view) {
        expandableLayoutms5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms5);
        expandableLayoutms5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonms6(View view) {
        expandableLayoutms6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutms6);
        expandableLayoutms6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonmo1(View view) {
        expandableLayoutmo1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo1);
        expandableLayoutmo1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmo2(View view) {
        expandableLayoutmo2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo2);
        expandableLayoutmo2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmo3(View view) {
        expandableLayoutmo3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo3);
        expandableLayoutmo3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmo4(View view) {
        expandableLayoutmo4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo4);
        expandableLayoutmo4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmo5(View view) {
        expandableLayoutmo5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo5);
        expandableLayoutmo5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmo6(View view) {
        expandableLayoutmo6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmo6);
        expandableLayoutmo6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonml1(View view) {
        expandableLayoutml1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml1);
        expandableLayoutml1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonml2(View view) {
        expandableLayoutml2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml2);
        expandableLayoutml2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonml3(View view) {
        expandableLayoutml3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml3);
        expandableLayoutml3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonml4(View view) {
        expandableLayoutml4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml4);
        expandableLayoutml4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonml5(View view) {
        expandableLayoutml5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml5);
        expandableLayoutml5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonml6(View view) {
        expandableLayoutml6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutml6);
        expandableLayoutml6.toggle(); // toggle expand and collapse
    }

    public void expandableButtonmh1(View view) {
        expandableLayoutmh1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh1);
        expandableLayoutmh1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmh2(View view) {
        expandableLayoutmh2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh2);
        expandableLayoutmh2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmh3(View view) {
        expandableLayoutmh3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh3);
        expandableLayoutmh3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmh4(View view) {
        expandableLayoutmh4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh4);
        expandableLayoutmh4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmh5(View view) {
        expandableLayoutmh5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh5);
        expandableLayoutmh5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmh6(View view) {
        expandableLayoutmh6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmh6);
        expandableLayoutmh6.toggle(); // toggle expand and collapse
    }


    public void expandableButtonmm1(View view) {
        expandableLayoutmm1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm1);
        expandableLayoutmm1.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmm2(View view) {
        expandableLayoutmm2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm2);
        expandableLayoutmm2.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmm3(View view) {
        expandableLayoutmm3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm3);
        expandableLayoutmm3.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmm4(View view) {
        expandableLayoutmm4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm4);
        expandableLayoutmm4.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmm5(View view) {
        expandableLayoutmm5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm5);
        expandableLayoutmm5.toggle(); // toggle expand and collapse
    }
    public void expandableButtonmm6(View view) {
        expandableLayoutmm6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayoutmm6);
        expandableLayoutmm6.toggle(); // toggle expand and collapse
    }
}