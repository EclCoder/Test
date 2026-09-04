package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.api.client.http.HttpStatusCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mc.p;
import n0.k1;
import sb.l;
import sb.m;
import tb.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f19395x0 = l.H;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f19396y0 = sb.c.K;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f19397z0 = sb.c.U;
    private Integer U;
    private final mc.i V;
    private Animator W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Animator f19398a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f19399b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f19400c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f19401d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final int f19402e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f19403f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f19404g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final boolean f19405h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f19406i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final boolean f19407j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final boolean f19408k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final boolean f19409l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f19410m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private ArrayList f19411n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f19412o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f19413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f19414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Behavior f19415r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f19416s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f19417t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f19418u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    AnimatorListenerAdapter f19419v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    k f19420w0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f19413p0) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.P0(bottomAppBar.f19399b0, BottomAppBar.this.f19414q0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements k {
        b() {
        }

        @Override // tb.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.V.m0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f19401d0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // tb.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f19401d0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().k() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().q(translationX);
                BottomAppBar.this.V.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().e() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().l(fMax);
                BottomAppBar.this.V.invalidateSelf();
            }
            BottomAppBar.this.V.m0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements c0.d {
        c() {
        }

        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, c0.e eVar) {
            boolean z10;
            if (BottomAppBar.this.f19407j0) {
                BottomAppBar.this.f19416s0 = k1Var.k();
            }
            boolean z11 = false;
            if (BottomAppBar.this.f19408k0) {
                z10 = BottomAppBar.this.f19418u0 != k1Var.l();
                BottomAppBar.this.f19418u0 = k1Var.l();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.f19409l0) {
                boolean z12 = BottomAppBar.this.f19417t0 != k1Var.m();
                BottomAppBar.this.f19417t0 = k1Var.m();
                z11 = z12;
            }
            if (!z10 && !z11) {
                return k1Var;
            }
            BottomAppBar.this.E0();
            BottomAppBar.this.U0();
            BottomAppBar.this.T0();
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.I0();
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.J0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19430a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.I0();
            }
        }

        e(int i10) {
            this.f19430a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.N0(this.f19430a));
            floatingActionButton.q(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.I0();
            BottomAppBar.this.f19413p0 = false;
            BottomAppBar.this.f19398a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.J0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f19435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19437d;

        g(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f19435b = actionMenuView;
            this.f19436c = i10;
            this.f19437d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19434a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f19434a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f19412o0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.S0(bottomAppBar.f19412o0);
            BottomAppBar.this.Y0(this.f19435b, this.f19436c, this.f19437d, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f19439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19441c;

        h(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f19439a = actionMenuView;
            this.f19440b = i10;
            this.f19441c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f19439a;
            actionMenuView.setTranslationX(BottomAppBar.this.M0(actionMenuView, this.f19440b, this.f19441c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f19419v0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonK0 = BottomAppBar.this.K0();
            if (floatingActionButtonK0 != null) {
                floatingActionButtonK0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class j extends u0.a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f19445d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int i10) {
                return new j[i10];
            }
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19444c);
            parcel.writeInt(this.f19445d ? 1 : 0);
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19444c = parcel.readInt();
            this.f19445d = parcel.readInt() != 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19395x0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        mc.i iVar = new mc.i();
        this.V = iVar;
        this.f19410m0 = 0;
        this.f19412o0 = 0;
        this.f19413p0 = false;
        this.f19414q0 = true;
        this.f19419v0 = new a();
        this.f19420w0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52038k0, i10, i11, new int[0]);
        ColorStateList colorStateListA = jc.c.a(context2, typedArrayI, m.f52068m0);
        int i12 = m.f52233x0;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.f52083n0, 0);
        float dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(m.f52158s0, 0);
        float dimensionPixelOffset2 = typedArrayI.getDimensionPixelOffset(m.f52173t0, 0);
        float dimensionPixelOffset3 = typedArrayI.getDimensionPixelOffset(m.f52188u0, 0);
        this.f19399b0 = typedArrayI.getInt(m.f52098o0, 0);
        this.f19400c0 = typedArrayI.getInt(m.f52143r0, 0);
        this.f19401d0 = typedArrayI.getInt(m.f52128q0, 1);
        this.f19405h0 = typedArrayI.getBoolean(m.B0, true);
        this.f19404g0 = typedArrayI.getInt(m.f52218w0, 0);
        this.f19406i0 = typedArrayI.getBoolean(m.f52203v0, false);
        this.f19407j0 = typedArrayI.getBoolean(m.f52248y0, false);
        this.f19408k0 = typedArrayI.getBoolean(m.f52263z0, false);
        this.f19409l0 = typedArrayI.getBoolean(m.A0, false);
        this.f19403f0 = typedArrayI.getDimensionPixelOffset(m.f52113p0, -1);
        boolean z10 = typedArrayI.getBoolean(m.f52053l0, true);
        typedArrayI.recycle();
        this.f19402e0 = getResources().getDimensionPixelOffset(sb.e.C0);
        iVar.setShapeAppearanceModel(p.g().B(new com.google.android.material.bottomappbar.b(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        if (z10) {
            iVar.t0(2);
        } else {
            iVar.t0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        iVar.p0(Paint.Style.FILL);
        iVar.Y(context2);
        iVar.setTintList(colorStateListA);
        setElevation(dimensionPixelSize);
        setBackground(iVar);
        c0.e(this, attributeSet, i10, i11, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f19419v0);
        floatingActionButton.f(new i());
        floatingActionButton.g(this.f19420w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        Animator animator = this.f19398a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void G0(int i10, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(K0(), "translationX", N0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void H0(int i10, boolean z10, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - M0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat2.addListener(new g(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        ArrayList arrayList;
        int i10 = this.f19410m0 - 1;
        this.f19410m0 = i10;
        if (i10 != 0 || (arrayList = this.f19411n0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        ArrayList arrayList;
        int i10 = this.f19410m0;
        this.f19410m0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f19411n0) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton K0() {
        View viewL0 = L0();
        if (viewL0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewL0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View L0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float N0(int i10) {
        boolean zM = c0.m(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewL0 = L0();
        return ((getMeasuredWidth() / 2) - ((zM ? this.f19418u0 : this.f19417t0) + ((this.f19403f0 == -1 || viewL0 == null) ? this.f19402e0 : (viewL0.getMeasuredWidth() / 2) + this.f19403f0))) * (zM ? -1 : 1);
    }

    private boolean O0() {
        FloatingActionButton floatingActionButtonK0 = K0();
        return floatingActionButtonK0 != null && floatingActionButtonK0.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(int i10, boolean z10) {
        if (!isLaidOut()) {
            this.f19413p0 = false;
            S0(this.f19412o0);
            return;
        }
        Animator animator = this.f19398a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!O0()) {
            i10 = 0;
            z10 = false;
        }
        H0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f19398a0 = animatorSet;
        animatorSet.addListener(new f());
        this.f19398a0.start();
    }

    private void Q0(int i10) {
        if (this.f19399b0 == i10 || !isLaidOut()) {
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f19400c0 == 1) {
            G0(i10, arrayList);
        } else {
            F0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(gc.j.g(getContext(), f19397z0, tb.b.f53275a));
        this.W = animatorSet;
        animatorSet.addListener(new d());
        this.W.start();
    }

    private Drawable R0(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable drawableR = f0.a.r(drawable.mutate());
        drawableR.setTint(this.U.intValue());
        return drawableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f19398a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (O0()) {
            X0(actionMenuView, this.f19399b0, this.f19414q0);
        } else {
            X0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        getTopEdgeTreatment().q(getFabTranslationX());
        this.V.m0((this.f19414q0 && O0() && this.f19401d0 == 1) ? 1.0f : 0.0f);
        View viewL0 = L0();
        if (viewL0 != null) {
            viewL0.setTranslationY(getFabTranslationY());
            viewL0.setTranslationX(getFabTranslationX());
        }
    }

    private void X0(ActionMenuView actionMenuView, int i10, boolean z10) {
        Y0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        h hVar = new h(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f3175d = 17;
        int i10 = bottomAppBar.f19401d0;
        if (i10 == 1) {
            fVar.f3175d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f3175d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f19416s0;
    }

    private int getFabAlignmentAnimationDuration() {
        return gc.j.f(getContext(), f19396y0, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return N0(this.f19399b0);
    }

    private float getFabTranslationY() {
        if (this.f19401d0 == 1) {
            return -getTopEdgeTreatment().e();
        }
        View viewL0 = L0();
        return viewL0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewL0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f19418u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f19417t0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.V.M().y();
    }

    protected void F0(int i10, List list) {
        FloatingActionButton floatingActionButtonK0 = K0();
        if (floatingActionButtonK0 == null || floatingActionButtonK0.m()) {
            return;
        }
        J0();
        floatingActionButtonK0.k(new e(i10));
    }

    protected int M0(ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f19404g0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zM = c0.m(this);
        int measuredWidth = zM ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f697a & 8388615) == 8388611) {
                measuredWidth = zM ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zM ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zM ? this.f19417t0 : -this.f19418u0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(sb.e.C);
            if (!zM) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    public void S0(int i10) {
        if (i10 != 0) {
            this.f19412o0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public void V0(int i10, int i11) {
        this.f19412o0 = i11;
        this.f19413p0 = true;
        P0(i10, this.f19414q0);
        Q0(i10);
        this.f19399b0 = i10;
    }

    boolean W0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().j()) {
            return false;
        }
        getTopEdgeTreatment().p(f10);
        this.V.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.V.Q();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.f19399b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f19403f0;
    }

    public int getFabAnchorMode() {
        return this.f19401d0;
    }

    public int getFabAnimationMode() {
        return this.f19400c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().i();
    }

    public boolean getHideOnScroll() {
        return this.f19406i0;
    }

    public int getMenuAlignmentMode() {
        return this.f19404g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.f(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E0();
            U0();
            final View viewL0 = L0();
            if (viewL0 != null && viewL0.isLaidOut()) {
                viewL0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewL0.requestLayout();
                    }
                });
            }
        }
        T0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.a());
        this.f19399b0 = jVar.f19444c;
        this.f19414q0 = jVar.f19445d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f19444c = this.f19399b0;
        jVar.f19445d = this.f19414q0;
        return jVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.V.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().l(f10);
            this.V.invalidateSelf();
            U0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.V.k0(f10);
        getBehavior().S(this, this.V.L() - this.V.K());
    }

    public void setFabAlignmentMode(int i10) {
        V0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f19403f0 != i10) {
            this.f19403f0 = i10;
            U0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f19401d0 = i10;
        U0();
        View viewL0 = L0();
        if (viewL0 != null) {
            Z0(this, viewL0);
            viewL0.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f19400c0 = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().m(f10);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().n(f10);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().o(f10);
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f19406i0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f19404g0 != i10) {
            this.f19404g0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                X0(actionMenuView, this.f19399b0, O0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(R0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f19415r0 == null) {
            this.f19415r0 = new Behavior();
        }
        return this.f19415r0;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Rect f19421r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private WeakReference f19422s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f19423t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final View.OnLayoutChangeListener f19424u;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f19422s.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.h(Behavior.this.f19421r);
                    int iHeight = Behavior.this.f19421r.height();
                    bottomAppBar.W0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().A().a(new RectF(Behavior.this.f19421r)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f19423t == 0) {
                    if (bottomAppBar.f19401d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(sb.e.D0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (c0.m(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f19402e0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f19402e0;
                    }
                }
                bottomAppBar.U0();
            }
        }

        public Behavior() {
            this.f19424u = new a();
            this.f19421r = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f19422s = new WeakReference(bottomAppBar);
            View viewL0 = bottomAppBar.L0();
            if (viewL0 != null && !viewL0.isLaidOut()) {
                BottomAppBar.Z0(bottomAppBar, viewL0);
                this.f19423t = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewL0.getLayoutParams())).bottomMargin;
                if (viewL0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewL0;
                    if (bottomAppBar.f19401d0 == 0 && bottomAppBar.f19405h0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(sb.b.f51593f);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(sb.b.f51592e);
                    }
                    bottomAppBar.D0(floatingActionButton);
                }
                viewL0.addOnLayoutChangeListener(this.f19424u);
                bottomAppBar.U0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19424u = new a();
            this.f19421r = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
