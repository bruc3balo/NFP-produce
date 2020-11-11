package com.example.nfp_produce.admin.addProducts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.addProducts.adapter.AddProductRvAdapter;
import com.google.android.material.snackbar.Snackbar;

import static com.example.nfp_produce.admin.AdminActivity.currentAdminPage;
import static com.example.nfp_produce.admin.AdminActivity.fab;

import java.util.LinkedList;

public class AddProductsFragment extends Fragment {

    private LinkedList<String> add_product_list = new LinkedList<>();

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
        final View v = inflater.inflate(R.layout.fragment_add_products, container, false);

        currentAdminPage = 1;
        fab.setVisibility(View.VISIBLE);
        fab.setOnClickListener(view -> Snackbar.make(view, "Add product", Snackbar.LENGTH_LONG).setAction("Action", null).show());

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.add_product_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));

        add_product_list.add("");
        add_product_list.add("");
        add_product_list.add("");

        AddProductRvAdapter addProductRvAdapter = new AddProductRvAdapter(requireContext(),add_product_list);
        recyclerView.setAdapter(addProductRvAdapter);

        return v;
    }
}