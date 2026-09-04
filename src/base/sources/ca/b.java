package ca;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ob.d0;
import ob.r0;
import ob.u;
import ob.y;
import re.xQrM.UoyZyZEcGYBpIg;
import u9.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f9694a = r0.q0("OpusHead");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f9699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f9700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d0 f9701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9703i;

        public a(d0 d0Var, d0 d0Var2, boolean z10) throws ParserException {
            this.f9701g = d0Var;
            this.f9700f = d0Var2;
            this.f9699e = z10;
            d0Var2.U(12);
            this.f9695a = d0Var2.L();
            d0Var.U(12);
            this.f9703i = d0Var.L();
            u9.n.a(d0Var.q() == 1, "first_chunk must be 1");
            this.f9696b = -1;
        }

        public boolean a() {
            int i10 = this.f9696b + 1;
            this.f9696b = i10;
            if (i10 == this.f9695a) {
                return false;
            }
            this.f9698d = this.f9699e ? this.f9700f.M() : this.f9700f.J();
            if (this.f9696b == this.f9702h) {
                this.f9697c = this.f9701g.L();
                this.f9701g.V(4);
                int i11 = this.f9703i - 1;
                this.f9703i = i11;
                this.f9702h = i11 > 0 ? this.f9701g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ca.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0133b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f9705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f9706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f9707d;

        public C0133b(String str, byte[] bArr, long j10, long j11) {
            this.f9704a = str;
            this.f9705b = bArr;
            this.f9706c = j10;
            this.f9707d = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ha.a f9708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9709b;

        public c(ha.a aVar, long j10) {
            this.f9708a = aVar;
            this.f9709b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface d {
        int a();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f9710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v0 f9711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9713d = 0;

        public e(int i10) {
            this.f9710a = new p[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0 f9716c;

        public f(ca.a.b bVar, v0 v0Var) {
            d0 d0Var = bVar.f9693b;
            this.f9716c = d0Var;
            d0Var.U(12);
            int iL = d0Var.L();
            if (MimeTypes.AUDIO_RAW.equals(v0Var.f18868l)) {
                int iH0 = r0.h0(v0Var.A, v0Var.f18881y);
                if (iL == 0 || iL % iH0 != 0) {
                    u.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iH0 + ", stsz sample size: " + iL);
                    iL = iH0;
                }
            }
            this.f9714a = iL == 0 ? -1 : iL;
            this.f9715b = d0Var.L();
        }

        @Override // ca.b.d
        public int a() {
            return this.f9714a;
        }

        @Override // ca.b.d
        public int getSampleCount() {
            return this.f9715b;
        }

        @Override // ca.b.d
        public int readNextSampleSize() {
            int i10 = this.f9714a;
            return i10 == -1 ? this.f9716c.L() : i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f9717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9721e;

        public g(ca.a.b bVar) {
            d0 d0Var = bVar.f9693b;
            this.f9717a = d0Var;
            d0Var.U(12);
            this.f9719c = d0Var.L() & 255;
            this.f9718b = d0Var.L();
        }

        @Override // ca.b.d
        public int a() {
            return -1;
        }

        @Override // ca.b.d
        public int getSampleCount() {
            return this.f9718b;
        }

        @Override // ca.b.d
        public int readNextSampleSize() {
            int i10 = this.f9719c;
            if (i10 == 8) {
                return this.f9717a.H();
            }
            if (i10 == 16) {
                return this.f9717a.N();
            }
            int i11 = this.f9720d;
            this.f9720d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f9721e & 15;
            }
            int iH = this.f9717a.H();
            this.f9721e = iH;
            return (iH & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f9723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9724c;

        public h(int i10, long j10, int i11) {
            this.f9722a = i10;
            this.f9723b = j10;
            this.f9724c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ha.a f9725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ha.a f9726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ha.a f9727c;

        public i(ha.a aVar, ha.a aVar2, ha.a aVar3) {
            this.f9725a = aVar;
            this.f9726b = aVar2;
            this.f9727c = aVar3;
        }
    }

    private static o A(ca.a.C0132a c0132a, ca.a.b bVar, long j10, com.google.android.exoplayer2.drm.h hVar, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        ca.a.C0132a c0132aF;
        Pair pairI;
        ca.a.C0132a c0132a2 = (ca.a.C0132a) ob.a.e(c0132a.f(1835297121));
        int iE = e(l(((ca.a.b) ob.a.e(c0132a2.g(1751411826))).f9693b));
        if (iE == -1) {
            return null;
        }
        h hVarZ = z(((ca.a.b) ob.a.e(c0132a.g(1953196132))).f9693b);
        long jU0 = C.TIME_UNSET;
        long j11 = j10 == C.TIME_UNSET ? hVarZ.f9723b : j10;
        long j12 = q(bVar.f9693b).f9709b;
        if (j11 != C.TIME_UNSET) {
            jU0 = r0.U0(j11, 1000000L, j12);
        }
        long j13 = jU0;
        ca.a.C0132a c0132a3 = (ca.a.C0132a) ob.a.e(((ca.a.C0132a) ob.a.e(c0132a2.f(1835626086))).f(1937007212));
        Pair pairN = n(((ca.a.b) ob.a.e(c0132a2.g(1835296868))).f9693b);
        ca.a.b bVarG = c0132a3.g(1937011556);
        if (bVarG == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        e eVarX = x(bVarG.f9693b, hVarZ.f9722a, hVarZ.f9724c, (String) pairN.second, hVar, z11);
        if (z10 || (c0132aF = c0132a.f(1701082227)) == null || (pairI = i(c0132aF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairI.first;
            jArr2 = (long[]) pairI.second;
            jArr = jArr3;
        }
        if (eVarX.f9711b == null) {
            return null;
        }
        return new o(hVarZ.f9722a, iE, ((Long) pairN.first).longValue(), j12, j13, eVarX.f9711b, eVarX.f9713d, eVarX.f9710a, eVarX.f9712c, jArr, jArr2);
    }

    public static List B(ca.a.C0132a c0132a, v vVar, long j10, com.google.android.exoplayer2.drm.h hVar, boolean z10, boolean z11, sc.g gVar) {
        o oVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0132a.f9692d.size(); i10++) {
            ca.a.C0132a c0132a2 = (ca.a.C0132a) c0132a.f9692d.get(i10);
            if (c0132a2.f9689a == 1953653099 && (oVar = (o) gVar.apply(A(c0132a2, (ca.a.b) ob.a.e(c0132a.g(1836476516)), j10, hVar, z10, z11))) != null) {
                arrayList.add(w(oVar, (ca.a.C0132a) ob.a.e(((ca.a.C0132a) ob.a.e(((ca.a.C0132a) ob.a.e(c0132a2.f(1835297121))).f(1835626086))).f(1937007212)), vVar));
            }
        }
        return arrayList;
    }

    public static i C(ca.a.b bVar) {
        d0 d0Var = bVar.f9693b;
        d0Var.U(8);
        ha.a aVarD = null;
        ha.a aVarV = null;
        ha.a aVarF = null;
        while (d0Var.a() >= 8) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1835365473) {
                d0Var.U(iF);
                aVarD = D(d0Var, iF + iQ);
            } else if (iQ2 == 1936553057) {
                d0Var.U(iF);
                aVarV = v(d0Var, iF + iQ);
            } else if (iQ2 == -1451722374) {
                aVarF = F(d0Var);
            }
            d0Var.U(iF + iQ);
        }
        return new i(aVarD, aVarV, aVarF);
    }

    private static ha.a D(d0 d0Var, int i10) {
        d0Var.V(8);
        f(d0Var);
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1768715124) {
                d0Var.U(iF);
                return m(d0Var, iF + iQ);
            }
            d0Var.U(iF + iQ);
        }
        return null;
    }

    private static void E(d0 d0Var, int i10, int i11, int i12, int i13, int i14, com.google.android.exoplayer2.drm.h hVar, e eVar, int i15) throws ParserException {
        String str;
        int i16;
        float f10;
        List list;
        int i17;
        int i18;
        String str2;
        int i19;
        int i20;
        int i21;
        String str3;
        int i22 = i11;
        int i23 = i12;
        com.google.android.exoplayer2.drm.h hVarC = hVar;
        e eVar2 = eVar;
        d0Var.U(i22 + 16);
        d0Var.V(16);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        d0Var.V(50);
        int iF = d0Var.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairT = t(d0Var, i22, i23);
            if (pairT != null) {
                iIntValue = ((Integer) pairT.first).intValue();
                hVarC = hVarC == null ? null : hVarC.c(((p) pairT.second).f9835b);
                eVar2.f9710a[i15] = (p) pairT.second;
            }
            d0Var.U(iF);
        }
        String str4 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float fR = 1.0f;
        String str5 = null;
        List listD = null;
        byte[] bArrS = null;
        int i24 = -1;
        int iH = -1;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBufferA = null;
        C0133b c0133bJ = null;
        boolean z10 = false;
        while (iF - i22 < i23) {
            d0Var.U(iF);
            int iF2 = d0Var.f();
            int iQ = d0Var.q();
            if (iQ == 0 && d0Var.f() - i11 == i23) {
                break;
            }
            u9.n.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = d0Var.q();
            if (iQ2 == 1635148611) {
                u9.n.a(str == null, null);
                d0Var.U(iF2 + 8);
                pb.a aVarB = pb.a.b(d0Var);
                listD = aVarB.f49814a;
                eVar2.f9712c = aVarB.f49815b;
                if (!z10) {
                    fR = aVarB.f49821h;
                }
                str5 = aVarB.f49822i;
                i19 = aVarB.f49818e;
                i20 = aVarB.f49819f;
                i21 = aVarB.f49820g;
                str3 = MimeTypes.VIDEO_H264;
            } else {
                if (iQ2 == 1752589123) {
                    u9.n.a(str == null, null);
                    d0Var.U(iF2 + 8);
                    pb.f fVarA = pb.f.a(d0Var);
                    listD = fVarA.f49856a;
                    eVar2.f9712c = fVarA.f49857b;
                    if (!z10) {
                        fR = fVarA.f49863h;
                    }
                    str5 = fVarA.f49864i;
                    i19 = fVarA.f49860e;
                    i20 = fVarA.f49861f;
                    i21 = fVarA.f49862g;
                    str3 = MimeTypes.VIDEO_H265;
                } else {
                    if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                        hVarC = hVarC;
                        i16 = iF;
                        iIntValue = iIntValue;
                        str4 = str4;
                        f10 = fR;
                        list = listD;
                        i17 = iH;
                        i18 = i26;
                        pb.d dVarA = pb.d.a(d0Var);
                        if (dVarA != null) {
                            str5 = dVarA.f49841c;
                            str = "video/dolby-vision";
                        }
                    } else {
                        i16 = iF;
                        if (iQ2 == 1987076931) {
                            u9.n.a(str == null, null);
                            str2 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                            d0Var.U(iF2 + 12);
                            d0Var.V(2);
                            boolean z11 = (d0Var.H() & 1) != 0;
                            int iH2 = d0Var.H();
                            int iH3 = d0Var.H();
                            iH = pb.c.h(iH2);
                            i25 = z11 ? 1 : 2;
                            i26 = pb.c.i(iH3);
                        } else if (iQ2 == 1635135811) {
                            u9.n.a(str == null, null);
                            str2 = "video/av01";
                        } else if (iQ2 == 1668050025) {
                            if (byteBufferA == null) {
                                byteBufferA = a();
                            }
                            ByteBuffer byteBuffer = byteBufferA;
                            byteBuffer.position(21);
                            byteBuffer.putShort(d0Var.D());
                            byteBuffer.putShort(d0Var.D());
                            byteBufferA = byteBuffer;
                        } else if (iQ2 == 1835295606) {
                            if (byteBufferA == null) {
                                byteBufferA = a();
                            }
                            ByteBuffer byteBuffer2 = byteBufferA;
                            short sD = d0Var.D();
                            short sD2 = d0Var.D();
                            short sD3 = d0Var.D();
                            short sD4 = d0Var.D();
                            short sD5 = d0Var.D();
                            short sD6 = d0Var.D();
                            short sD7 = d0Var.D();
                            List list2 = listD;
                            short sD8 = d0Var.D();
                            long J = d0Var.J();
                            long J2 = d0Var.J();
                            byteBuffer2.position(1);
                            byteBuffer2.putShort(sD5);
                            byteBuffer2.putShort(sD6);
                            byteBuffer2.putShort(sD);
                            byteBuffer2.putShort(sD2);
                            byteBuffer2.putShort(sD3);
                            byteBuffer2.putShort(sD4);
                            byteBuffer2.putShort(sD7);
                            byteBuffer2.putShort(sD8);
                            byteBuffer2.putShort((short) (J / 10000));
                            byteBuffer2.putShort((short) (J2 / 10000));
                            byteBufferA = byteBuffer2;
                            listD = list2;
                            fR = fR;
                        } else {
                            hVarC = hVarC;
                            iIntValue = iIntValue;
                            str4 = str4;
                            f10 = fR;
                            list = listD;
                            if (iQ2 == 1681012275) {
                                u9.n.a(str == null, null);
                                str = str4;
                            } else if (iQ2 == 1702061171) {
                                u9.n.a(str == null, null);
                                c0133bJ = j(d0Var, iF2);
                                String str6 = c0133bJ.f9704a;
                                byte[] bArr = c0133bJ.f9705b;
                                listD = bArr != null ? c0.D(bArr) : list;
                                str = str6;
                                fR = f10;
                            } else if (iQ2 == 1885434736) {
                                fR = r(d0Var, iF2);
                                listD = list;
                                z10 = true;
                            } else if (iQ2 == 1937126244) {
                                bArrS = s(d0Var, iF2, iQ);
                            } else if (iQ2 == 1936995172) {
                                int iH4 = d0Var.H();
                                d0Var.V(3);
                                if (iH4 == 0) {
                                    int iH5 = d0Var.H();
                                    if (iH5 == 0) {
                                        i24 = 0;
                                    } else if (iH5 == 1) {
                                        i24 = 1;
                                    } else if (iH5 == 2) {
                                        i24 = 2;
                                    } else if (iH5 == 3) {
                                        i24 = 3;
                                    }
                                }
                            } else {
                                i17 = iH;
                                if (iQ2 == 1668246642) {
                                    i18 = i26;
                                    if (i17 == -1 && i18 == -1) {
                                        int iQ3 = d0Var.q();
                                        if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                            int iN3 = d0Var.N();
                                            int iN4 = d0Var.N();
                                            d0Var.V(2);
                                            boolean z12 = iQ == 19 && (d0Var.H() & 128) != 0;
                                            iH = pb.c.h(iN3);
                                            i25 = z12 ? 1 : 2;
                                            i26 = pb.c.i(iN4);
                                        } else {
                                            u.i("AtomParsers", "Unsupported color type: " + ca.a.a(iQ3));
                                        }
                                    }
                                } else {
                                    i18 = i26;
                                }
                            }
                            listD = list;
                            fR = f10;
                        }
                        str = str2;
                    }
                    i26 = i18;
                    iH = i17;
                    listD = list;
                    fR = f10;
                }
                iF = i16 + iQ;
                i22 = i11;
                i23 = i12;
                eVar2 = eVar;
                iIntValue = iIntValue;
                str4 = str4;
                hVarC = hVarC;
            }
            i26 = i21;
            iH = i19;
            i16 = iF;
            i25 = i20;
            str = str3;
            iF = i16 + iQ;
            i22 = i11;
            i23 = i12;
            eVar2 = eVar;
            iIntValue = iIntValue;
            str4 = str4;
            hVarC = hVarC;
        }
        com.google.android.exoplayer2.drm.h hVar2 = hVarC;
        float f11 = fR;
        List list3 = listD;
        int i27 = iH;
        int i28 = i26;
        if (str == null) {
            return;
        }
        v0.b bVarO = new v0.b().T(i13).g0(str).K(str5).n0(iN).S(iN2).c0(f11).f0(i14).d0(bArrS).j0(i24).V(list3).O(hVar2);
        int i29 = i25;
        if (i27 != -1 || i29 != -1 || i28 != -1 || byteBufferA != null) {
            bVarO.L(new pb.c(i27, i29, i28, byteBufferA != null ? byteBufferA.array() : null));
        }
        if (c0133bJ != null) {
            bVarO.I(com.google.common.primitives.g.m(c0133bJ.f9706c)).b0(com.google.common.primitives.g.m(c0133bJ.f9707d));
        }
        eVar.f9711b = bVarO.G();
    }

    private static ha.a F(d0 d0Var) {
        short sD = d0Var.D();
        d0Var.V(2);
        String strE = d0Var.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new ha.a(new r9.b(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[r0.q(4, 0, length)] && jArr[r0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static boolean c(int i10) {
        return i10 != 1;
    }

    private static int d(d0 d0Var, int i10, int i11, int i12) throws ParserException {
        int iF = d0Var.f();
        u9.n.a(iF >= i11, null);
        while (iF - i11 < i12) {
            d0Var.U(iF);
            int iQ = d0Var.q();
            u9.n.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == i10) {
                return iF;
            }
            iF += iQ;
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

    public static void f(d0 d0Var) {
        int iF = d0Var.f();
        d0Var.V(4);
        if (d0Var.q() != 1751411826) {
            iF += 4;
        }
        d0Var.U(iF);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:102:0x0177  */
    /* JADX WARN: Code duplicated, block: B:105:0x0186  */
    /* JADX WARN: Code duplicated, block: B:108:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:173:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x016b  */
    private static void g(d0 d0Var, int i10, int i11, int i12, int i13, String str, boolean z10, com.google.android.exoplayer2.drm.h hVar, e eVar, int i14) throws ParserException {
        int iN;
        int I;
        int iQ;
        int iL;
        String str2;
        String str3;
        int i15;
        String str4;
        C0133b c0133bJ;
        String str5;
        List listD;
        int iQ2;
        boolean z11;
        int iQ3;
        int iD;
        byte[] bArr;
        boolean z12;
        int i16 = i11;
        int i17 = i12;
        com.google.android.exoplayer2.drm.h hVarC = hVar;
        d0Var.U(i16 + 16);
        if (z10) {
            iN = d0Var.N();
            d0Var.V(6);
        } else {
            d0Var.V(8);
            iN = 0;
        }
        if (iN == 0 || iN == 1) {
            int iN2 = d0Var.N();
            d0Var.V(6);
            I = d0Var.I();
            d0Var.U(d0Var.f() - 4);
            iQ = d0Var.q();
            if (iN == 1) {
                d0Var.V(16);
            }
            iL = iN2;
        } else {
            if (iN != 2) {
                return;
            }
            d0Var.V(16);
            I = (int) Math.round(d0Var.o());
            iL = d0Var.L();
            d0Var.V(20);
            iQ = 0;
        }
        int iF = d0Var.f();
        int iIntValue = i10;
        if (iIntValue == 1701733217) {
            Pair pairT = t(d0Var, i16, i17);
            if (pairT != null) {
                iIntValue = ((Integer) pairT.first).intValue();
                hVarC = hVarC == null ? null : hVarC.c(((p) pairT.second).f9835b);
                eVar.f9710a[i14] = (p) pairT.second;
            }
            d0Var.U(iF);
        }
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
            str2 = UoyZyZEcGYBpIg.hYRdGKfprE;
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                str3 = MimeTypes.AUDIO_RAW;
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i15 = 2;
                } else if (iIntValue == 1953984371) {
                    i15 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str2 = "audio/mhm1";
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
                    i15 = -1;
                    str3 = null;
                }
                str4 = str3;
                c0133bJ = null;
                str5 = null;
                listD = null;
                while (iF - i16 < i17) {
                    d0Var.U(iF);
                    iQ2 = d0Var.q();
                    if (iQ2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u9.n.a(z11, "childAtomSize must be positive");
                    iQ3 = d0Var.q();
                    if (iQ3 == 1835557187) {
                        int i18 = iQ2 - 13;
                        byte[] bArr2 = new byte[i18];
                        d0Var.U(iF + 13);
                        d0Var.l(bArr2, 0, i18);
                        listD = c0.D(bArr2);
                    } else {
                        if (iQ3 != 1702061171 || (z10 && iQ3 == 2002876005)) {
                            if (iQ3 == 1702061171) {
                                iD = iF;
                            } else {
                                iD = d(d0Var, 1702061171, iF, iQ2);
                            }
                            if (iD != -1) {
                                c0133bJ = j(d0Var, iD);
                                str4 = c0133bJ.f9704a;
                                bArr = c0133bJ.f9705b;
                                if (bArr != null) {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        q9.a.b bVarF = q9.a.f(bArr);
                                        I = bVarF.f50439a;
                                        iL = bVarF.f50440b;
                                        str5 = bVarF.f50441c;
                                    }
                                    listD = c0.D(bArr);
                                }
                            }
                        } else {
                            if (iQ3 == 1684103987) {
                                d0Var.U(iF + 8);
                                eVar.f9711b = q9.b.d(d0Var, Integer.toString(i13), str, hVarC);
                            } else if (iQ3 == 1684366131) {
                                d0Var.U(iF + 8);
                                eVar.f9711b = q9.b.h(d0Var, Integer.toString(i13), str, hVarC);
                            } else if (iQ3 == 1684103988) {
                                d0Var.U(iF + 8);
                                eVar.f9711b = q9.c.b(d0Var, Integer.toString(i13), str, hVarC);
                            } else if (iQ3 == 1684892784) {
                                if (iQ <= 0) {
                                    throw ParserException.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iQ, null);
                                }
                                I = iQ;
                                iL = 2;
                            } else if (iQ3 == 1684305011 || iQ3 == 1969517683) {
                                z12 = false;
                                eVar.f9711b = new v0.b().T(i13).g0(str4).J(iL).h0(I).O(hVarC).X(str).G();
                            } else if (iQ3 == 1682927731) {
                                int i19 = iQ2 - 8;
                                byte[] bArr3 = f9694a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i19);
                                d0Var.U(iF + 8);
                                d0Var.l(bArrCopyOf, bArr3.length, i19);
                                listD = q9.v.a(bArrCopyOf);
                            } else if (iQ3 == 1684425825) {
                                byte[] bArr4 = new byte[iQ2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                d0Var.U(iF + 12);
                                d0Var.l(bArr4, 4, iQ2 - 12);
                                listD = c0.D(bArr4);
                            } else if (iQ3 == 1634492771) {
                                int i20 = iQ2 - 12;
                                byte[] bArr5 = new byte[i20];
                                d0Var.U(iF + 12);
                                d0Var.l(bArr5, 0, i20);
                                Pair pairH = ob.e.h(bArr5);
                                int iIntValue2 = ((Integer) pairH.first).intValue();
                                int iIntValue3 = ((Integer) pairH.second).intValue();
                                listD = c0.D(bArr5);
                                I = iIntValue2;
                                iL = iIntValue3;
                            } else {
                                z12 = false;
                            }
                            z12 = false;
                        }
                        iF += iQ2;
                        i16 = i11;
                        i17 = i12;
                    }
                    iF += iQ2;
                    i16 = i11;
                    i17 = i12;
                }
                if (eVar.f9711b == null || str4 == null) {
                }
                v0.b bVarX = new v0.b().T(i13).g0(str4).K(str5).J(iL).h0(I).a0(i15).V(listD).O(hVarC).X(str);
                if (c0133bJ != null) {
                    bVarX.I(com.google.common.primitives.g.m(c0133bJ.f9706c)).b0(com.google.common.primitives.g.m(c0133bJ.f9707d));
                }
                eVar.f9711b = bVarX.G();
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i15 = -1;
        str4 = str3;
        c0133bJ = null;
        str5 = null;
        listD = null;
        while (iF - i16 < i17) {
            d0Var.U(iF);
            iQ2 = d0Var.q();
            if (iQ2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u9.n.a(z11, "childAtomSize must be positive");
            iQ3 = d0Var.q();
            if (iQ3 == 1835557187) {
                int i110 = iQ2 - 13;
                byte[] bArr6 = new byte[i110];
                d0Var.U(iF + 13);
                d0Var.l(bArr6, 0, i110);
                listD = c0.D(bArr6);
            } else {
                if (iQ3 != 1702061171) {
                    if (iQ3 == 1702061171) {
                        iD = iF;
                    } else {
                        iD = d(d0Var, 1702061171, iF, iQ2);
                    }
                    if (iD != -1) {
                        c0133bJ = j(d0Var, iD);
                        str4 = c0133bJ.f9704a;
                        bArr = c0133bJ.f9705b;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                q9.a.b bVarF2 = q9.a.f(bArr);
                                I = bVarF2.f50439a;
                                iL = bVarF2.f50440b;
                                str5 = bVarF2.f50441c;
                            }
                            listD = c0.D(bArr);
                        }
                    }
                } else {
                    if (iQ3 == 1702061171) {
                        iD = iF;
                    } else {
                        iD = d(d0Var, 1702061171, iF, iQ2);
                    }
                    if (iD != -1) {
                        c0133bJ = j(d0Var, iD);
                        str4 = c0133bJ.f9704a;
                        bArr = c0133bJ.f9705b;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                q9.a.b bVarF3 = q9.a.f(bArr);
                                I = bVarF3.f50439a;
                                iL = bVarF3.f50440b;
                                str5 = bVarF3.f50441c;
                            }
                            listD = c0.D(bArr);
                        }
                    }
                }
                iF += iQ2;
                i16 = i11;
                i17 = i12;
            }
            iF += iQ2;
            i16 = i11;
            i17 = i12;
        }
        if (eVar.f9711b == null) {
        }
    }

    static Pair h(d0 d0Var, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            d0Var.U(i12);
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(d0Var.q());
            } else if (iQ2 == 1935894637) {
                d0Var.V(4);
                strE = d0Var.E(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!C.CENC_TYPE_cenc.equals(strE) && !C.CENC_TYPE_cbc1.equals(strE) && !C.CENC_TYPE_cens.equals(strE) && !C.CENC_TYPE_cbcs.equals(strE)) {
            return null;
        }
        u9.n.a(numValueOf != null, "frma atom is mandatory");
        u9.n.a(i13 != -1, "schi atom is mandatory");
        p pVarU = u(d0Var, i13, i14, strE);
        u9.n.a(pVarU != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (p) r0.j(pVarU));
    }

    private static Pair i(ca.a.C0132a c0132a) {
        ca.a.b bVarG = c0132a.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        d0 d0Var = bVarG.f9693b;
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        int iL = d0Var.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            jArr[i10] = iC == 1 ? d0Var.M() : d0Var.J();
            jArr2[i10] = iC == 1 ? d0Var.A() : d0Var.q();
            if (d0Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            d0Var.V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0133b j(d0 d0Var, int i10) {
        d0Var.U(i10 + 12);
        d0Var.V(1);
        k(d0Var);
        d0Var.V(2);
        int iH = d0Var.H();
        if ((iH & 128) != 0) {
            d0Var.V(2);
        }
        if ((iH & 64) != 0) {
            d0Var.V(d0Var.H());
        }
        if ((iH & 32) != 0) {
            d0Var.V(2);
        }
        d0Var.V(1);
        k(d0Var);
        String strH = y.h(d0Var.H());
        if (MimeTypes.AUDIO_MPEG.equals(strH) || MimeTypes.AUDIO_DTS.equals(strH) || MimeTypes.AUDIO_DTS_HD.equals(strH)) {
            return new C0133b(strH, null, -1L, -1L);
        }
        d0Var.V(4);
        long J = d0Var.J();
        long J2 = d0Var.J();
        d0Var.V(1);
        int iK = k(d0Var);
        long j10 = J2;
        byte[] bArr = new byte[iK];
        d0Var.l(bArr, 0, iK);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new C0133b(strH, bArr, j10, J > 0 ? J : -1L);
    }

    private static int k(d0 d0Var) {
        int iH = d0Var.H();
        int i10 = iH & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((iH & 128) == 128) {
            iH = d0Var.H();
            i10 = (i10 << 7) | (iH & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i10;
    }

    private static int l(d0 d0Var) {
        d0Var.U(16);
        return d0Var.q();
    }

    private static ha.a m(d0 d0Var, int i10) {
        d0Var.V(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var.f() < i10) {
            ha.a.b bVarC = ca.h.c(d0Var);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ha.a(arrayList);
    }

    private static Pair n(d0 d0Var) {
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        d0Var.V(iC == 0 ? 8 : 16);
        long J = d0Var.J();
        d0Var.V(iC == 0 ? 4 : 8);
        int iN = d0Var.N();
        return Pair.create(Long.valueOf(J), "" + ((char) (((iN >> 10) & 31) + 96)) + ((char) (((iN >> 5) & 31) + 96)) + ((char) ((iN & 31) + 96)));
    }

    public static ha.a o(ca.a.C0132a c0132a) {
        ca.a.b bVarG = c0132a.g(1751411826);
        ca.a.b bVarG2 = c0132a.g(1801812339);
        ca.a.b bVarG3 = c0132a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || l(bVarG.f9693b) != 1835299937) {
            return null;
        }
        d0 d0Var = bVarG2.f9693b;
        d0Var.U(12);
        int iQ = d0Var.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = d0Var.q();
            d0Var.V(4);
            strArr[i10] = d0Var.E(iQ2 - 8);
        }
        d0 d0Var2 = bVarG3.f9693b;
        d0Var2.U(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var2.a() > 8) {
            int iF = d0Var2.f();
            int iQ3 = d0Var2.q();
            int iQ4 = d0Var2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                u.i("AtomParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                na.a aVarF = ca.h.f(d0Var2, iF + iQ3, strArr[iQ4]);
                if (aVarF != null) {
                    arrayList.add(aVarF);
                }
            }
            d0Var2.U(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ha.a(arrayList);
    }

    private static void p(d0 d0Var, int i10, int i11, int i12, e eVar) {
        d0Var.U(i11 + 16);
        if (i10 == 1835365492) {
            d0Var.B();
            String strB = d0Var.B();
            if (strB != null) {
                eVar.f9711b = new v0.b().T(i12).g0(strB).G();
            }
        }
    }

    public static c q(d0 d0Var) {
        long J;
        d0Var.U(8);
        if (ca.a.c(d0Var.q()) == 0) {
            J = d0Var.J();
            d0Var.V(4);
        } else {
            long jA = d0Var.A();
            d0Var.V(8);
            J = jA;
        }
        return new c(new ha.a(new r9.a((J - ((long) 2082844800)) * 1000)), d0Var.J());
    }

    private static float r(d0 d0Var, int i10) {
        d0Var.U(i10 + 8);
        return d0Var.L() / d0Var.L();
    }

    private static byte[] s(d0 d0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            d0Var.U(i12);
            int iQ = d0Var.q();
            if (d0Var.q() == 1886547818) {
                return Arrays.copyOfRange(d0Var.e(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static Pair t(d0 d0Var, int i10, int i11) throws ParserException {
        Pair pairH;
        int iF = d0Var.f();
        while (iF - i10 < i11) {
            d0Var.U(iF);
            int iQ = d0Var.q();
            u9.n.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == 1936289382 && (pairH = h(d0Var, iF, iQ)) != null) {
                return pairH;
            }
            iF += iQ;
        }
        return null;
    }

    private static p u(d0 d0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            d0Var.U(i14);
            int iQ = d0Var.q();
            if (d0Var.q() == 1952804451) {
                int iC = ca.a.c(d0Var.q());
                d0Var.V(1);
                if (iC == 0) {
                    d0Var.V(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = d0Var.H();
                    i12 = iH & 15;
                    i13 = (iH & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z10 = d0Var.H() == 1;
                int iH2 = d0Var.H();
                byte[] bArr2 = new byte[16];
                d0Var.l(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = d0Var.H();
                    bArr = new byte[iH3];
                    d0Var.l(bArr, 0, iH3);
                }
                return new p(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }

    private static ha.a v(d0 d0Var, int i10) {
        d0Var.V(12);
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1935766900) {
                if (iQ < 14) {
                    return null;
                }
                d0Var.V(5);
                int iH = d0Var.H();
                if (iH != 12 && iH != 13) {
                    return null;
                }
                float f10 = iH == 12 ? 240.0f : 120.0f;
                d0Var.V(1);
                return new ha.a(new na.e(f10, d0Var.H()));
            }
            d0Var.U(iF + iQ);
        }
        return null;
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
    private static r w(o oVar, ca.a.C0132a c0132a, v vVar) throws ParserException {
        d gVar;
        boolean z10;
        int iL;
        int iL2;
        int iL3;
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
        ca.a.b bVarG = c0132a.g(1937011578);
        if (bVarG != null) {
            gVar = new f(bVarG, oVar.f9828f);
        } else {
            ca.a.b bVarG2 = c0132a.g(1937013298);
            if (bVarG2 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            gVar = new g(bVarG2);
        }
        int sampleCount = gVar.getSampleCount();
        if (sampleCount == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        ca.a.b bVarG3 = c0132a.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = (ca.a.b) ob.a.e(c0132a.g(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        d0 d0Var = bVarG3.f9693b;
        d0 d0Var2 = ((ca.a.b) ob.a.e(c0132a.g(1937011555))).f9693b;
        d0 d0Var3 = ((ca.a.b) ob.a.e(c0132a.g(1937011827))).f9693b;
        ca.a.b bVarG4 = c0132a.g(1937011571);
        d0 d0Var4 = bVarG4 != null ? bVarG4.f9693b : null;
        ca.a.b bVarG5 = c0132a.g(1668576371);
        d0 d0Var5 = bVarG5 != null ? bVarG5.f9693b : null;
        a aVar = new a(d0Var2, d0Var, z10);
        d0Var3.U(12);
        int iL4 = d0Var3.L() - 1;
        int iL5 = d0Var3.L();
        int iL6 = d0Var3.L();
        if (d0Var5 != null) {
            d0Var5.U(12);
            iL = d0Var5.L();
        } else {
            iL = 0;
        }
        if (d0Var4 != null) {
            d0Var4.U(12);
            iL3 = d0Var4.L();
            if (iL3 > 0) {
                iL2 = d0Var4.L() - 1;
                z11 = false;
            } else {
                iL2 = -1;
                z11 = false;
                d0Var4 = null;
            }
        } else {
            iL2 = -1;
            iL3 = 0;
            z11 = false;
        }
        int iA = gVar.a();
        String str = oVar.f9828f.f18868l;
        boolean z14 = (iA == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && iL4 == 0 && iL == 0 && iL3 == 0)) ? z11 ? 1 : 0 : true;
        d dVar = gVar;
        if (z14) {
            int i15 = aVar.f9695a;
            long[] jArr2 = new long[i15];
            int[] iArr8 = new int[i15];
            while (aVar.a()) {
                int i16 = aVar.f9696b;
                jArr2[i16] = aVar.f9698d;
                iArr8[i16] = aVar.f9697c;
            }
            ca.d.b bVarA = ca.d.a(iA, jArr2, iArr8, iL6);
            long[] jArr3 = bVarA.f9732a;
            iArr = bVarA.f9733b;
            int i17 = bVarA.f9734c;
            long[] jArr4 = bVarA.f9735d;
            int[] iArr9 = bVarA.f9736e;
            j11 = bVarA.f9737f;
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
            d0 d0Var6 = d0Var5;
            int[] iArrCopyOf2 = new int[sampleCount];
            d0 d0Var7 = d0Var4;
            int iL7 = iL2;
            int i18 = z11 ? 1 : 0;
            int iQ = i18;
            int i19 = iQ == true ? 1 : 0;
            int i20 = i19;
            long j13 = 0;
            long j14 = 0;
            int i21 = iL;
            int iQ2 = iL6;
            int i22 = iL5;
            int i23 = iL4;
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
                    long j16 = aVar.f9698d;
                    i25 = aVar.f9697c;
                    j15 = j16;
                    i22 = i26;
                    iQ2 = iQ2;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i27 = sampleCount;
                i10 = i22;
                int i28 = iQ2;
                if (!zA) {
                    u.i("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i18);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i18;
                    i11 = i25;
                    break;
                }
                if (d0Var6 != null) {
                    int iL8 = i20 == true ? 1 : 0;
                    while (iL8 == 0 && i21 > 0) {
                        iL8 = d0Var6.L();
                        iQ = d0Var6.q();
                        i21--;
                    }
                    i20 = iL8 - 1;
                }
                jArr5[i18] = j15;
                int nextSampleSize = dVar.readNextSampleSize();
                iArrCopyOf[i18] = nextSampleSize;
                if (nextSampleSize > i24) {
                    i24 = nextSampleSize;
                }
                jArrCopyOf[i18] = j13 + ((long) iQ);
                iArrCopyOf2[i18] = d0Var7 == null ? 1 : z11 ? 1 : 0;
                if (i18 == iL7) {
                    iArrCopyOf2[i18] = 1;
                    iL3--;
                    if (iL3 > 0) {
                        iL7 = ((d0) ob.a.e(d0Var7)).L() - 1;
                    }
                }
                j13 += (long) i28;
                int iL9 = i10 - 1;
                if (iL9 != 0 || i23 <= 0) {
                    iQ2 = i28;
                } else {
                    iL9 = d0Var3.L();
                    i23--;
                    iQ2 = d0Var3.q();
                }
                i22 = iL9;
                long j17 = j15 + ((long) iArrCopyOf[i18]);
                i19 = i25 - 1;
                i18++;
                j14 = j17;
                sampleCount = i27 == true ? 1 : 0;
            }
            j11 = j13 + ((long) iQ);
            if (d0Var6 == null) {
                z12 = true;
                break;
            }
            while (true) {
                if (i21 <= 0) {
                    z12 = true;
                    break;
                }
                if (d0Var6.L() != 0) {
                    z12 = z11 ? 1 : 0;
                    break;
                }
                d0Var6.q();
                i21--;
            }
            if (iL3 != 0 || i10 != 0 || i11 != 0 || i23 != 0 || i20 != 0 || !z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(oVar.f9823a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iL3);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i10);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i11);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i23);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i20 == true ? 1 : 0 ? 1 : 0);
                sb2.append(!z12 ? ", ctts invalid" : "");
                u.i("AtomParsers", sb2.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r10 = i24 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j18 = j11;
        long jU0 = r0.U0(j18, 1000000L, oVar.f9825c);
        long[] jArr6 = oVar.f9830h;
        if (jArr6 == null) {
            r0.W0(jArrCopyOf, 1000000L, oVar.f9825c);
            return new r(oVar, jArr, iArr, r10 == true ? 1 : 0, jArrCopyOf, iArr2, jU0);
        }
        int[] iArr10 = iArr;
        int i29 = sampleCount;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && oVar.f9824b == 1 && jArrCopyOf.length >= 2) {
            long j19 = ((long[]) ob.a.e(oVar.f9831i))[z11 ? 1 : 0];
            long jU1 = j19 + r0.U0(oVar.f9830h[z11 ? 1 : 0], oVar.f9825c, oVar.f9826d);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (b(jArr8, j18, j19, jU1)) {
                long jU2 = r0.U0(j19 - jArrCopyOf[z11 ? 1 : 0], oVar.f9828f.f18882z, oVar.f9825c);
                long jU3 = r0.U0(j18 - jU1, oVar.f9828f.f18882z, oVar.f9825c);
                if (jU2 != j10 || jU3 != j10) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j18 = j18;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j18 = j18;
                    if (jU2 <= 2147483647L && jU3 <= 2147483647L) {
                        vVar.f54326a = (int) jU2;
                        vVar.f54327b = (int) jU3;
                        r0.W0(jArrCopyOf, 1000000L, oVar.f9825c);
                        return new r(oVar, jArr7, iArr11, r10 == true ? 1 : 0, jArrCopyOf, iArr2, r0.U0(oVar.f9830h[z11 ? 1 : 0], 1000000L, oVar.f9826d));
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
        long[] jArr9 = oVar.f9830h;
        if (jArr9.length == 1 && jArr9[z11 ? 1 : 0] == j10) {
            long j20 = ((long[]) ob.a.e(oVar.f9831i))[z11 ? 1 : 0];
            for (int i30 = z11 ? 1 : 0; i30 < jArrCopyOf.length; i30++) {
                jArrCopyOf[i30] = r0.U0(jArrCopyOf[i30] - j20, 1000000L, oVar.f9825c);
            }
            return new r(oVar, jArr, iArr3, r10 == true ? 1 : 0, jArrCopyOf, iArr2, r0.U0(j18 - j20, 1000000L, oVar.f9825c));
        }
        boolean z16 = oVar.f9824b == 1 ? true : z11 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) ob.a.e(oVar.f9831i);
        int i31 = z11 ? 1 : 0;
        boolean z17 = i31 == true ? 1 : 0;
        int i32 = z17 ? 1 : 0;
        int i33 = i32;
        boolean z18 = z17;
        while (true) {
            long[] jArr11 = oVar.f9830h;
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
                long jU4 = r0.U0(j22, oVar.f9825c, oVar.f9826d);
                iArr7 = iArr14;
                iArr7[i12 == true ? 1 : 0] = r0.i(jArrCopyOf, j21, true, true);
                long j23 = j21 + jU4;
                z13 = z11;
                iArr4[i12 == true ? 1 : 0] = r0.e(jArrCopyOf, j23, z16, z13);
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
        while (r13 < oVar.f9830h.length) {
            long j25 = oVar.f9831i[r13];
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
                long jU5 = r0.U0(j24, 1000000L, oVar.f9826d);
                long jU6 = r0.U0(jArrCopyOf[i34] - j25, 1000000L, oVar.f9825c);
                int i38 = i35;
                long[] jArr16 = jArrCopyOf;
                if (c(oVar.f9824b)) {
                    j12 = j10;
                    jU6 = Math.max(j12, jU6);
                } else {
                    j12 = j10;
                }
                jArr14[r14] = jU5 + jU6;
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
            j24 += oVar.f9830h[r13];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z23 = z24;
            iArr17 = iArr18;
            r11 = i37;
            r13++;
            r12 = r14;
        }
        return new r(oVar, jArr13, iArr5, r11, jArr14, iArr16, r0.U0(j24, 1000000L, oVar.f9826d));
    }

    private static e x(d0 d0Var, int i10, int i11, String str, com.google.android.exoplayer2.drm.h hVar, boolean z10) throws ParserException {
        d0Var.U(12);
        int iQ = d0Var.q();
        e eVar = new e(iQ);
        int i12 = 0;
        while (i12 < iQ) {
            int iF = d0Var.f();
            int iQ2 = d0Var.q();
            u9.n.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = d0Var.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                e eVar2 = eVar;
                int i13 = i12;
                E(d0Var, iQ3, iF, iQ2, i10, i11, hVar, eVar2, i13);
                eVar = eVar2;
                i12 = i13;
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667) {
                e eVar3 = eVar;
                g(d0Var, iQ3, iF, iQ2, i10, str, z10, hVar, eVar3, i12);
                eVar = eVar3;
            } else if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                y(d0Var, iQ3, iF, iQ2, i10, str, eVar);
            } else if (iQ3 == 1835365492) {
                p(d0Var, iQ3, iF, i10, eVar);
            } else if (iQ3 == 1667329389) {
                eVar.f9711b = new v0.b().T(i10).g0(MimeTypes.APPLICATION_CAMERA_MOTION).G();
            }
            d0Var.U(iF + iQ2);
            i12++;
        }
        return eVar;
    }

    private static void y(d0 d0Var, int i10, int i11, int i12, int i13, String str, e eVar) {
        d0Var.U(i11 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        c0 c0VarD = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                d0Var.l(bArr, 0, i14);
                c0VarD = c0.D(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                eVar.f9713d = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        eVar.f9711b = new v0.b().T(i13).g0(str2).X(str).k0(j10).V(c0VarD).G();
    }

    private static h z(d0 d0Var) {
        long j10;
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        d0Var.V(iC == 0 ? 8 : 16);
        int iQ = d0Var.q();
        d0Var.V(4);
        int iF = d0Var.f();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = C.TIME_UNSET;
            if (i12 >= i10) {
                d0Var.V(i10);
                break;
            }
            if (d0Var.e()[iF + i12] != -1) {
                long J = iC == 0 ? d0Var.J() : d0Var.M();
                if (J == 0) {
                    break;
                }
                j10 = J;
                break;
            }
            i12++;
        }
        d0Var.V(16);
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        d0Var.V(4);
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i11 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i11 = 180;
        }
        return new h(iQ, j10, i11);
    }
}
