package androidx.lifecycle;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f4502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.b f4503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f4504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f4505d;

    public u(s lifecycle, s.b minState, m dispatchQueue, final z1 parentJob) {
        kotlin.jvm.internal.s.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.h(minState, "minState");
        kotlin.jvm.internal.s.h(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.s.h(parentJob, "parentJob");
        this.f4502a = lifecycle;
        this.f4503b = minState;
        this.f4504c = dispatchQueue;
        y yVar = new y() { // from class: androidx.lifecycle.t
            @Override // androidx.lifecycle.y
            public final void c(b0 b0Var, s.a aVar) {
                u.c(this.f4494a, parentJob, b0Var, aVar);
            }
        };
        this.f4505d = yVar;
        if (lifecycle.b() != s.b.DESTROYED) {
            lifecycle.a(yVar);
        } else {
            z1.c0(parentJob, null, 1, null);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(u uVar, z1 z1Var, b0 source, s.a aVar) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(aVar, "<unused var>");
        if (source.getLifecycle().b() == s.b.DESTROYED) {
            z1.c0(z1Var, null, 1, null);
            uVar.b();
        } else if (source.getLifecycle().b().compareTo(uVar.f4503b) < 0) {
            uVar.f4504c.h();
        } else {
            uVar.f4504c.i();
        }
    }

    public final void b() {
        this.f4502a.d(this.f4505d);
        this.f4504c.g();
    }
}
