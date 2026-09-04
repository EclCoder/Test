package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5.i f11492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f11493b;

    public a(Resources resources, r5.i iVar) {
        this.f11493b = (Resources) m6.k.e(resources);
        this.f11492a = (r5.i) m6.k.e(iVar);
    }

    @Override // r5.i
    public t5.c a(Object obj, int i10, int i11, r5.g gVar) {
        return c0.d(this.f11493b, this.f11492a.a(obj, i10, i11, gVar));
    }

    @Override // r5.i
    public boolean b(Object obj, r5.g gVar) {
        return this.f11492a.b(obj, gVar);
    }
}
