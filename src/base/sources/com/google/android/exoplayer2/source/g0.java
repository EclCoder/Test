package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.y0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f17651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nb.j.a f17652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v0 f17653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f17654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f17655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f17656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h2 f17657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final y0 f17658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private nb.a0 f17659p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final nb.j.a f17660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f17661b = new com.google.android.exoplayer2.upstream.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17662c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f17663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f17664e;

        public b(nb.j.a aVar) {
            this.f17660a = (nb.j.a) ob.a.e(aVar);
        }

        public g0 a(y0.k kVar, long j10) {
            return new g0(this.f17664e, kVar, this.f17660a, j10, this.f17661b, this.f17662c, this.f17663d);
        }

        public b b(com.google.android.exoplayer2.upstream.c cVar) {
            if (cVar == null) {
                cVar = new com.google.android.exoplayer2.upstream.b();
            }
            this.f17661b = cVar;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(nb.a0 a0Var) {
        this.f17659p = a0Var;
        B(this.f17657n);
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f17658o;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ((f0) oVar).j();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        return new f0(this.f17651h, this.f17652i, this.f17659p, this.f17653j, this.f17654k, this.f17655l, v(bVar), this.f17656m);
    }

    private g0(String str, y0.k kVar, nb.j.a aVar, long j10, com.google.android.exoplayer2.upstream.c cVar, boolean z10, Object obj) {
        this.f17652i = aVar;
        this.f17654k = j10;
        this.f17655l = cVar;
        this.f17656m = z10;
        y0 y0VarA = new y0.c().g(Uri.EMPTY).d(kVar.f19107a.toString()).e(com.google.common.collect.c0.D(kVar)).f(obj).a();
        this.f17658o = y0VarA;
        v0.b bVarW = new v0.b().g0((String) sc.j.a(kVar.f19108b, "text/x-unknown")).X(kVar.f19109c).i0(kVar.f19110d).e0(kVar.f19111e).W(kVar.f19112f);
        String str2 = kVar.f19113g;
        this.f17653j = bVarW.U(str2 != null ? str2 : str).G();
        this.f17651h = new com.google.android.exoplayer2.upstream.a.b().i(kVar.f19107a).b(1).a();
        this.f17657n = new ra.t(j10, true, false, false, null, y0VarA);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
    }
}
