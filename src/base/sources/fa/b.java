package fa;

import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.d0;
import ob.r0;
import ob.u;
import q9.w;
import u9.b0;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f38407h = new p() { // from class: fa.a
        @Override // u9.p
        public final k[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f38408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f38409b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0577b f38412e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38410c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38411d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38413f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38414g = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements InterfaceC0577b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f38415m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f38416n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f38417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f38418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fa.c f38419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f38420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f38421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f38422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f38423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final v0 f38424h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f38425i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f38426j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f38427k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f38428l;

        public a(m mVar, b0 b0Var, fa.c cVar) throws ParserException {
            this.f38417a = mVar;
            this.f38418b = b0Var;
            this.f38419c = cVar;
            int iMax = Math.max(1, cVar.f38439c / 10);
            this.f38423g = iMax;
            d0 d0Var = new d0(cVar.f38443g);
            d0Var.z();
            int iZ = d0Var.z();
            this.f38420d = iZ;
            int i10 = cVar.f38438b;
            int i11 = (((cVar.f38441e - (i10 * 4)) * 8) / (cVar.f38442f * i10)) + 1;
            if (iZ == i11) {
                int iL = r0.l(iMax, iZ);
                this.f38421e = new byte[cVar.f38441e * iL];
                this.f38422f = new d0(iL * h(iZ, i10));
                int i12 = ((cVar.f38439c * cVar.f38441e) * 8) / iZ;
                this.f38424h = new v0.b().g0(MimeTypes.AUDIO_RAW).I(i12).b0(i12).Y(h(iMax, i10)).J(cVar.f38438b).h0(cVar.f38439c).a0(2).G();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }

        private void d(byte[] bArr, int i10, d0 d0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f38419c.f38438b; i12++) {
                    e(bArr, i11, i12, d0Var.e());
                }
            }
            int iG = g(this.f38420d * i10);
            d0Var.U(0);
            d0Var.T(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            fa.c cVar = this.f38419c;
            int i12 = cVar.f38441e;
            int i13 = cVar.f38438b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iQ = (short) (((bArr[i14 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            int iMin = Math.min(bArr[i14 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
            int i17 = f38416n[iMin];
            int i18 = ((i10 * this.f38420d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iQ & 255);
            bArr2[i18 + 1] = (byte) (iQ >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iQ = r0.q(iQ + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iQ & 255);
                bArr2[i18 + 1] = (byte) (iQ >> 8);
                int i22 = iMin + f38415m[i20];
                int[] iArr = f38416n;
                iMin = r0.q(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f38419c.f38438b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f38419c.f38438b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jU0 = this.f38426j + r0.U0(this.f38428l, 1000000L, this.f38419c.f38439c);
            int iG = g(i10);
            this.f38418b.f(jU0, 1, iG, this.f38427k - iG, null);
            this.f38428l += (long) i10;
            this.f38427k -= iG;
        }

        @Override // fa.b.InterfaceC0577b
        public void a(int i10, long j10) {
            this.f38417a.c(new e(this.f38419c, this.f38420d, i10, j10));
            this.f38418b.e(this.f38424h);
        }

        @Override // fa.b.InterfaceC0577b
        public void b(long j10) {
            this.f38425i = 0;
            this.f38426j = j10;
            this.f38427k = 0;
            this.f38428l = 0L;
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
        @Override // fa.b.InterfaceC0577b
        public boolean c(u9.l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f38423g
                int r1 = r6.f38427k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f38420d
                int r0 = ob.r0.l(r0, r1)
                fa.c r1 = r6.f38419c
                int r1 = r1.f38441e
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
                int r3 = r6.f38425i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f38421e
                int r5 = r6.f38425i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f38425i
                int r4 = r4 + r3
                r6.f38425i = r4
                goto L1e
            L3e:
                int r7 = r6.f38425i
                fa.c r8 = r6.f38419c
                int r8 = r8.f38441e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f38421e
                ob.d0 r9 = r6.f38422f
                r6.d(r8, r7, r9)
                int r8 = r6.f38425i
                fa.c r9 = r6.f38419c
                int r9 = r9.f38441e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f38425i = r8
                ob.d0 r7 = r6.f38422f
                int r7 = r7.g()
                u9.b0 r8 = r6.f38418b
                ob.d0 r9 = r6.f38422f
                r8.c(r9, r7)
                int r8 = r6.f38427k
                int r8 = r8 + r7
                r6.f38427k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f38423g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f38427k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fa.b.a.c(u9.l, long):boolean");
        }
    }

    /* JADX INFO: renamed from: fa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface InterfaceC0577b {
        void a(int i10, long j10);

        void b(long j10);

        boolean c(l lVar, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements InterfaceC0577b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f38429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f38430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fa.c f38431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v0 f38432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f38433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f38434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f38436h;

        public c(m mVar, b0 b0Var, fa.c cVar, String str, int i10) throws ParserException {
            this.f38429a = mVar;
            this.f38430b = b0Var;
            this.f38431c = cVar;
            int i11 = (cVar.f38438b * cVar.f38442f) / 8;
            if (cVar.f38441e == i11) {
                int i12 = cVar.f38439c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f38433e = iMax;
                this.f38432d = new v0.b().g0(str).I(i13).b0(i13).Y(iMax).J(cVar.f38438b).h0(cVar.f38439c).a0(i10).G();
                return;
            }
            throw ParserException.a("Expected block size: " + i11 + "; got: " + cVar.f38441e, null);
        }

        @Override // fa.b.InterfaceC0577b
        public void a(int i10, long j10) {
            this.f38429a.c(new e(this.f38431c, 1, i10, j10));
            this.f38430b.e(this.f38432d);
        }

        @Override // fa.b.InterfaceC0577b
        public void b(long j10) {
            this.f38434f = j10;
            this.f38435g = 0;
            this.f38436h = 0L;
        }

        @Override // fa.b.InterfaceC0577b
        public boolean c(l lVar, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f38435g) < (i11 = this.f38433e)) {
                int iA = this.f38430b.a(lVar, (int) Math.min(i11 - i10, j11), true);
                if (iA == -1) {
                    j11 = 0;
                } else {
                    this.f38435g += iA;
                    j11 -= (long) iA;
                }
            }
            fa.c cVar = this.f38431c;
            int i12 = cVar.f38441e;
            int i13 = this.f38435g / i12;
            if (i13 > 0) {
                long jU0 = this.f38434f + r0.U0(this.f38436h, 1000000L, cVar.f38439c);
                int i14 = i13 * i12;
                int i15 = this.f38435g - i14;
                this.f38430b.f(jU0, 1, i14, i15, null);
                this.f38436h += (long) i13;
                this.f38435g = i15;
            }
            return j11 <= 0;
        }
    }

    public static /* synthetic */ k[] a() {
        return new k[]{new b()};
    }

    private void e() {
        ob.a.i(this.f38409b);
        r0.j(this.f38408a);
    }

    private void f(l lVar) throws ParserException {
        ob.a.g(lVar.getPosition() == 0);
        int i10 = this.f38413f;
        if (i10 != -1) {
            lVar.skipFully(i10);
            this.f38410c = 4;
        } else {
            if (!d.a(lVar)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
            this.f38410c = 1;
        }
    }

    private void g(l lVar) throws ParserException {
        fa.c cVarB = d.b(lVar);
        int i10 = cVarB.f38437a;
        if (i10 == 17) {
            this.f38412e = new a(this.f38408a, this.f38409b, cVarB);
        } else if (i10 == 6) {
            this.f38412e = new c(this.f38408a, this.f38409b, cVarB, MimeTypes.AUDIO_ALAW, -1);
        } else if (i10 == 7) {
            this.f38412e = new c(this.f38408a, this.f38409b, cVarB, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int iA = w.a(i10, cVarB.f38442f);
            if (iA == 0) {
                throw ParserException.e("Unsupported WAV format type: " + cVarB.f38437a);
            }
            this.f38412e = new c(this.f38408a, this.f38409b, cVarB, MimeTypes.AUDIO_RAW, iA);
        }
        this.f38410c = 3;
    }

    private void h(l lVar) {
        this.f38411d = d.c(lVar);
        this.f38410c = 2;
    }

    private int i(l lVar) {
        ob.a.g(this.f38414g != -1);
        return ((InterfaceC0577b) ob.a.e(this.f38412e)).c(lVar, this.f38414g - lVar.getPosition()) ? -1 : 0;
    }

    private void j(l lVar) throws ParserException {
        Pair pairE = d.e(lVar);
        this.f38413f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f38411d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f38414g = ((long) this.f38413f) + jLongValue;
        long length = lVar.getLength();
        if (length != -1 && this.f38414g > length) {
            u.i("WavExtractor", "Data exceeds input length: " + this.f38414g + ", " + length);
            this.f38414g = length;
        }
        ((InterfaceC0577b) ob.a.e(this.f38412e)).a(this.f38413f, this.f38414g);
        this.f38410c = 4;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f38408a = mVar;
        this.f38409b = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // u9.k
    public int c(l lVar, y yVar) throws ParserException {
        e();
        int i10 = this.f38410c;
        if (i10 == 0) {
            f(lVar);
            return 0;
        }
        if (i10 == 1) {
            h(lVar);
            return 0;
        }
        if (i10 == 2) {
            g(lVar);
            return 0;
        }
        if (i10 == 3) {
            j(lVar);
            return 0;
        }
        if (i10 == 4) {
            return i(lVar);
        }
        throw new IllegalStateException();
    }

    @Override // u9.k
    public boolean d(l lVar) {
        return d.a(lVar);
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f38410c = j10 == 0 ? 0 : 4;
        InterfaceC0577b interfaceC0577b = this.f38412e;
        if (interfaceC0577b != null) {
            interfaceC0577b.b(j11);
        }
    }

    @Override // u9.k
    public void release() {
    }
}
