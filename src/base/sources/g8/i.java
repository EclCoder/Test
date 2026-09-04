package g8;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i extends f8.b {
    private static final int W = com.fasterxml.jackson.core.e.a.ALLOW_TRAILING_COMMA.i();
    private static final int X = com.fasterxml.jackson.core.e.a.ALLOW_NUMERIC_LEADING_ZEROS.i();
    private static final int Y = com.fasterxml.jackson.core.e.a.ALLOW_NON_NUMERIC_NUMBERS.i();
    private static final int Z = com.fasterxml.jackson.core.e.a.ALLOW_MISSING_VALUES.i();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f39018a0 = com.fasterxml.jackson.core.e.a.ALLOW_SINGLE_QUOTES.i();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f39019b0 = com.fasterxml.jackson.core.e.a.ALLOW_UNQUOTED_FIELD_NAMES.i();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f39020c0 = com.fasterxml.jackson.core.e.a.ALLOW_COMMENTS.i();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f39021d0 = com.fasterxml.jackson.core.e.a.ALLOW_YAML_COMMENTS.i();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int[] f39022e0 = com.fasterxml.jackson.core.io.a.k();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected static final int[] f39023f0 = com.fasterxml.jackson.core.io.a.i();
    protected final h8.a M;
    protected int[] N;
    protected boolean O;
    private int P;
    protected int Q;
    protected int R;
    protected int S;
    protected InputStream T;
    protected byte[] U;
    protected boolean V;

    public i(com.fasterxml.jackson.core.io.b bVar, int i10, InputStream inputStream, com.fasterxml.jackson.core.h hVar, h8.a aVar, byte[] bArr, int i11, int i12, int i13, boolean z10) {
        super(bVar, i10);
        this.N = new int[16];
        this.T = inputStream;
        this.M = aVar;
        this.U = bArr;
        this.f38343o = i11;
        this.f38344p = i12;
        this.f38347s = i11 - i13;
        this.f38345q = (-i11) + i13;
        this.V = z10;
    }

    private final int F2() {
        int i10 = this.f38343o;
        if (i10 + 4 >= this.f38344p) {
            return G2(false);
        }
        byte[] bArr = this.U;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i11 = i10 + 1;
            this.f38343o = i11;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (b11 == 47 || b11 == 35) {
                    return G2(true);
                }
                this.f38343o = i10 + 2;
                return b11;
            }
            if (b11 == 32 || b11 == 9) {
                int i12 = i10 + 2;
                this.f38343o = i12;
                byte b12 = bArr[i12];
                if (b12 > 32) {
                    if (b12 == 47 || b12 == 35) {
                        return G2(true);
                    }
                    this.f38343o = i10 + 3;
                    return b12;
                }
            }
            return G2(true);
        }
        if (b10 == 32 || b10 == 9) {
            int i13 = i10 + 1;
            this.f38343o = i13;
            b10 = bArr[i13];
        }
        if (b10 != 58) {
            return G2(false);
        }
        int i14 = this.f38343o;
        int i15 = i14 + 1;
        this.f38343o = i15;
        byte b13 = bArr[i15];
        if (b13 > 32) {
            if (b13 == 47 || b13 == 35) {
                return G2(true);
            }
            this.f38343o = i14 + 2;
            return b13;
        }
        if (b13 == 32 || b13 == 9) {
            int i16 = i14 + 2;
            this.f38343o = i16;
            byte b14 = bArr[i16];
            if (b14 > 32) {
                if (b14 == 47 || b14 == 35) {
                    return G2(true);
                }
                this.f38343o = i14 + 3;
                return b14;
            }
        }
        return G2(true);
    }

    private final int G2(boolean z10) throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                a1(" within/between " + this.f38351w.g() + " entries", null);
                return -1;
            }
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    H2();
                } else if (i12 != 35 || !R2()) {
                    if (z10) {
                        return i12;
                    }
                    if (i12 != 58) {
                        d1(i12, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (i12 == 13) {
                    E2();
                } else if (i12 != 9) {
                    f1(i12);
                }
            }
        }
    }

    private final void H2() throws JsonParseException {
        if ((this.f16170a & f39020c0) == 0) {
            d1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f38343o >= this.f38344p && !g2()) {
            a1(" in a comment", null);
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 47) {
            I2();
        } else if (i11 == 42) {
            D2();
        } else {
            d1(i11, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void I2() throws JsonParseException {
        int[] iArrH = com.fasterxml.jackson.core.io.a.h();
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                return;
            }
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = iArrH[i12];
            if (i13 != 0) {
                if (i13 == 2) {
                    K2();
                } else if (i13 == 3) {
                    L2();
                } else if (i13 == 4) {
                    M2(i12);
                } else if (i13 == 10) {
                    this.f38346r++;
                    this.f38347s = i11;
                    return;
                } else if (i13 == 13) {
                    E2();
                    return;
                } else if (i13 != 42 && i13 < 0) {
                    x2(i12);
                }
            }
        }
    }

    private final void K2() throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        int i11 = i10 + 1;
        this.f38343o = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i11);
        }
    }

    private final void L2() throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        int i11 = i10 + 1;
        this.f38343o = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i11);
        }
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr2 = this.U;
        int i12 = this.f38343o;
        int i13 = i12 + 1;
        this.f38343o = i13;
        byte b11 = bArr2[i12];
        if ((b11 & 192) != 128) {
            A2(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
        }
    }

    private final void M2(int i10) throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i11 = this.f38343o;
        int i12 = i11 + 1;
        this.f38343o = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12);
        }
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr2 = this.U;
        int i13 = this.f38343o;
        int i14 = i13 + 1;
        this.f38343o = i14;
        byte b11 = bArr2[i13];
        if ((b11 & 192) != 128) {
            A2(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i14);
        }
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr3 = this.U;
        int i15 = this.f38343o;
        int i16 = i15 + 1;
        this.f38343o = i16;
        byte b12 = bArr3[i15];
        if ((b12 & 192) != 128) {
            A2(b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i16);
        }
    }

    private final int N2() throws JsonParseException {
        while (true) {
            int i10 = this.f38343o;
            if (i10 >= this.f38344p) {
                return O2();
            }
            byte[] bArr = this.U;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 != 47 && i12 != 35) {
                    return i12;
                }
                this.f38343o = i10;
                return O2();
            }
            if (i12 != 32) {
                if (i12 == 10) {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (i12 == 13) {
                    E2();
                } else if (i12 != 9) {
                    f1(i12);
                }
            }
        }
    }

    private final int O2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                throw c("Unexpected end-of-input within/between " + this.f38351w.g() + " entries");
            }
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    H2();
                } else if (i12 != 35 || !R2()) {
                    return i12;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (i12 == 13) {
                    E2();
                } else if (i12 != 9) {
                    f1(i12);
                }
            }
        }
    }

    private final void P1(String str, int i10, int i11) throws JsonParseException {
        if (Character.isJavaIdentifierPart((char) T1(i11))) {
            B2(str.substring(0, i10));
        }
    }

    private final int P2() throws JsonParseException {
        if (this.f38343o >= this.f38344p && !g2()) {
            return r1();
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        int i11 = i10 + 1;
        this.f38343o = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 > 32) {
            if (i12 != 47 && i12 != 35) {
                return i12;
            }
            this.f38343o = i10;
            return Q2();
        }
        if (i12 != 32) {
            if (i12 == 10) {
                this.f38346r++;
                this.f38347s = i11;
            } else if (i12 == 13) {
                E2();
            } else if (i12 != 9) {
                f1(i12);
            }
        }
        while (true) {
            int i13 = this.f38343o;
            if (i13 >= this.f38344p) {
                return Q2();
            }
            byte[] bArr2 = this.U;
            int i14 = i13 + 1;
            this.f38343o = i14;
            int i15 = bArr2[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 > 32) {
                if (i15 != 47 && i15 != 35) {
                    return i15;
                }
                this.f38343o = i13;
                return Q2();
            }
            if (i15 != 32) {
                if (i15 == 10) {
                    this.f38346r++;
                    this.f38347s = i14;
                } else if (i15 == 13) {
                    E2();
                } else if (i15 != 9) {
                    f1(i15);
                }
            }
        }
    }

    private final void Q1() {
        S2();
        if (!this.f38351w.d()) {
            z1(93, '}');
        }
        this.f38351w = this.f38351w.i();
    }

    private final int Q2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                return r1();
            }
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    H2();
                } else if (i12 != 35 || !R2()) {
                    return i12;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (i12 == 13) {
                    E2();
                } else if (i12 != 9) {
                    f1(i12);
                }
            }
        }
    }

    private final void R1() {
        S2();
        if (!this.f38351w.e()) {
            z1(Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, ']');
        }
        this.f38351w = this.f38351w.i();
    }

    private final boolean R2() throws JsonParseException {
        if ((this.f16170a & f39021d0) == 0) {
            return false;
        }
        I2();
        return true;
    }

    private final com.fasterxml.jackson.core.g S1(int i10) {
        if (i10 == 125) {
            R1();
            com.fasterxml.jackson.core.g gVar = com.fasterxml.jackson.core.g.END_OBJECT;
            this.f38365b = gVar;
            return gVar;
        }
        Q1();
        com.fasterxml.jackson.core.g gVar2 = com.fasterxml.jackson.core.g.END_ARRAY;
        this.f38365b = gVar2;
        return gVar2;
    }

    private final void S2() {
        this.f38349u = this.f38346r;
        int i10 = this.f38343o;
        this.f38348t = this.f38345q + ((long) i10);
        this.f38350v = i10 - this.f38347s;
    }

    private final void T2() {
        this.R = this.f38346r;
        int i10 = this.f38343o;
        this.Q = i10;
        this.S = i10 - this.f38347s;
    }

    private final int U2() throws JsonParseException {
        int i10;
        if ((this.f38343o >= this.f38344p && !g2()) || (i10 = this.U[this.f38343o] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || i10 > 57) {
            return 48;
        }
        if ((this.f16170a & X) == 0) {
            i1("Leading zeroes not allowed");
        }
        this.f38343o++;
        if (i10 != 48) {
            return i10;
        }
        do {
            if (this.f38343o >= this.f38344p && !g2()) {
                return i10;
            }
            byte[] bArr = this.U;
            int i11 = this.f38343o;
            i10 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i10 < 48 || i10 > 57) {
                return 48;
            }
            this.f38343o = i11 + 1;
        } while (i10 == 48);
        return i10;
    }

    private final int V1(int i10) throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i11 = this.f38343o;
        int i12 = i11 + 1;
        this.f38343o = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12);
        }
        return ((i10 & 31) << 6) | (b10 & 63);
    }

    private final void V2(int i10) throws JsonParseException {
        int i11 = this.f38343o + 1;
        this.f38343o = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this.f38346r++;
                this.f38347s = i11;
            } else if (i10 == 13) {
                E2();
            } else if (i10 != 32) {
                c1(i10);
            }
        }
    }

    private final int W1(int i10) throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        int i11 = i10 & 15;
        byte[] bArr = this.U;
        int i12 = this.f38343o;
        int i13 = i12 + 1;
        this.f38343o = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr2 = this.U;
        int i15 = this.f38343o;
        int i16 = i15 + 1;
        this.f38343o = i16;
        byte b11 = bArr2[i15];
        if ((b11 & 192) != 128) {
            A2(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    private final String W2(int[] iArr, int i10, int i11) throws JsonParseException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ((i10 << 2) - 4) + i11;
        int i18 = 3;
        if (i11 < 4) {
            int i19 = i10 - 1;
            i12 = iArr[i19];
            iArr[i19] = i12 << ((4 - i11) << 3);
        } else {
            i12 = 0;
        }
        char[] cArrK = this.f38353y.k();
        int i20 = 0;
        int i21 = 0;
        while (i20 < i17) {
            int i22 = iArr[i20 >> 2] >> ((3 - (i20 & 3)) << i18);
            int i23 = i22 & 255;
            int i24 = i20 + 1;
            if (i23 > 127) {
                i13 = i18;
                if ((i22 & 224) == 192) {
                    i14 = i22 & 31;
                    i15 = 1;
                } else if ((i22 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    i14 = i22 & 15;
                    i15 = 2;
                } else if ((i22 & 248) == 240) {
                    i14 = i22 & 7;
                    i15 = i13;
                } else {
                    y2(i23);
                    i14 = 1;
                    i15 = 1;
                }
                if (i24 + i15 > i17) {
                    a1(" in field name", com.fasterxml.jackson.core.g.FIELD_NAME);
                }
                int i25 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                i24 = i20 + 2;
                if ((i25 & PsExtractor.AUDIO_STREAM) != 128) {
                    z2(i25);
                }
                int i26 = (i14 << 6) | (i25 & 63);
                if (i15 > 1) {
                    int i27 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                    i24 = i20 + 3;
                    if ((i27 & PsExtractor.AUDIO_STREAM) != 128) {
                        z2(i27);
                    }
                    int i28 = (i27 & 63) | (i26 << 6);
                    i16 = 2;
                    if (i15 > 2) {
                        int i29 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                        i24 = i20 + 4;
                        if ((i29 & PsExtractor.AUDIO_STREAM) != 128) {
                            z2(i29 & 255);
                        }
                        i23 = (i28 << 6) | (i29 & 63);
                    } else {
                        i23 = i28;
                    }
                    if (i15 > i16) {
                        int i30 = i23 - C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (i21 >= cArrK.length) {
                            cArrK = this.f38353y.m();
                        }
                        cArrK[i21] = (char) ((i30 >> 10) + 55296);
                        i23 = (i30 & 1023) | 56320;
                        i21++;
                    }
                } else {
                    i23 = i26;
                }
                i16 = 2;
                if (i15 > i16) {
                    int i31 = i23 - C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (i21 >= cArrK.length) {
                        cArrK = this.f38353y.m();
                    }
                    cArrK[i21] = (char) ((i31 >> 10) + 55296);
                    i23 = (i31 & 1023) | 56320;
                    i21++;
                }
            } else {
                i13 = i18;
            }
            i20 = i24;
            if (i21 >= cArrK.length) {
                cArrK = this.f38353y.m();
            }
            cArrK[i21] = (char) i23;
            i21++;
            i18 = i13;
        }
        String str = new String(cArrK, 0, i21);
        if (i11 < 4) {
            iArr[i10 - 1] = i12;
        }
        return this.M.w(str, iArr, i10);
    }

    private final int X1(int i10) throws JsonParseException {
        int i11 = i10 & 15;
        byte[] bArr = this.U;
        int i12 = this.f38343o;
        int i13 = i12 + 1;
        this.f38343o = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        byte[] bArr2 = this.U;
        int i15 = this.f38343o;
        int i16 = i15 + 1;
        this.f38343o = i16;
        byte b11 = bArr2[i15];
        if ((b11 & 192) != 128) {
            A2(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    private final String X2(int i10, int i11) {
        int iP2 = p2(i10, i11);
        String strD = this.M.D(iP2);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.N;
        iArr[0] = iP2;
        return W2(iArr, 1, i11);
    }

    private final int Y1(int i10) throws JsonParseException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i11 = this.f38343o;
        int i12 = i11 + 1;
        this.f38343o = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            A2(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12);
        }
        int i13 = ((i10 & 7) << 6) | (b10 & 63);
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr2 = this.U;
        int i14 = this.f38343o;
        int i15 = i14 + 1;
        this.f38343o = i15;
        byte b11 = bArr2[i14];
        if ((b11 & 192) != 128) {
            A2(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i15);
        }
        int i16 = (i13 << 6) | (b11 & 63);
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr3 = this.U;
        int i17 = this.f38343o;
        int i18 = i17 + 1;
        this.f38343o = i18;
        byte b12 = bArr3[i17];
        if ((b12 & 192) != 128) {
            A2(b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i18);
        }
        return ((i16 << 6) | (b12 & 63)) - C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    private final String Y2(int i10, int i11, int i12) {
        int iP2 = p2(i11, i12);
        String strE = this.M.E(i10, iP2);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.N;
        iArr[0] = i10;
        iArr[1] = iP2;
        return W2(iArr, 2, i12);
    }

    private final String Z2(int i10, int i11, int i12, int i13) {
        int iP2 = p2(i12, i13);
        String strF = this.M.F(i10, i11, iP2);
        if (strF != null) {
            return strF;
        }
        int[] iArr = this.N;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = p2(iP2, i13);
        return W2(iArr, 3, i13);
    }

    private final void a2(char[] cArr, int i10) throws JsonParseException {
        int[] iArr = f39022e0;
        byte[] bArr = this.U;
        while (true) {
            int i11 = this.f38343o;
            if (i11 >= this.f38344p) {
                h2();
                i11 = this.f38343o;
            }
            int i12 = 0;
            if (i10 >= cArr.length) {
                cArr = this.f38353y.n();
                i10 = 0;
            }
            int iMin = Math.min(this.f38344p, (cArr.length - i10) + i11);
            while (true) {
                if (i11 >= iMin) {
                    this.f38343o = i11;
                    break;
                }
                int i13 = i11 + 1;
                int iU1 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = iArr[iU1];
                if (i14 != 0) {
                    this.f38343o = i13;
                    if (iU1 != 34) {
                        if (i14 == 1) {
                            iU1 = U1();
                        } else if (i14 == 2) {
                            iU1 = V1(iU1);
                        } else if (i14 == 3) {
                            iU1 = this.f38344p - i13 >= 2 ? X1(iU1) : W1(iU1);
                        } else if (i14 == 4) {
                            int iY1 = Y1(iU1);
                            int i15 = i10 + 1;
                            cArr[i10] = (char) ((iY1 >> 10) | 55296);
                            if (i15 >= cArr.length) {
                                cArr = this.f38353y.n();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            iU1 = (iY1 & 1023) | 56320;
                        } else if (iU1 < 32) {
                            B1(iU1, "string value");
                        } else {
                            x2(iU1);
                        }
                        if (i10 >= cArr.length) {
                            cArr = this.f38353y.n();
                        } else {
                            i12 = i10;
                        }
                        i10 = i12 + 1;
                        cArr[i12] = (char) iU1;
                        break;
                    }
                    this.f38353y.y(i10);
                    return;
                }
                cArr[i10] = (char) iU1;
                i11 = i13;
                i10++;
            }
        }
    }

    private final String a3(int[] iArr, int i10, int i11, int i12) {
        if (i10 >= iArr.length) {
            iArr = f8.b.K1(iArr, iArr.length);
            this.N = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = p2(i11, i12);
        String strG = this.M.G(iArr, i13);
        return strG == null ? W2(iArr, i13, i12) : strG;
    }

    private int b3() throws JsonEOFException {
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    private final String g3(int i10, int i11, int i12) {
        return c3(this.N, 0, i10, i11, i12);
    }

    private final String h3(int i10, int i11, int i12, int i13) {
        int[] iArr = this.N;
        iArr[0] = i10;
        return c3(iArr, 1, i11, i12, i13);
    }

    private final String i3(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.N;
        iArr[0] = i10;
        iArr[1] = i11;
        return c3(iArr, 2, i12, i13, i14);
    }

    private final void l2(String str, int i10) throws JsonParseException {
        int i11;
        int i12;
        int length = str.length();
        do {
            if ((this.f38343o >= this.f38344p && !g2()) || this.U[this.f38343o] != str.charAt(i10)) {
                B2(str.substring(0, i10));
            }
            i11 = this.f38343o + 1;
            this.f38343o = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.f38344p || g2()) && (i12 = this.U[this.f38343o] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 48 && i12 != 93 && i12 != 125) {
            P1(str, i10, i12);
        }
    }

    private final com.fasterxml.jackson.core.g n2() {
        this.A = false;
        com.fasterxml.jackson.core.g gVar = this.f38352x;
        this.f38352x = null;
        if (gVar == com.fasterxml.jackson.core.g.START_ARRAY) {
            this.f38351w = this.f38351w.j(this.f38349u, this.f38350v);
        } else if (gVar == com.fasterxml.jackson.core.g.START_OBJECT) {
            this.f38351w = this.f38351w.k(this.f38349u, this.f38350v);
        }
        this.f38365b = gVar;
        return gVar;
    }

    private final com.fasterxml.jackson.core.g o2(int i10) throws JsonParseException {
        if (i10 == 34) {
            this.O = true;
            com.fasterxml.jackson.core.g gVar = com.fasterxml.jackson.core.g.VALUE_STRING;
            this.f38365b = gVar;
            return gVar;
        }
        if (i10 == 45) {
            com.fasterxml.jackson.core.g gVarU2 = u2();
            this.f38365b = gVarU2;
            return gVarU2;
        }
        if (i10 == 46) {
            com.fasterxml.jackson.core.g gVarS2 = s2();
            this.f38365b = gVarS2;
            return gVarS2;
        }
        if (i10 == 91) {
            this.f38351w = this.f38351w.j(this.f38349u, this.f38350v);
            com.fasterxml.jackson.core.g gVar2 = com.fasterxml.jackson.core.g.START_ARRAY;
            this.f38365b = gVar2;
            return gVar2;
        }
        if (i10 == 102) {
            i2();
            com.fasterxml.jackson.core.g gVar3 = com.fasterxml.jackson.core.g.VALUE_FALSE;
            this.f38365b = gVar3;
            return gVar3;
        }
        if (i10 == 110) {
            j2();
            com.fasterxml.jackson.core.g gVar4 = com.fasterxml.jackson.core.g.VALUE_NULL;
            this.f38365b = gVar4;
            return gVar4;
        }
        if (i10 == 116) {
            m2();
            com.fasterxml.jackson.core.g gVar5 = com.fasterxml.jackson.core.g.VALUE_TRUE;
            this.f38365b = gVar5;
            return gVar5;
        }
        if (i10 == 123) {
            this.f38351w = this.f38351w.k(this.f38349u, this.f38350v);
            com.fasterxml.jackson.core.g gVar6 = com.fasterxml.jackson.core.g.START_OBJECT;
            this.f38365b = gVar6;
            return gVar6;
        }
        switch (i10) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case AD_VISIBILITY_VALUE:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                com.fasterxml.jackson.core.g gVarW2 = w2(i10);
                this.f38365b = gVarW2;
                return gVarW2;
            default:
                com.fasterxml.jackson.core.g gVarF2 = f2(i10);
                this.f38365b = gVarF2;
                return gVarF2;
        }
    }

    private static final int p2(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    private final com.fasterxml.jackson.core.g r2(char[] cArr, int i10, int i11, boolean z10, int i12) throws JsonParseException {
        int i13;
        boolean z11;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this.f38353y.n();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            i13 = 0;
            while (true) {
                if (this.f38343o >= this.f38344p && !g2()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this.U;
                int i15 = this.f38343o;
                this.f38343o = i15 + 1;
                i11 = bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i11 < 48 || i11 > 57) {
                    z11 = false;
                    break;
                }
                i13++;
                if (i10 >= cArr.length) {
                    cArr = this.f38353y.n();
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i10++;
            }
            if (i13 == 0) {
                p1(i11, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
            z11 = false;
        }
        if (i11 == 101 || i11 == 69) {
            if (i10 >= cArr.length) {
                cArr = this.f38353y.n();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            if (this.f38343o >= this.f38344p) {
                h2();
            }
            byte[] bArr2 = this.U;
            int i17 = this.f38343o;
            this.f38343o = i17 + 1;
            int i18 = bArr2[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i18 == 45 || i18 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this.f38353y.n();
                    i16 = 0;
                }
                int i19 = i16 + 1;
                cArr[i16] = (char) i18;
                if (this.f38343o >= this.f38344p) {
                    h2();
                }
                byte[] bArr3 = this.U;
                int i20 = this.f38343o;
                this.f38343o = i20 + 1;
                i18 = bArr3[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i16 = i19;
            }
            i11 = i18;
            int i21 = 0;
            while (true) {
                if (i11 >= 48 && i11 <= 57) {
                    i21++;
                    if (i16 >= cArr.length) {
                        cArr = this.f38353y.n();
                        i16 = 0;
                    }
                    int i22 = i16 + 1;
                    cArr[i16] = (char) i11;
                    if (this.f38343o >= this.f38344p && !g2()) {
                        i14 = i21;
                        z11 = true;
                        i10 = i22;
                        break;
                    }
                    byte[] bArr4 = this.U;
                    int i23 = this.f38343o;
                    this.f38343o = i23 + 1;
                    i11 = bArr4[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    i16 = i22;
                } else {
                    i14 = i21;
                    i10 = i16;
                    break;
                }
            }
            if (i14 == 0) {
                p1(i11, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.f38343o--;
            if (this.f38351w.f()) {
                V2(i11);
            }
        }
        this.f38353y.y(i10);
        return N1(z10, i12, i13, i14);
    }

    private final com.fasterxml.jackson.core.g v2(char[] cArr, int i10, boolean z10, int i11) throws JsonParseException {
        char[] cArrN = cArr;
        int i12 = i10;
        int i13 = i11;
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                this.f38353y.y(i12);
                return O1(z10, i13);
            }
            byte[] bArr = this.U;
            int i14 = this.f38343o;
            this.f38343o = i14 + 1;
            int i15 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 > 57 || i15 < 48) {
                if (i15 == 46 || i15 == 101 || i15 == 69) {
                    return r2(cArrN, i12, i15, z10, i13);
                }
                this.f38343o = i14;
                this.f38353y.y(i12);
                if (this.f38351w.f()) {
                    V2(this.U[this.f38343o] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                }
                return O1(z10, i13);
            }
            if (i12 >= cArrN.length) {
                i12 = 0;
                cArrN = this.f38353y.n();
            }
            cArrN[i12] = (char) i15;
            i13++;
            i12++;
        }
    }

    protected void A2(int i10, int i11) throws JsonParseException {
        this.f38343o = i11;
        z2(i10);
    }

    protected void B2(String str) throws JsonParseException {
        C2(str, C1());
    }

    protected final void E2() {
        if (this.f38343o < this.f38344p || g2()) {
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            if (bArr[i10] == 10) {
                this.f38343o = i10 + 1;
            }
        }
        this.f38346r++;
        this.f38347s = this.f38343o;
    }

    protected void J2() throws JsonParseException {
        this.O = false;
        int[] iArr = f39022e0;
        byte[] bArr = this.U;
        while (true) {
            int i10 = this.f38343o;
            int i11 = this.f38344p;
            if (i10 >= i11) {
                h2();
                i10 = this.f38343o;
                i11 = this.f38344p;
            }
            while (true) {
                if (i10 >= i11) {
                    this.f38343o = i10;
                    break;
                }
                int i12 = i10 + 1;
                int i13 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = iArr[i13];
                if (i14 != 0) {
                    this.f38343o = i12;
                    if (i13 != 34) {
                        if (i14 == 1) {
                            U1();
                            break;
                        }
                        if (i14 == 2) {
                            K2();
                            break;
                        }
                        if (i14 == 3) {
                            L2();
                            break;
                        }
                        if (i14 == 4) {
                            M2(i13);
                            break;
                        } else if (i13 >= 32) {
                            x2(i13);
                            break;
                        } else {
                            B1(i13, "string value");
                            break;
                        }
                    }
                    return;
                }
                i10 = i12;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    protected int T1(int i10) throws JsonParseException {
        char c10;
        int iB3;
        int iB4;
        int iB5;
        int i11 = i10 & 255;
        if (i11 > 127) {
            if ((i10 & 224) == 192) {
                i11 = i10 & 31;
            } else {
                if ((i10 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    i11 = i10 & 15;
                    c10 = 2;
                } else if ((i10 & 248) == 240) {
                    i11 = i10 & 7;
                    c10 = 3;
                } else {
                    y2(i10 & 255);
                }
                iB3 = b3();
                if ((iB3 & PsExtractor.AUDIO_STREAM) != 128) {
                    z2(iB3 & 255);
                }
                i11 = (i11 << 6) | (iB3 & 63);
                if (c10 > 1) {
                    iB4 = b3();
                    if ((iB4 & PsExtractor.AUDIO_STREAM) != 128) {
                        z2(iB4 & 255);
                    }
                    i11 = (i11 << 6) | (iB4 & 63);
                    if (c10 > 2) {
                        iB5 = b3();
                        if ((iB5 & PsExtractor.AUDIO_STREAM) != 128) {
                            z2(iB5 & 255);
                        }
                        return (iB5 & 63) | (i11 << 6);
                    }
                }
            }
            c10 = 1;
            iB3 = b3();
            if ((iB3 & PsExtractor.AUDIO_STREAM) != 128) {
                z2(iB3 & 255);
            }
            i11 = (i11 << 6) | (iB3 & 63);
            if (c10 > 1) {
                iB4 = b3();
                if ((iB4 & PsExtractor.AUDIO_STREAM) != 128) {
                    z2(iB4 & 255);
                }
                i11 = (i11 << 6) | (iB4 & 63);
                if (c10 > 2) {
                    iB5 = b3();
                    if ((iB5 & PsExtractor.AUDIO_STREAM) != 128) {
                        z2(iB5 & 255);
                    }
                    return (iB5 & 63) | (i11 << 6);
                }
            }
        }
        return i11;
    }

    protected char U1() throws JsonParseException {
        if (this.f38343o >= this.f38344p && !g2()) {
            a1(" in character escape sequence", com.fasterxml.jackson.core.g.VALUE_STRING);
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            return t1((char) T1(b10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.f38343o >= this.f38344p && !g2()) {
                a1(" in character escape sequence", com.fasterxml.jackson.core.g.VALUE_STRING);
            }
            byte[] bArr2 = this.U;
            int i13 = this.f38343o;
            this.f38343o = i13 + 1;
            byte b11 = bArr2[i13];
            int iC = com.fasterxml.jackson.core.io.a.c(b11);
            if (iC < 0) {
                d1(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iC;
        }
        return (char) i11;
    }

    protected String Z1() throws JsonParseException {
        int i10 = this.f38343o;
        if (i10 >= this.f38344p) {
            h2();
            i10 = this.f38343o;
        }
        char[] cArrK = this.f38353y.k();
        int[] iArr = f39022e0;
        int iMin = Math.min(this.f38344p, cArrK.length + i10);
        byte[] bArr = this.U;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this.f38343o = i10 + 1;
                return this.f38353y.x(i11);
            }
            i10++;
            cArrK[i11] = (char) i12;
            i11++;
        }
        this.f38343o = i10;
        a2(cArrK, i11);
        return this.f38353y.j();
    }

    protected final String b2(com.fasterxml.jackson.core.g gVar) {
        if (gVar == null) {
            return null;
        }
        int iG = gVar.g();
        if (iG != 5) {
            return (iG == 6 || iG == 7 || iG == 8) ? this.f38353y.j() : gVar.d();
        }
        return this.f38351w.b();
    }

    protected com.fasterxml.jackson.core.g c2() throws JsonParseException {
        char[] cArrK = this.f38353y.k();
        int[] iArr = f39022e0;
        byte[] bArr = this.U;
        int i10 = 0;
        while (true) {
            if (this.f38343o >= this.f38344p) {
                h2();
            }
            if (i10 >= cArrK.length) {
                cArrK = this.f38353y.n();
                i10 = 0;
            }
            int i11 = this.f38344p;
            int length = this.f38343o + (cArrK.length - i10);
            if (length < i11) {
                i11 = length;
            }
            while (true) {
                int i12 = this.f38343o;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this.f38343o = i13;
                int iU1 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iU1 == 39 || iArr[iU1] != 0) {
                    if (iU1 != 39) {
                        int i14 = iArr[iU1];
                        if (i14 == 1) {
                            iU1 = U1();
                        } else if (i14 == 2) {
                            iU1 = V1(iU1);
                        } else if (i14 == 3) {
                            iU1 = this.f38344p - i13 >= 2 ? X1(iU1) : W1(iU1);
                        } else if (i14 != 4) {
                            if (iU1 < 32) {
                                B1(iU1, "string value");
                            }
                            x2(iU1);
                        } else {
                            int iY1 = Y1(iU1);
                            int i15 = i10 + 1;
                            cArrK[i10] = (char) ((iY1 >> 10) | 55296);
                            if (i15 >= cArrK.length) {
                                cArrK = this.f38353y.n();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            iU1 = 56320 | (iY1 & 1023);
                        }
                        if (i10 >= cArrK.length) {
                            cArrK = this.f38353y.n();
                            i10 = 0;
                        }
                        cArrK[i10] = (char) iU1;
                        i10++;
                        break;
                    }
                    this.f38353y.y(i10);
                    return com.fasterxml.jackson.core.g.VALUE_STRING;
                }
                cArrK[i10] = (char) iU1;
                i10++;
            }
        }
    }

    protected final String c3(int[] iArr, int i10, int i11, int i12, int i13) throws JsonParseException {
        int[] iArr2 = f39023f0;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    B1(i12, "name");
                } else {
                    i12 = U1();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (i13 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = f8.b.K1(iArr, iArr.length);
                            this.N = iArr;
                        }
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i13 = 0;
                    }
                    if (i12 < 2048) {
                        i11 = (i11 << 8) | (i12 >> 6) | PsExtractor.AUDIO_STREAM;
                        i13++;
                    } else {
                        int i15 = (i11 << 8) | (i12 >> 12) | 224;
                        int i16 = i13 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = f8.b.K1(iArr, iArr.length);
                                this.N = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        i13 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i11 = (i11 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = f8.b.K1(iArr, iArr.length);
                    this.N = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this.f38343o >= this.f38344p && !g2()) {
                a1(" in field name", com.fasterxml.jackson.core.g.FIELD_NAME);
            }
            byte[] bArr = this.U;
            int i17 = this.f38343o;
            this.f38343o = i17 + 1;
            i12 = bArr[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = f8.b.K1(iArr, iArr.length);
                this.N = iArr;
            }
            iArr[i10] = p2(i11, i13);
            i10++;
        }
        String strG = this.M.G(iArr, i10);
        return strG == null ? W2(iArr, i10, i13) : strG;
    }

    protected com.fasterxml.jackson.core.g d2(int i10, boolean z10) throws JsonParseException {
        String str;
        while (i10 == 73) {
            if (this.f38343o >= this.f38344p && !g2()) {
                b1(com.fasterxml.jackson.core.g.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.U;
            int i11 = this.f38343o;
            this.f38343o = i11 + 1;
            i10 = bArr[i11];
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                }
                str = z10 ? "-Infinity" : "+Infinity";
            } else {
                str = z10 ? "-INF" : "+INF";
            }
            k2(str, 3);
            if ((this.f16170a & Y) != 0) {
                return M1(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            W0("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        p1(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected final String d3(int i10, int i11, int i12) {
        int[] iArr = this.N;
        iArr[0] = this.P;
        int i13 = 1;
        iArr[1] = i11;
        iArr[2] = i12;
        byte[] bArr = this.U;
        int[] iArr2 = f39023f0;
        int i14 = i10;
        int i15 = 3;
        while (true) {
            int i16 = this.f38343o;
            if (i16 + 4 > this.f38344p) {
                return c3(this.N, i15, 0, i14, 0);
            }
            int i17 = i16 + 1;
            this.f38343o = i17;
            int i18 = bArr[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr2[i18] != 0) {
                if (i18 == 34) {
                    return a3(this.N, i15, i14, i13);
                }
                return c3(this.N, i15, i14, i18, 1);
            }
            int i19 = i13;
            int i20 = i15;
            int i21 = i14;
            int[] iArr3 = iArr2;
            int i22 = (i21 << 8) | i18;
            int i23 = i16 + 2;
            this.f38343o = i23;
            int i24 = bArr[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr3[i24] != 0) {
                return i24 == 34 ? a3(this.N, i20, i22, 2) : c3(this.N, i20, i22, i24, 2);
            }
            int i25 = (i22 << 8) | i24;
            int i26 = i16 + 3;
            this.f38343o = i26;
            int i27 = bArr[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr3[i27] != 0) {
                return i27 == 34 ? a3(this.N, i20, i25, 3) : c3(this.N, i20, i25, i27, 3);
            }
            int i28 = (i25 << 8) | i27;
            this.f38343o = i16 + 4;
            int i29 = bArr[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr3[i29] != 0) {
                return i29 == 34 ? a3(this.N, i20, i28, 4) : c3(this.N, i20, i28, i29, 4);
            }
            int[] iArr4 = this.N;
            if (i20 >= iArr4.length) {
                this.N = f8.b.K1(iArr4, i20);
            }
            this.N[i20] = i28;
            i14 = i29;
            iArr2 = iArr3;
            i15 = i20 + 1;
            i13 = i19;
        }
    }

    protected String e2(int i10) throws JsonParseException {
        if (i10 == 39 && (this.f16170a & f39018a0) != 0) {
            return q2();
        }
        if ((this.f16170a & f39019b0) == 0) {
            d1((char) T1(i10), "was expecting double-quote to start field name");
        }
        int[] iArrL = com.fasterxml.jackson.core.io.a.l();
        if (iArrL[i10] != 0) {
            d1(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrK1 = this.N;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i11 < 4) {
                i11++;
                i10 |= i13 << 8;
            } else {
                if (i12 >= iArrK1.length) {
                    iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                    this.N = iArrK1;
                }
                iArrK1[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = i10;
            if (this.f38343o >= this.f38344p && !g2()) {
                a1(" in field name", com.fasterxml.jackson.core.g.FIELD_NAME);
            }
            byte[] bArr = this.U;
            int i14 = this.f38343o;
            i10 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArrL[i10] != 0) {
                break;
            }
            this.f38343o = i14 + 1;
        }
        if (i11 > 0) {
            if (i12 >= iArrK1.length) {
                iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                this.N = iArrK1;
            }
            iArrK1[i12] = i13;
            i12++;
        }
        String strG = this.M.G(iArrK1, i12);
        return strG == null ? W2(iArrK1, i12, i11) : strG;
    }

    protected final String e3(int i10) {
        byte[] bArr = this.U;
        int[] iArr = f39023f0;
        int i11 = this.f38343o;
        int i12 = i11 + 1;
        this.f38343o = i12;
        int i13 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i13] != 0) {
            return i13 == 34 ? Y2(this.P, i10, 1) : h3(this.P, i10, i13, 1);
        }
        int i14 = (i10 << 8) | i13;
        int i15 = i11 + 2;
        this.f38343o = i15;
        int i16 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i16] != 0) {
            return i16 == 34 ? Y2(this.P, i14, 2) : h3(this.P, i14, i16, 2);
        }
        int i17 = (i14 << 8) | i16;
        int i18 = i11 + 3;
        this.f38343o = i18;
        int i19 = bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i19] != 0) {
            return i19 == 34 ? Y2(this.P, i17, 3) : h3(this.P, i17, i19, 3);
        }
        int i20 = (i17 << 8) | i19;
        this.f38343o = i11 + 4;
        int i21 = bArr[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i21] != 0) {
            return i21 == 34 ? Y2(this.P, i20, 4) : h3(this.P, i20, i21, 4);
        }
        return f3(i21, i20);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.f38351w.d() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3.f38351w.f() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3.f16170a & g8.i.Z) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3.f38343o--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.g.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.g f2(int r4) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i.f2(int):com.fasterxml.jackson.core.g");
    }

    protected final String f3(int i10, int i11) {
        byte[] bArr = this.U;
        int[] iArr = f39023f0;
        int i12 = this.f38343o;
        int i13 = i12 + 1;
        this.f38343o = i13;
        int i14 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i14] != 0) {
            return i14 == 34 ? Z2(this.P, i11, i10, 1) : i3(this.P, i11, i10, i14, 1);
        }
        int i15 = (i10 << 8) | i14;
        int i16 = i12 + 2;
        this.f38343o = i16;
        int i17 = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i17] != 0) {
            return i17 == 34 ? Z2(this.P, i11, i15, 2) : i3(this.P, i11, i15, i17, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i12 + 3;
        this.f38343o = i19;
        int i20 = bArr[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i20] != 0) {
            return i20 == 34 ? Z2(this.P, i11, i18, 3) : i3(this.P, i11, i18, i20, 3);
        }
        int i21 = (i18 << 8) | i20;
        this.f38343o = i12 + 4;
        int i22 = bArr[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i22] != 0) {
            return i22 == 34 ? Z2(this.P, i11, i21, 4) : i3(this.P, i11, i21, i22, 4);
        }
        return d3(i22, i11, i21);
    }

    @Override // f8.c, com.fasterxml.jackson.core.e
    public String g0() {
        com.fasterxml.jackson.core.g gVar = this.f38365b;
        if (gVar != com.fasterxml.jackson.core.g.VALUE_STRING) {
            return b2(gVar);
        }
        if (!this.O) {
            return this.f38353y.j();
        }
        this.O = false;
        return Z1();
    }

    protected final boolean g2() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.T;
        if (inputStream == null || (length = (bArr = this.U).length) == 0) {
            return false;
        }
        int i10 = inputStream.read(bArr, 0, length);
        if (i10 > 0) {
            int i11 = this.f38344p;
            this.f38345q += (long) i11;
            this.f38347s -= i11;
            this.Q -= i11;
            this.f38343o = 0;
            this.f38344p = i10;
            return true;
        }
        q1();
        if (i10 == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.U.length + " bytes");
        }
        return false;
    }

    protected void h2() throws JsonEOFException {
        if (g2()) {
            return;
        }
        Z0();
    }

    protected final void i2() throws JsonParseException {
        int i10;
        int i11 = this.f38343o;
        if (i11 + 4 < this.f38344p) {
            byte[] bArr = this.U;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || i10 == 93 || i10 == 125)) {
                            this.f38343o = i15;
                            return;
                        }
                    }
                }
            }
        }
        l2("false", 1);
    }

    protected final void j2() throws JsonParseException {
        int i10;
        int i11 = this.f38343o;
        if (i11 + 3 < this.f38344p) {
            byte[] bArr = this.U;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || i10 == 93 || i10 == 125)) {
                        this.f38343o = i14;
                        return;
                    }
                }
            }
        }
        l2("null", 1);
    }

    @Override // com.fasterxml.jackson.core.e
    public com.fasterxml.jackson.core.d k() {
        return new com.fasterxml.jackson.core.d(s1(), this.f38345q + ((long) this.f38343o), -1L, this.f38346r, (this.f38343o - this.f38347s) + 1);
    }

    protected final void k2(String str, int i10) throws JsonParseException {
        int i11;
        int length = str.length();
        if (this.f38343o + length >= this.f38344p) {
            l2(str, i10);
            return;
        }
        do {
            if (this.U[this.f38343o] != str.charAt(i10)) {
                B2(str.substring(0, i10));
            }
            i11 = this.f38343o + 1;
            this.f38343o = i11;
            i10++;
        } while (i10 < length);
        int i12 = this.U[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 < 48 || i12 == 93 || i12 == 125) {
            return;
        }
        P1(str, i10, i12);
    }

    @Override // f8.c, com.fasterxml.jackson.core.e
    public com.fasterxml.jackson.core.g m0() throws JsonParseException {
        com.fasterxml.jackson.core.g gVarU2;
        com.fasterxml.jackson.core.g gVar = this.f38365b;
        com.fasterxml.jackson.core.g gVar2 = com.fasterxml.jackson.core.g.FIELD_NAME;
        if (gVar == gVar2) {
            return n2();
        }
        this.C = 0;
        if (this.O) {
            J2();
        }
        int iP2 = P2();
        if (iP2 < 0) {
            close();
            this.f38365b = null;
            return null;
        }
        this.B = null;
        if (iP2 == 93) {
            Q1();
            com.fasterxml.jackson.core.g gVar3 = com.fasterxml.jackson.core.g.END_ARRAY;
            this.f38365b = gVar3;
            return gVar3;
        }
        if (iP2 == 125) {
            R1();
            com.fasterxml.jackson.core.g gVar4 = com.fasterxml.jackson.core.g.END_OBJECT;
            this.f38365b = gVar4;
            return gVar4;
        }
        if (this.f38351w.m()) {
            if (iP2 != 44) {
                d1(iP2, "was expecting comma to separate " + this.f38351w.g() + " entries");
            }
            iP2 = N2();
            if ((this.f16170a & W) != 0 && (iP2 == 93 || iP2 == 125)) {
                return S1(iP2);
            }
        }
        if (!this.f38351w.e()) {
            S2();
            return o2(iP2);
        }
        T2();
        this.f38351w.q(t2(iP2));
        this.f38365b = gVar2;
        int iF2 = F2();
        S2();
        if (iF2 == 34) {
            this.O = true;
            this.f38352x = com.fasterxml.jackson.core.g.VALUE_STRING;
            return this.f38365b;
        }
        if (iF2 == 45) {
            gVarU2 = u2();
        } else if (iF2 == 46) {
            gVarU2 = s2();
        } else if (iF2 == 91) {
            gVarU2 = com.fasterxml.jackson.core.g.START_ARRAY;
        } else if (iF2 == 102) {
            i2();
            gVarU2 = com.fasterxml.jackson.core.g.VALUE_FALSE;
        } else if (iF2 == 110) {
            j2();
            gVarU2 = com.fasterxml.jackson.core.g.VALUE_NULL;
        } else if (iF2 == 116) {
            m2();
            gVarU2 = com.fasterxml.jackson.core.g.VALUE_TRUE;
        } else if (iF2 != 123) {
            switch (iF2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case AD_VISIBILITY_VALUE:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    gVarU2 = w2(iF2);
                    break;
                default:
                    gVarU2 = f2(iF2);
                    break;
            }
        } else {
            gVarU2 = com.fasterxml.jackson.core.g.START_OBJECT;
        }
        this.f38352x = gVarU2;
        return this.f38365b;
    }

    protected final void m2() throws JsonParseException {
        int i10;
        int i11 = this.f38343o;
        if (i11 + 3 < this.f38344p) {
            byte[] bArr = this.U;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || i10 == 93 || i10 == 125)) {
                        this.f38343o = i14;
                        return;
                    }
                }
            }
        }
        l2("true", 1);
    }

    @Override // f8.b
    protected void q1() throws IOException {
        if (this.T != null) {
            if (this.f38341m.l() || i0(com.fasterxml.jackson.core.e.a.AUTO_CLOSE_SOURCE)) {
                this.T.close();
            }
            this.T = null;
        }
    }

    protected String q2() throws JsonParseException {
        if (this.f38343o >= this.f38344p && !g2()) {
            a1(": was expecting closing ''' for field name", com.fasterxml.jackson.core.g.FIELD_NAME);
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        int iU1 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iU1 == 39) {
            return "";
        }
        int[] iArrK1 = this.N;
        int[] iArr = f39023f0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (iU1 != 39) {
            if (iArr[iU1] != 0 && iU1 != 34) {
                if (iU1 != 92) {
                    B1(iU1, "name");
                } else {
                    iU1 = U1();
                }
                if (iU1 > 127) {
                    if (i11 >= 4) {
                        if (i12 >= iArrK1.length) {
                            iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                            this.N = iArrK1;
                        }
                        iArrK1[i12] = i13;
                        i13 = 0;
                        i12++;
                        i11 = 0;
                    }
                    if (iU1 < 2048) {
                        i13 = (i13 << 8) | (iU1 >> 6) | PsExtractor.AUDIO_STREAM;
                        i11++;
                    } else {
                        int i14 = (i13 << 8) | (iU1 >> 12) | 224;
                        int i15 = i11 + 1;
                        if (i15 >= 4) {
                            if (i12 >= iArrK1.length) {
                                iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                                this.N = iArrK1;
                            }
                            iArrK1[i12] = i14;
                            i14 = 0;
                            i12++;
                            i15 = 0;
                        }
                        i13 = (i14 << 8) | ((iU1 >> 6) & 63) | 128;
                        i11 = i15 + 1;
                    }
                    iU1 = (iU1 & 63) | 128;
                }
            }
            if (i11 < 4) {
                i11++;
                iU1 |= i13 << 8;
            } else {
                if (i12 >= iArrK1.length) {
                    iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                    this.N = iArrK1;
                }
                iArrK1[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = iU1;
            if (this.f38343o >= this.f38344p && !g2()) {
                a1(" in field name", com.fasterxml.jackson.core.g.FIELD_NAME);
            }
            byte[] bArr2 = this.U;
            int i16 = this.f38343o;
            this.f38343o = i16 + 1;
            iU1 = bArr2[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i11 > 0) {
            if (i12 >= iArrK1.length) {
                iArrK1 = f8.b.K1(iArrK1, iArrK1.length);
                this.N = iArrK1;
            }
            iArrK1[i12] = p2(i13, i11);
            i12++;
        }
        String strG = this.M.G(iArrK1, i12);
        return strG == null ? W2(iArrK1, i12, i11) : strG;
    }

    protected final com.fasterxml.jackson.core.g s2() {
        return !i0(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.d()) ? f2(46) : r2(this.f38353y.k(), 0, 46, false, 0);
    }

    protected final String t2(int i10) {
        if (i10 != 34) {
            return e2(i10);
        }
        int i11 = this.f38343o;
        if (i11 + 13 > this.f38344p) {
            return j3();
        }
        byte[] bArr = this.U;
        int[] iArr = f39023f0;
        int i12 = i11 + 1;
        this.f38343o = i12;
        int i13 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i13] != 0) {
            return i13 == 34 ? "" : g3(0, i13, 0);
        }
        int i14 = i11 + 2;
        this.f38343o = i14;
        int i15 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i15] != 0) {
            return i15 == 34 ? X2(i13, 1) : g3(i13, i15, 1);
        }
        int i16 = i15 | (i13 << 8);
        int i17 = i11 + 3;
        this.f38343o = i17;
        int i18 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i18] != 0) {
            return i18 == 34 ? X2(i16, 2) : g3(i16, i18, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i20 = i11 + 4;
        this.f38343o = i20;
        int i21 = bArr[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i21] != 0) {
            return i21 == 34 ? X2(i19, 3) : g3(i19, i21, 3);
        }
        int i22 = (i19 << 8) | i21;
        this.f38343o = i11 + 5;
        int i23 = bArr[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[i23] != 0) {
            return i23 == 34 ? X2(i22, 4) : g3(i22, i23, 4);
        }
        this.P = i22;
        return e3(i23);
    }

    protected com.fasterxml.jackson.core.g u2() throws JsonParseException {
        char[] cArrK = this.f38353y.k();
        cArrK[0] = '-';
        if (this.f38343o >= this.f38344p) {
            h2();
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        int iU2 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iU2 <= 48) {
            if (iU2 != 48) {
                return d2(iU2, true);
            }
            iU2 = U2();
        } else if (iU2 > 57) {
            return d2(iU2, true);
        }
        cArrK[1] = (char) iU2;
        int i11 = 2;
        int iMin = Math.min(this.f38344p, (this.f38343o + cArrK.length) - 2);
        int i12 = 1;
        while (true) {
            int i13 = this.f38343o;
            if (i13 >= iMin) {
                return v2(cArrK, i11, true, i12);
            }
            byte[] bArr2 = this.U;
            this.f38343o = i13 + 1;
            int i14 = bArr2[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i14 < 48 || i14 > 57) {
                if (i14 == 46 || i14 == 101 || i14 == 69) {
                    return r2(cArrK, i11, i14, true, i12);
                }
                this.f38343o = i13;
                this.f38353y.y(i11);
                if (this.f38351w.f()) {
                    V2(i14);
                }
                return O1(true, i12);
            }
            i12++;
            cArrK[i11] = (char) i14;
            i11++;
        }
    }

    protected com.fasterxml.jackson.core.g w2(int i10) throws JsonParseException {
        char[] cArrK = this.f38353y.k();
        if (i10 == 48) {
            i10 = U2();
        }
        cArrK[0] = (char) i10;
        int iMin = Math.min(this.f38344p, (this.f38343o + cArrK.length) - 1);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = this.f38343o;
            if (i13 >= iMin) {
                return v2(cArrK, i11, false, i12);
            }
            byte[] bArr = this.U;
            this.f38343o = i13 + 1;
            int i14 = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i14 < 48 || i14 > 57) {
                if (i14 == 46 || i14 == 101 || i14 == 69) {
                    return r2(cArrK, i11, i14, false, i12);
                }
                this.f38343o = i13;
                this.f38353y.y(i11);
                if (this.f38351w.f()) {
                    V2(i14);
                }
                return O1(false, i12);
            }
            i12++;
            cArrK[i11] = (char) i14;
            i11++;
        }
    }

    protected void x2(int i10) throws JsonParseException {
        if (i10 < 32) {
            f1(i10);
        }
        y2(i10);
    }

    @Override // f8.b
    protected void y1() {
        byte[] bArr;
        byte[] bArr2;
        super.y1();
        this.M.N();
        if (!this.V || (bArr = this.U) == null || bArr == (bArr2 = f8.c.f38355c)) {
            return;
        }
        this.U = bArr2;
        this.f38341m.o(bArr);
    }

    protected void y2(int i10) throws JsonParseException {
        V0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    protected void z2(int i10) throws JsonParseException {
        V0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    protected void C2(String str, String str2) throws JsonParseException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.f38343o < this.f38344p || g2()) {
                byte[] bArr = this.U;
                int i10 = this.f38343o;
                this.f38343o = i10 + 1;
                char cT1 = (char) T1(bArr[i10]);
                if (Character.isJavaIdentifierPart(cT1)) {
                    sb2.append(cT1);
                }
            }
            X0("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append(UoyZyZEcGYBpIg.sEAbq);
        X0("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    protected String j3() throws JsonEOFException {
        if (this.f38343o >= this.f38344p && !g2()) {
            a1(IAoPeRfJn.wKdB, com.fasterxml.jackson.core.g.FIELD_NAME);
        }
        byte[] bArr = this.U;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return i11 == 34 ? "" : c3(this.N, 0, 0, i11, 0);
    }

    private final void D2() throws JsonParseException {
        int[] iArrH = com.fasterxml.jackson.core.io.a.h();
        while (true) {
            if (this.f38343o >= this.f38344p && !g2()) {
                break;
            }
            byte[] bArr = this.U;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = iArrH[i12];
            if (i13 != 0) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 10) {
                                if (i13 != 13) {
                                    if (i13 != 42) {
                                        x2(i12);
                                    } else {
                                        if (i11 >= this.f38344p && !g2()) {
                                            break;
                                        }
                                        byte[] bArr2 = this.U;
                                        int i14 = this.f38343o;
                                        if (bArr2[i14] == 47) {
                                            this.f38343o = i14 + 1;
                                            return;
                                        }
                                    }
                                } else {
                                    E2();
                                }
                            } else {
                                this.f38346r++;
                                this.f38347s = i11;
                            }
                        } else {
                            M2(i12);
                        }
                    } else {
                        L2();
                    }
                } else {
                    K2();
                }
            }
        }
        a1(KPtaxpyICj.XUiPpfVHOYzisN, null);
    }
}
