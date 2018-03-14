package com.example.intagpc.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by intag pc on 3/14/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    Context context;
    String[] data;

    public RecyclerViewAdapter(Context context, String[] data) {

        this.context = context;
        this.data = data;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.viewholder_item, parent, false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.textView.setText(data[position]);
    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tvAlphabets);
        }
    }
}
