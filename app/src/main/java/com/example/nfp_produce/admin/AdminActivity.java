package com.example.nfp_produce.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.addNewProduct.NewProductFragment;
import com.example.nfp_produce.admin.addProducts.AddProductsFragment;
import com.example.nfp_produce.admin.employees.EmployeesFragment;
import com.example.nfp_produce.admin.logs.LogsFragment;
import com.example.nfp_produce.admin.orders.AdminOrdersFragment;
import com.example.nfp_produce.admin.updates.UpdatesFragment;
import com.example.nfp_produce.admin.users.UsersFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class AdminActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    public static int currentAdminPage;
    public static FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Toolbar toolbar = findViewById(R.id.toolbar_admin);
        setSupportActionBar(toolbar);
        fab = findViewById(R.id.fabAdmin);

       /* switch (currentAdminPage) {
            default:break;

            case 0:
                fab.setVisibility(View.VISIBLE);
                fab.setOnClickListener(view -> Snackbar.make(view, "Add New Product", Snackbar.LENGTH_LONG).setAction("Action", null).show());
                break;

            case 1:
                fab.setVisibility(View.VISIBLE);
                fab.setOnClickListener(view -> Snackbar.make(view, "Add product", Snackbar.LENGTH_LONG).setAction("Action", null).show());
                break;

            case 2:
                fab.setVisibility(View.VISIBLE);
                fab.setOnClickListener(view -> Snackbar.make(view, "Hire Employee", Snackbar.LENGTH_LONG).setAction("Action", null).show());
                break;

            case 3:
                fab.setVisibility(View.GONE);
            case 4:
                fab.setVisibility(View.GONE);
            case 5:
                fab.setVisibility(View.GONE);
                break;
        }*/

        DrawerLayout drawer = findViewById(R.id.drawer_layout_admin);
        NavigationView navigationView = findViewById(R.id.nav_view_admin);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_add_new_products, R.id.nav_add_products, R.id.nav_orders, R.id.nav_employees, R.id.nav_users, R.id.nav_logs).setDrawerLayout(drawer).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_admin);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_admin);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}