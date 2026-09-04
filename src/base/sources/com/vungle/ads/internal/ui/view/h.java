package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import fl.g0;
import fl.r;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends RelativeLayout {
    private ImageView imageView;
    private final com.vungle.ads.internal.l internal;
    private zj.c nativeVideoListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, com.vungle.ads.internal.l internal) {
        super(context);
        s.h(context, "context");
        s.h(internal, "internal");
        this.internal = internal;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void destroy$vungle_ads_release() {
        removeAllViews();
        try {
            r.a aVar = r.f38769b;
            ImageView imageView = this.imageView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            r.b(g0.f38750a);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
        ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    public final ImageView getImageView$vungle_ads_release() {
        return this.imageView;
    }

    public final com.vungle.ads.internal.l getInternal() {
        return this.internal;
    }

    public final zj.c getNativeVideoListener() {
        return this.nativeVideoListener;
    }

    public void render(Context context) {
        s.h(context, "context");
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.internal.displayMainImage(this.imageView);
        requestLayout();
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setNativeVideoListener(zj.c cVar) {
        this.nativeVideoListener = cVar;
    }
}
