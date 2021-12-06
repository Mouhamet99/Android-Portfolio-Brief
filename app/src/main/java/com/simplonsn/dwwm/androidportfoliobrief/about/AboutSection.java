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
import com.simplonsn.dwwm.androidportfoliobrief.about.softskills.SoftSkillsFragment;
import com.simplonsn.dwwm.androidportfoliobrief.about.techskills.TechSkillsFragment;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class AboutSection extends Fragment {

    public AboutSection() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: Inflate techskills fragment inside their appropriate container
    /*    Fragment techSkillFragment = new TechSkillsFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.container_tech_skills, techSkillFragment).commit();*/
        //TODO: Inflate softskills fragment inside their appropriate container
        Fragment softSkillFragment = new SoftSkillsFragment();
        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();
        transaction2.add(R.id.container_soft_skills, softSkillFragment).commit();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_section, container, false);
        return view;
    }
}