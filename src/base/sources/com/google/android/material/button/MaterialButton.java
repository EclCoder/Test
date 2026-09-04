package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mc.o;
import mc.p;
import mc.s;
import mc.x;
import mc.y;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialButton extends AppCompatButton implements Checkable, s {
    private static final int[] N = {R.attr.state_checkable};
    private static final int[] O = {R.attr.state_checked};
    private static final int P = l.I;
    private static final int Q = sb.c.H;
    private static final f1.f R = new a("widthIncrease");
    private int A;
    private int B;
    private LinearLayout.LayoutParams C;
    private boolean D;
    private int E;
    private boolean F;
    int G;
    y H;
    int I;
    private e J;
    private float K;
    private float L;
    private f1.h M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f19569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f19570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f19571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f19572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f19573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f19574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PorterDuff.Mode f19575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f19576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f19577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f19579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f19591z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f1.f {
        a(String str) {
            super(str);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends u0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f19592c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f19592c = parcel.readInt() == 1;
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19592c ? 1 : 0);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum e {
        NONE,
        START,
        END,
        BOTH
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.B);
    }

    private boolean A() {
        int i10 = this.f19589x;
        return i10 == 16 || i10 == 32;
    }

    private boolean B() {
        j jVar = this.f19569d;
        return (jVar == null || jVar.s()) ? false : true;
    }

    private void C(boolean z10) {
        if (this.H == null) {
            return;
        }
        if (this.M == null) {
            r();
        }
        if (this.F) {
            this.M.s(Math.min(k(), this.H.e(getDrawableState()).f45761a.a(getWidth())));
            if (z10) {
                this.M.y();
            }
        }
    }

    private boolean D(final Runnable runnable) {
        f1.h hVar = this.M;
        if (hVar == null || !hVar.h()) {
            return false;
        }
        post(new Runnable() { // from class: com.google.android.material.button.f
            @Override // java.lang.Runnable
            public final void run() {
                MaterialButton.e(this.f19637a, runnable);
            }
        });
        return true;
    }

    private void F(boolean z10) {
        Drawable drawable = this.f19574i;
        if (drawable != null) {
            Drawable drawableMutate = f0.a.r(drawable).mutate();
            this.f19574i = drawableMutate;
            drawableMutate.setTintList(this.f19573h);
            PorterDuff.Mode mode = this.f19572g;
            if (mode != null) {
                this.f19574i.setTintMode(mode);
            }
            int intrinsicWidth = this.f19580o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f19574i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f19580o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f19574i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f19574i;
            int i10 = this.f19581p;
            int i11 = this.f19582q;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f19574i.setVisible(true, z10);
        }
        K();
        if (this.f19574i == null && this.f19577l != null && j()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z11 = (u() && compoundDrawablesRelative[0] != this.f19574i) || (t() && compoundDrawablesRelative[2] != this.f19574i) || (v() && compoundDrawablesRelative[1] != this.f19574i);
        if (z10 || z11) {
            if (u()) {
                setCompoundDrawablesRelative(this.f19574i, p(1), p(2), null);
            } else if (t()) {
                setCompoundDrawablesRelative(p(0), p(1), this.f19574i, null);
            } else if (v()) {
                setCompoundDrawablesRelative(p(0), this.f19574i, p(2), null);
            }
        }
    }

    private void G(int i10, int i11) {
        if (this.f19574i == null || getLayout() == null) {
            return;
        }
        if (u() || t()) {
            this.f19582q = 0;
            if (l(this.f19588w)) {
                this.f19581p = 0;
                F(false);
                return;
            }
            int iN = n(i10, this.f19588w);
            if (this.f19581p != iN) {
                this.f19581p = iN;
                F(false);
                return;
            }
            return;
        }
        if (v()) {
            this.f19581p = 0;
            if (this.f19588w == 16) {
                this.f19582q = 0;
                F(false);
                return;
            }
            int intrinsicHeight = this.f19580o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f19574i.getIntrinsicHeight();
            }
            int iO = o(i11, intrinsicHeight);
            if (this.f19582q != iO) {
                this.f19582q = iO;
                F(false);
            }
        }
    }

    private void H() {
        int i10 = (int) (this.K - this.L);
        int i11 = (i10 / 2) + (x() ? -this.E : this.E);
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f19591z + i10);
        }
        setPaddingRelative(this.A + i11, getPaddingTop(), (this.B + i10) - i11, getPaddingBottom());
    }

    private void I(boolean z10) {
        Drawable drawable = this.f19577l;
        if (drawable != null) {
            Drawable drawableMutate = f0.a.r(drawable).mutate();
            this.f19577l = drawableMutate;
            drawableMutate.setTintList(this.f19576k);
            PorterDuff.Mode mode = this.f19575j;
            if (mode != null) {
                this.f19577l.setTintMode(mode);
            }
            int intrinsicWidth = this.f19580o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f19577l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f19580o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f19577l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f19577l;
            int i10 = this.f19584s;
            int i11 = this.f19585t;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f19577l.setVisible(true, z10);
        }
        L();
        if (this.f19577l == null) {
            if (this.f19578m) {
                return;
            }
            if (this.f19574i != null && j()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z11 = (z() && compoundDrawablesRelative[0] != this.f19577l) || (y() && compoundDrawablesRelative[2] != this.f19577l) || (A() && compoundDrawablesRelative[1] != this.f19577l);
        if (z10 || z11) {
            if (z()) {
                setCompoundDrawablesRelative(this.f19577l, q(1), q(2), null);
            } else if (y()) {
                setCompoundDrawablesRelative(q(0), q(1), this.f19577l, null);
            } else if (A()) {
                setCompoundDrawablesRelative(q(0), this.f19577l, q(2), null);
            }
        }
    }

    private void J(int i10, int i11) {
        if (this.f19577l == null || getLayout() == null) {
            return;
        }
        if (z() || y()) {
            this.f19585t = 0;
            if (l(this.f19589x)) {
                this.f19584s = 0;
                I(false);
                return;
            }
            int iN = n(i10, this.f19589x);
            if (this.f19584s != iN) {
                this.f19584s = iN;
                I(false);
                return;
            }
            return;
        }
        if (A()) {
            this.f19584s = 0;
            if (this.f19589x == 16) {
                this.f19585t = 0;
                I(false);
                return;
            }
            int intrinsicHeight = this.f19580o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f19577l.getIntrinsicHeight();
            }
            int iO = o(i11, intrinsicHeight);
            if (this.f19585t != iO) {
                this.f19585t = iO;
                I(false);
            }
        }
    }

    private void K() {
        if (this.f19574i != null && this.f19577l != null && j()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
    }

    private void L() {
        if (this.f19577l != null && this.f19574i != null && j()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
    }

    public static /* synthetic */ void b(MaterialButton materialButton) {
        materialButton.E = materialButton.getOpticalCenterShift();
        materialButton.H();
        materialButton.invalidate();
    }

    public static /* synthetic */ void e(MaterialButton materialButton, Runnable runnable) {
        materialButton.getClass();
        runnable.run();
        materialButton.E();
        materialButton.requestLayout();
    }

    public static /* synthetic */ void f(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.E != i10) {
            materialButton.E = i10;
            materialButton.H();
            materialButton.invalidate();
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.K;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        mc.i iVarI;
        if (this.D && this.F && (iVarI = this.f19569d.i()) != null) {
            return (int) (iVarI.C() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean j() {
        if (u() && z()) {
            return true;
        }
        if (t() && y()) {
            return true;
        }
        return v() && A();
    }

    private int k() {
        int iOrdinal = this.J.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return this.I / 2;
        }
        if (iOrdinal != 3) {
            return 0;
        }
        return this.I;
    }

    private boolean l(int i10) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i10 == 1 || i10 == 3 || (i10 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i10 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    private f1.i m() {
        return gc.j.h(getContext(), sb.c.f51597a0, l.f51859c);
    }

    private int n(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f19574i;
        if (drawable != null) {
            intrinsicWidth = this.f19580o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f19577l;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f19580o;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f19583r) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return x() != (i11 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    private int o(int i10, int i11) {
        return Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i11) - this.f19583r) - getPaddingBottom()) / 2);
    }

    private Drawable p(int i10) {
        if (i10 == 0) {
            if (this.f19577l == null || !z()) {
                return null;
            }
            return this.f19577l;
        }
        if (i10 == 1) {
            if (this.f19577l == null || !A()) {
                return null;
            }
            return this.f19577l;
        }
        if (i10 == 2 && this.f19577l != null && y()) {
            return this.f19577l;
        }
        return null;
    }

    private Drawable q(int i10) {
        if (i10 == 0) {
            if (this.f19574i == null || !u()) {
                return null;
            }
            return this.f19574i;
        }
        if (i10 == 1) {
            if (this.f19574i == null || !t()) {
                return null;
            }
            return this.f19574i;
        }
        if (i10 == 2 && this.f19574i != null && t()) {
            return this.f19574i;
        }
        return null;
    }

    private void r() {
        f1.h hVar = new f1.h(this, R);
        this.M = hVar;
        hVar.x(m());
    }

    private void setCheckedInternal(boolean z10) {
        if (!s() || this.f19586u == z10) {
            return;
        }
        this.f19586u = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).K(this, this.f19586u);
        }
        if (this.f19587v) {
            return;
        }
        this.f19587v = true;
        Iterator it = this.f19570e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, this.f19586u);
        }
        this.f19587v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.K != f10) {
            this.K = f10;
            H();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).x(this, (int) this.K);
            }
        }
    }

    private boolean t() {
        int i10 = this.f19588w;
        return i10 == 3 || i10 == 4;
    }

    private boolean u() {
        int i10 = this.f19588w;
        return i10 == 1 || i10 == 2;
    }

    private boolean v() {
        int i10 = this.f19588w;
        return i10 == 16 || i10 == 32;
    }

    private boolean w() {
        return (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0;
    }

    private boolean x() {
        return getLayoutDirection() == 1;
    }

    private boolean y() {
        int i10 = this.f19589x;
        return i10 == 3 || i10 == 4;
    }

    private boolean z() {
        int i10 = this.f19589x;
        return i10 == 1 || i10 == 2;
    }

    void E() {
        LinearLayout.LayoutParams layoutParams = this.C;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.C = null;
            this.f19591z = -2.14748365E9f;
        }
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f19579n)) {
            return (s() ? CompoundButton.class : Button.class).getName();
        }
        return this.f19579n;
    }

    int getAllowedWidthDecrease() {
        return this.G;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (B()) {
            return this.f19569d.b();
        }
        return 0;
    }

    public f1.i getCornerSpringForce() {
        return this.f19569d.c();
    }

    public Drawable getIcon() {
        return this.f19574i;
    }

    public int getIconGravity() {
        return this.f19588w;
    }

    public int getIconPadding() {
        return this.f19583r;
    }

    public int getIconSize() {
        return this.f19580o;
    }

    public ColorStateList getIconTint() {
        return this.f19573h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f19572g;
    }

    public int getInsetBottom() {
        return this.f19569d.d();
    }

    public int getInsetLeft() {
        return this.f19569d.e();
    }

    public int getInsetRight() {
        return this.f19569d.f();
    }

    public int getInsetTop() {
        return this.f19569d.g();
    }

    public ColorStateList getRippleColor() {
        if (B()) {
            return this.f19569d.k();
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f19577l;
    }

    public int getSecondaryIconGravity() {
        return this.f19589x;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f19576k;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f19575j;
    }

    public o getShapeAppearance() {
        if (B()) {
            return this.f19569d.l();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
    }

    public p getShapeAppearanceModel() {
        if (B()) {
            return this.f19569d.m();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (B()) {
            return this.f19569d.n();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (B()) {
            return this.f19569d.o();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return B() ? this.f19569d.p() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return B() ? this.f19569d.q() : super.getSupportBackgroundTintMode();
    }

    public void i(b bVar) {
        this.f19570e.add(bVar);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f19586u;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B()) {
            mc.j.f(this, this.f19569d.i());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (s()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        G(getMeasuredWidth(), getMeasuredHeight());
        J(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f19590y != i15) {
            this.f19590y = i15;
            this.f19591z = -2.14748365E9f;
        }
        if (this.f19591z == -2.14748365E9f) {
            this.f19591z = getMeasuredWidth();
            if (this.C == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.C = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.C);
                layoutParams.width = (int) this.f19591z;
                setLayoutParams(layoutParams);
            }
        }
        if (this.G == Integer.MIN_VALUE) {
            if (this.f19574i == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f19580o;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f19574i.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.G = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.A == Integer.MIN_VALUE) {
            this.A = getPaddingStart();
        }
        if (this.B == Integer.MIN_VALUE) {
            this.B = getPaddingEnd();
        }
        this.F = w();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.f19592c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f19592c = this.f19586u;
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        G(getMeasuredWidth(), getMeasuredHeight());
        J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean z10;
        if (isEnabled() && this.f19569d.u()) {
            toggle();
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zPerformClick = super.performClick();
        if (z10 && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f19574i != null) {
            if (this.f19574i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public boolean s() {
        j jVar = this.f19569d;
        return jVar != null && jVar.t();
    }

    public void setA11yClassName(String str) {
        this.f19579n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (B()) {
            this.f19569d.w(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!B()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f19569d.x();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (B()) {
            this.f19569d.y(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i10) {
        if (getCompoundDrawablePadding() != i10) {
            this.f19591z = -2.14748365E9f;
        }
        super.setCompoundDrawablePadding(i10);
    }

    public void setCornerRadius(int i10) {
        if (B()) {
            this.f19569d.z(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (B()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(f1.i iVar) {
        this.f19569d.B(iVar);
    }

    void setDisplayedWidthDecrease(int i10) {
        this.L = Math.min(i10, this.G);
        H();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (B()) {
            this.f19569d.i().k0(f10);
        }
    }

    public void setIcon(final Drawable drawable) {
        if (this.f19574i == drawable || D(new Runnable() { // from class: com.google.android.material.button.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f19631a.setIcon(drawable);
            }
        })) {
            return;
        }
        this.f19591z = -2.14748365E9f;
        this.f19574i = drawable;
        F(true);
        G(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i10) {
        if (this.f19588w != i10) {
            K();
            this.f19588w = i10;
            G(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f19583r != i10) {
            this.f19583r = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setIconSize(final int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f19580o == i10 || D(new Runnable() { // from class: com.google.android.material.button.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f19633a.setIconSize(i10);
            }
        })) {
            return;
        }
        this.f19591z = -2.14748365E9f;
        this.f19580o = i10;
        F(true);
        I(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f19573h != colorStateList) {
            this.f19573h = colorStateList;
            F(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f19572g != mode) {
            this.f19572g = mode;
            F(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(i.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f19569d.C(i10);
    }

    public void setInsetLeft(int i10) {
        this.f19569d.D(i10);
    }

    public void setInsetRight(int i10) {
        this.f19569d.E(i10);
    }

    public void setInsetTop(int i10) {
        this.f19569d.F(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(c cVar) {
        this.f19571f = cVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            if (z10) {
                this.f19569d.A(new mc.i.d() { // from class: com.google.android.material.button.d
                    @Override // mc.i.d
                    public final void a(float f10) {
                        MaterialButton.f(this.f19635a, f10);
                    }
                });
            } else {
                this.f19569d.A(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.e
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.b(this.f19636a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        c cVar = this.f19571f;
        if (cVar != null) {
            cVar.a(this, z10);
        }
        super.setPressed(z10);
        C(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (B()) {
            this.f19569d.H(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (B()) {
            setRippleColor(i.a.a(getContext(), i10));
        }
    }

    public void setSecondaryIcon(final Drawable drawable) {
        if (this.f19577l == drawable || D(new Runnable() { // from class: com.google.android.material.button.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f19629a.setIcon(drawable);
            }
        })) {
            return;
        }
        this.f19591z = -2.14748365E9f;
        this.f19577l = drawable;
        this.f19578m = false;
        I(true);
        J(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i10) {
        if (this.f19589x != i10) {
            L();
            this.f19589x = i10;
            J(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i10) {
        setSecondaryIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f19576k != colorStateList) {
            this.f19576k = colorStateList;
            I(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f19575j != mode) {
            this.f19575j = mode;
            I(false);
        }
    }

    public void setSecondaryIconTintResource(int i10) {
        setSecondaryIconTint(i.a.a(getContext(), i10));
    }

    public void setShapeAppearance(o oVar) {
        if (!B()) {
            throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
        }
        if (this.f19569d.c() == null && oVar.f()) {
            this.f19569d.B(m());
        }
        this.f19569d.I(oVar);
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        if (!B()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f19569d.I(pVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (B()) {
            this.f19569d.J(z10);
        }
    }

    void setSizeChange(y yVar) {
        if (this.H != yVar) {
            this.H = yVar;
            C(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (B()) {
            this.f19569d.K(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (B()) {
            setStrokeColor(i.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (B()) {
            this.f19569d.L(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (B()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (B()) {
            this.f19569d.M(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (B()) {
            this.f19569d.N(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f19591z = -2.14748365E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        G(getMeasuredWidth(), getMeasuredHeight());
        J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        this.f19591z = -2.14748365E9f;
        super.setTextAppearance(context, i10);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        this.f19591z = -2.14748365E9f;
        super.setTextSize(i10, f10);
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f19569d.O(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f19591z = -2.14748365E9f;
        super.setWidth(i10);
    }

    void setWidthChangeDirection(e eVar) {
        if (this.J != eVar) {
            this.J = eVar;
            C(true);
        }
    }

    void setWidthChangeMax(int i10) {
        if (this.I != i10) {
            this.I = i10;
            C(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f19586u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = P;
        super(pc.a.e(context, attributeSet, i10, i11, new int[]{Q}), attributeSet, i10);
        this.f19570e = new LinkedHashSet();
        this.f19586u = false;
        this.f19587v = false;
        this.f19590y = Integer.MIN_VALUE;
        this.f19591z = -2.14748365E9f;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.J = e.BOTH;
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.V4, i10, i11, new int[0]);
        this.f19583r = typedArrayI.getDimensionPixelSize(m.f52028j5, 0);
        int i12 = typedArrayI.getInt(m.f52073m5, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f19572g = c0.n(i12, mode);
        this.f19573h = jc.c.a(getContext(), typedArrayI, m.f52058l5);
        this.f19574i = jc.c.e(getContext(), typedArrayI, m.f51998h5);
        this.f19588w = typedArrayI.getInteger(m.f52013i5, 1);
        this.f19580o = typedArrayI.getDimensionPixelSize(m.f52043k5, 0);
        this.f19575j = c0.n(typedArrayI.getInt(m.f52163s5, -1), mode);
        int i13 = m.f52148r5;
        this.f19576k = typedArrayI.hasValue(i13) ? jc.c.a(getContext(), typedArrayI, i13) : this.f19573h;
        this.f19589x = typedArrayI.getInteger(m.f52133q5, 3);
        Drawable drawableE = jc.c.e(getContext(), typedArrayI, m.f52118p5);
        this.f19577l = drawableE;
        this.f19578m = drawableE == null;
        o oVarH = x.h(context2, typedArrayI, m.f52178t5);
        oVarH = oVarH == null ? p.k(context2, attributeSet, i10, i11).m() : oVarH;
        boolean z10 = typedArrayI.getBoolean(m.f52088n5, false);
        j jVar = new j(this, oVarH);
        this.f19569d = jVar;
        jVar.v(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(m.X4, false));
        if (oVarH instanceof x) {
            jVar.B(m());
        }
        setOpticalCenterEnabled(z10);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f19583r);
        F(this.f19574i != null);
        I(this.f19577l != null);
    }
}
