package com.example.nfp_produce.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.addNewProduct.NewProductFragment;
import com.example.nfp_produce.admin.addProducts.AddProductsFragment;
import com.example.nfp_produce.admin.employees.EmployeesFragment;
import com.example.nfp_produce.admin.logs.LogsFragment;
import com.example.nfp_produce.admin.orders.AdminOrdersFragment;
import com.example.nfp_produce.admin.updates.UpdatesFragment;
import com.example.nfp_produce.admin.users.UsersFragment;
import com.google.android.material.tabs.TabLayout;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        //Tabs // ViewPager
        AdminTabAdapter pageAdapter = new AdminTabAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.adminPager);
        viewPager.setAdapter(pageAdapter);
        TabLayout tabs = findViewById(R.id.adminTabs);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    default:
                    case 0:
                        tab.setText("New Product");
                    case 1:
                        tab.setText("Add Product");
                    case 2:
                        tab.setText("Employees");
                    case 3:
                        tab.setText("Orders");
                    case 4:
                        tab.setText("Updates");
                    case 5:
                        tab.setText("Logs");
                    case 6:
                        tab.setText("Users");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setText("");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabs.setupWithViewPager(viewPager);



    }
}