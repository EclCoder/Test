package da;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import ob.d0;
import ob.r0;
import u9.l;
import u9.q;
import u9.r;
import u9.s;
import u9.t;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f36498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f36499o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t f36500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t.a f36501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f36502c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f36503d = -1;

        public a(t tVar, t.a aVar) {
            this.f36500a = tVar;
            this.f36501b = aVar;
        }

        @Override // da.g
        public long a(l lVar) {
            long j10 = this.f36503d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f36503d = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f36502c = j10;
        }

        @Override // da.g
        public z createSeekMap() {
            ob.a.g(this.f36502c != -1);
            return new s(this.f36500a, this.f36502c);
        }

        @Override // da.g
        public void startSeek(long j10) {
            long[] jArr = this.f36501b.f54322a;
            this.f36503d = jArr[r0.i(jArr, j10, true, true)];
        }
    }

    b() {
    }

    private int n(d0 d0Var) {
        int i10 = (d0Var.e()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            d0Var.V(4);
            d0Var.O();
        }
        int iJ = q.j(d0Var, i10);
        d0Var.U(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(d0 d0Var) {
        return d0Var.a() >= 5 && d0Var.H() == 127 && d0Var.J() == 1179402563;
    }

    @Override // da.i
    protected long f(d0 d0Var) {
        if (o(d0Var.e())) {
            return n(d0Var);
        }
        return -1L;
    }

    @Override // da.i
    protected boolean h(d0 d0Var, long j10, i.b bVar) {
        byte[] bArrE = d0Var.e();
        t tVar = this.f36498n;
        if (tVar == null) {
            t tVar2 = new t(bArrE, 17);
            this.f36498n = tVar2;
            bVar.f36540a = tVar2.g(Arrays.copyOfRange(bArrE, 9, d0Var.g()), null);
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            t.a aVarF = r.f(d0Var);
            t tVarB = tVar.b(aVarF);
            this.f36498n = tVarB;
            this.f36499o = new a(tVarB, aVarF);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f36499o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f36541b = this.f36499o;
        }
        ob.a.e(bVar.f36540a);
        return false;
    }

    @Override // da.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f36498n = null;
            this.f36499o = null;
        }
    }
}
