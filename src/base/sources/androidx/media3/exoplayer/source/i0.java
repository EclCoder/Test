package androidx.media3.exoplayer.source;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z1.g f5991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0055a f5992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t1.o f5993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f5994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f5996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t1.a0 f5997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t1.r f5998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z1.m f5999p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0055a f6000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f6001b = new androidx.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6002c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f6003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f6004e;

        public b(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            this.f6000a = (androidx.media3.datasource.a.InterfaceC0055a) w1.a.e(interfaceC0055a);
        }

        public i0 a(t1.r.k kVar, long j10) {
            return new i0(this.f6004e, kVar, this.f6000a, j10, this.f6001b, this.f6002c, this.f6003d);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new androidx.media3.exoplayer.upstream.a();
            }
            this.f6001b = bVar;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public t1.r a() {
        return this.f5998o;
    }

    @Override // androidx.media3.exoplayer.source.r
    public q f(r.b bVar, l2.b bVar2, long j10) {
        return new h0(this.f5991h, this.f5992i, this.f5999p, this.f5993j, this.f5994k, this.f5995l, s(bVar), this.f5996m);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        ((h0) qVar).l();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void x(z1.m mVar) {
        this.f5999p = mVar;
        y(this.f5997n);
    }

    private i0(String str, t1.r.k kVar, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, long j10, androidx.media3.exoplayer.upstream.b bVar, boolean z10, Object obj) {
        this.f5992i = interfaceC0055a;
        this.f5994k = j10;
        this.f5995l = bVar;
        this.f5996m = z10;
        t1.r rVarA = new t1.r.c().g(Uri.EMPTY).d(kVar.f52936a.toString()).e(com.google.common.collect.c0.D(kVar)).f(obj).a();
        this.f5998o = rVarA;
        t1.o.b bVarC0 = new t1.o.b().o0((String) sc.j.a(kVar.f52937b, "text/x-unknown")).e0(kVar.f52938c).q0(kVar.f52939d).m0(kVar.f52940e).c0(kVar.f52941f);
        String str2 = kVar.f52942g;
        this.f5993j = bVarC0.a0(str2 != null ? str2 : str).K();
        this.f5991h = new z1.g.b().i(kVar.f52936a).b(1).a();
        this.f5997n = new i2.s(j10, true, false, false, null, rVarA);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void z() {
    }
}
