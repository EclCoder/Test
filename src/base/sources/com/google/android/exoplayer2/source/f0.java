package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import o9.j0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f0 implements o, Loader.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f17628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nb.j.a f17629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nb.a0 f17630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f17631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q.a f17632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ra.x f17633f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f17635h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final v0 f17637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f17638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f17639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f17640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17641n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f17634g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Loader f17636i = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements ra.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17643b;

        private b() {
        }

        private void b() {
            if (this.f17643b) {
                return;
            }
            f0.this.f17632e.h(ob.y.k(f0.this.f17637j.f18868l), f0.this.f17637j, 0, null, 0L);
            this.f17643b = true;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            b();
            f0 f0Var = f0.this;
            boolean z10 = f0Var.f17639l;
            if (z10 && f0Var.f17640m == null) {
                this.f17642a = 2;
            }
            int i11 = this.f17642a;
            if (i11 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                pVar.f48303b = f0Var.f17637j;
                this.f17642a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            ob.a.e(f0Var.f17640m);
            decoderInputBuffer.a(1);
            decoderInputBuffer.f16756e = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.m(f0.this.f17641n);
                ByteBuffer byteBuffer = decoderInputBuffer.f16754c;
                f0 f0Var2 = f0.this;
                byteBuffer.put(f0Var2.f17640m, 0, f0Var2.f17641n);
            }
            if ((i10 & 1) == 0) {
                this.f17642a = 2;
            }
            return -4;
        }

        public void c() {
            if (this.f17642a == 2) {
                this.f17642a = 1;
            }
        }

        @Override // ra.s
        public boolean isReady() {
            return f0.this.f17639l;
        }

        @Override // ra.s
        public void maybeThrowError() throws IOException {
            f0 f0Var = f0.this;
            if (f0Var.f17638k) {
                return;
            }
            f0Var.f17636i.maybeThrowError();
        }

        @Override // ra.s
        public int skipData(long j10) {
            b();
            if (j10 <= 0 || this.f17642a == 2) {
                return 0;
            }
            this.f17642a = 2;
            return 1;
        }
    }

    public f0(com.google.android.exoplayer2.upstream.a aVar, nb.j.a aVar2, nb.a0 a0Var, v0 v0Var, long j10, com.google.android.exoplayer2.upstream.c cVar, q.a aVar3, boolean z10) {
        this.f17628a = aVar;
        this.f17629b = aVar2;
        this.f17630c = a0Var;
        this.f17637j = v0Var;
        this.f17635h = j10;
        this.f17631d = cVar;
        this.f17632e = aVar3;
        this.f17638k = z10;
        this.f17633f = new ra.x(new ra.v(v0Var));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(c cVar, long j10, long j11, boolean z10) {
        nb.z zVar = cVar.f17647c;
        ra.i iVar = new ra.i(cVar.f17645a, cVar.f17646b, zVar.i(), zVar.j(), j10, j11, zVar.f());
        this.f17631d.b(cVar.f17645a);
        this.f17632e.k(iVar, 1, -1, null, 0, null, 0L, this.f17635h);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        if (this.f17639l || this.f17636i.i() || this.f17636i.h()) {
            return false;
        }
        nb.j jVarCreateDataSource = this.f17629b.createDataSource();
        nb.a0 a0Var = this.f17630c;
        if (a0Var != null) {
            jVarCreateDataSource.d(a0Var);
        }
        c cVar = new c(this.f17628a, jVarCreateDataSource);
        this.f17632e.t(new ra.i(cVar.f17645a, this.f17628a, this.f17636i.m(cVar, this, this.f17631d.a(1))), 1, -1, this.f17637j, 0, null, 0L, this.f17635h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            ra.s sVar = sVarArr[i10];
            if (sVar != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f17634g.remove(sVar);
                sVarArr[i10] = null;
            }
            if (sVarArr[i10] == null && rVarArr[i10] != null) {
                b bVar = new b();
                this.f17634g.add(bVar);
                sVarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, long j10, long j11) {
        this.f17641n = (int) cVar.f17647c.f();
        this.f17640m = (byte[]) ob.a.e(cVar.f17648d);
        this.f17639l = true;
        nb.z zVar = cVar.f17647c;
        ra.i iVar = new ra.i(cVar.f17645a, cVar.f17646b, zVar.i(), zVar.j(), j10, j11, this.f17641n);
        this.f17631d.b(cVar.f17645a);
        this.f17632e.n(iVar, 1, -1, this.f17637j, 0, null, 0L, this.f17635h);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return this.f17639l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return (this.f17639l || this.f17636i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        return this.f17633f;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Loader.c n(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        nb.z zVar = cVar.f17647c;
        ra.i iVar = new ra.i(cVar.f17645a, cVar.f17646b, zVar.i(), zVar.j(), j10, j11, zVar.f());
        long jC = this.f17631d.c(new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(1, -1, this.f17637j, 0, null, 0L, r0.i1(this.f17635h)), iOException, i10));
        boolean z10 = jC == C.TIME_UNSET || i10 >= this.f17631d.a(1);
        if (this.f17638k && z10) {
            ob.u.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f17639l = true;
            cVarG = Loader.f18745f;
        } else {
            cVarG = jC != C.TIME_UNSET ? Loader.g(false, jC) : Loader.f18746g;
        }
        Loader.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f17632e.p(iVar, 1, -1, this.f17637j, 0, null, 0L, this.f17635h, iOException, !zC);
        if (!zC) {
            this.f17631d.b(cVar.f17645a);
        }
        return cVar2;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f17636i.i();
    }

    public void j() {
        this.f17636i.k();
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f17634g.size(); i10++) {
            ((b) this.f17634g.get(i10)).c();
        }
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17645a = ra.i.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a f17646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nb.z f17647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f17648d;

        public c(com.google.android.exoplayer2.upstream.a aVar, nb.j jVar) {
            this.f17646b = aVar;
            this.f17647c = new nb.z(jVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() {
            this.f17647c.k();
            try {
                this.f17647c.h(this.f17646b);
                int i10 = 0;
                while (i10 != -1) {
                    int iF = (int) this.f17647c.f();
                    byte[] bArr = this.f17648d;
                    if (bArr == null) {
                        this.f17648d = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    } else if (iF == bArr.length) {
                        this.f17648d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    nb.z zVar = this.f17647c;
                    byte[] bArr2 = this.f17648d;
                    i10 = zVar.read(bArr2, iF, bArr2.length - iF);
                }
            } finally {
                nb.l.a(this.f17647c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
    }
}
