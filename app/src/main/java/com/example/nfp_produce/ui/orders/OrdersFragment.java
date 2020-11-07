package com.example.nfp_produce.ui.orders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nfp_produce.R;
import com.example.nfp_produce.ui.noifications.adapter.NotificationRvAdapter;
import com.example.nfp_produce.ui.orders.adaper.OrdersRvAdapter;

import java.util.LinkedList;

public class OrdersFragment extends Fragment {

    private OrdersSlideshowViewModel ordersSlideshowViewModel;
    private LinkedList<String> ordersList = new LinkedList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ordersSlideshowViewModel =
                new ViewModelProvider(this).get(OrdersSlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_orders, container, false);

        RecyclerView userNotificationRv = root.findViewById(R.id.ordersRv);
        userNotificationRv.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));

        ordersList.add("");
        ordersList.add("");
        ordersList.add("");

        OrdersRvAdapter ordersRvAdapter = new OrdersRvAdapter(requireContext(), ordersList);
        userNotificationRv.setAdapter(ordersRvAdapter);


        return root;
    }
}