package m3;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l3.k;
import l3.o;
import l3.p;
import w1.n;
import w1.t;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f45176h = new u();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f45177i = new t();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45178j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f45179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f45180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f45181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f45182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f45183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f45184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0687c f45185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f45186r;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f45187c = new Comparator() { // from class: m3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f45189b, ((c.a) obj).f45189b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v1.a f45188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45189b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            v1.a.b bVarN = new v1.a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f45188a = bVarN.a();
            this.f45189b = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f45190v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f45191w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f45192x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f45193y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f45194z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f45195a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f45196b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f45197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f45198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f45200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f45201g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45202h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f45203i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f45204j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f45205k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f45206l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f45207m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f45208n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f45209o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f45210p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f45211q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f45212r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f45213s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f45214t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f45215u;

        static {
            int iH = h(0, 0, 0, 0);
            f45191w = iH;
            int iH2 = h(0, 0, 0, 3);
            f45192x = iH2;
            f45193y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f45194z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            w1.a.c(i10, 0, 4);
            w1.a.c(i11, 0, 4);
            w1.a.c(i12, 0, 4);
            w1.a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f45196b.append(c10);
                return;
            }
            this.f45195a.add(d());
            this.f45196b.clear();
            if (this.f45209o != -1) {
                this.f45209o = 0;
            }
            if (this.f45210p != -1) {
                this.f45210p = 0;
            }
            if (this.f45211q != -1) {
                this.f45211q = 0;
            }
            if (this.f45213s != -1) {
                this.f45213s = 0;
            }
            while (true) {
                if (this.f45195a.size() < this.f45204j && this.f45195a.size() < 15) {
                    this.f45215u = this.f45195a.size();
                    return;
                }
                this.f45195a.remove(0);
            }
        }

        public void b() {
            int length = this.f45196b.length();
            if (length > 0) {
                this.f45196b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f45195a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f45195a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f45205k;
            int i12 = 2;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f45205k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f45200f) {
                f10 = this.f45202h / 99.0f;
                f11 = this.f45201g / 99.0f;
            } else {
                f10 = this.f45202h / 209.0f;
                f11 = this.f45201g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i13 = this.f45203i;
            int i14 = i13 / 3 == 0 ? 0 : i13 / 3 == 1 ? 1 : 2;
            if (i13 % 3 == 0) {
                i12 = 0;
            } else if (i13 % 3 == 1) {
                i12 = 1;
            }
            return new a(spannableStringBuilder, alignment, f13, 0, i14, f12, i12, -3.4028235E38f, this.f45208n != f45191w, this.f45208n, this.f45199e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f45196b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f45209o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f45209o, length, 33);
                }
                if (this.f45210p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f45210p, length, 33);
                }
                if (this.f45211q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f45212r), this.f45211q, length, 33);
                }
                if (this.f45213s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f45214t), this.f45213s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f45195a.clear();
            this.f45196b.clear();
            this.f45209o = -1;
            this.f45210p = -1;
            this.f45211q = -1;
            this.f45213s = -1;
            this.f45215u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f45197c = true;
            this.f45198d = z10;
            this.f45199e = i10;
            this.f45200f = z11;
            this.f45201g = i11;
            this.f45202h = i12;
            this.f45203i = i14;
            int i17 = i13 + 1;
            if (this.f45204j != i17) {
                this.f45204j = i17;
                while (true) {
                    if (this.f45195a.size() < this.f45204j && this.f45195a.size() < 15) {
                        break;
                    } else {
                        this.f45195a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f45206l != i15) {
                this.f45206l = i15;
                int i18 = i15 - 1;
                q(C[i18], f45192x, B[i18], 0, f45194z[i18], A[i18], f45193y[i18]);
            }
            if (i16 == 0 || this.f45207m == i16) {
                return;
            }
            this.f45207m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, E[i19], D[i19]);
            n(f45190v, F[i19], f45191w);
        }

        public boolean i() {
            return this.f45197c;
        }

        public boolean j() {
            if (i()) {
                return this.f45195a.isEmpty() && this.f45196b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f45198d;
        }

        public void l() {
            e();
            this.f45197c = false;
            this.f45198d = false;
            this.f45199e = 4;
            this.f45200f = false;
            this.f45201g = 0;
            this.f45202h = 0;
            this.f45203i = 0;
            this.f45204j = 15;
            this.f45205k = 0;
            this.f45206l = 0;
            this.f45207m = 0;
            int i10 = f45191w;
            this.f45208n = i10;
            this.f45212r = f45190v;
            this.f45214t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f45209o != -1) {
                if (!z10) {
                    this.f45196b.setSpan(new StyleSpan(2), this.f45209o, this.f45196b.length(), 33);
                    this.f45209o = -1;
                }
            } else if (z10) {
                this.f45209o = this.f45196b.length();
            }
            if (this.f45210p == -1) {
                if (z11) {
                    this.f45210p = this.f45196b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f45196b.setSpan(new UnderlineSpan(), this.f45210p, this.f45196b.length(), 33);
                this.f45210p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f45211q != -1 && this.f45212r != i10) {
                this.f45196b.setSpan(new ForegroundColorSpan(this.f45212r), this.f45211q, this.f45196b.length(), 33);
            }
            if (i10 != f45190v) {
                this.f45211q = this.f45196b.length();
                this.f45212r = i10;
            }
            if (this.f45213s != -1 && this.f45214t != i11) {
                this.f45196b.setSpan(new BackgroundColorSpan(this.f45214t), this.f45213s, this.f45196b.length(), 33);
            }
            if (i11 != f45191w) {
                this.f45213s = this.f45196b.length();
                this.f45214t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f45215u != i10) {
                a('\n');
            }
            this.f45215u = i10;
        }

        public void p(boolean z10) {
            this.f45198d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f45208n = i10;
            this.f45205k = i15;
        }
    }

    /* JADX INFO: renamed from: m3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0687c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f45218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45219d = 0;

        public C0687c(int i10, int i11) {
            this.f45216a = i10;
            this.f45217b = i11;
            this.f45218c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List list) {
        this.f45180l = i10 == -1 ? 1 : i10;
        this.f45179k = list != null && w1.e.f(list);
        this.f45181m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f45181m[i11] = new b();
        }
        this.f45182n = this.f45181m[0];
    }

    private void A() {
        int iH = b.h(this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2));
        int iH2 = this.f45177i.h(2);
        int iG = b.g(this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2));
        if (this.f45177i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f45177i.g();
        int iH3 = this.f45177i.h(2);
        int iH4 = this.f45177i.h(2);
        int iH5 = this.f45177i.h(2);
        this.f45177i.r(8);
        this.f45182n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void B() {
        C0687c c0687c = this.f45185q;
        if (c0687c.f45219d != (c0687c.f45217b * 2) - 1) {
            n.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f45185q.f45217b * 2) - 1) + ", but current index is " + this.f45185q.f45219d + " (sequence number " + this.f45185q.f45216a + ");");
        }
        t tVar = this.f45177i;
        C0687c c0687c2 = this.f45185q;
        tVar.o(c0687c2.f45218c, c0687c2.f45219d);
        boolean z10 = false;
        while (this.f45177i.b() > 0) {
            int iH = this.f45177i.h(3);
            int iH2 = this.f45177i.h(5);
            if (iH == 7) {
                this.f45177i.r(2);
                iH = this.f45177i.h(6);
                if (iH < 7) {
                    n.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                n.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f45180l) {
                this.f45177i.s(iH2);
            } else {
                int iE = this.f45177i.e() + (iH2 * 8);
                while (this.f45177i.e() < iE) {
                    int iH3 = this.f45177i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f45177i.h(8);
                        if (iH4 <= 31) {
                            q(iH4);
                        } else {
                            if (iH4 <= 127) {
                                v(iH4);
                            } else if (iH4 <= 159) {
                                r(iH4);
                            } else if (iH4 <= 255) {
                                w(iH4);
                            } else {
                                n.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        o(iH3);
                    } else {
                        if (iH3 <= 127) {
                            t(iH3);
                        } else if (iH3 <= 159) {
                            p(iH3);
                        } else if (iH3 <= 255) {
                            u(iH3);
                        } else {
                            n.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f45183o = n();
        }
    }

    private void C() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f45181m[i10].l();
        }
    }

    private void m() {
        if (this.f45185q == null) {
            return;
        }
        B();
        this.f45185q = null;
    }

    private List n() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f45181m[i10].j() && this.f45181m[i10].k() && (aVarC = this.f45181m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f45187c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f45188a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void o(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f45183o = n();
                return;
            }
            if (i10 == 8) {
                this.f45182n.b();
                return;
            }
            switch (i10) {
                case 12:
                    C();
                    break;
                case 13:
                    this.f45182n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        n.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f45177i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        n.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f45177i.r(16);
                    } else {
                        n.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void p(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f45186r != i12) {
                    this.f45186r = i12;
                    this.f45182n = this.f45181m[i12];
                }
                break;
            case PRIVACY_URL_ERROR_VALUE:
                while (i11 <= 8) {
                    if (this.f45177i.g()) {
                        this.f45181m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f45177i.g()) {
                        this.f45181m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f45177i.g()) {
                        this.f45181m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f45177i.g()) {
                        b bVar = this.f45181m[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f45177i.g()) {
                        this.f45181m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f45177i.r(8);
                break;
            case 142:
                break;
            case 143:
                C();
                break;
            case 144:
                if (this.f45182n.i()) {
                    x();
                } else {
                    this.f45177i.r(16);
                }
                break;
            case 145:
                if (this.f45182n.i()) {
                    y();
                } else {
                    this.f45177i.r(24);
                }
                break;
            case 146:
                if (this.f45182n.i()) {
                    z();
                } else {
                    this.f45177i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                n.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f45182n.i()) {
                    A();
                } else {
                    this.f45177i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                s(i15);
                if (this.f45186r != i15) {
                    this.f45186r = i15;
                    this.f45182n = this.f45181m[i15];
                }
                break;
        }
    }

    private void q(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f45177i.r(8);
        } else if (i10 <= 23) {
            this.f45177i.r(16);
        } else if (i10 <= 31) {
            this.f45177i.r(24);
        }
    }

    private void r(int i10) {
        if (i10 <= 135) {
            this.f45177i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f45177i.r(40);
        } else if (i10 <= 159) {
            this.f45177i.r(2);
            this.f45177i.r(this.f45177i.h(6) * 8);
        }
    }

    private void s(int i10) {
        b bVar = this.f45181m[i10];
        this.f45177i.r(2);
        boolean zG = this.f45177i.g();
        this.f45177i.r(2);
        int iH = this.f45177i.h(3);
        boolean zG2 = this.f45177i.g();
        int iH2 = this.f45177i.h(7);
        int iH3 = this.f45177i.h(8);
        int iH4 = this.f45177i.h(4);
        int iH5 = this.f45177i.h(4);
        this.f45177i.r(2);
        this.f45177i.r(6);
        this.f45177i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f45177i.h(3), this.f45177i.h(3));
    }

    private void t(int i10) {
        if (i10 == 127) {
            this.f45182n.a((char) 9835);
        } else {
            this.f45182n.a((char) (i10 & 255));
        }
    }

    private void u(int i10) {
        this.f45182n.a((char) (i10 & 255));
    }

    private void v(int i10) {
        if (i10 == 32) {
            this.f45182n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f45182n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f45182n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f45182n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f45182n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f45182n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f45182n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f45182n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f45182n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f45182n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f45182n.a((char) 9608);
                break;
            case 49:
                this.f45182n.a((char) 8216);
                break;
            case 50:
                this.f45182n.a((char) 8217);
                break;
            case 51:
                this.f45182n.a((char) 8220);
                break;
            case 52:
                this.f45182n.a((char) 8221);
                break;
            case 53:
                this.f45182n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        this.f45182n.a((char) 8539);
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        this.f45182n.a((char) 8540);
                        break;
                    case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                        this.f45182n.a((char) 8541);
                        break;
                    case TPAT_ERROR_VALUE:
                        this.f45182n.a((char) 8542);
                        break;
                    case INVALID_ADS_ENDPOINT_VALUE:
                        this.f45182n.a((char) 9474);
                        break;
                    case INVALID_RI_ENDPOINT_VALUE:
                        this.f45182n.a((char) 9488);
                        break;
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        this.f45182n.a((char) 9492);
                        break;
                    case INVALID_METRICS_ENDPOINT_VALUE:
                        this.f45182n.a((char) 9472);
                        break;
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        this.f45182n.a((char) 9496);
                        break;
                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        this.f45182n.a((char) 9484);
                        break;
                    default:
                        n.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    private void w(int i10) {
        if (i10 == 160) {
            this.f45182n.a((char) 13252);
            return;
        }
        n.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f45182n.a('_');
    }

    private void x() {
        this.f45182n.m(this.f45177i.h(4), this.f45177i.h(2), this.f45177i.h(2), this.f45177i.g(), this.f45177i.g(), this.f45177i.h(3), this.f45177i.h(3));
    }

    private void y() {
        int iH = b.h(this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2));
        int iH2 = b.h(this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2));
        this.f45177i.r(2);
        this.f45182n.n(iH, iH2, b.g(this.f45177i.h(2), this.f45177i.h(2), this.f45177i.h(2)));
    }

    private void z() {
        this.f45177i.r(4);
        int iH = this.f45177i.h(4);
        this.f45177i.r(2);
        this.f45182n.o(iH, this.f45177i.h(6));
    }

    @Override // m3.e
    protected k c() {
        List list = this.f45183o;
        this.f45184p = list;
        return new f((List) w1.a.e(list));
    }

    @Override // m3.e
    protected void d(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(oVar.f4864d);
        this.f45176h.R(byteBuffer.array(), byteBuffer.limit());
        while (this.f45176h.a() >= 3) {
            int iG = this.f45176h.G();
            int i10 = iG & 3;
            boolean z10 = (iG & 4) == 4;
            byte bG = (byte) this.f45176h.G();
            byte bG2 = (byte) this.f45176h.G();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        m();
                        int i11 = (bG & 192) >> 6;
                        int i12 = this.f45178j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            C();
                            n.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f45178j + " current=" + i11);
                        }
                        this.f45178j = i11;
                        int i13 = bG & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0687c c0687c = new C0687c(i11, i13);
                        this.f45185q = c0687c;
                        byte[] bArr = c0687c.f45218c;
                        int i14 = c0687c.f45219d;
                        c0687c.f45219d = i14 + 1;
                        bArr[i14] = bG2;
                    } else {
                        w1.a.a(i10 == 2);
                        C0687c c0687c2 = this.f45185q;
                        if (c0687c2 == null) {
                            n.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0687c2.f45218c;
                            int i15 = c0687c2.f45219d;
                            int i16 = i15 + 1;
                            c0687c2.f45219d = i16;
                            bArr2[i15] = bG;
                            c0687c2.f45219d = i15 + 2;
                            bArr2[i16] = bG2;
                        }
                    }
                    C0687c c0687c3 = this.f45185q;
                    if (c0687c3.f45219d == (c0687c3.f45217b * 2) - 1) {
                        m();
                    }
                }
            }
        }
    }

    @Override // m3.e
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ o dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // m3.e
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ p dequeueOutputBuffer() {
        return super.dequeueOutputBuffer();
    }

    @Override // m3.e, b2.d
    public void flush() {
        super.flush();
        this.f45183o = null;
        this.f45184p = null;
        this.f45186r = 0;
        this.f45182n = this.f45181m[0];
        C();
        this.f45185q = null;
    }

    @Override // m3.e
    protected boolean i() {
        return this.f45183o != this.f45184p;
    }

    @Override // m3.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void queueInputBuffer(o oVar) {
        super.queueInputBuffer(oVar);
    }

    @Override // m3.e, b2.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // m3.e, l3.l
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
