package u9;

import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f54238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f54239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f54240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f54241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54242f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f54238b = iArr;
        this.f54239c = jArr;
        this.f54240d = jArr2;
        this.f54241e = jArr3;
        int length = iArr.length;
        this.f54237a = length;
        if (length > 0) {
            this.f54242f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f54242f = 0L;
        }
    }

    public int b(long j10) {
        return r0.i(this.f54241e, j10, true, true);
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f54242f;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        int iB = b(j10);
        a0 a0Var = new a0(this.f54241e[iB], this.f54239c[iB]);
        if (a0Var.f54231a >= j10 || iB == this.f54237a - 1) {
            return new z.a(a0Var);
        }
        int i10 = iB + 1;
        return new z.a(a0Var, new a0(this.f54241e[i10], this.f54239c[i10]));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f54237a + ", sizes=" + Arrays.toString(this.f54238b) + ", offsets=" + Arrays.toString(this.f54239c) + ", timeUs=" + Arrays.toString(this.f54241e) + ", durationsUs=" + Arrays.toString(this.f54240d) + ")";
    }
}
