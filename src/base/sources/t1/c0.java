package t1;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c0 {
    public static final c0 C;
    public static final c0 D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f52579a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f52580b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f52581c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f52582d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f52583e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f52584f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f52585g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f52586h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f52587i0;
    public final com.google.common.collect.e0 A;
    public final com.google.common.collect.g0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f52594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f52595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f52596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f52597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f52598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.common.collect.c0 f52599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f52600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.common.collect.c0 f52601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f52602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f52603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f52604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.common.collect.c0 f52605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f52606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.google.common.collect.c0 f52607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f52608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f52609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f52610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f52611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f52612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f52613z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f52614d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f52615e = w1.c0.s0(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f52616f = w1.c0.s0(2);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f52617g = w1.c0.s0(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f52619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52620c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f52621a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f52622b = false;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f52623c = false;

            public b d() {
                return new b(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f52618a == bVar.f52618a && this.f52619b == bVar.f52619b && this.f52620c == bVar.f52620c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f52618a + 31) * 31) + (this.f52619b ? 1 : 0)) * 31) + (this.f52620c ? 1 : 0);
        }

        private b(a aVar) {
            this.f52618a = aVar.f52621a;
            this.f52619b = aVar.f52622b;
            this.f52620c = aVar.f52623c;
        }
    }

    static {
        c0 c0VarC = new c().C();
        C = c0VarC;
        D = c0VarC;
        E = w1.c0.s0(1);
        F = w1.c0.s0(2);
        G = w1.c0.s0(3);
        H = w1.c0.s0(4);
        I = w1.c0.s0(5);
        J = w1.c0.s0(6);
        K = w1.c0.s0(7);
        L = w1.c0.s0(8);
        M = w1.c0.s0(9);
        N = w1.c0.s0(10);
        O = w1.c0.s0(11);
        P = w1.c0.s0(12);
        Q = w1.c0.s0(13);
        R = w1.c0.s0(14);
        S = w1.c0.s0(15);
        T = w1.c0.s0(16);
        U = w1.c0.s0(17);
        V = w1.c0.s0(18);
        W = w1.c0.s0(19);
        X = w1.c0.s0(20);
        Y = w1.c0.s0(21);
        Z = w1.c0.s0(22);
        f52579a0 = w1.c0.s0(23);
        f52580b0 = w1.c0.s0(24);
        f52581c0 = w1.c0.s0(25);
        f52582d0 = w1.c0.s0(26);
        f52583e0 = w1.c0.s0(27);
        f52584f0 = w1.c0.s0(28);
        f52585g0 = w1.c0.s0(29);
        f52586h0 = w1.c0.s0(30);
        f52587i0 = w1.c0.s0(31);
    }

    protected c0(c cVar) {
        this.f52588a = cVar.f52624a;
        this.f52589b = cVar.f52625b;
        this.f52590c = cVar.f52626c;
        this.f52591d = cVar.f52627d;
        this.f52592e = cVar.f52628e;
        this.f52593f = cVar.f52629f;
        this.f52594g = cVar.f52630g;
        this.f52595h = cVar.f52631h;
        this.f52596i = cVar.f52632i;
        this.f52597j = cVar.f52633j;
        this.f52598k = cVar.f52634k;
        this.f52599l = cVar.f52635l;
        this.f52600m = cVar.f52636m;
        this.f52601n = cVar.f52637n;
        this.f52602o = cVar.f52638o;
        this.f52603p = cVar.f52639p;
        this.f52604q = cVar.f52640q;
        this.f52605r = cVar.f52641r;
        this.f52606s = cVar.f52642s;
        this.f52607t = cVar.f52643t;
        this.f52608u = cVar.f52644u;
        this.f52609v = cVar.f52645v;
        this.f52610w = cVar.f52646w;
        this.f52611x = cVar.f52647x;
        this.f52612y = cVar.f52648y;
        this.f52613z = cVar.f52649z;
        this.A = com.google.common.collect.e0.j(cVar.A);
        this.B = com.google.common.collect.g0.v(cVar.B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f52588a == c0Var.f52588a && this.f52589b == c0Var.f52589b && this.f52590c == c0Var.f52590c && this.f52591d == c0Var.f52591d && this.f52592e == c0Var.f52592e && this.f52593f == c0Var.f52593f && this.f52594g == c0Var.f52594g && this.f52595h == c0Var.f52595h && this.f52598k == c0Var.f52598k && this.f52596i == c0Var.f52596i && this.f52597j == c0Var.f52597j && this.f52599l.equals(c0Var.f52599l) && this.f52600m == c0Var.f52600m && this.f52601n.equals(c0Var.f52601n) && this.f52602o == c0Var.f52602o && this.f52603p == c0Var.f52603p && this.f52604q == c0Var.f52604q && this.f52605r.equals(c0Var.f52605r) && this.f52606s.equals(c0Var.f52606s) && this.f52607t.equals(c0Var.f52607t) && this.f52608u == c0Var.f52608u && this.f52609v == c0Var.f52609v && this.f52610w == c0Var.f52610w && this.f52611x == c0Var.f52611x && this.f52612y == c0Var.f52612y && this.f52613z == c0Var.f52613z && this.A.equals(c0Var.A) && this.B.equals(c0Var.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f52588a + 31) * 31) + this.f52589b) * 31) + this.f52590c) * 31) + this.f52591d) * 31) + this.f52592e) * 31) + this.f52593f) * 31) + this.f52594g) * 31) + this.f52595h) * 31) + (this.f52598k ? 1 : 0)) * 31) + this.f52596i) * 31) + this.f52597j) * 31) + this.f52599l.hashCode()) * 31) + this.f52600m) * 31) + this.f52601n.hashCode()) * 31) + this.f52602o) * 31) + this.f52603p) * 31) + this.f52604q) * 31) + this.f52605r.hashCode()) * 31) + this.f52606s.hashCode()) * 31) + this.f52607t.hashCode()) * 31) + this.f52608u) * 31) + this.f52609v) * 31) + (this.f52610w ? 1 : 0)) * 31) + (this.f52611x ? 1 : 0)) * 31) + (this.f52612y ? 1 : 0)) * 31) + (this.f52613z ? 1 : 0)) * 31) + this.A.hashCode()) * 31) + this.B.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {
        private HashMap A;
        private HashSet B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f52631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f52632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f52633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f52634k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.google.common.collect.c0 f52635l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f52636m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.common.collect.c0 f52637n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f52638o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f52639p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f52640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.google.common.collect.c0 f52641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b f52642s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private com.google.common.collect.c0 f52643t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f52644u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f52645v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f52646w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f52647x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f52648y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f52649z;

        public c() {
            this.f52624a = Integer.MAX_VALUE;
            this.f52625b = Integer.MAX_VALUE;
            this.f52626c = Integer.MAX_VALUE;
            this.f52627d = Integer.MAX_VALUE;
            this.f52632i = Integer.MAX_VALUE;
            this.f52633j = Integer.MAX_VALUE;
            this.f52634k = true;
            this.f52635l = com.google.common.collect.c0.C();
            this.f52636m = 0;
            this.f52637n = com.google.common.collect.c0.C();
            this.f52638o = 0;
            this.f52639p = Integer.MAX_VALUE;
            this.f52640q = Integer.MAX_VALUE;
            this.f52641r = com.google.common.collect.c0.C();
            this.f52642s = b.f52614d;
            this.f52643t = com.google.common.collect.c0.C();
            this.f52644u = 0;
            this.f52645v = 0;
            this.f52646w = false;
            this.f52647x = false;
            this.f52648y = false;
            this.f52649z = false;
            this.A = new HashMap();
            this.B = new HashSet();
        }

        private void D(c0 c0Var) {
            this.f52624a = c0Var.f52588a;
            this.f52625b = c0Var.f52589b;
            this.f52626c = c0Var.f52590c;
            this.f52627d = c0Var.f52591d;
            this.f52628e = c0Var.f52592e;
            this.f52629f = c0Var.f52593f;
            this.f52630g = c0Var.f52594g;
            this.f52631h = c0Var.f52595h;
            this.f52632i = c0Var.f52596i;
            this.f52633j = c0Var.f52597j;
            this.f52634k = c0Var.f52598k;
            this.f52635l = c0Var.f52599l;
            this.f52636m = c0Var.f52600m;
            this.f52637n = c0Var.f52601n;
            this.f52638o = c0Var.f52602o;
            this.f52639p = c0Var.f52603p;
            this.f52640q = c0Var.f52604q;
            this.f52641r = c0Var.f52605r;
            this.f52642s = c0Var.f52606s;
            this.f52643t = c0Var.f52607t;
            this.f52644u = c0Var.f52608u;
            this.f52645v = c0Var.f52609v;
            this.f52646w = c0Var.f52610w;
            this.f52647x = c0Var.f52611x;
            this.f52648y = c0Var.f52612y;
            this.f52649z = c0Var.f52613z;
            this.B = new HashSet(c0Var.B);
            this.A = new HashMap(c0Var.A);
        }

        public c0 C() {
            return new c0(this);
        }

        protected c E(c0 c0Var) {
            D(c0Var);
            return this;
        }

        public c F(Context context) {
            CaptioningManager captioningManager;
            if ((w1.c0.f55769a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f52644u = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f52643t = com.google.common.collect.c0.D(w1.c0.W(locale));
                }
            }
            return this;
        }

        public c G(int i10, int i11, boolean z10) {
            this.f52632i = i10;
            this.f52633j = i11;
            this.f52634k = z10;
            return this;
        }

        public c H(Context context, boolean z10) {
            Point pointP = w1.c0.P(context);
            return G(pointP.x, pointP.y, z10);
        }

        public c(Context context) {
            this();
            F(context);
            H(context, true);
        }

        protected c(c0 c0Var) {
            D(c0Var);
        }
    }
}
