package com.shaihi.recyclerrecap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context mContext;
    int[] mData;
    public MyAdapter(Context context, int[] data){
        this.mContext = context;
        this.mData = data;
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.mTv.setText(String.valueOf(this.mData[i]));
    }

    @Override
    public int getItemCount() {
        return this.mData.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mTv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.itemTv);
        }
    }
}
