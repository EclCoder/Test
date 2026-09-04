package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.o0;
import com.facebook.internal.a1;
import com.facebook.internal.b1;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import sb.c;
import sb.f;
import sb.g;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[] A;
    private static final int[][] B;
    private static final int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f19785y = l.N;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f19786z = {c.f51625o0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f19787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f19788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f19789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f19793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f19794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f19795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ColorStateList f19797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ColorStateList f19798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f19799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f19801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f19803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f19804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f19805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f19806x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f19797o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f19797o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f19801s, MaterialCheckBox.this.f19797o.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19808a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f19808a;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f19808a));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f19808a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = c.f51623n0;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f39862o);
    }

    private boolean c(o0 o0Var) {
        return o0Var.n(m.f52224w6, 0) == C && o0Var.n(m.f52239x6, 0) == 0;
    }

    private void e() {
        this.f19794l = com.google.android.material.drawable.c.d(this.f19794l, this.f19797o, androidx.core.widget.c.c(this));
        this.f19795m = com.google.android.material.drawable.c.d(this.f19795m, this.f19798p, this.f19799q);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.c.a(this.f19794l, this.f19795m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f19803u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f19796n) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f19805w;
            if (cVar2 != null) {
                cVar2.f(this.f19806x);
                this.f19805w.b(this.f19806x);
            }
            Drawable drawable = this.f19794l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f19805w) == null) {
                return;
            }
            int i10 = g.f51749b;
            int i11 = g.f51798z0;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f19794l).addTransition(g.f51765j, i11, this.f19805w, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f19800r;
        if (i10 == 1) {
            return getResources().getString(k.B);
        }
        return i10 == 0 ? getResources().getString(k.D) : getResources().getString(k.C);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f19789g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = ac.a.d(this, h.a.f39866s);
            int iD2 = ac.a.d(this, h.a.f39869v);
            int iD3 = ac.a.d(this, c.f51620m);
            int iD4 = ac.a.d(this, c.f51614j);
            iArr2[0] = ac.a.j(iD3, iD2, 1.0f);
            iArr2[1] = ac.a.j(iD3, iD, 1.0f);
            iArr2[2] = ac.a.j(iD3, iD4, 0.54f);
            iArr2[3] = ac.a.j(iD3, iD4, 0.38f);
            iArr2[4] = ac.a.j(iD3, iD4, 0.38f);
            this.f19789g = new ColorStateList(iArr, iArr2);
        }
        return this.f19789g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f19797o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f19794l;
        if (drawable != null && (colorStateList2 = this.f19797o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f19795m;
        if (drawable2 == null || (colorStateList = this.f19798p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public boolean d() {
        return this.f19792j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f19794l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f19795m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f19798p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f19799q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f19797o;
    }

    public int getCheckedState() {
        return this.f19800r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f19793k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f19800r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19790h && this.f19797o == null && this.f19798p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f19786z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.f19801s = com.google.android.material.drawable.c.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f19791i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (c0.m(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f19793k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f19808a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f19808a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(i.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f19795m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(i.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f19798p == colorStateList) {
            return;
        }
        this.f19798p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f19799q == mode) {
            return;
        }
        this.f19799q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f19797o == colorStateList) {
            return;
        }
        this.f19797o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f19791i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f19800r != i10) {
            this.f19800r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f19802t) {
                return;
            }
            this.f19802t = true;
            LinkedHashSet linkedHashSet = this.f19788f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            if (this.f19800r != 2 && (onCheckedChangeListener = this.f19804v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = b1.a(getContext().getSystemService(a1.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f19802t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f19793k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f19792j == z10) {
            return;
        }
        this.f19792j = z10;
        refreshDrawableState();
        Iterator it = this.f19787e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f19804v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f19803u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f19790h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19785y;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19787e = new LinkedHashSet();
        this.f19788f = new LinkedHashSet();
        this.f19805w = androidx.vectordrawable.graphics.drawable.c.a(getContext(), f.f51741h);
        this.f19806x = new a();
        Context context2 = getContext();
        this.f19794l = androidx.core.widget.c.a(this);
        this.f19797o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        o0 o0VarJ = z.j(context2, attributeSet, m.f52209v6, i10, i11, new int[0]);
        this.f19795m = o0VarJ.g(m.f52254y6);
        if (this.f19794l != null && z.g(context2) && c(o0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f19794l = i.a.b(context2, f.f51740g);
            this.f19796n = true;
            if (this.f19795m == null) {
                this.f19795m = i.a.b(context2, f.f51742i);
            }
        }
        this.f19798p = jc.c.b(context2, o0VarJ, m.f52269z6);
        this.f19799q = c0.n(o0VarJ.k(m.A6, -1), PorterDuff.Mode.SRC_IN);
        this.f19790h = o0VarJ.a(m.G6, false);
        this.f19791i = o0VarJ.a(m.B6, true);
        this.f19792j = o0VarJ.a(m.E6, false);
        this.f19793k = o0VarJ.p(m.D6);
        int i12 = m.C6;
        if (o0VarJ.s(i12)) {
            setCheckedState(o0VarJ.k(i12, 0));
        }
        int i13 = m.F6;
        if (o0VarJ.s(i13)) {
            setRippleColor(jc.c.b(context2, o0VarJ, i13));
        }
        o0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f19794l = drawable;
        this.f19796n = false;
        e();
    }
}
