package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f11547b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(r5.e.f51095a);

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f11547b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.g
    protected Bitmap c(u5.d dVar, Bitmap bitmap, int i10, int i11) {
        return h0.c(dVar, bitmap, i10, i11);
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // r5.e
    public int hashCode() {
        return -670243078;
    }
}
