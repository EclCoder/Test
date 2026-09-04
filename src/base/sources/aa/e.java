package aa;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ob.d0;
import ob.r0;
import ob.u;
import ob.v;
import ob.y;
import ta.QXA.YSHErhbVu;
import u9.b0;
import u9.c0;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements k {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p f169c0 = new p() { // from class: aa.d
        @Override // u9.p
        public final k[] createExtractors() {
            return e.a();
        }
    };

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte[] f170d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte[] f171e0 = r0.q0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte[] f172f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f173g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final UUID f174h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Map f175i0;
    private long A;
    private long B;
    private v C;
    private v D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aa.c f176a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f177a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f178b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private m f179b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ByteBuffer f192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f198u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f202y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f203z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements aa.b {
        private b() {
        }

        @Override // aa.b
        public void a(int i10, int i11, l lVar) throws ParserException {
            e.this.k(i10, i11, lVar);
        }

        @Override // aa.b
        public void endMasterElement(int i10) throws ParserException {
            e.this.n(i10);
        }

        @Override // aa.b
        public void floatElement(int i10, double d10) {
            e.this.q(i10, d10);
        }

        @Override // aa.b
        public int getElementType(int i10) {
            return e.this.t(i10);
        }

        @Override // aa.b
        public void integerElement(int i10, long j10) throws ParserException {
            e.this.w(i10, j10);
        }

        @Override // aa.b
        public boolean isLevel1Element(int i10) {
            return e.this.y(i10);
        }

        @Override // aa.b
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            e.this.E(i10, j10, j11);
        }

        @Override // aa.b
        public void stringElement(int i10, String str) throws ParserException {
            e.this.F(i10, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class c {
        public byte[] N;
        public c0 T;
        public boolean U;
        public b0 X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b0.a f214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f215k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public h f216l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f217m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f218n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f219o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f220p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f221q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f222r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f223s = 0.0f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f224t = 0.0f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f225u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f226v = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f227w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f228x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f229y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f230z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            ob.a.e(this.X);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f215k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static Pair k(d0 d0Var) throws ParserException {
            try {
                d0Var.V(16);
                long jX = d0Var.x();
                if (jX == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair(MimeTypes.VIDEO_H263, null);
                }
                if (jX != 826496599) {
                    u.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] bArrE = d0Var.e();
                for (int iF = d0Var.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(d0 d0Var) throws ParserException {
            try {
                int iZ = d0Var.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ == 65534) {
                    d0Var.U(24);
                    if (d0Var.A() == e.f174h0.getMostSignificantBits() && d0Var.A() == e.f174h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List m(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f206b)) {
                return z10;
            }
            return this.f210f > 0;
        }

        public void j() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.a(this.X, this.f214j);
            }
        }

        public void n() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.b();
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:206:0x0429  */
        /* JADX WARN: Code duplicated, block: B:211:0x0442  */
        /* JADX WARN: Code duplicated, block: B:212:0x0444  */
        /* JADX WARN: Code duplicated, block: B:215:0x0451  */
        /* JADX WARN: Code duplicated, block: B:216:0x0463  */
        /* JADX WARN: Code duplicated, block: B:218:0x0469  */
        /* JADX WARN: Code duplicated, block: B:220:0x046d  */
        /* JADX WARN: Code duplicated, block: B:222:0x0472  */
        /* JADX WARN: Code duplicated, block: B:225:0x047a  */
        /* JADX WARN: Code duplicated, block: B:227:0x047f  */
        /* JADX WARN: Code duplicated, block: B:230:0x0484  */
        /* JADX WARN: Code duplicated, block: B:233:0x0492  */
        /* JADX WARN: Code duplicated, block: B:236:0x0498  */
        /* JADX WARN: Code duplicated, block: B:239:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:244:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:250:0x04e4  */
        /* JADX WARN: Code duplicated, block: B:251:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:253:0x04f0  */
        /* JADX WARN: Code duplicated, block: B:254:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:256:0x04fd  */
        /* JADX WARN: Code duplicated, block: B:262:0x0515  */
        /* JADX WARN: Code duplicated, block: B:264:0x053c  */
        /* JADX WARN: Code duplicated, block: B:266:0x0542  */
        /* JADX WARN: Code duplicated, block: B:282:0x056d  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        public void i(m mVar, int i10) throws ParserException {
            byte b10;
            List listSingletonList;
            String str;
            int i11;
            int i12;
            List list;
            String str2;
            int iF0;
            String str3;
            int i13;
            v0.b bVar;
            int i14;
            int iIntValue;
            int i15;
            float f10;
            int i16;
            int i17;
            int i18;
            pb.d dVarA;
            String str4 = this.f206b;
            str4.getClass();
            switch (str4.hashCode()) {
                case -2095576542:
                    if (!str4.equals("V_MPEG4/ISO/AP")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -2095575984:
                    if (!str4.equals("V_MPEG4/ISO/SP")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1985379776:
                    if (!str4.equals("A_MS/ACM")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1784763192:
                    if (!str4.equals("A_TRUEHD")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1730367663:
                    if (!str4.equals("A_VORBIS")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -1482641358:
                    if (!str4.equals("A_MPEG/L2")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -1482641357:
                    if (!str4.equals("A_MPEG/L3")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -1373388978:
                    if (!str4.equals("V_MS/VFW/FOURCC")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -933872740:
                    if (!str4.equals("S_DVBSUB")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -538363189:
                    if (!str4.equals("V_MPEG4/ISO/ASP")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case -538363109:
                    if (!str4.equals("V_MPEG4/ISO/AVC")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -425012669:
                    if (!str4.equals("S_VOBSUB")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case -356037306:
                    if (!str4.equals("A_DTS/LOSSLESS")) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case 62923557:
                    if (!str4.equals("A_AAC")) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case 62923603:
                    if (!str4.equals("A_AC3")) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case 62927045:
                    if (!str4.equals("A_DTS")) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case 82318131:
                    if (!str4.equals("V_AV1")) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case 82338133:
                    if (!str4.equals("V_VP8")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 82338134:
                    if (!str4.equals("V_VP9")) {
                        b10 = -1;
                    } else {
                        b10 = 18;
                    }
                    break;
                case 99146302:
                    if (!str4.equals("S_HDMV/PGS")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case 444813526:
                    if (!str4.equals("V_THEORA")) {
                        b10 = -1;
                    } else {
                        b10 = 20;
                    }
                    break;
                case 542569478:
                    if (!str4.equals("A_DTS/EXPRESS")) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case 635596514:
                    if (!str4.equals("A_PCM/FLOAT/IEEE")) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case 725948237:
                    if (!str4.equals("A_PCM/INT/BIG")) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 725957860:
                    if (!str4.equals(HqKnbV.Alc)) {
                        b10 = -1;
                    } else {
                        b10 = 24;
                    }
                    break;
                case 738597099:
                    if (!str4.equals("S_TEXT/ASS")) {
                        b10 = -1;
                    } else {
                        b10 = 25;
                    }
                    break;
                case 855502857:
                    if (!str4.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = -1;
                    } else {
                        b10 = 26;
                    }
                    break;
                case 1045209816:
                    if (!str4.equals("S_TEXT/WEBVTT")) {
                        b10 = -1;
                    } else {
                        b10 = 27;
                    }
                    break;
                case 1422270023:
                    if (!str4.equals("S_TEXT/UTF8")) {
                        b10 = -1;
                    } else {
                        b10 = 28;
                    }
                    break;
                case 1809237540:
                    if (!str4.equals("V_MPEG2")) {
                        b10 = -1;
                    } else {
                        b10 = 29;
                    }
                    break;
                case 1950749482:
                    if (!str4.equals("A_EAC3")) {
                        b10 = -1;
                    } else {
                        b10 = 30;
                    }
                    break;
                case 1950789798:
                    if (!str4.equals("A_FLAC")) {
                        b10 = -1;
                    } else {
                        b10 = 31;
                    }
                    break;
                case 1951062397:
                    if (!str4.equals("A_OPUS")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str5 = MimeTypes.AUDIO_RAW;
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f215k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null && (dVarA = pb.d.a(new d0(this.N))) != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z10 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i19 = i13 | (z10 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    } else if (y.s(str3)) {
                        if (this.f221q == 0) {
                            i17 = this.f219o;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f217m;
                            }
                            this.f219o = i17;
                            i18 = this.f220p;
                            if (i18 == -1) {
                                i18 = this.f218n;
                            }
                            this.f220p = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f219o;
                        if (i15 != iIntValue || (i16 = this.f220p) == iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f218n * i15) / (this.f217m * i16);
                        }
                        pb.c cVar = this.f228x ? new pb.c(this.f229y, this.A, this.f230z, h()) : null;
                        if (this.f205a != null && e.f175i0.containsKey(this.f205a)) {
                            iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                        }
                        if (this.f222r == 0 && Float.compare(this.f223s, 0.0f) == 0 && Float.compare(this.f224t, 0.0f) == 0) {
                            if (Float.compare(this.f225u, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f224t, -180.0f) != 0 || Float.compare(this.f224t, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f224t, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                        i14 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.a("Unexpected MIME type.", null);
                        }
                        i14 = 3;
                    }
                    if (this.f205a != null && !e.f175i0.containsKey(this.f205a)) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i19).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack;
                    b0VarTrack.e(v0VarG);
                    return;
                case 2:
                    if (l(new d0(g(this.f206b)))) {
                        int iF1 = r0.f0(this.P);
                        if (iF1 == 0) {
                            u.i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.P + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        } else {
                            i11 = iF1;
                            listSingletonList = null;
                            str = null;
                            i12 = -1;
                        }
                        if (this.N != null) {
                            str = dVarA.f49841c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z11 = this.V;
                        if (this.U) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i110 = i13 | (z11 ? 1 : 0);
                        bVar = new v0.b();
                        if (y.o(str3)) {
                            if (y.s(str3)) {
                                if (this.f221q == 0) {
                                    i17 = this.f219o;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f217m;
                                    }
                                    this.f219o = i17;
                                    i18 = this.f220p;
                                    if (i18 == -1) {
                                        i18 = this.f218n;
                                    }
                                    this.f220p = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f219o;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f228x) {
                                }
                                if (this.f205a != null) {
                                    iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                                }
                                if (this.f222r == 0) {
                                    if (Float.compare(this.f225u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                                i14 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.J(this.O).h0(this.Q).a0(i11);
                            i14 = 1;
                        }
                        if (this.f205a != null) {
                            bVar.W(this.f205a);
                        }
                        v0 v0VarG2 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i110).V(listSingletonList).K(str).O(this.f216l).G();
                        b0 b0VarTrack2 = mVar.track(this.f207c, i14);
                        this.X = b0VarTrack2;
                        b0VarTrack2.e(v0VarG2);
                        return;
                    }
                    u.i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z12 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111 = i13 | (z12 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG3 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i111).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack3 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack3;
                    b0VarTrack3.e(v0VarG3);
                    return;
                case 3:
                    this.T = new c0();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i112 = i13 | (z13 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG4 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i112).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack4 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack4;
                    b0VarTrack4.e(v0VarG4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f206b));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    i12 = 8192;
                    str = null;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i113 = i13 | (z14 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG5 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i113).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack5 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack5;
                    b0VarTrack5.e(v0VarG5);
                    return;
                case 5:
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i114 = i13 | (z15 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG6 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i114).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack6 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack6;
                    b0VarTrack6.e(v0VarG6);
                    return;
                case 6:
                    str5 = MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i115 = i13 | (z16 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG7 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i115).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack7 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack7;
                    b0VarTrack7.e(v0VarG7);
                    return;
                case 7:
                    Pair pairK = k(new d0(g(this.f206b)));
                    str5 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i116 = i13 | (z17 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG8 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i116).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack8 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack8;
                    b0VarTrack8.e(v0VarG8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f206b), 0, bArr2, 0, 4);
                    listSingletonList = com.google.common.collect.c0.D(bArr2);
                    str = null;
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i117 = i13 | (z18 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG9 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i117).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack9 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack9;
                    b0VarTrack9.e(v0VarG9);
                    return;
                case 10:
                    pb.a aVarB = pb.a.b(new d0(g(this.f206b)));
                    list = aVarB.f49814a;
                    this.Y = aVarB.f49815b;
                    str2 = aVarB.f49822i;
                    str5 = MimeTypes.VIDEO_H264;
                    List list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i118 = i13 | (z19 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG10 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i118).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack10 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack10;
                    b0VarTrack10.e(v0VarG10);
                    return;
                case 11:
                    listSingletonList = com.google.common.collect.c0.D(g(this.f206b));
                    str = null;
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i119 = i13 | (z110 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG11 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i119).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack11 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack11;
                    b0VarTrack11.e(v0VarG11);
                    return;
                case 12:
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1110 = i13 | (z111 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG12 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1110).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack12 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack12;
                    b0VarTrack12.e(v0VarG12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f206b));
                    q9.a.b bVarF = q9.a.f(this.f215k);
                    this.Q = bVarF.f50439a;
                    this.O = bVarF.f50440b;
                    str = bVarF.f50441c;
                    str5 = MimeTypes.AUDIO_AAC;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1111 = i13 | (z112 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG13 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1111).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack13 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack13;
                    b0VarTrack13.e(v0VarG13);
                    return;
                case 14:
                    str5 = MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z113 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1112 = i13 | (z113 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG14 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1112).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack14 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack14;
                    b0VarTrack14.e(v0VarG14);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1113 = i13 | (z114 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG15 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1113).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack15 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack15;
                    b0VarTrack15.e(v0VarG15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z115 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1114 = i13 | (z115 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG16 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1114).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack16 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack16;
                    b0VarTrack16.e(v0VarG16);
                    return;
                case 17:
                    str5 = MimeTypes.VIDEO_VP8;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1115 = i13 | (z116 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG17 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1115).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack17 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack17;
                    b0VarTrack17.e(v0VarG17);
                    return;
                case 18:
                    str5 = MimeTypes.VIDEO_VP9;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1116 = i13 | (z117 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG18 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1116).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack18 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack18;
                    b0VarTrack18.e(v0VarG18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_PGS;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1117 = i13 | (z118 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG19 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1117).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack19 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack19;
                    b0VarTrack19.e(v0VarG19);
                    return;
                case 20:
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1118 = i13 | (z119 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG110 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1118).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack110 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack110;
                    b0VarTrack110.e(v0VarG110);
                    return;
                case 22:
                    if (this.P == 32) {
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        i11 = 4;
                    } else {
                        u.i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.P + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i12 = -1;
                        i11 = -1;
                    }
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1119 = i13 | (z1110 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG111 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i1119).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack111 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack111;
                    b0VarTrack111.e(v0VarG111);
                    return;
                case 23:
                    int i20 = this.P;
                    if (i20 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i20 != 16) {
                            u.i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.P + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                            listSingletonList = null;
                            str = null;
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            i12 = -1;
                            i11 = -1;
                            if (this.N != null) {
                                str = dVarA.f49841c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z1111 = this.V;
                            if (this.U) {
                                i13 = 2;
                            } else {
                                i13 = 0;
                            }
                            int i11110 = i13 | (z1111 ? 1 : 0);
                            bVar = new v0.b();
                            if (y.o(str3)) {
                                if (y.s(str3)) {
                                    if (this.f221q == 0) {
                                        i17 = this.f219o;
                                        iIntValue = -1;
                                        if (i17 == -1) {
                                            i17 = this.f217m;
                                        }
                                        this.f219o = i17;
                                        i18 = this.f220p;
                                        if (i18 == -1) {
                                            i18 = this.f218n;
                                        }
                                        this.f220p = i18;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i15 = this.f219o;
                                    if (i15 != iIntValue) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (this.f228x) {
                                    }
                                    if (this.f205a != null) {
                                        iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                                    }
                                    if (this.f222r == 0) {
                                        if (Float.compare(this.f225u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                                    i14 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                    }
                                    i14 = 3;
                                }
                                break;
                            } else {
                                bVar.J(this.O).h0(this.Q).a0(i11);
                                i14 = 1;
                            }
                            if (this.f205a != null) {
                                bVar.W(this.f205a);
                            }
                            v0 v0VarG112 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11110).V(listSingletonList).K(str).O(this.f216l).G();
                            b0 b0VarTrack112 = mVar.track(this.f207c, i14);
                            this.X = b0VarTrack112;
                            b0VarTrack112.e(v0VarG112);
                            return;
                        }
                        iF0 = 268435456;
                        i11 = iF0;
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1112 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11111 = i13 | (z1112 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG113 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11111).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack113 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack113;
                    b0VarTrack113.e(v0VarG113);
                    return;
                case 24:
                    iF0 = r0.f0(this.P);
                    if (iF0 == 0) {
                        u.i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.P + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i12 = -1;
                        i11 = -1;
                        if (this.N != null) {
                            str = dVarA.f49841c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z1113 = this.V;
                        if (this.U) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i11112 = i13 | (z1113 ? 1 : 0);
                        bVar = new v0.b();
                        if (y.o(str3)) {
                            if (y.s(str3)) {
                                if (this.f221q == 0) {
                                    i17 = this.f219o;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f217m;
                                    }
                                    this.f219o = i17;
                                    i18 = this.f220p;
                                    if (i18 == -1) {
                                        i18 = this.f218n;
                                    }
                                    this.f220p = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f219o;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f228x) {
                                }
                                if (this.f205a != null) {
                                    iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                                }
                                if (this.f222r == 0) {
                                    if (Float.compare(this.f225u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                                i14 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.J(this.O).h0(this.Q).a0(i11);
                            i14 = 1;
                        }
                        if (this.f205a != null) {
                            bVar.W(this.f205a);
                        }
                        v0 v0VarG114 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11112).V(listSingletonList).K(str).O(this.f216l).G();
                        b0 b0VarTrack114 = mVar.track(this.f207c, i14);
                        this.X = b0VarTrack114;
                        b0VarTrack114.e(v0VarG114);
                        return;
                    }
                    i11 = iF0;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1114 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11113 = i13 | (z1114 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG115 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11113).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack115 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack115;
                    b0VarTrack115.e(v0VarG115);
                    return;
                case 25:
                    listSingletonList = com.google.common.collect.c0.E(e.f171e0, g(this.f206b));
                    str = null;
                    str5 = MimeTypes.TEXT_SSA;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1115 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11114 = i13 | (z1115 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG116 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11114).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack116 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack116;
                    b0VarTrack116.e(v0VarG116);
                    return;
                case 26:
                    pb.f fVarA = pb.f.a(new d0(g(this.f206b)));
                    list = fVarA.f49856a;
                    this.Y = fVarA.f49857b;
                    str2 = fVarA.f49864i;
                    str5 = MimeTypes.VIDEO_H265;
                    List list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1116 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11115 = i13 | (z1116 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG117 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11115).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack117 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack117;
                    b0VarTrack117.e(v0VarG117);
                    return;
                case 27:
                    str5 = MimeTypes.TEXT_VTT;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1117 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11116 = i13 | (z1117 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG118 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11116).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack118 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack118;
                    b0VarTrack118.e(v0VarG118);
                    return;
                case 28:
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1118 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11117 = i13 | (z1118 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG119 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11117).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack119 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack119;
                    b0VarTrack119.e(v0VarG119);
                    return;
                case 29:
                    str5 = MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1119 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11118 = i13 | (z1119 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG1110 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11118).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack1110 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack1110;
                    b0VarTrack1110.e(v0VarG1110);
                    return;
                case 30:
                    str5 = MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11110 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11119 = i13 | (z11110 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG1111 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i11119).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack1111 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack1111;
                    b0VarTrack1111.e(v0VarG1111);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(g(this.f206b));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11111 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111110 = i13 | (z11111 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG1112 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i111110).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack1112 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack1112;
                    b0VarTrack1112.e(v0VarG1112);
                    return;
                case 32:
                    listSingletonList = new ArrayList(3);
                    listSingletonList.add(g(this.f206b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    i12 = 5760;
                    str = null;
                    i11 = -1;
                    if (this.N != null) {
                        str = dVarA.f49841c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11112 = this.V;
                    if (this.U) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111111 = i13 | (z11112 ? 1 : 0);
                    bVar = new v0.b();
                    if (y.o(str3)) {
                        if (y.s(str3)) {
                            if (this.f221q == 0) {
                                i17 = this.f219o;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f217m;
                                }
                                this.f219o = i17;
                                i18 = this.f220p;
                                if (i18 == -1) {
                                    i18 = this.f218n;
                                }
                                this.f220p = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f219o;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f228x) {
                            }
                            if (this.f205a != null) {
                                iIntValue = ((Integer) e.f175i0.get(this.f205a)).intValue();
                            }
                            if (this.f222r == 0) {
                                if (Float.compare(this.f225u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f224t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f224t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f217m).S(this.f218n).c0(f10).f0(iIntValue).d0(this.f226v).j0(this.f227w).L(cVar);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i11);
                        i14 = 1;
                    }
                    if (this.f205a != null) {
                        bVar.W(this.f205a);
                    }
                    v0 v0VarG1113 = bVar.T(i10).g0(str3).Y(i12).X(this.W).i0(i111111).V(listSingletonList).K(str).O(this.f216l).G();
                    b0 b0VarTrack1113 = mVar.track(this.f207c, i14);
                    this.X = b0VarTrack1113;
                    b0VarTrack1113.e(v0VarG1113);
                    return;
                default:
                    throw ParserException.a("Unrecognized codec identifier.", null);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f175i0 = Collections.unmodifiableMap(map);
    }

    public e() {
        this(0);
    }

    private void A(l lVar, int i10) {
        if (this.f184g.g() >= i10) {
            return;
        }
        if (this.f184g.b() < i10) {
            d0 d0Var = this.f184g;
            d0Var.c(Math.max(d0Var.b() * 2, i10));
        }
        lVar.readFully(this.f184g.e(), this.f184g.g(), i10 - this.f184g.g());
        this.f184g.T(i10);
    }

    private void B() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f177a0 = false;
        this.f187j.Q(0);
    }

    private long C(long j10) throws ParserException {
        long j11 = this.f195r;
        if (j11 != C.TIME_UNSET) {
            return r0.U0(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void D(String str, long j10, byte[] bArr) {
        byte[] bArrR;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrR = r(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrR = r(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrR = r(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrR, 0, bArr, i10, bArrR.length);
    }

    private int G(l lVar, c cVar, int i10, boolean z10) throws ParserException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f206b)) {
            H(lVar, f170d0, i10);
            return p();
        }
        if ("S_TEXT/ASS".equals(cVar.f206b)) {
            H(lVar, f172f0, i10);
            return p();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f206b)) {
            H(lVar, f173g0, i10);
            return p();
        }
        b0 b0Var = cVar.X;
        if (!this.V) {
            if (cVar.f212h) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(this.f184g.e(), 0, 1);
                    this.S++;
                    if ((this.f184g.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = this.f184g.e()[0];
                    this.W = true;
                }
                byte b10 = this.Z;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f177a0) {
                        lVar.readFully(this.f189l.e(), 0, 8);
                        this.S += 8;
                        this.f177a0 = true;
                        this.f184g.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f184g.U(0);
                        b0Var.b(this.f184g, 1, 1);
                        this.T++;
                        this.f189l.U(0);
                        b0Var.b(this.f189l, 8, 1);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            lVar.readFully(this.f184g.e(), 0, 1);
                            this.S++;
                            this.f184g.U(0);
                            this.Y = this.f184g.H();
                            this.X = true;
                        }
                        int i12 = this.Y * 4;
                        this.f184g.Q(i12);
                        lVar.readFully(this.f184g.e(), 0, i12);
                        this.S += i12;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f192o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f192o = ByteBuffer.allocate(i13);
                        }
                        this.f192o.position(0);
                        this.f192o.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f184g.L();
                            if (i14 % 2 == 0) {
                                this.f192o.putShort((short) (iL - i15));
                            } else {
                                this.f192o.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.S) - i15;
                        if (i11 % 2 == 1) {
                            this.f192o.putInt(i16);
                        } else {
                            this.f192o.putShort((short) i16);
                            this.f192o.putInt(0);
                        }
                        this.f190m.S(this.f192o.array(), i13);
                        b0Var.b(this.f190m, i13, 1);
                        this.T += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f213i;
                if (bArr != null) {
                    this.f187j.S(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.O |= 268435456;
                this.f191n.Q(0);
                int iG = (this.f187j.g() + i10) - this.S;
                this.f184g.Q(4);
                this.f184g.e()[0] = (byte) ((iG >> 24) & 255);
                this.f184g.e()[1] = (byte) ((iG >> 16) & 255);
                this.f184g.e()[2] = (byte) ((iG >> 8) & 255);
                this.f184g.e()[3] = (byte) (iG & 255);
                b0Var.b(this.f184g, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iG2 = i10 + this.f187j.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f206b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f206b)) {
            if (cVar.T != null) {
                ob.a.g(this.f187j.g() == 0);
                cVar.T.d(lVar);
            }
            while (true) {
                int i17 = this.S;
                if (i17 >= iG2) {
                    break;
                }
                int I = I(lVar, b0Var, iG2 - i17);
                this.S += I;
                this.T += I;
            }
        } else {
            byte[] bArrE = this.f183f.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.Y;
            int i19 = 4 - i18;
            while (this.S < iG2) {
                int i20 = this.U;
                if (i20 == 0) {
                    J(lVar, bArrE, i19, i18);
                    this.S += i18;
                    this.f183f.U(0);
                    this.U = this.f183f.L();
                    this.f182e.U(0);
                    b0Var.c(this.f182e, 4);
                    this.T += 4;
                } else {
                    int I2 = I(lVar, b0Var, i20);
                    this.S += I2;
                    this.T += I2;
                    this.U -= I2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f206b)) {
            this.f185h.U(0);
            b0Var.c(this.f185h, 4);
            this.T += 4;
        }
        return p();
    }

    private void H(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f188k.b() < length) {
            this.f188k.R(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f188k.e(), 0, bArr.length);
        }
        lVar.readFully(this.f188k.e(), bArr.length, i10);
        this.f188k.U(0);
        this.f188k.T(length);
    }

    private int I(l lVar, b0 b0Var, int i10) {
        int iA = this.f187j.a();
        if (iA <= 0) {
            return b0Var.a(lVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        b0Var.c(this.f187j, iMin);
        return iMin;
    }

    private void J(l lVar, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f187j.a());
        lVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f187j.l(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ k[] a() {
        return new k[]{new e()};
    }

    private void h(int i10) throws ParserException {
        if (this.C == null || this.D == null) {
            throw ParserException.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void i(int i10) throws ParserException {
        if (this.f198u != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void j() {
        ob.a.i(this.f179b0);
    }

    private z l(v vVar, v vVar2) {
        int i10;
        if (this.f194q == -1 || this.f197t == C.TIME_UNSET || vVar == null || vVar.c() == 0 || vVar2 == null || vVar2.c() != vVar.c()) {
            return new z.b(this.f197t);
        }
        int iC = vVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = vVar.b(i12);
            jArrCopyOf[i12] = this.f194q + vVar2.b(i12);
        }
        while (true) {
            i10 = iC - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.f194q + this.f193p) - jArrCopyOf[i10]);
        long j10 = this.f197t - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            u.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new u9.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void m(c cVar, long j10, int i10, int i11, int i12) {
        int iG;
        c0 c0Var = cVar.T;
        if (c0Var != null) {
            c0Var.c(cVar.X, j10, i10, i11, i12, cVar.f214j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f206b) || "S_TEXT/ASS".equals(cVar.f206b) || "S_TEXT/WEBVTT".equals(cVar.f206b)) {
                if (this.K > 1) {
                    u.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == C.TIME_UNSET) {
                        u.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        D(cVar.f206b, j11, this.f188k.e());
                        for (int iF = this.f188k.f(); iF < this.f188k.g(); iF++) {
                            if (this.f188k.e()[iF] == 0) {
                                this.f188k.T(iF);
                                break;
                            }
                        }
                        b0 b0Var = cVar.X;
                        d0 d0Var = this.f188k;
                        b0Var.c(d0Var, d0Var.g());
                        iG = i11 + this.f188k.g();
                    }
                }
                iG = i11;
            } else {
                iG = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.K > 1) {
                    this.f191n.Q(0);
                } else {
                    int iG2 = this.f191n.g();
                    cVar.X.b(this.f191n, iG2, 2);
                    iG += iG2;
                }
            }
            cVar.X.f(j10, i10, iG, i12, cVar.f214j);
        }
        this.F = true;
    }

    private static int[] o(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int p() {
        int i10 = this.T;
        B();
        return i10;
    }

    private static byte[] r(long j10, String str, long j11) {
        ob.a.a(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return r0.q0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    private static boolean x(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean z(u9.y yVar, long j10) {
        if (this.f202y) {
            this.A = j10;
            yVar.f54333a = this.f203z;
            this.f202y = false;
            return true;
        }
        if (this.f199v) {
            long j11 = this.A;
            if (j11 != -1) {
                yVar.f54333a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    protected void E(int i10, long j10, long j11) throws ParserException {
        j();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f198u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f200w = -1;
            this.f201x = -1L;
            return;
        }
        if (i10 == 20533) {
            s(i10).f212h = true;
            return;
        }
        if (i10 == 21968) {
            s(i10).f228x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f194q;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f194q = j10;
            this.f193p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new v();
            this.D = new v();
        } else if (i10 == 524531317 && !this.f199v) {
            if (this.f181d && this.f203z != -1) {
                this.f202y = true;
            } else {
                this.f179b0.c(new z.b(this.f197t));
                this.f199v = true;
            }
        }
    }

    protected void F(int i10, String str) throws ParserException {
        if (i10 == 134) {
            s(i10).f206b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                s(i10).f205a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                s(i10).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // u9.k
    public final void b(m mVar) {
        this.f179b0 = mVar;
    }

    @Override // u9.k
    public final int c(l lVar, u9.y yVar) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f176a.a(lVar);
            if (zA && z(yVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f180c.size(); i10++) {
            c cVar = (c) this.f180c.valueAt(i10);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // u9.k
    public final boolean d(l lVar) {
        return new f().b(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void k(int i10, int i11, l lVar) throws ParserException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        l lVar2 = lVar;
        int i21 = 0;
        int i22 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.G != 2) {
                    return;
                }
                v((c) this.f180c.get(this.M), this.P, lVar2, i11);
                return;
            }
            if (i10 == 16877) {
                u(s(i10), lVar2, i11);
                return;
            }
            if (i10 == 16981) {
                i(i10);
                byte[] bArr = new byte[i11];
                this.f198u.f213i = bArr;
                lVar2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                lVar2.readFully(bArr2, 0, i11);
                s(i10).f214j = new b0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f186i.e(), (byte) 0);
                lVar2.readFully(this.f186i.e(), 4 - i11, i11);
                this.f186i.U(0);
                this.f200w = (int) this.f186i.J();
                return;
            }
            if (i10 == 25506) {
                i(i10);
                byte[] bArr3 = new byte[i11];
                this.f198u.f215k = bArr3;
                lVar2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.a("Unexpected id: " + i10, null);
            }
            i(i10);
            byte[] bArr4 = new byte[i11];
            this.f198u.f226v = bArr4;
            lVar2.readFully(bArr4, 0, i11);
            return;
        }
        int i23 = 8;
        if (this.G == 0) {
            this.M = (int) this.f178b.d(lVar2, false, true, 8);
            this.N = this.f178b.b();
            this.I = C.TIME_UNSET;
            this.G = 1;
            this.f184g.Q(0);
        }
        c cVar = (c) this.f180c.get(this.M);
        if (cVar == null) {
            lVar2.skipFully(i11 - this.N);
            this.G = 0;
            return;
        }
        cVar.f();
        if (this.G == 1) {
            A(lVar2, 3);
            int i24 = (this.f184g.e()[2] & 6) >> 1;
            if (i24 == 0) {
                this.K = 1;
                int[] iArrO = o(this.L, 1);
                this.L = iArrO;
                iArrO[0] = (i11 - this.N) - 3;
            } else {
                A(lVar2, 4);
                int i25 = (this.f184g.e()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.K = i25;
                int[] iArrO2 = o(this.L, i25);
                this.L = iArrO2;
                if (i24 == 2) {
                    int i26 = (i11 - this.N) - 4;
                    int i27 = this.K;
                    Arrays.fill(iArrO2, 0, i27, i26 / i27);
                } else {
                    if (i24 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i17 = this.K;
                            if (i28 >= i17 - 1) {
                                break;
                            }
                            this.L[i28] = 0;
                            while (true) {
                                i18 = i30 + 1;
                                A(lVar2, i18);
                                int i31 = this.f184g.e()[i30] & 255;
                                int[] iArr = this.L;
                                i19 = iArr[i28] + i31;
                                iArr[i28] = i19;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i18;
                                }
                            }
                            i29 += i19;
                            i28++;
                            i30 = i18;
                        }
                        this.L[i17 - 1] = ((i11 - this.N) - i30) - i29;
                    } else {
                        if (i24 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i24, null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.K;
                            i12 = i22;
                            if (i32 >= i35 - 1) {
                                i13 = i21;
                                this.L[i35 - 1] = ((i11 - this.N) - i34) - i33;
                                break;
                            }
                            this.L[i32] = i21;
                            int i36 = i34 + 1;
                            A(lVar2, i36);
                            if (this.f184g.e()[i34] == 0) {
                                throw ParserException.a("No valid varint length mask found", null);
                            }
                            int i37 = i21;
                            while (true) {
                                if (i37 >= i23) {
                                    i14 = i21;
                                    i15 = i23;
                                    i16 = i32;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i23;
                                int i38 = i12 << (7 - i37);
                                i14 = i21;
                                if ((this.f184g.e()[i34] & i38) != 0) {
                                    i36 += i37;
                                    A(lVar2, i36);
                                    int i39 = i34 + 1;
                                    j10 = this.f184g.e()[i34] & 255 & (~i38);
                                    while (true) {
                                        int i40 = i39;
                                        if (i40 >= i36) {
                                            break;
                                        }
                                        i39 = i40 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f184g.e()[i40] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                        i32 = i32;
                                    }
                                    i16 = i32;
                                    if (i16 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i37 * 7) + 6)) - 1;
                                    break;
                                }
                                i37++;
                                lVar2 = lVar;
                                i21 = i14;
                                i23 = i15;
                            }
                            i34 = i36;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            int i41 = (int) j10;
                            int[] iArr2 = this.L;
                            if (i16 != 0) {
                                i41 += iArr2[i16 - 1];
                            }
                            iArr2[i16] = i41;
                            i33 += i41;
                            i32 = i16 + 1;
                            lVar2 = lVar;
                            i22 = i12;
                            i21 = i14;
                            i23 = i15;
                        }
                    }
                    this.H = this.B + C((this.f184g.e()[i13] << 8) | (this.f184g.e()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    if (cVar.f208d != 2 || (i10 == 163 && (this.f184g.e()[2] & 128) == 128)) {
                        i20 = i12;
                    } else {
                        i20 = i13;
                    }
                    this.O = i20;
                    this.G = 2;
                    this.J = i13;
                }
            }
            i13 = 0;
            i12 = 1;
            this.H = this.B + C((this.f184g.e()[i13] << 8) | (this.f184g.e()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (cVar.f208d != 2) {
                i20 = i12;
            } else {
                i20 = i12;
            }
            this.O = i20;
            this.G = 2;
            this.J = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i42 = this.J;
                if (i42 >= this.K) {
                    this.G = 0;
                    return;
                }
                int iG = G(lVar, cVar, this.L[i42], false);
                c cVar2 = cVar;
                m(cVar2, this.H + ((long) ((this.J * cVar.f209e) / 1000)), this.O, iG, 0);
                this.J++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i43 = this.J;
                if (i43 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                boolean z10 = i12;
                iArr3[i43] = G(lVar, cVar, iArr3[i43], z10);
                this.J += z10 ? 1 : 0;
            }
        }
    }

    protected void q(int i10, double d10) {
        if (i10 == 181) {
            s(i10).Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f196s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                s(i10).D = (float) d10;
                break;
            case 21970:
                s(i10).E = (float) d10;
                break;
            case 21971:
                s(i10).F = (float) d10;
                break;
            case 21972:
                s(i10).G = (float) d10;
                break;
            case 21973:
                s(i10).H = (float) d10;
                break;
            case 21974:
                s(i10).I = (float) d10;
                break;
            case 21975:
                s(i10).J = (float) d10;
                break;
            case 21976:
                s(i10).K = (float) d10;
                break;
            case 21977:
                s(i10).L = (float) d10;
                break;
            case 21978:
                s(i10).M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        s(i10).f223s = (float) d10;
                        break;
                    case 30324:
                        s(i10).f224t = (float) d10;
                        break;
                    case 30325:
                        s(i10).f225u = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // u9.k
    public final void release() {
    }

    protected c s(int i10) throws ParserException {
        i(i10);
        return this.f198u;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        this.f176a.reset();
        this.f178b.e();
        B();
        for (int i10 = 0; i10 < this.f180c.size(); i10++) {
            ((c) this.f180c.valueAt(i10)).n();
        }
    }

    protected int t(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case PRIVACY_URL_ERROR_VALUE:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void u(c cVar, l lVar, int i10) {
        if (cVar.f211g != 1685485123 && cVar.f211g != 1685480259) {
            lVar.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        lVar.readFully(bArr, 0, i10);
    }

    protected void v(c cVar, int i10, l lVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f206b)) {
            lVar.skipFully(i11);
        } else {
            this.f191n.Q(i11);
            lVar.readFully(this.f191n.e(), 0, i11);
        }
    }

    protected void w(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                s(i10).f208d = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                s(i10).V = j10 == 1;
                return;
            case 155:
                this.I = C(j10);
                return;
            case 159:
                s(i10).O = (int) j10;
                return;
            case 176:
                s(i10).f217m = (int) j10;
                return;
            case 179:
                h(i10);
                this.C.a(C(j10));
                return;
            case 186:
                s(i10).f218n = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                s(i10).f207c = (int) j10;
                return;
            case 231:
                this.B = C(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                h(i10);
                this.D.a(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                s(i10).f211g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f201x = j10 + this.f194q;
                return;
            case 21432:
                int i11 = (int) j10;
                i(i10);
                if (i11 == 0) {
                    this.f198u.f227w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f198u.f227w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f198u.f227w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f198u.f227w = 3;
                    return;
                }
            case 21680:
                s(i10).f219o = (int) j10;
                return;
            case 21682:
                s(i10).f221q = (int) j10;
                return;
            case 21690:
                s(i10).f220p = (int) j10;
                return;
            case 21930:
                s(i10).U = j10 == 1;
                return;
            case 21998:
                s(i10).f210f = (int) j10;
                return;
            case 22186:
                s(i10).R = j10;
                return;
            case 22203:
                s(i10).S = j10;
                return;
            case 25188:
                s(i10).P = (int) j10;
                return;
            case 30114:
                this.R = j10;
                return;
            case 30321:
                i(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f198u.f222r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f198u.f222r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f198u.f222r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f198u.f222r = 3;
                    return;
                }
            case 2352003:
                s(i10).f209e = (int) j10;
                return;
            case 2807729:
                this.f195r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        i(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f198u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f198u.A = 1;
                            return;
                        }
                    case 21946:
                        i(i10);
                        int i14 = pb.c.i((int) j10);
                        if (i14 != -1) {
                            this.f198u.f230z = i14;
                            return;
                        }
                        return;
                    case 21947:
                        i(i10);
                        this.f198u.f228x = true;
                        int iH = pb.c.h((int) j10);
                        if (iH != -1) {
                            this.f198u.f229y = iH;
                            return;
                        }
                        return;
                    case 21948:
                        s(i10).B = (int) j10;
                        return;
                    case 21949:
                        s(i10).C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean y(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public e(int i10) {
        this(new aa.a(), i10);
    }

    e(aa.c cVar, int i10) {
        this.f194q = -1L;
        this.f195r = C.TIME_UNSET;
        this.f196s = C.TIME_UNSET;
        this.f197t = C.TIME_UNSET;
        this.f203z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.f176a = cVar;
        cVar.b(new b());
        this.f181d = (i10 & 1) == 0;
        this.f178b = new g();
        this.f180c = new SparseArray();
        this.f184g = new d0(4);
        this.f185h = new d0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f186i = new d0(4);
        this.f182e = new d0(ob.z.f48467a);
        this.f183f = new d0(4);
        this.f187j = new d0();
        this.f188k = new d0();
        this.f189l = new d0(8);
        this.f190m = new d0();
        this.f191n = new d0();
        this.L = new int[1];
    }

    protected void n(int i10) throws ParserException {
        j();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 19899) {
                    if (i10 != 25152) {
                        if (i10 != 28032) {
                            if (i10 != 357149030) {
                                if (i10 != 374648427) {
                                    if (i10 == 475249515) {
                                        if (!this.f199v) {
                                            this.f179b0.c(l(this.C, this.D));
                                            this.f199v = true;
                                        }
                                        this.C = null;
                                        this.D = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f180c.size() != 0) {
                                    this.f179b0.endTracks();
                                    return;
                                }
                                throw ParserException.a(YSHErhbVu.cLDUw, null);
                            }
                            if (this.f195r == C.TIME_UNSET) {
                                this.f195r = 1000000L;
                            }
                            long j10 = this.f196s;
                            if (j10 != C.TIME_UNSET) {
                                this.f197t = C(j10);
                                return;
                            }
                            return;
                        }
                        i(i10);
                        c cVar = this.f198u;
                        if (cVar.f212h && cVar.f213i != null) {
                            throw ParserException.a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    i(i10);
                    c cVar2 = this.f198u;
                    if (cVar2.f212h) {
                        if (cVar2.f214j != null) {
                            cVar2.f216l = new h(new h.b(o9.b.f48262a, MimeTypes.VIDEO_WEBM, this.f198u.f214j.f54234b));
                            return;
                        }
                        throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i11 = this.f200w;
                if (i11 != -1) {
                    long j11 = this.f201x;
                    if (j11 != -1) {
                        if (i11 == 475249515) {
                            this.f203z = j11;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            c cVar3 = (c) ob.a.i(this.f198u);
            String str = cVar3.f206b;
            if (str != null) {
                if (x(str)) {
                    cVar3.i(this.f179b0, cVar3.f207c);
                    this.f180c.put(cVar3.f207c, cVar3);
                }
                this.f198u = null;
                return;
            }
            throw ParserException.a("CodecId is missing in TrackEntry element", null);
        }
        if (this.G != 2) {
            return;
        }
        c cVar4 = (c) this.f180c.get(this.M);
        cVar4.f();
        if (this.R > 0 && "A_OPUS".equals(cVar4.f206b)) {
            this.f191n.R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.K; i13++) {
            i12 += this.L[i13];
        }
        int i14 = 0;
        while (i14 < this.K) {
            long j12 = this.H + ((long) ((cVar4.f209e * i14) / 1000));
            int i15 = this.O;
            if (i14 == 0 && !this.Q) {
                i15 |= 1;
            }
            int i16 = this.L[i14];
            int i17 = i12 - i16;
            m(cVar4, j12, i15, i16, i17);
            i14++;
            i12 = i17;
        }
        this.G = 0;
    }
}
