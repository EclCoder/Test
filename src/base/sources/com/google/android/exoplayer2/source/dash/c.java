package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.e0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lb.r;
import nb.a0;
import nb.f;
import nb.j;
import nb.v;
import o9.j0;
import ob.r0;
import p9.s1;
import ta.g;
import ta.h;
import ta.k;
import ta.m;
import ta.n;
import ta.o;
import ta.p;
import va.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f17571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua.b f17572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f17573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f17575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e.c f17578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final b[] f17579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f17580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private va.c f17581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f17583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17584n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.google.android.exoplayer2.source.dash.a.InterfaceC0284a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j.a f17585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g.a f17587c;

        public a(j.a aVar) {
            this(aVar, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0284a
        public com.google.android.exoplayer2.source.dash.a a(v vVar, va.c cVar, ua.b bVar, int i10, int[] iArr, r rVar, int i11, long j10, boolean z10, List list, e.c cVar2, a0 a0Var, s1 s1Var, f fVar) {
            j jVarCreateDataSource = this.f17585a.createDataSource();
            if (a0Var != null) {
                jVarCreateDataSource.d(a0Var);
            }
            return new c(this.f17587c, vVar, cVar, bVar, i10, iArr, rVar, i11, jVarCreateDataSource, j10, this.f17586b, z10, list, cVar2, s1Var, fVar);
        }

        public a(j.a aVar, int i10) {
            this(ta.e.f53193j, aVar, i10);
        }

        public a(g.a aVar, j.a aVar2, int i10) {
            this.f17587c = aVar;
            this.f17585a = aVar2;
            this.f17586b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f17588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final va.j f17589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final va.b f17590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ua.e f17591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f17592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f17593f;

        b(long j10, va.j jVar, va.b bVar, g gVar, long j11, ua.e eVar) {
            this.f17592e = j10;
            this.f17589b = jVar;
            this.f17590c = bVar;
            this.f17593f = j11;
            this.f17588a = gVar;
            this.f17591d = eVar;
        }

        b b(long j10, va.j jVar) throws BehindLiveWindowException {
            long jE;
            long jE2;
            ua.e eVarK = this.f17589b.k();
            ua.e eVarK2 = jVar.k();
            if (eVarK == null) {
                return new b(j10, jVar, this.f17590c, this.f17588a, this.f17593f, eVarK);
            }
            if (!eVarK.g()) {
                return new b(j10, jVar, this.f17590c, this.f17588a, this.f17593f, eVarK2);
            }
            long jF = eVarK.f(j10);
            if (jF == 0) {
                return new b(j10, jVar, this.f17590c, this.f17588a, this.f17593f, eVarK2);
            }
            long jH = eVarK.h();
            long timeUs = eVarK.getTimeUs(jH);
            long j11 = jF + jH;
            long j12 = j11 - 1;
            long timeUs2 = eVarK.getTimeUs(j12) + eVarK.a(j12, j10);
            long jH2 = eVarK2.h();
            long timeUs3 = eVarK2.getTimeUs(jH2);
            long j13 = this.f17593f;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    jE2 = j13 - (eVarK2.e(timeUs, j10) - jH);
                } else {
                    jE = eVarK.e(timeUs3, j10) - jH2;
                }
                return new b(j10, jVar, this.f17590c, this.f17588a, jE2, eVarK2);
            }
            jE = j11 - jH2;
            jE2 = j13 + jE;
            return new b(j10, jVar, this.f17590c, this.f17588a, jE2, eVarK2);
        }

        b c(ua.e eVar) {
            return new b(this.f17592e, this.f17589b, this.f17590c, this.f17588a, this.f17593f, eVar);
        }

        b d(va.b bVar) {
            return new b(this.f17592e, this.f17589b, bVar, this.f17588a, this.f17593f, this.f17591d);
        }

        public long e(long j10) {
            return this.f17591d.b(this.f17592e, j10) + this.f17593f;
        }

        public long f() {
            return this.f17591d.h() + this.f17593f;
        }

        public long g(long j10) {
            return (e(j10) + this.f17591d.i(this.f17592e, j10)) - 1;
        }

        public long h() {
            return this.f17591d.f(this.f17592e);
        }

        public long i(long j10) {
            return k(j10) + this.f17591d.a(j10 - this.f17593f, this.f17592e);
        }

        public long j(long j10) {
            return this.f17591d.e(j10, this.f17592e) + this.f17593f;
        }

        public long k(long j10) {
            return this.f17591d.getTimeUs(j10 - this.f17593f);
        }

        public i l(long j10) {
            return this.f17591d.d(j10 - this.f17593f);
        }

        public boolean m(long j10, long j11) {
            return this.f17591d.g() || j11 == C.TIME_UNSET || i(j10) <= j11;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class C0285c extends ta.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f17594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f17595f;

        public C0285c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f17594e = bVar;
            this.f17595f = j12;
        }

        @Override // ta.o
        public long a() {
            c();
            return this.f17594e.k(d());
        }

        @Override // ta.o
        public long b() {
            c();
            return this.f17594e.i(d());
        }
    }

    public c(g.a aVar, v vVar, va.c cVar, ua.b bVar, int i10, int[] iArr, r rVar, int i11, j jVar, long j10, int i12, boolean z10, List list, e.c cVar2, s1 s1Var, f fVar) {
        this.f17571a = vVar;
        this.f17581k = cVar;
        this.f17572b = bVar;
        this.f17573c = iArr;
        this.f17580j = rVar;
        int i13 = i11;
        this.f17574d = i13;
        this.f17575e = jVar;
        this.f17582l = i10;
        this.f17576f = j10;
        this.f17577g = i12;
        e.c cVar3 = cVar2;
        this.f17578h = cVar3;
        long jF = cVar.f(i10);
        ArrayList arrayListL = l();
        this.f17579i = new b[rVar.length()];
        int i14 = 0;
        while (i14 < this.f17579i.length) {
            va.j jVar2 = (va.j) arrayListL.get(rVar.getIndexInTrackGroup(i14));
            va.b bVarJ = bVar.j(jVar2.f55354c);
            b[] bVarArr = this.f17579i;
            va.b bVar2 = bVarJ == null ? (va.b) jVar2.f55354c.get(0) : bVarJ;
            g gVarA = aVar.a(i13, jVar2.f55353b, z10, list, cVar3, s1Var);
            long j11 = jF;
            bVarArr[i14] = new b(j11, jVar2, bVar2, gVarA, 0L, jVar2.k());
            i14++;
            cVar3 = cVar2;
            jF = j11;
            i13 = i11;
        }
    }

    private com.google.android.exoplayer2.upstream.c.a i(r rVar, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.d(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = ua.b.f(list);
        return new com.google.android.exoplayer2.upstream.c.a(iF, iF - this.f17572b.g(list), length, i10);
    }

    private long j(long j10, long j11) {
        if (!this.f17581k.f55306d || this.f17579i[0].h() == 0) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(k(j10), this.f17579i[0].i(this.f17579i[0].g(j10))) - j11);
    }

    private long k(long j10) {
        va.c cVar = this.f17581k;
        long j11 = cVar.f55303a;
        return j11 == C.TIME_UNSET ? C.TIME_UNSET : j10 - r0.H0(j11 + cVar.c(this.f17582l).f55339b);
    }

    private ArrayList l() {
        List list = this.f17581k.c(this.f17582l).f55340c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f17573c) {
            arrayList.addAll(((va.a) list.get(i10)).f55295c);
        }
        return arrayList;
    }

    private long m(b bVar, n nVar, long j10, long j11, long j12) {
        return nVar != null ? nVar.e() : r0.r(bVar.j(j10), j11, j12);
    }

    private b p(int i10) {
        b bVar = this.f17579i[i10];
        va.b bVarJ = this.f17572b.j(bVar.f17589b.f55354c);
        if (bVarJ == null || bVarJ.equals(bVar.f17590c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f17579i[i10] = bVarD;
        return bVarD;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void a(r rVar) {
        this.f17580j = rVar;
    }

    @Override // ta.j
    public long b(long j10, j0 j0Var) {
        for (b bVar : this.f17579i) {
            if (bVar.f17591d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j11 = bVar.j(j10);
                    long jK = bVar.k(j11);
                    return j0Var.a(j10, jK, (jK >= j10 || (jH != -1 && j11 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j11 + 1));
                }
            }
        }
        return j10;
    }

    @Override // ta.j
    public boolean c(long j10, ta.f fVar, List list) {
        if (this.f17583m != null) {
            return false;
        }
        return this.f17580j.g(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void d(va.c cVar, int i10) {
        try {
            this.f17581k = cVar;
            this.f17582l = i10;
            long jF = cVar.f(i10);
            ArrayList arrayListL = l();
            for (int i11 = 0; i11 < this.f17579i.length; i11++) {
                va.j jVar = (va.j) arrayListL.get(this.f17580j.getIndexInTrackGroup(i11));
                b[] bVarArr = this.f17579i;
                bVarArr[i11] = bVarArr[i11].b(jF, jVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f17583m = e10;
        }
    }

    @Override // ta.j
    public void e(ta.f fVar) {
        u9.c cVarB;
        if (fVar instanceof m) {
            int iH = this.f17580j.h(((m) fVar).f53214d);
            b bVar = this.f17579i[iH];
            if (bVar.f17591d == null && (cVarB = bVar.f17588a.b()) != null) {
                this.f17579i[iH] = bVar.c(new ua.g(cVarB, bVar.f17589b.f55355d));
            }
        }
        e.c cVar = this.f17578h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // ta.j
    public void g(long j10, long j11, List list, h hVar) {
        boolean z10;
        o[] oVarArr;
        long j12;
        int i10;
        int i11;
        c cVar;
        n nVar;
        c cVar2 = this;
        if (cVar2.f17583m != null) {
            return;
        }
        long j13 = j11 - j10;
        long jH0 = r0.H0(cVar2.f17581k.f55303a) + r0.H0(cVar2.f17581k.c(cVar2.f17582l).f55339b) + j11;
        e.c cVar3 = cVar2.f17578h;
        if (cVar3 == null || !cVar3.h(jH0)) {
            long jH1 = r0.H0(r0.e0(cVar2.f17576f));
            long jK = cVar2.k(jH1);
            boolean z11 = true;
            n nVar2 = list.isEmpty() ? null : (n) list.get(list.size() - 1);
            int length = cVar2.f17580j.length();
            o[] oVarArr2 = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = cVar2.f17579i[i12];
                if (bVar.f17591d == null) {
                    oVarArr2[i12] = o.f53263a;
                    cVar = cVar2;
                    nVar = nVar2;
                    z10 = z11;
                    oVarArr = oVarArr2;
                    j12 = j13;
                    i11 = length;
                    i10 = i12;
                } else {
                    o[] oVarArr3 = oVarArr2;
                    long jE = bVar.e(jH1);
                    z10 = z11;
                    oVarArr = oVarArr3;
                    n nVar3 = nVar2;
                    long jG = bVar.g(jH1);
                    j12 = j13;
                    i10 = i12;
                    i11 = length;
                    long jM = cVar2.m(bVar, nVar3, j11, jE, jG);
                    cVar = cVar2;
                    nVar = nVar3;
                    if (jM < jE) {
                        oVarArr[i10] = o.f53263a;
                    } else {
                        oVarArr[i10] = new C0285c(cVar.p(i10), jM, jG, jK);
                    }
                }
                i12 = i10 + 1;
                cVar2 = cVar;
                length = i11;
                nVar2 = nVar;
                oVarArr2 = oVarArr;
                z11 = z10;
                j13 = j12;
            }
            c cVar4 = cVar2;
            n nVar4 = nVar2;
            boolean z12 = z11;
            cVar4.f17580j.e(j10, j13, cVar4.j(jH1, j10), list, oVarArr2);
            b bVarP = cVar4.p(cVar4.f17580j.getSelectedIndex());
            g gVar = bVarP.f17588a;
            if (gVar != null) {
                va.j jVar = bVarP.f17589b;
                i iVarM = gVar.e() == null ? jVar.m() : null;
                i iVarL = bVarP.f17591d == null ? jVar.l() : null;
                if (iVarM != null || iVarL != null) {
                    hVar.f53220a = cVar4.n(bVarP, cVar4.f17575e, cVar4.f17580j.getSelectedFormat(), cVar4.f17580j.getSelectionReason(), cVar4.f17580j.getSelectionData(), iVarM, iVarL, null);
                    return;
                }
            }
            long j14 = bVarP.f17592e;
            va.c cVar5 = cVar4.f17581k;
            boolean z13 = (cVar5.f55306d && cVar4.f17582l == cVar5.d() + (-1)) ? z12 : false;
            boolean z14 = (z13 && j14 == C.TIME_UNSET) ? false : z12;
            if (bVarP.h() == 0) {
                hVar.f53221b = z14;
                return;
            }
            long jE2 = bVarP.e(jH1);
            long jG2 = bVarP.g(jH1);
            if (z13) {
                long jI = bVarP.i(jG2);
                z14 &= jI + (jI - bVarP.k(jG2)) >= j14 ? z12 : false;
            }
            boolean z15 = z14;
            long jM2 = cVar4.m(bVarP, nVar4, j11, jE2, jG2);
            if (jM2 < jE2) {
                cVar4.f17583m = new BehindLiveWindowException();
                return;
            }
            if (jM2 > jG2 || (cVar4.f17584n && jM2 >= jG2)) {
                hVar.f53221b = z15;
                return;
            }
            if (z15 && bVarP.k(jM2) >= j14) {
                hVar.f53221b = z12;
                return;
            }
            int iMin = (int) Math.min(cVar4.f17577g, (jG2 - jM2) + 1);
            if (j14 != C.TIME_UNSET) {
                while (iMin > 1 && bVarP.k((((long) iMin) + jM2) - 1) >= j14) {
                    iMin--;
                }
            }
            hVar.f53220a = cVar4.o(bVarP, cVar4.f17575e, cVar4.f17574d, cVar4.f17580j.getSelectedFormat(), cVar4.f17580j.getSelectionReason(), cVar4.f17580j.getSelectionData(), jM2, iMin, list.isEmpty() ? j11 : -9223372036854775807L, jK, null);
        }
    }

    @Override // ta.j
    public int getPreferredQueueSize(long j10, List list) {
        return (this.f17583m != null || this.f17580j.length() < 2) ? list.size() : this.f17580j.evaluateQueueSize(j10, list);
    }

    @Override // ta.j
    public boolean h(ta.f fVar, boolean z10, com.google.android.exoplayer2.upstream.c.C0294c c0294c, com.google.android.exoplayer2.upstream.c cVar) {
        com.google.android.exoplayer2.upstream.c.b bVarD;
        if (!z10) {
            return false;
        }
        e.c cVar2 = this.f17578h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f17581k.f55306d && (fVar instanceof n)) {
            IOException iOException = c0294c.f18809c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f18739d == 404) {
                b bVar = this.f17579i[this.f17580j.h(fVar.f53214d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((n) fVar).e() > (bVar.f() + jH) - 1) {
                        this.f17584n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f17579i[this.f17580j.h(fVar.f53214d)];
        va.b bVarJ = this.f17572b.j(bVar2.f17589b.f55354c);
        if (bVarJ != null && !bVar2.f17590c.equals(bVarJ)) {
            return true;
        }
        com.google.android.exoplayer2.upstream.c.a aVarI = i(this.f17580j, bVar2.f17589b.f55354c);
        if ((aVarI.a(2) || aVarI.a(1)) && (bVarD = cVar.d(aVarI, c0294c)) != null && aVarI.a(bVarD.f18805a)) {
            int i10 = bVarD.f18805a;
            if (i10 == 2) {
                r rVar = this.f17580j;
                return rVar.f(rVar.h(fVar.f53214d), bVarD.f18806b);
            }
            if (i10 == 1) {
                this.f17572b.e(bVar2.f17590c, bVarD.f18806b);
                return true;
            }
        }
        return false;
    }

    @Override // ta.j
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f17583m;
        if (iOException != null) {
            throw iOException;
        }
        this.f17571a.maybeThrowError();
    }

    protected ta.f n(b bVar, j jVar, v0 v0Var, int i10, Object obj, i iVar, i iVar2, nb.g gVar) {
        i iVar3 = iVar;
        va.j jVar2 = bVar.f17589b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f17590c.f55299a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(jVar, ua.f.a(jVar2, bVar.f17590c.f55299a, iVar3, 0, e0.q()), v0Var, i10, obj, bVar.f17588a);
    }

    protected ta.f o(b bVar, j jVar, int i10, v0 v0Var, int i11, Object obj, long j10, int i12, long j11, long j12, nb.g gVar) {
        va.j jVar2 = bVar.f17589b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f17588a == null) {
            int i13 = 8;
            long jI = bVar.i(j10);
            if (bVar.m(j10, j12)) {
                i13 = 0;
            }
            return new p(jVar, ua.f.a(jVar2, bVar.f17590c.f55299a, iVarL, i13, e0.q()), v0Var, i11, obj, jK, jI, j10, i10, v0Var);
        }
        int i14 = 8;
        int i15 = 1;
        int i16 = 1;
        while (i15 < i12) {
            i iVarA = iVarL.a(bVar.l(j10 + ((long) i15)), bVar.f17590c.f55299a);
            if (iVarA == null) {
                break;
            }
            i16++;
            i15++;
            iVarL = iVarA;
        }
        long j13 = (j10 + ((long) i16)) - 1;
        int i17 = i16;
        long jI2 = bVar.i(j13);
        long j14 = bVar.f17592e;
        if (j14 == C.TIME_UNSET || j14 > jI2) {
            j14 = -9223372036854775807L;
        }
        if (bVar.m(j13, j12)) {
            i14 = 0;
        }
        return new k(jVar, ua.f.a(jVar2, bVar.f17590c.f55299a, iVarL, i14, e0.q()), v0Var, i11, obj, jK, jI2, j11, j14, j10, i17, -jVar2.f55355d, bVar.f17588a);
    }

    @Override // ta.j
    public void release() {
        for (b bVar : this.f17579i) {
            g gVar = bVar.f17588a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
