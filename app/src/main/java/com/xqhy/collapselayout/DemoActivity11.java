package com.xqhy.collapselayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.xqhy.collapselayout.databinding.Test10Binding;
import com.xqhy.collapselayout.databinding.Test11Binding;

/**
 * Author: wbx
 * Date: 2020/7/3
 * Description:
 */

public class DemoActivity11 extends AppCompatActivity {
    private Test11Binding mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = Test11Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setAdapter(new GameDetailAdapter());

        mBinding.collapsingToolbar.setCollapsedTitleGravity(Gravity.CENTER);
        mBinding.collapsingToolbar.setTitle("你大爷");
        mBinding.collapsingToolbar.setCollapsedTitleTextColor(Color.RED);
        mBinding.collapsingToolbar.setExpandedTitleColor(Color.BLUE);
        //设置字体大小
        mBinding.collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapse);

    }

}
