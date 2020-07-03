package com.xqhy.collapselayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.appbar.AppBarLayout;
import com.xqhy.collapselayout.databinding.Test7Binding;
import com.xqhy.collapselayout.databinding.Test8Binding;

/**
 * Author: wbx
 * Date: 2020/7/3
 * Description:
 */

public class DemoActivity8 extends AppCompatActivity {
    private Test8Binding mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = Test8Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setAdapter(new GameDetailAdapter());

        mBinding.appbarlayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                //verticalOffset是负值，移动的距离（像素）上移会越来越小，下移越累越大
                //appBarLayout.getTotalScrollRange() 总的可滑动的距离，不包括不可滑动的view高度
                Log.e("TAG", verticalOffset+"");
                Log.e("TAG", appBarLayout.getTotalScrollRange()+"");

                int Offset = Math.abs(verticalOffset); //目的是将负数转换为绝对正数；
                int totalScrollHeight = appBarLayout.getTotalScrollRange();

                /**
                 * 当前最大高度偏移值除以2 在减去已偏移值 获取浮动 先显示在隐藏
                 */
                if (Offset > appBarLayout.getTotalScrollRange() / 2) {
                    //标题栏透明度逐渐改变
                    mBinding.toolbar.setBackgroundColor(changeAlpha(getResources().getColor(R.color.color_red)
                            , (Offset-appBarLayout.getTotalScrollRange()/2) * 1.0f / (appBarLayout.getTotalScrollRange()/2)));

                }
            }
        });
    }

    /**
     * 根据百分比改变颜色透明度
     * fraction:透明度百分比
     */
    public int changeAlpha(int color, float fraction) {
        //获取颜色本身透明度
        int alpha = Color.alpha(color);
        int alphaNew = (int) (alpha * fraction);
        int R = Color.red(color);
        int G = Color.green(color);
        int B = Color.blue(color);
        return Color.argb(alphaNew, R, G, B);
    }
}
