package com.example.nfp_produce.rider.riderUi.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nfp_produce.R;


public class RiderProfile extends Fragment {

    public RiderProfile() {
        // Required empty public constructor
    }

    public static RiderProfile newInstance() {
        return new RiderProfile();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rider_profile, container, false);
    }
}