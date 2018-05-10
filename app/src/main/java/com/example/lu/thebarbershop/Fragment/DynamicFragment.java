package com.example.lu.thebarbershop.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lu.thebarbershop.R;

/**
 * Created by lu on 2018/5/9 0009.
 * 动态fragment
 */

public class DynamicFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //加载选项卡对应的选项页面
        View view = inflater.inflate(R.layout.fragment_dynamic_page,container,false);
        //获取布局文件的控件对象
        //TextView textView = view.findViewById(R.id.);
        //给控件对象填充数据
        //textView.setText("店铺页面");
        return view;


    }
}
