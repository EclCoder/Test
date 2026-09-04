package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f11511a;

    public d0(r rVar) {
        this.f11511a = rVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, r5.g gVar) {
        return this.f11511a.d(parcelFileDescriptor, i10, i11, gVar);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, r5.g gVar) {
        return e(parcelFileDescriptor) && this.f11511a.o(parcelFileDescriptor);
    }
}
