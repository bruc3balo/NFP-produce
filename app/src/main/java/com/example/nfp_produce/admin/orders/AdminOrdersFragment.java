package com.example.nfp_produce.admin.orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;

public class AdminOrdersFragment extends Fragment {

    public AdminOrdersFragment() {
        // Required empty public constructor
    }

    public static AdminOrdersFragment newInstance() {

        return new AdminOrdersFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_orders, container, false);
    }
}