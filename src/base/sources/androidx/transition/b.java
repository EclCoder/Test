package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends m {
    private static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property P = new a(PointF.class, "topLeft");
    private static final Property Q = new C0093b(PointF.class, "bottomRight");
    private static final Property R = new c(PointF.class, "bottomRight");
    private static final Property S = new d(PointF.class, "topLeft");
    private static final Property T = new e(PointF.class, "position");
    private static final androidx.transition.i U = new androidx.transition.i();
    private boolean N = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0093b extends Property {
        C0093b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            b0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            b0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            b0.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f7331a;
        private final i mViewBounds;

        f(i iVar) {
            this.f7331a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g extends AnimatorListenerAdapter implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f7334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f7335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f7336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f7337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7340h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f7342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f7343k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f7344l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f7345m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f7346n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f7333a = view;
            this.f7334b = rect;
            this.f7335c = z10;
            this.f7336d = rect2;
            this.f7337e = z11;
            this.f7338f = i10;
            this.f7339g = i11;
            this.f7340h = i12;
            this.f7341i = i13;
            this.f7342j = i14;
            this.f7343k = i15;
            this.f7344l = i16;
            this.f7345m = i17;
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
            View view = this.f7333a;
            int i10 = androidx.transition.h.f7388b;
            Rect rect = (Rect) view.getTag(i10);
            this.f7333a.setTag(i10, null);
            this.f7333a.setClipBounds(rect);
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
            this.f7333a.setTag(androidx.transition.h.f7388b, this.f7333a.getClipBounds());
            this.f7333a.setClipBounds(this.f7337e ? null : this.f7336d);
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
            this.f7346n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f7346n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f7335c) {
                    rect = this.f7334b;
                }
            } else if (!this.f7337e) {
                rect = this.f7336d;
            }
            this.f7333a.setClipBounds(rect);
            if (z10) {
                b0.d(this.f7333a, this.f7338f, this.f7339g, this.f7340h, this.f7341i);
            } else {
                b0.d(this.f7333a, this.f7342j, this.f7343k, this.f7344l, this.f7345m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f7340h - this.f7338f, this.f7344l - this.f7342j);
            int iMax2 = Math.max(this.f7341i - this.f7339g, this.f7345m - this.f7343k);
            int i10 = z10 ? this.f7342j : this.f7338f;
            int i11 = z10 ? this.f7343k : this.f7339g;
            b0.d(this.f7333a, i10, i11, iMax + i10, iMax2 + i11);
            this.f7333a.setClipBounds(z10 ? this.f7336d : this.f7334b);
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class h extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7347a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f7348b;

        h(ViewGroup viewGroup) {
            this.f7348b = viewGroup;
        }

        @Override // androidx.transition.s, androidx.transition.m.g
        public void a(m mVar) {
            a0.b(this.f7348b, true);
        }

        @Override // androidx.transition.s, androidx.transition.m.g
        public void c(m mVar) {
            a0.b(this.f7348b, false);
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            if (!this.f7347a) {
                a0.b(this.f7348b, false);
            }
            mVar.X(this);
        }

        @Override // androidx.transition.s, androidx.transition.m.g
        public void f(m mVar) {
            a0.b(this.f7348b, false);
            this.f7347a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f7353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7355g;

        i(View view) {
            this.f7353e = view;
        }

        private void b() {
            b0.d(this.f7353e, this.f7349a, this.f7350b, this.f7351c, this.f7352d);
            this.f7354f = 0;
            this.f7355g = 0;
        }

        void a(PointF pointF) {
            this.f7351c = Math.round(pointF.x);
            this.f7352d = Math.round(pointF.y);
            int i10 = this.f7355g + 1;
            this.f7355g = i10;
            if (this.f7354f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f7349a = Math.round(pointF.x);
            this.f7350b = Math.round(pointF.y);
            int i10 = this.f7354f + 1;
            this.f7354f = i10;
            if (i10 == this.f7355g) {
                b();
            }
        }
    }

    private void k0(x xVar) {
        View view = xVar.f7465b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f7464a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f7464a.put("android:changeBounds:parent", xVar.f7465b.getParent());
        if (this.N) {
            xVar.f7464a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.m
    public String[] J() {
        return O;
    }

    @Override // androidx.transition.m
    public void g(x xVar) {
        k0(xVar);
    }

    @Override // androidx.transition.m
    public void j(x xVar) {
        Rect rect;
        k0(xVar);
        if (!this.N || (rect = (Rect) xVar.f7465b.getTag(androidx.transition.h.f7388b)) == null) {
            return;
        }
        xVar.f7464a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.m
    public Animator n(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map map = xVar.f7464a;
        Map map2 = xVar2.f7464a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xVar2.f7465b;
        Rect rect2 = (Rect) xVar.f7464a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.f7464a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) xVar.f7464a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.f7464a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.N) {
            b0.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : androidx.transition.f.a(view, T, A().a(i12, i14, i13, i15));
            boolean z10 = rect4 == null;
            if (z10) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", U, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                b(gVar);
            }
            animatorC = w.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            b0.d(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? androidx.transition.f.a(view, R, A().a(i16, i18, i17, i19)) : androidx.transition.f.a(view, S, A().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = androidx.transition.f.a(view, T, A().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = androidx.transition.f.a(iVar, P, A().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = androidx.transition.f.a(iVar, Q, A().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            a0.b(viewGroup4, true);
            C().b(new h(viewGroup4));
        }
        return animatorC;
    }
}
