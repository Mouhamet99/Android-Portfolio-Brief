package com.simplonsn.dwwm.androidportfoliobrief.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simplonsn.dwwm.androidportfoliobrief.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeSection#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeSection extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_section, container, false);
    }
}