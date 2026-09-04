package com.vungle.ads.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String watermark) {
        super(context);
        s.h(context, "context");
        s.h(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        s.g(overlayBytes, "overlayBytes");
        Bitmap overlayBm = BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length);
        s.g(overlayBm, "overlayBm");
        Resources resources = context.getResources();
        s.g(resources, "context.resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, overlayBm);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
