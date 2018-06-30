package org.login.com.recyclerviewexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.login.com.recyclerviewexample.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {


    List<String> userList;

    public UserAdapter(List<String> userList) {
        this.userList = userList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTvName;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTvName = itemView.findViewById(R.id.rv_userlist);
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(
                LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.item_user, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String user = userList.get(position);
        holder.mTvName.setText(user);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

}
