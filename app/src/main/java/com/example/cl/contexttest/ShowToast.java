package com.example.cl.contexttest;

import android.widget.Toast;

/**
 * Created by cl on 2015/8/31.
 */
public class ShowToast {

    public void TestContext(){
        Toast.makeText(MyApplication.getContext(),"test",Toast.LENGTH_SHORT).show();
    }
}
