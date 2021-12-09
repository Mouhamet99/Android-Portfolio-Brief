package com.simplonsn.dwwm.androidportfoliobrief.about.softskills;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SoftSkillsFragment} factory method to
 * create an instance of this fragment.
 */
public class SoftSkillsFragment extends Fragment {
    List<SoftSkillsItem> dataSoftSkills;
    SoftskillsAdapter softskillsAdapter;
    RecyclerView rvSoftSkills;

    public SoftSkillsFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //TODO: Locate view
        rvSoftSkills = view.findViewById(R.id.rv_soft_skills);
        dataSoftSkills = new ArrayList<>();
        dataSoftSkills.add(new SoftSkillsItem("#000", "Autonomic",95));
        dataSoftSkills.add(new SoftSkillsItem("#cecece", "Communication",85));
        softskillsAdapter = new SoftskillsAdapter(dataSoftSkills);
        rvSoftSkills.setLayoutManager(new LinearLayoutManager(getContext()));
        rvSoftSkills.setAdapter(softskillsAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_soft_skills, container, false);

    }
}