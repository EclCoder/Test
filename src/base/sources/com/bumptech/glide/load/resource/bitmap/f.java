package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f implements t5.c, t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f11519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.d f11520b;

    public f(Bitmap bitmap, u5.d dVar) {
        this.f11519a = (Bitmap) m6.k.f(bitmap, "Bitmap must not be null");
        this.f11520b = (u5.d) m6.k.f(dVar, "BitmapPool must not be null");
    }

    public static f d(Bitmap bitmap, u5.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // t5.c
    public void a() {
        this.f11520b.d(this.f11519a);
    }

    @Override // t5.c
    public Class b() {
        return Bitmap.class;
    }

    @Override // t5.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f11519a;
    }

    @Override // t5.c
    public int getSize() {
        return m6.l.h(this.f11519a);
    }

    @Override // t5.b
    public void initialize() {
        this.f11519a.prepareToDraw();
    }
}
