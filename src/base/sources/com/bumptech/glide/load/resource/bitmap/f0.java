package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f0 implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b6.g f11521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.d f11522b;

    public f0(b6.g gVar, u5.d dVar) {
        this.f11521a = gVar;
        this.f11522b = dVar;
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(Uri uri, int i10, int i11, r5.g gVar) {
        t5.c cVarA = this.f11521a.a(uri, i10, i11, gVar);
        if (cVarA == null) {
            return null;
        }
        return s.a(this.f11522b, (Drawable) cVarA.get(), i10, i11);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, r5.g gVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
