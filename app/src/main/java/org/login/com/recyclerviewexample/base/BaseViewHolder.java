package org.login.com.recyclerviewexample.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder extends RecyclerView.ViewHolder{

    int mLastPosition;
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(int position)
    {
        mLastPosition = position;
    }
}
