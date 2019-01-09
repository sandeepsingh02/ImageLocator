package com.example.sandeep.imagelocator.main;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.sandeep.imagelocator.R;
import com.example.sandeep.imagelocator.base.BaseActivity;
import com.example.sandeep.imagelocator.base.BaseViewModel;
import com.example.sandeep.imagelocator.databinding.MainActivityBinding;
import com.example.sandeep.imagelocator.interfaces.ICommonUtilities;
import com.example.sandeep.imagelocator.utilities.CustomDialog;
import com.example.sandeep.imagelocator.utilities.ToastUtilities;

public class MainActivity extends BaseActivity <MainActivityBinding,MainActivityViewModel> implements ICommonUtilities {
    private Context mContext;
    private CustomDialog customDialog;
    private ICommonUtilities iCommonUtilities=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
        mContext=this;
        customDialog=initCustomDialog(this);
        getViewModel().setName("Click");
        getBinding().btCaptureImage.setOnClickListener(this::onClickView);
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
    @Override
    public void onClickView(View view) {
        switch (view.getId()) {
            case R.id.btCaptureImage:
                getBinding().textView.setText(getViewModel().getName());
                getBinding().btCaptureImage.setText(getViewModel().getName());
                new Handler().postDelayed(() -> {
                    iCommonUtilities.showMessage("Test Normal Message");
                    new Handler().postDelayed(() -> {
                        iCommonUtilities.showMessageWithImage("Test Success Message",true);
                        new Handler().postDelayed(() -> iCommonUtilities.showMessageWithImage("Test Failure Message",false),2000);
                    },2000);
                },2000);
                break;
            default:break;
        }
    }

    @Override
    public void showMessage(String msg) {
        ToastUtilities.toast(mContext,msg);
    }

    @Override
    public void showProgress() {
        customDialog.showDialog();
    }

    @Override
    public void hideProgress() {
        customDialog.dismissDialog();
    }

    @Override
    public void showMessageWithImage(String msg, boolean status) {
        if (status) {
            ToastUtilities.toastSuccess(mContext, msg);
        } else {
            ToastUtilities.toastfailure(mContext, msg);
        }
    }
}
