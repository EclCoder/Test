package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import b6.a;
import b6.b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class vf implements com.bytedance.sdk.component.sk.jip {
    private final WeakReference<ImageView> hnj;

    public vf(ImageView imageView) {
        this.hnj = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
        ImageView imageView = this.hnj.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objHn = dnmVar.hn();
            if (objHn instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objHn);
                return;
            }
            if (!(objHn instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(objHn)) {
                b.a(objHn).start();
            }
            imageView.setImageDrawable((Drawable) objHn);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(int i10, String str, Throwable th2) {
        ImageView imageView = this.hnj.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
