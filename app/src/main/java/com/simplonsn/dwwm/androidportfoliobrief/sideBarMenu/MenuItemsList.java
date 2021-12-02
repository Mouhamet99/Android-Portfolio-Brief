package com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.ArrayList;
import java.util.List;

public class MenuItemsList {
    public static final int HOME_SECTION = 0;
    public static final int ABOUT_SECTION = 0;
    public static final int WORKS_SECTION = 0;
    public static final int CONTACT_SECTION = 0;
    public static List<MenuItem> getMenuItemsList() {
    List<MenuItem> dataSet = new ArrayList<>();
        dataSet.add(new MenuItem(R.drawable.ic_baseline_home_24, HOME_SECTION, true));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_home_24, ABOUT_SECTION, false));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_home_24, WORKS_SECTION, false));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_home_24, CONTACT_SECTION, false));
        return dataSet;
    }
}
