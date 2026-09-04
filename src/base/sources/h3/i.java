package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.f0;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f40209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f40214f;

    private i(f0.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f40209a = new f0.a(aVar);
        this.f40210b = j10;
        this.f40211c = j11;
        this.f40214f = jArr;
        this.f40212d = i10;
        this.f40213e = i11;
    }

    public static i b(f0.a aVar, u uVar) {
        long[] jArr;
        int i10;
        int i11;
        int iP = uVar.p();
        int iK = (iP & 1) != 0 ? uVar.K() : -1;
        long jI = (iP & 2) != 0 ? uVar.I() : -1L;
        if ((iP & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = uVar.G();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iP & 8) != 0) {
            uVar.U(4);
        }
        if (uVar.a() >= 24) {
            uVar.U(21);
            int iJ = uVar.J();
            i11 = iJ & 4095;
            i10 = (16773120 & iJ) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iK, jI, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f40210b;
        if (j10 == -1 || j10 == 0) {
            return C.TIME_UNSET;
        }
        f0.a aVar = this.f40209a;
        return c0.M0((j10 * ((long) aVar.f48055g)) - 1, aVar.f48052d);
    }
}
