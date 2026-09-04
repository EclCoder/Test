package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final androidx.media3.exoplayer.source.r.b f5124u = new androidx.media3.exoplayer.source.r.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.a0 f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f5126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f5130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i2.v f5132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k2.w f5133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f5134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f5135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t1.w f5139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f5141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f5142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f5143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f5144t;

    public c2(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, i2.v vVar, k2.w wVar, List list, androidx.media3.exoplayer.source.r.b bVar2, boolean z11, int i11, int i12, t1.w wVar2, long j12, long j13, long j14, long j15, boolean z12) {
        this.f5125a = a0Var;
        this.f5126b = bVar;
        this.f5127c = j10;
        this.f5128d = j11;
        this.f5129e = i10;
        this.f5130f = exoPlaybackException;
        this.f5131g = z10;
        this.f5132h = vVar;
        this.f5133i = wVar;
        this.f5134j = list;
        this.f5135k = bVar2;
        this.f5136l = z11;
        this.f5137m = i11;
        this.f5138n = i12;
        this.f5139o = wVar2;
        this.f5141q = j12;
        this.f5142r = j13;
        this.f5143s = j14;
        this.f5144t = j15;
        this.f5140p = z12;
    }

    public static c2 k(k2.w wVar) {
        t1.a0 a0Var = t1.a0.f52510a;
        androidx.media3.exoplayer.source.r.b bVar = f5124u;
        return new c2(a0Var, bVar, C.TIME_UNSET, 0L, 1, null, false, i2.v.f40816d, wVar, com.google.common.collect.c0.C(), bVar, false, 1, 0, t1.w.f53027d, 0L, 0L, 0L, 0L, false);
    }

    public static androidx.media3.exoplayer.source.r.b l() {
        return f5124u;
    }

    public c2 a() {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, m(), SystemClock.elapsedRealtime(), this.f5140p);
    }

    public c2 b(boolean z10) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, z10, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 c(androidx.media3.exoplayer.source.r.b bVar) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, bVar, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 d(androidx.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, long j13, i2.v vVar, k2.w wVar, List list) {
        return new c2(this.f5125a, bVar, j11, j12, this.f5129e, this.f5130f, this.f5131g, vVar, wVar, list, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, j13, j10, SystemClock.elapsedRealtime(), this.f5140p);
    }

    public c2 e(boolean z10, int i10, int i11) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, z10, i10, i11, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 f(ExoPlaybackException exoPlaybackException) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, exoPlaybackException, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 g(t1.w wVar) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, wVar, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 h(int i10) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, i10, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public c2 i(boolean z10) {
        return new c2(this.f5125a, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, z10);
    }

    public c2 j(t1.a0 a0Var) {
        return new c2(a0Var, this.f5126b, this.f5127c, this.f5128d, this.f5129e, this.f5130f, this.f5131g, this.f5132h, this.f5133i, this.f5134j, this.f5135k, this.f5136l, this.f5137m, this.f5138n, this.f5139o, this.f5141q, this.f5142r, this.f5143s, this.f5144t, this.f5140p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f5143s;
        }
        do {
            j10 = this.f5144t;
            j11 = this.f5143s;
        } while (j10 != this.f5144t);
        return w1.c0.E0(w1.c0.c1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f5139o.f53030a)));
    }

    public boolean n() {
        return this.f5129e == 3 && this.f5136l && this.f5138n == 0;
    }

    public void o(long j10) {
        this.f5143s = j10;
        this.f5144t = SystemClock.elapsedRealtime();
    }
}
