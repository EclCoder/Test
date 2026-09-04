package com.facebook;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f16116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16120f;

    public z0(Handler handler, j0 request) {
        kotlin.jvm.internal.s.h(request, "request");
        this.f16115a = handler;
        this.f16116b = request;
        this.f16117c = h0.D();
    }

    public final void a(long j10) {
        long j11 = this.f16118d + j10;
        this.f16118d = j11;
        if (j11 >= this.f16119e + this.f16117c || j11 >= this.f16120f) {
            c();
        }
    }

    public final void b(long j10) {
        this.f16120f += j10;
    }

    public final void c() {
        if (this.f16118d > this.f16119e) {
            this.f16116b.o();
        }
    }
}
