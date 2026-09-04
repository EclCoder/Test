package com.bumptech.glide.load.engine;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class e implements v5.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5.d f11296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5.g f11298c;

    e(r5.d dVar, Object obj, r5.g gVar) {
        this.f11296a = dVar;
        this.f11297b = obj;
        this.f11298c = gVar;
    }

    @Override // v5.a.b
    public boolean a(File file) {
        return this.f11296a.a(this.f11297b, file, this.f11298c);
    }
}
