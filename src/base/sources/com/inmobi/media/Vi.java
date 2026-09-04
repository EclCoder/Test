package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vi extends AbstractC3341u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vi(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(adQualityConfig, "adQualityConfig");
        this.f25905b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View adView = (View) this.f25905b.get();
        if (adView == null) {
            System.currentTimeMillis();
            return null;
        }
        kotlin.jvm.internal.s.h(adView, "adView");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.s.g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(bitmapCreateBitmap);
    }
}
