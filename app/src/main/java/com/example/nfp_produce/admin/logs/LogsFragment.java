package com.example.nfp_produce.admin.logs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.logs.adapter.LogsRvAdapter;

import java.util.LinkedList;


public class LogsFragment extends Fragment {

    private LinkedList<String> logs_list = new LinkedList<>();

    public LogsFragment() {
        // Required empty public constructor
    }

    public static LogsFragment newInstance() {

        return new LogsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_logs, container, false);

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.logs_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));

        logs_list.add("");
        logs_list.add("");
        logs_list.add("");

        LogsRvAdapter logsRvAdapter = new LogsRvAdapter(requireContext(),logs_list);
        recyclerView.setAdapter(logsRvAdapter);

        return v;
    }

}