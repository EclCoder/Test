package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.z;
import java.util.Iterator;
import java.util.List;
import mc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f20040n0 = sb.l.Q;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Property f20041o0 = new f(Float.class, "width");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final Property f20042p0 = new g(Float.class, "height");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final Property f20043q0 = new h(Float.class, "paddingStart");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final Property f20044r0 = new i(Float.class, "paddingEnd");
    private int S;
    private boolean T;
    private final com.google.android.material.floatingactionbutton.a U;
    private final com.google.android.material.floatingactionbutton.f V;
    private final com.google.android.material.floatingactionbutton.f W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f20045a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f20046b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f20047c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f20048d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f20049e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final CoordinatorLayout.c f20050f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f20051g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f20052h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f20053i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected ColorStateList f20054j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f20055k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f20056l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final int f20057m0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements n {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f20049e0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f20048d0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ((ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getPaddingStart()) - ExtendedFloatingActionButton.this.getPaddingEnd()) + ExtendedFloatingActionButton.this.f20048d0 + ExtendedFloatingActionButton.this.f20049e0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f20063a;

        c(n nVar) {
            this.f20063a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f20056l0 != -1) {
                return (ExtendedFloatingActionButton.this.f20056l0 == 0 || ExtendedFloatingActionButton.this.f20056l0 == -2) ? this.f20063a.getHeight() : ExtendedFloatingActionButton.this.f20056l0;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f20063a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f20063a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.f20056l0 == 0 ? -2 : ExtendedFloatingActionButton.this.f20056l0);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f20049e0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f20048d0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f20063a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f20063a.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f20065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f20066b;

        d(n nVar, n nVar2) {
            this.f20065a = nVar;
            this.f20066b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.f20056l0 == -1) {
                return this.f20065a.getHeight();
            }
            return (ExtendedFloatingActionButton.this.f20056l0 == 0 || ExtendedFloatingActionButton.this.f20056l0 == -2) ? this.f20066b.getHeight() : ExtendedFloatingActionButton.this.f20056l0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.f20055k0 == 0 ? -2 : ExtendedFloatingActionButton.this.f20055k0, ExtendedFloatingActionButton.this.f20056l0 != 0 ? ExtendedFloatingActionButton.this.f20056l0 : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f20049e0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f20048d0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.f20055k0 == -1) {
                return this.f20065a.getWidth();
            }
            return (ExtendedFloatingActionButton.this.f20055k0 == 0 || ExtendedFloatingActionButton.this.f20055k0 == -2) ? this.f20066b.getWidth() : ExtendedFloatingActionButton.this.f20055k0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f20069b;

        e(com.google.android.material.floatingactionbutton.f fVar, l lVar) {
            this.f20069b = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20068a = true;
            this.f20069b.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f20069b.a();
            if (this.f20068a) {
                return;
            }
            this.f20069b.j(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f20069b.onAnimationStart(animator);
            this.f20068a = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends Property {
        h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.setPaddingRelative(f10.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends Property {
        i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class l {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface n {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51634t);
    }

    private n b0(int i10) {
        b bVar = new b();
        c cVar = new c(bVar);
        d dVar = new d(cVar, bVar);
        if (i10 != 1) {
            return i10 != 2 ? dVar : cVar;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c0() {
        if (getVisibility() == 0) {
            return this.S == 1;
        }
        return this.S != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0() {
        if (getVisibility() != 0) {
            return this.S == 2;
        }
        return this.S != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10, l lVar) {
        com.google.android.material.floatingactionbutton.f fVar;
        if (i10 == 0) {
            fVar = this.f20045a0;
        } else if (i10 == 1) {
            fVar = this.f20046b0;
        } else if (i10 == 2) {
            fVar = this.V;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i10);
            }
            fVar = this.W;
        }
        if (fVar.d()) {
            return;
        }
        if (!g0()) {
            fVar.b();
            fVar.j(lVar);
            return;
        }
        if (i10 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f20055k0 = layoutParams.width;
                this.f20056l0 = layoutParams.height;
            } else {
                this.f20055k0 = getWidth();
                this.f20056l0 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetH = fVar.h();
        animatorSetH.addListener(new e(fVar, lVar));
        Iterator it = fVar.i().iterator();
        while (it.hasNext()) {
            animatorSetH.addListener((Animator.AnimatorListener) it.next());
        }
        animatorSetH.start();
    }

    private void f0() {
        this.f20054j0 = getTextColors();
    }

    private boolean g0() {
        if (this.T) {
            return (isLaidOut() || (!d0() && this.f20053i0)) && !isInEditMode();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        CharSequence text;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (this.f20051g0 || !isClickable()) {
            text = null;
        } else {
            text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), text)) {
            return;
        }
        setTooltipText(text);
    }

    public void a0() {
        e0(3, null);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return this.f20050f0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.f20047c0;
        return i10 < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i10;
    }

    int getCurrentOriginalTextColor() {
        return this.f20054j0.getColorForState(getDrawableState(), 0);
    }

    public tb.h getExtendMotionSpec() {
        return this.W.c();
    }

    public tb.h getHideMotionSpec() {
        return this.f20046b0.c();
    }

    ColorStateList getOriginalTextColor() {
        return this.f20054j0;
    }

    public tb.h getShowMotionSpec() {
        return this.f20045a0.c();
    }

    public tb.h getShrinkMotionSpec() {
        return this.V.c();
    }

    public void h0() {
        e0(2, null);
    }

    protected void i0(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f20051g0 || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            j0();
        } else {
            this.f20051g0 = false;
            this.V.b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f20053i0 = z10;
    }

    public void setAnimationEnabled(boolean z10) {
        this.T = z10;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        j0();
    }

    public void setCollapsedSize(int i10) {
        this.f20047c0 = i10;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        j0();
    }

    public void setExtendMotionSpec(tb.h hVar) {
        this.W.g(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(tb.h.d(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f20051g0 == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z10 ? this.W : this.V;
        if (fVar.d()) {
            return;
        }
        fVar.b();
    }

    public void setHideMotionSpec(tb.h hVar) {
        this.f20046b0.g(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(tb.h.d(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.f20051g0 || this.f20052h0) {
            return;
        }
        this.f20048d0 = getPaddingStart();
        this.f20049e0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.f20051g0 || this.f20052h0) {
            return;
        }
        this.f20048d0 = i10;
        this.f20049e0 = i12;
    }

    public void setShowMotionSpec(tb.h hVar) {
        this.f20045a0.g(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(tb.h.d(getContext(), i10));
    }

    public void setShrinkMotionSpec(tb.h hVar) {
        this.V.g(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(tb.h.d(getContext(), i10));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        j0();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        f0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20040n0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.S = 0;
        this.T = true;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.U = aVar;
        m mVar = new m(aVar);
        this.f20045a0 = mVar;
        k kVar = new k(aVar);
        this.f20046b0 = kVar;
        this.f20051g0 = true;
        this.f20052h0 = false;
        this.f20053i0 = false;
        Context context2 = getContext();
        this.f20050f0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayI = z.i(context2, attributeSet, sb.m.f52026j3, i10, i11, new int[0]);
        tb.h hVarC = tb.h.c(context2, typedArrayI, sb.m.f52101o3);
        tb.h hVarC2 = tb.h.c(context2, typedArrayI, sb.m.f52086n3);
        tb.h hVarC3 = tb.h.c(context2, typedArrayI, sb.m.f52056l3);
        tb.h hVarC4 = tb.h.c(context2, typedArrayI, sb.m.f52116p3);
        this.f20047c0 = typedArrayI.getDimensionPixelSize(sb.m.f52041k3, -1);
        int i12 = typedArrayI.getInt(sb.m.f52071m3, 1);
        this.f20057m0 = i12;
        this.f20048d0 = getPaddingStart();
        this.f20049e0 = getPaddingEnd();
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        j jVar = new j(aVar2, b0(i12), true);
        this.W = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.V = jVar2;
        mVar.g(hVarC);
        kVar.g(hVarC2);
        jVar.g(hVarC3);
        jVar2.g(hVarC4);
        typedArrayI.recycle();
        setShapeAppearanceModel(p.m(context2, attributeSet, i10, i11, p.f45657m).m());
        f0();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f20058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20060c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f20059b = false;
            this.f20060c = true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f20059b || this.f20060c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f20058a == null) {
                this.f20058a = new Rect();
            }
            Rect rect = this.f20058a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        private boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        protected void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.e0(this.f20060c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        protected void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.e0(this.f20060c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f3179h == 0) {
                fVar.f3179h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sb.m.f52131q3);
            this.f20059b = typedArrayObtainStyledAttributes.getBoolean(sb.m.f52146r3, false);
            this.f20060c = typedArrayObtainStyledAttributes.getBoolean(sb.m.f52161s3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        f0();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n f20071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f20072h;

        j(com.google.android.material.floatingactionbutton.a aVar, n nVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f20071g = nVar;
            this.f20072h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f20052h0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f20071g.getLayoutParams().width;
            layoutParams.height = this.f20071g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.f20051g0 = this.f20072h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f20072h) {
                ExtendedFloatingActionButton.this.f20055k0 = layoutParams.width;
                ExtendedFloatingActionButton.this.f20056l0 = layoutParams.height;
            }
            layoutParams.width = this.f20071g.getLayoutParams().width;
            layoutParams.height = this.f20071g.getLayoutParams().height;
            if (this.f20072h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.i0(extendedFloatingActionButton.f20054j0);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.i0(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.f20071g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f20071g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
            ExtendedFloatingActionButton.this.j0();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return this.f20072h == ExtendedFloatingActionButton.this.f20051g0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return this.f20072h ? sb.b.f51589b : sb.b.f51588a;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public AnimatorSet h() {
            tb.h hVarL = l();
            if (hVarL.i("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = hVarL.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f20071g.getWidth());
                hVarL.k("width", propertyValuesHolderArrG);
            }
            if (hVarL.i("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = hVarL.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f20071g.getHeight());
                hVarL.k("height", propertyValuesHolderArrG2);
            }
            if (hVarL.i("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = hVarL.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.f20071g.getPaddingStart());
                hVarL.k("paddingStart", propertyValuesHolderArrG3);
            }
            if (hVarL.i("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = hVarL.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.f20071g.getPaddingEnd());
                hVarL.k("paddingEnd", propertyValuesHolderArrG4);
            }
            if (hVarL.i("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = hVarL.g("labelOpacity");
                int iAlpha = Color.alpha(ExtendedFloatingActionButton.this.getCurrentOriginalTextColor());
                propertyValuesHolderArrG5[0].setFloatValues(iAlpha != 0 ? Color.alpha(ExtendedFloatingActionButton.this.getCurrentTextColor()) / iAlpha : 0.0f, this.f20072h ? 1.0f : 0.0f);
                hVarL.k("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.k(hVarL);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f20051g0 = this.f20072h;
            ExtendedFloatingActionButton.this.f20052h0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
            ExtendedFloatingActionButton.this.j0();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(l lVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20074g;

        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.S = 0;
            if (this.f20074g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.c0();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void e() {
            super.e();
            this.f20074g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return sb.b.f51590c;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f20074g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.S = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(l lVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m extends com.google.android.material.floatingactionbutton.b {
        public m(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.S = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.d0();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return sb.b.f51591d;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.S = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(l lVar) {
        }
    }
}
