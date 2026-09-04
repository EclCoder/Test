package cb;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import bb.i;
import bb.m;
import bb.n;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ob.c0;
import ob.d0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f9896g = new d0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f9897h = new c0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9898i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f9899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f9900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b[] f9901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f9902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f9903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f9904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C0136c f9905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9906q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f9907c = new Comparator() { // from class: cb.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f9909b, ((c.a) obj).f9909b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bb.b f9908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9909b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            bb.b.C0112b c0112bN = new bb.b.C0112b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                c0112bN.s(i13);
            }
            this.f9908a = c0112bN.a();
            this.f9909b = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f9910w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f9911x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f9912y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f9913z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9914a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f9915b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9921h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9922i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9923j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f9924k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f9925l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9926m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f9927n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f9928o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f9929p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f9930q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f9931r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f9932s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f9933t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f9934u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f9935v;

        static {
            int iH = h(0, 0, 0, 0);
            f9911x = iH;
            int iH2 = h(0, 0, 0, 3);
            f9912y = iH2;
            f9913z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
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
            ob.a.c(i10, 0, 4);
            ob.a.c(i11, 0, 4);
            ob.a.c(i12, 0, 4);
            ob.a.c(i13, 0, 4);
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
                this.f9915b.append(c10);
                return;
            }
            this.f9914a.add(d());
            this.f9915b.clear();
            if (this.f9929p != -1) {
                this.f9929p = 0;
            }
            if (this.f9930q != -1) {
                this.f9930q = 0;
            }
            if (this.f9931r != -1) {
                this.f9931r = 0;
            }
            if (this.f9933t != -1) {
                this.f9933t = 0;
            }
            while (true) {
                if ((!this.f9924k || this.f9914a.size() < this.f9923j) && this.f9914a.size() < 15) {
                    return;
                } else {
                    this.f9914a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f9915b.length();
            if (length > 0) {
                this.f9915b.delete(length - 1, length);
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
            for (int i10 = 0; i10 < this.f9914a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f9914a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f9925l;
            int i12 = 2;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f9925l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f9919f) {
                f10 = this.f9921h / 99.0f;
                f11 = this.f9920g / 99.0f;
            } else {
                f10 = this.f9921h / 209.0f;
                f11 = this.f9920g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i13 = this.f9922i;
            int i14 = i13 / 3 == 0 ? 0 : i13 / 3 == 1 ? 1 : 2;
            if (i13 % 3 == 0) {
                i12 = 0;
            } else if (i13 % 3 == 1) {
                i12 = 1;
            }
            return new a(spannableStringBuilder, alignment, f13, 0, i14, f12, i12, -3.4028235E38f, this.f9928o != f9911x, this.f9928o, this.f9918e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9915b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f9929p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f9929p, length, 33);
                }
                if (this.f9930q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9930q, length, 33);
                }
                if (this.f9931r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9932s), this.f9931r, length, 33);
                }
                if (this.f9933t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9934u), this.f9933t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f9914a.clear();
            this.f9915b.clear();
            this.f9929p = -1;
            this.f9930q = -1;
            this.f9931r = -1;
            this.f9933t = -1;
            this.f9935v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f9916c = true;
            this.f9917d = z10;
            this.f9924k = z11;
            this.f9918e = i10;
            this.f9919f = z13;
            this.f9920g = i11;
            this.f9921h = i12;
            this.f9922i = i15;
            int i18 = i13 + 1;
            if (this.f9923j != i18) {
                this.f9923j = i18;
                while (true) {
                    if ((!z11 || this.f9914a.size() < this.f9923j) && this.f9914a.size() < 15) {
                        break;
                    } else {
                        this.f9914a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f9926m != i16) {
                this.f9926m = i16;
                int i19 = i16 - 1;
                q(D[i19], f9912y, C[i19], 0, A[i19], B[i19], f9913z[i19]);
            }
            if (i17 == 0 || this.f9927n == i17) {
                return;
            }
            this.f9927n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f9910w, G[i20], f9911x);
        }

        public boolean i() {
            return this.f9916c;
        }

        public boolean j() {
            if (i()) {
                return this.f9914a.isEmpty() && this.f9915b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f9917d;
        }

        public void l() {
            e();
            this.f9916c = false;
            this.f9917d = false;
            this.f9918e = 4;
            this.f9919f = false;
            this.f9920g = 0;
            this.f9921h = 0;
            this.f9922i = 0;
            this.f9923j = 15;
            this.f9924k = true;
            this.f9925l = 0;
            this.f9926m = 0;
            this.f9927n = 0;
            int i10 = f9911x;
            this.f9928o = i10;
            this.f9932s = f9910w;
            this.f9934u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f9929p != -1) {
                if (!z10) {
                    this.f9915b.setSpan(new StyleSpan(2), this.f9929p, this.f9915b.length(), 33);
                    this.f9929p = -1;
                }
            } else if (z10) {
                this.f9929p = this.f9915b.length();
            }
            if (this.f9930q == -1) {
                if (z11) {
                    this.f9930q = this.f9915b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f9915b.setSpan(new UnderlineSpan(), this.f9930q, this.f9915b.length(), 33);
                this.f9930q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f9931r != -1 && this.f9932s != i10) {
                this.f9915b.setSpan(new ForegroundColorSpan(this.f9932s), this.f9931r, this.f9915b.length(), 33);
            }
            if (i10 != f9910w) {
                this.f9931r = this.f9915b.length();
                this.f9932s = i10;
            }
            if (this.f9933t != -1 && this.f9934u != i11) {
                this.f9915b.setSpan(new BackgroundColorSpan(this.f9934u), this.f9933t, this.f9915b.length(), 33);
            }
            if (i11 != f9911x) {
                this.f9933t = this.f9915b.length();
                this.f9934u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f9935v != i10) {
                a('\n');
            }
            this.f9935v = i10;
        }

        public void p(boolean z10) {
            this.f9917d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f9928o = i10;
            this.f9925l = i15;
        }
    }

    /* JADX INFO: renamed from: cb.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0136c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f9938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f9939d = 0;

        public C0136c(int i10, int i11) {
            this.f9936a = i10;
            this.f9937b = i11;
            this.f9938c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List list) {
        this.f9900k = i10 == -1 ? 1 : i10;
        this.f9899j = list != null && ob.e.i(list);
        this.f9901l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f9901l[i11] = new b();
        }
        this.f9902m = this.f9901l[0];
    }

    private void A() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f9901l[i10].l();
        }
    }

    private void k() {
        if (this.f9905p == null) {
            return;
        }
        z();
        this.f9905p = null;
    }

    private List l() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f9901l[i10].j() && this.f9901l[i10].k() && (aVarC = this.f9901l[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f9907c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f9908a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void m(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f9903n = l();
                return;
            }
            if (i10 == 8) {
                this.f9902m.b();
                return;
            }
            switch (i10) {
                case 12:
                    A();
                    break;
                case 13:
                    this.f9902m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        u.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f9897h.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        u.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f9897h.r(16);
                    } else {
                        u.i("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void n(int i10) {
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
                if (this.f9906q != i12) {
                    this.f9906q = i12;
                    this.f9902m = this.f9901l[i12];
                }
                break;
            case PRIVACY_URL_ERROR_VALUE:
                while (i11 <= 8) {
                    if (this.f9897h.g()) {
                        this.f9901l[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f9897h.g()) {
                        this.f9901l[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f9897h.g()) {
                        this.f9901l[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f9897h.g()) {
                        b bVar = this.f9901l[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f9897h.g()) {
                        this.f9901l[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f9897h.r(8);
                break;
            case 142:
                break;
            case 143:
                A();
                break;
            case 144:
                if (this.f9902m.i()) {
                    v();
                } else {
                    this.f9897h.r(16);
                }
                break;
            case 145:
                if (this.f9902m.i()) {
                    w();
                } else {
                    this.f9897h.r(24);
                }
                break;
            case 146:
                if (this.f9902m.i()) {
                    x();
                } else {
                    this.f9897h.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                u.i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f9902m.i()) {
                    y();
                } else {
                    this.f9897h.r(32);
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
                q(i15);
                if (this.f9906q != i15) {
                    this.f9906q = i15;
                    this.f9902m = this.f9901l[i15];
                }
                break;
        }
    }

    private void o(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f9897h.r(8);
        } else if (i10 <= 23) {
            this.f9897h.r(16);
        } else if (i10 <= 31) {
            this.f9897h.r(24);
        }
    }

    private void p(int i10) {
        if (i10 <= 135) {
            this.f9897h.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f9897h.r(40);
        } else if (i10 <= 159) {
            this.f9897h.r(2);
            this.f9897h.r(this.f9897h.h(6) * 8);
        }
    }

    private void q(int i10) {
        b bVar = this.f9901l[i10];
        this.f9897h.r(2);
        boolean zG = this.f9897h.g();
        boolean zG2 = this.f9897h.g();
        boolean zG3 = this.f9897h.g();
        int iH = this.f9897h.h(3);
        boolean zG4 = this.f9897h.g();
        int iH2 = this.f9897h.h(7);
        int iH3 = this.f9897h.h(8);
        int iH4 = this.f9897h.h(4);
        int iH5 = this.f9897h.h(4);
        this.f9897h.r(2);
        int iH6 = this.f9897h.h(6);
        this.f9897h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f9897h.h(3), this.f9897h.h(3));
    }

    private void r(int i10) {
        if (i10 == 127) {
            this.f9902m.a((char) 9835);
        } else {
            this.f9902m.a((char) (i10 & 255));
        }
    }

    private void s(int i10) {
        this.f9902m.a((char) (i10 & 255));
    }

    private void t(int i10) {
        if (i10 == 32) {
            this.f9902m.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f9902m.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f9902m.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f9902m.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f9902m.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f9902m.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f9902m.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f9902m.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f9902m.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f9902m.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f9902m.a((char) 9608);
                break;
            case 49:
                this.f9902m.a((char) 8216);
                break;
            case 50:
                this.f9902m.a((char) 8217);
                break;
            case 51:
                this.f9902m.a((char) 8220);
                break;
            case 52:
                this.f9902m.a((char) 8221);
                break;
            case 53:
                this.f9902m.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        this.f9902m.a((char) 8539);
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        this.f9902m.a((char) 8540);
                        break;
                    case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                        this.f9902m.a((char) 8541);
                        break;
                    case TPAT_ERROR_VALUE:
                        this.f9902m.a((char) 8542);
                        break;
                    case INVALID_ADS_ENDPOINT_VALUE:
                        this.f9902m.a((char) 9474);
                        break;
                    case INVALID_RI_ENDPOINT_VALUE:
                        this.f9902m.a((char) 9488);
                        break;
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        this.f9902m.a((char) 9492);
                        break;
                    case INVALID_METRICS_ENDPOINT_VALUE:
                        this.f9902m.a((char) 9472);
                        break;
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        this.f9902m.a((char) 9496);
                        break;
                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        this.f9902m.a((char) 9484);
                        break;
                    default:
                        u.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    private void u(int i10) {
        if (i10 == 160) {
            this.f9902m.a((char) 13252);
            return;
        }
        u.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f9902m.a('_');
    }

    private void v() {
        this.f9902m.m(this.f9897h.h(4), this.f9897h.h(2), this.f9897h.h(2), this.f9897h.g(), this.f9897h.g(), this.f9897h.h(3), this.f9897h.h(3));
    }

    private void w() {
        int iH = b.h(this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2));
        int iH2 = b.h(this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2));
        this.f9897h.r(2);
        this.f9902m.n(iH, iH2, b.g(this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2)));
    }

    private void x() {
        this.f9897h.r(4);
        int iH = this.f9897h.h(4);
        this.f9897h.r(2);
        this.f9902m.o(iH, this.f9897h.h(6));
    }

    private void y() {
        int iH = b.h(this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2));
        int iH2 = this.f9897h.h(2);
        int iG = b.g(this.f9897h.h(2), this.f9897h.h(2), this.f9897h.h(2));
        if (this.f9897h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f9897h.g();
        int iH3 = this.f9897h.h(2);
        int iH4 = this.f9897h.h(2);
        int iH5 = this.f9897h.h(2);
        this.f9897h.r(8);
        this.f9902m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void z() {
        C0136c c0136c = this.f9905p;
        if (c0136c.f9939d != (c0136c.f9937b * 2) - 1) {
            u.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f9905p.f9937b * 2) - 1) + ", but current index is " + this.f9905p.f9939d + " (sequence number " + this.f9905p.f9936a + ");");
        }
        c0 c0Var = this.f9897h;
        C0136c c0136c2 = this.f9905p;
        c0Var.o(c0136c2.f9938c, c0136c2.f9939d);
        boolean z10 = false;
        while (this.f9897h.b() > 0) {
            int iH = this.f9897h.h(3);
            int iH2 = this.f9897h.h(5);
            if (iH == 7) {
                this.f9897h.r(2);
                iH = this.f9897h.h(6);
                if (iH < 7) {
                    u.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                u.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f9900k) {
                this.f9897h.s(iH2);
            } else {
                int iE = this.f9897h.e() + (iH2 * 8);
                while (this.f9897h.e() < iE) {
                    int iH3 = this.f9897h.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f9897h.h(8);
                        if (iH4 <= 31) {
                            o(iH4);
                        } else {
                            if (iH4 <= 127) {
                                t(iH4);
                            } else if (iH4 <= 159) {
                                p(iH4);
                            } else if (iH4 <= 255) {
                                u(iH4);
                            } else {
                                u.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        m(iH3);
                    } else {
                        if (iH3 <= 127) {
                            r(iH3);
                        } else if (iH3 <= 159) {
                            n(iH3);
                        } else if (iH3 <= 255) {
                            s(iH3);
                        } else {
                            u.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f9903n = l();
        }
    }

    @Override // cb.e
    protected i a() {
        List list = this.f9903n;
        this.f9904o = list;
        return new f((List) ob.a.e(list));
    }

    @Override // cb.e
    protected void b(m mVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(mVar.f16754c);
        this.f9896g.S(byteBuffer.array(), byteBuffer.limit());
        while (this.f9896g.a() >= 3) {
            int iH = this.f9896g.H();
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f9896g.H();
            byte bH2 = (byte) this.f9896g.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        k();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f9898i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            A();
                            u.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f9898i + " current=" + i11);
                        }
                        this.f9898i = i11;
                        int i13 = bH & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0136c c0136c = new C0136c(i11, i13);
                        this.f9905p = c0136c;
                        byte[] bArr = c0136c.f9938c;
                        int i14 = c0136c.f9939d;
                        c0136c.f9939d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        ob.a.a(i10 == 2);
                        C0136c c0136c2 = this.f9905p;
                        if (c0136c2 == null) {
                            u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0136c2.f9938c;
                            int i15 = c0136c2.f9939d;
                            int i16 = i15 + 1;
                            c0136c2.f9939d = i16;
                            bArr2[i15] = bH;
                            c0136c2.f9939d = i15 + 2;
                            bArr2[i16] = bH2;
                        }
                    }
                    C0136c c0136c3 = this.f9905p;
                    if (c0136c3.f9939d == (c0136c3.f9937b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // cb.e
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ m dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // cb.e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ n dequeueOutputBuffer() {
        return super.dequeueOutputBuffer();
    }

    @Override // cb.e, s9.d
    public void flush() {
        super.flush();
        this.f9903n = null;
        this.f9904o = null;
        this.f9906q = 0;
        this.f9902m = this.f9901l[0];
        A();
        this.f9905p = null;
    }

    @Override // cb.e
    protected boolean g() {
        return this.f9903n != this.f9904o;
    }

    @Override // cb.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void queueInputBuffer(m mVar) {
        super.queueInputBuffer(mVar);
    }

    @Override // cb.e, s9.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // cb.e, bb.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
