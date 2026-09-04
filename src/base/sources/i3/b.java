package i3;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o2.b0;
import o2.h0;
import o2.r0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f40826a = c0.n0("OpusHead");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f40830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f40831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w1.u f40832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w1.u f40833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f40834h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f40835i;

        public a(w1.u uVar, w1.u uVar2, boolean z10) throws ParserException {
            this.f40833g = uVar;
            this.f40832f = uVar2;
            this.f40831e = z10;
            uVar2.T(12);
            this.f40827a = uVar2.K();
            uVar.T(12);
            this.f40835i = uVar.K();
            o2.s.a(uVar.p() == 1, "first_chunk must be 1");
            this.f40828b = -1;
        }

        public boolean a() {
            int i10 = this.f40828b + 1;
            this.f40828b = i10;
            if (i10 == this.f40827a) {
                return false;
            }
            this.f40830d = this.f40831e ? this.f40832f.L() : this.f40832f.I();
            if (this.f40828b == this.f40834h) {
                this.f40829c = this.f40833g.K();
                this.f40833g.U(4);
                int i11 = this.f40835i - 1;
                this.f40835i = i11;
                this.f40834h = i11 > 0 ? this.f40833g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: i3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0622b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f40837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f40838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f40839d;

        public C0622b(String str, byte[] bArr, long j10, long j11) {
            this.f40836a = str;
            this.f40837b = bArr;
            this.f40838c = j10;
            this.f40839d = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        int a();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t[] f40840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t1.o f40841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40843d = 0;

        public d(int i10) {
            this.f40840a = new t[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w1.u f40846c;

        public e(i3.a.b bVar, t1.o oVar) {
            w1.u uVar = bVar.f40825b;
            this.f40846c = uVar;
            uVar.T(12);
            int iK = uVar.K();
            if (MimeTypes.AUDIO_RAW.equals(oVar.f52757n)) {
                int iD0 = c0.d0(oVar.D, oVar.B);
                if (iK == 0 || iK % iD0 != 0) {
                    w1.n.h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iD0 + ", stsz sample size: " + iK);
                    iK = iD0;
                }
            }
            this.f40844a = iK == 0 ? -1 : iK;
            this.f40845b = uVar.K();
        }

        @Override // i3.b.c
        public int a() {
            return this.f40844a;
        }

        @Override // i3.b.c
        public int getSampleCount() {
            return this.f40845b;
        }

        @Override // i3.b.c
        public int readNextSampleSize() {
            int i10 = this.f40844a;
            return i10 == -1 ? this.f40846c.K() : i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1.u f40847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f40851e;

        public f(i3.a.b bVar) {
            w1.u uVar = bVar.f40825b;
            this.f40847a = uVar;
            uVar.T(12);
            this.f40849c = uVar.K() & 255;
            this.f40848b = uVar.K();
        }

        @Override // i3.b.c
        public int a() {
            return -1;
        }

        @Override // i3.b.c
        public int getSampleCount() {
            return this.f40848b;
        }

        @Override // i3.b.c
        public int readNextSampleSize() {
            int i10 = this.f40849c;
            if (i10 == 8) {
                return this.f40847a.G();
            }
            if (i10 == 16) {
                return this.f40847a.M();
            }
            int i11 = this.f40850d;
            this.f40850d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f40851e & 15;
            }
            int iG = this.f40847a.G();
            this.f40851e = iG;
            return (iG & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f40853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40854c;

        public g(int i10, long j10, int i11) {
            this.f40852a = i10;
            this.f40853b = j10;
            this.f40854c = i11;
        }
    }

    private static s A(i3.a.C0621a c0621a, i3.a.b bVar, long j10, t1.k kVar, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        i3.a.C0621a c0621aF;
        Pair pairJ;
        i3.a.C0621a c0621a2 = (i3.a.C0621a) w1.a.e(c0621a.f(1835297121));
        int iE = e(m(((i3.a.b) w1.a.e(c0621a2.g(1751411826))).f40825b));
        if (iE == -1) {
            return null;
        }
        g gVarZ = z(((i3.a.b) w1.a.e(c0621a.g(1953196132))).f40825b);
        long jN0 = C.TIME_UNSET;
        long j11 = j10 == C.TIME_UNSET ? gVarZ.f40853b : j10;
        long j12 = r(bVar.f40825b).f56573c;
        if (j11 != C.TIME_UNSET) {
            jN0 = c0.N0(j11, 1000000L, j12);
        }
        long j13 = jN0;
        i3.a.C0621a c0621a3 = (i3.a.C0621a) w1.a.e(((i3.a.C0621a) w1.a.e(c0621a2.f(1835626086))).f(1937007212));
        Pair pairO = o(((i3.a.b) w1.a.e(c0621a2.g(1835296868))).f40825b);
        i3.a.b bVarG = c0621a3.g(1937011556);
        if (bVarG == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d dVarX = x(bVarG.f40825b, gVarZ.f40852a, gVarZ.f40854c, (String) pairO.second, kVar, z11);
        if (z10 || (c0621aF = c0621a.f(1701082227)) == null || (pairJ = j(c0621aF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairJ.first;
            jArr2 = (long[]) pairJ.second;
            jArr = jArr3;
        }
        if (dVarX.f40841b == null) {
            return null;
        }
        return new s(gVarZ.f40852a, iE, ((Long) pairO.first).longValue(), j12, j13, dVarX.f40841b, dVarX.f40843d, dVarX.f40840a, dVarX.f40842c, jArr, jArr2);
    }

    public static List B(i3.a.C0621a c0621a, b0 b0Var, long j10, t1.k kVar, boolean z10, boolean z11, sc.g gVar) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0621a.f40824d.size(); i10++) {
            i3.a.C0621a c0621a2 = (i3.a.C0621a) c0621a.f40824d.get(i10);
            if (c0621a2.f40821a == 1953653099 && (sVar = (s) gVar.apply(A(c0621a2, (i3.a.b) w1.a.e(c0621a.g(1836476516)), j10, kVar, z10, z11))) != null) {
                arrayList.add(w(sVar, (i3.a.C0621a) w1.a.e(((i3.a.C0621a) w1.a.e(((i3.a.C0621a) w1.a.e(c0621a2.f(1835297121))).f(1835626086))).f(1937007212)), b0Var));
            }
        }
        return arrayList;
    }

    public static t1.u C(i3.a.b bVar) {
        w1.u uVar = bVar.f40825b;
        uVar.T(8);
        t1.u uVar2 = new t1.u(new t1.u.b[0]);
        while (uVar.a() >= 8) {
            int iF = uVar.f();
            int iP = uVar.p();
            int iP2 = uVar.p();
            if (iP2 == 1835365473) {
                uVar.T(iF);
                uVar2 = uVar2.b(D(uVar, iF + iP));
            } else if (iP2 == 1936553057) {
                uVar.T(iF);
                uVar2 = uVar2.b(q.b(uVar, iF + iP));
            } else if (iP2 == -1451722374) {
                uVar2 = uVar2.b(F(uVar));
            }
            uVar.T(iF + iP);
        }
        return uVar2;
    }

    private static t1.u D(w1.u uVar, int i10) {
        uVar.U(8);
        f(uVar);
        while (uVar.f() < i10) {
            int iF = uVar.f();
            int iP = uVar.p();
            if (uVar.p() == 1768715124) {
                uVar.T(iF);
                return n(uVar, iF + iP);
            }
            uVar.T(iF + iP);
        }
        return null;
    }

    private static void E(w1.u uVar, int i10, int i11, int i12, int i13, int i14, t1.k kVar, d dVar, int i15) throws ParserException {
        String str;
        int i16;
        int i17;
        int i18;
        int i19 = i11;
        int i20 = i12;
        t1.k kVarB = kVar;
        d dVar2 = dVar;
        uVar.T(i19 + 16);
        uVar.U(16);
        int iM = uVar.M();
        int iM2 = uVar.M();
        uVar.U(50);
        int iF = uVar.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairU = u(uVar, i19, i20);
            if (pairU != null) {
                iIntValue = ((Integer) pairU.first).intValue();
                kVarB = kVarB == null ? null : kVarB.b(((t) pairU.second).f40970b);
                dVar2.f40840a[i15] = (t) pairU.second;
            }
            uVar.T(iF);
        }
        String str2 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float fS = 1.0f;
        int i21 = 8;
        int i22 = 8;
        List listD = null;
        String str3 = null;
        byte[] bArrT = null;
        int i23 = -1;
        int i24 = -1;
        int iJ = -1;
        int i25 = -1;
        int iK = -1;
        ByteBuffer byteBufferA = null;
        C0622b c0622bK = null;
        boolean z10 = false;
        while (iF - i19 < i20) {
            uVar.T(iF);
            int iF2 = uVar.f();
            int iP = uVar.p();
            if (iP == 0 && uVar.f() - i19 == i20) {
                break;
            }
            o2.s.a(iP > 0, "childAtomSize must be positive");
            int iP2 = uVar.p();
            if (iP2 == 1635148611) {
                o2.s.a(str == null, null);
                uVar.T(iF2 + 8);
                o2.d dVarB = o2.d.b(uVar);
                List list = dVarB.f48002a;
                dVar2.f40842c = dVarB.f48003b;
                if (!z10) {
                    fS = dVarB.f48012k;
                }
                String str4 = dVarB.f48013l;
                int i26 = dVarB.f48011j;
                int i27 = dVarB.f48008g;
                int i28 = dVarB.f48009h;
                int i29 = dVarB.f48010i;
                int i30 = dVarB.f48006e;
                kVarB = kVarB;
                iF = iF;
                iIntValue = iIntValue;
                str2 = str2;
                i24 = i26;
                iJ = i27;
                i25 = i28;
                iK = i29;
                i22 = dVarB.f48007f;
                i21 = i30;
                listD = list;
                str = MimeTypes.VIDEO_H264;
                str3 = str4;
            } else if (iP2 == 1752589123) {
                o2.s.a(str == null, null);
                uVar.T(iF2 + 8);
                o2.c0 c0VarA = o2.c0.a(uVar);
                List list2 = c0VarA.f47990a;
                dVar2.f40842c = c0VarA.f47991b;
                if (!z10) {
                    fS = c0VarA.f47999j;
                }
                int i31 = c0VarA.f48000k;
                String str5 = c0VarA.f48001l;
                int i32 = c0VarA.f47996g;
                int i33 = c0VarA.f47997h;
                int i34 = c0VarA.f47998i;
                int i35 = c0VarA.f47994e;
                int i36 = c0VarA.f47995f;
                kVarB = kVarB;
                iF = iF;
                i24 = i31;
                iIntValue = iIntValue;
                str2 = str2;
                iJ = i32;
                i25 = i33;
                iK = i34;
                str = MimeTypes.VIDEO_H265;
                i21 = i35;
                str3 = str5;
                listD = list2;
                i22 = i36;
            } else {
                if (iP2 == 1685480259 || iP2 == 1685485123) {
                    kVarB = kVarB;
                    iF = iF;
                    iIntValue = iIntValue;
                    str2 = str2;
                    i16 = i21;
                    i17 = iJ;
                    i18 = iK;
                    o2.n nVarA = o2.n.a(uVar);
                    if (nVarA != null) {
                        str = "video/dolby-vision";
                        str3 = nVarA.f48118c;
                    }
                } else if (iP2 == 1987076931) {
                    o2.s.a(str == null, null);
                    String str6 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                    uVar.T(iF2 + 12);
                    uVar.U(2);
                    int iG = uVar.G();
                    int i37 = iG >> 4;
                    boolean z11 = (iG & 1) != 0;
                    int iG2 = uVar.G();
                    int iG3 = uVar.G();
                    iJ = t1.f.j(iG2);
                    i25 = z11 ? 1 : 2;
                    iK = t1.f.k(iG3);
                    kVarB = kVarB;
                    iF = iF;
                    i21 = i37;
                    i22 = i21;
                    iIntValue = iIntValue;
                    str2 = str2;
                    str = str6;
                } else if (iP2 == 1635135811) {
                    int i38 = iP - 8;
                    byte[] bArr = new byte[i38];
                    uVar.l(bArr, 0, i38);
                    listD = com.google.common.collect.c0.D(bArr);
                    uVar.T(iF2 + 8);
                    t1.f fVarH = h(uVar);
                    int i39 = fVarH.f52680e;
                    int i40 = fVarH.f52681f;
                    int i41 = fVarH.f52676a;
                    int i42 = fVarH.f52677b;
                    iK = fVarH.f52678c;
                    kVarB = kVarB;
                    iF = iF;
                    iIntValue = iIntValue;
                    str2 = str2;
                    iJ = i41;
                    i25 = i42;
                    str = "video/av01";
                    i21 = i39;
                    i22 = i40;
                } else if (iP2 == 1668050025) {
                    if (byteBufferA == null) {
                        byteBufferA = a();
                    }
                    ByteBuffer byteBuffer = byteBufferA;
                    byteBuffer.position(21);
                    byteBuffer.putShort(uVar.C());
                    byteBuffer.putShort(uVar.C());
                    byteBufferA = byteBuffer;
                } else if (iP2 == 1835295606) {
                    if (byteBufferA == null) {
                        byteBufferA = a();
                    }
                    ByteBuffer byteBuffer2 = byteBufferA;
                    short sC = uVar.C();
                    short sC2 = uVar.C();
                    short sC3 = uVar.C();
                    short sC4 = uVar.C();
                    short sC5 = uVar.C();
                    short sC6 = uVar.C();
                    short sC7 = uVar.C();
                    int i43 = i21;
                    short sC8 = uVar.C();
                    long jI = uVar.I();
                    long jI2 = uVar.I();
                    byteBuffer2.position(1);
                    byteBuffer2.putShort(sC5);
                    byteBuffer2.putShort(sC6);
                    byteBuffer2.putShort(sC);
                    byteBuffer2.putShort(sC2);
                    byteBuffer2.putShort(sC3);
                    byteBuffer2.putShort(sC4);
                    byteBuffer2.putShort(sC7);
                    byteBuffer2.putShort(sC8);
                    byteBuffer2.putShort((short) (jI / 10000));
                    byteBuffer2.putShort((short) (jI2 / 10000));
                    byteBufferA = byteBuffer2;
                    i21 = i43;
                } else {
                    kVarB = kVarB;
                    iF = iF;
                    iIntValue = iIntValue;
                    str2 = str2;
                    i16 = i21;
                    if (iP2 == 1681012275) {
                        o2.s.a(str == null, null);
                        str = str2;
                    } else if (iP2 == 1702061171) {
                        o2.s.a(str == null, null);
                        c0622bK = k(uVar, iF2);
                        String str7 = c0622bK.f40836a;
                        byte[] bArr2 = c0622bK.f40837b;
                        if (bArr2 != null) {
                            listD = com.google.common.collect.c0.D(bArr2);
                        }
                        str = str7;
                    } else if (iP2 == 1885434736) {
                        fS = s(uVar, iF2);
                        i21 = i16;
                        z10 = true;
                    } else if (iP2 == 1937126244) {
                        bArrT = t(uVar, iF2, iP);
                    } else if (iP2 == 1936995172) {
                        int iG4 = uVar.G();
                        uVar.U(3);
                        if (iG4 == 0) {
                            int iG5 = uVar.G();
                            if (iG5 == 0) {
                                i23 = 0;
                            } else if (iG5 == 1) {
                                i23 = 1;
                            } else if (iG5 == 2) {
                                i23 = 2;
                            } else if (iG5 == 3) {
                                i23 = 3;
                            }
                        }
                    } else {
                        i17 = iJ;
                        if (iP2 == 1668246642) {
                            i18 = iK;
                            if (i17 == -1 && i18 == -1) {
                                int iP3 = uVar.p();
                                if (iP3 == 1852009592 || iP3 == 1852009571) {
                                    int iM3 = uVar.M();
                                    int iM4 = uVar.M();
                                    uVar.U(2);
                                    boolean z12 = iP == 19 && (uVar.G() & 128) != 0;
                                    iJ = t1.f.j(iM3);
                                    i25 = z12 ? 1 : 2;
                                    iK = t1.f.k(iM4);
                                } else {
                                    w1.n.h("AtomParsers", "Unsupported color type: " + i3.a.a(iP3));
                                }
                            }
                            i21 = i16;
                        } else {
                            i18 = iK;
                        }
                    }
                    i21 = i16;
                }
                iK = i18;
                iJ = i17;
                i21 = i16;
            }
            iF += iP;
            i19 = i11;
            i20 = i12;
            dVar2 = dVar;
            iIntValue = iIntValue;
            str2 = str2;
            kVarB = kVarB;
        }
        t1.k kVar2 = kVarB;
        int i44 = i21;
        int i45 = iJ;
        int i46 = iK;
        if (str == null) {
            return;
        }
        t1.o.b bVarP = new t1.o.b().Z(i13).o0(str).O(str3).t0(iM).Y(iM2).k0(fS).n0(i14).l0(bArrT).r0(i23).b0(listD).g0(i24).U(kVar2).P(new t1.f.b().d(i45).c(i25).e(i46).f(byteBufferA != null ? byteBufferA.array() : null).g(i44).b(i22).a());
        if (c0622bK != null) {
            bVarP.M(com.google.common.primitives.g.m(c0622bK.f40838c)).j0(com.google.common.primitives.g.m(c0622bK.f40839d));
        }
        dVar.f40841b = bVarP.K();
    }

    private static t1.u F(w1.u uVar) {
        short sC = uVar.C();
        uVar.U(2);
        String strD = uVar.D(sC);
        int iMax = Math.max(strD.lastIndexOf(43), strD.lastIndexOf(45));
        try {
            return new t1.u(new x1.b(Float.parseFloat(strD.substring(0, iMax)), Float.parseFloat(strD.substring(iMax, strD.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[c0.o(4, 0, length)] && jArr[c0.o(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static boolean c(int i10) {
        return i10 != 1;
    }

    private static int d(w1.u uVar, int i10, int i11, int i12) throws ParserException {
        int iF = uVar.f();
        o2.s.a(iF >= i11, null);
        while (iF - i11 < i12) {
            uVar.T(iF);
            int iP = uVar.p();
            o2.s.a(iP > 0, "childAtomSize must be positive");
            if (uVar.p() == i10) {
                return iF;
            }
            iF += iP;
        }
        return -1;
    }

    private static int e(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void f(w1.u uVar) {
        int iF = uVar.f();
        uVar.U(4);
        if (uVar.p() != 1751411826) {
            iF += 4;
        }
        uVar.T(iF);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01be  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0201  */
    /* JADX WARN: Code duplicated, block: B:145:0x021e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0224  */
    /* JADX WARN: Code duplicated, block: B:151:0x023e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0243  */
    /* JADX WARN: Code duplicated, block: B:155:0x024e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0258  */
    /* JADX WARN: Code duplicated, block: B:158:0x025d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0268  */
    /* JADX WARN: Code duplicated, block: B:164:0x0276  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:228:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    private static void g(w1.u uVar, int i10, int i11, int i12, int i13, String str, boolean z10, t1.k kVar, d dVar, int i14) throws ParserException {
        int iM;
        int i15;
        int iM2;
        int iH;
        int iP;
        int i16;
        String str2;
        String str3;
        int i17;
        String str4;
        List listD;
        String str5;
        C0622b c0622bK;
        int iP2;
        boolean z11;
        int iP3;
        String str6;
        int iD;
        byte[] bArr;
        char c10;
        int iG;
        byte[] bArr2;
        int iG2;
        String str7;
        byte[] bArr3;
        com.google.common.collect.c0 c0VarE;
        int i18 = i12;
        t1.k kVarB = kVar;
        uVar.T(i11 + 16);
        if (z10) {
            iM = uVar.M();
            uVar.U(6);
        } else {
            uVar.U(8);
            iM = 0;
        }
        if (iM == 0 || iM == 1) {
            i15 = 2;
            iM2 = uVar.M();
            uVar.U(6);
            iH = uVar.H();
            uVar.T(uVar.f() - 4);
            iP = uVar.p();
            if (iM == 1) {
                uVar.U(16);
            }
            i16 = -1;
        } else {
            if (iM != 2) {
                return;
            }
            uVar.U(16);
            iH = (int) Math.round(uVar.o());
            iM2 = uVar.K();
            uVar.U(4);
            int iK = uVar.K();
            int iK2 = uVar.K();
            boolean z12 = (iK2 & 1) != 0;
            boolean z13 = (iK2 & 2) != 0;
            i15 = 2;
            if (z12) {
                if (iK == 32) {
                    i16 = 4;
                } else {
                    i16 = -1;
                }
            } else if (iK == 8) {
                i16 = 3;
            } else if (iK == 16) {
                i16 = z13 ? 268435456 : 2;
            } else if (iK == 24) {
                i16 = z13 ? 1342177280 : 21;
            } else if (iK == 32) {
                i16 = z13 ? 1610612736 : 22;
            } else {
                i16 = -1;
            }
            uVar.U(8);
            iP = 0;
        }
        int iF = uVar.f();
        int iIntValue = i10;
        if (iIntValue == 1701733217) {
            Pair pairU = u(uVar, i11, i18);
            if (pairU != null) {
                iIntValue = ((Integer) pairU.first).intValue();
                kVarB = kVarB == null ? null : kVarB.b(((t) pairU.second).f40970b);
                dVar.f40840a[i14] = (t) pairU.second;
            }
            uVar.T(iF);
        }
        String str8 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                str3 = MimeTypes.AUDIO_RAW;
                if (iIntValue == 1936684916) {
                    i17 = i15;
                } else if (iIntValue == 1953984371) {
                    i17 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i16 == -1) {
                        i17 = i15;
                    } else {
                        i17 = i16;
                    }
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    i17 = i16;
                    str3 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = MimeTypes.AUDIO_TRUEHD;
                } else {
                    i17 = i16;
                    str3 = null;
                }
                str4 = str3;
                listD = null;
                str5 = null;
                c0622bK = null;
                while (iF - i11 < i18) {
                    uVar.T(iF);
                    iP2 = uVar.p();
                    if (iP2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i19 = i17;
                    o2.s.a(z11, "childAtomSize must be positive");
                    iP3 = uVar.p();
                    if (iP3 == 1835557187) {
                        uVar.T(iF + 8);
                        uVar.U(1);
                        iG2 = uVar.G();
                        uVar.U(1);
                        if (Objects.equals(str4, str8)) {
                            str7 = String.format("mhm1.%02X", Integer.valueOf(iG2));
                        } else {
                            str7 = String.format("mha1.%02X", Integer.valueOf(iG2));
                        }
                        String str9 = str7;
                        int iM3 = uVar.M();
                        bArr3 = new byte[iM3];
                        uVar.l(bArr3, 0, iM3);
                        if (listD == null) {
                            c0VarE = com.google.common.collect.c0.D(bArr3);
                        } else {
                            c0VarE = com.google.common.collect.c0.E(bArr3, (byte[]) listD.get(0));
                        }
                        listD = c0VarE;
                        str5 = str9;
                    } else {
                        if (iP3 == 1835557200) {
                            uVar.T(iF + 8);
                            iG = uVar.G();
                            if (iG > 0) {
                                bArr2 = new byte[iG];
                                str6 = str8;
                                uVar.l(bArr2, 0, iG);
                                if (listD == null) {
                                    listD = com.google.common.collect.c0.D(bArr2);
                                } else {
                                    listD = com.google.common.collect.c0.E((byte[]) listD.get(0), bArr2);
                                }
                            }
                        } else {
                            str6 = str8;
                            if (iP3 != 1702061171 || (z10 && iP3 == 2002876005)) {
                                if (iP3 == 1702061171) {
                                    iD = iF;
                                } else {
                                    iD = d(uVar, 1702061171, iF, iP2);
                                }
                                if (iD != -1) {
                                    c0622bK = k(uVar, iD);
                                    str4 = c0622bK.f40836a;
                                    bArr = c0622bK.f40837b;
                                    if (bArr != null) {
                                        if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                            listD = r0.e(bArr);
                                        } else {
                                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                                o2.a.b bVarE = o2.a.e(bArr);
                                                int i20 = bVarE.f47964a;
                                                int i21 = bVarE.f47965b;
                                                str5 = bVarE.f47966c;
                                                iH = i20;
                                                iM2 = i21;
                                            }
                                            listD = com.google.common.collect.c0.D(bArr);
                                        }
                                    }
                                }
                            } else {
                                if (iP3 == 1684103987) {
                                    uVar.T(iF + 8);
                                    dVar.f40841b = o2.b.d(uVar, Integer.toString(i13), str, kVarB);
                                } else if (iP3 == 1684366131) {
                                    uVar.T(iF + 8);
                                    dVar.f40841b = o2.b.h(uVar, Integer.toString(i13), str, kVarB);
                                } else if (iP3 == 1684103988) {
                                    uVar.T(iF + 8);
                                    dVar.f40841b = o2.c.b(uVar, Integer.toString(i13), str, kVarB);
                                } else if (iP3 == 1684892784) {
                                    if (iP <= 0) {
                                        throw ParserException.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iP, null);
                                    }
                                    iH = iP;
                                    iM2 = i15;
                                } else if (iP3 == 1684305011 || iP3 == 1969517683) {
                                    c10 = 24931;
                                    dVar.f40841b = new t1.o.b().Z(i13).o0(str4).N(iM2).p0(iH).U(kVarB).e0(str).K();
                                } else if (iP3 == 1682927731) {
                                    int i22 = iP2 - 8;
                                    byte[] bArr4 = f40826a;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i22);
                                    uVar.T(iF + 8);
                                    uVar.l(bArrCopyOf, bArr4.length, i22);
                                    listD = h0.a(bArrCopyOf);
                                } else if (iP3 == 1684425825) {
                                    byte[] bArr5 = new byte[iP2 - 8];
                                    bArr5[0] = 102;
                                    bArr5[1] = 76;
                                    bArr5[i15] = 97;
                                    bArr5[3] = 67;
                                    uVar.T(iF + 12);
                                    uVar.l(bArr5, 4, iP2 - 12);
                                    listD = com.google.common.collect.c0.D(bArr5);
                                } else {
                                    c10 = 24931;
                                    if (iP3 == 1634492771) {
                                        int i23 = iP2 - 12;
                                        byte[] bArr6 = new byte[i23];
                                        uVar.T(iF + 12);
                                        uVar.l(bArr6, 0, i23);
                                        Pair pairE = w1.e.e(bArr6);
                                        int iIntValue2 = ((Integer) pairE.first).intValue();
                                        int iIntValue3 = ((Integer) pairE.second).intValue();
                                        listD = com.google.common.collect.c0.D(bArr6);
                                        iH = iIntValue2;
                                        iM2 = iIntValue3;
                                    }
                                }
                                c10 = 24931;
                            }
                            iF += iP2;
                            i18 = i12;
                            i17 = i19;
                            str8 = str6;
                        }
                        iF += iP2;
                        i18 = i12;
                        i17 = i19;
                        str8 = str6;
                    }
                    str6 = str8;
                    iF += iP2;
                    i18 = i12;
                    i17 = i19;
                    str8 = str6;
                }
                int i24 = i17;
                if (dVar.f40841b == null || str4 == null) {
                }
                t1.o.b bVarE0 = new t1.o.b().Z(i13).o0(str4).O(str5).N(iM2).p0(iH).i0(i24).b0(listD).U(kVarB).e0(str);
                if (c0622bK != null) {
                    bVarE0.M(com.google.common.primitives.g.m(c0622bK.f40838c)).j0(com.google.common.primitives.g.m(c0622bK.f40839d));
                }
                dVar.f40841b = bVarE0.K();
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i17 = i16;
        str4 = str3;
        listD = null;
        str5 = null;
        c0622bK = null;
        while (iF - i11 < i18) {
            uVar.T(iF);
            iP2 = uVar.p();
            if (iP2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i110 = i17;
            o2.s.a(z11, "childAtomSize must be positive");
            iP3 = uVar.p();
            if (iP3 == 1835557187) {
                uVar.T(iF + 8);
                uVar.U(1);
                iG2 = uVar.G();
                uVar.U(1);
                if (Objects.equals(str4, str8)) {
                    str7 = String.format("mhm1.%02X", Integer.valueOf(iG2));
                } else {
                    str7 = String.format("mha1.%02X", Integer.valueOf(iG2));
                }
                String str10 = str7;
                int iM4 = uVar.M();
                bArr3 = new byte[iM4];
                uVar.l(bArr3, 0, iM4);
                if (listD == null) {
                    c0VarE = com.google.common.collect.c0.D(bArr3);
                } else {
                    c0VarE = com.google.common.collect.c0.E(bArr3, (byte[]) listD.get(0));
                }
                listD = c0VarE;
                str5 = str10;
            } else {
                if (iP3 == 1835557200) {
                    uVar.T(iF + 8);
                    iG = uVar.G();
                    if (iG > 0) {
                        bArr2 = new byte[iG];
                        str6 = str8;
                        uVar.l(bArr2, 0, iG);
                        if (listD == null) {
                            listD = com.google.common.collect.c0.D(bArr2);
                        } else {
                            listD = com.google.common.collect.c0.E((byte[]) listD.get(0), bArr2);
                        }
                    }
                } else {
                    str6 = str8;
                    if (iP3 != 1702061171) {
                        if (iP3 == 1702061171) {
                            iD = iF;
                        } else {
                            iD = d(uVar, 1702061171, iF, iP2);
                        }
                        if (iD != -1) {
                            c0622bK = k(uVar, iD);
                            str4 = c0622bK.f40836a;
                            bArr = c0622bK.f40837b;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                    listD = r0.e(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        o2.a.b bVarE2 = o2.a.e(bArr);
                                        int i25 = bVarE2.f47964a;
                                        int i26 = bVarE2.f47965b;
                                        str5 = bVarE2.f47966c;
                                        iH = i25;
                                        iM2 = i26;
                                    }
                                    listD = com.google.common.collect.c0.D(bArr);
                                }
                            }
                        }
                    } else {
                        if (iP3 == 1702061171) {
                            iD = iF;
                        } else {
                            iD = d(uVar, 1702061171, iF, iP2);
                        }
                        if (iD != -1) {
                            c0622bK = k(uVar, iD);
                            str4 = c0622bK.f40836a;
                            bArr = c0622bK.f40837b;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                                    listD = r0.e(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        o2.a.b bVarE3 = o2.a.e(bArr);
                                        int i27 = bVarE3.f47964a;
                                        int i28 = bVarE3.f47965b;
                                        str5 = bVarE3.f47966c;
                                        iH = i27;
                                        iM2 = i28;
                                    }
                                    listD = com.google.common.collect.c0.D(bArr);
                                }
                            }
                        }
                    }
                    iF += iP2;
                    i18 = i12;
                    i17 = i110;
                    str8 = str6;
                }
                iF += iP2;
                i18 = i12;
                i17 = i110;
                str8 = str6;
            }
            str6 = str8;
            iF += iP2;
            i18 = i12;
            i17 = i110;
            str8 = str6;
        }
        int i29 = i17;
        if (dVar.f40841b == null) {
        }
    }

    private static t1.f h(w1.u uVar) {
        t1.f.b bVar = new t1.f.b();
        w1.t tVar = new w1.t(uVar.e());
        tVar.p(uVar.f() * 8);
        tVar.s(1);
        int iH = tVar.h(3);
        tVar.r(6);
        boolean zG = tVar.g();
        boolean zG2 = tVar.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        tVar.r(13);
        tVar.q();
        int iH2 = tVar.h(4);
        if (iH2 != 1) {
            w1.n.f("AtomParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (tVar.g()) {
            w1.n.f("AtomParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = tVar.g();
        tVar.q();
        if (zG3 && tVar.h(8) > 127) {
            w1.n.f("AtomParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = tVar.h(3);
        tVar.q();
        if (tVar.g()) {
            w1.n.f("AtomParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (tVar.g()) {
            w1.n.f("AtomParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (tVar.g()) {
            w1.n.f("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = tVar.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            tVar.r(12);
            if (tVar.h(5) > 7) {
                tVar.q();
            }
        }
        int iH5 = tVar.h(4);
        int iH6 = tVar.h(4);
        tVar.r(iH5 + 1);
        tVar.r(iH6 + 1);
        if (tVar.g()) {
            tVar.r(7);
        }
        tVar.r(7);
        boolean zG4 = tVar.g();
        if (zG4) {
            tVar.r(2);
        }
        if ((tVar.g() ? 2 : tVar.h(1)) > 0 && !tVar.g()) {
            tVar.r(1);
        }
        if (zG4) {
            tVar.r(3);
        }
        tVar.r(3);
        boolean zG5 = tVar.g();
        if (iH3 == 2 && zG5) {
            tVar.q();
        }
        if (iH3 != 1 && tVar.g()) {
            z10 = true;
        }
        if (tVar.g()) {
            int iH7 = tVar.h(8);
            int iH8 = tVar.h(8);
            bVar.d(t1.f.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || tVar.h(8) != 0) ? tVar.h(1) : 1) != 1 ? 2 : 1).e(t1.f.k(iH8));
        }
        return bVar.a();
    }

    static Pair i(w1.u uVar, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strD = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            uVar.T(i12);
            int iP = uVar.p();
            int iP2 = uVar.p();
            if (iP2 == 1718775137) {
                numValueOf = Integer.valueOf(uVar.p());
            } else if (iP2 == 1935894637) {
                uVar.U(4);
                strD = uVar.D(4);
            } else if (iP2 == 1935894633) {
                i13 = i12;
                i14 = iP;
            }
            i12 += iP;
        }
        if (!C.CENC_TYPE_cenc.equals(strD) && !C.CENC_TYPE_cbc1.equals(strD) && !C.CENC_TYPE_cens.equals(strD) && !C.CENC_TYPE_cbcs.equals(strD)) {
            return null;
        }
        o2.s.a(numValueOf != null, "frma atom is mandatory");
        o2.s.a(i13 != -1, "schi atom is mandatory");
        t tVarV = v(uVar, i13, i14, strD);
        o2.s.a(tVarV != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (t) c0.h(tVarV));
    }

    private static Pair j(i3.a.C0621a c0621a) {
        i3.a.b bVarG = c0621a.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        w1.u uVar = bVarG.f40825b;
        uVar.T(8);
        int iC = i3.a.c(uVar.p());
        int iK = uVar.K();
        long[] jArr = new long[iK];
        long[] jArr2 = new long[iK];
        for (int i10 = 0; i10 < iK; i10++) {
            jArr[i10] = iC == 1 ? uVar.L() : uVar.I();
            jArr2[i10] = iC == 1 ? uVar.z() : uVar.p();
            if (uVar.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            uVar.U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0622b k(w1.u uVar, int i10) {
        uVar.T(i10 + 12);
        uVar.U(1);
        l(uVar);
        uVar.U(2);
        int iG = uVar.G();
        if ((iG & 128) != 0) {
            uVar.U(2);
        }
        if ((iG & 64) != 0) {
            uVar.U(uVar.G());
        }
        if ((iG & 32) != 0) {
            uVar.U(2);
        }
        uVar.U(1);
        l(uVar);
        String strC = t1.v.c(uVar.G());
        if (MimeTypes.AUDIO_MPEG.equals(strC) || MimeTypes.AUDIO_DTS.equals(strC) || MimeTypes.AUDIO_DTS_HD.equals(strC)) {
            return new C0622b(strC, null, -1L, -1L);
        }
        uVar.U(4);
        long jI = uVar.I();
        long jI2 = uVar.I();
        uVar.U(1);
        int iL = l(uVar);
        long j10 = jI2;
        byte[] bArr = new byte[iL];
        uVar.l(bArr, 0, iL);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new C0622b(strC, bArr, j10, jI > 0 ? jI : -1L);
    }

    private static int l(w1.u uVar) {
        int iG = uVar.G();
        int i10 = iG & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((iG & 128) == 128) {
            iG = uVar.G();
            i10 = (i10 << 7) | (iG & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i10;
    }

    private static int m(w1.u uVar) {
        uVar.T(16);
        return uVar.p();
    }

    private static t1.u n(w1.u uVar, int i10) {
        uVar.U(8);
        ArrayList arrayList = new ArrayList();
        while (uVar.f() < i10) {
            t1.u.b bVarC = j.c(uVar);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t1.u(arrayList);
    }

    private static Pair o(w1.u uVar) {
        uVar.T(8);
        int iC = i3.a.c(uVar.p());
        uVar.U(iC == 0 ? 8 : 16);
        long jI = uVar.I();
        uVar.U(iC == 0 ? 4 : 8);
        int iM = uVar.M();
        return Pair.create(Long.valueOf(jI), "" + ((char) (((iM >> 10) & 31) + 96)) + ((char) (((iM >> 5) & 31) + 96)) + ((char) ((iM & 31) + 96)));
    }

    public static t1.u p(i3.a.C0621a c0621a) {
        i3.a.b bVarG = c0621a.g(1751411826);
        i3.a.b bVarG2 = c0621a.g(1801812339);
        i3.a.b bVarG3 = c0621a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || m(bVarG.f40825b) != 1835299937) {
            return null;
        }
        w1.u uVar = bVarG2.f40825b;
        uVar.T(12);
        int iP = uVar.p();
        String[] strArr = new String[iP];
        for (int i10 = 0; i10 < iP; i10++) {
            int iP2 = uVar.p();
            uVar.U(4);
            strArr[i10] = uVar.D(iP2 - 8);
        }
        w1.u uVar2 = bVarG3.f40825b;
        uVar2.T(8);
        ArrayList arrayList = new ArrayList();
        while (uVar2.a() > 8) {
            int iF = uVar2.f();
            int iP3 = uVar2.p();
            int iP4 = uVar2.p() - 1;
            if (iP4 < 0 || iP4 >= iP) {
                w1.n.h("AtomParsers", "Skipped metadata with unknown key index: " + iP4);
            } else {
                x1.a aVarH = j.h(uVar2, iF + iP3, strArr[iP4]);
                if (aVarH != null) {
                    arrayList.add(aVarH);
                }
            }
            uVar2.T(iF + iP3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t1.u(arrayList);
    }

    private static void q(w1.u uVar, int i10, int i11, int i12, d dVar) {
        uVar.T(i11 + 16);
        if (i10 == 1835365492) {
            uVar.A();
            String strA = uVar.A();
            if (strA != null) {
                dVar.f40841b = new t1.o.b().Z(i12).o0(strA).K();
            }
        }
    }

    public static x1.c r(w1.u uVar) {
        long jZ;
        long jZ2;
        uVar.T(8);
        if (i3.a.c(uVar.p()) == 0) {
            jZ = uVar.I();
            jZ2 = uVar.I();
        } else {
            jZ = uVar.z();
            jZ2 = uVar.z();
        }
        return new x1.c(jZ, jZ2, uVar.I());
    }

    private static float s(w1.u uVar, int i10) {
        uVar.T(i10 + 8);
        return uVar.K() / uVar.K();
    }

    private static byte[] t(w1.u uVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            uVar.T(i12);
            int iP = uVar.p();
            if (uVar.p() == 1886547818) {
                return Arrays.copyOfRange(uVar.e(), i12, iP + i12);
            }
            i12 += iP;
        }
        return null;
    }

    private static Pair u(w1.u uVar, int i10, int i11) throws ParserException {
        Pair pairI;
        int iF = uVar.f();
        while (iF - i10 < i11) {
            uVar.T(iF);
            int iP = uVar.p();
            o2.s.a(iP > 0, "childAtomSize must be positive");
            if (uVar.p() == 1936289382 && (pairI = i(uVar, iF, iP)) != null) {
                return pairI;
            }
            iF += iP;
        }
        return null;
    }

    private static t v(w1.u uVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            uVar.T(i14);
            int iP = uVar.p();
            if (uVar.p() == 1952804451) {
                int iC = i3.a.c(uVar.p());
                uVar.U(1);
                if (iC == 0) {
                    uVar.U(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iG = uVar.G();
                    i12 = iG & 15;
                    i13 = (iG & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z10 = uVar.G() == 1;
                int iG2 = uVar.G();
                byte[] bArr2 = new byte[16];
                uVar.l(bArr2, 0, 16);
                if (z10 && iG2 == 0) {
                    int iG3 = uVar.G();
                    bArr = new byte[iG3];
                    uVar.l(bArr, 0, iG3);
                }
                return new t(z10, str, iG2, bArr2, i13, i12, bArr);
            }
            i14 += iP;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    private static v w(s sVar, i3.a.C0621a c0621a, b0 b0Var) throws ParserException {
        c fVar;
        boolean z10;
        int iK;
        int iK2;
        int iK3;
        boolean z11;
        long j10;
        long[] jArrCopyOf;
        int i10;
        int i11;
        long j11;
        boolean z12;
        int[] iArr;
        long[] jArr;
        ?? r10;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        long j12;
        int[] iArr6;
        int[] iArr7;
        int i12;
        boolean z13;
        int i13;
        int i14;
        i3.a.b bVarG = c0621a.g(1937011578);
        if (bVarG != null) {
            fVar = new e(bVarG, sVar.f40963f);
        } else {
            i3.a.b bVarG2 = c0621a.g(1937013298);
            if (bVarG2 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            fVar = new f(bVarG2);
        }
        int sampleCount = fVar.getSampleCount();
        if (sampleCount == 0) {
            return new v(sVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        i3.a.b bVarG3 = c0621a.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = (i3.a.b) w1.a.e(c0621a.g(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        w1.u uVar = bVarG3.f40825b;
        w1.u uVar2 = ((i3.a.b) w1.a.e(c0621a.g(1937011555))).f40825b;
        w1.u uVar3 = ((i3.a.b) w1.a.e(c0621a.g(1937011827))).f40825b;
        i3.a.b bVarG4 = c0621a.g(1937011571);
        w1.u uVar4 = bVarG4 != null ? bVarG4.f40825b : null;
        i3.a.b bVarG5 = c0621a.g(1668576371);
        w1.u uVar5 = bVarG5 != null ? bVarG5.f40825b : null;
        a aVar = new a(uVar2, uVar, z10);
        uVar3.T(12);
        int iK4 = uVar3.K() - 1;
        int iK5 = uVar3.K();
        int iK6 = uVar3.K();
        if (uVar5 != null) {
            uVar5.T(12);
            iK = uVar5.K();
        } else {
            iK = 0;
        }
        if (uVar4 != null) {
            uVar4.T(12);
            iK3 = uVar4.K();
            if (iK3 > 0) {
                iK2 = uVar4.K() - 1;
                z11 = false;
            } else {
                iK2 = -1;
                z11 = false;
                uVar4 = null;
            }
        } else {
            iK2 = -1;
            iK3 = 0;
            z11 = false;
        }
        int iA = fVar.a();
        String str = sVar.f40963f.f52757n;
        boolean z14 = (iA == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && iK4 == 0 && iK == 0 && iK3 == 0)) ? z11 ? 1 : 0 : true;
        c cVar = fVar;
        if (z14) {
            int i15 = aVar.f40827a;
            long[] jArr2 = new long[i15];
            int[] iArr8 = new int[i15];
            while (aVar.a()) {
                int i16 = aVar.f40828b;
                jArr2[i16] = aVar.f40830d;
                iArr8[i16] = aVar.f40829c;
            }
            i3.e.b bVarA = i3.e.a(iA, jArr2, iArr8, iK6);
            long[] jArr3 = bVarA.f40862a;
            iArr = bVarA.f40863b;
            int i17 = bVarA.f40864c;
            long[] jArr4 = bVarA.f40865d;
            int[] iArr9 = bVarA.f40866e;
            j11 = bVarA.f40867f;
            jArr = jArr3;
            r10 = i17;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j10 = 0;
        } else {
            long[] jArr5 = new long[sampleCount];
            j10 = 0;
            int[] iArrCopyOf = new int[sampleCount];
            jArrCopyOf = new long[sampleCount];
            w1.u uVar6 = uVar5;
            int[] iArrCopyOf2 = new int[sampleCount];
            w1.u uVar7 = uVar4;
            int iK7 = iK2;
            int i18 = z11 ? 1 : 0;
            int iP = i18;
            int i19 = iP == true ? 1 : 0;
            int i20 = i19;
            long j13 = 0;
            long j14 = 0;
            int i21 = iK;
            int iP2 = iK6;
            int i22 = iK5;
            int i23 = iK4;
            int i24 = i20 == true ? 1 : 0;
            while (true) {
                if (i18 >= sampleCount) {
                    boolean z15 = sampleCount == true ? 1 : 0;
                    i10 = i22;
                    i11 = i19;
                    break;
                }
                long j15 = j14;
                int i25 = i19;
                boolean zA = true;
                while (i25 == 0) {
                    zA = aVar.a();
                    if (!zA) {
                        break;
                    }
                    int i26 = i22;
                    long j16 = aVar.f40830d;
                    i25 = aVar.f40829c;
                    j15 = j16;
                    i22 = i26;
                    iP2 = iP2;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i27 = sampleCount;
                i10 = i22;
                int i28 = iP2;
                if (!zA) {
                    w1.n.h("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i18);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i18;
                    i11 = i25;
                    break;
                }
                if (uVar6 != null) {
                    int iK8 = i20 == true ? 1 : 0;
                    while (iK8 == 0 && i21 > 0) {
                        iK8 = uVar6.K();
                        iP = uVar6.p();
                        i21--;
                    }
                    i20 = iK8 - 1;
                }
                jArr5[i18] = j15;
                int nextSampleSize = cVar.readNextSampleSize();
                iArrCopyOf[i18] = nextSampleSize;
                if (nextSampleSize > i24) {
                    i24 = nextSampleSize;
                }
                jArrCopyOf[i18] = j13 + ((long) iP);
                iArrCopyOf2[i18] = uVar7 == null ? 1 : z11 ? 1 : 0;
                if (i18 == iK7) {
                    iArrCopyOf2[i18] = 1;
                    iK3--;
                    if (iK3 > 0) {
                        iK7 = ((w1.u) w1.a.e(uVar7)).K() - 1;
                    }
                }
                j13 += (long) i28;
                int iK9 = i10 - 1;
                if (iK9 != 0 || i23 <= 0) {
                    iP2 = i28;
                } else {
                    iK9 = uVar3.K();
                    i23--;
                    iP2 = uVar3.p();
                }
                i22 = iK9;
                long j17 = j15 + ((long) iArrCopyOf[i18]);
                i19 = i25 - 1;
                i18++;
                j14 = j17;
                sampleCount = i27 == true ? 1 : 0;
            }
            j11 = j13 + ((long) iP);
            if (uVar6 == null) {
                z12 = true;
                break;
            }
            while (true) {
                if (i21 <= 0) {
                    z12 = true;
                    break;
                }
                if (uVar6.K() != 0) {
                    z12 = z11 ? 1 : 0;
                    break;
                }
                uVar6.p();
                i21--;
            }
            if (iK3 != 0 || i10 != 0 || i11 != 0 || i23 != 0 || i20 != 0 || !z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(sVar.f40958a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iK3);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i10);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i11);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i23);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i20 == true ? 1 : 0 ? 1 : 0);
                sb2.append(!z12 ? ", ctts invalid" : "");
                w1.n.h("AtomParsers", sb2.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r10 = i24 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j18 = j11;
        long jN0 = c0.N0(j18, 1000000L, sVar.f40960c);
        long[] jArr6 = sVar.f40965h;
        if (jArr6 == null) {
            c0.O0(jArrCopyOf, 1000000L, sVar.f40960c);
            return new v(sVar, jArr, iArr, r10 == true ? 1 : 0, jArrCopyOf, iArr2, jN0);
        }
        int[] iArr10 = iArr;
        int i29 = sampleCount;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && sVar.f40959b == 1 && jArrCopyOf.length >= 2) {
            long j19 = ((long[]) w1.a.e(sVar.f40966i))[z11 ? 1 : 0];
            long jN1 = j19 + c0.N0(sVar.f40965h[z11 ? 1 : 0], sVar.f40960c, sVar.f40961d);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (b(jArr8, j18, j19, jN1)) {
                long jN2 = c0.N0(j19 - jArrCopyOf[z11 ? 1 : 0], sVar.f40963f.C, sVar.f40960c);
                long jN3 = c0.N0(j18 - jN1, sVar.f40963f.C, sVar.f40960c);
                if (jN2 != j10 || jN3 != j10) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j18 = j18;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j18 = j18;
                    if (jN2 <= 2147483647L && jN3 <= 2147483647L) {
                        b0Var.f47982a = (int) jN2;
                        b0Var.f47983b = (int) jN3;
                        c0.O0(jArrCopyOf, 1000000L, sVar.f40960c);
                        return new v(sVar, jArr7, iArr11, r10 == true ? 1 : 0, jArrCopyOf, iArr2, c0.N0(sVar.f40965h[z11 ? 1 : 0], 1000000L, sVar.f40961d));
                    }
                }
            }
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j18 = j18;
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j18 = j18;
            jArr = jArr7;
            iArr3 = iArr11;
        }
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        long[] jArr9 = sVar.f40965h;
        if (jArr9.length == 1 && jArr9[z11 ? 1 : 0] == j10) {
            long j20 = ((long[]) w1.a.e(sVar.f40966i))[z11 ? 1 : 0];
            for (int i30 = z11 ? 1 : 0; i30 < jArrCopyOf.length; i30++) {
                jArrCopyOf[i30] = c0.N0(jArrCopyOf[i30] - j20, 1000000L, sVar.f40960c);
            }
            return new v(sVar, jArr, iArr3, r10 == true ? 1 : 0, jArrCopyOf, iArr2, c0.N0(j18 - j20, 1000000L, sVar.f40960c));
        }
        boolean z16 = sVar.f40959b == 1 ? true : z11 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) w1.a.e(sVar.f40966i);
        int i31 = z11 ? 1 : 0;
        boolean z17 = i31 == true ? 1 : 0;
        int i32 = z17 ? 1 : 0;
        int i33 = i32;
        boolean z18 = z17;
        while (true) {
            long[] jArr11 = sVar.f40965h;
            iArr4 = iArr13;
            if (i31 >= jArr11.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr12 = jArr10;
            long j21 = jArr12[i31];
            if (j21 != -1) {
                long j22 = jArr11[i31];
                i12 = i31;
                boolean z19 = z18 ? 1 : 0;
                long jN4 = c0.N0(j22, sVar.f40960c, sVar.f40961d);
                iArr7 = iArr14;
                iArr7[i12 == true ? 1 : 0] = c0.g(jArrCopyOf, j21, true, true);
                long j23 = j21 + jN4;
                z13 = z11;
                iArr4[i12 == true ? 1 : 0] = c0.d(jArrCopyOf, j23, z16, z13);
                while (true) {
                    i13 = iArr7[i12 == true ? 1 : 0];
                    i14 = iArr4[i12 == true ? 1 : 0];
                    if (i13 >= i14 || (iArr2[i13] & 1) != 0) {
                        break;
                    }
                    iArr7[i12 == true ? 1 : 0] = i13 + 1;
                }
                i32 += i14 - i13;
                z18 = (z19 ? 1 : 0) | (i33 != i13 ? true : z13 ? 1 : 0);
                i33 = i14;
            } else {
                iArr7 = iArr14;
                i12 = i31;
                boolean z20 = z18 ? 1 : 0;
                z13 = z11;
            }
            jArr10 = jArr12;
            z11 = z13;
            iArr13 = iArr4;
            i31 = i12 + 1;
            iArr12 = iArr7;
            z18 = z18;
        }
        int[] iArr15 = iArr12;
        boolean z21 = z11;
        boolean z22 = (z18 ? 1 : 0 ? 1 : 0) | (i32 != i29 ? true : z21);
        long[] jArr13 = z22 != 0 ? new long[i32] : jArr;
        if (z22 != 0) {
            iArr6 = new int[i32];
        } else {
            iArr5 = iArr3;
        }
        if (z22 != 0) {
            iArr5 = iArr6;
            r10 = z21;
        }
        int[] iArr16 = z22 != 0 ? new int[i32] : iArr2;
        long[] jArr14 = new long[i32];
        ?? r12 = z21;
        long j24 = j10;
        boolean z23 = z22;
        int[] iArr17 = iArr3;
        ?? r11 = r10;
        ?? r13 = z21;
        while (r13 < sVar.f40965h.length) {
            long j25 = sVar.f40966i[r13];
            int i34 = iArr15[r13];
            boolean z24 = z23;
            int i35 = iArr4[r13];
            ?? r38 = r11;
            if (z24 != 0) {
                int i36 = i35 - i34;
                System.arraycopy(jArr, i34, jArr13, r12, i36);
                System.arraycopy(iArr17, i34, iArr5, r12, i36);
                System.arraycopy(iArr2, i34, iArr16, r12, i36);
            }
            int i37 = r38 == true ? 1 : 0;
            int[] iArr18 = iArr17;
            ?? r14 = r12;
            while (i34 < i35) {
                long[] jArr15 = jArr;
                int[] iArr19 = iArr18;
                long jN5 = c0.N0(j24, 1000000L, sVar.f40961d);
                long jN6 = c0.N0(jArrCopyOf[i34] - j25, 1000000L, sVar.f40960c);
                int i38 = i35;
                long[] jArr16 = jArrCopyOf;
                if (c(sVar.f40959b)) {
                    j12 = j10;
                    jN6 = Math.max(j12, jN6);
                } else {
                    j12 = j10;
                }
                jArr14[r14] = jN5 + jN6;
                if (z24 != 0 && iArr5[r14] > i37) {
                    i37 = iArr19[i34];
                }
                i34++;
                j10 = j12;
                jArr = jArr15;
                iArr18 = iArr19;
                jArrCopyOf = jArr16;
                iArr2 = iArr2;
                i35 = i38;
                i37 = i37;
                r14++;
            }
            j24 += sVar.f40965h[r13];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z23 = z24;
            iArr17 = iArr18;
            r11 = i37;
            r13++;
            r12 = r14;
        }
        return new v(sVar, jArr13, iArr5, r11, jArr14, iArr16, c0.N0(j24, 1000000L, sVar.f40961d));
    }

    private static d x(w1.u uVar, int i10, int i11, String str, t1.k kVar, boolean z10) throws ParserException {
        uVar.T(12);
        int iP = uVar.p();
        d dVar = new d(iP);
        int i12 = 0;
        while (i12 < iP) {
            int iF = uVar.f();
            int iP2 = uVar.p();
            o2.s.a(iP2 > 0, "childAtomSize must be positive");
            int iP3 = uVar.p();
            if (iP3 == 1635148593 || iP3 == 1635148595 || iP3 == 1701733238 || iP3 == 1831958048 || iP3 == 1836070006 || iP3 == 1752589105 || iP3 == 1751479857 || iP3 == 1932670515 || iP3 == 1211250227 || iP3 == 1987063864 || iP3 == 1987063865 || iP3 == 1635135537 || iP3 == 1685479798 || iP3 == 1685479729 || iP3 == 1685481573 || iP3 == 1685481521) {
                d dVar2 = dVar;
                int i13 = i12;
                E(uVar, iP3, iF, iP2, i10, i11, kVar, dVar2, i13);
                dVar = dVar2;
                i12 = i13;
            } else if (iP3 == 1836069985 || iP3 == 1701733217 || iP3 == 1633889587 || iP3 == 1700998451 || iP3 == 1633889588 || iP3 == 1835823201 || iP3 == 1685353315 || iP3 == 1685353317 || iP3 == 1685353320 || iP3 == 1685353324 || iP3 == 1685353336 || iP3 == 1935764850 || iP3 == 1935767394 || iP3 == 1819304813 || iP3 == 1936684916 || iP3 == 1953984371 || iP3 == 778924082 || iP3 == 778924083 || iP3 == 1835557169 || iP3 == 1835560241 || iP3 == 1634492771 || iP3 == 1634492791 || iP3 == 1970037111 || iP3 == 1332770163 || iP3 == 1716281667) {
                d dVar3 = dVar;
                g(uVar, iP3, iF, iP2, i10, str, z10, kVar, dVar3, i12);
                dVar = dVar3;
            } else if (iP3 == 1414810956 || iP3 == 1954034535 || iP3 == 2004251764 || iP3 == 1937010800 || iP3 == 1664495672) {
                y(uVar, iP3, iF, iP2, i10, str, dVar);
            } else if (iP3 == 1835365492) {
                q(uVar, iP3, iF, i10, dVar);
            } else if (iP3 == 1667329389) {
                dVar.f40841b = new t1.o.b().Z(i10).o0(MimeTypes.APPLICATION_CAMERA_MOTION).K();
            }
            uVar.T(iF + iP2);
            i12++;
        }
        return dVar;
    }

    private static void y(w1.u uVar, int i10, int i11, int i12, int i13, String str, d dVar) {
        uVar.T(i11 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        com.google.common.collect.c0 c0VarD = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                uVar.l(bArr, 0, i14);
                c0VarD = com.google.common.collect.c0.D(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f40843d = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        dVar.f40841b = new t1.o.b().Z(i13).o0(str2).e0(str).s0(j10).b0(c0VarD).K();
    }

    private static g z(w1.u uVar) {
        long j10;
        uVar.T(8);
        int iC = i3.a.c(uVar.p());
        uVar.U(iC == 0 ? 8 : 16);
        int iP = uVar.p();
        uVar.U(4);
        int iF = uVar.f();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = C.TIME_UNSET;
            if (i12 >= i10) {
                uVar.U(i10);
                break;
            }
            if (uVar.e()[iF + i12] != -1) {
                long jI = iC == 0 ? uVar.I() : uVar.L();
                if (jI == 0) {
                    break;
                }
                j10 = jI;
                break;
            }
            i12++;
        }
        uVar.U(16);
        int iP2 = uVar.p();
        int iP3 = uVar.p();
        uVar.U(4);
        int iP4 = uVar.p();
        int iP5 = uVar.p();
        if (iP2 == 0 && iP3 == 65536 && iP4 == -65536 && iP5 == 0) {
            i11 = 90;
        } else if (iP2 == 0 && iP3 == -65536 && iP4 == 65536 && iP5 == 0) {
            i11 = 270;
        } else if (iP2 == -65536 && iP3 == 0 && iP4 == 0 && iP5 == -65536) {
            i11 = 180;
        }
        return new g(iP, j10, i11);
    }
}
