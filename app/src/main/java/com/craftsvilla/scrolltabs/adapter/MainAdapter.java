package com.craftsvilla.scrolltabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.craftsvilla.scrolltabs.Models.ProductModel;
import com.craftsvilla.scrolltabs.fragments.MainFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naresh on 31/3/16.
 */
public class MainAdapter extends FragmentStatePagerAdapter {

    List<ProductModel> productModels = new ArrayList<>();

    public MainAdapter(FragmentManager supportFragmentManager,List<ProductModel> productModels) {
        super(supportFragmentManager);
        this.productModels = productModels;
    }


    @Override
    public Fragment getItem(int position) {
        return (MainFragment.newInstance(position,productModels.get(position).getName()));
    }

    @Override
    public int getCount() {
        return productModels.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return productModels.get(position).getName();
    }
}
