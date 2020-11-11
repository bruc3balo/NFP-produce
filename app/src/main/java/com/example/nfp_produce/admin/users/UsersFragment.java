package com.example.nfp_produce.admin.users;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.users.adapter.UsersRvAdapter;
import static com.example.nfp_produce.admin.AdminActivity.currentAdminPage;
import static com.example.nfp_produce.admin.AdminActivity.fab;

import java.util.LinkedList;


public class UsersFragment extends Fragment {

    private final LinkedList<String> user_list = new LinkedList<>();

    public UsersFragment() {
        // Required empty public constructor
    }

    public static UsersFragment newInstance() {
        return new UsersFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View v = inflater.inflate(R.layout.fragment_users, container, false);

        currentAdminPage = 6;
        fab.setVisibility(View.GONE);

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.users_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));

        user_list.add("");
        user_list.add("");
        user_list.add("");

        UsersRvAdapter usersRvAdapter = new UsersRvAdapter(requireContext(), user_list);
        recyclerView.setAdapter(usersRvAdapter);

        return v;
    }

}