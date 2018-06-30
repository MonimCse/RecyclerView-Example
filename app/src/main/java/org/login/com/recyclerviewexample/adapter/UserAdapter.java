package org.login.com.recyclerviewexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.login.com.recyclerviewexample.R;
import org.login.com.recyclerviewexample.base.BaseViewHolder;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private static final int KEY_NORMAL = 1;
    private static final int KEY_EMPTY = 0;
    List<String> userList;

    public UserAdapter(List<String> userList) {
        this.userList = userList;
    }

    public class MyViewHolder extends BaseViewHolder {

        TextView mTvName;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTvName = itemView.findViewById(R.id.tv_user);
        }

        @Override
        public void bind(int position) {
            super.bind(position);
            String name = userList.get(position);
            mTvName.setText(name);
        }
    }

    public class EmptyViewHolder extends BaseViewHolder {

        public EmptyViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void bind(int position) {
            super.bind(position);
        }
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {
            case KEY_NORMAL:
                return new MyViewHolder(
                        LayoutInflater.from(parent.getContext()).
                                inflate(R.layout.item_user, parent, false));
            case KEY_EMPTY:
                return new EmptyViewHolder(
                        LayoutInflater.from(parent.getContext()).
                                inflate(R.layout.item_empty, parent, false));
            default:
                return new EmptyViewHolder(
                        LayoutInflater.from(parent.getContext()).
                                inflate(R.layout.item_empty, parent, false));

        }

    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return userList.size()> 0 ? userList.size(): 1 ;
    }

    @Override
    public int getItemViewType(int position) {
        return userList.size() > 0 ? KEY_NORMAL : KEY_EMPTY;
    }

}
