package com.example.sandeep.imagelocator.base;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity  <DB extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity {
    private DB binding;
    private VM viewModel;
    protected abstract BaseViewModel.Factory factory();

    protected abstract Class<VM> viewModelClass();

    protected void setView(){
        binding = DataBindingUtil.setContentView(this, getLayoutID());
        binding.setLifecycleOwner(this);
        viewModel = ViewModelProviders.of(this, factory()).get(viewModelClass());
    }
    protected abstract int getLayoutID();

    public DB getBinding() {
        return binding;
    }

    public VM getViewModel() {
        return viewModel;
    }
}
