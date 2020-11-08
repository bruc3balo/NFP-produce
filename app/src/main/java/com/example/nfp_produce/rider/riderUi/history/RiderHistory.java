package com.example.nfp_produce.rider.riderUi.history;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.rider.riderUi.history.adapter.HistoryRvAdapter;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RiderHistory#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RiderHistory extends Fragment {

    private LinkedList<String> history_list = new LinkedList<>();


    public RiderHistory() {
        // Required empty public constructor
    }


    public static RiderHistory newInstance() {
        return new RiderHistory();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v =  inflater.inflate(R.layout.fragment_rider_history, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.rider_history_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));

        history_list.add("");
        history_list.add("");
        history_list.add("");

        HistoryRvAdapter historyRvAdapter = new HistoryRvAdapter(requireContext(),history_list);
        recyclerView.setAdapter(historyRvAdapter);

        return v;
    }
}