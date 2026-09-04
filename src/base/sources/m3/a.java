package m3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l3.k;
import l3.o;
import l3.p;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f45148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f45149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f45150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f45151l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f45154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f45155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f45156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f45157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f45158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f45159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f45160u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f45161v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f45163x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f45164y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f45146z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk$SDKError.b.TPAT_ERROR_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    private static final int[] D = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] E = {193, 201, 211, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 235, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] F = {195, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 204, 236, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, 242, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f45147h = new u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f45152m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0685a f45153n = new C0685a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f45162w = 0;

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0685a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f45165a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f45166b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f45167c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f45170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f45171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45172h;

        /* JADX INFO: renamed from: m3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0686a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f45173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f45174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f45175c;

            public C0686a(int i10, boolean z10, int i11) {
                this.f45173a = i10;
                this.f45174b = z10;
                this.f45175c = i11;
            }
        }

        public C0685a(int i10, int i11) {
            j(i10);
            this.f45172h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f45167c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f45165a.size()) {
                C0686a c0686a = (C0686a) this.f45165a.get(i14);
                boolean z11 = c0686a.f45174b;
                int i16 = c0686a.f45173a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0686a.f45175c;
                i14++;
                if (i17 != (i14 < this.f45165a.size() ? ((C0686a) this.f45165a.get(i14)).f45175c : length)) {
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
            if (this.f45167c.length() < 32) {
                this.f45167c.append(c10);
            }
        }

        public void f() {
            int length = this.f45167c.length();
            if (length > 0) {
                this.f45167c.delete(length - 1, length);
                for (int size = this.f45165a.size() - 1; size >= 0; size--) {
                    C0686a c0686a = (C0686a) this.f45165a.get(size);
                    int i10 = c0686a.f45175c;
                    if (i10 != length) {
                        return;
                    }
                    c0686a.f45175c = i10 - 1;
                }
            }
        }

        public v1.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f45166b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f45166b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f45169e + this.f45170f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f45171g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f45171g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f45168d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f45171g == 1) {
                i14 -= this.f45172h - 1;
            }
            return new v1.a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f45165a.isEmpty() && this.f45166b.isEmpty() && this.f45167c.length() == 0;
        }

        public void j(int i10) {
            this.f45171g = i10;
            this.f45165a.clear();
            this.f45166b.clear();
            this.f45167c.setLength(0);
            this.f45168d = 15;
            this.f45169e = 0;
            this.f45170f = 0;
        }

        public void k() {
            this.f45166b.add(h());
            this.f45167c.setLength(0);
            this.f45165a.clear();
            int iMin = Math.min(this.f45172h, this.f45168d);
            while (this.f45166b.size() >= iMin) {
                this.f45166b.remove(0);
            }
        }

        public void l(int i10) {
            this.f45171g = i10;
        }

        public void m(int i10) {
            this.f45172h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f45165a.add(new C0686a(i10, z10, this.f45167c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != C.TIME_UNSET) {
            w1.a.a(j10 >= 16000);
            this.f45151l = j10 * 1000;
        } else {
            this.f45151l = C.TIME_UNSET;
        }
        this.f45148i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f45150k = 0;
            this.f45149j = 0;
        } else if (i10 == 2) {
            this.f45150k = 1;
            this.f45149j = 0;
        } else if (i10 == 3) {
            this.f45150k = 0;
            this.f45149j = 1;
        } else if (i10 != 4) {
            n.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f45150k = 0;
            this.f45149j = 0;
        } else {
            this.f45150k = 1;
            this.f45149j = 1;
        }
        K(0);
        J();
        this.f45163x = true;
        this.f45164y = C.TIME_UNSET;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean C(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean D(boolean z10, byte b10, byte b11) {
        if (!z10 || !C(b10)) {
            this.f45159t = false;
        } else {
            if (this.f45159t && this.f45160u == b10 && this.f45161v == b11) {
                this.f45159t = false;
                return true;
            }
            this.f45159t = true;
            this.f45160u = b10;
            this.f45161v = b11;
        }
        return false;
    }

    private static boolean E(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean G(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean H(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void I(byte b10, byte b11) {
        if (H(b10)) {
            this.f45163x = false;
            return;
        }
        if (E(b10)) {
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
                                this.f45163x = false;
                                break;
                        }
                        return;
                }
            }
            this.f45163x = true;
        }
    }

    private void J() {
        this.f45153n.j(this.f45156q);
        this.f45152m.clear();
        this.f45152m.add(this.f45153n);
    }

    private void K(int i10) {
        int i11 = this.f45156q;
        if (i11 == i10) {
            return;
        }
        this.f45156q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f45152m.size(); i12++) {
                ((C0685a) this.f45152m.get(i12)).l(i10);
            }
            return;
        }
        J();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f45154o = Collections.EMPTY_LIST;
        }
    }

    private void L(int i10) {
        this.f45157r = i10;
        this.f45153n.m(i10);
    }

    private boolean M() {
        return (this.f45151l == C.TIME_UNSET || this.f45164y == C.TIME_UNSET || h() - this.f45164y < this.f45151l) ? false : true;
    }

    private boolean N(byte b10) {
        if (x(b10)) {
            this.f45162w = o(b10);
        }
        return this.f45162w == this.f45150k;
    }

    private static char n(byte b10) {
        return (char) C[(b10 & 127) - 32];
    }

    private static int o(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List p() {
        int size = this.f45152m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            v1.a aVarG = ((C0685a) this.f45152m.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f55066i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            v1.a aVar = (v1.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f55066i != iMin) {
                    aVar = (v1.a) w1.a.e(((C0685a) this.f45152m.get(i11)).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char q(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char r(byte b10) {
        return (char) F[b10 & 31];
    }

    private static char s(byte b10, byte b11) {
        return (b10 & 1) == 0 ? q(b11) : r(b11);
    }

    private static char t(byte b10) {
        return (char) D[b10 & 15];
    }

    private void u(byte b10) {
        this.f45153n.e(' ');
        this.f45153n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void v(byte b10) {
        if (b10 == 32) {
            K(2);
            return;
        }
        if (b10 == 41) {
            K(3);
            return;
        }
        switch (b10) {
            case 37:
                K(1);
                L(2);
                break;
            case 38:
                K(1);
                L(3);
                break;
            case 39:
                K(1);
                L(4);
                break;
            default:
                int i10 = this.f45156q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f45154o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    J();
                                }
                                break;
                            case SDK_INIT_API_VALUE:
                                if (i10 == 1 && !this.f45153n.i()) {
                                    this.f45153n.k();
                                    break;
                                }
                                break;
                            case AD_START_EVENT_VALUE:
                                J();
                                break;
                            case AD_CLICK_EVENT_VALUE:
                                this.f45154o = p();
                                J();
                                break;
                        }
                    } else {
                        this.f45153n.f();
                        break;
                    }
                }
                break;
        }
    }

    private void w(byte b10, byte b11) {
        int i10 = f45146z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f45153n.f45168d) {
            if (this.f45156q != 1 && !this.f45153n.i()) {
                C0685a c0685a = new C0685a(this.f45156q, this.f45157r);
                this.f45153n = c0685a;
                this.f45152m.add(c0685a);
            }
            this.f45153n.f45168d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f45153n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f45153n.f45169e = A[i11];
        }
    }

    private static boolean x(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean y(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean z(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    @Override // m3.e
    protected k c() {
        List list = this.f45154o;
        this.f45155p = list;
        return new f((List) w1.a.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // m3.e
    protected void d(o oVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(oVar.f4864d);
        this.f45147h.R(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f45147h.a();
            int i10 = this.f45148i;
            if (iA < i10) {
                break;
            }
            int iG = i10 == 2 ? -4 : this.f45147h.G();
            int iG2 = this.f45147h.G();
            int iG3 = this.f45147h.G();
            if ((iG & 2) == 0 && (iG & 1) == this.f45149j) {
                byte b10 = (byte) (iG2 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                byte b11 = (byte) (iG3 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f45158s;
                    if ((iG & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iG2] && zArr[iG3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f45158s = z10;
                    if (!D(z10, b10, b11)) {
                        if (this.f45158s) {
                            I(b10, b11);
                            if (this.f45163x && N(b10)) {
                                if (!x(b10)) {
                                    this.f45153n.e(n(b10));
                                    if ((b11 & 224) != 0) {
                                        this.f45153n.e(n(b11));
                                    }
                                } else if (F(b10, b11)) {
                                    this.f45153n.e(t(b11));
                                } else if (y(b10, b11)) {
                                    this.f45153n.f();
                                    this.f45153n.e(s(b10, b11));
                                } else if (z(b10, b11)) {
                                    u(b11);
                                } else if (B(b10, b11)) {
                                    w(b10, b11);
                                } else if (G(b10, b11)) {
                                    this.f45153n.f45170f = b11 - 32;
                                } else if (A(b10, b11)) {
                                    v(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            J();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f45156q;
            if (i11 == 1 || i11 == 3) {
                this.f45154o = p();
                this.f45164y = h();
            }
        }
    }

    @Override // m3.e
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ o dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // m3.e, b2.d
    /* JADX INFO: renamed from: f */
    public p dequeueOutputBuffer() {
        p pVarG;
        p pVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (pVarDequeueOutputBuffer != null) {
            return pVarDequeueOutputBuffer;
        }
        if (!M() || (pVarG = g()) == null) {
            return null;
        }
        this.f45154o = Collections.EMPTY_LIST;
        this.f45164y = C.TIME_UNSET;
        pVarG.k(h(), c(), Long.MAX_VALUE);
        return pVarG;
    }

    @Override // m3.e, b2.d
    public void flush() {
        super.flush();
        this.f45154o = null;
        this.f45155p = null;
        K(0);
        L(4);
        J();
        this.f45158s = false;
        this.f45159t = false;
        this.f45160u = (byte) 0;
        this.f45161v = (byte) 0;
        this.f45162w = 0;
        this.f45163x = true;
        this.f45164y = C.TIME_UNSET;
    }

    @Override // m3.e
    protected boolean i() {
        return this.f45154o != this.f45155p;
    }

    @Override // m3.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void queueInputBuffer(o oVar) {
        super.queueInputBuffer(oVar);
    }

    @Override // m3.e, l3.l
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    @Override // m3.e, b2.d
    public void release() {
    }
}
