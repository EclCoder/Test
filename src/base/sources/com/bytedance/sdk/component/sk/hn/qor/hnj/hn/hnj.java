package com.bytedance.sdk.component.sk.hn.qor.hnj.hn;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.sk.uua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements uua {
    private com.bytedance.sdk.component.sk.hn.qor.hnj.qor<String, Bitmap> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12962hn;
    private long hnj = 4194304;
    private int qor;

    public hnj(int i10, int i11) {
        this.f12962hn = i11;
        this.qor = i10;
        this.gjv = new com.bytedance.sdk.component.sk.hn.qor.hnj.qor<>(i11);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hn(String str) {
        try {
            return this.gjv.hnj(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hnj(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iHnj = hnj(bitmap);
                if (iHnj <= this.hnj && iHnj != 0) {
                    this.gjv.hnj(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public Bitmap hnj(String str) {
        try {
            return this.gjv.hnj(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int hnj(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
