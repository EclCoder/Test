package o2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f48057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f48058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f48059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f48060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48061f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f48057b = iArr;
        this.f48058c = jArr;
        this.f48059d = jArr2;
        this.f48060e = jArr3;
        int length = iArr.length;
        this.f48056a = length;
        if (length > 0) {
            this.f48061f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f48061f = 0L;
        }
    }

    public int b(long j10) {
        return w1.c0.g(this.f48060e, j10, true, true);
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f48061f;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        int iB = b(j10);
        k0 k0Var = new k0(this.f48060e[iB], this.f48058c[iB]);
        if (k0Var.f48082a >= j10 || iB == this.f48056a - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iB + 1;
        return new j0.a(k0Var, new k0(this.f48060e[i10], this.f48058c[i10]));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f48056a + ", sizes=" + Arrays.toString(this.f48057b) + ", offsets=" + Arrays.toString(this.f48058c) + ", timeUs=" + Arrays.toString(this.f48060e) + ", durationsUs=" + Arrays.toString(this.f48059d) + ")";
    }
}
