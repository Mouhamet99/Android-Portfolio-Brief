package com.simplonsn.dwwm.androidportfoliobrief.contact;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simplonsn.dwwm.androidportfoliobrief.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactSection#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactSection extends Fragment {


    public ContactSection() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_section, container, false);
    }
}