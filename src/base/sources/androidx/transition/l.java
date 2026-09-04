package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l extends h0 {
    private static final TimeInterpolator R = new DecelerateInterpolator();
    private static final TimeInterpolator S = new AccelerateInterpolator();
    private static final g T = new a();
    private static final g U = new b();
    private static final g V = new c();
    private static final g W = new d();
    private static final g X = new e();
    private static final g Y = new f();
    private g P = Y;
    private int Q = 80;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public l(int i10) {
        r0(i10);
    }

    private void k0(x xVar) {
        int[] iArr = new int[2];
        xVar.f7465b.getLocationOnScreen(iArr);
        xVar.f7464a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.h0, androidx.transition.m
    public void g(x xVar) {
        super.g(xVar);
        k0(xVar);
    }

    @Override // androidx.transition.h0, androidx.transition.m
    public void j(x xVar) {
        super.j(xVar);
        k0(xVar);
    }

    @Override // androidx.transition.h0
    public Animator m0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) xVar2.f7464a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return z.a(view, xVar2, iArr[0], iArr[1], this.P.b(viewGroup, view), this.P.a(viewGroup, view), translationX, translationY, R, this);
    }

    @Override // androidx.transition.h0
    public Animator o0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar == null) {
            return null;
        }
        int[] iArr = (int[]) xVar.f7464a.get("android:slide:screenPosition");
        return z.a(view, xVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.P.b(viewGroup, view), this.P.a(viewGroup, view), S, this);
    }

    public void r0(int i10) {
        if (i10 == 3) {
            this.P = T;
        } else if (i10 == 5) {
            this.P = W;
        } else if (i10 == 48) {
            this.P = V;
        } else if (i10 == 80) {
            this.P = Y;
        } else if (i10 == 8388611) {
            this.P = U;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.P = X;
        }
        this.Q = i10;
        k kVar = new k();
        kVar.j(i10);
        g0(kVar);
    }
}
