package bawei.com.todayheadline_demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bawei.com.todayheadline_demo.R;

/**
 * 类描述：首页界面
 * 创建人：xuyaxi
 * 创建时间：2017/7/12 11:23
 */


public class HomePage extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.homepage, null);

        return view;
    }
}
