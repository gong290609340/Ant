package com.anthony.app.module.tab;

import android.os.Bundle;
import android.view.View;

import com.anthony.app.R;
import com.anthony.app.common.base.AbsBaseFragment;
import com.anthony.app.common.injection.component.ActivityComponent;

/**
 * Created by Anthony on 2016/9/12.
 * Class Note:
 * 我的
 * fragment
 */
public class MineFragment extends AbsBaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.dy_fragment_mine;
    }

    @Override
    protected void initDagger2(ActivityComponent activityComponent) {

    }

    @Override
    protected void initViews(View rootView, Bundle savedInstanceState) {

    }

    @Override
    protected void loadData() {

    }
}
