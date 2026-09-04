package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import n0.q0;
import o0.p;
import o0.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    v0.d f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f19378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19380d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19382f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19381e = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f19383g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f19384h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f19385i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f19386j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final v0.d.AbstractC0826d f19387k = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends v0.d.AbstractC0826d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19389b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f19388a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f19384h);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f19383g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    return f10 < 0.0f;
                }
                return f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f19383g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f19388a - view.getWidth();
                    width2 = this.f19388a;
                } else {
                    width = this.f19388a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f19388a - view.getWidth();
                width2 = view.getWidth() + this.f19388a;
            } else if (z10) {
                width = this.f19388a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f19388a - view.getWidth();
                width2 = this.f19388a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            return view.getWidth();
        }

        @Override // v0.d.AbstractC0826d
        public void i(View view, int i10) {
            this.f19389b = i10;
            this.f19388a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f19380d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f19380d = false;
            }
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f19378b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f19385i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f19386j;
            float fAbs = Math.abs(i10 - this.f19388a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f19389b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f19388a;
                    if (left < i11) {
                        i10 = this.f19388a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f19388a - width;
                }
                z10 = true;
            } else {
                i10 = this.f19388a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f19377a.S(i10, view.getTop())) {
                view.postOnAnimation(new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.f19378b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            int i11 = this.f19389b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements s {
        b() {
        }

        @Override // o0.s
        public boolean a(View view, s.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f19383g;
            q0.X(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f19378b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(View view);

        void b(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f19392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f19393b;

        d(View view, boolean z10) {
            this.f19392a = view;
            this.f19393b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            v0.d dVar = SwipeDismissBehavior.this.f19377a;
            if (dVar != null && dVar.o(true)) {
                this.f19392a.postOnAnimation(this);
            } else {
                if (!this.f19393b || (cVar = SwipeDismissBehavior.this.f19378b) == null) {
                    return;
                }
                cVar.a(this.f19392a);
            }
        }
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f19377a == null) {
            this.f19377a = this.f19382f ? v0.d.p(viewGroup, this.f19381e, this.f19387k) : v0.d.q(viewGroup, this.f19387k);
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void S(View view) {
        q0.g0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (J(view)) {
            q0.i0(view, p.a.f47944y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f19377a == null) {
            return false;
        }
        if (this.f19380d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f19377a.I(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f19386j = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f19378b = cVar;
    }

    public void Q(float f10) {
        this.f19385i = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f19383g = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zB = this.f19379c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f19379c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f19379c = false;
        }
        if (zB) {
            M(coordinatorLayout);
            if (!this.f19380d && this.f19377a.T(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zP = super.p(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S(view);
        }
        return zP;
    }
}
