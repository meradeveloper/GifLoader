package com.customgifloader;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

/**
 * Created by SumitRawat on 2/7/2018.
 */

public class CustomAlertDialogBuilder extends CustomDialogConfiguration {

        private final Context mContext;
        private TextView mTitle;
        private ImageView mIcon;
        private TextView mMessage;


    public CustomAlertDialogBuilder(Context context, int theme) {
            super(context,theme);
            mContext = context;

            View customTitle = View.inflate(mContext, R.layout.alert_dialog_title, null);
            mTitle = (TextView) customTitle.findViewById(R.id.alertTitle);
            mIcon = (ImageView) customTitle.findViewById(R.id.icon);
            setCustomTitle(customTitle);

            View customMessage = View.inflate(mContext, R.layout.alert_dialog_message, null);
            mMessage = (TextView) customMessage.findViewById(R.id.message);
            setView(customMessage);

    }

    @Override
    public CustomAlertDialogBuilder setTitle(int textResId) {
        mTitle.setText(textResId);
        return this;
    }
    @Override
    public CustomAlertDialogBuilder setTitle(CharSequence text) {
        mTitle.setText(text);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setMessage(int textResId) {
        mMessage.setText(textResId);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setMessage(CharSequence text) {
        mMessage.setText(text);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setIcon(int drawableResId) {
        mIcon.setImageResource(drawableResId);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setIcon(Drawable icon) {
        mIcon.setImageDrawable(icon);
        return this;
    }

    public CustomAlertDialogBuilder setGifIcon(int drawableResId)
    {
        try {
            GifDrawable gifFromResource = new GifDrawable( mContext.getResources(), drawableResId );
            mIcon.setImageDrawable(gifFromResource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public AlertDialog.Builder setPositiveButton(int textId, DialogInterface.OnClickListener listener) {
        return super.setPositiveButton(textId, listener);
    }

    @Override
    public CustomAlertDialogBuilder setGifImageHeight(int Height) {
        mIcon.getLayoutParams().height = Height;
        mIcon.requestLayout();
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setGifImageWidth(int Width) {
        mIcon.getLayoutParams().width = Width;
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setMessageTextColor(int Color) {
        mMessage.setTextColor(Color);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setMessageTextSize(int Size) {
        mMessage.setTextSize(Size);
        return this;
    }

    @Override
    public CustomAlertDialogBuilder setMatchParentGifImage() {
        mIcon.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
        mIcon.setScaleType(ImageView.ScaleType.FIT_XY);
        return this;
    }
}
