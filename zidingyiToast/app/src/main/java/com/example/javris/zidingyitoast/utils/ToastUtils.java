package com.example.javris.zidingyitoast.utils;

import android.content.Context;
import android.widget.Toast;

import com.example.javris.zidingyitoast.view.CustomToast;

/**
 * Created by javris on 2016/10/28.
 * Email: 2356626240@qq.com
 */
public class ToastUtils {


    private static CustomToast toast;


    private ToastUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }


    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {

        if (toast == null) {
            toast = new CustomToast(context, message, Toast.LENGTH_SHORT);
        } else {
            if (toast.getResourceId() == 0)
                toast.setText(message);
            else
                toast = new CustomToast(context, message,Toast.LENGTH_SHORT);
        }
        toast.show();

    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {

        if (toast == null) {
            toast = new CustomToast(context, message, Toast.LENGTH_SHORT);
        } else {
            if (toast.getResourceId() == 0)
                toast.setText(message);
            else
                toast = new CustomToast(context, message,Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {

        if (toast == null) {
            toast = new CustomToast(context, message, Toast.LENGTH_LONG);
        } else {
            if (toast.getResourceId() == 0)
                toast.setText(message);
            else
                toast = new CustomToast(context, message,Toast.LENGTH_LONG);
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {

        if (toast == null) {
            toast = new CustomToast(context, message, Toast.LENGTH_LONG);
        } else {
            if (toast.getResourceId() == 0)
                toast.setText(message);
            else
                toast = new CustomToast(context, message,Toast.LENGTH_LONG);
        }
        toast.show();
    }

    /**
     * 带背景显示
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int id, int duration) {

        if (toast == null) {
            toast = new CustomToast(context, message, id, duration);
        } else {
            if (toast.getResourceId() == id)
                toast.setText(message);
            else
                toast = new CustomToast(context, message, id, duration);
        }
        toast.show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int id, int duration) {

        if (toast == null) {
            toast = new CustomToast(context, message, id, duration);
        } else {
            if (toast.getResourceId() == id)
                toast.setText(message);
            else
                toast = new CustomToast(context, message, id, duration);
        }
        toast.show();
    }
}
