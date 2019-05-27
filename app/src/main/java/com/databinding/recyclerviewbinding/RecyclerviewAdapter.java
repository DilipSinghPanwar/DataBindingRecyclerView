package com.databinding.recyclerviewbinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.databinding.R;
import com.databinding.beans.Datum;
import com.databinding.beans.Users;
import com.databinding.databinding.RowRecylerviewBinding;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater layoutInflater;
    public RowRecylerviewBinding binding;
    private Users users;

    public RecyclerviewAdapter(Context mContext, Users users) {
        this.mContext = mContext;
        this.users = users;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.binding.setDatum(users.getData().get(position));
        Datum rowModel = users.getData().get(position);
//        binding.tvTitle.setText(rowModel.getFirstName());
//        binding.tvBody.setText(rowModel.getLastName());
        holder.bind(rowModel);
    }

    @Override
    public int getItemCount() {
        return users.getData().size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.row_recylerview, parent, false);
        return new MyViewHolder(binding);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RowRecylerviewBinding binding;
        public MyViewHolder(RowRecylerviewBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
        public void bind(Datum rowModel){
            binding.setDatum(rowModel);
        }
    }
}