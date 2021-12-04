package com.simplonsn.dwwm.androidportfoliobrief.about;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.simplonsn.dwwm.androidportfoliobrief.R;
import com.simplonsn.dwwm.androidportfoliobrief.about.techskills.TechSkillsFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutSection#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutSection extends Fragment {
    RecyclerView recyclerView;

    public AboutSection() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragment techSkillFragment = new TechSkillsFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.container_tech_skills, techSkillFragment).commit();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_section, container, false);

        // Add the following lines to create RecyclerView

//        recyclerView = view.findViewById(R.id.tech_skills_rv);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        recyclerView.setAdapter(new RandomNumListAdapter(1234));

        return view;
    }
}