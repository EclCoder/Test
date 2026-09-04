package u3;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class z extends o2.e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements o2.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1.z f54137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w1.u f54138b;

        private o2.e.C0740e c(w1.u uVar, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (uVar.a() >= 4) {
                if (z.k(uVar.e(), uVar.f()) != 442) {
                    uVar.U(1);
                } else {
                    uVar.U(4);
                    long jL = a0.l(uVar);
                    if (jL != C.TIME_UNSET) {
                        long jB = this.f54137a.b(jL);
                        if (jB > j10) {
                            return j12 == C.TIME_UNSET ? o2.e.C0740e.d(jB, j11) : o2.e.C0740e.e(j11 + ((long) iF2));
                        }
                        if (100000 + jB > j10) {
                            return o2.e.C0740e.e(j11 + ((long) uVar.f()));
                        }
                        iF2 = uVar.f();
                        j12 = jB;
                    }
                    d(uVar);
                    iF = uVar.f();
                }
            }
            return j12 != C.TIME_UNSET ? o2.e.C0740e.f(j12, j11 + ((long) iF)) : o2.e.C0740e.f48034d;
        }

        private static void d(w1.u uVar) {
            int iK;
            int iG = uVar.g();
            if (uVar.a() < 10) {
                uVar.T(iG);
                return;
            }
            uVar.U(9);
            int iG2 = uVar.G() & 7;
            if (uVar.a() < iG2) {
                uVar.T(iG);
                return;
            }
            uVar.U(iG2);
            if (uVar.a() < 4) {
                uVar.T(iG);
                return;
            }
            if (z.k(uVar.e(), uVar.f()) == 443) {
                uVar.U(4);
                int iM = uVar.M();
                if (uVar.a() < iM) {
                    uVar.T(iG);
                    return;
                }
                uVar.U(iM);
            }
            while (uVar.a() >= 4 && (iK = z.k(uVar.e(), uVar.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                uVar.U(4);
                if (uVar.a() < 2) {
                    uVar.T(iG);
                    return;
                }
                uVar.T(Math.min(uVar.g(), uVar.f() + uVar.M()));
            }
        }

        @Override // o2.e.f
        public void a() {
            this.f54138b.Q(w1.c0.f55774f);
        }

        @Override // o2.e.f
        public o2.e.C0740e b(o2.q qVar, long j10) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(20000L, qVar.getLength() - position);
            this.f54138b.P(iMin);
            qVar.peekFully(this.f54138b.e(), 0, iMin);
            return c(this.f54138b, j10, position);
        }

        private b(w1.z zVar) {
            this.f54137a = zVar;
            this.f54138b = new w1.u();
        }
    }

    public z(w1.z zVar, long j10, long j11) {
        super(new o2.e.b(), new b(zVar), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
