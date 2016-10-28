package com.example.javris.zidingyitoast.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javris.zidingyitoast.R;

/**
 * Created by javris on 2016/10/28.
 * Email: 2356626240@qq.com
 */
public class CustomToast extends Toast {

    private LayoutInflater mLayoutInflater;
    private ImageView mImageView;
    private TextView mTextView;
    private int mId; //图片背景id

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */

    /**
     * @param context
     * @param content  内容
     * @param duration Toast.LENGTH_LONG  Toast.LENGTH_SHORT
     */
    public CustomToast(Context context, CharSequence content, int duration) {
        this(context, content, 0, duration);
    }

    /**
     * @param context
     * @param content  内容id
     * @param duration Toast.LENGTH_LONG  Toast.LENGTH_SHORT
     */
    public CustomToast(Context context, int content, int duration) {
        this(context, context.getResources().getString(content), 0, duration);
    }

    /**
     * @param context
     * @param content  内容id
     * @param id       图片资源id
     * @param duration Toast.LENGTH_LONG  Toast.LENGTH_SHORT
     */
    public CustomToast(Context context, int content, int id, int duration) {
        this(context, context.getResources().getString(content), id, duration);
    }

    /**
     * @param context
     * @param content  提示内容
     * @param id       图片id
     * @param duration Toast.LENGTH_LONG  Toast.LENGTH_SHORT
     */
    public CustomToast(Context context, CharSequence content, int id, int duration) {
        super(context);

        setGravity(Gravity.CENTER, 0, 0);
        mLayoutInflater = LayoutInflater.from(context);
        View view = mLayoutInflater.inflate(R.layout.custom_toast, null);
        mImageView = (ImageView) view.findViewById(R.id.toast_bg);
        mTextView = (TextView) view.findViewById(R.id.message);

        mTextView.setText(content);
        if (id != 0) {
            mImageView.setBackgroundResource(id);
            mId = id;
        } else
            mId = 0;


        setDuration(duration);

        setView(view);


    }

    @Override
    public void setText(CharSequence s) {
        mTextView.setText(s);
    }

    public int getResourceId() {
        return mId;
    }

}
