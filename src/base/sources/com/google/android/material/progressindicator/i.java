package com.google.android.material.progressindicator;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j f20833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List f20834b = new ArrayList();

    protected i(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20834b.add(new h.a());
        }
    }

    abstract void a();

    protected float b(int i10, int i11, int i12) {
        return h0.a.a((i10 - i11) / i12, 0.0f, 1.0f);
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    protected void e(j jVar) {
        this.f20833a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
