package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    private GadgetsAdapter adapter;
    private List<Gadget> gadgetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        initCollapsingToolbar();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Query.class);
                startActivity(in);

              /*  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        gadgetList = new ArrayList<>();
        adapter = new GadgetsAdapter(this, gadgetList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if (position == 0) {
                            Intent in = new Intent(MainActivity.this, DesktopParts.class);
                            startActivity(in);
                        } else if (position == 1) {
                            Intent in = new Intent(MainActivity.this, LaptopParts.class);
                            startActivity(in);
                        } else if (position == 2) {
                            Intent in = new Intent(MainActivity.this, MobileParts.class);
                            startActivity(in);
                        } else if (position == 3) {
                            Intent in = new Intent(MainActivity.this, TabletParts.class);
                            startActivity(in);
                        } else if (position == 4) {
                            Intent in = new Intent(MainActivity.this, CameraParts.class);
                            startActivity(in);
                        } else if (position == 5) {
                            Intent in = new Intent(MainActivity.this, GameParts.class);
                            startActivity(in);
                        }
                        else if (position == 6) {
                            Intent in = new Intent(MainActivity.this, WatchParts.class);
                            startActivity(in);
                        } else if (position == 7) {
                            Intent in = new Intent(MainActivity.this, TrackerParts.class);
                            startActivity(in);
                        }
                        Toast toast=Toast.makeText(getApplicationContext(),"Hello Javatpoint"+position,Toast.LENGTH_SHORT);
                        toast.show();

                    }

                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent in = new Intent(MainActivity.this,Settings.class);
            startActivity(in);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent in = new Intent(MainActivity.this, Profile.class);
            startActivity(in);

        } else if (id == R.id.nav_gallery) {

            Intent in = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(in);


        } else if (id == R.id.nav_map) {

            Intent in = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(in);


        }
        else if (id == R.id.nav_slideshow) {
            Intent in = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(in);
        } else if (id == R.id.nav_manage) {
            Intent in = new Intent(MainActivity.this, Shops.class);
            startActivity(in);
        } else if (id == R.id.nav_share) {
            Intent in = new Intent(MainActivity.this, Query.class);
            startActivity(in);

        } else if (id == R.id.nav_send) {
            Intent in = new Intent(MainActivity.this, Contact.class);
            startActivity(in);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.gadget0,
                R.drawable.mac,
                R.drawable.mob,
                R.drawable.gadget4,
                R.drawable.gadget5,
                R.drawable.gadget6,
                R.drawable.gadget7,
                R.drawable.gadget8,
               };

        Gadget a = new Gadget("Desktop",8, covers[0]);
        gadgetList.add(a);

        a = new Gadget("Laptop", 10, covers[1]);
        gadgetList.add(a);

        a = new Gadget("Mobile", 15, covers[2]);
        gadgetList.add(a);

        a = new Gadget("Tablet", 7, covers[3]);
        gadgetList.add(a);

        a = new Gadget("Camera", 5, covers[4]);
        gadgetList.add(a);

        a = new Gadget("Gaming Device", 4, covers[5]);
        gadgetList.add(a);

        a = new Gadget("SmartWatch", 4, covers[6]);
        gadgetList.add(a);

        a = new Gadget("Fitness Tracker", 3, covers[7]);
        gadgetList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }


}
