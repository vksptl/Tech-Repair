package com.vikas.gadgetsrepair2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class RecyclerSeven extends RecyclerView.Adapter<RecyclerSeven.ViewHolder> {

    static List<DatabaseModel> dbList;
    static Context context;
    RecyclerSeven(Context context, List<DatabaseModel> dbList ){
        this.dbList = new ArrayList<DatabaseModel>();
        this.context = context;
        this.dbList = dbList;

    }

    @Override
    public RecyclerSeven.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_row6, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerSeven.ViewHolder holder, int position) {

        holder.name.setText(dbList.get(position).getPart());

    }

    @Override
    public int getItemCount() {
        return dbList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView name;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            name = (TextView) itemLayoutView
                    .findViewById(R.id.rvname6);
            // itemLayoutView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
