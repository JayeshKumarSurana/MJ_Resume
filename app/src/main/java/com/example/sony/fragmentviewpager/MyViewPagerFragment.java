package com.example.sony.fragmentviewpager;

/**
 * Created by Sony on 21-09-2015.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.sony.mjresume.R;


public class MyViewPagerFragment extends Fragment {

    private static final String POSITION = "position";
    private static final String IMAGEID = "imageId";

    public MyViewPagerFragment(){


    }



    public  static MyViewPagerFragment newInstance(int position, int imageId){

        MyViewPagerFragment myfrag = new MyViewPagerFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(POSITION, position);
        bundle.putInt(IMAGEID, imageId);
        myfrag.setArguments(bundle);
        return myfrag;
    }

//      <previous>|<current>|<next>

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);


        int imageId = getArguments().getInt(IMAGEID);
        int position = getArguments().getInt(POSITION);

        ImageView iv =(ImageView)rootView.findViewById(R.id.ivViewPager);
        iv.setImageResource(imageId);

        Toast.makeText(getActivity(),"Page Number:" + position, Toast.LENGTH_SHORT);

        return rootView;
    }
}
