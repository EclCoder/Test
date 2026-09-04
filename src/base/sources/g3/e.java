package g3;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import l3.t;
import o2.i0;
import o2.j0;
import o2.o0;
import o2.p;
import o2.p0;
import o2.q;
import o2.r;
import o2.u;
import t1.k;
import t1.v;
import w1.c0;
import w1.n;
import w1.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements p {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final u f38849e0 = new u() { // from class: g3.d
        @Override // o2.u
        public final p[] createExtractors() {
            return e.a();
        }
    };

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte[] f38850f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f38851g0 = c0.n0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f38852h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f38853i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final UUID f38854j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Map f38855k0;
    private boolean A;
    private long B;
    private long C;
    private long D;
    private o E;
    private o F;
    private boolean G;
    private boolean H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private int[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private long T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3.c f38856a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f38857a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f38858b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private byte f38859b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f38860c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f38861c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38862d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private r f38863d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l3.r.a f38865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w1.u f38866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1.u f38867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1.u f38868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w1.u f38869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w1.u f38870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w1.u f38871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w1.u f38872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w1.u f38873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w1.u f38874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w1.u f38875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f38876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f38877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f38878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f38879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f38880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f38881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f38882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f38883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f38885z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements g3.b {
        private b() {
        }

        @Override // g3.b
        public void a(int i10, int i11, q qVar) throws ParserException {
            e.this.m(i10, i11, qVar);
        }

        @Override // g3.b
        public void endMasterElement(int i10) throws ParserException {
            e.this.p(i10);
        }

        @Override // g3.b
        public void floatElement(int i10, double d10) {
            e.this.s(i10, d10);
        }

        @Override // g3.b
        public int getElementType(int i10) {
            return e.this.v(i10);
        }

        @Override // g3.b
        public void integerElement(int i10, long j10) throws ParserException {
            e.this.y(i10, j10);
        }

        @Override // g3.b
        public boolean isLevel1Element(int i10) {
            return e.this.A(i10);
        }

        @Override // g3.b
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            e.this.G(i10, j10, j11);
        }

        @Override // g3.b
        public void stringElement(int i10, String str) throws ParserException {
            e.this.H(i10, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class c {
        public byte[] O;
        public p0 U;
        public boolean V;
        public o0 Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f38891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f38892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f38894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f38895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public o0.a f38896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f38897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public k f38898l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f38899m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f38900n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f38901o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f38902p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f38903q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f38904r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f38905s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f38906t = 0.0f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f38907u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f38908v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public byte[] f38909w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f38910x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f38911y = false;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f38912z = -1;
        public int A = -1;
        public int B = -1;
        public int C = 1000;
        public int D = 200;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public int P = 1;
        public int Q = -1;
        public int R = 8000;
        public long S = 0;
        public long T = 0;
        public boolean W = true;
        private String X = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            w1.a.e(this.Y);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f38897k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) this.C);
            byteBufferOrder.putShort((short) this.D);
            return bArr;
        }

        private static Pair k(w1.u uVar) throws ParserException {
            try {
                uVar.U(16);
                long jW = uVar.w();
                if (jW == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jW == 859189832) {
                    return new Pair(MimeTypes.VIDEO_H263, null);
                }
                if (jW != 826496599) {
                    n.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] bArrE = uVar.e();
                for (int iF = uVar.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(w1.u uVar) throws ParserException {
            try {
                int iY = uVar.y();
                if (iY == 1) {
                    return true;
                }
                if (iY == 65534) {
                    uVar.T(24);
                    if (uVar.z() == e.f38854j0.getMostSignificantBits() && uVar.z() == e.f38854j0.getLeastSignificantBits()) {
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
            if ("A_OPUS".equals(this.f38888b)) {
                return z10;
            }
            return this.f38892f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:213:0x0435  */
        /* JADX WARN: Code duplicated, block: B:218:0x044e  */
        /* JADX WARN: Code duplicated, block: B:219:0x0450  */
        /* JADX WARN: Code duplicated, block: B:222:0x045d  */
        /* JADX WARN: Code duplicated, block: B:223:0x046f  */
        /* JADX WARN: Code duplicated, block: B:225:0x0475  */
        /* JADX WARN: Code duplicated, block: B:227:0x0479  */
        /* JADX WARN: Code duplicated, block: B:229:0x047e  */
        /* JADX WARN: Code duplicated, block: B:232:0x0486  */
        /* JADX WARN: Code duplicated, block: B:234:0x048b  */
        /* JADX WARN: Code duplicated, block: B:237:0x0490  */
        /* JADX WARN: Code duplicated, block: B:240:0x049e  */
        /* JADX WARN: Code duplicated, block: B:243:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:246:0x04d7  */
        /* JADX WARN: Code duplicated, block: B:251:0x04f7  */
        /* JADX WARN: Code duplicated, block: B:257:0x0510  */
        /* JADX WARN: Code duplicated, block: B:258:0x0512  */
        /* JADX WARN: Code duplicated, block: B:260:0x051c  */
        /* JADX WARN: Code duplicated, block: B:261:0x051f  */
        /* JADX WARN: Code duplicated, block: B:263:0x0529  */
        /* JADX WARN: Code duplicated, block: B:269:0x0541  */
        /* JADX WARN: Code duplicated, block: B:271:0x0568  */
        /* JADX WARN: Code duplicated, block: B:273:0x056e  */
        /* JADX WARN: Code duplicated, block: B:289:0x0599  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        public void i(r rVar, int i10) throws ParserException {
            byte b10;
            List listSingletonList;
            String str;
            int i11;
            int i12;
            List list;
            String str2;
            String str3;
            int i13;
            t1.o.b bVar;
            int i14;
            int iIntValue;
            int i15;
            float f10;
            int i16;
            int i17;
            int i18;
            o2.n nVarA;
            String str4 = this.f38888b;
            str4.getClass();
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = 18;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b10 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = 24;
                    break;
                case "S_TEXT/ASS":
                    b10 = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = 26;
                    break;
                case "S_TEXT/WEBVTT":
                    b10 = 27;
                    break;
                case "S_TEXT/UTF8":
                    b10 = 28;
                    break;
                case "V_MPEG2":
                    b10 = 29;
                    break;
                case "A_EAC3":
                    b10 = 30;
                    break;
                case "A_FLAC":
                    b10 = 31;
                    break;
                case "A_OPUS":
                    b10 = 32;
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
                    byte[] bArr = this.f38897k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null && (nVarA = o2.n.a(new w1.u(this.O))) != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z10 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i19 = i13 | (z10 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    } else if (v.k(str3)) {
                        if (this.f38904r == 0) {
                            i17 = this.f38902p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f38899m;
                            }
                            this.f38902p = i17;
                            i18 = this.f38903q;
                            if (i18 == -1) {
                                i18 = this.f38900n;
                            }
                            this.f38903q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f38902p;
                        if (i15 != iIntValue || (i16 = this.f38903q) == iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f38900n * i15) / (this.f38899m * i16);
                        }
                        t1.f fVarA = this.f38911y ? new t1.f.b().d(this.f38912z).c(this.B).e(this.A).f(h()).g(this.f38901o).b(this.f38901o).a() : null;
                        if (this.f38887a != null && e.f38855k0.containsKey(this.f38887a)) {
                            iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                        }
                        if (this.f38905s == 0 && Float.compare(this.f38906t, 0.0f) == 0 && Float.compare(this.f38907u, 0.0f) == 0) {
                            if (Float.compare(this.f38908v, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f38908v, -180.0f) != 0 || Float.compare(this.f38908v, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f38908v, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                        i14 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.a("Unexpected MIME type.", null);
                        }
                        i14 = 3;
                    }
                    if (this.f38887a != null && !e.f38855k0.containsKey(this.f38887a)) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i19).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack;
                    o0VarTrack.b(oVarK);
                    return;
                case 2:
                    if (l(new w1.u(g(this.f38888b)))) {
                        int iB0 = c0.b0(this.Q);
                        if (iB0 == 0) {
                            n.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.Q + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        } else {
                            i11 = iB0;
                            listSingletonList = null;
                            str = null;
                            i12 = -1;
                        }
                        if (this.O != null) {
                            str = nVarA.f48118c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z11 = this.W;
                        if (this.V) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i110 = i13 | (z11 ? 1 : 0);
                        bVar = new t1.o.b();
                        if (v.h(str3)) {
                            if (v.k(str3)) {
                                if (this.f38904r == 0) {
                                    i17 = this.f38902p;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f38899m;
                                    }
                                    this.f38902p = i17;
                                    i18 = this.f38903q;
                                    if (i18 == -1) {
                                        i18 = this.f38900n;
                                    }
                                    this.f38903q = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f38902p;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f38911y) {
                                }
                                if (this.f38887a != null) {
                                    iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                                }
                                if (this.f38905s == 0) {
                                    if (Float.compare(this.f38908v, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                                i14 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.N(this.P).p0(this.R).i0(i11);
                            i14 = 1;
                        }
                        if (this.f38887a != null) {
                            bVar.c0(this.f38887a);
                        }
                        t1.o oVarK2 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i110).b0(listSingletonList).O(str).U(this.f38898l).K();
                        o0 o0VarTrack2 = rVar.track(this.f38889c, i14);
                        this.Y = o0VarTrack2;
                        o0VarTrack2.b(oVarK2);
                        return;
                    }
                    n.h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z12 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111 = i13 | (z12 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK3 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i111).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack3 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack3;
                    o0VarTrack3.b(oVarK3);
                    return;
                case 3:
                    this.U = new p0();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i112 = i13 | (z13 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK4 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i112).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack4 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack4;
                    o0VarTrack4.b(oVarK4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f38888b));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    i12 = 8192;
                    str = null;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i113 = i13 | (z14 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK5 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i113).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack5 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack5;
                    o0VarTrack5.b(oVarK5);
                    return;
                case 5:
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i114 = i13 | (z15 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK6 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i114).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack6 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack6;
                    o0VarTrack6.b(oVarK6);
                    return;
                case 6:
                    str5 = MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i115 = i13 | (z16 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK7 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i115).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack7 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack7;
                    o0VarTrack7.b(oVarK7);
                    return;
                case 7:
                    Pair pairK = k(new w1.u(g(this.f38888b)));
                    str5 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i116 = i13 | (z17 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK8 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i116).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack8 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack8;
                    o0VarTrack8.b(oVarK8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f38888b), 0, bArr2, 0, 4);
                    listSingletonList = com.google.common.collect.c0.D(bArr2);
                    str = null;
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i117 = i13 | (z18 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK9 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i117).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack9 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack9;
                    o0VarTrack9.b(oVarK9);
                    return;
                case 10:
                    o2.d dVarB = o2.d.b(new w1.u(g(this.f38888b)));
                    list = dVarB.f48002a;
                    this.Z = dVarB.f48003b;
                    str2 = dVarB.f48013l;
                    str5 = MimeTypes.VIDEO_H264;
                    List list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i118 = i13 | (z19 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK10 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i118).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack10 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack10;
                    o0VarTrack10.b(oVarK10);
                    return;
                case 11:
                    listSingletonList = com.google.common.collect.c0.D(g(this.f38888b));
                    str = null;
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i119 = i13 | (z110 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK11 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i119).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack11 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack11;
                    o0VarTrack11.b(oVarK11);
                    return;
                case 12:
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1110 = i13 | (z111 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK12 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1110).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack12 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack12;
                    o0VarTrack12.b(oVarK12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f38888b));
                    o2.a.b bVarE = o2.a.e(this.f38897k);
                    this.R = bVarE.f47964a;
                    this.P = bVarE.f47965b;
                    str = bVarE.f47966c;
                    str5 = MimeTypes.AUDIO_AAC;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1111 = i13 | (z112 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK13 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1111).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack13 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack13;
                    o0VarTrack13.b(oVarK13);
                    return;
                case 14:
                    str5 = MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z113 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1112 = i13 | (z113 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK14 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1112).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack14 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack14;
                    o0VarTrack14.b(oVarK14);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1113 = i13 | (z114 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK15 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1113).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack15 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack15;
                    o0VarTrack15.b(oVarK15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z115 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1114 = i13 | (z115 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK16 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1114).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack16 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack16;
                    o0VarTrack16.b(oVarK16);
                    return;
                case 17:
                    str5 = MimeTypes.VIDEO_VP8;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1115 = i13 | (z116 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK17 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1115).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack17 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack17;
                    o0VarTrack17.b(oVarK17);
                    return;
                case 18:
                    str5 = MimeTypes.VIDEO_VP9;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1116 = i13 | (z117 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK18 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1116).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack18 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack18;
                    o0VarTrack18.b(oVarK18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_PGS;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1117 = i13 | (z118 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK19 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1117).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack19 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack19;
                    o0VarTrack19.b(oVarK19);
                    return;
                case 20:
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1118 = i13 | (z119 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK110 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1118).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack110 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack110;
                    o0VarTrack110.b(oVarK110);
                    return;
                case 22:
                    if (this.Q == 32) {
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        i11 = 4;
                    } else {
                        n.h("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.Q + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i12 = -1;
                        i11 = -1;
                    }
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1119 = i13 | (z1110 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK111 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i1119).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack111 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack111;
                    o0VarTrack111.b(oVarK111);
                    return;
                case 23:
                    int i20 = this.Q;
                    if (i20 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i20 == 16) {
                            i11 = 268435456;
                        } else if (i20 == 24) {
                            i11 = 1342177280;
                        } else {
                            if (i20 != 32) {
                                n.h("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.Q + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                                listSingletonList = null;
                                str = null;
                                str5 = MimeTypes.AUDIO_UNKNOWN;
                                i12 = -1;
                                i11 = -1;
                                if (this.O != null) {
                                    str = nVarA.f48118c;
                                    str5 = "video/dolby-vision";
                                }
                                str3 = str5;
                                boolean z1111 = this.W;
                                if (this.V) {
                                    i13 = 2;
                                } else {
                                    i13 = 0;
                                }
                                int i11110 = i13 | (z1111 ? 1 : 0);
                                bVar = new t1.o.b();
                                if (v.h(str3)) {
                                    if (v.k(str3)) {
                                        if (this.f38904r == 0) {
                                            i17 = this.f38902p;
                                            iIntValue = -1;
                                            if (i17 == -1) {
                                                i17 = this.f38899m;
                                            }
                                            this.f38902p = i17;
                                            i18 = this.f38903q;
                                            if (i18 == -1) {
                                                i18 = this.f38900n;
                                            }
                                            this.f38903q = i18;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        i15 = this.f38902p;
                                        if (i15 != iIntValue) {
                                            f10 = -1.0f;
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        if (this.f38911y) {
                                        }
                                        if (this.f38887a != null) {
                                            iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                                        }
                                        if (this.f38905s == 0) {
                                            if (Float.compare(this.f38908v, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                                        i14 = 2;
                                    } else {
                                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                        }
                                        i14 = 3;
                                    }
                                    break;
                                } else {
                                    bVar.N(this.P).p0(this.R).i0(i11);
                                    i14 = 1;
                                }
                                if (this.f38887a != null) {
                                    bVar.c0(this.f38887a);
                                }
                                t1.o oVarK112 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11110).b0(listSingletonList).O(str).U(this.f38898l).K();
                                o0 o0VarTrack112 = rVar.track(this.f38889c, i14);
                                this.Y = o0VarTrack112;
                                o0VarTrack112.b(oVarK112);
                                return;
                            }
                            i11 = 1610612736;
                        }
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1112 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11111 = i13 | (z1112 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK113 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11111).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack113 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack113;
                    o0VarTrack113.b(oVarK113);
                    return;
                case 24:
                    int iB1 = c0.b0(this.Q);
                    if (iB1 != 0) {
                        i11 = iB1;
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        if (this.O != null) {
                            str = nVarA.f48118c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z1113 = this.W;
                        if (this.V) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i11112 = i13 | (z1113 ? 1 : 0);
                        bVar = new t1.o.b();
                        if (v.h(str3)) {
                            if (v.k(str3)) {
                                if (this.f38904r == 0) {
                                    i17 = this.f38902p;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f38899m;
                                    }
                                    this.f38902p = i17;
                                    i18 = this.f38903q;
                                    if (i18 == -1) {
                                        i18 = this.f38900n;
                                    }
                                    this.f38903q = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f38902p;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f38911y) {
                                }
                                if (this.f38887a != null) {
                                    iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                                }
                                if (this.f38905s == 0) {
                                    if (Float.compare(this.f38908v, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                                i14 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.N(this.P).p0(this.R).i0(i11);
                            i14 = 1;
                        }
                        if (this.f38887a != null) {
                            bVar.c0(this.f38887a);
                        }
                        t1.o oVarK114 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11112).b0(listSingletonList).O(str).U(this.f38898l).K();
                        o0 o0VarTrack114 = rVar.track(this.f38889c, i14);
                        this.Y = o0VarTrack114;
                        o0VarTrack114.b(oVarK114);
                        return;
                    }
                    n.h("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.Q + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1114 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11113 = i13 | (z1114 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK115 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11113).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack115 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack115;
                    o0VarTrack115.b(oVarK115);
                    return;
                case 25:
                    listSingletonList = com.google.common.collect.c0.E(e.f38851g0, g(this.f38888b));
                    str5 = MimeTypes.TEXT_SSA;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1115 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11114 = i13 | (z1115 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK116 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11114).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack116 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack116;
                    o0VarTrack116.b(oVarK116);
                    return;
                case 26:
                    o2.c0 c0VarA = o2.c0.a(new w1.u(g(this.f38888b)));
                    list = c0VarA.f47990a;
                    this.Z = c0VarA.f47991b;
                    str2 = c0VarA.f48001l;
                    str5 = MimeTypes.VIDEO_H265;
                    List list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1116 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11115 = i13 | (z1116 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK117 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11115).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack117 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack117;
                    o0VarTrack117.b(oVarK117);
                    return;
                case 27:
                    str5 = MimeTypes.TEXT_VTT;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1117 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11116 = i13 | (z1117 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK118 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11116).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack118 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack118;
                    o0VarTrack118.b(oVarK118);
                    return;
                case 28:
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1118 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11117 = i13 | (z1118 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK119 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11117).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack119 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack119;
                    o0VarTrack119.b(oVarK119);
                    return;
                case 29:
                    str5 = MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1119 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11118 = i13 | (z1119 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK1110 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11118).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack1110 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack1110;
                    o0VarTrack1110.b(oVarK1110);
                    return;
                case 30:
                    str5 = MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11110 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11119 = i13 | (z11110 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK1111 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i11119).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack1111 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack1111;
                    o0VarTrack1111.b(oVarK1111);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(g(this.f38888b));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11111 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111110 = i13 | (z11111 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK1112 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i111110).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack1112 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack1112;
                    o0VarTrack1112.b(oVarK1112);
                    return;
                case 32:
                    listSingletonList = new ArrayList(3);
                    listSingletonList.add(g(this.f38888b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.S).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.T).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    i12 = 5760;
                    str = null;
                    i11 = -1;
                    if (this.O != null) {
                        str = nVarA.f48118c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11112 = this.W;
                    if (this.V) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111111 = i13 | (z11112 ? 1 : 0);
                    bVar = new t1.o.b();
                    if (v.h(str3)) {
                        if (v.k(str3)) {
                            if (this.f38904r == 0) {
                                i17 = this.f38902p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f38899m;
                                }
                                this.f38902p = i17;
                                i18 = this.f38903q;
                                if (i18 == -1) {
                                    i18 = this.f38900n;
                                }
                                this.f38903q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f38902p;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f38911y) {
                            }
                            if (this.f38887a != null) {
                                iIntValue = ((Integer) e.f38855k0.get(this.f38887a)).intValue();
                            }
                            if (this.f38905s == 0) {
                                if (Float.compare(this.f38908v, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f38908v, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f38908v, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.t0(this.f38899m).Y(this.f38900n).k0(f10).n0(iIntValue).l0(this.f38909w).r0(this.f38910x).P(fVarA);
                            i14 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.N(this.P).p0(this.R).i0(i11);
                        i14 = 1;
                    }
                    if (this.f38887a != null) {
                        bVar.c0(this.f38887a);
                    }
                    t1.o oVarK1113 = bVar.Z(i10).o0(str3).f0(i12).e0(this.X).q0(i111111).b0(listSingletonList).O(str).U(this.f38898l).K();
                    o0 o0VarTrack1113 = rVar.track(this.f38889c, i14);
                    this.Y = o0VarTrack1113;
                    o0VarTrack1113.b(oVarK1113);
                    return;
                default:
                    throw ParserException.a("Unrecognized codec identifier.", null);
            }
        }

        public void j() {
            p0 p0Var = this.U;
            if (p0Var != null) {
                p0Var.a(this.Y, this.f38896j);
            }
        }

        public void n() {
            p0 p0Var = this.U;
            if (p0Var != null) {
                p0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f38855k0 = Collections.unmodifiableMap(map);
    }

    public e(l3.r.a aVar, int i10) {
        this(new g3.a(), i10, aVar);
    }

    private boolean B(i0 i0Var, long j10) {
        if (this.A) {
            this.C = j10;
            i0Var.f48076a = this.B;
            this.A = false;
            return true;
        }
        if (this.f38883x) {
            long j11 = this.C;
            if (j11 != -1) {
                i0Var.f48076a = j11;
                this.C = -1L;
                return true;
            }
        }
        return false;
    }

    private void C(q qVar, int i10) {
        if (this.f38868i.g() >= i10) {
            return;
        }
        if (this.f38868i.b() < i10) {
            w1.u uVar = this.f38868i;
            uVar.c(Math.max(uVar.b() * 2, i10));
        }
        qVar.readFully(this.f38868i.e(), this.f38868i.g(), i10 - this.f38868i.g());
        this.f38868i.S(i10);
    }

    private void D() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f38857a0 = 0;
        this.f38859b0 = (byte) 0;
        this.f38861c0 = false;
        this.f38871l.P(0);
    }

    private long E(long j10) throws ParserException {
        long j11 = this.f38879t;
        if (j11 != C.TIME_UNSET) {
            return c0.N0(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        byte[] bArrT;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrT = t(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrT = t(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrT = t(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrT, 0, bArr, i10, bArrT.length);
    }

    private int I(q qVar, c cVar, int i10, boolean z10) throws ParserException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f38888b)) {
            J(qVar, f38850f0, i10);
            return r();
        }
        if ("S_TEXT/ASS".equals(cVar.f38888b)) {
            J(qVar, f38852h0, i10);
            return r();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f38888b)) {
            J(qVar, f38853i0, i10);
            return r();
        }
        o0 o0Var = cVar.Y;
        if (!this.X) {
            if (cVar.f38894h) {
                this.Q &= -1073741825;
                if (!this.Y) {
                    qVar.readFully(this.f38868i.e(), 0, 1);
                    this.U++;
                    if ((this.f38868i.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f38859b0 = this.f38868i.e()[0];
                    this.Y = true;
                }
                byte b10 = this.f38859b0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.f38861c0) {
                        qVar.readFully(this.f38873n.e(), 0, 8);
                        this.U += 8;
                        this.f38861c0 = true;
                        this.f38868i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f38868i.T(0);
                        o0Var.f(this.f38868i, 1, 1);
                        this.V++;
                        this.f38873n.T(0);
                        o0Var.f(this.f38873n, 8, 1);
                        this.V += 8;
                    }
                    if (z11) {
                        if (!this.Z) {
                            qVar.readFully(this.f38868i.e(), 0, 1);
                            this.U++;
                            this.f38868i.T(0);
                            this.f38857a0 = this.f38868i.G();
                            this.Z = true;
                        }
                        int i12 = this.f38857a0 * 4;
                        this.f38868i.P(i12);
                        qVar.readFully(this.f38868i.e(), 0, i12);
                        this.U += i12;
                        short s10 = (short) ((this.f38857a0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f38876q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f38876q = ByteBuffer.allocate(i13);
                        }
                        this.f38876q.position(0);
                        this.f38876q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f38857a0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iK = this.f38868i.K();
                            if (i14 % 2 == 0) {
                                this.f38876q.putShort((short) (iK - i15));
                            } else {
                                this.f38876q.putInt(iK - i15);
                            }
                            i14++;
                            i15 = iK;
                        }
                        int i16 = (i10 - this.U) - i15;
                        if (i11 % 2 == 1) {
                            this.f38876q.putInt(i16);
                        } else {
                            this.f38876q.putShort((short) i16);
                            this.f38876q.putInt(0);
                        }
                        this.f38874o.R(this.f38876q.array(), i13);
                        o0Var.f(this.f38874o, i13, 1);
                        this.V += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f38895i;
                if (bArr != null) {
                    this.f38871l.R(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.Q |= 268435456;
                this.f38875p.P(0);
                int iG = (this.f38871l.g() + i10) - this.U;
                this.f38868i.P(4);
                this.f38868i.e()[0] = (byte) ((iG >> 24) & 255);
                this.f38868i.e()[1] = (byte) ((iG >> 16) & 255);
                this.f38868i.e()[2] = (byte) ((iG >> 8) & 255);
                this.f38868i.e()[3] = (byte) (iG & 255);
                o0Var.f(this.f38868i, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        int iG2 = i10 + this.f38871l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f38888b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f38888b)) {
            if (cVar.U != null) {
                w1.a.g(this.f38871l.g() == 0);
                cVar.U.d(qVar);
            }
            while (true) {
                int i17 = this.U;
                if (i17 >= iG2) {
                    break;
                }
                int iK2 = K(qVar, o0Var, iG2 - i17);
                this.U += iK2;
                this.V += iK2;
            }
        } else {
            byte[] bArrE = this.f38867h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.Z;
            int i19 = 4 - i18;
            while (this.U < iG2) {
                int i20 = this.W;
                if (i20 == 0) {
                    L(qVar, bArrE, i19, i18);
                    this.U += i18;
                    this.f38867h.T(0);
                    this.W = this.f38867h.K();
                    this.f38866g.T(0);
                    o0Var.c(this.f38866g, 4);
                    this.V += 4;
                } else {
                    int iK3 = K(qVar, o0Var, i20);
                    this.U += iK3;
                    this.V += iK3;
                    this.W -= iK3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f38888b)) {
            this.f38869j.T(0);
            o0Var.c(this.f38869j, 4);
            this.V += 4;
        }
        return r();
    }

    private void J(q qVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f38872m.b() < length) {
            this.f38872m.Q(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f38872m.e(), 0, bArr.length);
        }
        qVar.readFully(this.f38872m.e(), bArr.length, i10);
        this.f38872m.T(0);
        this.f38872m.S(length);
    }

    private int K(q qVar, o0 o0Var, int i10) {
        int iA = this.f38871l.a();
        if (iA <= 0) {
            return o0Var.a(qVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o0Var.c(this.f38871l, iMin);
        return iMin;
    }

    private void L(q qVar, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f38871l.a());
        qVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f38871l.l(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ p[] a() {
        return new p[]{new e(l3.r.a.f43873a, 2)};
    }

    private void j(int i10) throws ParserException {
        if (this.E == null || this.F == null) {
            throw ParserException.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void k(int i10) throws ParserException {
        if (this.f38882w != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void l() {
        w1.a.i(this.f38863d0);
    }

    private j0 n(o oVar, o oVar2) {
        int i10;
        if (this.f38878s == -1 || this.f38881v == C.TIME_UNSET || oVar == null || oVar.c() == 0 || oVar2 == null || oVar2.c() != oVar.c()) {
            return new j0.b(this.f38881v);
        }
        int iC = oVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = oVar.b(i12);
            jArrCopyOf[i12] = this.f38878s + oVar2.b(i12);
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
        iArrCopyOf[i10] = (int) ((this.f38878s + this.f38877r) - jArrCopyOf[i10]);
        long j10 = this.f38881v - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            n.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new o2.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void o(c cVar, long j10, int i10, int i11, int i12) {
        int iG;
        p0 p0Var = cVar.U;
        if (p0Var != null) {
            p0Var.c(cVar.Y, j10, i10, i11, i12, cVar.f38896j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f38888b) || "S_TEXT/ASS".equals(cVar.f38888b) || "S_TEXT/WEBVTT".equals(cVar.f38888b)) {
                if (this.M > 1) {
                    n.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.K;
                    if (j11 == C.TIME_UNSET) {
                        n.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f38888b, j11, this.f38872m.e());
                        for (int iF = this.f38872m.f(); iF < this.f38872m.g(); iF++) {
                            if (this.f38872m.e()[iF] == 0) {
                                this.f38872m.S(iF);
                                break;
                            }
                        }
                        o0 o0Var = cVar.Y;
                        w1.u uVar = this.f38872m;
                        o0Var.c(uVar, uVar.g());
                        iG = i11 + this.f38872m.g();
                    }
                }
                iG = i11;
            } else {
                iG = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.M > 1) {
                    this.f38875p.P(0);
                } else {
                    int iG2 = this.f38875p.g();
                    cVar.Y.f(this.f38875p, iG2, 2);
                    iG += iG2;
                }
            }
            cVar.Y.e(j10, i10, iG, i12, cVar.f38896j);
        }
        this.H = true;
    }

    private static int[] q(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int r() {
        int i10 = this.V;
        D();
        return i10;
    }

    private static byte[] t(long j10, String str, long j11) {
        w1.a.a(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return c0.n0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    private static boolean z(String str) {
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

    protected boolean A(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void G(int i10, long j10, long j11) throws ParserException {
        l();
        if (i10 == 160) {
            this.S = false;
            this.T = 0L;
            return;
        }
        if (i10 == 174) {
            this.f38882w = new c();
            return;
        }
        if (i10 == 187) {
            this.G = false;
            return;
        }
        if (i10 == 19899) {
            this.f38884y = -1;
            this.f38885z = -1L;
            return;
        }
        if (i10 == 20533) {
            u(i10).f38894h = true;
            return;
        }
        if (i10 == 21968) {
            u(i10).f38911y = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f38878s;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f38878s = j10;
            this.f38877r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.E = new o();
            this.F = new o();
        } else if (i10 == 524531317 && !this.f38883x) {
            if (this.f38862d && this.B != -1) {
                this.A = true;
            } else {
                this.f38863d0.d(new j0.b(this.f38881v));
                this.f38883x = true;
            }
        }
    }

    protected void H(int i10, String str) throws ParserException {
        if (i10 == 134) {
            u(i10).f38888b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                u(i10).f38887a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                u(i10).X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // o2.p
    public final int b(q qVar, i0 i0Var) {
        this.H = false;
        boolean zA = true;
        while (zA && !this.H) {
            zA = this.f38856a.a(qVar);
            if (zA && B(i0Var, qVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f38860c.size(); i10++) {
            c cVar = (c) this.f38860c.valueAt(i10);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // o2.p
    public final void c(r rVar) {
        this.f38863d0 = rVar;
        if (this.f38864e) {
            rVar = new t(rVar, this.f38865f);
        }
        this.f38863d0 = rVar;
    }

    @Override // o2.p
    public final boolean d(q qVar) {
        return new f().b(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void m(int i10, int i11, q qVar) throws ParserException {
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
        q qVar2 = qVar;
        int i21 = 0;
        int i22 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.I != 2) {
                    return;
                }
                x((c) this.f38860c.get(this.O), this.R, qVar2, i11);
                return;
            }
            if (i10 == 16877) {
                w(u(i10), qVar2, i11);
                return;
            }
            if (i10 == 16981) {
                k(i10);
                byte[] bArr = new byte[i11];
                this.f38882w.f38895i = bArr;
                qVar2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                qVar2.readFully(bArr2, 0, i11);
                u(i10).f38896j = new o0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f38870k.e(), (byte) 0);
                qVar2.readFully(this.f38870k.e(), 4 - i11, i11);
                this.f38870k.T(0);
                this.f38884y = (int) this.f38870k.I();
                return;
            }
            if (i10 == 25506) {
                k(i10);
                byte[] bArr3 = new byte[i11];
                this.f38882w.f38897k = bArr3;
                qVar2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.a("Unexpected id: " + i10, null);
            }
            k(i10);
            byte[] bArr4 = new byte[i11];
            this.f38882w.f38909w = bArr4;
            qVar2.readFully(bArr4, 0, i11);
            return;
        }
        int i23 = 8;
        if (this.I == 0) {
            this.O = (int) this.f38858b.d(qVar2, false, true, 8);
            this.P = this.f38858b.b();
            this.K = C.TIME_UNSET;
            this.I = 1;
            this.f38868i.P(0);
        }
        c cVar = (c) this.f38860c.get(this.O);
        if (cVar == null) {
            qVar2.skipFully(i11 - this.P);
            this.I = 0;
            return;
        }
        cVar.f();
        if (this.I == 1) {
            C(qVar2, 3);
            int i24 = (this.f38868i.e()[2] & 6) >> 1;
            if (i24 == 0) {
                this.M = 1;
                int[] iArrQ = q(this.N, 1);
                this.N = iArrQ;
                iArrQ[0] = (i11 - this.P) - 3;
            } else {
                C(qVar2, 4);
                int i25 = (this.f38868i.e()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.M = i25;
                int[] iArrQ2 = q(this.N, i25);
                this.N = iArrQ2;
                if (i24 == 2) {
                    int i26 = (i11 - this.P) - 4;
                    int i27 = this.M;
                    Arrays.fill(iArrQ2, 0, i27, i26 / i27);
                } else {
                    if (i24 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i17 = this.M;
                            if (i28 >= i17 - 1) {
                                break;
                            }
                            this.N[i28] = 0;
                            while (true) {
                                i18 = i30 + 1;
                                C(qVar2, i18);
                                int i31 = this.f38868i.e()[i30] & 255;
                                int[] iArr = this.N;
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
                        this.N[i17 - 1] = ((i11 - this.P) - i30) - i29;
                    } else {
                        if (i24 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i24, null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.M;
                            i12 = i22;
                            if (i32 >= i35 - 1) {
                                i13 = i21;
                                this.N[i35 - 1] = ((i11 - this.P) - i34) - i33;
                                break;
                            }
                            this.N[i32] = i21;
                            int i36 = i34 + 1;
                            C(qVar2, i36);
                            if (this.f38868i.e()[i34] == 0) {
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
                                if ((this.f38868i.e()[i34] & i38) != 0) {
                                    i36 += i37;
                                    C(qVar2, i36);
                                    int i39 = i34 + 1;
                                    j10 = this.f38868i.e()[i34] & 255 & (~i38);
                                    while (true) {
                                        int i40 = i39;
                                        if (i40 >= i36) {
                                            break;
                                        }
                                        i39 = i40 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f38868i.e()[i40] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
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
                                qVar2 = qVar;
                                i21 = i14;
                                i23 = i15;
                            }
                            i34 = i36;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            int i41 = (int) j10;
                            int[] iArr2 = this.N;
                            if (i16 != 0) {
                                i41 += iArr2[i16 - 1];
                            }
                            iArr2[i16] = i41;
                            i33 += i41;
                            i32 = i16 + 1;
                            qVar2 = qVar;
                            i22 = i12;
                            i21 = i14;
                            i23 = i15;
                        }
                    }
                    this.J = this.D + E((this.f38868i.e()[i13] << 8) | (this.f38868i.e()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    if (cVar.f38890d != 2 || (i10 == 163 && (this.f38868i.e()[2] & 128) == 128)) {
                        i20 = i12;
                    } else {
                        i20 = i13;
                    }
                    this.Q = i20;
                    this.I = 2;
                    this.L = i13;
                }
            }
            i13 = 0;
            i12 = 1;
            this.J = this.D + E((this.f38868i.e()[i13] << 8) | (this.f38868i.e()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (cVar.f38890d != 2) {
                i20 = i12;
            } else {
                i20 = i12;
            }
            this.Q = i20;
            this.I = 2;
            this.L = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i42 = this.L;
                if (i42 >= this.M) {
                    this.I = 0;
                    return;
                }
                int I = I(qVar, cVar, this.N[i42], false);
                c cVar2 = cVar;
                o(cVar2, this.J + ((long) ((this.L * cVar.f38891e) / 1000)), this.Q, I, 0);
                this.L++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i43 = this.L;
                if (i43 >= this.M) {
                    return;
                }
                int[] iArr3 = this.N;
                boolean z10 = i12;
                iArr3[i43] = I(qVar, cVar, iArr3[i43], z10);
                this.L += z10 ? 1 : 0;
            }
        }
    }

    protected void p(int i10) throws ParserException {
        l();
        if (i10 == 160) {
            if (this.I != 2) {
                return;
            }
            c cVar = (c) this.f38860c.get(this.O);
            cVar.f();
            if (this.T > 0 && "A_OPUS".equals(cVar.f38888b)) {
                this.f38875p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.T).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.M; i12++) {
                i11 += this.N[i12];
            }
            int i13 = 0;
            while (i13 < this.M) {
                long j10 = this.J + ((long) ((cVar.f38891e * i13) / 1000));
                int i14 = this.Q;
                if (i13 == 0 && !this.S) {
                    i14 |= 1;
                }
                int i15 = this.N[i13];
                int i16 = i11 - i15;
                o(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.I = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) w1.a.i(this.f38882w);
            String str = cVar2.f38888b;
            if (str == null) {
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            }
            if (z(str)) {
                cVar2.i(this.f38863d0, cVar2.f38889c);
                this.f38860c.put(cVar2.f38889c, cVar2);
            }
            this.f38882w = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f38884y;
            if (i17 != -1) {
                long j11 = this.f38885z;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.B = j11;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            k(i10);
            c cVar3 = this.f38882w;
            if (cVar3.f38894h) {
                if (cVar3.f38896j == null) {
                    throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f38898l = new k(new k.b(t1.e.f52663a, MimeTypes.VIDEO_WEBM, this.f38882w.f38896j.f48135b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            k(i10);
            c cVar4 = this.f38882w;
            if (cVar4.f38894h && cVar4.f38895i != null) {
                throw ParserException.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f38879t == C.TIME_UNSET) {
                this.f38879t = 1000000L;
            }
            long j12 = this.f38880u;
            if (j12 != C.TIME_UNSET) {
                this.f38881v = E(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f38860c.size() == 0) {
                throw ParserException.a("No valid tracks were found", null);
            }
            this.f38863d0.endTracks();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f38883x) {
                this.f38863d0.d(n(this.E, this.F));
                this.f38883x = true;
            }
            this.E = null;
            this.F = null;
        }
    }

    protected void s(int i10, double d10) {
        if (i10 == 181) {
            u(i10).R = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f38880u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                u(i10).E = (float) d10;
                break;
            case 21970:
                u(i10).F = (float) d10;
                break;
            case 21971:
                u(i10).G = (float) d10;
                break;
            case 21972:
                u(i10).H = (float) d10;
                break;
            case 21973:
                u(i10).I = (float) d10;
                break;
            case 21974:
                u(i10).J = (float) d10;
                break;
            case 21975:
                u(i10).K = (float) d10;
                break;
            case 21976:
                u(i10).L = (float) d10;
                break;
            case 21977:
                u(i10).M = (float) d10;
                break;
            case 21978:
                u(i10).N = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        u(i10).f38906t = (float) d10;
                        break;
                    case 30324:
                        u(i10).f38907u = (float) d10;
                        break;
                    case 30325:
                        u(i10).f38908v = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.D = C.TIME_UNSET;
        this.I = 0;
        this.f38856a.reset();
        this.f38858b.e();
        D();
        for (int i10 = 0; i10 < this.f38860c.size(); i10++) {
            ((c) this.f38860c.valueAt(i10)).n();
        }
    }

    protected c u(int i10) throws ParserException {
        k(i10);
        return this.f38882w;
    }

    protected int v(int i10) {
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
            case 21938:
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

    protected void w(c cVar, q qVar, int i10) {
        if (cVar.f38893g != 1685485123 && cVar.f38893g != 1685480259) {
            qVar.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.O = bArr;
        qVar.readFully(bArr, 0, i10);
    }

    protected void x(c cVar, int i10, q qVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f38888b)) {
            qVar.skipFully(i11);
        } else {
            this.f38875p.P(i11);
            qVar.readFully(this.f38875p.e(), 0, i11);
        }
    }

    protected void y(int i10, long j10) throws ParserException {
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
                u(i10).f38890d = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                u(i10).W = j10 == 1;
                return;
            case 155:
                this.K = E(j10);
                return;
            case 159:
                u(i10).P = (int) j10;
                return;
            case 176:
                u(i10).f38899m = (int) j10;
                return;
            case 179:
                j(i10);
                this.E.a(E(j10));
                return;
            case 186:
                u(i10).f38900n = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                u(i10).f38889c = (int) j10;
                return;
            case 231:
                this.D = E(j10);
                return;
            case 238:
                this.R = (int) j10;
                return;
            case 241:
                if (this.G) {
                    return;
                }
                j(i10);
                this.F.a(j10);
                this.G = true;
                return;
            case 251:
                this.S = true;
                return;
            case 16871:
                u(i10).f38893g = (int) j10;
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
                this.f38885z = j10 + this.f38878s;
                return;
            case 21432:
                int i11 = (int) j10;
                k(i10);
                if (i11 == 0) {
                    this.f38882w.f38910x = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f38882w.f38910x = 2;
                    return;
                } else if (i11 == 3) {
                    this.f38882w.f38910x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f38882w.f38910x = 3;
                    return;
                }
            case 21680:
                u(i10).f38902p = (int) j10;
                return;
            case 21682:
                u(i10).f38904r = (int) j10;
                return;
            case 21690:
                u(i10).f38903q = (int) j10;
                return;
            case 21930:
                u(i10).V = j10 == 1;
                return;
            case 21938:
                k(i10);
                c cVar = this.f38882w;
                cVar.f38911y = true;
                cVar.f38901o = (int) j10;
                return;
            case 21998:
                u(i10).f38892f = (int) j10;
                return;
            case 22186:
                u(i10).S = j10;
                return;
            case 22203:
                u(i10).T = j10;
                return;
            case 25188:
                u(i10).Q = (int) j10;
                return;
            case 30114:
                this.T = j10;
                return;
            case 30321:
                k(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f38882w.f38905s = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f38882w.f38905s = 1;
                    return;
                } else if (i12 == 2) {
                    this.f38882w.f38905s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f38882w.f38905s = 3;
                    return;
                }
            case 2352003:
                u(i10).f38891e = (int) j10;
                return;
            case 2807729:
                this.f38879t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        k(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f38882w.B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f38882w.B = 1;
                            return;
                        }
                    case 21946:
                        k(i10);
                        int iK = t1.f.k((int) j10);
                        if (iK != -1) {
                            this.f38882w.A = iK;
                            return;
                        }
                        return;
                    case 21947:
                        k(i10);
                        this.f38882w.f38911y = true;
                        int iJ = t1.f.j((int) j10);
                        if (iJ != -1) {
                            this.f38882w.f38912z = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        u(i10).C = (int) j10;
                        return;
                    case 21949:
                        u(i10).D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    e(g3.c cVar, int i10, l3.r.a aVar) {
        this.f38878s = -1L;
        this.f38879t = C.TIME_UNSET;
        this.f38880u = C.TIME_UNSET;
        this.f38881v = C.TIME_UNSET;
        this.B = -1L;
        this.C = -1L;
        this.D = C.TIME_UNSET;
        this.f38856a = cVar;
        cVar.b(new b());
        this.f38865f = aVar;
        this.f38862d = (i10 & 1) == 0;
        this.f38864e = (i10 & 2) == 0;
        this.f38858b = new g();
        this.f38860c = new SparseArray();
        this.f38868i = new w1.u(4);
        this.f38869j = new w1.u(ByteBuffer.allocate(4).putInt(-1).array());
        this.f38870k = new w1.u(4);
        this.f38866g = new w1.u(x1.d.f56574a);
        this.f38867h = new w1.u(4);
        this.f38871l = new w1.u();
        this.f38872m = new w1.u();
        this.f38873n = new w1.u(8);
        this.f38874o = new w1.u();
        this.f38875p = new w1.u();
        this.N = new int[1];
    }

    @Override // o2.p
    public final void release() {
    }
}
