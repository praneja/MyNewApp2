package com.example.prateek.mynewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList arr;
    Context context;

    public CustomAdapter(Context context,ArrayList arr){
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_layout,null,true);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.txtVw.setText(arr.get(position).toString());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Item = " + arr.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtVw;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtVw = (TextView)itemView.findViewById(R.id.txtVw);
        }
    }
}
