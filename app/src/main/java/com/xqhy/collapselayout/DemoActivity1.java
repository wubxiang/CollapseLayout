package com.xqhy.collapselayout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.xqhy.collapselayout.databinding.Test1Binding;

/**
 * Author: wbx
 * Date: 2020/7/3
 * Description:
 */

public class DemoActivity1 extends AppCompatActivity {
    private Test1Binding mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = Test1Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setAdapter(new GameDetailAdapter());
    }
}
