package h3;

import android.util.Pair;
import c3.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.j0;
import o2.k0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f40179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f40180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40181c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f40179a = jArr;
        this.f40180b = jArr2;
        this.f40181c = j10 == C.TIME_UNSET ? c0.E0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c b(long j10, l lVar, long j11) {
        int length = lVar.f9534e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f9532c + lVar.f9534e[i12]);
            j12 += (long) (lVar.f9533d + lVar.f9535f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair c(long j10, long[] jArr, long[] jArr2) {
        int iG = c0.g(jArr, j10, true, true);
        long j11 = jArr[iG];
        long j12 = jArr2[iG];
        int i10 = iG + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // h3.g
    public long a() {
        return -1L;
    }

    @Override // h3.g
    public int g() {
        return -2147483647;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f40181c;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        Pair pairC = c(c0.c1(c0.p(j10, 0L, this.f40181c)), this.f40180b, this.f40179a);
        return new j0.a(new k0(c0.E0(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // h3.g
    public long getTimeUs(long j10) {
        return c0.E0(((Long) c(j10, this.f40179a, this.f40180b).second).longValue());
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }
}
