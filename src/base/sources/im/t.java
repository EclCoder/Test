package im;

import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gm.u f41545a;

    public t(gm.u uVar) {
        this.f41545a = uVar;
    }

    @Override // hm.f
    public Object emit(Object obj, kl.f fVar) {
        Object objO = this.f41545a.o(obj, fVar);
        return objO == ll.b.f() ? objO : g0.f38750a;
    }
}
