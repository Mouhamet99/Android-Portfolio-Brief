package com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.ArrayList;
import java.util.List;

public class MenuItemsList {
    public static final int HOME_SECTION_CODE = 0;
    public static final int ABOUT_SECTION_CODE = 1;
    public static final int WORKS_SECTION_CODE = 2;
    public static final int CONTACT_SECTION_CODE = 3;
    public static List<MenuItem> getMenuItemsList() {
    List<MenuItem> dataSet = new ArrayList<>();
        dataSet.add(new MenuItem(R.drawable.ic_baseline_home_24, HOME_SECTION_CODE, true));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_person_24, ABOUT_SECTION_CODE, false));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_work_24, WORKS_SECTION_CODE, false));
        dataSet.add(new MenuItem(R.drawable.ic_baseline_contact_mail_24, CONTACT_SECTION_CODE, false));
        return dataSet;
    }
}
