package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property S = new a(Float.class, "thumbPos");
    private static final int[] T = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    ObjectAnimator N;
    private final q O;
    private j P;
    private b Q;
    private final Rect R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f1437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f1443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f1444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f1451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f1452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f1453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f1458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f1459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VelocityTracker f1460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f1462z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1462z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f1463a;

        b(SwitchCompat switchCompat) {
            this.f1463a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = (SwitchCompat) this.f1463a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1463a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.L);
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) S, z10 ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    private void b() {
        Drawable drawable = this.f1437a;
        if (drawable != null) {
            if (this.f1440d || this.f1441e) {
                Drawable drawableMutate = f0.a.r(drawable).mutate();
                this.f1437a = drawableMutate;
                if (this.f1440d) {
                    f0.a.o(drawableMutate, this.f1438b);
                }
                if (this.f1441e) {
                    f0.a.p(this.f1437a, this.f1439c);
                }
                if (this.f1437a.isStateful()) {
                    this.f1437a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1442f;
        if (drawable != null) {
            if (this.f1445i || this.f1446j) {
                Drawable drawableMutate = f0.a.r(drawable).mutate();
                this.f1442f = drawableMutate;
                if (this.f1445i) {
                    f0.a.o(drawableMutate, this.f1443g);
                }
                if (this.f1446j) {
                    f0.a.p(this.f1442f, this.f1444h);
                }
                if (this.f1442f.isStateful()) {
                    this.f1442f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.M);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private j getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new j(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.f1462z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((z0.b(this) ? 1.0f - this.f1462z : this.f1462z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1442f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1437a;
        Rect rectD = drawable2 != null ? y.d(drawable2) : y.f1752c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f1437a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1437a.getPadding(this.R);
        int i10 = this.E;
        int i11 = this.f1457u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        int i14 = this.C + i13;
        Rect rect = this.R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1453q;
            if (string == null) {
                string = getResources().getString(h.h.f39972c);
            }
            n0.q0.A0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1451o;
            if (string == null) {
                string = getResources().getString(h.h.f39973d);
            }
            n0.q0.A0(this, string);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.Q == null && this.P.b() && androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            int iE = eVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.Q = bVar;
                eVarC.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f1456t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1460x.computeCurrentVelocity(1000);
            float xVelocity = this.f1460x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1461y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!z0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1453q = charSequence;
        this.f1454r = g(charSequence);
        this.L = null;
        if (this.f1455s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1451o = charSequence;
        this.f1452p = g(charSequence);
        this.K = null;
        if (this.f1455s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.R;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1437a;
        Rect rectD = drawable != null ? y.d(drawable) : y.f1752c;
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1442f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1442f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1437a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f1437a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                f0.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1437a;
        if (drawable != null) {
            f0.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null) {
            f0.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1437a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!z0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1449m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (z0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1449m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1455s;
    }

    public boolean getSplitTrack() {
        return this.f1450n;
    }

    public int getSwitchMinWidth() {
        return this.f1448l;
    }

    public int getSwitchPadding() {
        return this.f1449m;
    }

    public CharSequence getTextOff() {
        return this.f1453q;
    }

    public CharSequence getTextOn() {
        return this.f1451o;
    }

    public Drawable getThumbDrawable() {
        return this.f1437a;
    }

    protected final float getThumbPosition() {
        return this.f1462z;
    }

    public int getThumbTextPadding() {
        return this.f1447k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1438b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1439c;
    }

    public Drawable getTrackDrawable() {
        return this.f1442f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1443g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1444h;
    }

    void j() {
        setTextOnInternal(this.f1451o);
        setTextOffInternal(this.f1453q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1437a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public void m(Context context, int i10) {
        o0 o0VarT = o0.t(context, i10, h.j.f40011c3);
        ColorStateList colorStateListC = o0VarT.c(h.j.f40035g3);
        if (colorStateListC != null) {
            this.J = colorStateListC;
        } else {
            this.J = getTextColors();
        }
        int iF = o0VarT.f(h.j.f40017d3, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.I.getTextSize()) {
                this.I.setTextSize(f10);
                requestLayout();
            }
        }
        o(o0VarT.k(h.j.f40023e3, -1), o0VarT.k(h.j.f40029f3, -1));
        if (o0VarT.a(h.j.f40092r3, false)) {
            this.M = new l.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f1451o);
        setTextOffInternal(this.f1453q);
        o0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.I.setFakeBoldText((i11 & 1) != 0);
            this.I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f1442f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1437a;
        if (drawable != null) {
            if (!this.f1450n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = y.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1451o : this.f1453q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1437a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f1442f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = y.d(this.f1437a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (z0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.B;
            }
            this.D = paddingLeft;
            this.E = paddingTop;
            this.G = height;
            this.F = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.B;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f1455s) {
            if (this.K == null) {
                this.K = i(this.f1452p);
            }
            if (this.L == null) {
                this.L = i(this.f1454r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f1437a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1437a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1437a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f1455s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1447k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1442f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1437a;
        if (drawable3 != null) {
            Rect rectD = y.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.f1448l, (this.C * 2) + iMax + iMax2) : this.f1448l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1451o : this.f1453q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f1460x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f1456t = 1;
                this.f1458v = x10;
                this.f1459w = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f1456t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1456t = 0;
            this.f1460x.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f1456t;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f1458v) > this.f1457u || Math.abs(y11 - this.f1459w) > this.f1457u) {
                    this.f1456t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f1458v = x11;
                    this.f1459w = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f1458v;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (z0.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f1462z + f10, 0.0f, 1.0f);
                if (f12 != this.f1462z) {
                    this.f1458v = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f1456t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1456t = 0;
            this.f1460x.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1451o);
        setTextOffInternal(this.f1453q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1455s != z10) {
            this.f1455s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1450n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1448l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1449m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1437a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1437a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f1462z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(i.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1447k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1438b = colorStateList;
        this.f1440d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1439c = mode;
        this.f1441e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1442f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1442f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(i.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1443g = colorStateList;
        this.f1445i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1444h = mode;
        this.f1446j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1437a || drawable == this.f1442f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1438b = null;
        this.f1439c = null;
        this.f1440d = false;
        this.f1441e = false;
        this.f1443g = null;
        this.f1444h = null;
        this.f1445i = false;
        this.f1446j = false;
        this.f1460x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        k0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h.j.N2;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        n0.q0.k0(this, context, iArr, attributeSet, o0VarV.r(), i10, 0);
        Drawable drawableG = o0VarV.g(h.j.Q2);
        this.f1437a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = o0VarV.g(h.j.Z2);
        this.f1442f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(o0VarV.p(h.j.O2));
        setTextOffInternal(o0VarV.p(h.j.P2));
        this.f1455s = o0VarV.a(h.j.R2, true);
        this.f1447k = o0VarV.f(h.j.W2, 0);
        this.f1448l = o0VarV.f(h.j.T2, 0);
        this.f1449m = o0VarV.f(h.j.U2, 0);
        this.f1450n = o0VarV.a(h.j.S2, false);
        ColorStateList colorStateListC = o0VarV.c(h.j.X2);
        if (colorStateListC != null) {
            this.f1438b = colorStateListC;
            this.f1440d = true;
        }
        PorterDuff.Mode modeE = y.e(o0VarV.k(h.j.Y2, -1), null);
        if (this.f1439c != modeE) {
            this.f1439c = modeE;
            this.f1441e = true;
        }
        if (this.f1440d || this.f1441e) {
            b();
        }
        ColorStateList colorStateListC2 = o0VarV.c(h.j.f39999a3);
        if (colorStateListC2 != null) {
            this.f1443g = colorStateListC2;
            this.f1445i = true;
        }
        PorterDuff.Mode modeE2 = y.e(o0VarV.k(h.j.f40005b3, -1), null);
        if (this.f1444h != modeE2) {
            this.f1444h = modeE2;
            this.f1446j = true;
        }
        if (this.f1445i || this.f1446j) {
            c();
        }
        int iN = o0VarV.n(h.j.V2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        q qVar = new q(this);
        this.O = qVar;
        qVar.m(attributeSet, i10);
        o0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1457u = viewConfiguration.getScaledTouchSlop();
        this.f1461y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
