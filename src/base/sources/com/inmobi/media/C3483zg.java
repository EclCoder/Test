package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.C3483zg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3483zg extends AbstractC3341u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f28018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f28019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3483zg(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.s.h(window, "window");
        kotlin.jvm.internal.s.h(config, "config");
        this.f28018b = window;
        this.f28019c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.f28018b.getDecorView().getWidth();
        int height = this.f28018b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.s.g(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        int layerType = this.f28018b.getDecorView().getLayerType();
        this.f28018b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f28018b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: yh.jd
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C3483zg.a(g0Var, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f28019c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.f28018b.getDecorView().setLayerType(layerType, null);
        if (g0Var.f43588a) {
            return a(bitmapCreateBitmap);
        }
        return null;
    }

    public static final void a(kotlin.jvm.internal.g0 g0Var, C3483zg c3483zg, int i10) {
        if (i10 == 0) {
            g0Var.f43588a = true;
        }
        boolean z10 = g0Var.f43588a;
        c3483zg.f28019c.set(true);
    }
}
