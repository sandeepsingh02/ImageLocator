package com.example.sandeep.imagelocator.camera;

import com.example.sandeep.imagelocator.R;
import com.example.sandeep.imagelocator.base.BaseActivity;
import com.example.sandeep.imagelocator.base.BaseViewModel;
import com.example.sandeep.imagelocator.databinding.CameraActivityBinding;
import com.example.sandeep.imagelocator.main.MainActivityViewModel;

public class CameraActivity extends BaseActivity<CameraActivityBinding,MainActivityViewModel> {
    @Override
    protected BaseViewModel.Factory factory() {
        return null;
    }

    @Override
    protected Class viewModelClass() {
        return null;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.camera_activity;
    }
}
