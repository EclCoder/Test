package j3;

import androidx.media3.common.ParserException;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import o2.r0;
import t1.o;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f41985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r0.c f41988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r0.a f41989r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.c f41990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0.a f41991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f41992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r0.b[] f41993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41994e;

        public a(r0.c cVar, r0.a aVar, byte[] bArr, r0.b[] bVarArr, int i10) {
            this.f41990a = cVar;
            this.f41991b = aVar;
            this.f41992c = bArr;
            this.f41993d = bVarArr;
            this.f41994e = i10;
        }
    }

    j() {
    }

    static void n(u uVar, long j10) {
        if (uVar.b() < uVar.g() + 4) {
            uVar.Q(Arrays.copyOf(uVar.e(), uVar.g() + 4));
        } else {
            uVar.S(uVar.g() + 4);
        }
        byte[] bArrE = uVar.e();
        bArrE[uVar.g() - 4] = (byte) (j10 & 255);
        bArrE[uVar.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[uVar.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[uVar.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f41993d[p(b10, aVar.f41994e, 1)].f48152a ? aVar.f41990a.f48162g : aVar.f41990a.f48163h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(u uVar) {
        try {
            return r0.o(1, uVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // j3.i
    protected void e(long j10) {
        super.e(j10);
        this.f41987p = j10 != 0;
        r0.c cVar = this.f41988q;
        this.f41986o = cVar != null ? cVar.f48162g : 0;
    }

    @Override // j3.i
    protected long f(u uVar) {
        if ((uVar.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(uVar.e()[0], (a) w1.a.i(this.f41985n));
        long j10 = this.f41987p ? (this.f41986o + iO) / 4 : 0;
        n(uVar, j10);
        this.f41987p = true;
        this.f41986o = iO;
        return j10;
    }

    @Override // j3.i
    protected boolean i(u uVar, long j10, i.b bVar) throws ParserException {
        if (this.f41985n != null) {
            w1.a.e(bVar.f41983a);
            return false;
        }
        a aVarQ = q(uVar);
        this.f41985n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        r0.c cVar = aVarQ.f41990a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f48165j);
        arrayList.add(aVarQ.f41992c);
        bVar.f41983a = new o.b().o0(MimeTypes.AUDIO_VORBIS).M(cVar.f48160e).j0(cVar.f48159d).N(cVar.f48157b).p0(cVar.f48158c).b0(arrayList).h0(r0.d(c0.z(aVarQ.f41991b.f48150b))).K();
        return true;
    }

    @Override // j3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f41985n = null;
            this.f41988q = null;
            this.f41989r = null;
        }
        this.f41986o = 0;
        this.f41987p = false;
    }

    a q(u uVar) throws ParserException {
        r0.c cVar = this.f41988q;
        if (cVar == null) {
            this.f41988q = r0.l(uVar);
            return null;
        }
        r0.a aVar = this.f41989r;
        if (aVar == null) {
            this.f41989r = r0.j(uVar);
            return null;
        }
        byte[] bArr = new byte[uVar.g()];
        System.arraycopy(uVar.e(), 0, bArr, 0, uVar.g());
        r0.b[] bVarArrM = r0.m(uVar, cVar.f48157b);
        return new a(cVar, aVar, bArr, bVarArrM, r0.b(bVarArrM.length - 1));
    }
}
