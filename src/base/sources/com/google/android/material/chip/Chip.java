package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.j;
import com.google.android.material.internal.z;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.List;
import jc.d;
import jc.f;
import mc.s;
import n0.q0;
import o0.p;
import sb.k;
import sb.l;
import sb.m;
import tb.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.a.InterfaceC0306a, s, j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f19812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InsetDrawable f19813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RippleDrawable f19814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnClickListener f19815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f19816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j.a f19817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f19825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f19826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f19828u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f19829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f f19830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f19809x = l.L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Rect f19810y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f19811z = {R.attr.state_selected};
    private static final int[] A = {R.attr.state_checkable};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f19812e != null) {
                Chip.this.f19812e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends v0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // v0.a
        protected int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // v0.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f19815h != null) {
                list.add(1);
            }
        }

        @Override // v0.a
        protected boolean L(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // v0.a
        protected void O(p pVar) {
            pVar.s0(Chip.this.r());
            pVar.v0(Chip.this.isClickable());
            pVar.u0(Chip.this.getAccessibilityClassName());
            pVar.Y0(Chip.this.getText());
        }

        @Override // v0.a
        protected void P(int i10, p pVar) {
            if (i10 != 1) {
                pVar.y0("");
                pVar.p0(Chip.f19810y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                pVar.y0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                pVar.y0(Chip.this.getContext().getString(k.E, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            pVar.p0(Chip.this.getCloseIconTouchBoundsInt());
            pVar.b(p.a.f47928i);
            pVar.A0(Chip.this.isEnabled());
            pVar.u0(Button.class.getName());
        }

        @Override // v0.a
        protected void Q(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f19821n = z10;
            }
            if (Chip.this.f19812e.W1(Chip.this.f19821n)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51606f);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f19812e) == null) {
            return;
        }
        int iH1 = (int) (aVar.h1() + this.f19812e.I1() + this.f19812e.O0());
        int iM1 = (int) (this.f19812e.m1() + this.f19812e.J1() + this.f19812e.K0());
        if (this.f19813f != null) {
            Rect rect = new Rect();
            this.f19813f.getPadding(rect);
            iM1 += rect.left;
            iH1 += rect.right;
        }
        setPaddingRelative(iM1, getPaddingTop(), iH1, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.r(getContext(), paint, this.f19830w);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        j.a aVar = chip.f19817j;
        if (aVar != null) {
            aVar.a(chip, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f19816i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f19829v.setEmpty();
        if (n() && this.f19815h != null) {
            this.f19812e.w1(this.f19829v);
        }
        return this.f19829v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f19828u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f19828u;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.H1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.P2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f19821n) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f19820m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f19819l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f19821n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f19820m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f19819l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f19812e;
        return (aVar == null || aVar.p1() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = z.i(context, attributeSet, m.f52009i1, i10, f19809x, new int[0]);
        this.f19822o = typedArrayI.getBoolean(m.P1, false);
        this.f19824q = (int) Math.ceil(typedArrayI.getDimension(m.D1, jc.b.i(context)));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f19813f = new InsetDrawable((Drawable) this.f19812e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f19820m != z10) {
            this.f19820m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f19819l != z10) {
            this.f19819l = z10;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f19813f != null) {
            this.f19813f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.P2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f19815h != null) {
            q0.m0(this, this.f19826s);
            this.f19827t = true;
        } else {
            q0.m0(this, null);
            this.f19827t = false;
        }
    }

    private void y() {
        z();
    }

    private void z() {
        RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(this.f19812e.E1()), getBackgroundDrawable(), null);
        FocusRingDrawable.x(getContext(), rippleDrawable, this.f19812e);
        this.f19814g = rippleDrawable;
        this.f19812e.m3(false);
        setBackground(this.f19814g);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0306a
    public void a() {
        m(this.f19824q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f19827t) {
            return this.f19826s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f19827t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f19826s.w(keyEvent) || this.f19826s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f19812e;
        if ((aVar == null || !aVar.O1()) ? false : this.f19812e.L2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f19825r)) {
            return this.f19825r;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).i()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f19813f;
        return insetDrawable == null ? this.f19812e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.g1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f19812e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.l1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.q1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.r1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.v1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f19827t && (this.f19826s.A() == 1 || this.f19826s.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        com.google.android.material.chip.a aVar = this.f19812e;
        return aVar != null ? aVar.A1() : super.getFontVariationSettings();
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.B1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.D1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.E1();
        }
        return null;
    }

    public mc.p getShapeAppearanceModel() {
        return this.f19812e.M();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.I1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            return aVar.J1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.f19824q = i10;
        if (!v()) {
            if (this.f19813f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f19812e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f19812e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f19813f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f19813f != null) {
            Rect rect = new Rect();
            this.f19813f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.f(this, this.f19812e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f19811z);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f19827t) {
            this.f19826s.K(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            p.c1(accessibilityNodeInfo).x0(p.h.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f19823p != i10) {
            this.f19823p = i10;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f19819l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f19819l) {
                    t();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f19812e;
        return aVar != null && aVar.N1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f19812e;
        return aVar != null && aVar.P1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f19825r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f19814g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f19814g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.X1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar == null) {
            this.f19818k = z10;
        } else if (aVar.N1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.Z1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.b2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.f2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.h2(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f19812e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f19812e = aVar;
            aVar.b3(false);
            k(this.f19812e);
            m(this.f19824q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.l2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.n2(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.p2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.t2(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.v2(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.x2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.z2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.C2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.D2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.E2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.G2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.H2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.I2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.J2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.K2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.M2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.N2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.k0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f19812e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.Q2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f19822o = z10;
        m(this.f19824q);
    }

    @Override // android.widget.TextView
    public boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar == null) {
            return false;
        }
        aVar.R2(str);
        B();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.S2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.T2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.U2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.V2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.W2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.X2(i10);
        }
    }

    @Override // com.google.android.material.internal.j
    public void setInternalOnCheckedChangeListener(j.a aVar) {
        this.f19817j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f19812e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.Y2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f19816i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f19815h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.Z2(colorStateList);
        }
        if (this.f19812e.L1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.a3(i10);
            if (this.f19812e.L1()) {
                return;
            }
            z();
        }
    }

    @Override // mc.s
    public void setShapeAppearanceModel(mc.p pVar) {
        this.f19812e.setShapeAppearanceModel(pVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.c3(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.d3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.n3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f19812e;
        if (aVar2 != null) {
            aVar2.e3(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.f3(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.h3(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.i3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.j3(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.k3(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.l3(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f19815h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f19827t) {
            this.f19826s.W(1, 1);
        }
        return z10;
    }

    public boolean v() {
        return this.f19822o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19809x;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19828u = new Rect();
        this.f19829v = new RectF();
        this.f19830w = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarT0 = com.google.android.material.chip.a.T0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarT0);
        aVarT0.k0(getElevation());
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52009i1, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(m.V1);
        typedArrayI.recycle();
        this.f19826s = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f19818k);
        setText(aVarT0.G1());
        setEllipsize(aVarT0.z1());
        B();
        if (!this.f19812e.n3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f19824q);
        }
        this.f19823p = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zb.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f58792a, compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.O2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.e2(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.s2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(KPtaxpyICj.tGIbGq);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.g3(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f19812e;
        if (aVar != null) {
            aVar.g3(i10);
        }
        B();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f {
        a() {
        }

        @Override // jc.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f19812e.n3() ? Chip.this.f19812e.G1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // jc.f
        public void a(int i10) {
        }
    }
}
