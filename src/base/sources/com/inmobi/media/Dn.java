package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Dn implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gn f24673a;

    public Dn(em.o0 o0Var, Gn gn2) {
        this.f24673a = gn2;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3348u9 c3348u9 = this.f24673a.f24894c;
        if (c3348u9 != null) {
            c3348u9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        if (zBooleanValue) {
            Zj zj2 = this.f24673a.f24899h;
            if (zj2 != null) {
                zj2.a();
            }
        } else {
            Zj zj3 = this.f24673a.f24899h;
            if (zj3 != null) {
                zj3.b();
            }
        }
        return fl.g0.f38750a;
    }
}
