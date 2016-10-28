package com.example.javris.zidingyitoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.javris.zidingyitoast.utils.ToastUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        ToastUtils.showShort(this, "我是传奇");

    }

    public void showWithBack(View view) {
        ToastUtils.show(this, "我是什么", R.drawable.ic_launcher, Toast.LENGTH_SHORT);
    }

}
