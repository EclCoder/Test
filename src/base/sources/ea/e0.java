package ea;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e0 extends u9.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements u9.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0 f37346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ob.d0 f37347b = new ob.d0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f37349d;

        public a(int i10, n0 n0Var, int i11) {
            this.f37348c = i10;
            this.f37346a = n0Var;
            this.f37349d = i11;
        }

        private u9.a.e c(ob.d0 d0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iG = d0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (d0Var.a() >= 188 && (iA2 = (iA = j0.a(d0Var.e(), d0Var.f(), iG)) + 188) <= iG) {
                long jC = j0.c(d0Var, iA, this.f37348c);
                if (jC != C.TIME_UNSET) {
                    long jB = this.f37346a.b(jC);
                    if (jB > j10) {
                        return j14 == C.TIME_UNSET ? u9.a.e.d(jB, j11) : u9.a.e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return u9.a.e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                d0Var.U(iA2);
                j12 = iA2;
            }
            return j14 != C.TIME_UNSET ? u9.a.e.f(j14, j11 + j12) : u9.a.e.f54226d;
        }

        @Override // u9.a.f
        public void a() {
            this.f37347b.R(r0.f48430f);
        }

        @Override // u9.a.f
        public u9.a.e b(u9.l lVar, long j10) {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(this.f37349d, lVar.getLength() - position);
            this.f37347b.Q(iMin);
            lVar.peekFully(this.f37347b.e(), 0, iMin);
            return c(this.f37347b, j10, position);
        }
    }

    public e0(n0 n0Var, long j10, long j11, int i10, int i11) {
        super(new u9.a.b(), new a(i10, n0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
