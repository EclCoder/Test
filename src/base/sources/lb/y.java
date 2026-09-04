package lb;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.google.common.collect.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class y implements com.google.android.exoplayer2.g {
    public static final y A;
    public static final y B;
    private static final String C;
    private static final String D;
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
    private static final String f44237a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f44238b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f44239c0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f44249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f44250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f44251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f44252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f44253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f44254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f44255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f44256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f44257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f44258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f44259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f44260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f44261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f44262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f44263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e0 f44264y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g0 f44265z;

    static {
        y yVarA = new a().A();
        A = yVarA;
        B = yVarA;
        C = r0.y0(1);
        D = r0.y0(2);
        E = r0.y0(3);
        F = r0.y0(4);
        G = r0.y0(5);
        H = r0.y0(6);
        I = r0.y0(7);
        J = r0.y0(8);
        K = r0.y0(9);
        L = r0.y0(10);
        M = r0.y0(11);
        N = r0.y0(12);
        O = r0.y0(13);
        P = r0.y0(14);
        Q = r0.y0(15);
        R = r0.y0(16);
        S = r0.y0(17);
        T = r0.y0(18);
        U = r0.y0(19);
        V = r0.y0(20);
        W = r0.y0(21);
        X = r0.y0(22);
        Y = r0.y0(23);
        Z = r0.y0(24);
        f44237a0 = r0.y0(25);
        f44238b0 = r0.y0(26);
        f44239c0 = new com.google.android.exoplayer2.g.a() { // from class: lb.x
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y.B(bundle);
            }
        };
    }

    protected y(a aVar) {
        this.f44240a = aVar.f44266a;
        this.f44241b = aVar.f44267b;
        this.f44242c = aVar.f44268c;
        this.f44243d = aVar.f44269d;
        this.f44244e = aVar.f44270e;
        this.f44245f = aVar.f44271f;
        this.f44246g = aVar.f44272g;
        this.f44247h = aVar.f44273h;
        this.f44248i = aVar.f44274i;
        this.f44249j = aVar.f44275j;
        this.f44250k = aVar.f44276k;
        this.f44251l = aVar.f44277l;
        this.f44252m = aVar.f44278m;
        this.f44253n = aVar.f44279n;
        this.f44254o = aVar.f44280o;
        this.f44255p = aVar.f44281p;
        this.f44256q = aVar.f44282q;
        this.f44257r = aVar.f44283r;
        this.f44258s = aVar.f44284s;
        this.f44259t = aVar.f44285t;
        this.f44260u = aVar.f44286u;
        this.f44261v = aVar.f44287v;
        this.f44262w = aVar.f44288w;
        this.f44263x = aVar.f44289x;
        this.f44264y = e0.j(aVar.f44290y);
        this.f44265z = g0.v(aVar.f44291z);
    }

    public static y B(Bundle bundle) {
        return new a(bundle).A();
    }

    public a A() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f44240a == yVar.f44240a && this.f44241b == yVar.f44241b && this.f44242c == yVar.f44242c && this.f44243d == yVar.f44243d && this.f44244e == yVar.f44244e && this.f44245f == yVar.f44245f && this.f44246g == yVar.f44246g && this.f44247h == yVar.f44247h && this.f44250k == yVar.f44250k && this.f44248i == yVar.f44248i && this.f44249j == yVar.f44249j && this.f44251l.equals(yVar.f44251l) && this.f44252m == yVar.f44252m && this.f44253n.equals(yVar.f44253n) && this.f44254o == yVar.f44254o && this.f44255p == yVar.f44255p && this.f44256q == yVar.f44256q && this.f44257r.equals(yVar.f44257r) && this.f44258s.equals(yVar.f44258s) && this.f44259t == yVar.f44259t && this.f44260u == yVar.f44260u && this.f44261v == yVar.f44261v && this.f44262w == yVar.f44262w && this.f44263x == yVar.f44263x && this.f44264y.equals(yVar.f44264y) && this.f44265z.equals(yVar.f44265z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f44240a + 31) * 31) + this.f44241b) * 31) + this.f44242c) * 31) + this.f44243d) * 31) + this.f44244e) * 31) + this.f44245f) * 31) + this.f44246g) * 31) + this.f44247h) * 31) + (this.f44250k ? 1 : 0)) * 31) + this.f44248i) * 31) + this.f44249j) * 31) + this.f44251l.hashCode()) * 31) + this.f44252m) * 31) + this.f44253n.hashCode()) * 31) + this.f44254o) * 31) + this.f44255p) * 31) + this.f44256q) * 31) + this.f44257r.hashCode()) * 31) + this.f44258s.hashCode()) * 31) + this.f44259t) * 31) + this.f44260u) * 31) + (this.f44261v ? 1 : 0)) * 31) + (this.f44262w ? 1 : 0)) * 31) + (this.f44263x ? 1 : 0)) * 31) + this.f44264y.hashCode()) * 31) + this.f44265z.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(H, this.f44240a);
        bundle.putInt(I, this.f44241b);
        bundle.putInt(J, this.f44242c);
        bundle.putInt(K, this.f44243d);
        bundle.putInt(L, this.f44244e);
        bundle.putInt(M, this.f44245f);
        bundle.putInt(N, this.f44246g);
        bundle.putInt(O, this.f44247h);
        bundle.putInt(P, this.f44248i);
        bundle.putInt(Q, this.f44249j);
        bundle.putBoolean(R, this.f44250k);
        bundle.putStringArray(S, (String[]) this.f44251l.toArray(new String[0]));
        bundle.putInt(f44237a0, this.f44252m);
        bundle.putStringArray(C, (String[]) this.f44253n.toArray(new String[0]));
        bundle.putInt(D, this.f44254o);
        bundle.putInt(T, this.f44255p);
        bundle.putInt(U, this.f44256q);
        bundle.putStringArray(V, (String[]) this.f44257r.toArray(new String[0]));
        bundle.putStringArray(E, (String[]) this.f44258s.toArray(new String[0]));
        bundle.putInt(F, this.f44259t);
        bundle.putInt(f44238b0, this.f44260u);
        bundle.putBoolean(G, this.f44261v);
        bundle.putBoolean(W, this.f44262w);
        bundle.putBoolean(X, this.f44263x);
        bundle.putParcelableArrayList(Y, ob.c.i(this.f44264y.values()));
        bundle.putIntArray(Z, com.google.common.primitives.g.n(this.f44265z));
        return bundle;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f44268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f44270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f44271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f44272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f44273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f44274i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f44275j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f44276k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private c0 f44277l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f44278m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c0 f44279n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f44280o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f44281p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f44282q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private c0 f44283r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private c0 f44284s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f44285t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f44286u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f44287v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f44288w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f44289x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private HashMap f44290y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private HashSet f44291z;

        public a() {
            this.f44266a = Integer.MAX_VALUE;
            this.f44267b = Integer.MAX_VALUE;
            this.f44268c = Integer.MAX_VALUE;
            this.f44269d = Integer.MAX_VALUE;
            this.f44274i = Integer.MAX_VALUE;
            this.f44275j = Integer.MAX_VALUE;
            this.f44276k = true;
            this.f44277l = c0.C();
            this.f44278m = 0;
            this.f44279n = c0.C();
            this.f44280o = 0;
            this.f44281p = Integer.MAX_VALUE;
            this.f44282q = Integer.MAX_VALUE;
            this.f44283r = c0.C();
            this.f44284s = c0.C();
            this.f44285t = 0;
            this.f44286u = 0;
            this.f44287v = false;
            this.f44288w = false;
            this.f44289x = false;
            this.f44290y = new HashMap();
            this.f44291z = new HashSet();
        }

        private void C(y yVar) {
            this.f44266a = yVar.f44240a;
            this.f44267b = yVar.f44241b;
            this.f44268c = yVar.f44242c;
            this.f44269d = yVar.f44243d;
            this.f44270e = yVar.f44244e;
            this.f44271f = yVar.f44245f;
            this.f44272g = yVar.f44246g;
            this.f44273h = yVar.f44247h;
            this.f44274i = yVar.f44248i;
            this.f44275j = yVar.f44249j;
            this.f44276k = yVar.f44250k;
            this.f44277l = yVar.f44251l;
            this.f44278m = yVar.f44252m;
            this.f44279n = yVar.f44253n;
            this.f44280o = yVar.f44254o;
            this.f44281p = yVar.f44255p;
            this.f44282q = yVar.f44256q;
            this.f44283r = yVar.f44257r;
            this.f44284s = yVar.f44258s;
            this.f44285t = yVar.f44259t;
            this.f44286u = yVar.f44260u;
            this.f44287v = yVar.f44261v;
            this.f44288w = yVar.f44262w;
            this.f44289x = yVar.f44263x;
            this.f44291z = new HashSet(yVar.f44265z);
            this.f44290y = new HashMap(yVar.f44264y);
        }

        private static c0 D(String[] strArr) {
            c0.a aVarR = c0.r();
            for (String str : (String[]) ob.a.e(strArr)) {
                aVarR.a(r0.J0((String) ob.a.e(str)));
            }
            return aVarR.m();
        }

        private void I(Context context) {
            CaptioningManager captioningManager;
            if ((r0.f48425a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f44285t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f44284s = c0.D(r0.a0(locale));
                }
            }
        }

        public y A() {
            return new y(this);
        }

        public a B(int i10) {
            Iterator it = this.f44290y.values().iterator();
            while (it.hasNext()) {
                if (((w) it.next()).b() == i10) {
                    it.remove();
                }
            }
            return this;
        }

        protected a E(y yVar) {
            C(yVar);
            return this;
        }

        public a F(int i10) {
            this.f44286u = i10;
            return this;
        }

        public a G(w wVar) {
            B(wVar.b());
            this.f44290y.put(wVar.f44235a, wVar);
            return this;
        }

        public a H(Context context) {
            if (r0.f48425a >= 19) {
                I(context);
            }
            return this;
        }

        public a J(int i10, boolean z10) {
            if (z10) {
                this.f44291z.add(Integer.valueOf(i10));
                return this;
            }
            this.f44291z.remove(Integer.valueOf(i10));
            return this;
        }

        public a K(int i10, int i11, boolean z10) {
            this.f44274i = i10;
            this.f44275j = i11;
            this.f44276k = z10;
            return this;
        }

        public a L(Context context, boolean z10) {
            Point pointP = r0.P(context);
            return K(pointP.x, pointP.y, z10);
        }

        public a(Context context) {
            this();
            H(context);
            L(context, true);
        }

        protected a(y yVar) {
            C(yVar);
        }

        protected a(Bundle bundle) {
            c0 c0VarD;
            String str = y.H;
            y yVar = y.A;
            this.f44266a = bundle.getInt(str, yVar.f44240a);
            this.f44267b = bundle.getInt(y.I, yVar.f44241b);
            this.f44268c = bundle.getInt(y.J, yVar.f44242c);
            this.f44269d = bundle.getInt(y.K, yVar.f44243d);
            this.f44270e = bundle.getInt(y.L, yVar.f44244e);
            this.f44271f = bundle.getInt(y.M, yVar.f44245f);
            this.f44272g = bundle.getInt(y.N, yVar.f44246g);
            this.f44273h = bundle.getInt(y.O, yVar.f44247h);
            this.f44274i = bundle.getInt(y.P, yVar.f44248i);
            this.f44275j = bundle.getInt(y.Q, yVar.f44249j);
            this.f44276k = bundle.getBoolean(y.R, yVar.f44250k);
            this.f44277l = c0.z((String[]) sc.j.a(bundle.getStringArray(y.S), new String[0]));
            this.f44278m = bundle.getInt(y.f44237a0, yVar.f44252m);
            this.f44279n = D((String[]) sc.j.a(bundle.getStringArray(y.C), new String[0]));
            this.f44280o = bundle.getInt(y.D, yVar.f44254o);
            this.f44281p = bundle.getInt(y.T, yVar.f44255p);
            this.f44282q = bundle.getInt(y.U, yVar.f44256q);
            this.f44283r = c0.z((String[]) sc.j.a(bundle.getStringArray(y.V), new String[0]));
            this.f44284s = D((String[]) sc.j.a(bundle.getStringArray(y.E), new String[0]));
            this.f44285t = bundle.getInt(y.F, yVar.f44259t);
            this.f44286u = bundle.getInt(y.f44238b0, yVar.f44260u);
            this.f44287v = bundle.getBoolean(y.G, yVar.f44261v);
            this.f44288w = bundle.getBoolean(y.W, yVar.f44262w);
            this.f44289x = bundle.getBoolean(y.X, yVar.f44263x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.Y);
            if (parcelableArrayList == null) {
                c0VarD = c0.C();
            } else {
                c0VarD = ob.c.d(w.f44234e, parcelableArrayList);
            }
            this.f44290y = new HashMap();
            for (int i10 = 0; i10 < c0VarD.size(); i10++) {
                w wVar = (w) c0VarD.get(i10);
                this.f44290y.put(wVar.f44235a, wVar);
            }
            int[] iArr = (int[]) sc.j.a(bundle.getIntArray(y.Z), new int[0]);
            this.f44291z = new HashSet();
            for (int i11 : iArr) {
                this.f44291z.add(Integer.valueOf(i11));
            }
        }
    }
}
