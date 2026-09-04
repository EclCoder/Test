package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import n0.k1;
import n0.o1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f20363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f20364d;

        a(boolean z10, boolean z11, boolean z12, d dVar) {
            this.f20361a = z10;
            this.f20362b = z11;
            this.f20363c = z12;
            this.f20364d = dVar;
        }

        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, e eVar) {
            if (this.f20361a) {
                eVar.f20370d += k1Var.k();
            }
            boolean zM = c0.m(view);
            if (this.f20362b) {
                if (zM) {
                    eVar.f20369c += k1Var.l();
                } else {
                    eVar.f20367a += k1Var.l();
                }
            }
            if (this.f20363c) {
                if (zM) {
                    eVar.f20367a += k1Var.m();
                } else {
                    eVar.f20369c += k1Var.m();
                }
            }
            eVar.a(view);
            d dVar = this.f20364d;
            return dVar != null ? dVar.a(view, k1Var, eVar) : k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements n0.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f20365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f20366b;

        b(d dVar, e eVar) {
            this.f20365a = dVar;
            this.f20366b = eVar;
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            return this.f20365a.a(view, k1Var, new e(this.f20366b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        k1 a(View view, k1 k1Var, e eVar);
    }

    public static Rect b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    public static Rect c(View view) {
        return d(view, 0);
    }

    public static Rect d(View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void e(View view, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, sb.m.f52012i4, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(sb.m.f52027j4, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(sb.m.f52042k4, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(sb.m.f52057l4, false);
        typedArrayObtainStyledAttributes.recycle();
        f(view, new a(z10, z11, z12, dVar));
    }

    public static void f(View view, d dVar) {
        q0.w0(view, new b(dVar, new e(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        o(view);
    }

    public static float g(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer h(View view) {
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    public static ViewGroup i(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    private static InputMethodManager j(View view) {
        return (InputMethodManager) androidx.core.content.a.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static float k(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void l(View view, boolean z10) {
        o1 o1VarM;
        if (z10 && (o1VarM = q0.M(view)) != null) {
            o1VarM.a(k1.s.b());
            return;
        }
        InputMethodManager inputMethodManagerJ = j(view);
        if (inputMethodManagerJ != null) {
            inputMethodManagerJ.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean m(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode n(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void o(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void p(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.q(view, z10);
            }
        });
    }

    public static void q(View view, boolean z10) {
        o1 o1VarM;
        if (!z10 || (o1VarM = q0.M(view)) == null) {
            j(view).showSoftInput(view, 1);
        } else {
            o1VarM.f(k1.s.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20370d;

        public e(int i10, int i11, int i12, int i13) {
            this.f20367a = i10;
            this.f20368b = i11;
            this.f20369c = i12;
            this.f20370d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f20367a, this.f20368b, this.f20369c, this.f20370d);
        }

        public e(e eVar) {
            this.f20367a = eVar.f20367a;
            this.f20368b = eVar.f20368b;
            this.f20369c = eVar.f20369c;
            this.f20370d = eVar.f20370d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
