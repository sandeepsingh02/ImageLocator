package com.example.sandeep.imagelocator.base;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;

import com.example.sandeep.imagelocator.utilities.CustomDialog;

public abstract class BaseActivity  <DB extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity {
    private DB binding;
    private VM viewModel;
    protected abstract BaseViewModel.Factory factory();

    protected abstract Class<VM> viewModelClass();
    protected CustomDialog initCustomDialog(Context context) {
        return new CustomDialog(context);
    }
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
