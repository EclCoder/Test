package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements r5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.d f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.j f11504b;

    public b(u5.d dVar, r5.j jVar) {
        this.f11503a = dVar;
        this.f11504b = jVar;
    }

    @Override // r5.j
    public r5.c b(r5.g gVar) {
        return this.f11504b.b(gVar);
    }

    @Override // r5.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(t5.c cVar, File file, r5.g gVar) {
        return this.f11504b.a(new f(((BitmapDrawable) cVar.get()).getBitmap(), this.f11503a), file, gVar);
    }
}
