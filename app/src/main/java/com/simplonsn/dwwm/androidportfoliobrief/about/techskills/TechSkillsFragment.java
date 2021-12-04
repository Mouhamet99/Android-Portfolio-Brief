package com.simplonsn.dwwm.androidportfoliobrief.about.techskills;

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
 * Use the {@link TechSkillsFragment} factory method to
 * create an instance of this fragment.
 */
public class TechSkillsFragment extends Fragment {
    List<TechSkillsItem> dataTechSkills;
    RecyclerView rv_tech_skills;
    TechSkillsAdapter adapter;

    public TechSkillsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //TOD0: Locate our recyclerView
        rv_tech_skills = view.findViewById(R.id.tech_skills_rv);

        dataTechSkills = new ArrayList<>();
        dataTechSkills.add(new TechSkillsItem("HTML & CSS", 80));
        dataTechSkills.add(new TechSkillsItem("JavaScript", 90));
        dataTechSkills.add(new TechSkillsItem("PHP/Symfony", 70));
        dataTechSkills.add(new TechSkillsItem("JAVA", 75));  dataTechSkills.add(new TechSkillsItem("HTML & CSS", 80));
        dataTechSkills.add(new TechSkillsItem("JavaScript", 90));
        dataTechSkills.add(new TechSkillsItem("PHP/Symfony", 70));
        dataTechSkills.add(new TechSkillsItem("JAVA", 75));
//         rv_tech_skills.setHasFixedSize(false);
        adapter = new TechSkillsAdapter(dataTechSkills);
        rv_tech_skills.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_tech_skills.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tech_skills, container, false);
    }
}