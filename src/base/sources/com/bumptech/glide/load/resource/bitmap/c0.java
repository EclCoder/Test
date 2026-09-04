package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements t5.c, t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f11509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t5.c f11510b;

    private c0(Resources resources, t5.c cVar) {
        this.f11509a = (Resources) m6.k.e(resources);
        this.f11510b = (t5.c) m6.k.e(cVar);
    }

    public static t5.c d(Resources resources, t5.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new c0(resources, cVar);
    }

    @Override // t5.c
    public void a() {
        this.f11510b.a();
    }

    @Override // t5.c
    public Class b() {
        return BitmapDrawable.class;
    }

    @Override // t5.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f11509a, (Bitmap) this.f11510b.get());
    }

    @Override // t5.c
    public int getSize() {
        return this.f11510b.getSize();
    }

    @Override // t5.b
    public void initialize() {
        t5.c cVar = this.f11510b;
        if (cVar instanceof t5.b) {
            ((t5.b) cVar).initialize();
        }
    }
}
