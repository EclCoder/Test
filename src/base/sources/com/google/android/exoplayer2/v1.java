package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class v1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final com.google.android.exoplayer2.source.p.b f18909t = new com.google.android.exoplayer2.source.p.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f18910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.p.b f18911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f18915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ra.x f18917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb.b0 f18918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f18919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.p.b f18920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f18923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f18925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f18926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f18927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f18928s;

    public v1(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, ra.x xVar, lb.b0 b0Var, List list, com.google.android.exoplayer2.source.p.b bVar2, boolean z11, int i11, w1 w1Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f18910a = h2Var;
        this.f18911b = bVar;
        this.f18912c = j10;
        this.f18913d = j11;
        this.f18914e = i10;
        this.f18915f = exoPlaybackException;
        this.f18916g = z10;
        this.f18917h = xVar;
        this.f18918i = b0Var;
        this.f18919j = list;
        this.f18920k = bVar2;
        this.f18921l = z11;
        this.f18922m = i11;
        this.f18923n = w1Var;
        this.f18925p = j12;
        this.f18926q = j13;
        this.f18927r = j14;
        this.f18928s = j15;
        this.f18924o = z12;
    }

    public static v1 k(lb.b0 b0Var) {
        h2 h2Var = h2.f16987a;
        com.google.android.exoplayer2.source.p.b bVar = f18909t;
        return new v1(h2Var, bVar, C.TIME_UNSET, 0L, 1, null, false, ra.x.f51253d, b0Var, com.google.common.collect.c0.C(), bVar, false, 0, w1.f18938d, 0L, 0L, 0L, 0L, false);
    }

    public static com.google.android.exoplayer2.source.p.b l() {
        return f18909t;
    }

    public v1 a() {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, m(), SystemClock.elapsedRealtime(), this.f18924o);
    }

    public v1 b(boolean z10) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, z10, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 c(com.google.android.exoplayer2.source.p.b bVar) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, bVar, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 d(com.google.android.exoplayer2.source.p.b bVar, long j10, long j11, long j12, long j13, ra.x xVar, lb.b0 b0Var, List list) {
        return new v1(this.f18910a, bVar, j11, j12, this.f18914e, this.f18915f, this.f18916g, xVar, b0Var, list, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, j13, j10, SystemClock.elapsedRealtime(), this.f18924o);
    }

    public v1 e(boolean z10, int i10) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, z10, i10, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 f(ExoPlaybackException exoPlaybackException) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, exoPlaybackException, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 g(w1 w1Var) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, w1Var, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 h(int i10) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, i10, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public v1 i(boolean z10) {
        return new v1(this.f18910a, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, z10);
    }

    public v1 j(h2 h2Var) {
        return new v1(h2Var, this.f18911b, this.f18912c, this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, this.f18920k, this.f18921l, this.f18922m, this.f18923n, this.f18925p, this.f18926q, this.f18927r, this.f18928s, this.f18924o);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f18927r;
        }
        do {
            j10 = this.f18928s;
            j11 = this.f18927r;
        } while (j10 != this.f18928s);
        return ob.r0.H0(ob.r0.i1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f18923n.f18942a)));
    }

    public boolean n() {
        return this.f18914e == 3 && this.f18921l && this.f18922m == 0;
    }

    public void o(long j10) {
        this.f18927r = j10;
        this.f18928s = SystemClock.elapsedRealtime();
    }
}
