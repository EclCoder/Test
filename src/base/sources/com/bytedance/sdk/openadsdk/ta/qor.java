package com.bytedance.sdk.openadsdk.ta;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements jip {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f14617hn = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> hnj;
    private jip qor;

    private qor(ImageView imageView, jip jipVar) {
        this.hnj = new WeakReference<>(imageView);
        this.qor = jipVar;
    }

    public static jip hnj(as asVar, String str, ImageView imageView) {
        return new hn(asVar, str, new qor(imageView));
    }

    public static jip hnj(as asVar, String str, ImageView imageView, jip jipVar) {
        return new hn(asVar, str, new qor(imageView, jipVar));
    }

    private qor(ImageView imageView) {
        this.hnj = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(dnm dnmVar) {
        final ImageView imageView = this.hnj.get();
        if (imageView != null) {
            final Object objHn = dnmVar.hn();
            if (objHn instanceof Bitmap) {
                if (ua.dkl()) {
                    imageView.setImageBitmap((Bitmap) objHn);
                } else {
                    fc.qor().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ta.qor.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objHn);
                        }
                    });
                }
                jip jipVar = this.qor;
                if (jipVar != null) {
                    jipVar.hnj(dnmVar);
                    return;
                }
                return;
            }
            if (objHn instanceof Drawable) {
                if (ua.dkl()) {
                    hnj(objHn, imageView);
                } else {
                    fc.qor().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ta.qor.2
                        @Override // java.lang.Runnable
                        public void run() {
                            qor.this.hnj(objHn, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && a.a(obj)) {
            b.a(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(int i10, String str, Throwable th2) {
        jip jipVar = this.qor;
        if (jipVar != null) {
            jipVar.hnj(i10, str, th2);
        }
    }
}
