package com.bytedance.sdk.openadsdk.apu.hnj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private Bitmap gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Drawable f13246hn;
    int hnj;
    private byte[] qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Bitmap f13247sk;

    public hn(Drawable drawable, int i10) {
        this.qor = null;
        this.gjv = null;
        this.f13247sk = null;
        this.f13246hn = drawable;
        this.hnj = i10;
    }

    public Drawable gjv() {
        return this.f13246hn;
    }

    public Bitmap hn() {
        return this.f13247sk;
    }

    public Bitmap hnj() {
        return this.gjv;
    }

    public byte[] qor() {
        try {
            if (this.qor == null) {
                this.qor = gjv.hnj(this.gjv);
            }
        } catch (OutOfMemoryError e10) {
            apu.qor("GifRequestResult", e10.getMessage());
        }
        return this.qor;
    }

    public boolean sk() {
        if (this.gjv != null || this.f13246hn != null) {
            return true;
        }
        byte[] bArr = this.qor;
        return bArr != null && bArr.length > 0;
    }

    public hn(byte[] bArr, int i10) {
        this.f13246hn = null;
        this.gjv = null;
        this.f13247sk = null;
        this.qor = bArr;
        this.hnj = i10;
    }

    public hn(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.f13246hn = null;
        this.qor = null;
        this.f13247sk = bitmap2;
        this.gjv = bitmap;
        this.hnj = i10;
    }
}
