package com.kserno.collapsingheader;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

/**
 * Created by filipsollar on 5.4.18.
 */

public class CollapsingHeader extends RelativeLayout {

    private AppBarLayout mAppBarLayout;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private Toolbar mToolbar;
    private ImageView mIvBanner;

    public CollapsingHeader(Context context) {
        super(context);
        init(context);
    }

    public CollapsingHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CollapsingHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.view_collapsing_header, this);
        mToolbar = findViewById(R.id.toolbar);
        mCollapsingToolbarLayout = findViewById(R.id.collapsing_toolbar_layout);
        mAppBarLayout = findViewById(R.id.app_bar_layout);
        mIvBanner = findViewById(R.id.iv_banner);
    }

    public void assignModel(CollapsingHeaderModel model) {
        mCollapsingToolbarLayout.setContentScrimColor(model.getToolbarColor());

        if (model.getCollapsedText() != null) {
            mCollapsingToolbarLayout.setCollapsedTitleTextColor(model.getCollapsedText().getColor());
            mCollapsingToolbarLayout.setCollapsedTitleTypeface(model.getCollapsedText().getTypeface());
            mCollapsingToolbarLayout.setCollapsedTitleGravity(model.getCollapsedText().getGravity());
        }

        if (model.getExpandedText() != null) {
            mCollapsingToolbarLayout.setExpandedTitleColor(model.getExpandedText().getColor());
            mCollapsingToolbarLayout.setExpandedTitleTypeface(model.getExpandedText().getTypeface());
            mCollapsingToolbarLayout.setExpandedTitleGravity(model.getExpandedText().getGravity());
        }

        mCollapsingToolbarLayout.setExpandedTitleMarginStart(model.getExpandedTitleMarginStart());
        mCollapsingToolbarLayout.setExpandedTitleMarginTop(model.getExpandedTitleMarginTop());
        mCollapsingToolbarLayout.setExpandedTitleMarginBottom(model.getExpandedTitleMarginBottom());
        mCollapsingToolbarLayout.setExpandedTitleMarginEnd(model.getExpandedTitleMarginEnd());

        Resources r = getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, model.getHeight(), r.getDisplayMetrics());

        mIvBanner.getLayoutParams().height = (int) px;

        if (model.getImageUrl() != null && model.getImageUrl().isEmpty()) {
            Picasso.with(getContext())
                    .load(model.getImageUrl())
                    .placeholder(model.getImagePlaceholder())
                    .into(mIvBanner);

        } else {
            mIvBanner.setImageResource(model.getImageResId());
        }

    }

    public Toolbar getToolbar() {
        return mToolbar;
    }
}
