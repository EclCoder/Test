package o2;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f47968a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f47969b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f47970c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f47971d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f47972e = {32, 40, 48, 56, 64, 80, 96, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f47973f = {69, 87, 104, Sdk$SDKError.b.TPAT_ERROR_VALUE, 139, 174, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: o2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0739b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f47977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f47978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f47980g;

        private C0739b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f47974a = str;
            this.f47975b = i10;
            this.f47977d = i11;
            this.f47976c = i12;
            this.f47978e = i13;
            this.f47979f = i14;
            this.f47980g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((w1.c0.N(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f47969b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f47973f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f47972e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static t1.o d(w1.u uVar, String str, String str2, t1.k kVar) {
        w1.t tVar = new w1.t();
        tVar.m(uVar);
        int i10 = f47969b[tVar.h(2)];
        tVar.r(8);
        int i11 = f47971d[tVar.h(3)];
        if (tVar.h(1) != 0) {
            i11++;
        }
        int i12 = f47972e[tVar.h(5)] * 1000;
        tVar.c();
        uVar.T(tVar.d());
        return new t1.o.b().a0(str).o0(MimeTypes.AUDIO_AC3).N(i11).p0(i10).U(kVar).e0(str2).M(i12).j0(i12).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f47968a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0739b f(w1.t tVar) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = tVar.e();
        tVar.r(40);
        boolean z10 = tVar.h(5) > 10;
        tVar.p(iE);
        int i19 = -1;
        if (z10) {
            tVar.r(16);
            int iH = tVar.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            tVar.r(3);
            iC = (tVar.h(11) + 1) * 2;
            int iH2 = tVar.h(2);
            if (iH2 == 3) {
                i10 = f47970c[tVar.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = tVar.h(2);
                int i20 = f47968a[iH3];
                i14 = iH3;
                i10 = f47969b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = tVar.h(3);
            boolean zG = tVar.g();
            i11 = f47971d[iH4] + (zG ? 1 : 0);
            tVar.r(10);
            if (tVar.g()) {
                tVar.r(8);
            }
            if (iH4 == 0) {
                tVar.r(5);
                if (tVar.g()) {
                    tVar.r(8);
                }
            }
            if (i19 == 1 && tVar.g()) {
                tVar.r(16);
            }
            if (tVar.g()) {
                if (iH4 > 2) {
                    tVar.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    tVar.r(6);
                }
                if ((iH4 & 4) != 0) {
                    tVar.r(i17);
                }
                if (zG && tVar.g()) {
                    tVar.r(5);
                }
                if (i19 == 0) {
                    if (tVar.g()) {
                        i18 = 6;
                        tVar.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && tVar.g()) {
                        tVar.r(i18);
                    }
                    if (tVar.g()) {
                        tVar.r(i18);
                    }
                    int iH5 = tVar.h(2);
                    if (iH5 == 1) {
                        tVar.r(5);
                    } else if (iH5 == 2) {
                        tVar.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = tVar.h(5);
                        if (tVar.g()) {
                            tVar.r(5);
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                tVar.r(4);
                            }
                            if (tVar.g()) {
                                if (tVar.g()) {
                                    tVar.r(4);
                                }
                                if (tVar.g()) {
                                    tVar.r(4);
                                }
                            }
                        }
                        if (tVar.g()) {
                            tVar.r(5);
                            if (tVar.g()) {
                                tVar.r(7);
                                if (tVar.g()) {
                                    tVar.r(8);
                                }
                            }
                        }
                        tVar.r((iH6 + 2) * 8);
                        tVar.c();
                    }
                    if (iH4 < 2) {
                        if (tVar.g()) {
                            tVar.r(14);
                        }
                        if (iH4 == 0 && tVar.g()) {
                            tVar.r(14);
                        }
                    }
                    if (tVar.g()) {
                        if (i14 == 0) {
                            tVar.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (tVar.g()) {
                                    tVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (tVar.g()) {
                tVar.r(5);
                if (iH4 == 2) {
                    tVar.r(4);
                }
                if (iH4 >= 6) {
                    tVar.r(2);
                }
                if (tVar.g()) {
                    tVar.r(8);
                }
                if (iH4 == 0 && tVar.g()) {
                    tVar.r(8);
                }
                if (iH2 < 3) {
                    tVar.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                tVar.q();
            }
            if (i19 == 2 && (i14 == 3 || tVar.g())) {
                i16 = 6;
                tVar.r(6);
            } else {
                i16 = 6;
            }
            str = (tVar.g() && tVar.h(i16) == 1 && tVar.h(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = iA;
        } else {
            tVar.r(32);
            int iH7 = tVar.h(2);
            String str2 = iH7 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iH8 = tVar.h(6);
            int i22 = f47972e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            tVar.r(8);
            int iH9 = tVar.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                tVar.r(2);
            }
            if ((iH9 & 4) != 0) {
                tVar.r(2);
            }
            if (iH9 == 2) {
                tVar.r(2);
            }
            int[] iArr = f47969b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f47971d[iH9] + (tVar.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0739b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static t1.o h(w1.u uVar, String str, String str2, t1.k kVar) {
        String str3;
        w1.t tVar = new w1.t();
        tVar.m(uVar);
        int iH = tVar.h(13) * 1000;
        tVar.r(3);
        int i10 = f47969b[tVar.h(2)];
        tVar.r(10);
        int i11 = f47971d[tVar.h(3)];
        if (tVar.h(1) != 0) {
            i11++;
        }
        tVar.r(3);
        int iH2 = tVar.h(4);
        tVar.r(1);
        if (iH2 > 0) {
            tVar.r(6);
            if (tVar.h(1) != 0) {
                i11 += 2;
            }
            tVar.r(1);
        }
        if (tVar.b() > 7) {
            tVar.r(7);
            if (tVar.h(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        tVar.c();
        uVar.T(tVar.d());
        return new t1.o.b().a0(str).o0(str3).N(i11).p0(i10).U(kVar).e0(str2).j0(iH).K();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
