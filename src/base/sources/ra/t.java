package ra;

import android.net.Uri;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends h2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f51230s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final y0 f51231t = new y0.c().d("SinglePeriodTimeline").g(Uri.EMPTY).a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f51233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f51234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f51235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f51236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f51237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f51238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f51239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f51240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f51241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f51242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final y0 f51243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final y0.g f51244r;

    public t(long j10, boolean z10, boolean z11, boolean z12, Object obj, y0 y0Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, y0Var);
    }

    @Override // com.google.android.exoplayer2.h2
    public int f(Object obj) {
        return f51230s.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.h2
    public h2.b k(int i10, h2.b bVar, boolean z10) {
        ob.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? f51230s : null, 0, this.f51235i, -this.f51237k);
    }

    @Override // com.google.android.exoplayer2.h2
    public int m() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.h2
    public Object q(int i10) {
        ob.a.c(i10, 0, 1);
        return f51230s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.h2
    public h2.d s(int i10, h2.d dVar, long j10) {
        long j11;
        ob.a.c(i10, 0, 1);
        long j12 = this.f51238l;
        boolean z10 = this.f51240n;
        if (!z10 || this.f51241o || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f51236j;
            if (j13 != C.TIME_UNSET) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return dVar.i(h2.d.f17009r, this.f51243q, this.f51242p, this.f51232f, this.f51233g, this.f51234h, this.f51239m, z10, this.f51244r, j11, this.f51236j, 0, 0, this.f51237k);
    }

    @Override // com.google.android.exoplayer2.h2
    public int t() {
        return 1;
    }

    public t(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, y0 y0Var) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, y0Var, z12 ? y0Var.f18984d : null);
    }

    public t(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, y0 y0Var, y0.g gVar) {
        this.f51232f = j10;
        this.f51233g = j11;
        this.f51234h = j12;
        this.f51235i = j13;
        this.f51236j = j14;
        this.f51237k = j15;
        this.f51238l = j16;
        this.f51239m = z10;
        this.f51240n = z11;
        this.f51241o = z12;
        this.f51242p = obj;
        this.f51243q = (y0) ob.a.e(y0Var);
        this.f51244r = gVar;
    }
}
