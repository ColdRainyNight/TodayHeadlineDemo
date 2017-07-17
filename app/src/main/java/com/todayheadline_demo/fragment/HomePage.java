package com.todayheadline_demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.todayheadline_demo.R;

import org.xutils.x;



/**
 * 类描述：首页界面
 * 创建人：xuyaxi
 * 创建时间：2017/7/12 11:23
 */


public class HomePage extends Fragment {

    private TabLayout mTabLayout;
    private ViewPager vp;
    private Gson gson;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.homepage, null);
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        vp = (ViewPager) view.findViewById(R.id.vp);
        x.view().inject(getActivity());
        gson = new Gson();

        return view;
    }

}
