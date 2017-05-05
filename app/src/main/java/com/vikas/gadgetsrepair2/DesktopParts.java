package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.github.aakira.expandablelayout.ExpandableLinearLayout;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.vikas.gadgetsrepair2.R;
import com.vikas.gadgetsrepair2.Onefragment;
import com.vikas.gadgetsrepair2.ThirdFragment;
import com.vikas.gadgetsrepair2.TwoFragment;

public class DesktopParts extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TextView t1,t2;
    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4;
    ExpandableLinearLayout expandableLayout11, expandableLayout22, expandableLayout33, expandableLayout44,expandableLayout55, expandableLayout66;
    ExpandableLinearLayout expandableLayout_s1, expandableLayout_s2, expandableLayout_s3, expandableLayout_s4,expandableLayout_s5, expandableLayout_s6;
    ExpandableLinearLayout expandableLayout_l1, expandableLayout_l2, expandableLayout_l3, expandableLayout_l4,expandableLayout_l5, expandableLayout_l6;
    ExpandableLinearLayout expandableLayout_h1, expandableLayout_h2, expandableLayout_h3, expandableLayout_h4,expandableLayout_h5, expandableLayout_h6;
    ExpandableLinearLayout expandableLayout_d1, expandableLayout_d2, expandableLayout_d3, expandableLayout_d4,expandableLayout_d5, expandableLayout_d6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop_parts);
        t1= (TextView) findViewById(R.id.f1t1);
        t2= (TextView) findViewById(R.id.f1t2);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Onefragment(), "APPLE");
        adapter.addFragment(new TwoFragment(), "ASUS");
        adapter.addFragment(new ThirdFragment(), "SAMSUNG");
        adapter.addFragment(new FourFragment(), "LENOVO");
        adapter.addFragment(new FiveFragment(), "HP");
        adapter.addFragment(new SixFragment(), "DELL");
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
    public void expandableButton1(View view) {
        expandableLayout1 = (ExpandableRelativeLayout)findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle(); // toggle expand and collapse
    }

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout)findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout)findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout)findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }
    public void expandableButton11(View view) {
        expandableLayout11 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout11);
        expandableLayout11.toggle(); // toggle expand and collapse
    }
    public void expandableButton22(View view) {
        expandableLayout22 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout22);
        expandableLayout22.toggle(); // toggle expand and collapse
    }

    public void expandableButton33(View view) {
        expandableLayout33 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout33);
        expandableLayout33.toggle(); // toggle expand and collapse
    }

    public void expandableButton44(View view) {
        expandableLayout44 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout44);
        expandableLayout44.toggle(); // toggle expand and collapse
    }

    public void expandableButton55(View view) {
        expandableLayout55 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout55);
        expandableLayout55.toggle(); // toggle expand and collapse
    }

    public void expandableButton66(View view) {
        expandableLayout66 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout66);
        expandableLayout66.toggle(); // toggle expand and collapse
    }

    public void expandableButton_s1(View view) {
        expandableLayout_s1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s1);
        expandableLayout_s1.toggle(); // toggle expand and collapse
    }
    public void expandableButton_s2(View view) {
        expandableLayout_s2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s2);
        expandableLayout_s2.toggle(); // toggle expand and collapse
    }
    public void expandableButton_s3(View view) {
        expandableLayout_s3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s3);
        expandableLayout_s3.toggle(); // toggle expand and collapse
    }
    public void expandableButton_s4(View view) {
        expandableLayout_s4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s4);
        expandableLayout_s4.toggle(); // toggle expand and collapse
    }
    public void expandableButton_s5(View view) {
        expandableLayout_s5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s5);
        expandableLayout_s5.toggle(); // toggle expand and collapse
    }
    public void expandableButton_s6(View view) {
        expandableLayout_s6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_s6);
        expandableLayout_s6.toggle(); // toggle expand and collapse
    }

    public void expandableButton_h1(View view) {
        expandableLayout_h1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h1);
        expandableLayout_h1.toggle(); // toggle expand and collapse
    }
    public void expandableButton_h2(View view) {
        expandableLayout_h2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h2);
        expandableLayout_h2.toggle(); // toggle expand and collapse
    }
    public void expandableButton_h3(View view) {
        expandableLayout_h3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h3);
        expandableLayout_h3.toggle(); // toggle expand and collapse
    }
    public void expandableButton_h4(View view) {
        expandableLayout_h4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h4);
        expandableLayout_h4.toggle(); // toggle expand and collapse
    }
    public void expandableButton_h5(View view) {
        expandableLayout_h5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h5);
        expandableLayout_h5.toggle(); // toggle expand and collapse
    }
    public void expandableButton_h6(View view) {
        expandableLayout_h6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_h6);
        expandableLayout_h6.toggle(); // toggle expand and collapse
    }

    public void expandableButton_l1(View view) {
        expandableLayout_l1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l1);
        expandableLayout_l1.toggle(); // toggle expand and collapse
    }
    public void expandableButton_l2(View view) {
        expandableLayout_l2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l2);
        expandableLayout_l2.toggle(); // toggle expand and collapse
    }
    public void expandableButton_l3(View view) {
        expandableLayout_l3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l3);
        expandableLayout_l3.toggle(); // toggle expand and collapse
    }
    public void expandableButton_l4(View view) {
        expandableLayout_l4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l4);
        expandableLayout_l4.toggle(); // toggle expand and collapse
    }
    public void expandableButton_l5(View view) {
        expandableLayout_l5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l5);
        expandableLayout_l5.toggle(); // toggle expand and collapse
    }
    public void expandableButton_l6(View view) {
        expandableLayout_l6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_l6);
        expandableLayout_l6.toggle(); // toggle expand and collapse
    }

    public void expandableButton_d1(View view) {
        expandableLayout_d1 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d1);
        expandableLayout_d1.toggle(); // toggle expand and collapse
    }
    public void expandableButton_d2(View view) {
        expandableLayout_d2 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d2);
        expandableLayout_d2.toggle(); // toggle expand and collapse
    }
    public void expandableButton_d3(View view) {
        expandableLayout_d3 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d3);
        expandableLayout_d3.toggle(); // toggle expand and collapse
    }
    public void expandableButton_d4(View view) {
        expandableLayout_d4 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d4);
        expandableLayout_d4.toggle(); // toggle expand and collapse
    }
    public void expandableButton_d5(View view) {
        expandableLayout_d5 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d5);
        expandableLayout_d5.toggle(); // toggle expand and collapse
    }
    public void expandableButton_d6(View view) {
        expandableLayout_d6 = (ExpandableLinearLayout)findViewById(R.id.expandableLayout_d6);
        expandableLayout_d6.toggle(); // toggle expand and collapse
    }





    public void onf1t1Click(View v) {
        String part="Apple Keyboard with Numeric keypad - US MB110LL-B";
        Intent i = new Intent(getApplicationContext(),
                Shops.class);
        startActivity(i);
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        data.edit().putString("part",part).apply();
    }

    public void onf1t2Click(View v) {
        String part="Bluetooth 3.0 Wireless Keyboard Apple iPad-1 2 3 4 Mac Computer PC Macbook #837";
        Intent i = new Intent(getApplicationContext(),
                Shops.class);
        startActivity(i);
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        data.edit().putString("part",part).apply();
    }

}