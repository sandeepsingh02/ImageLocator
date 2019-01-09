package com.example.sandeep.imagelocator.interfaces;

import android.view.View;

public interface ICommonUtilities {
    void onClickView(View view);
    void showMessage(String msg);
    void showProgress();
    void hideProgress();
    void showMessageWithImage(String msg,boolean status);
}
