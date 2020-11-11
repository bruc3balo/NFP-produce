package com.example.nfp_produce.admin.updates;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.updates.adapter.UpdatesRvAdapter;
import static com.example.nfp_produce.admin.AdminActivity.currentAdminPage;
import static com.example.nfp_produce.admin.AdminActivity.fab;

import java.util.LinkedList;


public class UpdatesFragment extends Fragment {

    private LinkedList<String> updates_list = new LinkedList<>();

    public UpdatesFragment() {
        // Required empty public constructor
    }


    public static UpdatesFragment newInstance() {
        return new UpdatesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_updates, container, false);

        currentAdminPage = 5;
        fab.setVisibility(View.GONE);

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.admin_updates_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));

        updates_list.add("");
        updates_list.add("");
        updates_list.add("");

        UpdatesRvAdapter updatesRvAdapter = new UpdatesRvAdapter(requireContext(),updates_list);
        recyclerView.setAdapter(updatesRvAdapter);

        return v;
    }
}