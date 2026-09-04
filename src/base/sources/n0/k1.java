package n0;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f46650b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f46651a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private static class b extends i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static Field f46653h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f46654i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Constructor f46655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static boolean f46656k;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WindowInsets f46657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e0.b f46658g;

        b() {
            this.f46657f = j();
        }

        @Override // n0.k1.i
        k1 b() {
            a();
            k1 k1VarE = k1.E(this.f46657f);
            k1VarE.w(this.f46663b);
            k1VarE.z(this.f46658g);
            k1VarE.v(this.f46664c);
            k1VarE.B(this.f46665d);
            k1VarE.C(this.f46666e);
            return k1VarE;
        }

        @Override // n0.k1.i
        void f(e0.b bVar) {
            this.f46658g = bVar;
        }

        @Override // n0.k1.i
        void h(e0.b bVar) {
            WindowInsets windowInsets = this.f46657f;
            if (windowInsets != null) {
                this.f46657f = windowInsets.replaceSystemWindowInsets(bVar.f37000a, bVar.f37001b, bVar.f37002c, bVar.f37003d);
            }
        }

        private static WindowInsets j() {
            if (!f46654i) {
                try {
                    f46653h = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f46654i = true;
            }
            Field field = f46653h;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f46656k) {
                try {
                    f46655j = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f46656k = true;
            }
            Constructor constructor = f46655j;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", mTFeqtajA.vBdglF, e13);
                }
            }
            return null;
        }

        b(k1 k1Var) {
            super(k1Var);
            this.f46657f = k1Var.D();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends c {
        d() {
        }

        @Override // n0.k1.i
        void d(int i10, e0.b bVar) {
            this.f46659f.setInsets(t.a(i10), bVar.f());
        }

        d(k1 k1Var) {
            super(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e extends d {
        e() {
        }

        e(k1 k1Var) {
            super(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f extends e {
        f() {
        }

        @Override // n0.k1.d, n0.k1.i
        void d(int i10, e0.b bVar) {
            this.f46659f.setInsets(u.a(i10), bVar.f());
        }

        f(k1 k1Var) {
            super(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class h extends g {
        h() {
        }

        h(k1 k1Var) {
            super(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1 f46662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e0.b[] f46663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        n0.l f46664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Rect[][] f46665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Rect[][] f46666e;

        i() {
            this(new k1((k1) null));
        }

        protected final void a() {
            e0.b[] bVarArr = this.f46663b;
            if (bVarArr != null) {
                e0.b bVarG = bVarArr[s.c(1)];
                e0.b bVarG2 = this.f46663b[s.c(2)];
                if (bVarG2 == null) {
                    bVarG2 = this.f46662a.g(2);
                }
                if (bVarG == null) {
                    bVarG = this.f46662a.g(1);
                }
                h(e0.b.a(bVarG, bVarG2));
                e0.b bVar = this.f46663b[s.c(16)];
                if (bVar != null) {
                    g(bVar);
                }
                e0.b bVar2 = this.f46663b[s.c(32)];
                if (bVar2 != null) {
                    e(bVar2);
                }
                e0.b bVar3 = this.f46663b[s.c(64)];
                if (bVar3 != null) {
                    i(bVar3);
                }
            }
        }

        abstract k1 b();

        void c(k1 k1Var) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                List listD = k1Var.d(i10);
                int iC = s.c(i10);
                this.f46665d[iC] = (Rect[]) listD.toArray(new Rect[listD.size()]);
                if (i10 != 8) {
                    List listE = k1Var.e(i10);
                    this.f46666e[iC] = (Rect[]) listE.toArray(new Rect[listE.size()]);
                }
            }
        }

        void d(int i10, e0.b bVar) {
            if (this.f46663b == null) {
                this.f46663b = new e0.b[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f46663b[s.c(i11)] = bVar;
                }
            }
        }

        abstract void f(e0.b bVar);

        abstract void h(e0.b bVar);

        i(k1 k1Var) {
            this.f46665d = new Rect[10][];
            this.f46666e = new Rect[10][];
            this.f46662a = k1Var;
            c(k1Var);
        }

        void e(e0.b bVar) {
        }

        void g(e0.b bVar) {
        }

        void i(e0.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class l extends k {
        l(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        @Override // n0.k1.r
        k1 a() {
            return k1.E(this.f46672c.consumeDisplayCutout());
        }

        @Override // n0.k1.j, n0.k1.r
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Objects.equals(this.f46672c, lVar.f46672c) && Objects.equals(this.f46676g, lVar.f46676g) && j.K(this.f46677h, lVar.f46677h);
        }

        @Override // n0.k1.r
        n0.k h() {
            return n0.k.e(this.f46672c.getDisplayCutout());
        }

        @Override // n0.k1.r
        public int hashCode() {
            return this.f46672c.hashCode();
        }

        l(k1 k1Var, l lVar) {
            super(k1Var, lVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class n extends m {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final k1 f46687w = k1.E(WindowInsets.CONSUMED);

        n(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        @Override // n0.k1.j, n0.k1.r
        public e0.b i(int i10) {
            return e0.b.e(this.f46672c.getInsets(t.a(i10)));
        }

        @Override // n0.k1.j, n0.k1.r
        public e0.b j(int i10) {
            return e0.b.e(this.f46672c.getInsetsIgnoringVisibility(t.a(i10)));
        }

        n(k1 k1Var, n nVar) {
            super(k1Var, nVar);
        }

        @Override // n0.k1.j, n0.k1.r
        final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class o extends n {
        o(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        o(k1 k1Var, o oVar) {
            super(k1Var, oVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class p extends o {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final k1 f46688x = k1.E(WindowInsets.CONSUMED);

        p(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        @Override // n0.k1.n, n0.k1.j, n0.k1.r
        public e0.b i(int i10) {
            return e0.b.e(this.f46672c.getInsets(u.a(i10)));
        }

        @Override // n0.k1.n, n0.k1.j, n0.k1.r
        public e0.b j(int i10) {
            return e0.b.e(this.f46672c.getInsetsIgnoringVisibility(u.a(i10)));
        }

        p(k1 k1Var, p pVar) {
            super(k1Var, pVar);
        }

        @Override // n0.k1.j, n0.k1.r
        void p(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class q extends p {
        q(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        @Override // n0.k1.j, n0.k1.r
        List<Rect> f(int i10) {
            return this.f46672c.getBoundingRects(u.a(i10));
        }

        @Override // n0.k1.j, n0.k1.r
        List<Rect> g(int i10) {
            return this.f46672c.getBoundingRectsIgnoringVisibility(u.a(i10));
        }

        q(k1 k1Var, q qVar) {
            super(k1Var, qVar);
        }

        @Override // n0.k1.j, n0.k1.r
        void q() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class s {
        public static int a() {
            return 128;
        }

        public static int b() {
            return 8;
        }

        static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int d() {
            return 32;
        }

        public static int e() {
            return 2;
        }

        public static int f() {
            return 1;
        }

        public static int g() {
            return 519;
        }

        public static int h() {
            return 16;
        }

        public static int i() {
            return 64;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class t {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class u {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f46650b = p.f46688x;
        } else if (i10 >= 30) {
            f46650b = n.f46687w;
        } else {
            f46650b = r.f46689b;
        }
    }

    private k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f46651a = new q(this, windowInsets);
            return;
        }
        if (i10 >= 34) {
            this.f46651a = new p(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f46651a = new o(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f46651a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f46651a = new m(this, windowInsets);
        } else if (i10 >= 28) {
            this.f46651a = new l(this, windowInsets);
        } else {
            this.f46651a = new k(this, windowInsets);
        }
    }

    public static k1 E(WindowInsets windowInsets) {
        return F(windowInsets, null);
    }

    public static k1 F(WindowInsets windowInsets, View view) {
        k1 k1Var = new k1((WindowInsets) m0.g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            k1Var.y(q0.I(view));
            k1Var.p(view.getRootView());
            k1Var.A(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    static e0.b r(e0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f37000a - i10);
        int iMax2 = Math.max(0, bVar.f37001b - i11);
        int iMax3 = Math.max(0, bVar.f37002c - i12);
        int iMax4 = Math.max(0, bVar.f37003d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : e0.b.c(iMax, iMax2, iMax3, iMax4);
    }

    void A(int i10) {
        this.f46651a.z(i10);
    }

    void B(Rect[][] rectArr) {
        this.f46651a.A(rectArr);
    }

    void C(Rect[][] rectArr) {
        this.f46651a.B(rectArr);
    }

    public WindowInsets D() {
        r rVar = this.f46651a;
        if (rVar instanceof j) {
            return ((j) rVar).f46672c;
        }
        return null;
    }

    public k1 a() {
        return this.f46651a.a();
    }

    public k1 b() {
        return this.f46651a.b();
    }

    public k1 c() {
        return this.f46651a.c();
    }

    public List d(int i10) {
        return this.f46651a.f(i10);
    }

    public List e(int i10) {
        return this.f46651a.g(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return m0.b.a(this.f46651a, ((k1) obj).f46651a);
        }
        return false;
    }

    public n0.k f() {
        return this.f46651a.h();
    }

    public e0.b g(int i10) {
        return this.f46651a.i(i10);
    }

    public e0.b h(int i10) {
        return this.f46651a.j(i10);
    }

    public int hashCode() {
        r rVar = this.f46651a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public e0.b i() {
        return this.f46651a.l();
    }

    public e0.b j() {
        return this.f46651a.m();
    }

    public int k() {
        return this.f46651a.n().f37003d;
    }

    public int l() {
        return this.f46651a.n().f37000a;
    }

    public int m() {
        return this.f46651a.n().f37002c;
    }

    public int n() {
        return this.f46651a.n().f37001b;
    }

    public boolean o() {
        return !this.f46651a.n().equals(e0.b.f36999e);
    }

    void p(View view) {
        this.f46651a.d(view);
        this.f46651a.p(view);
        this.f46651a.q();
    }

    public k1 q(int i10, int i11, int i12, int i13) {
        return this.f46651a.r(i10, i11, i12, i13);
    }

    public boolean s() {
        return this.f46651a.s();
    }

    public boolean t() {
        return this.f46651a.t();
    }

    public k1 u(int i10, int i11, int i12, int i13) {
        return new a(this).d(e0.b.c(i10, i11, i12, i13)).a();
    }

    void v(n0.l lVar) {
        this.f46651a.u(lVar);
    }

    void w(e0.b[] bVarArr) {
        this.f46651a.v(bVarArr);
    }

    void x(e0.b bVar) {
        this.f46651a.w(bVar);
    }

    void y(k1 k1Var) {
        this.f46651a.x(k1Var);
    }

    void z(e0.b bVar) {
        this.f46651a.y(bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final WindowInsets.Builder f46659f;

        c() {
            this.f46659f = m1.a();
        }

        @Override // n0.k1.i
        k1 b() {
            a();
            k1 k1VarE = k1.E(this.f46659f.build());
            k1VarE.w(this.f46663b);
            k1VarE.v(this.f46664c);
            k1VarE.B(this.f46665d);
            k1VarE.C(this.f46666e);
            return k1VarE;
        }

        @Override // n0.k1.i
        void e(e0.b bVar) {
            this.f46659f.setMandatorySystemGestureInsets(bVar.f());
        }

        @Override // n0.k1.i
        void f(e0.b bVar) {
            this.f46659f.setStableInsets(bVar.f());
        }

        @Override // n0.k1.i
        void g(e0.b bVar) {
            this.f46659f.setSystemGestureInsets(bVar.f());
        }

        @Override // n0.k1.i
        void h(e0.b bVar) {
            this.f46659f.setSystemWindowInsets(bVar.f());
        }

        @Override // n0.k1.i
        void i(e0.b bVar) {
            this.f46659f.setTappableElementInsets(bVar.f());
        }

        c(k1 k1Var) {
            WindowInsets.Builder builderA;
            super(k1Var);
            WindowInsets windowInsetsD = k1Var.D();
            if (windowInsetsD != null) {
                builderA = l1.a(windowInsetsD);
            } else {
                builderA = m1.a();
            }
            this.f46659f = builderA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class k extends j {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private e0.b f46683s;

        k(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
            this.f46683s = null;
        }

        @Override // n0.k1.r
        k1 b() {
            return k1.E(this.f46672c.consumeStableInsets());
        }

        @Override // n0.k1.r
        k1 c() {
            return k1.E(this.f46672c.consumeSystemWindowInsets());
        }

        @Override // n0.k1.r
        final e0.b l() {
            if (this.f46683s == null) {
                this.f46683s = e0.b.c(this.f46672c.getStableInsetLeft(), this.f46672c.getStableInsetTop(), this.f46672c.getStableInsetRight(), this.f46672c.getStableInsetBottom());
            }
            return this.f46683s;
        }

        @Override // n0.k1.r
        boolean s() {
            return this.f46672c.isConsumed();
        }

        @Override // n0.k1.r
        public void y(e0.b bVar) {
            this.f46683s = bVar;
        }

        k(k1 k1Var, k kVar) {
            super(k1Var, kVar);
            this.f46683s = null;
            this.f46683s = kVar.f46683s;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g extends f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f46661h;

        g() {
            this.f46660g = false;
            this.f46661h = false;
        }

        @Override // n0.k1.f, n0.k1.d, n0.k1.i
        void d(int i10, e0.b bVar) {
            super.d(i10, bVar);
            this.f46660g = true;
        }

        g(k1 k1Var) {
            super(k1Var);
            this.f46660g = false;
            this.f46661h = false;
            if (k1Var.s()) {
                return;
            }
            this.f46660g = true;
            this.f46661h = true;
        }

        @Override // n0.k1.i
        void c(k1 k1Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class m extends l {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private e0.b f46684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private e0.b f46685u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private e0.b f46686v;

        m(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
            this.f46684t = null;
            this.f46685u = null;
            this.f46686v = null;
        }

        @Override // n0.k1.r
        e0.b k() {
            if (this.f46685u == null) {
                this.f46685u = e0.b.e(this.f46672c.getMandatorySystemGestureInsets());
            }
            return this.f46685u;
        }

        @Override // n0.k1.r
        e0.b m() {
            if (this.f46684t == null) {
                this.f46684t = e0.b.e(this.f46672c.getSystemGestureInsets());
            }
            return this.f46684t;
        }

        @Override // n0.k1.r
        e0.b o() {
            if (this.f46686v == null) {
                this.f46686v = e0.b.e(this.f46672c.getTappableElementInsets());
            }
            return this.f46686v;
        }

        @Override // n0.k1.j, n0.k1.r
        k1 r(int i10, int i11, int i12, int i13) {
            return k1.E(this.f46672c.inset(i10, i11, i12, i13));
        }

        m(k1 k1Var, m mVar) {
            super(k1Var, mVar);
            this.f46684t = null;
            this.f46685u = null;
            this.f46686v = null;
        }

        @Override // n0.k1.k, n0.k1.r
        public void y(e0.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class j extends r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static boolean f46667n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static Method f46668o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static Class f46669p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static Field f46670q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static Field f46671r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f46672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e0.b[] f46673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e0.b f46674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k1 f46675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e0.b f46676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        n0.l f46678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f46680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Rect[][] f46681l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Rect[][] f46682m;

        j(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var);
            this.f46674e = null;
            this.f46681l = new Rect[10][];
            this.f46682m = new Rect[10][];
            this.f46672c = windowInsets;
        }

        private n0.l C(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.f46690a.t()) {
                return n0.l.a(point.x, point.y, true, 0, 0, 0, 0);
            }
            g0 g0VarA = n0.j.a(display, 0);
            g0 g0VarA2 = n0.j.a(display, 1);
            g0 g0VarA3 = n0.j.a(display, 2);
            g0 g0VarA4 = n0.j.a(display, 3);
            return n0.l.a(point.x, point.y, false, g0VarA != null ? g0VarA.b() : 0, g0VarA2 != null ? g0VarA2.b() : 0, g0VarA3 != null ? g0VarA3.b() : 0, g0VarA4 != null ? g0VarA4.b() : 0);
        }

        private static List<Rect> D(Rect[][] rectArr, int i10) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && (rectArr2 = rectArr[s.c(i11)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] E(e0.b bVar) {
            ArrayList arrayList = new ArrayList();
            if (bVar.f37000a != 0) {
                arrayList.add(new Rect(0, 0, bVar.f37000a, this.f46679j));
            }
            if (bVar.f37001b != 0) {
                arrayList.add(new Rect(0, 0, this.f46680k, bVar.f37001b));
            }
            if (bVar.f37002c != 0) {
                int i10 = this.f46680k;
                arrayList.add(new Rect(i10 - bVar.f37002c, 0, i10, this.f46679j));
            }
            if (bVar.f37003d != 0) {
                int i11 = this.f46679j;
                arrayList.add(new Rect(0, i11 - bVar.f37003d, this.f46680k, i11));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private e0.b F(int i10, boolean z10) {
            e0.b bVarA = e0.b.f36999e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = e0.b.a(bVarA, G(i11, z10));
                }
            }
            return bVarA;
        }

        private e0.b H() {
            k1 k1Var = this.f46675f;
            return k1Var != null ? k1Var.i() : e0.b.f36999e;
        }

        private e0.b I(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f46667n) {
                J();
            }
            Method method = f46668o;
            if (method != null && f46669p != null && f46670q != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f46670q.get(f46671r.get(objInvoke));
                    if (rect != null) {
                        return e0.b.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void J() {
            try {
                f46668o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f46669p = cls;
                f46670q = cls.getDeclaredField("mVisibleInsets");
                f46671r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f46670q.setAccessible(true);
                f46671r.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f46667n = true;
        }

        static boolean K(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @Override // n0.k1.r
        void A(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f46681l = (Rect[][]) rectArr.clone();
        }

        @Override // n0.k1.r
        void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f46682m = (Rect[][]) rectArr.clone();
        }

        protected e0.b G(int i10, boolean z10) {
            e0.b bVarI;
            int i11;
            if (i10 == 1) {
                if (z10) {
                    return e0.b.c(0, Math.max(H().f37001b, n().f37001b), 0, 0);
                }
                return (this.f46677h & 4) != 0 ? e0.b.f36999e : e0.b.c(0, n().f37001b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    e0.b bVarH = H();
                    e0.b bVarL = l();
                    return e0.b.c(Math.max(bVarH.f37000a, bVarL.f37000a), 0, Math.max(bVarH.f37002c, bVarL.f37002c), Math.max(bVarH.f37003d, bVarL.f37003d));
                }
                if ((this.f46677h & 2) != 0) {
                    return e0.b.f36999e;
                }
                e0.b bVarN = n();
                k1 k1Var = this.f46675f;
                bVarI = k1Var != null ? k1Var.i() : null;
                int iMin = bVarN.f37003d;
                if (bVarI != null) {
                    iMin = Math.min(iMin, bVarI.f37003d);
                }
                return e0.b.c(bVarN.f37000a, 0, bVarN.f37002c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return m();
                }
                if (i10 == 32) {
                    return k();
                }
                if (i10 == 64) {
                    return o();
                }
                if (i10 != 128) {
                    return e0.b.f36999e;
                }
                k1 k1Var2 = this.f46675f;
                n0.k kVarF = k1Var2 != null ? k1Var2.f() : h();
                return kVarF != null ? e0.b.c(kVarF.b(), kVarF.d(), kVarF.c(), kVarF.a()) : e0.b.f36999e;
            }
            e0.b[] bVarArr = this.f46673d;
            bVarI = bVarArr != null ? bVarArr[s.c(8)] : null;
            if (bVarI != null) {
                return bVarI;
            }
            e0.b bVarN2 = n();
            e0.b bVarH2 = H();
            int i12 = bVarN2.f37003d;
            if (i12 > bVarH2.f37003d) {
                return e0.b.c(0, 0, 0, i12);
            }
            e0.b bVar = this.f46676g;
            return (bVar == null || bVar.equals(e0.b.f36999e) || (i11 = this.f46676g.f37003d) <= bVarH2.f37003d) ? e0.b.f36999e : e0.b.c(0, 0, 0, i11);
        }

        @Override // n0.k1.r
        void d(View view) {
            this.f46680k = view.getWidth();
            this.f46679j = view.getHeight();
            e0.b bVarI = I(view);
            if (bVarI == null) {
                bVarI = e0.b.f36999e;
            }
            w(bVarI);
        }

        @Override // n0.k1.r
        void e(k1 k1Var) {
            k1Var.y(this.f46675f);
            k1Var.x(this.f46676g);
            k1Var.A(this.f46677h);
            k1Var.v(this.f46678i);
            k1Var.B(this.f46681l);
            k1Var.C(this.f46682m);
        }

        @Override // n0.k1.r
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f46676g, jVar.f46676g) && K(this.f46677h, jVar.f46677h);
        }

        @Override // n0.k1.r
        List<Rect> f(int i10) {
            return D(this.f46681l, i10);
        }

        @Override // n0.k1.r
        List<Rect> g(int i10) {
            return D(this.f46682m, i10);
        }

        @Override // n0.k1.r
        public e0.b i(int i10) {
            return F(i10, false);
        }

        @Override // n0.k1.r
        public e0.b j(int i10) {
            return F(i10, true);
        }

        @Override // n0.k1.r
        final e0.b n() {
            if (this.f46674e == null) {
                this.f46674e = e0.b.c(this.f46672c.getSystemWindowInsetLeft(), this.f46672c.getSystemWindowInsetTop(), this.f46672c.getSystemWindowInsetRight(), this.f46672c.getSystemWindowInsetBottom());
            }
            return this.f46674e;
        }

        @Override // n0.k1.r
        void p(View view) {
            this.f46678i = C(view);
        }

        @Override // n0.k1.r
        void q() {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                int iC = s.c(i10);
                this.f46681l[iC] = E(i(i10));
                if (i10 != 8) {
                    this.f46682m[iC] = E(j(i10));
                }
            }
        }

        @Override // n0.k1.r
        k1 r(int i10, int i11, int i12, int i13) {
            a aVar = new a(k1.E(this.f46672c));
            aVar.d(k1.r(n(), i10, i11, i12, i13));
            aVar.c(k1.r(l(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // n0.k1.r
        boolean t() {
            return this.f46672c.isRound();
        }

        @Override // n0.k1.r
        public void u(n0.l lVar) {
            this.f46678i = lVar;
        }

        @Override // n0.k1.r
        public void v(e0.b[] bVarArr) {
            this.f46673d = bVarArr;
        }

        @Override // n0.k1.r
        void w(e0.b bVar) {
            this.f46676g = bVar;
        }

        @Override // n0.k1.r
        void x(k1 k1Var) {
            this.f46675f = k1Var;
        }

        @Override // n0.k1.r
        void z(int i10) {
            this.f46677h = i10;
        }

        j(k1 k1Var, j jVar) {
            this(k1Var, new WindowInsets(jVar.f46672c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f46652a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 36) {
                this.f46652a = new h();
                return;
            }
            if (i10 >= 35) {
                this.f46652a = new g();
                return;
            }
            if (i10 >= 34) {
                this.f46652a = new f();
                return;
            }
            if (i10 >= 31) {
                this.f46652a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f46652a = new d();
            } else if (i10 >= 29) {
                this.f46652a = new c();
            } else {
                this.f46652a = new b();
            }
        }

        public k1 a() {
            return this.f46652a.b();
        }

        public a b(int i10, e0.b bVar) {
            this.f46652a.d(i10, bVar);
            return this;
        }

        public a c(e0.b bVar) {
            this.f46652a.f(bVar);
            return this;
        }

        public a d(e0.b bVar) {
            this.f46652a.h(bVar);
            return this;
        }

        public a(k1 k1Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 36) {
                this.f46652a = new h(k1Var);
                return;
            }
            if (i10 >= 35) {
                this.f46652a = new g(k1Var);
                return;
            }
            if (i10 >= 34) {
                this.f46652a = new f(k1Var);
                return;
            }
            if (i10 >= 31) {
                this.f46652a = new e(k1Var);
                return;
            }
            if (i10 >= 30) {
                this.f46652a = new d(k1Var);
            } else if (i10 >= 29) {
                this.f46652a = new c(k1Var);
            } else {
                this.f46652a = new b(k1Var);
            }
        }
    }

    public k1(k1 k1Var) {
        if (k1Var != null) {
            r rVar = k1Var.f46651a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35 && (rVar instanceof q)) {
                this.f46651a = new q(this, (q) rVar);
            } else if (i10 >= 34 && (rVar instanceof p)) {
                this.f46651a = new p(this, (p) rVar);
            } else if (i10 >= 31 && (rVar instanceof o)) {
                this.f46651a = new o(this, (o) rVar);
            } else if (i10 >= 30 && (rVar instanceof n)) {
                this.f46651a = new n(this, (n) rVar);
            } else if (i10 >= 29 && (rVar instanceof m)) {
                this.f46651a = new m(this, (m) rVar);
            } else if (i10 >= 28 && (rVar instanceof l)) {
                this.f46651a = new l(this, (l) rVar);
            } else if (rVar instanceof k) {
                this.f46651a = new k(this, (k) rVar);
            } else if (rVar instanceof j) {
                this.f46651a = new j(this, (j) rVar);
            } else {
                this.f46651a = new r(this);
            }
            rVar.e(this);
            return;
        }
        this.f46651a = new r(this);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final k1 f46689b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k1 f46690a;

        r(k1 k1Var) {
            this.f46690a = k1Var;
        }

        k1 a() {
            return this.f46690a;
        }

        k1 b() {
            return this.f46690a;
        }

        k1 c() {
            return this.f46690a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return t() == rVar.t() && s() == rVar.s() && m0.b.a(n(), rVar.n()) && m0.b.a(l(), rVar.l()) && m0.b.a(h(), rVar.h());
        }

        List<Rect> f(int i10) {
            return Collections.EMPTY_LIST;
        }

        List<Rect> g(int i10) {
            return Collections.EMPTY_LIST;
        }

        n0.k h() {
            return null;
        }

        public int hashCode() {
            return m0.b.b(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        e0.b i(int i10) {
            return e0.b.f36999e;
        }

        e0.b j(int i10) {
            if ((i10 & 8) == 0) {
                return e0.b.f36999e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        e0.b k() {
            return n();
        }

        e0.b l() {
            return e0.b.f36999e;
        }

        e0.b m() {
            return n();
        }

        e0.b n() {
            return e0.b.f36999e;
        }

        e0.b o() {
            return n();
        }

        k1 r(int i10, int i11, int i12, int i13) {
            return f46689b;
        }

        boolean s() {
            return false;
        }

        boolean t() {
            return false;
        }

        void q() {
        }

        void A(Rect[][] rectArr) {
        }

        void B(Rect[][] rectArr) {
        }

        void d(View view) {
        }

        void e(k1 k1Var) {
        }

        void p(View view) {
        }

        public void u(n0.l lVar) {
        }

        public void v(e0.b[] bVarArr) {
        }

        void w(e0.b bVar) {
        }

        void x(k1 k1Var) {
        }

        public void y(e0.b bVar) {
        }

        void z(int i10) {
        }
    }
}
