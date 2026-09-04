package da;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import ob.d0;
import u9.e0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f36542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e0.c f36545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e0.a f36546r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0.c f36547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0.a f36548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f36549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e0.b[] f36550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36551e;

        public a(e0.c cVar, e0.a aVar, byte[] bArr, e0.b[] bVarArr, int i10) {
            this.f36547a = cVar;
            this.f36548b = aVar;
            this.f36549c = bArr;
            this.f36550d = bVarArr;
            this.f36551e = i10;
        }
    }

    j() {
    }

    static void n(d0 d0Var, long j10) {
        if (d0Var.b() < d0Var.g() + 4) {
            d0Var.R(Arrays.copyOf(d0Var.e(), d0Var.g() + 4));
        } else {
            d0Var.T(d0Var.g() + 4);
        }
        byte[] bArrE = d0Var.e();
        bArrE[d0Var.g() - 4] = (byte) (j10 & 255);
        bArrE[d0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[d0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[d0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f36550d[p(b10, aVar.f36551e, 1)].f54271a ? aVar.f36547a.f54281g : aVar.f36547a.f54282h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(d0 d0Var) {
        try {
            return e0.m(1, d0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // da.i
    protected void e(long j10) {
        super.e(j10);
        this.f36544p = j10 != 0;
        e0.c cVar = this.f36545q;
        this.f36543o = cVar != null ? cVar.f54281g : 0;
    }

    @Override // da.i
    protected long f(d0 d0Var) {
        if ((d0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(d0Var.e()[0], (a) ob.a.i(this.f36542n));
        long j10 = this.f36544p ? (this.f36543o + iO) / 4 : 0;
        n(d0Var, j10);
        this.f36544p = true;
        this.f36543o = iO;
        return j10;
    }

    @Override // da.i
    protected boolean h(d0 d0Var, long j10, i.b bVar) throws ParserException {
        if (this.f36542n != null) {
            ob.a.e(bVar.f36540a);
            return false;
        }
        a aVarQ = q(d0Var);
        this.f36542n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        e0.c cVar = aVarQ.f36547a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f54284j);
        arrayList.add(aVarQ.f36549c);
        bVar.f36540a = new v0.b().g0(MimeTypes.AUDIO_VORBIS).I(cVar.f54279e).b0(cVar.f54278d).J(cVar.f54276b).h0(cVar.f54277c).V(arrayList).Z(e0.c(c0.z(aVarQ.f36548b.f54269b))).G();
        return true;
    }

    @Override // da.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f36542n = null;
            this.f36545q = null;
            this.f36546r = null;
        }
        this.f36543o = 0;
        this.f36544p = false;
    }

    a q(d0 d0Var) throws ParserException {
        e0.c cVar = this.f36545q;
        if (cVar == null) {
            this.f36545q = e0.j(d0Var);
            return null;
        }
        e0.a aVar = this.f36546r;
        if (aVar == null) {
            this.f36546r = e0.h(d0Var);
            return null;
        }
        byte[] bArr = new byte[d0Var.g()];
        System.arraycopy(d0Var.e(), 0, bArr, 0, d0Var.g());
        e0.b[] bVarArrK = e0.k(d0Var, cVar.f54276b);
        return new a(cVar, aVar, bArr, bVarArrK, e0.a(bVarArrK.length - 1));
    }
}
