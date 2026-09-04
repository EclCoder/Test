package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends m {
    private static final String[] O = {"android:visibility:visibility", "android:visibility:parent"};
    private int N = 3;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends AnimatorListenerAdapter implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f7394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7397f = false;

        a(View view, int i10, boolean z10) {
            this.f7392a = view;
            this.f7393b = i10;
            this.f7394c = (ViewGroup) view.getParent();
            this.f7395d = z10;
            i(true);
        }

        private void h() {
            if (!this.f7397f) {
                b0.f(this.f7392a, this.f7393b);
                ViewGroup viewGroup = this.f7394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f7395d || this.f7396e == z10 || (viewGroup = this.f7394c) == null) {
                return;
            }
            this.f7396e = z10;
            a0.b(viewGroup, z10);
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
            i(true);
            if (this.f7397f) {
                return;
            }
            b0.f(this.f7392a, 0);
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
            i(false);
            if (this.f7397f) {
                return;
            }
            b0.f(this.f7392a, this.f7393b);
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            mVar.X(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7397f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                b0.f(this.f7392a, 0);
                ViewGroup viewGroup = this.f7394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends AnimatorListenerAdapter implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f7398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f7399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f7400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7401d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f7398a = viewGroup;
            this.f7399b = view;
            this.f7400c = view2;
        }

        private void h() {
            this.f7400c.setTag(h.f7387a, null);
            this.f7398a.getOverlay().remove(this.f7399b);
            this.f7401d = false;
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            mVar.X(this);
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
            if (this.f7401d) {
                h();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f7398a.getOverlay().remove(this.f7399b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f7399b.getParent() == null) {
                this.f7398a.getOverlay().add(this.f7399b);
            } else {
                h0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f7400c.setTag(h.f7387a, this.f7399b);
                this.f7398a.getOverlay().add(this.f7399b);
                this.f7401d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f7407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f7408f;

        c() {
        }
    }

    private void k0(x xVar) {
        xVar.f7464a.put("android:visibility:visibility", Integer.valueOf(xVar.f7465b.getVisibility()));
        xVar.f7464a.put("android:visibility:parent", xVar.f7465b.getParent());
        int[] iArr = new int[2];
        xVar.f7465b.getLocationOnScreen(iArr);
        xVar.f7464a.put("android:visibility:screenLocation", iArr);
    }

    private c l0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f7403a = false;
        cVar.f7404b = false;
        if (xVar == null || !xVar.f7464a.containsKey("android:visibility:visibility")) {
            cVar.f7405c = -1;
            cVar.f7407e = null;
        } else {
            cVar.f7405c = ((Integer) xVar.f7464a.get("android:visibility:visibility")).intValue();
            cVar.f7407e = (ViewGroup) xVar.f7464a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.f7464a.containsKey("android:visibility:visibility")) {
            cVar.f7406d = -1;
            cVar.f7408f = null;
        } else {
            cVar.f7406d = ((Integer) xVar2.f7464a.get("android:visibility:visibility")).intValue();
            cVar.f7408f = (ViewGroup) xVar2.f7464a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i10 = cVar.f7405c;
            int i11 = cVar.f7406d;
            if (i10 != i11 || cVar.f7407e != cVar.f7408f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f7404b = false;
                        cVar.f7403a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f7404b = true;
                        cVar.f7403a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f7408f == null) {
                        cVar.f7404b = false;
                        cVar.f7403a = true;
                        return cVar;
                    }
                    if (cVar.f7407e == null) {
                        cVar.f7404b = true;
                        cVar.f7403a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (xVar == null && cVar.f7406d == 0) {
                cVar.f7404b = true;
                cVar.f7403a = true;
                return cVar;
            }
            if (xVar2 == null && cVar.f7405c == 0) {
                cVar.f7404b = false;
                cVar.f7403a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.m
    public String[] J() {
        return O;
    }

    @Override // androidx.transition.m
    public boolean L(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f7464a.containsKey("android:visibility:visibility") != xVar.f7464a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarL0 = l0(xVar, xVar2);
        return cVarL0.f7403a && (cVarL0.f7405c == 0 || cVarL0.f7406d == 0);
    }

    @Override // androidx.transition.m
    public void g(x xVar) {
        k0(xVar);
    }

    @Override // androidx.transition.m
    public void j(x xVar) {
        k0(xVar);
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    @Override // androidx.transition.m
    public Animator n(ViewGroup viewGroup, x xVar, x xVar2) {
        c cVarL0 = l0(xVar, xVar2);
        if (!cVarL0.f7403a) {
            return null;
        }
        if (cVarL0.f7407e == null && cVarL0.f7408f == null) {
            return null;
        }
        return cVarL0.f7404b ? n0(viewGroup, xVar, cVarL0.f7405c, xVar2, cVarL0.f7406d) : p0(viewGroup, xVar, cVarL0.f7405c, xVar2, cVarL0.f7406d);
    }

    public Animator n0(ViewGroup viewGroup, x xVar, int i10, x xVar2, int i11) {
        if ((this.N & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f7465b.getParent();
            if (l0(y(view, false), K(view, false)).f7403a) {
                return null;
            }
        }
        return m0(viewGroup, xVar2.f7465b, xVar, xVar2);
    }

    public abstract Animator o0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator p0(ViewGroup viewGroup, x xVar, int i10, x xVar2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.N & 2) != 2 || xVar == null) {
            return null;
        }
        View view3 = xVar.f7465b;
        View viewA = xVar2 != null ? xVar2.f7465b : null;
        int i12 = h.f7387a;
        View view4 = (View) view3.getTag(i12);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (l0(K(view5, true), y(view5, true)).f7403a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f7435w) {
                            }
                        } else {
                            viewA = w.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z11 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            b0.f(view2, 0);
            Animator animatorO0 = o0(viewGroup, view2, xVar, xVar2);
            if (animatorO0 == null) {
                b0.f(view2, visibility);
                return animatorO0;
            }
            a aVar = new a(view2, i11, true);
            animatorO0.addListener(aVar);
            C().b(aVar);
            return animatorO0;
        }
        if (!z11) {
            int[] iArr = (int[]) xVar.f7464a.get("android:visibility:screenLocation");
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorO1 = o0(viewGroup, view4, xVar, xVar2);
        if (!z11) {
            if (animatorO1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorO1;
            }
            view3.setTag(i12, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorO1.addListener(bVar);
            animatorO1.addPauseListener(bVar);
            C().b(bVar);
        }
        return animatorO1;
    }

    public void q0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.N = i10;
    }
}
