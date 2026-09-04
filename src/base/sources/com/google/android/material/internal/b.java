package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private jc.a E;
    private jc.a F;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private final TextPaint V;
    private TimeInterpolator W;
    private TimeInterpolator X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20308a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f20309a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20310b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f20311b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20312c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f20313c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20314d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f20315d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20316e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f20317e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20318f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f20319f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f20320g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f20321g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f20322h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f20323h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f20324i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f20325i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f20326j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f20327j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f20329k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f20331l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f20333m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f20335n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f20336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f20338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f20342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f20344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f20346t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private v f20347t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f20348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f20350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f20352w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f20353w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f20354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f20355y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f20356z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20328k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20330l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f20332m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f20334n = 15.0f;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private boolean K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f20337o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f20339p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f20341q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f20343r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f20345s0 = StaticLayoutBuilderCompat.f20284o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f20349u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f20351v0 = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements jc.a.InterfaceC0641a {
        a() {
        }

        @Override // jc.a.InterfaceC0641a
        public void a(Typeface typeface) {
            b.this.o0(typeface);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0311b implements jc.a.InterfaceC0641a {
        C0311b() {
        }

        @Override // jc.a.InterfaceC0641a
        public void a(Typeface typeface) {
            b.this.B0(typeface);
        }
    }

    public b(View view) {
        this.f20308a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f20322h = new Rect();
        this.f20320g = new Rect();
        this.f20326j = new RectF();
        this.f20316e = e();
        Z(view.getContext().getResources().getConfiguration());
    }

    private boolean C0(Typeface typeface) {
        jc.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = jc.h.b(this.f20308a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    private void H0(float f10) {
        h(f10);
        this.f20308a.postInvalidateOnAnimation();
    }

    private Layout.Alignment N() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f20328k, this.J ? 1 : 0) & 7;
        if (absoluteGravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (absoluteGravity != 5) {
            return this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f20334n);
        textPaint.setTypeface(this.f20354x);
        textPaint.setLetterSpacing(this.f20321g0);
    }

    private void R(TextPaint textPaint) {
        textPaint.setTextSize(this.f20332m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f20323h0);
    }

    private boolean S0() {
        if (this.f20337o0 > 1 || this.f20339p0 > 1) {
            return !this.J || this.f20312c;
        }
        return false;
    }

    private void T(float f10) {
        if (this.f20312c) {
            this.f20326j.set(f10 < this.f20316e ? this.f20320g : this.f20322h);
            return;
        }
        this.f20326j.left = Y(this.f20320g.left, this.f20322h.left, f10, this.W);
        this.f20326j.top = Y(this.f20342r, this.f20344s, f10, this.W);
        this.f20326j.right = Y(this.f20320g.right, this.f20322h.right, f10, this.W);
        this.f20326j.bottom = Y(this.f20320g.bottom, this.f20322h.bottom, f10, this.W);
    }

    private boolean T0() {
        return this.f20339p0 == 1;
    }

    private static boolean U(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean V() {
        return this.f20308a.getLayoutDirection() == 1;
    }

    private boolean X(CharSequence charSequence, boolean z10) {
        return (z10 ? l0.e.f43721d : l0.e.f43720c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float Y(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return tb.b.a(f10, f11, f12);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private float a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void b(boolean z10) {
        float fA0;
        i(1.0f, z10);
        if (this.I != null && this.f20327j0 != null) {
            this.f20335n0 = T0() ? TextUtils.ellipsize(this.I, this.U, this.f20327j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.f20335n0;
        if (charSequence != null) {
            this.f20329k0 = a0(this.U, charSequence);
        } else {
            this.f20329k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f20330l, this.J ? 1 : 0);
        Rect rect = this.f20324i;
        if (rect == null) {
            rect = this.f20322h;
        }
        int i10 = absoluteGravity & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i10 == 48) {
            this.f20344s = rect.top;
        } else if (i10 != 80) {
            this.f20344s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.f20344s = rect.bottom + this.U.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f20348u = rect.centerX() - (this.f20329k0 / 2.0f);
        } else if (i11 != 5) {
            this.f20348u = rect.left;
        } else {
            this.f20348u = rect.right - this.f20329k0;
        }
        if (this.f20329k0 <= this.f20322h.width()) {
            float f10 = this.f20348u;
            float fMax = f10 + Math.max(0.0f, this.f20322h.left - f10);
            this.f20348u = fMax;
            this.f20348u = fMax + Math.min(0.0f, this.f20322h.right - (this.f20329k0 + fMax));
        }
        if (m() <= this.f20322h.height()) {
            float f11 = this.f20344s;
            float fMax2 = f11 + Math.max(0.0f, this.f20322h.top - f11);
            this.f20344s = fMax2;
            this.f20344s = fMax2 + Math.min(0.0f, this.f20322h.bottom - (r() + fMax2));
        }
        i(0.0f, z10);
        StaticLayout staticLayout = this.f20327j0;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f20327j0;
        if (staticLayout2 == null || this.f20337o0 <= 1) {
            CharSequence charSequence2 = this.I;
            fA0 = charSequence2 != null ? a0(this.U, charSequence2) : 0.0f;
        } else {
            fA0 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f20327j0;
        this.f20340q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f20328k, this.J ? 1 : 0);
        int i12 = absoluteGravity2 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i12 == 48) {
            this.f20342r = this.f20320g.top;
        } else if (i12 != 80) {
            this.f20342r = this.f20320g.centerY() - (height / 2.0f);
        } else {
            this.f20342r = (this.f20320g.bottom - height) + (this.f20353w0 ? this.U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f20346t = this.f20320g.centerX() - (fA0 / 2.0f);
        } else if (i13 != 5) {
            this.f20346t = this.f20320g.left;
        } else {
            this.f20346t = this.f20320g.right - fA0;
        }
        H0(this.f20310b);
    }

    private void c() {
        g(this.f20310b);
    }

    private float d(float f10) {
        float f11 = this.f20316e;
        return f10 <= f11 ? tb.b.b(1.0f, 0.0f, this.f20314d, f11, f10) : tb.b.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private static boolean d0(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private float e() {
        float f10 = this.f20314d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zV = V();
        return this.K ? X(charSequence, zV) : zV;
    }

    private void g(float f10) {
        float f11;
        T(f10);
        if (!this.f20312c) {
            this.f20350v = Y(this.f20346t, this.f20348u, f10, this.W);
            this.f20352w = Y(this.f20342r, this.f20344s, f10, this.W);
            H0(f10);
            float f12 = this.f20321g0;
            float f13 = this.f20323h0;
            if (f12 != f13) {
                this.U.setLetterSpacing(Y(f13, f12, f10, tb.b.f53276b));
            } else {
                this.U.setLetterSpacing(f12);
            }
            f11 = f10;
        } else if (f10 < this.f20316e) {
            this.f20350v = this.f20346t;
            this.f20352w = this.f20342r;
            H0(0.0f);
            f11 = 0.0f;
        } else {
            this.f20350v = this.f20348u;
            this.f20352w = this.f20344s - Math.max(0, this.f20318f);
            H0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = tb.b.f53276b;
        k0(1.0f - Y(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        x0(Y(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f20338p != this.f20336o) {
            this.U.setColor(a(y(), w(), f11));
        } else {
            this.U.setColor(w());
        }
        this.N = Y(this.f20313c0, this.Y, f10, null);
        this.O = Y(this.f20315d0, this.Z, f10, null);
        this.P = Y(this.f20317e0, this.f20309a0, f10, null);
        int iA = a(x(this.f20319f0), x(this.f20311b0), f10);
        this.Q = iA;
        this.U.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f20312c) {
            this.U.setAlpha((int) (d(f10) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, ac.a.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.f20308a.postInvalidateOnAnimation();
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f20322h.width();
        float fWidth2 = this.f20320g.width();
        if (U(f10, 1.0f)) {
            f11 = T0() ? this.f20334n : this.f20332m;
            f12 = T0() ? this.f20321g0 : this.f20323h0;
            this.L = T0() ? 1.0f : Y(this.f20332m, this.f20334n, f10, this.X) / this.f20332m;
            if (!T0()) {
                fWidth = fWidth2;
            }
            typeface = this.f20354x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f20332m;
            float f14 = this.f20323h0;
            typeface = this.A;
            if (U(f10, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = Y(this.f20332m, this.f20334n, f10, this.X) / this.f20332m;
            }
            float f15 = this.f20334n / this.f20332m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f20312c && f16 > fWidth && T0()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f20337o0 : this.f20339p0;
        boolean z11 = false;
        if (fWidth2 > 0.0f) {
            boolean z12 = this.M != f11;
            boolean z13 = this.f20325i0 != f12;
            boolean z14 = this.D != typeface;
            StaticLayout staticLayout = this.f20327j0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || (this.R != i10) || this.T;
            this.M = f11;
            this.f20325i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i10;
            this.U.setLinearText(this.L != 1.0f);
            z11 = z15;
        }
        if (this.I == null || z11) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.f20325i0);
            this.J = f(this.H);
            StaticLayout staticLayoutJ = j(S0() ? i10 : 1, this.U, this.H, fWidth2 * (T0() ? 1.0f : this.L), this.J);
            this.f20327j0 = staticLayoutJ;
            this.I = staticLayoutJ.getText();
        }
    }

    private StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = StaticLayoutBuilderCompat.b(charSequence, textPaint, (int) f10).d(this.G).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : N()).f(false).i(i10).h(this.f20341q0, this.f20343r0).e(this.f20345s0).j(this.f20347t0).a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayoutA = null;
        }
        return (StaticLayout) m0.g.g(staticLayoutA);
    }

    private void k0(float f10) {
        this.f20331l0 = f10;
        this.f20308a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f10, float f11) {
        int alpha = this.U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f20312c) {
            this.U.setAlpha((int) (this.f20333m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, ac.a.a(this.Q, textPaint.getAlpha()));
            }
            this.f20327j0.draw(canvas);
        }
        if (!this.f20312c) {
            this.U.setAlpha((int) (this.f20331l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, ac.a.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f20327j0.getLineBaseline(0);
        CharSequence charSequence = this.f20335n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.U);
        if (i10 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.f20312c) {
            return;
        }
        String strTrim = this.f20335n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f20327j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.U);
    }

    private boolean p0(Typeface typeface) {
        jc.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f20356z == typeface) {
            return false;
        }
        this.f20356z = typeface;
        Typeface typefaceB = jc.h.b(this.f20308a.getContext().getResources().getConfiguration(), typeface);
        this.f20355y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f20356z;
        }
        this.f20354x = typefaceB;
        return true;
    }

    private float s(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f20329k0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.J ? this.f20322h.left : this.f20322h.right - this.f20329k0;
        }
        return this.J ? this.f20322h.right - this.f20329k0 : this.f20322h.left;
    }

    private float t(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f20329k0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.J ? rectF.left + this.f20329k0 : this.f20322h.right;
        }
        return this.J ? this.f20322h.right : rectF.left + this.f20329k0;
    }

    private int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void x0(float f10) {
        this.f20333m0 = f10;
        this.f20308a.postInvalidateOnAnimation();
    }

    private int y() {
        return x(this.f20336o);
    }

    public int A() {
        return this.f20337o0;
    }

    public void A0(float f10) {
        if (this.f20332m != f10) {
            this.f20332m = f10;
            b0();
        }
    }

    public float B() {
        R(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public void B0(Typeface typeface) {
        if (C0(typeface)) {
            b0();
        }
    }

    public int C() {
        return this.f20328k;
    }

    public float D() {
        int i10 = this.f20351v0;
        return i10 != -1 ? i10 : E();
    }

    public void D0(float f10) {
        float fA = h0.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f20310b) {
            this.f20310b = fA;
            c();
        }
    }

    public float E() {
        R(this.V);
        return -this.V.ascent();
    }

    public void E0(boolean z10) {
        this.f20312c = z10;
    }

    public float F() {
        return this.f20332m;
    }

    public void F0(float f10) {
        this.f20314d = f10;
        this.f20316e = e();
    }

    public Typeface G() {
        Typeface typeface = this.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void G0(int i10) {
        this.f20345s0 = i10;
    }

    public float H() {
        return this.f20310b;
    }

    public float I() {
        return this.f20316e;
    }

    public void I0(float f10) {
        this.f20341q0 = f10;
    }

    public int J() {
        return this.f20345s0;
    }

    public void J0(float f10) {
        this.f20343r0 = f10;
    }

    public int K() {
        StaticLayout staticLayout = this.f20327j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void K0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        b0();
    }

    public float L() {
        return this.f20327j0.getSpacingAdd();
    }

    public void L0(boolean z10) {
        this.K = z10;
    }

    public float M() {
        return this.f20327j0.getSpacingMultiplier();
    }

    public final boolean M0(int[] iArr) {
        this.S = iArr;
        if (!W()) {
            return false;
        }
        b0();
        return true;
    }

    public void N0(v vVar) {
        if (this.f20347t0 != vVar) {
            this.f20347t0 = vVar;
            c0(true);
        }
    }

    public TimeInterpolator O() {
        return this.W;
    }

    public void O0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            b0();
        }
    }

    public CharSequence P() {
        return this.H;
    }

    public void P0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        b0();
    }

    public void Q0(TextUtils.TruncateAt truncateAt) {
        this.G = truncateAt;
        b0();
    }

    public void R0(Typeface typeface) {
        boolean zP0 = p0(typeface);
        boolean zC0 = C0(typeface);
        if (zP0 || zC0) {
            b0();
        }
    }

    public TextUtils.TruncateAt S() {
        return this.G;
    }

    public void U0(int i10) {
        Q(this.V);
        float f10 = i10;
        this.f20349u0 = j(this.f20339p0, this.V, this.H, f10 * (this.f20334n / this.f20332m), this.J).getHeight();
        R(this.V);
        this.f20351v0 = j(this.f20337o0, this.V, this.H, f10, this.J).getHeight();
    }

    public final boolean W() {
        ColorStateList colorStateList = this.f20338p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f20336o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void Z(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f20356z;
            if (typeface != null) {
                this.f20355y = jc.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = jc.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f20355y;
            if (typeface3 == null) {
                typeface3 = this.f20356z;
            }
            this.f20354x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            c0(true);
        }
    }

    public void b0() {
        c0(false);
    }

    public void c0(boolean z10) {
        if ((this.f20308a.getHeight() <= 0 || this.f20308a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void e0(ColorStateList colorStateList) {
        if (this.f20338p == colorStateList && this.f20336o == colorStateList) {
            return;
        }
        this.f20338p = colorStateList;
        this.f20336o = colorStateList;
        b0();
    }

    public void f0(int i10, int i11, int i12, int i13) {
        if (d0(this.f20322h, i10, i11, i12, i13)) {
            return;
        }
        this.f20322h.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void g0(Rect rect) {
        f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void h0(int i10, int i11, int i12, int i13) {
        if (this.f20324i == null) {
            this.f20324i = new Rect(i10, i11, i12, i13);
            this.T = true;
        }
        if (d0(this.f20324i, i10, i11, i12, i13)) {
            return;
        }
        this.f20324i.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void i0(int i10) {
        if (i10 != this.f20339p0) {
            this.f20339p0 = i10;
            b0();
        }
    }

    public void j0(int i10) {
        jc.d dVar = new jc.d(this.f20308a.getContext(), i10);
        if (dVar.k() != null) {
            this.f20338p = dVar.k();
        }
        if (dVar.l() != 0.0f) {
            this.f20334n = dVar.l();
        }
        ColorStateList colorStateList = dVar.f42217c;
        if (colorStateList != null) {
            this.f20311b0 = colorStateList;
        }
        this.Z = dVar.f42223i;
        this.f20309a0 = dVar.f42224j;
        this.Y = dVar.f42225k;
        this.f20321g0 = dVar.f42227m;
        jc.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new jc.a(new a(), dVar.e());
        dVar.h(this.f20308a.getContext(), this.F);
        b0();
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I == null || this.f20326j.width() <= 0.0f || this.f20326j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f10 = this.f20350v;
        float f11 = this.f20352w;
        float f12 = this.L;
        if (f12 != 1.0f && !this.f20312c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (S0() && T0() && (!this.f20312c || this.f20310b > this.f20316e)) {
            l(canvas, this.f20350v - this.f20327j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f20327j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(ColorStateList colorStateList) {
        if (this.f20338p != colorStateList) {
            this.f20338p = colorStateList;
            b0();
        }
    }

    public float m() {
        Q(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public void m0(int i10) {
        if (this.f20330l != i10) {
            this.f20330l = i10;
            b0();
        }
    }

    public float n() {
        Q(this.V);
        return -this.V.ascent();
    }

    public void n0(float f10) {
        if (this.f20334n != f10) {
            this.f20334n = f10;
            b0();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.J = f(this.H);
        rectF.left = Math.max(s(i10, i11), this.f20322h.left);
        rectF.top = this.f20322h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f20322h.right);
        rectF.bottom = this.f20322h.top + r();
        if (this.f20327j0 == null || T0()) {
            return;
        }
        StaticLayout staticLayout = this.f20327j0;
        float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.f20334n / this.f20332m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(Typeface typeface) {
        if (p0(typeface)) {
            b0();
        }
    }

    public ColorStateList p() {
        return this.f20338p;
    }

    public int q() {
        return this.f20330l;
    }

    public void q0(int i10) {
        this.f20318f = i10;
    }

    public float r() {
        int i10 = this.f20349u0;
        return i10 != -1 ? i10 : n();
    }

    public void r0(int i10, int i11, int i12, int i13) {
        s0(i10, i11, i12, i13, true);
    }

    public void s0(int i10, int i11, int i12, int i13, boolean z10) {
        if (d0(this.f20320g, i10, i11, i12, i13) && z10 == this.f20353w0) {
            return;
        }
        this.f20320g.set(i10, i11, i12, i13);
        this.T = true;
        this.f20353w0 = z10;
    }

    public void t0(Rect rect) {
        r0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float u() {
        return this.f20334n;
    }

    public void u0(float f10) {
        if (this.f20323h0 != f10) {
            this.f20323h0 = f10;
            b0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f20354x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(int i10) {
        if (i10 != this.f20337o0) {
            this.f20337o0 = i10;
            b0();
        }
    }

    public int w() {
        return x(this.f20338p);
    }

    public void w0(int i10) {
        jc.d dVar = new jc.d(this.f20308a.getContext(), i10);
        if (dVar.k() != null) {
            this.f20336o = dVar.k();
        }
        if (dVar.l() != 0.0f) {
            this.f20332m = dVar.l();
        }
        ColorStateList colorStateList = dVar.f42217c;
        if (colorStateList != null) {
            this.f20319f0 = colorStateList;
        }
        this.f20315d0 = dVar.f42223i;
        this.f20317e0 = dVar.f42224j;
        this.f20313c0 = dVar.f42225k;
        this.f20323h0 = dVar.f42227m;
        jc.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new jc.a(new C0311b(), dVar.e());
        dVar.h(this.f20308a.getContext(), this.E);
        b0();
    }

    public void y0(ColorStateList colorStateList) {
        if (this.f20336o != colorStateList) {
            this.f20336o = colorStateList;
            b0();
        }
    }

    public int z() {
        return this.f20340q;
    }

    public void z0(int i10) {
        if (this.f20328k != i10) {
            this.f20328k = i10;
            b0();
        }
    }
}
