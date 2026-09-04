package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f11535b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(r5.e.f51095a);

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f11535b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.g
    protected Bitmap c(u5.d dVar, Bitmap bitmap, int i10, int i11) {
        return h0.b(dVar, bitmap, i10, i11);
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // r5.e
    public int hashCode() {
        return -599754482;
    }
}
