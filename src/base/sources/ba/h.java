package ba;

import ob.d0;
import ob.r0;
import ob.u;
import q9.t;
import u9.a0;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f8723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8725d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f8722a = jArr;
        this.f8723b = jArr2;
        this.f8724c = j10;
        this.f8725d = j11;
    }

    public static h b(long j10, long j11, t.a aVar, d0 d0Var) {
        int iH;
        d0Var.V(10);
        int iQ = d0Var.q();
        h hVar = null;
        if (iQ <= 0) {
            return null;
        }
        int i10 = aVar.f50504d;
        long jU0 = r0.U0(iQ, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        int iN3 = d0Var.N();
        int i11 = 2;
        d0Var.V(2);
        long j12 = j11 + ((long) aVar.f50503c);
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        int i12 = 0;
        long j13 = j11;
        while (i12 < iN) {
            h hVar2 = hVar;
            int i13 = iN2;
            long[] jArr3 = jArr;
            jArr3[i12] = (((long) i12) * jU0) / ((long) iN);
            jArr2[i12] = Math.max(j13, j12);
            if (iN3 == 1) {
                iH = d0Var.H();
            } else if (iN3 == i11) {
                iH = d0Var.N();
            } else if (iN3 == 3) {
                iH = d0Var.K();
            } else {
                if (iN3 != 4) {
                    return hVar2;
                }
                iH = d0Var.L();
            }
            j13 += ((long) iH) * ((long) i13);
            i12++;
            hVar = hVar2;
            iN2 = i13;
            jArr = jArr3;
            j12 = j12;
            i11 = 2;
        }
        long[] jArr4 = jArr;
        if (j10 != -1 && j10 != j13) {
            u.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr4, jArr2, jU0, j13);
    }

    @Override // ba.g
    public long a() {
        return this.f8725d;
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f8724c;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        int i10 = r0.i(this.f8722a, j10, true, true);
        a0 a0Var = new a0(this.f8722a[i10], this.f8723b[i10]);
        if (a0Var.f54231a >= j10 || i10 == this.f8722a.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new a0(this.f8722a[i11], this.f8723b[i11]));
    }

    @Override // ba.g
    public long getTimeUs(long j10) {
        return this.f8722a[r0.i(this.f8723b, j10, true, true)];
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }
}
