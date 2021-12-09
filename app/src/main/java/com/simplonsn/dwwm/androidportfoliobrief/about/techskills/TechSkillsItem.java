package com.simplonsn.dwwm.androidportfoliobrief.about.techskills;

public class TechSkillsItem {
    private String techSkillsLabel;
    private int percentage;

    public TechSkillsItem(String techSkillsLabel, int percentage) {
        this.techSkillsLabel = techSkillsLabel;
        this.percentage = percentage;
    }

    public String getTechSkillsLabel() {
        return techSkillsLabel;
    }

    public void setTechSkillsLabel(String techSkillsLabel) {
        this.techSkillsLabel = techSkillsLabel;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
