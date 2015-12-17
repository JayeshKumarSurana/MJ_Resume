package com.example.sony.fragmentviewpager;

/**
 * Created by Sony on 21-09-2015.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.sony.mjresume.R;

/**
 * Created by Sony on 21-09-2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    int[] image = {R.drawable.cv,R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,  R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.thirteen, R.drawable.fourteen, R.drawable.fifteen, R.drawable.sixteen, R.drawable.seventeen, R.drawable.eighteen, R.drawable.nineteen, R.drawable.twenty, R.drawable.twentyone, R.drawable.twentytwo, R.drawable.twentythree, R.drawable.twentyfour, R.drawable.twentyfive, R.drawable.twentysix, R.drawable.twentyseven, R.drawable.twentyeight, R.drawable.twentynine, R.drawable.thirty, R.drawable.thirtyone, R.drawable.thirtytwo, R.drawable.thirtythree, R.drawable.thirtyfour };


    public ViewPagerAdapter(FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return MyViewPagerFragment.newInstance(position, image[position]);
    }

    @Override
    public int getCount() {
        return image.length;
    }
}
