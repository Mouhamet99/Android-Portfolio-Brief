package com.simplonsn.dwwm.androidportfoliobrief.sideBarMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplonsn.dwwm.androidportfoliobrief.R;

import java.util.List;

public class SideBarMenuAdapter extends RecyclerView.Adapter<SideBarMenuAdapter.ViewHolder> {
    //List of data
    private List<MenuItem> dataSet ;


    // Constructor
    public SideBarMenuAdapter(List<MenuItem> dataSet) {
        this.dataSet = dataSet;
    }



  /*  public void setDataSet(List<MenuItem> dataSet) {
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }*/
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view which defines the UI of the list item menu
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }
    /**/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.icon.setImageResource(dataSet.get(position).getIcon());
        if (holder.is_selected_icon.isSelected())
            holder.is_selected_icon.setVisibility(View.VISIBLE);
        else
            holder.is_selected_icon.setVisibility(View.INVISIBLE);
    }
    /*
    *Retrieve the size of our data
     */
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
    /*
    * Handle Layout of each item
    * */
    public static  class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView icon ,is_selected_icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.home_icon);
            is_selected_icon = (ImageView) itemView.findViewById(R.id.is_selected_icon);
        }

    }

    }

