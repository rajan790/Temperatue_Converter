package com.example.temperatue_converter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class alert extends Dialog {
    public alert(@NonNull Context context) {
        super(context);
        WindowManager.LayoutParams params= getWindow().getAttributes();
        getWindow().setAttributes(params);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);
        View view= LayoutInflater.from(context).inflate(R.layout.alert,null);
        setContentView(view);
    }
}
