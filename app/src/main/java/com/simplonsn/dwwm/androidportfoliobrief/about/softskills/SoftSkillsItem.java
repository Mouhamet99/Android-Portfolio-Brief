package com.simplonsn.dwwm.androidportfoliobrief.about.softskills;

public class SoftSkillsItem {
    private String progressColor;
    private String softSkillLabel;
    private int softSkillProgress;

    public SoftSkillsItem(String progressColor, String softSkillLabel, int softSkillProgress) {
        this.progressColor = progressColor;
        this.softSkillLabel = softSkillLabel;
        this.softSkillProgress = softSkillProgress;
    }

    public String getProgressColor() {
        return progressColor;
    }

    public void setProgressColor(String progressColor) {
        this.progressColor = progressColor;
    }

    public String getSoftSkillLabel() {
        return softSkillLabel;
    }

    public void setSoftSkillLabel(String softSkillLabel) {
        this.softSkillLabel = softSkillLabel;
    }

    public int getSoftSkillProgress() {
        return softSkillProgress;
    }

    public void setSoftSkillProgress(int softSkillProgress) {
        this.softSkillProgress = softSkillProgress;
    }
}
