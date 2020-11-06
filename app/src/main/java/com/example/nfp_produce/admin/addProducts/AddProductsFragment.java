package com.example.nfp_produce.admin.addProducts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;

public class AddProductsFragment extends Fragment {


    public AddProductsFragment() {
        // Required empty public constructor
    }

    public static AddProductsFragment newInstance() {

        return new AddProductsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_products, container, false);
    }
}