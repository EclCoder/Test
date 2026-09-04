package com.bytedance.adsdk.hn.hn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.hn.dkl.dkl;
import com.bytedance.adsdk.hn.gjv;
import com.bytedance.adsdk.hn.ta;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static final Object hnj = new Object();
    private gjv gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f11956hn;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Map<String, ta> f11957sk;

    public hn(Drawable.Callback callback, String str, gjv gjvVar, Map<String, ta> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.qor = str;
        } else {
            this.qor = str + '/';
        }
        this.f11957sk = map;
        hnj(gjvVar);
        if (callback instanceof View) {
            this.f11956hn = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f11956hn = null;
        }
    }

    private Bitmap hn(String str, Bitmap bitmap) {
        synchronized (hnj) {
            this.f11957sk.get(str).hnj(bitmap);
        }
        return bitmap;
    }

    public void hnj(gjv gjvVar) {
        this.gjv = gjvVar;
    }

    public Bitmap hnj(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapDnm = this.f11957sk.get(str).dnm();
            hn(str, bitmap);
            return bitmapDnm;
        }
        ta taVar = this.f11957sk.get(str);
        Bitmap bitmapDnm2 = taVar.dnm();
        taVar.hnj(null);
        return bitmapDnm2;
    }

    public Bitmap hnj(String str) {
        ta taVar = this.f11957sk.get(str);
        if (taVar == null) {
            return null;
        }
        Bitmap bitmapDnm = taVar.dnm();
        if (bitmapDnm != null) {
            return bitmapDnm;
        }
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            return gjvVar.hnj(taVar);
        }
        Context context = this.f11956hn;
        if (context == null) {
            return null;
        }
        String strOjm = taVar.ojm();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strOjm.startsWith("data:") && strOjm.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strOjm.substring(strOjm.indexOf(44) + 1), 0);
                return hn(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.qor)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.qor + strOjm), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return hn(str, dkl.hnj(bitmapDecodeStream, taVar.hnj(), taVar.hn()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean hnj(Context context) {
        return (context == null && this.f11956hn == null) || this.f11956hn.equals(context);
    }
}
