package com.rostmana.app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.rostmana.app.R;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Toolbar toolbar = findViewById(R.id.toolbar_categories);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        Drawable drawable = getResources().getDrawable(R.drawable.ic_keyboard_arrow_left_black_24dp);
        drawable.setColorFilter(getResources().getColor(R.color.grayColor), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(drawable);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void categoryItemClicked(View view) {

        if (view.getTag() == null) {
            view.setTag(true);
            view.setBackgroundResource(R.drawable.grid_layout_solid_rounded_corner);
            ((AppCompatImageView) view).setColorFilter((getResources().getColor(R.color.white_color)));

        } else {
            view.setTag(null);
            view.setBackgroundResource(R.drawable.grid_layout_rounded_corner);
            ((AppCompatImageView) view).setColorFilter((getResources().getColor(R.color.screenColor)));
        }


    }
}
