package com.customgifloader;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by Localadmin on 2/8/2018.
 */

public abstract class CustomDialogConfiguration extends AlertDialog.Builder {

    public CustomDialogConfiguration(Context context, int Theme) {
        super(context,Theme);
    }

    public abstract CustomAlertDialogBuilder setGifImageHeight(int Height);
    public abstract CustomAlertDialogBuilder setGifImageWidth(int Weight);
    public abstract CustomAlertDialogBuilder setMessageTextColor(int Color);
    public abstract CustomAlertDialogBuilder setMessageTextSize(int Size);
    public abstract CustomAlertDialogBuilder setMatchParentGifImage();

}
