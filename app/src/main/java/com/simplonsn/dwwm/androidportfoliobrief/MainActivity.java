package com.simplonsn.dwwm.androidportfoliobrief;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.simplonsn.dwwm.androidportfoliobrief.home.HomeSection;
import com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu.MenuItem;
import com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu.MenuItemsList;
import com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu.SideBarMenuAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_menu;
    List<MenuItem> dataSet;
    SideBarMenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setUpSideBarMenu();
        // set the default fragment when activity launch
        setHomeFragment();
    }

    private void setUpSideBarMenu() {
        //find current recyclerView by Id
        rv_menu = findViewById(R.id.rv_side_bar_menu);
        dataSet = MenuItemsList.getMenuItemsList();
        adapter = new SideBarMenuAdapter(dataSet);
        rv_menu.setLayoutManager( new LinearLayoutManager(this));
        rv_menu.setAdapter(adapter);

    }


    void setHomeFragment() {

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeSection()).commit();

    }


}
