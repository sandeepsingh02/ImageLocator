package com.example.sandeep.imagelocator.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.sandeep.imagelocator.R;
import com.example.sandeep.imagelocator.base.BaseActivity;
import com.example.sandeep.imagelocator.base.BaseViewModel;
import com.example.sandeep.imagelocator.databinding.MainActivityBinding;

public class MainActivity extends BaseActivity <MainActivityBinding,MainActivityViewModel>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
    }

    @Override
    protected BaseViewModel.Factory factory() {
        return new MainActivityViewModel.Factory() {
            @Override
            public BaseViewModel getClassInstance() {
                return new MainActivityViewModel();
            }
        };
    }

    @Override
    protected Class viewModelClass() {
        return MainActivityViewModel.class;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.main_activity;
    }
}
