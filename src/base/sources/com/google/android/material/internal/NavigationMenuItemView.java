package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.t0;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements androidx.appcompat.view.menu.k.a {
    private static final int[] G = {R.attr.state_checked};
    private FrameLayout A;
    private androidx.appcompat.view.menu.g B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final n0.a F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f20272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f20273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CheckedTextView f20274z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.s0(NavigationMenuItemView.this.f20272x);
            pVar.Q0(NavigationMenuItemView.this.getResources().getString(sb.k.f51845q));
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(h.a.f39867t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(sb.g.f51759g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    private void z() {
        if (D()) {
            this.f20274z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f20274z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public void B(androidx.appcompat.view.menu.g gVar, boolean z10) {
        this.f20273y = z10;
        c(gVar, 0);
    }

    public void C() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f20274z.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        t0.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.B;
        if (gVar != null && gVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f20272x != z10) {
            this.f20272x = z10;
            this.F.l(this.f20274z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f20274z.setChecked(z10);
        CheckedTextView checkedTextView = this.f20274z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f20273y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = f0.a.r(drawable).mutate();
                drawable.setTintList(this.C);
            }
            int i10 = this.f20270v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f20271w) {
            if (this.E == null) {
                Drawable drawableE = d0.h.e(getResources(), sb.f.f51746m, getContext().getTheme());
                this.E = drawableE;
                if (drawableE != null) {
                    int i11 = this.f20270v;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.E;
        }
        this.f20274z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f20274z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f20270v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f20274z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f20271w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f20274z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f20274z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f20274z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20273y = true;
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(sb.i.f51813l, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(sb.e.f51697l));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(sb.g.f51761h);
        this.f20274z = checkedTextView;
        q0.m0(checkedTextView, aVar);
    }
}
