package ba;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ma.k;
import ob.r0;
import u9.a0;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f8698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8699c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f8697a = jArr;
        this.f8698b = jArr2;
        this.f8699c = j10 == C.TIME_UNSET ? r0.H0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c b(long j10, k kVar, long j11) {
        int length = kVar.f45400e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (kVar.f45398c + kVar.f45400e[i12]);
            j12 += (long) (kVar.f45399d + kVar.f45401f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair c(long j10, long[] jArr, long[] jArr2) {
        int i10 = r0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i11] - j12))) + j12));
    }

    @Override // ba.g
    public long a() {
        return -1L;
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f8699c;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        Pair pairC = c(r0.i1(r0.r(j10, 0L, this.f8699c)), this.f8698b, this.f8697a);
        return new z.a(new a0(r0.H0(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // ba.g
    public long getTimeUs(long j10) {
        return r0.H0(((Long) c(j10, this.f8697a, this.f8698b).second).longValue());
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }
}
