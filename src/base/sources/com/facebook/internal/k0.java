package com.facebook.internal;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f15296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f15297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bitmap f15299d;

    public k0(j0 request, Exception exc, boolean z10, Bitmap bitmap) {
        kotlin.jvm.internal.s.h(request, "request");
        this.f15296a = request;
        this.f15297b = exc;
        this.f15298c = z10;
        this.f15299d = bitmap;
    }

    public final Bitmap a() {
        return this.f15299d;
    }

    public final Exception b() {
        return this.f15297b;
    }

    public final j0 c() {
        return this.f15296a;
    }

    public final boolean d() {
        return this.f15298c;
    }
}
