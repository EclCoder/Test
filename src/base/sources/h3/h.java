package h3;

import o2.f0;
import o2.j0;
import o2.k0;
import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f40204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f40205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f40207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40208e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f40204a = jArr;
        this.f40205b = jArr2;
        this.f40206c = j10;
        this.f40207d = j11;
        this.f40208e = i10;
    }

    public static h b(long j10, long j11, f0.a aVar, u uVar) {
        int iG;
        u uVar2 = uVar;
        uVar2.U(10);
        int iP = uVar2.p();
        h hVar = null;
        if (iP <= 0) {
            return null;
        }
        int i10 = aVar.f48052d;
        long jN0 = c0.N0(iP, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10);
        int iM = uVar2.M();
        int iM2 = uVar2.M();
        int iM3 = uVar2.M();
        uVar2.U(2);
        long j12 = j11 + ((long) aVar.f48051c);
        long[] jArr = new long[iM];
        long[] jArr2 = new long[iM];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iM) {
            h hVar2 = hVar;
            int i12 = iM2;
            long j14 = j12;
            jArr[i11] = (((long) i11) * jN0) / ((long) iM);
            jArr2[i11] = Math.max(j13, j14);
            if (iM3 == 1) {
                iG = uVar2.G();
            } else if (iM3 == 2) {
                iG = uVar2.M();
            } else if (iM3 == 3) {
                iG = uVar2.J();
            } else {
                if (iM3 != 4) {
                    return hVar2;
                }
                iG = uVar2.K();
            }
            j13 += ((long) iG) * ((long) i12);
            i11++;
            uVar2 = uVar;
            j12 = j14;
            iM2 = i12;
            hVar = hVar2;
            iM = iM;
        }
        if (j10 != -1 && j10 != j13) {
            n.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr, jArr2, jN0, j13, aVar.f48054f);
    }

    @Override // h3.g
    public long a() {
        return this.f40207d;
    }

    @Override // h3.g
    public int g() {
        return this.f40208e;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f40206c;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        int iG = c0.g(this.f40204a, j10, true, true);
        k0 k0Var = new k0(this.f40204a[iG], this.f40205b[iG]);
        if (k0Var.f48082a >= j10 || iG == this.f40204a.length - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iG + 1;
        return new j0.a(k0Var, new k0(this.f40204a[i10], this.f40205b[i10]));
    }

    @Override // h3.g
    public long getTimeUs(long j10) {
        return this.f40204a[c0.g(this.f40205b, j10, true, true)];
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }
}
