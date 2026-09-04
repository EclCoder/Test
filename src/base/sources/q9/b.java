package q9;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import ob.c0;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f50442a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50443b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f50444c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f50445d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f50446e = {32, 40, 48, 56, 64, 80, 96, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f50447f = {69, 87, 104, Sdk$SDKError.b.TPAT_ERROR_VALUE, 139, 174, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: q9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0779b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f50451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f50452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f50453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f50454g;

        private C0779b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f50448a = str;
            this.f50449b = i10;
            this.f50451d = i11;
            this.f50450c = i12;
            this.f50452e = i13;
            this.f50453f = i14;
            this.f50454g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((r0.J(byteBuffer, i10 + 4) & (-2)) == -126718022) {
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
        int[] iArr = f50443b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f50447f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f50446e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static v0 d(d0 d0Var, String str, String str2, com.google.android.exoplayer2.drm.h hVar) {
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int i10 = f50443b[c0Var.h(2)];
        c0Var.r(8);
        int i11 = f50445d[c0Var.h(3)];
        if (c0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f50446e[c0Var.h(5)] * 1000;
        c0Var.c();
        d0Var.U(c0Var.d());
        return new v0.b().U(str).g0(MimeTypes.AUDIO_AC3).J(i11).h0(i10).O(hVar).X(str2).I(i12).b0(i12).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f50442a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0779b f(c0 c0Var) {
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
        int iE = c0Var.e();
        c0Var.r(40);
        boolean z10 = c0Var.h(5) > 10;
        c0Var.p(iE);
        int i19 = -1;
        if (z10) {
            c0Var.r(16);
            int iH = c0Var.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            c0Var.r(3);
            iC = (c0Var.h(11) + 1) * 2;
            int iH2 = c0Var.h(2);
            if (iH2 == 3) {
                i10 = f50444c[c0Var.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = c0Var.h(2);
                int i20 = f50442a[iH3];
                i14 = iH3;
                i10 = f50443b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = c0Var.h(3);
            boolean zG = c0Var.g();
            i11 = f50445d[iH4] + (zG ? 1 : 0);
            c0Var.r(10);
            if (c0Var.g()) {
                c0Var.r(8);
            }
            if (iH4 == 0) {
                c0Var.r(5);
                if (c0Var.g()) {
                    c0Var.r(8);
                }
            }
            if (i19 == 1 && c0Var.g()) {
                c0Var.r(16);
            }
            if (c0Var.g()) {
                if (iH4 > 2) {
                    c0Var.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    c0Var.r(6);
                }
                if ((iH4 & 4) != 0) {
                    c0Var.r(i17);
                }
                if (zG && c0Var.g()) {
                    c0Var.r(5);
                }
                if (i19 == 0) {
                    if (c0Var.g()) {
                        i18 = 6;
                        c0Var.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && c0Var.g()) {
                        c0Var.r(i18);
                    }
                    if (c0Var.g()) {
                        c0Var.r(i18);
                    }
                    int iH5 = c0Var.h(2);
                    if (iH5 == 1) {
                        c0Var.r(5);
                    } else if (iH5 == 2) {
                        c0Var.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = c0Var.h(5);
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                            }
                        }
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(7);
                                if (c0Var.g()) {
                                    c0Var.r(8);
                                }
                            }
                        }
                        c0Var.r((iH6 + 2) * 8);
                        c0Var.c();
                    }
                    if (iH4 < 2) {
                        if (c0Var.g()) {
                            c0Var.r(14);
                        }
                        if (iH4 == 0 && c0Var.g()) {
                            c0Var.r(14);
                        }
                    }
                    if (c0Var.g()) {
                        if (i14 == 0) {
                            c0Var.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (c0Var.g()) {
                                    c0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0Var.g()) {
                c0Var.r(5);
                if (iH4 == 2) {
                    c0Var.r(4);
                }
                if (iH4 >= 6) {
                    c0Var.r(2);
                }
                if (c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH4 == 0 && c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH2 < 3) {
                    c0Var.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                c0Var.q();
            }
            if (i19 == 2 && (i14 == 3 || c0Var.g())) {
                i16 = 6;
                c0Var.r(6);
            } else {
                i16 = 6;
            }
            str = (c0Var.g() && c0Var.h(i16) == 1 && c0Var.h(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = iA;
        } else {
            c0Var.r(32);
            int iH7 = c0Var.h(2);
            String str2 = iH7 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iH8 = c0Var.h(6);
            int i22 = f50446e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            c0Var.r(8);
            int iH9 = c0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                c0Var.r(2);
            }
            if ((iH9 & 4) != 0) {
                c0Var.r(2);
            }
            if (iH9 == 2) {
                c0Var.r(2);
            }
            int[] iArr = f50443b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f50445d[iH9] + (c0Var.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0779b(str, i19, i11, i10, iC, i12, i13);
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
    public static v0 h(d0 d0Var, String str, String str2, com.google.android.exoplayer2.drm.h hVar) {
        String str3;
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int iH = c0Var.h(13) * 1000;
        c0Var.r(3);
        int i10 = f50443b[c0Var.h(2)];
        c0Var.r(10);
        int i11 = f50445d[c0Var.h(3)];
        if (c0Var.h(1) != 0) {
            i11++;
        }
        c0Var.r(3);
        int iH2 = c0Var.h(4);
        c0Var.r(1);
        if (iH2 > 0) {
            c0Var.r(6);
            if (c0Var.h(1) != 0) {
                i11 += 2;
            }
            c0Var.r(1);
        }
        if (c0Var.b() > 7) {
            c0Var.r(7);
            if (c0Var.h(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        c0Var.c();
        d0Var.U(c0Var.d());
        return new v0.b().U(str).g0(str3).J(i11).h0(i10).O(hVar).X(str2).b0(iH).G();
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
