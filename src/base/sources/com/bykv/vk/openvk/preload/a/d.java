package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f11669d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f11671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f11672c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f11673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f11674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11675g;

    public abstract Object a(b<OUT> bVar, IN in2);

    protected void a(Object... objArr) {
    }

    public final long b() {
        return this.f11675g;
    }

    final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f11674f, this);
    }

    final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f11674f, this);
    }

    final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f11674f, this);
    }

    public final OUT f() {
        return this.f11672c;
    }

    final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f11674f = new m(bVar);
        this.f11670a = dVar;
        this.f11671b = in2;
        this.f11673e = aVar;
        if (dVar != null) {
            this.f11675g = dVar.f11675g;
        } else {
            long andIncrement = f11669d.getAndIncrement();
            this.f11675g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f11674f, this, th2);
    }

    final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f11674f, this, th2);
    }

    protected final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11673e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f11674f, this, th2);
    }
}
