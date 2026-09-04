package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.insets.ProtectionLayout;
import com.google.android.material.internal.c0;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import mc.i;
import n0.b0;
import n0.e1;
import n0.k1;
import n0.q0;
import o0.p;
import sb.g;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BottomSheetBehavior f19540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FrameLayout f19541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CoordinatorLayout f19542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FrameLayout f19543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ProtectionLayout f19544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f19545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f19546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f19549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private gc.c f19551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f19552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private BottomSheetBehavior.g f19553t;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0303a implements b0 {
        C0303a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            if (a.this.f19549p != null) {
                a.this.f19540g.Q0(a.this.f19549p);
            }
            if (k1Var != null) {
                a aVar = a.this;
                aVar.f19549p = new f(aVar.f19543j, k1Var, null);
                a.this.f19549p.e(a.this.getWindow());
                a.this.f19540g.f0(a.this.f19549p);
            }
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f19546m && aVar.isShowing() && a.this.C()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends n0.a {
        c() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            if (!a.this.f19546m) {
                pVar.z0(false);
            } else {
                pVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                pVar.z0(true);
            }
        }

        @Override // n0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f19546m) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f19559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k1 f19560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Window f19561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19562d;

        /* synthetic */ f(View view, k1 k1Var, C0303a c0303a) {
            this(view, k1Var);
        }

        private void d(View view) {
            if (view.getTop() < this.f19560b.n()) {
                Window window = this.f19561c;
                if (window != null) {
                    Boolean bool = this.f19559a;
                    com.google.android.material.internal.e.g(window, bool == null ? this.f19562d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f19560b.n() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f19561c;
                if (window2 != null) {
                    com.google.android.material.internal.e.g(window2, this.f19562d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            d(view);
        }

        void e(Window window) {
            if (this.f19561c == window) {
                return;
            }
            this.f19561c = window;
            if (window != null) {
                this.f19562d = e1.a(window, window.getDecorView()).b();
            }
        }

        private f(View view, k1 k1Var) {
            this.f19560b = k1Var;
            i iVarY0 = BottomSheetBehavior.v0(view).y0();
            ColorStateList colorStateListE = iVarY0 != null ? iVarY0.E() : view.getBackgroundTintList();
            if (colorStateListE != null) {
                this.f19559a = Boolean.valueOf(ac.a.h(colorStateListE.getDefaultColor()));
                return;
            }
            Integer numH = c0.h(view);
            if (numH != null) {
                this.f19559a = Boolean.valueOf(ac.a.h(numH.intValue()));
            } else {
                this.f19559a = null;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        z();
    }

    private void D() {
        gc.c cVar = this.f19551r;
        if (cVar == null) {
            return;
        }
        if (this.f19546m) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    private View E(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        w();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f19541h.findViewById(g.f51755e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f19550q) {
            q0.w0(this.f19541h, new C0303a());
        }
        this.f19543j.removeAllViews();
        if (layoutParams == null) {
            this.f19543j.addView(view);
        } else {
            this.f19543j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(g.f51796y0).setOnClickListener(new b());
        q0.m0(this.f19543j, new c());
        this.f19543j.setOnTouchListener(new d());
        return this.f19541h;
    }

    private static int o(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(sb.c.f51600c, typedValue, true) ? typedValue.resourceId : l.f51864h;
    }

    private FrameLayout w() {
        if (this.f19541h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), sb.i.f51803b, null);
            this.f19541h = frameLayout;
            this.f19544k = (ProtectionLayout) frameLayout.findViewById(g.f51770l0);
            List list = this.f19552s;
            if (list != null) {
                B(list);
            }
            this.f19542i = (CoordinatorLayout) this.f19541h.findViewById(g.f51755e);
            FrameLayout frameLayout2 = (FrameLayout) this.f19541h.findViewById(g.f51757f);
            this.f19543j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorV0 = BottomSheetBehavior.v0(frameLayout2);
            this.f19540g = bottomSheetBehaviorV0;
            bottomSheetBehaviorV0.f0(this.f19553t);
            this.f19540g.d1(this.f19546m);
            this.f19551r = new gc.c(this.f19540g, this.f19543j);
        }
        return this.f19541h;
    }

    private void z() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{sb.c.f51632s});
        this.f19550q = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    void A() {
        this.f19540g.Q0(this.f19553t);
    }

    public void B(List list) {
        this.f19552s = list;
        ProtectionLayout protectionLayout = this.f19544k;
        if (protectionLayout != null) {
            protectionLayout.setProtections(list);
            this.f19544k.setVisibility(list.isEmpty() ? 8 : 0);
        }
    }

    boolean C() {
        if (!this.f19548o) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f19547n = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f19548o = true;
        }
        return this.f19547n;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorX = x();
        if (!this.f19545l || bottomSheetBehaviorX.A0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorX.l1(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f19550q && Color.alpha(com.google.android.material.internal.e.c(window)) < 255;
            FrameLayout frameLayout = this.f19541h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f19542i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            e1.b(window, !z10);
            f fVar = this.f19549p;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        D();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            com.google.android.material.internal.e.i(window, 0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f19549p;
        if (fVar != null) {
            fVar.e(null);
        }
        gc.c cVar = this.f19551r;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // androidx.activity.w, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f19540g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0() != 5) {
            return;
        }
        this.f19540g.l1(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f19546m != z10) {
            this.f19546m = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f19540g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.d1(z10);
            }
            if (getWindow() != null) {
                D();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f19546m) {
            this.f19546m = true;
        }
        this.f19547n = z10;
        this.f19548o = true;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(E(i10, null, null));
    }

    public BottomSheetBehavior x() {
        if (this.f19540g == null) {
            w();
        }
        return this.f19540g;
    }

    public boolean y() {
        return this.f19545l;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.w, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(E(0, view, null));
    }

    public a(Context context, int i10) {
        super(context, o(context, i10));
        this.f19546m = true;
        this.f19547n = true;
        this.f19553t = new e();
        r(1);
        z();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(E(0, view, layoutParams));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }
    }
}
