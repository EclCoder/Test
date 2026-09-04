package i2;

import t1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.media3.exoplayer.source.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1.r f40815f;

    public t(a0 a0Var, t1.r rVar) {
        super(a0Var);
        this.f40815f = rVar;
    }

    @Override // androidx.media3.exoplayer.source.m, t1.a0
    public a0.c o(int i10, a0.c cVar, long j10) {
        super.o(i10, cVar, j10);
        t1.r rVar = this.f40815f;
        cVar.f52538c = rVar;
        t1.r.h hVar = rVar.f52818b;
        cVar.f52537b = hVar != null ? hVar.f52917h : null;
        return cVar;
    }
}
