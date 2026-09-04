package j3;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import o2.j0;
import o2.q;
import o2.v;
import o2.w;
import o2.x;
import o2.y;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f41941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f41942o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f41943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.a f41944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f41945c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f41946d = -1;

        public a(y yVar, y.a aVar) {
            this.f41943a = yVar;
            this.f41944b = aVar;
        }

        @Override // j3.g
        public long a(q qVar) {
            long j10 = this.f41946d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f41946d = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f41945c = j10;
        }

        @Override // j3.g
        public j0 createSeekMap() {
            w1.a.g(this.f41945c != -1);
            return new x(this.f41943a, this.f41945c);
        }

        @Override // j3.g
        public void startSeek(long j10) {
            long[] jArr = this.f41944b.f48183a;
            this.f41946d = jArr[c0.g(jArr, j10, true, true)];
        }
    }

    b() {
    }

    private int n(u uVar) {
        int i10 = (uVar.e()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            uVar.U(4);
            uVar.N();
        }
        int iJ = v.j(uVar, i10);
        uVar.T(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(u uVar) {
        return uVar.a() >= 5 && uVar.G() == 127 && uVar.I() == 1179402563;
    }

    @Override // j3.i
    protected long f(u uVar) {
        if (o(uVar.e())) {
            return n(uVar);
        }
        return -1L;
    }

    @Override // j3.i
    protected boolean i(u uVar, long j10, i.b bVar) {
        byte[] bArrE = uVar.e();
        y yVar = this.f41941n;
        if (yVar == null) {
            y yVar2 = new y(bArrE, 17);
            this.f41941n = yVar2;
            bVar.f41983a = yVar2.g(Arrays.copyOfRange(bArrE, 9, uVar.g()), null);
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            y.a aVarG = w.g(uVar);
            y yVarB = yVar.b(aVarG);
            this.f41941n = yVarB;
            this.f41942o = new a(yVarB, aVarG);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f41942o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f41984b = this.f41942o;
        }
        w1.a.e(bVar.f41983a);
        return false;
    }

    @Override // j3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f41941n = null;
            this.f41942o = null;
        }
    }
}
