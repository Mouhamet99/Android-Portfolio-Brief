package com.simplonsn.dwwm.androidportfoliobrief.about.softskills;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.List;

public class SoftskillsAdapter extends RecyclerView.Adapter<SoftskillsAdapter.ViewHolderSoftSkills>{
    List<SoftSkillsItem> dataSoftSkills;

    public SoftskillsAdapter(List<SoftSkillsItem> dataSoftSkills) {
        this.dataSoftSkills = dataSoftSkills;
    }

    @NonNull
    @Override
    public ViewHolderSoftSkills onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //TODO: Inflate view inside RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soft_skills_item, parent, false);
        return new ViewHolderSoftSkills(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSoftSkills holder, int position) {
        //TODO: Link view variable to appropriate data
        holder.softSkillsProgress.setProgress(dataSoftSkills.get(position).getSoftSkillProgress());
        holder.softSkillsLabel.setText(dataSoftSkills.get(position).getSoftSkillLabel());
        holder.softSkillsColor.setText(dataSoftSkills.get(position).getProgressColor());
    }

    @Override
    public int getItemCount() {
      return dataSoftSkills.size();
    }

    public class ViewHolderSoftSkills extends RecyclerView.ViewHolder {
        //TODO: Locate and initialize view variable to their own view
        private ProgressBar softSkillsProgress ;
        private TextView softSkillsLabel;
        private TextView softSkillsColor;
        public ViewHolderSoftSkills(@NonNull View itemView) {
            super(itemView);
            softSkillsLabel = itemView.findViewById(R.id.soft_skills_text_view);
            softSkillsProgress = itemView.findViewById(R.id.soft_skills_progress_bar);
            softSkillsColor = itemView.findViewById(R.id.soft_skills_progress_color);
        }
    }
}
