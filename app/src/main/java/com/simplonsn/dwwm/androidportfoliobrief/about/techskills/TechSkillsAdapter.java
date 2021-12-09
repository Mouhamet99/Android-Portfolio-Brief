package com.simplonsn.dwwm.androidportfoliobrief.about.techskills;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.ArrayList;
import java.util.List;


public class TechSkillsAdapter extends RecyclerView.Adapter<TechSkillsAdapter.ViewHolderTechSkills> {
    List<TechSkillsItem> dataTechSkills;

    public TechSkillsAdapter(List<TechSkillsItem> dataTechSkills) {
        this.dataTechSkills = dataTechSkills;
    }

    @NonNull
    @Override
    public ViewHolderTechSkills onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tech_skills_item, parent, false);
        return new ViewHolderTechSkills(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTechSkills holder, int position) {
        //TODO: link  attributes to appopriates class methods to get their data
        holder.tech_skills_item_label.setText(dataTechSkills.get(position).getTechSkillsLabel());
        holder.TechSkillsProgress.setProgress(dataTechSkills.get(position).getPercentage());
    }

    @Override
    public int getItemCount() {
        return dataTechSkills.size();
    }

    public class ViewHolderTechSkills extends RecyclerView.ViewHolder {
        //TODO: Create Views Variables ,  Locate  and Initialize them
        private final TextView tech_skills_item_label;
        private ProgressBar TechSkillsProgress;

        public ViewHolderTechSkills(@NonNull View itemView) {
            super(itemView);
            tech_skills_item_label = itemView.findViewById(R.id.tech_skills_label);
            TechSkillsProgress = itemView.findViewById(R.id.tech_skills_progress_bar);
        }
    }
}