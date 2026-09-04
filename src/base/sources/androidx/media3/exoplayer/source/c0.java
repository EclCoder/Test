package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.w;
import c2.x1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends androidx.media3.exoplayer.source.a implements b0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0055a f5882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w.a f5883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f5884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f5886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z1.m f5891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private t1.r f5892r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m {
        a(t1.a0 a0Var) {
            super(a0Var);
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f52524f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.c o(int i10, t1.a0.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f52546k = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0055a f5894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w.a f5895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e2.k f5896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f5897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f5898g;

        public b(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, final o2.u uVar) {
            this(interfaceC0055a, new w.a() { // from class: i2.p
                @Override // androidx.media3.exoplayer.source.w.a
                public final w a(x1 x1Var) {
                    return c0.b.a(uVar, x1Var);
                }
            });
        }

        public static /* synthetic */ w a(o2.u uVar, x1 x1Var) {
            return new i2.b(uVar);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c0 d(t1.r rVar) {
            w1.a.e(rVar.f52818b);
            return new c0(rVar, this.f5894c, this.f5895d, this.f5896e.a(rVar), this.f5897f, this.f5898g, null);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b c(e2.k kVar) {
            this.f5896e = (e2.k) w1.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b e(androidx.media3.exoplayer.upstream.b bVar) {
            this.f5897f = (androidx.media3.exoplayer.upstream.b) w1.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, w.a aVar) {
            this(interfaceC0055a, aVar, new androidx.media3.exoplayer.drm.g(), new androidx.media3.exoplayer.upstream.a(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        }

        public b(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, w.a aVar, e2.k kVar, androidx.media3.exoplayer.upstream.b bVar, int i10) {
            this.f5894c = interfaceC0055a;
            this.f5895d = aVar;
            this.f5896e = kVar;
            this.f5897f = bVar;
            this.f5898g = i10;
        }
    }

    /* synthetic */ c0(t1.r rVar, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, a aVar2) {
        this(rVar, interfaceC0055a, aVar, iVar, bVar, i10);
    }

    private t1.r.h A() {
        return (t1.r.h) w1.a.e(a().f52818b);
    }

    private void B() {
        t1.a0 sVar = new i2.s(this.f5888n, this.f5889o, false, this.f5890p, null, a());
        if (this.f5887m) {
            sVar = new a(sVar);
        }
        y(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized t1.r a() {
        return this.f5892r;
    }

    @Override // androidx.media3.exoplayer.source.b0.c
    public void b(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f5888n;
        }
        if (!this.f5887m && this.f5888n == j10 && this.f5889o == z10 && this.f5890p == z11) {
            return;
        }
        this.f5888n = j10;
        this.f5889o = z10;
        this.f5890p = z11;
        this.f5887m = false;
        B();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q f(r.b bVar, l2.b bVar2, long j10) {
        androidx.media3.datasource.a aVarCreateDataSource = this.f5882h.createDataSource();
        z1.m mVar = this.f5891q;
        if (mVar != null) {
            aVarCreateDataSource.c(mVar);
        }
        t1.r.h hVarA = A();
        return new b0(hVarA.f52910a, aVarCreateDataSource, this.f5883i.a(v()), this.f5884j, q(bVar), this.f5885k, s(bVar), this, bVar2, hVarA.f52914e, this.f5886l, w1.c0.E0(hVarA.f52918i));
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        ((b0) qVar).R();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void k(t1.r rVar) {
        this.f5892r = rVar;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void x(z1.m mVar) {
        this.f5891q = mVar;
        this.f5884j.e((Looper) w1.a.e(Looper.myLooper()), v());
        this.f5884j.a();
        B();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void z() {
        this.f5884j.release();
    }

    private c0(t1.r rVar, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10) {
        this.f5892r = rVar;
        this.f5882h = interfaceC0055a;
        this.f5883i = aVar;
        this.f5884j = iVar;
        this.f5885k = bVar;
        this.f5886l = i10;
        this.f5887m = true;
        this.f5888n = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() {
    }
}
