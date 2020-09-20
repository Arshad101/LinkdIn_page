package com.ans.linkdin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
            HOME Home = new HOME();
            return Home;
            case 1:
                ABOUT About = new ABOUT();
                return About;
            case 2:
               JOBS Jobs = new JOBS();
               return Jobs;
            case 3:
                PEOPLE People = new PEOPLE();
                return People;

        }

        return null;
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
