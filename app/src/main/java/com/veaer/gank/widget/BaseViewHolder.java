package com.veaer.gank.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by Veaer on 15/8/19.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    protected View holderView;

    public BaseViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
        holderView = view;
    }

    public < T extends View> T $(int id) {
        return (T)holderView.findViewById(id);
    }

    public void hideView(int id) {
        holderView.findViewById(id).setVisibility(View.GONE);
    }

    public void showView(int id) {
        holderView.findViewById(id).setVisibility(View.VISIBLE);
    }

    public void bindViews(Object object, Object... args) {

    }

    public void getViewHolderViews() {}
}
