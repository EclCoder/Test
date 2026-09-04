package g8;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f39005v = com.fasterxml.jackson.core.io.a.d();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f39006w = {110, 117, 108, 108};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f39007x = {116, 114, 117, 101};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte[] f39008y = {102, 97, 108, 115, 101};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final OutputStream f39009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f39010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected byte[] f39011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f39012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final int f39013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final int f39014r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected char[] f39015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f39016t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f39017u;

    public h(com.fasterxml.jackson.core.io.b bVar, int i10, com.fasterxml.jackson.core.h hVar, OutputStream outputStream, char c10) {
        super(bVar, i10, hVar);
        this.f39009m = outputStream;
        this.f39010n = (byte) c10;
        if (c10 != '\"') {
            this.f38969h = com.fasterxml.jackson.core.io.a.g(c10);
        }
        this.f39017u = true;
        byte[] bArrH = bVar.h();
        this.f39011o = bArrH;
        int length = bArrH.length;
        this.f39013q = length;
        this.f39014r = length >> 3;
        char[] cArrD = bVar.d();
        this.f39015s = cArrD;
        this.f39016t = cArrD.length;
        if (b1(com.fasterxml.jackson.core.c.a.ESCAPE_NON_ASCII)) {
            e1(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
    }

    private final void A1(char[] cArr, int i10, int i11) throws IOException {
        if (this.f39012p + ((i11 - i10) * 6) > this.f39013q) {
            g1();
        }
        int iH1 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        int i12 = this.f38970i;
        while (i10 < i11) {
            i10++;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i13 = iArr[c10];
                if (i13 == 0) {
                    bArr[iH1] = (byte) c10;
                    iH1++;
                } else if (i13 > 0) {
                    int i14 = iH1 + 1;
                    bArr[iH1] = 92;
                    iH1 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iH1 = n1(c10, iH1);
                }
            } else if (c10 > i12) {
                iH1 = n1(c10, iH1);
            } else if (c10 <= 2047) {
                int i15 = iH1 + 1;
                bArr[iH1] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
                iH1 += 2;
                bArr[i15] = (byte) ((c10 & '?') | 128);
            } else {
                iH1 = h1(c10, iH1);
            }
        }
        this.f39012p = iH1;
    }

    private final void B1(String str, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this.f39014r, i11);
            if (this.f39012p + iMin > this.f39013q) {
                g1();
            }
            v1(str, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final void C1(String str, boolean z10) throws IOException {
        if (z10) {
            if (this.f39012p >= this.f39013q) {
                g1();
            }
            byte[] bArr = this.f39011o;
            int i10 = this.f39012p;
            this.f39012p = i10 + 1;
            bArr[i10] = this.f39010n;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int iMin = Math.min(this.f39014r, length);
            if (this.f39012p + iMin > this.f39013q) {
                g1();
            }
            v1(str, i11, iMin);
            i11 += iMin;
            length -= iMin;
        }
        if (z10) {
            if (this.f39012p >= this.f39013q) {
                g1();
            }
            byte[] bArr2 = this.f39011o;
            int i12 = this.f39012p;
            this.f39012p = i12 + 1;
            bArr2[i12] = this.f39010n;
        }
    }

    private final void D1(char[] cArr, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this.f39014r, i11);
            if (this.f39012p + iMin > this.f39013q) {
                g1();
            }
            w1(cArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final int h1(int i10, int i11) {
        byte[] bArr = this.f39011o;
        if (i10 < 55296 || i10 > 57343) {
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr[i11] = 92;
        bArr[i11 + 1] = 117;
        byte[] bArr2 = f39005v;
        bArr[i11 + 2] = bArr2[(i10 >> 12) & 15];
        bArr[i11 + 3] = bArr2[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr[i11 + 4] = bArr2[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr[i14] = bArr2[i10 & 15];
        return i15;
    }

    private final int i1(int i10, char[] cArr, int i11, int i12) throws IOException {
        if (i10 >= 55296 && i10 <= 57343) {
            if (i11 >= i12 || cArr == null) {
                c(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i10)));
            }
            j1(i10, cArr[i11]);
            return i11 + 1;
        }
        byte[] bArr = this.f39011o;
        int i13 = this.f39012p;
        int i14 = i13 + 1;
        this.f39012p = i14;
        bArr[i13] = (byte) ((i10 >> 12) | 224);
        int i15 = i13 + 2;
        this.f39012p = i15;
        bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
        this.f39012p = i13 + 3;
        bArr[i15] = (byte) ((i10 & 63) | 128);
        return i11;
    }

    private final void m1(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f39012p + length > this.f39013q) {
            g1();
            if (length > 512) {
                this.f39009m.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f39011o, this.f39012p, length);
        this.f39012p += length;
    }

    private int n1(int i10, int i11) {
        int i12;
        byte[] bArr = this.f39011o;
        bArr[i11] = 92;
        int i13 = i11 + 2;
        bArr[i11 + 1] = 117;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            byte[] bArr2 = f39005v;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = 48;
            i12 = i11 + 4;
            bArr[i16] = 48;
        }
        int i17 = i12 + 1;
        byte[] bArr3 = f39005v;
        bArr[i12] = bArr3[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr3[i10 & 15];
        return i18;
    }

    private final void o1() throws IOException {
        if (this.f39012p + 4 >= this.f39013q) {
            g1();
        }
        System.arraycopy(f39006w, 0, this.f39011o, this.f39012p, 4);
        this.f39012p += 4;
    }

    private final void q1(int i10) throws IOException {
        if (this.f39012p + 13 >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i11 = this.f39012p;
        int i12 = i11 + 1;
        this.f39012p = i12;
        bArr[i11] = this.f39010n;
        int iQ = com.fasterxml.jackson.core.io.f.q(i10, bArr, i12);
        byte[] bArr2 = this.f39011o;
        this.f39012p = iQ + 1;
        bArr2[iQ] = this.f39010n;
    }

    private final void r1(long j10) throws IOException {
        if (this.f39012p + 23 >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        int i11 = i10 + 1;
        this.f39012p = i11;
        bArr[i10] = this.f39010n;
        int iS = com.fasterxml.jackson.core.io.f.s(j10, bArr, i11);
        byte[] bArr2 = this.f39011o;
        this.f39012p = iS + 1;
        bArr2[iS] = this.f39010n;
    }

    private final void s1(String str) throws IOException {
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = this.f39010n;
        N0(str);
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr2 = this.f39011o;
        int i11 = this.f39012p;
        this.f39012p = i11 + 1;
        bArr2[i11] = this.f39010n;
    }

    private void t1(char[] cArr, int i10, int i11) throws IOException {
        while (i10 < i11) {
            do {
                char c10 = cArr[i10];
                if (c10 > 127) {
                    i10++;
                    if (c10 < 2048) {
                        byte[] bArr = this.f39011o;
                        int i12 = this.f39012p;
                        int i13 = i12 + 1;
                        this.f39012p = i13;
                        bArr[i12] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.f39012p = i12 + 2;
                        bArr[i13] = (byte) ((c10 & '?') | 128);
                    } else {
                        i10 = i1(c10, cArr, i10, i11);
                    }
                } else {
                    byte[] bArr2 = this.f39011o;
                    int i14 = this.f39012p;
                    this.f39012p = i14 + 1;
                    bArr2[i14] = (byte) c10;
                    i10++;
                }
            } while (i10 < i11);
            return;
        }
    }

    private final void u1(char[] cArr, int i10, int i11) throws IOException {
        int i12 = this.f39013q;
        byte[] bArr = this.f39011o;
        int i13 = i11 + i10;
        while (i10 < i13) {
            do {
                char c10 = cArr[i10];
                if (c10 >= 128) {
                    if (this.f39012p + 3 >= this.f39013q) {
                        g1();
                    }
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 < 2048) {
                        int i15 = this.f39012p;
                        int i16 = i15 + 1;
                        this.f39012p = i16;
                        bArr[i15] = (byte) ((c11 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.f39012p = i15 + 2;
                        bArr[i16] = (byte) ((c11 & '?') | 128);
                        i10 = i14;
                    } else {
                        i10 = i1(c11, cArr, i14, i13);
                    }
                } else {
                    if (this.f39012p >= i12) {
                        g1();
                    }
                    int i17 = this.f39012p;
                    this.f39012p = i17 + 1;
                    bArr[i17] = (byte) c10;
                    i10++;
                }
            } while (i10 < i13);
            return;
        }
    }

    private final void v1(String str, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        while (i10 < i12) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i10++;
            i13++;
        }
        this.f39012p = i13;
        if (i10 < i12) {
            if (this.f38970i == 0) {
                x1(str, i10, i12);
            } else {
                z1(str, i10, i12);
            }
        }
    }

    private final void w1(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this.f39012p = i13;
        if (i10 < i12) {
            if (this.f38970i == 0) {
                y1(cArr, i10, i12);
            } else {
                A1(cArr, i10, i12);
            }
        }
    }

    private final void x1(String str, int i10, int i11) throws IOException {
        if (this.f39012p + ((i11 - i10) * 6) > this.f39013q) {
            g1();
        }
        int iH1 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        while (i10 < i11) {
            i10++;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i12 = iArr[cCharAt];
                if (i12 == 0) {
                    bArr[iH1] = (byte) cCharAt;
                    iH1++;
                } else if (i12 > 0) {
                    int i13 = iH1 + 1;
                    bArr[iH1] = 92;
                    iH1 += 2;
                    bArr[i13] = (byte) i12;
                } else {
                    iH1 = n1(cCharAt, iH1);
                }
            } else if (cCharAt <= 2047) {
                int i14 = iH1 + 1;
                bArr[iH1] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                iH1 += 2;
                bArr[i14] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH1 = h1(cCharAt, iH1);
            }
        }
        this.f39012p = iH1;
    }

    private final void y1(char[] cArr, int i10, int i11) throws IOException {
        if (this.f39012p + ((i11 - i10) * 6) > this.f39013q) {
            g1();
        }
        int iH1 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        while (i10 < i11) {
            i10++;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i12 = iArr[c10];
                if (i12 == 0) {
                    bArr[iH1] = (byte) c10;
                    iH1++;
                } else if (i12 > 0) {
                    int i13 = iH1 + 1;
                    bArr[iH1] = 92;
                    iH1 += 2;
                    bArr[i13] = (byte) i12;
                } else {
                    iH1 = n1(c10, iH1);
                }
            } else if (c10 <= 2047) {
                int i14 = iH1 + 1;
                bArr[iH1] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
                iH1 += 2;
                bArr[i14] = (byte) ((c10 & '?') | 128);
            } else {
                iH1 = h1(c10, iH1);
            }
        }
        this.f39012p = iH1;
    }

    private final void z1(String str, int i10, int i11) throws IOException {
        if (this.f39012p + ((i11 - i10) * 6) > this.f39013q) {
            g1();
        }
        int iH1 = this.f39012p;
        byte[] bArr = this.f39011o;
        int[] iArr = this.f38969h;
        int i12 = this.f38970i;
        while (i10 < i11) {
            i10++;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i13 = iArr[cCharAt];
                if (i13 == 0) {
                    bArr[iH1] = (byte) cCharAt;
                    iH1++;
                } else if (i13 > 0) {
                    int i14 = iH1 + 1;
                    bArr[iH1] = 92;
                    iH1 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iH1 = n1(cCharAt, iH1);
                }
            } else if (cCharAt > i12) {
                iH1 = n1(cCharAt, iH1);
            } else if (cCharAt <= 2047) {
                int i15 = iH1 + 1;
                bArr[iH1] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                iH1 += 2;
                bArr[i15] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH1 = h1(cCharAt, iH1);
            }
        }
        this.f39012p = iH1;
    }

    public void E1(String str, int i10, int i11) throws IOException {
        char c10;
        char[] cArr = this.f39015s;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            T0(cArr, 0, i11);
            return;
        }
        int i12 = this.f39013q;
        int iMin = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        while (i11 > 0) {
            int iMin2 = Math.min(iMin, i11);
            str.getChars(i10, i10 + iMin2, cArr, 0);
            if (this.f39012p + i13 > this.f39013q) {
                g1();
            }
            if (iMin2 > 1 && (c10 = cArr[iMin2 - 1]) >= 55296 && c10 <= 56319) {
                iMin2--;
            }
            t1(cArr, 0, iMin2);
            i10 += iMin2;
            i11 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void F0(char c10) throws IOException {
        if (this.f39012p + 3 >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        if (c10 <= 127) {
            int i10 = this.f39012p;
            this.f39012p = i10 + 1;
            bArr[i10] = (byte) c10;
        } else {
            if (c10 >= 2048) {
                i1(c10, null, 0, 0);
                return;
            }
            int i11 = this.f39012p;
            int i12 = i11 + 1;
            this.f39012p = i12;
            bArr[i11] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
            this.f39012p = i11 + 2;
            bArr[i12] = (byte) ((c10 & '?') | 128);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void K0(com.fasterxml.jackson.core.j jVar) throws IOException {
        int iB = jVar.b(this.f39011o, this.f39012p);
        if (iB < 0) {
            m1(jVar.d());
        } else {
            this.f39012p += iB;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void N0(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f39015s;
        if (length > cArr.length) {
            E1(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            T0(cArr, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public final void T0(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i11 + i11;
        int i13 = this.f39012p + i12;
        int i14 = this.f39013q;
        if (i13 > i14) {
            if (i14 < i12) {
                u1(cArr, i10, i11);
                return;
            }
            g1();
        }
        int i15 = i11 + i10;
        while (i10 < i15) {
            do {
                char c10 = cArr[i10];
                if (c10 > 127) {
                    i10++;
                    if (c10 < 2048) {
                        byte[] bArr = this.f39011o;
                        int i16 = this.f39012p;
                        int i17 = i16 + 1;
                        this.f39012p = i17;
                        bArr[i16] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.f39012p = i16 + 2;
                        bArr[i17] = (byte) ((c10 & '?') | 128);
                    } else {
                        i10 = i1(c10, cArr, i10, i15);
                    }
                } else {
                    byte[] bArr2 = this.f39011o;
                    int i18 = this.f39012p;
                    this.f39012p = i18 + 1;
                    bArr2[i18] = (byte) c10;
                    i10++;
                }
            } while (i10 < i15);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public final void U0() throws IOException {
        l1("start an array");
        this.f38339d = this.f38339d.j();
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.k(this);
            return;
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = 91;
    }

    @Override // com.fasterxml.jackson.core.c
    public final void V0() throws IOException {
        l1("start an object");
        this.f38339d = this.f38339d.k();
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.a(this);
            return;
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = 123;
    }

    @Override // com.fasterxml.jackson.core.c
    public void W0(String str) throws IOException {
        l1("write a string");
        if (str == null) {
            o1();
            return;
        }
        int length = str.length();
        if (length > this.f39014r) {
            C1(str, true);
            return;
        }
        if (this.f39012p + length >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = this.f39010n;
        v1(str, 0, length);
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr2 = this.f39011o;
        int i11 = this.f39012p;
        this.f39012p = i11 + 1;
        bArr2[i11] = this.f39010n;
    }

    @Override // com.fasterxml.jackson.core.c
    public void c0(float f10) throws IOException {
        if (this.f38338c || (com.fasterxml.jackson.core.io.f.p(f10) && com.fasterxml.jackson.core.c.a.QUOTE_NON_NUMERIC_NUMBERS.h(this.f38337b))) {
            W0(String.valueOf(f10));
        } else {
            l1("write a number");
            N0(String.valueOf(f10));
        }
    }

    @Override // f8.a, com.fasterxml.jackson.core.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f39011o != null && b1(com.fasterxml.jackson.core.c.a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                com.fasterxml.jackson.core.f fVarA1 = a1();
                if (!fVarA1.d()) {
                    if (!fVarA1.e()) {
                        break;
                    } else {
                        q();
                    }
                } else {
                    m();
                }
            }
        }
        g1();
        this.f39012p = 0;
        if (this.f39009m != null) {
            if (this.f38968g.l() || b1(com.fasterxml.jackson.core.c.a.AUTO_CLOSE_TARGET)) {
                this.f39009m.close();
            } else if (b1(com.fasterxml.jackson.core.c.a.FLUSH_PASSED_TO_STREAM)) {
                this.f39009m.flush();
            }
        }
        k1();
    }

    @Override // com.fasterxml.jackson.core.c
    public void d0(int i10) throws IOException {
        l1("write a number");
        if (this.f39012p + 11 >= this.f39013q) {
            g1();
        }
        if (this.f38338c) {
            q1(i10);
        } else {
            this.f39012p = com.fasterxml.jackson.core.io.f.q(i10, this.f39011o, this.f39012p);
        }
    }

    @Override // com.fasterxml.jackson.core.c, java.io.Flushable
    public void flush() throws IOException {
        g1();
        if (this.f39009m == null || !b1(com.fasterxml.jackson.core.c.a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f39009m.flush();
    }

    @Override // com.fasterxml.jackson.core.c
    public void g0(long j10) throws IOException {
        l1("write a number");
        if (this.f38338c) {
            r1(j10);
            return;
        }
        if (this.f39012p + 21 >= this.f39013q) {
            g1();
        }
        this.f39012p = com.fasterxml.jackson.core.io.f.s(j10, this.f39011o, this.f39012p);
    }

    protected final void g1() throws IOException {
        int i10 = this.f39012p;
        if (i10 > 0) {
            this.f39012p = 0;
            this.f39009m.write(this.f39011o, 0, i10);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void i0(String str) throws IOException {
        l1("write a number");
        if (this.f38338c) {
            s1(str);
        } else {
            N0(str);
        }
    }

    protected final void j1(int i10, int i11) throws IOException {
        int iZ0 = Z0(i10, i11);
        if (this.f39012p + 4 > this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i12 = this.f39012p;
        int i13 = i12 + 1;
        this.f39012p = i13;
        bArr[i12] = (byte) ((iZ0 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        int i14 = i12 + 2;
        this.f39012p = i14;
        bArr[i13] = (byte) (((iZ0 >> 12) & 63) | 128);
        int i15 = i12 + 3;
        this.f39012p = i15;
        bArr[i14] = (byte) (((iZ0 >> 6) & 63) | 128);
        this.f39012p = i12 + 4;
        bArr[i15] = (byte) ((iZ0 & 63) | 128);
    }

    protected void k1() {
        byte[] bArr = this.f39011o;
        if (bArr != null && this.f39017u) {
            this.f39011o = null;
            this.f38968g.q(bArr);
        }
        char[] cArr = this.f39015s;
        if (cArr != null) {
            this.f39015s = null;
            this.f38968g.m(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void l(boolean z10) throws IOException {
        l1("write a boolean value");
        if (this.f39012p + 5 >= this.f39013q) {
            g1();
        }
        byte[] bArr = z10 ? f39007x : f39008y;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f39011o, this.f39012p, length);
        this.f39012p += length;
    }

    protected final void l1(String str) throws IOException {
        byte b10;
        int iO = this.f38339d.o();
        if (this.f16150a != null) {
            d1(str, iO);
            return;
        }
        if (iO == 1) {
            b10 = 44;
        } else {
            if (iO != 2) {
                if (iO != 3) {
                    if (iO != 5) {
                        return;
                    }
                    c1(str);
                    return;
                }
                com.fasterxml.jackson.core.j jVar = this.f38971j;
                if (jVar != null) {
                    byte[] bArrD = jVar.d();
                    if (bArrD.length > 0) {
                        m1(bArrD);
                        return;
                    }
                    return;
                }
                return;
            }
            b10 = 58;
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // com.fasterxml.jackson.core.c
    public final void m() throws IOException {
        if (!this.f38339d.d()) {
            c("Current context not Array but " + this.f38339d.g());
        }
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.h(this, this.f38339d.c());
        } else {
            if (this.f39012p >= this.f39013q) {
                g1();
            }
            byte[] bArr = this.f39011o;
            int i10 = this.f39012p;
            this.f39012p = i10 + 1;
            bArr[i10] = 93;
        }
        this.f38339d = this.f38339d.i();
    }

    @Override // com.fasterxml.jackson.core.c
    public void m0(BigDecimal bigDecimal) throws IOException {
        l1("write a number");
        if (bigDecimal == null) {
            o1();
        } else if (this.f38338c) {
            s1(X0(bigDecimal));
        } else {
            N0(X0(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void p0(BigInteger bigInteger) throws IOException {
        l1("write a number");
        if (bigInteger == null) {
            o1();
        } else if (this.f38338c) {
            s1(bigInteger.toString());
        } else {
            N0(bigInteger.toString());
        }
    }

    protected final void p1(String str) throws IOException {
        int iN = this.f38339d.n(str);
        if (iN == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (iN == 1) {
            this.f16150a.g(this);
        } else {
            this.f16150a.d(this);
        }
        if (this.f38972k) {
            C1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f39016t) {
            C1(str, true);
            return;
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr = this.f39011o;
        int i10 = this.f39012p;
        this.f39012p = i10 + 1;
        bArr[i10] = this.f39010n;
        str.getChars(0, length, this.f39015s, 0);
        if (length <= this.f39014r) {
            if (this.f39012p + length > this.f39013q) {
                g1();
            }
            w1(this.f39015s, 0, length);
        } else {
            D1(this.f39015s, 0, length);
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr2 = this.f39011o;
        int i11 = this.f39012p;
        this.f39012p = i11 + 1;
        bArr2[i11] = this.f39010n;
    }

    @Override // com.fasterxml.jackson.core.c
    public final void q() throws IOException {
        if (!this.f38339d.e()) {
            c("Current context not Object but " + this.f38339d.g());
        }
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.j(this, this.f38339d.c());
        } else {
            if (this.f39012p >= this.f39013q) {
                g1();
            }
            byte[] bArr = this.f39011o;
            int i10 = this.f39012p;
            this.f39012p = i10 + 1;
            bArr[i10] = 125;
        }
        this.f38339d = this.f38339d.i();
    }

    @Override // com.fasterxml.jackson.core.c
    public void r(String str) throws IOException {
        if (this.f16150a != null) {
            p1(str);
            return;
        }
        int iN = this.f38339d.n(str);
        if (iN == 4) {
            c("Can not write a field name, expecting a value");
        }
        if (iN == 1) {
            if (this.f39012p >= this.f39013q) {
                g1();
            }
            byte[] bArr = this.f39011o;
            int i10 = this.f39012p;
            this.f39012p = i10 + 1;
            bArr[i10] = 44;
        }
        if (this.f38972k) {
            C1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f39016t) {
            C1(str, true);
            return;
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr2 = this.f39011o;
        int i11 = this.f39012p;
        int i12 = i11 + 1;
        this.f39012p = i12;
        bArr2[i11] = this.f39010n;
        if (length <= this.f39014r) {
            if (i12 + length > this.f39013q) {
                g1();
            }
            v1(str, 0, length);
        } else {
            B1(str, 0, length);
        }
        if (this.f39012p >= this.f39013q) {
            g1();
        }
        byte[] bArr3 = this.f39011o;
        int i13 = this.f39012p;
        this.f39012p = i13 + 1;
        bArr3[i13] = this.f39010n;
    }

    @Override // com.fasterxml.jackson.core.c
    public void s() throws IOException {
        l1("write a null");
        o1();
    }

    @Override // com.fasterxml.jackson.core.c
    public void t(double d10) throws IOException {
        if (this.f38338c || (com.fasterxml.jackson.core.io.f.o(d10) && com.fasterxml.jackson.core.c.a.QUOTE_NON_NUMERIC_NUMBERS.h(this.f38337b))) {
            W0(String.valueOf(d10));
        } else {
            l1("write a number");
            N0(String.valueOf(d10));
        }
    }
}
