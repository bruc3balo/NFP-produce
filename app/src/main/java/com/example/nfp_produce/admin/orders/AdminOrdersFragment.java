package com.example.nfp_produce.admin.orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.orders.adapter.AdminOrdersRvAdapter;

import java.util.LinkedList;

public class AdminOrdersFragment extends Fragment {

    private LinkedList<String> orders_list = new LinkedList<>();

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
        final View v = inflater.inflate(R.layout.fragment_admin_orders, container, false);
        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.orders_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));

        orders_list.add("");
        orders_list.add("");
        orders_list.add("");

        AdminOrdersRvAdapter adminOrdersRvAdapter = new AdminOrdersRvAdapter(requireContext(),orders_list);
        recyclerView.setAdapter(adminOrdersRvAdapter);
        return v;
    }
}