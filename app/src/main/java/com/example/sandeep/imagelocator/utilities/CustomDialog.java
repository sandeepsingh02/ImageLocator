package com.example.sandeep.imagelocator.utilities;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.example.sandeep.imagelocator.R;

public class CustomDialog extends Dialog {
    private  Dialog dialog=this;
    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_dialog,null);
        dialog.setContentView(layout);
    }
    public void showDialog() {
        dialog.show();
    }
    public void dismissDialog() {
        try {

            if (dialog.isShowing())
                dialog.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
