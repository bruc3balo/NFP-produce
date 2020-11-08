package com.example.nfp_produce.admin.employees;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.employees.adapter.EmployeeRvAdapter;

import java.util.LinkedList;

public class EmployeesFragment extends Fragment {

    private LinkedList<String> employeeList = new LinkedList<>();

    public EmployeesFragment() {
    }

    public static EmployeesFragment newInstance() {
        return new EmployeesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_emplyees, container, false);

        //Rv
        RecyclerView recyclerView = v.findViewById(R.id.employee_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));

        employeeList.add("");
        employeeList.add("");
        employeeList.add("");

        EmployeeRvAdapter employeeRvAdapter = new EmployeeRvAdapter(requireContext(), employeeList);
        recyclerView.setAdapter(employeeRvAdapter);

        return v;
    }

}