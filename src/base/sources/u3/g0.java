package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends o2.e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements o2.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1.z f53806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w1.u f53807b = new w1.u();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f53809d;

        public a(int i10, w1.z zVar, int i11) {
            this.f53808c = i10;
            this.f53806a = zVar;
            this.f53809d = i11;
        }

        private o2.e.C0740e c(w1.u uVar, long j10, long j11) {
            int iA;
            int iA2;
            int iG = uVar.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (uVar.a() >= 188 && (iA2 = (iA = l0.a(uVar.e(), uVar.f(), iG)) + 188) <= iG) {
                long jC = l0.c(uVar, iA, this.f53808c);
                if (jC != C.TIME_UNSET) {
                    long jB = this.f53806a.b(jC);
                    if (jB > j10) {
                        return j14 == C.TIME_UNSET ? o2.e.C0740e.d(jB, j11) : o2.e.C0740e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return o2.e.C0740e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                uVar.T(iA2);
                j12 = iA2;
            }
            return j14 != C.TIME_UNSET ? o2.e.C0740e.f(j14, j11 + j12) : o2.e.C0740e.f48034d;
        }

        @Override // o2.e.f
        public void a() {
            this.f53807b.Q(w1.c0.f55774f);
        }

        @Override // o2.e.f
        public o2.e.C0740e b(o2.q qVar, long j10) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(this.f53809d, qVar.getLength() - position);
            this.f53807b.P(iMin);
            qVar.peekFully(this.f53807b.e(), 0, iMin);
            return c(this.f53807b, j10, position);
        }
    }

    public g0(w1.z zVar, long j10, long j11, int i10, int i11) {
        super(new o2.e.b(), new a(i10, zVar, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
