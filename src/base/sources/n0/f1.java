package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f46594a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k1 f46597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46598b;

        public b(int i10) {
            this.f46598b = i10;
        }

        public final int a() {
            return this.f46598b;
        }

        public abstract void b(f1 f1Var);

        public abstract void c(f1 f1Var);

        public abstract k1 d(k1 k1Var, List list);

        public abstract a e(f1 f1Var, a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f46599f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f46600g = new m1.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f46601h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Interpolator f46602i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f46603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private k1 f46604b;

            /* JADX INFO: renamed from: n0.f1$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class C0719a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f1 f46605a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ k1 f46606b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ k1 f46607c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f46608d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f46609e;

                C0719a(f1 f1Var, k1 k1Var, k1 k1Var2, int i10, View view) {
                    this.f46605a = f1Var;
                    this.f46606b = k1Var;
                    this.f46607c = k1Var2;
                    this.f46608d = i10;
                    this.f46609e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f46605a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.f46609e, c.p(this.f46606b, this.f46607c, this.f46605a.c(), this.f46608d), Collections.singletonList(this.f46605a));
                }
            }

            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f1 f46611a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f46612b;

                b(f1 f1Var, View view) {
                    this.f46611a = f1Var;
                    this.f46612b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f46611a.f(1.0f);
                    c.j(this.f46612b, this.f46611a);
                }
            }

            /* JADX INFO: renamed from: n0.f1$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class RunnableC0720c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f46614a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f1 f46615b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f46616c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f46617d;

                RunnableC0720c(View view, f1 f1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f46614a = view;
                    this.f46615b = f1Var;
                    this.f46616c = aVar;
                    this.f46617d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m(this.f46614a, this.f46615b, this.f46616c);
                    this.f46617d.start();
                }
            }

            a(View view, b bVar) {
                this.f46603a = bVar;
                k1 k1VarI = q0.I(view);
                this.f46604b = k1VarI != null ? new k1.a(k1VarI).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f46604b = k1.F(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                k1 k1VarF = k1.F(windowInsets, view);
                if (this.f46604b == null) {
                    this.f46604b = q0.I(view);
                }
                if (this.f46604b == null) {
                    this.f46604b = k1VarF;
                    return c.n(view, windowInsets);
                }
                b bVarO = c.o(view);
                if (bVarO != null && Objects.equals(bVarO.f46597a, k1VarF)) {
                    return c.n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.f(k1VarF, this.f46604b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f46604b = k1VarF;
                    return c.n(view, windowInsets);
                }
                k1 k1Var = this.f46604b;
                f1 f1Var = new f1(i12, c.h(i10, i11), (k1.s.b() & i12) != 0 ? 160L : 250L);
                f1Var.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(f1Var.b());
                a aVarG = c.g(k1VarF, k1Var, i12);
                c.k(view, f1Var, k1VarF, false);
                duration.addUpdateListener(new C0719a(f1Var, k1VarF, k1Var, i12, view));
                duration.addListener(new b(f1Var, view));
                e0.a(view, new RunnableC0720c(view, f1Var, aVarG, duration));
                this.f46604b = k1VarF;
                return c.n(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static void f(k1 k1Var, k1 k1Var2, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                e0.b bVarG = k1Var.g(i10);
                e0.b bVarG2 = k1Var2.g(i10);
                int i11 = bVarG.f37000a;
                int i12 = bVarG2.f37000a;
                boolean z10 = i11 > i12 || bVarG.f37001b > bVarG2.f37001b || bVarG.f37002c > bVarG2.f37002c || bVarG.f37003d > bVarG2.f37003d;
                if (z10 != (i11 < i12 || bVarG.f37001b < bVarG2.f37001b || bVarG.f37002c < bVarG2.f37002c || bVarG.f37003d < bVarG2.f37003d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        static a g(k1 k1Var, k1 k1Var2, int i10) {
            e0.b bVarG = k1Var.g(i10);
            e0.b bVarG2 = k1Var2.g(i10);
            return new a(e0.b.c(Math.min(bVarG.f37000a, bVarG2.f37000a), Math.min(bVarG.f37001b, bVarG2.f37001b), Math.min(bVarG.f37002c, bVarG2.f37002c), Math.min(bVarG.f37003d, bVarG2.f37003d)), e0.b.c(Math.max(bVarG.f37000a, bVarG2.f37000a), Math.max(bVarG.f37001b, bVarG2.f37001b), Math.max(bVarG.f37002c, bVarG2.f37002c), Math.max(bVarG.f37003d, bVarG2.f37003d)));
        }

        static Interpolator h(int i10, int i11) {
            if ((k1.s.b() & i10) != 0) {
                return f46599f;
            }
            if ((k1.s.b() & i11) != 0) {
                return f46600g;
            }
            if ((i10 & k1.s.g()) != 0) {
                return f46601h;
            }
            if ((k1.s.g() & i11) != 0) {
                return f46602i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        static void j(View view, f1 f1Var) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.b(f1Var);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), f1Var);
                }
            }
        }

        static void k(View view, f1 f1Var, k1 k1Var, boolean z10) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.f46597a = k1Var;
                if (!z10) {
                    bVarO.c(f1Var);
                    z10 = bVarO.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), f1Var, k1Var, z10);
                }
            }
        }

        static void l(View view, k1 k1Var, List list) {
            b bVarO = o(view);
            if (bVarO != null) {
                k1Var = bVarO.d(k1Var, list);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), k1Var, list);
                }
            }
        }

        static void m(View view, f1 f1Var, a aVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.e(f1Var, aVar);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m(viewGroup.getChildAt(i10), f1Var, aVar);
                }
            }
        }

        static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(b0.c.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b o(View view) {
            Object tag = view.getTag(b0.c.U);
            if (tag instanceof a) {
                return ((a) tag).f46603a;
            }
            return null;
        }

        static k1 p(k1 k1Var, k1 k1Var2, float f10, int i10) {
            k1.a aVar = new k1.a(k1Var);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, k1Var.g(i11));
                } else {
                    e0.b bVarG = k1Var.g(i11);
                    e0.b bVarG2 = k1Var2.g(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, k1.r(bVarG, (int) (((double) ((bVarG.f37000a - bVarG2.f37000a) * f11)) + 0.5d), (int) (((double) ((bVarG.f37001b - bVarG2.f37001b) * f11)) + 0.5d), (int) (((double) ((bVarG.f37002c - bVarG2.f37002c) * f11)) + 0.5d), (int) (((double) ((bVarG.f37003d - bVarG2.f37003d) * f11)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerI = bVar != null ? i(view, bVar) : null;
            view.setTag(b0.c.U, onApplyWindowInsetsListenerI);
            if (view.getTag(b0.c.L) == null && view.getTag(b0.c.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerI);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f46625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Interpolator f46626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f46627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f46628e = 1.0f;

        e(int i10, Interpolator interpolator, long j10) {
            this.f46624a = i10;
            this.f46626c = interpolator;
            this.f46627d = j10;
        }

        public float a() {
            return this.f46628e;
        }

        public long b() {
            return this.f46627d;
        }

        public float c() {
            Interpolator interpolator = this.f46626c;
            return interpolator != null ? interpolator.getInterpolation(this.f46625b) : this.f46625b;
        }

        public int d() {
            return this.f46624a;
        }

        public void e(float f10) {
            this.f46625b = f10;
        }
    }

    public f1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f46594a = new d(i10, interpolator, j10);
        } else {
            this.f46594a = new c(i10, interpolator, j10);
        }
    }

    static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    static f1 g(WindowInsetsAnimation windowInsetsAnimation) {
        return new f1(windowInsetsAnimation);
    }

    public float a() {
        return this.f46594a.a();
    }

    public long b() {
        return this.f46594a.b();
    }

    public float c() {
        return this.f46594a.c();
    }

    public int d() {
        return this.f46594a.d();
    }

    public void f(float f10) {
        this.f46594a.e(f10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f46619f;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f46620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f46621b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList f46622c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap f46623d;

            a(b bVar) {
                super(bVar.a());
                this.f46623d = new HashMap();
                this.f46620a = bVar;
            }

            private f1 a(WindowInsetsAnimation windowInsetsAnimation) {
                f1 f1Var = (f1) this.f46623d.get(windowInsetsAnimation);
                if (f1Var != null) {
                    return f1Var;
                }
                f1 f1VarG = f1.g(windowInsetsAnimation);
                this.f46623d.put(windowInsetsAnimation, f1VarG);
                return f1VarG;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f46620a.b(a(windowInsetsAnimation));
                this.f46623d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f46620a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f46622c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f46622c = arrayList2;
                    this.f46621b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = j1.a(list.get(size));
                    f1 f1VarA = a(windowInsetsAnimationA);
                    f1VarA.f(windowInsetsAnimationA.getFraction());
                    this.f46622c.add(f1VarA);
                }
                return this.f46620a.d(k1.E(windowInsets), this.f46621b).D();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f46620a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f46619f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            i1.a();
            return h1.a(aVar.a().f(), aVar.b().f());
        }

        public static e0.b g(WindowInsetsAnimation.Bounds bounds) {
            return e0.b.e(bounds.getUpperBound());
        }

        public static e0.b h(WindowInsetsAnimation.Bounds bounds) {
            return e0.b.e(bounds.getLowerBound());
        }

        public static void i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // n0.f1.e
        public float a() {
            return this.f46619f.getAlpha();
        }

        @Override // n0.f1.e
        public long b() {
            return this.f46619f.getDurationMillis();
        }

        @Override // n0.f1.e
        public float c() {
            return this.f46619f.getInterpolatedFraction();
        }

        @Override // n0.f1.e
        public int d() {
            return this.f46619f.getTypeMask();
        }

        @Override // n0.f1.e
        public void e(float f10) {
            this.f46619f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(g1.a(i10, interpolator, j10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0.b f46595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0.b f46596b;

        public a(e0.b bVar, e0.b bVar2) {
            this.f46595a = bVar;
            this.f46596b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public e0.b a() {
            return this.f46595a;
        }

        public e0.b b() {
            return this.f46596b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f46595a + " upper=" + this.f46596b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f46595a = d.h(bounds);
            this.f46596b = d.g(bounds);
        }
    }

    private f1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.f46594a = new d(windowInsetsAnimation);
    }
}
