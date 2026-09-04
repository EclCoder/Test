package com.inmobi.media;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.inmobi.media.ro, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3285ro {
    public static final FrameLayout a(Context context, byte[] watermarkBytes, float f10) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(watermarkBytes, "watermarkBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(watermarkBytes, 0, watermarkBytes.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(bitmapDrawable);
        frameLayout.setElevation(Float.MAX_VALUE);
        frameLayout.setAlpha(f10);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        return frameLayout;
    }
}
