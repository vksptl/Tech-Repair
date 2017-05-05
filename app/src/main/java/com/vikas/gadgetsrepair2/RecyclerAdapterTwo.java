package com.vikas.gadgetsrepair2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.vikas.gadgetsrepair2.DatabaseModel2;
import com.vikas.gadgetsrepair2.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterTwo extends RecyclerView.Adapter<RecyclerAdapterTwo.ViewHolder> {

    static   List<DatabaseModel2> dbList;
    static  Context context;
    RecyclerAdapterTwo(Context context, List<DatabaseModel2> dbList ){
        this.dbList = new ArrayList<DatabaseModel2>();
        this.context = context;
        this.dbList = dbList;

    }

    @Override
    public RecyclerAdapterTwo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_shops,parent,false);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterTwo.ViewHolder holder, int position) {

        holder.name.setText(dbList.get(position).getName());
        holder.address.setText(dbList.get(position).getAddress());
        holder.phone.setText(dbList.get(position).getPhone());
        String s = dbList.get(position).getRating();
        Float f= Float.parseFloat(s);
        holder.rating.setRating(f);

    }

    @Override
    public int getItemCount() {
        return dbList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView name,address,phone;
        public  RatingBar rating;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            name = (TextView) itemLayoutView
                    .findViewById(R.id.textViewNameh);
            address = (TextView)itemLayoutView.findViewById(R.id.textViewVersionh);
            phone=(TextView)itemLayoutView.findViewById(R.id.textViewVerh);
            rating=(RatingBar)itemLayoutView.findViewById(R.id.rb_vvmh);
            itemLayoutView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,Appointment.class);
            String name = dbList.get(getAdapterPosition()).getAgent();
            intent.putExtra("name", name);
            context.startActivity(intent);
            Toast.makeText(RecyclerAdapterTwo.context, "you have clicked Row " + getAdapterPosition(), Toast.LENGTH_LONG).show();
        }
    }
}
