package example.app.com.education;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_container,new LibraryFragment());
        ft.commit();
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
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new AboutusFragment());
            ft.commit();
        } else if (id == R.id.nav_Detail) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new DetailFragment());
            ft.commit();
        } else if (id == R.id.nav_page){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new PageFragment());
            ft.commit();
        } else if (id == R.id.nav_photography){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new PhotographyFragment());
            ft.commit();
        }else if (id == R.id.tabs){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new TwotabFragment());
            ft.commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();




         if (id == R.id.nav_profile) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frame_container,new ProfileFragment());
            ft.commit();

        } else if (id == R.id.nav_library) {
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new LibraryFragment());
             ft.commit();

        } else if (id == R.id.nav_mycource) {
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new MycourceFragment());
             ft.commit();

        } else if (id == R.id.nav_features) {
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new FeaturesFragment());
             ft.commit();

        } else if (id == R.id.nav_mywishlist) {
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new WishlistFragment());
             ft.commit();

        } else if (id == R.id.nav_setting){
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new SettingFragment());
             ft.commit();
        } else if (id == R.id.nav_welcome){
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new WelcomeFragment());
             ft.commit();
         }else if (id == R.id.nav_interest){
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new InterestFragment());
             ft.commit();
         } else if (id == R.id.nav_choose){
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.frame_container,new TabFragment());
             ft.commit();
         }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
