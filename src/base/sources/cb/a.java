package cb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import bb.i;
import bb.m;
import bb.n;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.d0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f9869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f9870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f9871k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f9874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f9875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte f9880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f9881u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f9884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f9865y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f9866z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk$SDKError.b.TPAT_ERROR_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    private static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 235, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] E = {195, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 204, 236, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, 242, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f9867g = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f9872l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0134a f9873m = new C0134a(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9882v = 0;

    /* JADX INFO: renamed from: cb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0134a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9885a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f9886b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f9887c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9892h;

        /* JADX INFO: renamed from: cb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f9893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f9894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f9895c;

            public C0135a(int i10, boolean z10, int i11) {
                this.f9893a = i10;
                this.f9894b = z10;
                this.f9895c = i11;
            }
        }

        public C0134a(int i10, int i11) {
            j(i10);
            this.f9892h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9887c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f9885a.size()) {
                C0135a c0135a = (C0135a) this.f9885a.get(i14);
                boolean z11 = c0135a.f9894b;
                int i16 = c0135a.f9893a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0135a.f9895c;
                i14++;
                if (i17 != (i14 < this.f9885a.size() ? ((C0135a) this.f9885a.get(i14)).f9895c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f9887c.length() < 32) {
                this.f9887c.append(c10);
            }
        }

        public void f() {
            int length = this.f9887c.length();
            if (length > 0) {
                this.f9887c.delete(length - 1, length);
                for (int size = this.f9885a.size() - 1; size >= 0; size--) {
                    C0135a c0135a = (C0135a) this.f9885a.get(size);
                    int i10 = c0135a.f9895c;
                    if (i10 != length) {
                        return;
                    }
                    c0135a.f9895c = i10 - 1;
                }
            }
        }

        public bb.b g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f9886b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f9886b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f9889e + this.f9890f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f9891g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f9891g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f9888d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f9891g == 1) {
                i14 -= this.f9892h - 1;
            }
            return new bb.b.C0112b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f9885a.isEmpty() && this.f9886b.isEmpty() && this.f9887c.length() == 0;
        }

        public void j(int i10) {
            this.f9891g = i10;
            this.f9885a.clear();
            this.f9886b.clear();
            this.f9887c.setLength(0);
            this.f9888d = 15;
            this.f9889e = 0;
            this.f9890f = 0;
        }

        public void k() {
            this.f9886b.add(h());
            this.f9887c.setLength(0);
            this.f9885a.clear();
            int iMin = Math.min(this.f9892h, this.f9888d);
            while (this.f9886b.size() >= iMin) {
                this.f9886b.remove(0);
            }
        }

        public void l(int i10) {
            this.f9891g = i10;
        }

        public void m(int i10) {
            this.f9892h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f9885a.add(new C0135a(i10, z10, this.f9887c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f9871k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f9868h = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f9870j = 0;
            this.f9869i = 0;
        } else if (i10 == 2) {
            this.f9870j = 1;
            this.f9869i = 0;
        } else if (i10 == 3) {
            this.f9870j = 0;
            this.f9869i = 1;
        } else if (i10 != 4) {
            u.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f9870j = 0;
            this.f9869i = 0;
        } else {
            this.f9870j = 1;
            this.f9869i = 1;
        }
        I(0);
        H();
        this.f9883w = true;
        this.f9884x = C.TIME_UNSET;
    }

    private static boolean A(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean B(boolean z10, byte b10, byte b11) {
        if (!z10 || !A(b10)) {
            this.f9879s = false;
        } else {
            if (this.f9879s && this.f9880t == b10 && this.f9881u == b11) {
                this.f9879s = false;
                return true;
            }
            this.f9879s = true;
            this.f9880t = b10;
            this.f9881u = b11;
        }
        return false;
    }

    private static boolean C(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean F(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void G(byte b10, byte b11) {
        if (F(b10)) {
            this.f9883w = false;
            return;
        }
        if (C(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f9883w = false;
                                break;
                        }
                        return;
                }
            }
            this.f9883w = true;
        }
    }

    private void H() {
        this.f9873m.j(this.f9876p);
        this.f9872l.clear();
        this.f9872l.add(this.f9873m);
    }

    private void I(int i10) {
        int i11 = this.f9876p;
        if (i11 == i10) {
            return;
        }
        this.f9876p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f9872l.size(); i12++) {
                ((C0134a) this.f9872l.get(i12)).l(i10);
            }
            return;
        }
        H();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f9874n = Collections.EMPTY_LIST;
        }
    }

    private void J(int i10) {
        this.f9877q = i10;
        this.f9873m.m(i10);
    }

    private boolean K() {
        return (this.f9871k == C.TIME_UNSET || this.f9884x == C.TIME_UNSET || f() - this.f9884x < this.f9871k) ? false : true;
    }

    private boolean L(byte b10) {
        if (v(b10)) {
            this.f9882v = m(b10);
        }
        return this.f9882v == this.f9870j;
    }

    private static char l(byte b10) {
        return (char) B[(b10 & 127) - 32];
    }

    private static int m(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List n() {
        int size = this.f9872l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            bb.b bVarG = ((C0134a) this.f9872l.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f8749i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            bb.b bVar = (bb.b) arrayList.get(i11);
            if (bVar != null) {
                if (bVar.f8749i != iMin) {
                    bVar = (bb.b) ob.a.e(((C0134a) this.f9872l.get(i11)).g(iMin));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char o(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char p(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char q(byte b10, byte b11) {
        return (b10 & 1) == 0 ? o(b11) : p(b11);
    }

    private static char r(byte b10) {
        return (char) C[b10 & 15];
    }

    private void s(byte b10) {
        this.f9873m.e(' ');
        this.f9873m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void t(byte b10) {
        if (b10 == 32) {
            I(2);
            return;
        }
        if (b10 == 41) {
            I(3);
            return;
        }
        switch (b10) {
            case 37:
                I(1);
                J(2);
                break;
            case 38:
                I(1);
                J(3);
                break;
            case 39:
                I(1);
                J(4);
                break;
            default:
                int i10 = this.f9876p;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f9874n = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    H();
                                }
                                break;
                            case SDK_INIT_API_VALUE:
                                if (i10 == 1 && !this.f9873m.i()) {
                                    this.f9873m.k();
                                    break;
                                }
                                break;
                            case AD_START_EVENT_VALUE:
                                H();
                                break;
                            case AD_CLICK_EVENT_VALUE:
                                this.f9874n = n();
                                H();
                                break;
                        }
                    } else {
                        this.f9873m.f();
                        break;
                    }
                }
                break;
        }
    }

    private void u(byte b10, byte b11) {
        int i10 = f9865y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f9873m.f9888d) {
            if (this.f9876p != 1 && !this.f9873m.i()) {
                C0134a c0134a = new C0134a(this.f9876p, this.f9877q);
                this.f9873m = c0134a;
                this.f9872l.add(c0134a);
            }
            this.f9873m.f9888d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f9873m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f9873m.f9889e = f9866z[i11];
        }
    }

    private static boolean v(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean w(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean x(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean y(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean z(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    @Override // cb.e
    protected i a() {
        List list = this.f9874n;
        this.f9875o = list;
        return new f((List) ob.a.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // cb.e
    protected void b(m mVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(mVar.f16754c);
        this.f9867g.S(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f9867g.a();
            int i10 = this.f9868h;
            if (iA < i10) {
                break;
            }
            int iH = i10 == 2 ? -4 : this.f9867g.H();
            int iH2 = this.f9867g.H();
            int iH3 = this.f9867g.H();
            if ((iH & 2) == 0 && (iH & 1) == this.f9869i) {
                byte b10 = (byte) (iH2 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                byte b11 = (byte) (iH3 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f9878r;
                    if ((iH & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iH2] && zArr[iH3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f9878r = z10;
                    if (!B(z10, b10, b11)) {
                        if (this.f9878r) {
                            G(b10, b11);
                            if (this.f9883w && L(b10)) {
                                if (!v(b10)) {
                                    this.f9873m.e(l(b10));
                                    if ((b11 & 224) != 0) {
                                        this.f9873m.e(l(b11));
                                    }
                                } else if (D(b10, b11)) {
                                    this.f9873m.e(r(b11));
                                } else if (w(b10, b11)) {
                                    this.f9873m.f();
                                    this.f9873m.e(q(b10, b11));
                                } else if (x(b10, b11)) {
                                    s(b11);
                                } else if (z(b10, b11)) {
                                    u(b10, b11);
                                } else if (E(b10, b11)) {
                                    this.f9873m.f9890f = b11 - 32;
                                } else if (y(b10, b11)) {
                                    t(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            H();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f9876p;
            if (i11 == 1 || i11 == 3) {
                this.f9874n = n();
                this.f9884x = f();
            }
        }
    }

    @Override // cb.e
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ m dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // cb.e, s9.d
    /* JADX INFO: renamed from: d */
    public n dequeueOutputBuffer() {
        n nVarE;
        n nVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (nVarDequeueOutputBuffer != null) {
            return nVarDequeueOutputBuffer;
        }
        if (!K() || (nVarE = e()) == null) {
            return null;
        }
        this.f9874n = Collections.EMPTY_LIST;
        this.f9884x = C.TIME_UNSET;
        nVarE.m(f(), a(), Long.MAX_VALUE);
        return nVarE;
    }

    @Override // cb.e, s9.d
    public void flush() {
        super.flush();
        this.f9874n = null;
        this.f9875o = null;
        I(0);
        J(4);
        H();
        this.f9878r = false;
        this.f9879s = false;
        this.f9880t = (byte) 0;
        this.f9881u = (byte) 0;
        this.f9882v = 0;
        this.f9883w = true;
        this.f9884x = C.TIME_UNSET;
    }

    @Override // cb.e
    protected boolean g() {
        return this.f9874n != this.f9875o;
    }

    @Override // cb.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void queueInputBuffer(m mVar) {
        super.queueInputBuffer(mVar);
    }

    @Override // cb.e, bb.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    @Override // cb.e, s9.d
    public void release() {
    }
}
