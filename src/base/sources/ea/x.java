package ea;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x extends u9.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements u9.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0 f37650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ob.d0 f37651b;

        private u9.a.e c(ob.d0 d0Var, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (d0Var.a() >= 4) {
                if (x.k(d0Var.e(), d0Var.f()) != 442) {
                    d0Var.V(1);
                } else {
                    d0Var.V(4);
                    long jL = y.l(d0Var);
                    if (jL != C.TIME_UNSET) {
                        long jB = this.f37650a.b(jL);
                        if (jB > j10) {
                            return j12 == C.TIME_UNSET ? u9.a.e.d(jB, j11) : u9.a.e.e(j11 + ((long) iF2));
                        }
                        if (100000 + jB > j10) {
                            return u9.a.e.e(j11 + ((long) d0Var.f()));
                        }
                        iF2 = d0Var.f();
                        j12 = jB;
                    }
                    d(d0Var);
                    iF = d0Var.f();
                }
            }
            return j12 != C.TIME_UNSET ? u9.a.e.f(j12, j11 + ((long) iF)) : u9.a.e.f54226d;
        }

        private static void d(ob.d0 d0Var) {
            int iK;
            int iG = d0Var.g();
            if (d0Var.a() < 10) {
                d0Var.U(iG);
                return;
            }
            d0Var.V(9);
            int iH = d0Var.H() & 7;
            if (d0Var.a() < iH) {
                d0Var.U(iG);
                return;
            }
            d0Var.V(iH);
            if (d0Var.a() < 4) {
                d0Var.U(iG);
                return;
            }
            if (x.k(d0Var.e(), d0Var.f()) == 443) {
                d0Var.V(4);
                int iN = d0Var.N();
                if (d0Var.a() < iN) {
                    d0Var.U(iG);
                    return;
                }
                d0Var.V(iN);
            }
            while (d0Var.a() >= 4 && (iK = x.k(d0Var.e(), d0Var.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                d0Var.V(4);
                if (d0Var.a() < 2) {
                    d0Var.U(iG);
                    return;
                }
                d0Var.U(Math.min(d0Var.g(), d0Var.f() + d0Var.N()));
            }
        }

        @Override // u9.a.f
        public void a() {
            this.f37651b.R(r0.f48430f);
        }

        @Override // u9.a.f
        public u9.a.e b(u9.l lVar, long j10) {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(20000L, lVar.getLength() - position);
            this.f37651b.Q(iMin);
            lVar.peekFully(this.f37651b.e(), 0, iMin);
            return c(this.f37651b, j10, position);
        }

        private b(n0 n0Var) {
            this.f37650a = n0Var;
            this.f37651b = new ob.d0();
        }
    }

    public x(n0 n0Var, long j10, long j11) {
        super(new u9.a.b(), new b(n0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
