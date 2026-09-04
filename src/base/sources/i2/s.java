package i2;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import t1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s extends a0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f40800r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final t1.r f40801s = new t1.r.c().d("SinglePeriodTimeline").g(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f40802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f40803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f40804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f40805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f40806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f40807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f40808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f40809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f40810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f40811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f40812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t1.r f40813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t1.r.g f40814q;

    public s(long j10, boolean z10, boolean z11, boolean z12, Object obj, t1.r rVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, rVar);
    }

    @Override // t1.a0
    public int b(Object obj) {
        return f40800r.equals(obj) ? 0 : -1;
    }

    @Override // t1.a0
    public a0.b g(int i10, a0.b bVar, boolean z10) {
        w1.a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f40800r : null, 0, this.f40805h, -this.f40807j);
    }

    @Override // t1.a0
    public int i() {
        return 1;
    }

    @Override // t1.a0
    public Object m(int i10) {
        w1.a.c(i10, 0, 1);
        return f40800r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t1.a0
    public a0.c o(int i10, a0.c cVar, long j10) {
        long j11;
        w1.a.c(i10, 0, 1);
        long j12 = this.f40808k;
        boolean z10 = this.f40810m;
        if (!z10 || this.f40811n || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f40806i;
            if (j13 != C.TIME_UNSET) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return cVar.g(a0.c.f52526q, this.f40813p, this.f40812o, this.f40802e, this.f40803f, this.f40804g, this.f40809l, z10, this.f40814q, j11, this.f40806i, 0, 0, this.f40807j);
    }

    @Override // t1.a0
    public int p() {
        return 1;
    }

    public s(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, t1.r rVar) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, false, obj, rVar, z12 ? rVar.f52820d : null);
    }

    public s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, t1.r rVar, t1.r.g gVar) {
        this.f40802e = j10;
        this.f40803f = j11;
        this.f40804g = j12;
        this.f40805h = j13;
        this.f40806i = j14;
        this.f40807j = j15;
        this.f40808k = j16;
        this.f40809l = z10;
        this.f40810m = z11;
        this.f40811n = z12;
        this.f40812o = obj;
        this.f40813p = (t1.r) w1.a.e(rVar);
        this.f40814q = gVar;
    }
}
