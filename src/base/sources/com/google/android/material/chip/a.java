package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.w;
import com.google.android.material.internal.z;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jc.c;
import jc.d;
import mc.i;
import sb.m;
import tb.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a extends i implements Drawable.Callback, w.b {
    private static final int[] T0 = {R.attr.state_enabled};
    private static final ShapeDrawable U0 = new ShapeDrawable(new OvalShape());
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private boolean E0;
    private int F0;
    private int G0;
    private ColorFilter H0;
    private PorterDuffColorFilter I0;
    private ColorStateList J;
    private ColorStateList J0;
    private ColorStateList K;
    private PorterDuff.Mode K0;
    private float L;
    private int[] L0;
    private float M;
    private boolean M0;
    private ColorStateList N;
    private ColorStateList N0;
    private float O;
    private WeakReference O0;
    private ColorStateList P;
    private TextUtils.TruncateAt P0;
    private CharSequence Q;
    private boolean Q0;
    private boolean R;
    private int R0;
    private Drawable S;
    private boolean S0;
    private ColorStateList T;
    private float U;
    private boolean V;
    private boolean W;
    private Drawable X;
    private Drawable Y;
    private ColorStateList Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f19845a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f19846b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f19847c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f19848d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Drawable f19849e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f19850f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private h f19851g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private h f19852h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f19853i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f19854j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f19855k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f19856l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f19857m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f19858n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f19859o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f19860p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final Context f19861q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Paint f19862r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final Paint f19863s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Paint.FontMetrics f19864t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final RectF f19865u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final PointF f19866v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Path f19867w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final w f19868x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f19869y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f19870z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0306a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.M = -1.0f;
        this.f19862r0 = new Paint(1);
        this.f19864t0 = new Paint.FontMetrics();
        this.f19865u0 = new RectF();
        this.f19866v0 = new PointF();
        this.f19867w0 = new Path();
        this.G0 = 255;
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        Y(context);
        this.f19861q0 = context;
        w wVar = new w(this);
        this.f19868x0 = wVar;
        this.Q = "";
        wVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f19863s0 = null;
        int[] iArr = T0;
        setState(iArr);
        L2(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    private void B2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            onStateChange(getState());
        }
    }

    private void I0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        f0.a.m(drawable, f0.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            drawable.setTintList(this.Z);
            if (drawable.isStateful()) {
                drawable.setState(u1());
                return;
            }
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void J0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (p3() || o3()) {
            float f10 = this.f19853i0 + this.f19854j0;
            float fY1 = y1();
            if (f0.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fY1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fY1;
            }
            float fX1 = x1();
            float fExactCenterY = rect.exactCenterY() - (fX1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fX1;
        }
    }

    private ColorFilter K1() {
        ColorFilter colorFilter = this.H0;
        return colorFilter != null ? colorFilter : this.I0;
    }

    private void L0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (q3()) {
            float f10 = this.f19860p0 + this.f19859o0 + this.f19845a0 + this.f19858n0 + this.f19857m0;
            if (f0.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void M0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q3()) {
            float f10 = this.f19860p0 + this.f19859o0;
            if (f0.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f19845a0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f19845a0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f19845a0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private static boolean M1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void N0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q3()) {
            float f10 = this.f19860p0 + this.f19859o0 + this.f19845a0 + this.f19858n0 + this.f19857m0;
            if (f0.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void P0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.Q != null) {
            float fK0 = this.f19853i0 + K0() + this.f19856l0;
            float fO0 = this.f19860p0 + O0() + this.f19857m0;
            if (f0.a.f(this) == 0) {
                rectF.left = rect.left + fK0;
                rectF.right = rect.right - fO0;
            } else {
                rectF.left = rect.left + fO0;
                rectF.right = rect.right - fK0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float Q0() {
        this.f19868x0.g().getFontMetrics(this.f19864t0);
        Paint.FontMetrics fontMetrics = this.f19864t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean Q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean R1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean S0() {
        return this.f19848d0 && this.f19849e0 != null && this.f19847c0;
    }

    private static boolean S1(d dVar) {
        return (dVar == null || dVar.k() == null || !dVar.k().isStateful()) ? false : true;
    }

    public static a T0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.T1(attributeSet, i10, i11);
        return aVar;
    }

    private void T1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = z.i(this.f19861q0, attributeSet, m.f52009i1, i10, i11, new int[0]);
        this.S0 = typedArrayI.hasValue(m.V1);
        B2(c.a(this.f19861q0, typedArrayI, m.H1));
        f2(c.a(this.f19861q0, typedArrayI, m.f52189u1));
        t2(typedArrayI.getDimension(m.C1, 0.0f));
        int i12 = m.f52204v1;
        if (typedArrayI.hasValue(i12)) {
            h2(typedArrayI.getDimension(i12, 0.0f));
        }
        x2(c.a(this.f19861q0, typedArrayI, m.F1));
        z2(typedArrayI.getDimension(m.G1, 0.0f));
        Z2(c.a(this.f19861q0, typedArrayI, m.U1));
        e3(typedArrayI.getText(m.f52084n1));
        d dVarH = c.h(this.f19861q0, typedArrayI, m.f52024j1);
        dVarH.q(typedArrayI.getDimension(m.f52039k1, dVarH.l()));
        if (Build.VERSION.SDK_INT >= 26) {
            int iG = c.g(typedArrayI, m.Q1, m.f52114p1);
            if (typedArrayI.hasValue(iG)) {
                dVarH.o(typedArrayI.getString(iG));
            }
        }
        f3(dVarH);
        int i13 = typedArrayI.getInt(m.f52054l1, 0);
        if (i13 == 1) {
            Q2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            Q2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            Q2(TextUtils.TruncateAt.END);
        }
        s2(typedArrayI.getBoolean(m.B1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            s2(typedArrayI.getBoolean(m.f52249y1, false));
        }
        l2(c.e(this.f19861q0, typedArrayI, m.f52234x1));
        int i14 = m.A1;
        if (typedArrayI.hasValue(i14)) {
            p2(c.a(this.f19861q0, typedArrayI, i14));
        }
        n2(typedArrayI.getDimension(m.f52264z1, -1.0f));
        O2(typedArrayI.getBoolean(m.O1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            O2(typedArrayI.getBoolean(m.J1, false));
        }
        C2(c.e(this.f19861q0, typedArrayI, m.I1));
        M2(c.a(this.f19861q0, typedArrayI, m.N1));
        H2(typedArrayI.getDimension(m.L1, 0.0f));
        X1(typedArrayI.getBoolean(m.f52099o1, false));
        e2(typedArrayI.getBoolean(m.f52174t1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            e2(typedArrayI.getBoolean(m.f52144r1, false));
        }
        Z1(c.e(this.f19861q0, typedArrayI, m.f52129q1));
        int i15 = m.f52159s1;
        if (typedArrayI.hasValue(i15)) {
            b2(c.a(this.f19861q0, typedArrayI, i15));
        }
        c3(h.c(this.f19861q0, typedArrayI, m.W1));
        S2(h.c(this.f19861q0, typedArrayI, m.R1));
        v2(typedArrayI.getDimension(m.E1, 0.0f));
        W2(typedArrayI.getDimension(m.T1, 0.0f));
        U2(typedArrayI.getDimension(m.S1, 0.0f));
        k3(typedArrayI.getDimension(m.Y1, 0.0f));
        h3(typedArrayI.getDimension(m.X1, 0.0f));
        J2(typedArrayI.getDimension(m.M1, 0.0f));
        E2(typedArrayI.getDimension(m.K1, 0.0f));
        j2(typedArrayI.getDimension(m.f52219w1, 0.0f));
        Y2(typedArrayI.getDimensionPixelSize(m.f52069m1, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    private void U0(Canvas canvas, Rect rect) {
        if (o3()) {
            J0(rect, this.f19865u0);
            RectF rectF = this.f19865u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f19849e0.setBounds(0, 0, (int) this.f19865u0.width(), (int) this.f19865u0.height());
            this.f19849e0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void V0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.f19862r0.setColor(this.f19870z0);
        this.f19862r0.setStyle(Paint.Style.FILL);
        this.f19862r0.setColorFilter(K1());
        this.f19865u0.set(rect);
        canvas.drawRoundRect(this.f19865u0, g1(), g1(), this.f19862r0);
    }

    private boolean V1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.J;
        int iR = r(colorStateList != null ? colorStateList.getColorForState(iArr, this.f19869y0) : 0);
        boolean state = true;
        if (this.f19869y0 != iR) {
            this.f19869y0 = iR;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.K;
        int iR2 = r(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f19870z0) : 0);
        if (this.f19870z0 != iR2) {
            this.f19870z0 = iR2;
            zOnStateChange = true;
        }
        int i10 = ac.a.i(iR, iR2);
        if ((this.A0 != i10) | (E() == null)) {
            this.A0 = i10;
            l0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.N;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B0) : 0;
        if (this.B0 != colorForState) {
            this.B0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.N0 == null || !kc.a.e(iArr)) ? 0 : this.N0.getColorForState(iArr, this.C0);
        if (this.C0 != colorForState2) {
            this.C0 = colorForState2;
            if (this.M0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f19868x0.e() == null || this.f19868x0.e().k() == null) ? 0 : this.f19868x0.e().k().getColorForState(iArr, this.D0);
        if (this.D0 != colorForState3) {
            this.D0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = M1(getState(), R.attr.state_checked) && this.f19847c0;
        if (this.E0 == z11 || this.f19849e0 == null) {
            z10 = false;
        } else {
            float fK0 = K0();
            this.E0 = z11;
            if (fK0 != K0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.J0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.F0) : 0;
        if (this.F0 != colorForState4) {
            this.F0 = colorForState4;
            this.I0 = com.google.android.material.drawable.c.o(this, this.J0, this.K0);
        } else {
            state = zOnStateChange;
        }
        if (R1(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (R1(this.f19849e0)) {
            state |= this.f19849e0.setState(iArr);
        }
        if (R1(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X.setState(iArr3);
        }
        if (R1(this.Y)) {
            state |= this.Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            U1();
        }
        return state;
    }

    private void W0(Canvas canvas, Rect rect) {
        if (p3()) {
            J0(rect, this.f19865u0);
            RectF rectF = this.f19865u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.S.setBounds(0, 0, (int) this.f19865u0.width(), (int) this.f19865u0.height());
            this.S.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void X0(Canvas canvas, Rect rect) {
        if (this.O <= 0.0f || this.S0) {
            return;
        }
        this.f19862r0.setColor(this.B0);
        this.f19862r0.setStyle(Paint.Style.STROKE);
        if (!this.S0) {
            this.f19862r0.setColorFilter(K1());
        }
        RectF rectF = this.f19865u0;
        float f10 = rect.left;
        float f11 = this.O;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.M - (this.O / 2.0f);
        canvas.drawRoundRect(this.f19865u0, f12, f12, this.f19862r0);
    }

    private void Y0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.f19862r0.setColor(this.f19869y0);
        this.f19862r0.setStyle(Paint.Style.FILL);
        this.f19865u0.set(rect);
        canvas.drawRoundRect(this.f19865u0, g1(), g1(), this.f19862r0);
    }

    private void Z0(Canvas canvas, Rect rect) {
        if (q3()) {
            M0(rect, this.f19865u0);
            RectF rectF = this.f19865u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.X.setBounds(0, 0, (int) this.f19865u0.width(), (int) this.f19865u0.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void a1(Canvas canvas, Rect rect) {
        this.f19862r0.setColor(this.C0);
        this.f19862r0.setStyle(Paint.Style.FILL);
        this.f19865u0.set(rect);
        if (!this.S0) {
            canvas.drawRoundRect(this.f19865u0, g1(), g1(), this.f19862r0);
        } else {
            l(new RectF(rect), this.f19867w0);
            super.v(canvas, this.f19862r0, this.f19867w0, A());
        }
    }

    private void b1(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f19863s0;
        if (paint != null) {
            paint.setColor(e0.a.k(-16777216, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            canvas.drawRect(rect, this.f19863s0);
            if (p3() || o3()) {
                J0(rect, this.f19865u0);
                canvas.drawRect(this.f19865u0, this.f19863s0);
            }
            if (this.Q != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f19863s0);
            } else {
                canvas2 = canvas;
            }
            if (q3()) {
                M0(rect, this.f19865u0);
                canvas2.drawRect(this.f19865u0, this.f19863s0);
            }
            this.f19863s0.setColor(e0.a.k(-65536, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            L0(rect, this.f19865u0);
            canvas2.drawRect(this.f19865u0, this.f19863s0);
            this.f19863s0.setColor(e0.a.k(-16711936, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            N0(rect, this.f19865u0);
            canvas2.drawRect(this.f19865u0, this.f19863s0);
        }
    }

    private void c1(Canvas canvas, Rect rect) {
        if (this.Q != null) {
            Paint.Align alignR0 = R0(rect, this.f19866v0);
            P0(rect, this.f19865u0);
            if (this.f19868x0.e() != null) {
                this.f19868x0.g().drawableState = getState();
                this.f19868x0.n(this.f19861q0);
            }
            this.f19868x0.g().setTextAlign(alignR0);
            int iSave = 0;
            boolean z10 = Math.round(this.f19868x0.h(G1().toString())) > Math.round(this.f19865u0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f19865u0);
            }
            CharSequence charSequenceEllipsize = this.Q;
            if (z10 && this.P0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f19868x0.g(), this.f19865u0.width(), this.P0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f19866v0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f19868x0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean o3() {
        return this.f19848d0 && this.f19849e0 != null && this.E0;
    }

    private boolean p3() {
        return this.R && this.S != null;
    }

    private boolean q3() {
        return this.W && this.X != null;
    }

    private void r3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void s3() {
        this.N0 = this.M0 ? kc.a.d(this.P) : null;
    }

    private void t3() {
        RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(E1()), this.X, U0);
        FocusRingDrawable.w(this.f19861q0, rippleDrawable);
        this.Y = rippleDrawable;
    }

    private float x1() {
        Drawable drawable = this.E0 ? this.f19849e0 : this.S;
        float fCeil = this.U;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(c0.g(this.f19861q0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float y1() {
        Drawable drawable = this.E0 ? this.f19849e0 : this.S;
        float f10 = this.U;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public String A1() {
        d dVarH1 = H1();
        if (dVarH1 == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return dVarH1.i();
    }

    public void A2(int i10) {
        z2(this.f19861q0.getResources().getDimension(i10));
    }

    public h B1() {
        return this.f19852h0;
    }

    public float C1() {
        return this.f19855k0;
    }

    public void C2(Drawable drawable) {
        Drawable drawableP1 = p1();
        if (drawableP1 != drawable) {
            float fO0 = O0();
            this.X = drawable != null ? f0.a.r(drawable).mutate() : null;
            t3();
            float fO1 = O0();
            r3(drawableP1);
            if (q3()) {
                I0(this.X);
            }
            invalidateSelf();
            if (fO0 != fO1) {
                U1();
            }
        }
    }

    public float D1() {
        return this.f19854j0;
    }

    public void D2(CharSequence charSequence) {
        if (this.f19846b0 != charSequence) {
            this.f19846b0 = l0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList E1() {
        return this.P;
    }

    public void E2(float f10) {
        if (this.f19859o0 != f10) {
            this.f19859o0 = f10;
            invalidateSelf();
            if (q3()) {
                U1();
            }
        }
    }

    public h F1() {
        return this.f19851g0;
    }

    public void F2(int i10) {
        E2(this.f19861q0.getResources().getDimension(i10));
    }

    public CharSequence G1() {
        return this.Q;
    }

    public void G2(int i10) {
        C2(i.a.b(this.f19861q0, i10));
    }

    public d H1() {
        return this.f19868x0.e();
    }

    public void H2(float f10) {
        if (this.f19845a0 != f10) {
            this.f19845a0 = f10;
            invalidateSelf();
            if (q3()) {
                U1();
            }
        }
    }

    public float I1() {
        return this.f19857m0;
    }

    public void I2(int i10) {
        H2(this.f19861q0.getResources().getDimension(i10));
    }

    public float J1() {
        return this.f19856l0;
    }

    public void J2(float f10) {
        if (this.f19858n0 != f10) {
            this.f19858n0 = f10;
            invalidateSelf();
            if (q3()) {
                U1();
            }
        }
    }

    float K0() {
        if (p3() || o3()) {
            return this.f19854j0 + y1() + this.f19855k0;
        }
        return 0.0f;
    }

    public void K2(int i10) {
        J2(this.f19861q0.getResources().getDimension(i10));
    }

    public boolean L1() {
        return this.M0;
    }

    public boolean L2(int[] iArr) {
        if (Arrays.equals(this.L0, iArr)) {
            return false;
        }
        this.L0 = iArr;
        if (q3()) {
            return V1(getState(), iArr);
        }
        return false;
    }

    public void M2(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (q3()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public boolean N1() {
        return this.f19847c0;
    }

    public void N2(int i10) {
        M2(i.a.a(this.f19861q0, i10));
    }

    float O0() {
        if (q3()) {
            return this.f19858n0 + this.f19845a0 + this.f19859o0;
        }
        return 0.0f;
    }

    public boolean O1() {
        return R1(this.X);
    }

    public void O2(boolean z10) {
        if (this.W != z10) {
            boolean zQ3 = q3();
            this.W = z10;
            boolean zQ4 = q3();
            if (zQ3 != zQ4) {
                if (zQ4) {
                    I0(this.X);
                } else {
                    r3(this.X);
                }
                invalidateSelf();
                U1();
            }
        }
    }

    public boolean P1() {
        return this.W;
    }

    public void P2(InterfaceC0306a interfaceC0306a) {
        this.O0 = new WeakReference(interfaceC0306a);
    }

    public void Q2(TextUtils.TruncateAt truncateAt) {
        this.P0 = truncateAt;
    }

    Paint.Align R0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Q != null) {
            float fK0 = this.f19853i0 + K0() + this.f19856l0;
            if (f0.a.f(this) == 0) {
                pointF.x = rect.left + fK0;
            } else {
                pointF.x = rect.right - fK0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - Q0();
        }
        return align;
    }

    public void R2(String str) {
        d dVarH1 = H1();
        if (dVarH1 == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        dVarH1.o(str);
    }

    public void S2(h hVar) {
        this.f19852h0 = hVar;
    }

    public void T2(int i10) {
        S2(h.d(this.f19861q0, i10));
    }

    protected void U1() {
        InterfaceC0306a interfaceC0306a = (InterfaceC0306a) this.O0.get();
        if (interfaceC0306a != null) {
            interfaceC0306a.a();
        }
    }

    public void U2(float f10) {
        if (this.f19855k0 != f10) {
            float fK0 = K0();
            this.f19855k0 = f10;
            float fK1 = K0();
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    public void V2(int i10) {
        U2(this.f19861q0.getResources().getDimension(i10));
    }

    boolean W1(boolean z10) {
        if (this.X != null) {
            return L2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : T0);
        }
        return false;
    }

    public void W2(float f10) {
        if (this.f19854j0 != f10) {
            float fK0 = K0();
            this.f19854j0 = f10;
            float fK1 = K0();
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    public void X1(boolean z10) {
        if (this.f19847c0 != z10) {
            this.f19847c0 = z10;
            float fK0 = K0();
            if (!z10 && this.E0) {
                this.E0 = false;
            }
            float fK1 = K0();
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    public void X2(int i10) {
        W2(this.f19861q0.getResources().getDimension(i10));
    }

    public void Y1(int i10) {
        X1(this.f19861q0.getResources().getBoolean(i10));
    }

    public void Y2(int i10) {
        this.R0 = i10;
    }

    public void Z1(Drawable drawable) {
        if (this.f19849e0 != drawable) {
            float fK0 = K0();
            this.f19849e0 = drawable;
            float fK1 = K0();
            r3(this.f19849e0);
            I0(this.f19849e0);
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    public void Z2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            s3();
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.w.b
    public void a() {
        U1();
        invalidateSelf();
    }

    public void a2(int i10) {
        Z1(i.a.b(this.f19861q0, i10));
    }

    public void a3(int i10) {
        Z2(i.a.a(this.f19861q0, i10));
    }

    public void b2(ColorStateList colorStateList) {
        if (this.f19850f0 != colorStateList) {
            this.f19850f0 = colorStateList;
            if (S0()) {
                this.f19849e0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    void b3(boolean z10) {
        this.Q0 = z10;
    }

    public void c2(int i10) {
        b2(i.a.a(this.f19861q0, i10));
    }

    public void c3(h hVar) {
        this.f19851g0 = hVar;
    }

    public Drawable d1() {
        return this.f19849e0;
    }

    public void d2(int i10) {
        e2(this.f19861q0.getResources().getBoolean(i10));
    }

    public void d3(int i10) {
        c3(h.d(this.f19861q0, i10));
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.G0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = xb.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        Y0(canvas2, bounds);
        V0(canvas2, bounds);
        if (this.S0) {
            super.draw(canvas2);
        }
        X0(canvas2, bounds);
        a1(canvas2, bounds);
        W0(canvas2, bounds);
        U0(canvas2, bounds);
        if (this.Q0) {
            c1(canvas2, bounds);
        }
        Z0(canvas2, bounds);
        b1(canvas2, bounds);
        if (this.G0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public ColorStateList e1() {
        return this.f19850f0;
    }

    public void e2(boolean z10) {
        if (this.f19848d0 != z10) {
            boolean zO3 = o3();
            this.f19848d0 = z10;
            boolean zO4 = o3();
            if (zO3 != zO4) {
                if (zO4) {
                    I0(this.f19849e0);
                } else {
                    r3(this.f19849e0);
                }
                invalidateSelf();
                U1();
            }
        }
    }

    public void e3(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Q, charSequence)) {
            return;
        }
        this.Q = charSequence;
        this.f19868x0.m(true);
        invalidateSelf();
        U1();
    }

    public ColorStateList f1() {
        return this.K;
    }

    public void f2(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            onStateChange(getState());
        }
    }

    public void f3(d dVar) {
        this.f19868x0.k(dVar, this.f19861q0);
    }

    public float g1() {
        return this.S0 ? R() : this.M;
    }

    public void g2(int i10) {
        f2(i.a.a(this.f19861q0, i10));
    }

    public void g3(int i10) {
        f3(new d(this.f19861q0, i10));
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f19853i0 + K0() + this.f19856l0 + this.f19868x0.h(G1().toString()) + this.f19857m0 + O0() + this.f19860p0), this.R0);
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f19860p0;
    }

    public void h2(float f10) {
        if (this.M != f10) {
            this.M = f10;
            setShapeAppearanceModel(M().a(f10));
        }
    }

    public void h3(float f10) {
        if (this.f19857m0 != f10) {
            this.f19857m0 = f10;
            invalidateSelf();
            U1();
        }
    }

    public Drawable i1() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return f0.a.q(drawable);
        }
        return null;
    }

    public void i2(int i10) {
        h2(this.f19861q0.getResources().getDimension(i10));
    }

    public void i3(int i10) {
        h3(this.f19861q0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (Q1(this.J) || Q1(this.K) || Q1(this.N)) {
            return true;
        }
        return (this.M0 && Q1(this.N0)) || S1(this.f19868x0.e()) || S0() || R1(this.S) || R1(this.f19849e0) || Q1(this.J0);
    }

    public float j1() {
        return this.U;
    }

    public void j2(float f10) {
        if (this.f19860p0 != f10) {
            this.f19860p0 = f10;
            invalidateSelf();
            U1();
        }
    }

    public void j3(float f10) {
        d dVarH1 = H1();
        if (dVarH1 != null) {
            dVarH1.q(f10);
            this.f19868x0.g().setTextSize(f10);
            a();
        }
    }

    public ColorStateList k1() {
        return this.T;
    }

    public void k2(int i10) {
        j2(this.f19861q0.getResources().getDimension(i10));
    }

    public void k3(float f10) {
        if (this.f19856l0 != f10) {
            this.f19856l0 = f10;
            invalidateSelf();
            U1();
        }
    }

    public float l1() {
        return this.L;
    }

    public void l2(Drawable drawable) {
        Drawable drawableI1 = i1();
        if (drawableI1 != drawable) {
            float fK0 = K0();
            this.S = drawable != null ? f0.a.r(drawable).mutate() : null;
            float fK1 = K0();
            r3(drawableI1);
            if (p3()) {
                I0(this.S);
            }
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    public void l3(int i10) {
        k3(this.f19861q0.getResources().getDimension(i10));
    }

    public float m1() {
        return this.f19853i0;
    }

    public void m2(int i10) {
        l2(i.a.b(this.f19861q0, i10));
    }

    public void m3(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            s3();
            onStateChange(getState());
        }
    }

    public ColorStateList n1() {
        return this.N;
    }

    public void n2(float f10) {
        if (this.U != f10) {
            float fK0 = K0();
            this.U = f10;
            float fK1 = K0();
            invalidateSelf();
            if (fK0 != fK1) {
                U1();
            }
        }
    }

    boolean n3() {
        return this.Q0;
    }

    public float o1() {
        return this.O;
    }

    public void o2(int i10) {
        n2(this.f19861q0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (p3()) {
            zOnLayoutDirectionChanged |= f0.a.m(this.S, i10);
        }
        if (o3()) {
            zOnLayoutDirectionChanged |= f0.a.m(this.f19849e0, i10);
        }
        if (q3()) {
            zOnLayoutDirectionChanged |= f0.a.m(this.X, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (p3()) {
            zOnLevelChange |= this.S.setLevel(i10);
        }
        if (o3()) {
            zOnLevelChange |= this.f19849e0.setLevel(i10);
        }
        if (q3()) {
            zOnLevelChange |= this.X.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // mc.i, android.graphics.drawable.Drawable, com.google.android.material.internal.w.b
    public boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return V1(iArr, u1());
    }

    public Drawable p1() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return f0.a.q(drawable);
        }
        return null;
    }

    public void p2(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (p3()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public CharSequence q1() {
        return this.f19846b0;
    }

    public void q2(int i10) {
        p2(i.a.a(this.f19861q0, i10));
    }

    public float r1() {
        return this.f19859o0;
    }

    public void r2(int i10) {
        s2(this.f19861q0.getResources().getBoolean(i10));
    }

    public float s1() {
        return this.f19845a0;
    }

    public void s2(boolean z10) {
        if (this.R != z10) {
            boolean zP3 = p3();
            this.R = z10;
            boolean zP4 = p3();
            if (zP3 != zP4) {
                if (zP4) {
                    I0(this.S);
                } else {
                    r3(this.S);
                }
                invalidateSelf();
                U1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            invalidateSelf();
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.H0 != colorFilter) {
            this.H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            this.I0 = com.google.android.material.drawable.c.o(this, this.J0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (p3()) {
            visible |= this.S.setVisible(z10, z11);
        }
        if (o3()) {
            visible |= this.f19849e0.setVisible(z10, z11);
        }
        if (q3()) {
            visible |= this.X.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.f19858n0;
    }

    public void t2(float f10) {
        if (this.L != f10) {
            this.L = f10;
            invalidateSelf();
            U1();
        }
    }

    public int[] u1() {
        return this.L0;
    }

    public void u2(int i10) {
        t2(this.f19861q0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public ColorStateList v1() {
        return this.Z;
    }

    public void v2(float f10) {
        if (this.f19853i0 != f10) {
            this.f19853i0 = f10;
            invalidateSelf();
            U1();
        }
    }

    public void w1(RectF rectF) {
        N0(getBounds(), rectF);
    }

    public void w2(int i10) {
        v2(this.f19861q0.getResources().getDimension(i10));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.S0) {
                y0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void y2(int i10) {
        x2(i.a.a(this.f19861q0, i10));
    }

    public TextUtils.TruncateAt z1() {
        return this.P0;
    }

    public void z2(float f10) {
        if (this.O != f10) {
            this.O = f10;
            this.f19862r0.setStrokeWidth(f10);
            if (this.S0) {
                super.A0(f10);
            }
            invalidateSelf();
        }
    }
}
