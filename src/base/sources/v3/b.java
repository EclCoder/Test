package v3;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import o2.i0;
import o2.o0;
import o2.p;
import o2.q;
import o2.r;
import o2.s0;
import o2.u;
import t1.o;
import w1.c0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f55114h = new u() { // from class: v3.a
        @Override // o2.u
        public final p[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f55115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f55116b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0828b f55119e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55117c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55118d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55120f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f55121g = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements InterfaceC0828b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f55122m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f55123n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f55124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f55125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v3.c f55126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f55127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f55128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w1.u f55129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f55130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final o f55131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f55132i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f55133j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f55134k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f55135l;

        public a(r rVar, o0 o0Var, v3.c cVar) throws ParserException {
            this.f55124a = rVar;
            this.f55125b = o0Var;
            this.f55126c = cVar;
            int iMax = Math.max(1, cVar.f55146c / 10);
            this.f55130g = iMax;
            w1.u uVar = new w1.u(cVar.f55150g);
            uVar.y();
            int iY = uVar.y();
            this.f55127d = iY;
            int i10 = cVar.f55145b;
            int i11 = (((cVar.f55148e - (i10 * 4)) * 8) / (cVar.f55149f * i10)) + 1;
            if (iY == i11) {
                int iJ = c0.j(iMax, iY);
                this.f55128e = new byte[cVar.f55148e * iJ];
                this.f55129f = new w1.u(iJ * h(iY, i10));
                int i12 = ((cVar.f55146c * cVar.f55148e) * 8) / iY;
                this.f55131h = new o.b().o0(MimeTypes.AUDIO_RAW).M(i12).j0(i12).f0(h(iMax, i10)).N(cVar.f55145b).p0(cVar.f55146c).i0(2).K();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i11 + "; got: " + iY, null);
        }

        private void d(byte[] bArr, int i10, w1.u uVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f55126c.f55145b; i12++) {
                    e(bArr, i11, i12, uVar.e());
                }
            }
            int iG = g(this.f55127d * i10);
            uVar.T(0);
            uVar.S(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            v3.c cVar = this.f55126c;
            int i12 = cVar.f55148e;
            int i13 = cVar.f55145b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iO = (short) (((bArr[i14 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            int iMin = Math.min(bArr[i14 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
            int i17 = f55123n[iMin];
            int i18 = ((i10 * this.f55127d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iO & 255);
            bArr2[i18 + 1] = (byte) (iO >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iO = c0.o(iO + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iO & 255);
                bArr2[i18 + 1] = (byte) (iO >> 8);
                int i22 = iMin + f55122m[i20];
                int[] iArr = f55123n;
                iMin = c0.o(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f55126c.f55145b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f55126c.f55145b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jN0 = this.f55133j + c0.N0(this.f55135l, 1000000L, this.f55126c.f55146c);
            int iG = g(i10);
            this.f55125b.e(jN0, 1, iG, this.f55134k - iG, null);
            this.f55135l += (long) i10;
            this.f55134k -= iG;
        }

        @Override // v3.b.InterfaceC0828b
        public void a(int i10, long j10) {
            this.f55124a.d(new e(this.f55126c, this.f55127d, i10, j10));
            this.f55125b.b(this.f55131h);
        }

        @Override // v3.b.InterfaceC0828b
        public void b(long j10) {
            this.f55132i = 0;
            this.f55133j = j10;
            this.f55134k = 0;
            this.f55135l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v3.b.InterfaceC0828b
        public boolean c(o2.q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f55130g
                int r1 = r6.f55134k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f55127d
                int r0 = w1.c0.j(r0, r1)
                v3.c r1 = r6.f55126c
                int r1 = r1.f55148e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f55132i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f55128e
                int r5 = r6.f55132i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f55132i
                int r4 = r4 + r3
                r6.f55132i = r4
                goto L1e
            L3e:
                int r7 = r6.f55132i
                v3.c r8 = r6.f55126c
                int r8 = r8.f55148e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f55128e
                w1.u r9 = r6.f55129f
                r6.d(r8, r7, r9)
                int r8 = r6.f55132i
                v3.c r9 = r6.f55126c
                int r9 = r9.f55148e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f55132i = r8
                w1.u r7 = r6.f55129f
                int r7 = r7.g()
                o2.o0 r8 = r6.f55125b
                w1.u r9 = r6.f55129f
                r8.c(r9, r7)
                int r8 = r6.f55134k
                int r8 = r8 + r7
                r6.f55134k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f55130g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f55134k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.b.a.c(o2.q, long):boolean");
        }
    }

    /* JADX INFO: renamed from: v3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface InterfaceC0828b {
        void a(int i10, long j10);

        void b(long j10);

        boolean c(q qVar, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements InterfaceC0828b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f55136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f55137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v3.c f55138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o f55139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f55140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f55141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55142g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f55143h;

        public c(r rVar, o0 o0Var, v3.c cVar, String str, int i10) throws ParserException {
            this.f55136a = rVar;
            this.f55137b = o0Var;
            this.f55138c = cVar;
            int i11 = (cVar.f55145b * cVar.f55149f) / 8;
            if (cVar.f55148e == i11) {
                int i12 = cVar.f55146c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f55140e = iMax;
                this.f55139d = new o.b().o0(str).M(i13).j0(i13).f0(iMax).N(cVar.f55145b).p0(cVar.f55146c).i0(i10).K();
                return;
            }
            throw ParserException.a("Expected block size: " + i11 + "; got: " + cVar.f55148e, null);
        }

        @Override // v3.b.InterfaceC0828b
        public void a(int i10, long j10) {
            this.f55136a.d(new e(this.f55138c, 1, i10, j10));
            this.f55137b.b(this.f55139d);
        }

        @Override // v3.b.InterfaceC0828b
        public void b(long j10) {
            this.f55141f = j10;
            this.f55142g = 0;
            this.f55143h = 0L;
        }

        @Override // v3.b.InterfaceC0828b
        public boolean c(q qVar, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f55142g) < (i11 = this.f55140e)) {
                int iA = this.f55137b.a(qVar, (int) Math.min(i11 - i10, j11), true);
                if (iA == -1) {
                    j11 = 0;
                } else {
                    this.f55142g += iA;
                    j11 -= (long) iA;
                }
            }
            v3.c cVar = this.f55138c;
            int i12 = cVar.f55148e;
            int i13 = this.f55142g / i12;
            if (i13 > 0) {
                long jN0 = this.f55141f + c0.N0(this.f55143h, 1000000L, cVar.f55146c);
                int i14 = i13 * i12;
                int i15 = this.f55142g - i14;
                this.f55137b.e(jN0, 1, i14, i15, null);
                this.f55143h += (long) i13;
                this.f55142g = i15;
            }
            return j11 <= 0;
        }
    }

    public static /* synthetic */ p[] a() {
        return new p[]{new b()};
    }

    private void g() {
        w1.a.i(this.f55116b);
        c0.h(this.f55115a);
    }

    private void h(q qVar) throws ParserException {
        w1.a.g(qVar.getPosition() == 0);
        int i10 = this.f55120f;
        if (i10 != -1) {
            qVar.skipFully(i10);
            this.f55117c = 4;
        } else {
            if (!d.a(qVar)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            qVar.skipFully((int) (qVar.getPeekPosition() - qVar.getPosition()));
            this.f55117c = 1;
        }
    }

    private void i(q qVar) throws ParserException {
        v3.c cVarB = d.b(qVar);
        int i10 = cVarB.f55144a;
        if (i10 == 17) {
            this.f55119e = new a(this.f55115a, this.f55116b, cVarB);
        } else if (i10 == 6) {
            this.f55119e = new c(this.f55115a, this.f55116b, cVarB, MimeTypes.AUDIO_ALAW, -1);
        } else if (i10 == 7) {
            this.f55119e = new c(this.f55115a, this.f55116b, cVarB, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int iA = s0.a(i10, cVarB.f55149f);
            if (iA == 0) {
                throw ParserException.c("Unsupported WAV format type: " + cVarB.f55144a);
            }
            this.f55119e = new c(this.f55115a, this.f55116b, cVarB, MimeTypes.AUDIO_RAW, iA);
        }
        this.f55117c = 3;
    }

    private void j(q qVar) {
        this.f55118d = d.c(qVar);
        this.f55117c = 2;
    }

    private int k(q qVar) {
        w1.a.g(this.f55121g != -1);
        return ((InterfaceC0828b) w1.a.e(this.f55119e)).c(qVar, this.f55121g - qVar.getPosition()) ? -1 : 0;
    }

    private void l(q qVar) throws ParserException {
        Pair pairE = d.e(qVar);
        this.f55120f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f55118d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f55121g = ((long) this.f55120f) + jLongValue;
        long length = qVar.getLength();
        if (length != -1 && this.f55121g > length) {
            n.h("WavExtractor", "Data exceeds input length: " + this.f55121g + ", " + length);
            this.f55121g = length;
        }
        ((InterfaceC0828b) w1.a.e(this.f55119e)).a(this.f55120f, this.f55121g);
        this.f55117c = 4;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws ParserException {
        g();
        int i10 = this.f55117c;
        if (i10 == 0) {
            h(qVar);
            return 0;
        }
        if (i10 == 1) {
            j(qVar);
            return 0;
        }
        if (i10 == 2) {
            i(qVar);
            return 0;
        }
        if (i10 == 3) {
            l(qVar);
            return 0;
        }
        if (i10 == 4) {
            return k(qVar);
        }
        throw new IllegalStateException();
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f55115a = rVar;
        this.f55116b = rVar.track(0, 1);
        rVar.endTracks();
    }

    @Override // o2.p
    public boolean d(q qVar) {
        return d.a(qVar);
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f55117c = j10 == 0 ? 0 : 4;
        InterfaceC0828b interfaceC0828b = this.f55119e;
        if (interfaceC0828b != null) {
            interfaceC0828b.b(j11);
        }
    }

    @Override // o2.p
    public void release() {
    }
}
