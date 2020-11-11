package com.example.nfp_produce.admin.addNewProduct;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.addNewProduct.adapter.NewProductRvAdapter;
import com.google.android.material.snackbar.Snackbar;

import java.util.LinkedList;

import static com.example.nfp_produce.admin.AdminActivity.currentAdminPage;
import static com.example.nfp_produce.admin.AdminActivity.fab;

public class NewProductFragment extends Fragment {

    private LinkedList<String> new_product_list = new LinkedList<>();

    public NewProductFragment() {
        // Required empty public constructor

    }


    public static NewProductFragment newInstance() {

        return new NewProductFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_new_product, container, false);

        currentAdminPage = 0;
        fab.setVisibility(View.VISIBLE);
        fab.setOnClickListener(view -> Snackbar.make(view, "Add New Product", Snackbar.LENGTH_LONG).setAction("Action", null).show());

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.new_product_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));

        new_product_list.add("");
        new_product_list.add("");
        new_product_list.add("");

        NewProductRvAdapter newProductFragment = new NewProductRvAdapter(requireContext(),new_product_list);
        recyclerView.setAdapter(newProductFragment);

        return v;
    }
}