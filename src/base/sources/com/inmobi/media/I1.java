package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I1 implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl.a f24974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f24976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24978e;

    public /* synthetic */ I1(Integer num, tl.a aVar, int i10) {
        this(num, aVar, (i10 & 4) == 0, false);
    }

    public final void a() {
        if (this.f24977d.compareAndSet(false, true)) {
            this.f24978e = true;
            em.k.d(H9.f24930c, null, null, new H1(this, null), 3, null);
        }
    }

    @Override // kotlin.properties.c
    public final Object getValue(Object obj, zl.k property) {
        kotlin.jvm.internal.s.h(property, "property");
        if (this.f24975b || !this.f24978e) {
            a();
        }
        return this.f24976c;
    }

    public I1(Object obj, tl.a refreshLogic, boolean z10, boolean z11) {
        kotlin.jvm.internal.s.h(refreshLogic, "refreshLogic");
        this.f24974a = refreshLogic;
        this.f24975b = z10;
        this.f24976c = obj;
        this.f24977d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }
}
