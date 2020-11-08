package com.example.nfp_produce.rider.riderUi.jobs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.rider.riderUi.jobs.adapter.JobsRvAdapter;

import java.util.LinkedList;


public class RiderJobs extends Fragment {

    private LinkedList<String> job_list = new LinkedList<>();

    public RiderJobs() {
        // Required empty public constructor
    }


    public static RiderJobs newInstance() {
        return new RiderJobs();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_rider_jobs, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.rider_jobs_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));

        job_list.add("");
        job_list.add("");
        job_list.add("");

        JobsRvAdapter jobsRvAdapter = new JobsRvAdapter(requireContext(), job_list);
        recyclerView.setAdapter(jobsRvAdapter);


        return v;
    }
}