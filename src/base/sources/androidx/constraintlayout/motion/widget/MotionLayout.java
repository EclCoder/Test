package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements z {

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static boolean f2054d1;
    Interpolator A;
    protected boolean A0;
    Interpolator B;
    int B0;
    float C;
    int C0;
    private int D;
    int D0;
    int E;
    int E0;
    private int F;
    int F0;
    private int G;
    int G0;
    private int H;
    float H0;
    private boolean I;
    private v.d I0;
    HashMap J;
    private boolean J0;
    private long K;
    private h K0;
    private float L;
    private Runnable L0;
    float M;
    private int[] M0;
    float N;
    int N0;
    private long O;
    private boolean O0;
    float P;
    int P0;
    private boolean Q;
    HashMap Q0;
    boolean R;
    private int R0;
    boolean S;
    private int S0;
    private i T;
    private int T0;
    private float U;
    Rect U0;
    private float V;
    private boolean V0;
    int W;
    j W0;
    e X0;
    private boolean Y0;
    private RectF Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    d f2055a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private View f2056a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f2057b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private Matrix f2058b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private z.b f2059c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    ArrayList f2060c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private c f2061d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f2062e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f2063f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f2064g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f2065h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f2066i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f2067j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f2068k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    float f2069l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    float f2070m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    long f2071n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f2072o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f2073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ArrayList f2074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private ArrayList f2075r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ArrayList f2076s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private CopyOnWriteArrayList f2077t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f2078u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f2079v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private float f2080w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f2081x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f2082y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    p f2083z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    boolean f2084z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2085a;

        a(View view) {
            this.f2085a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2085a.setNestedScrollingEnabled(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.K0.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f2088a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f2089b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f2090c;

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.n
        public float a() {
            return MotionLayout.this.C;
        }

        public void b(float f10, float f11, float f12) {
            this.f2088a = f10;
            this.f2089b = f11;
            this.f2090c = f12;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13 = this.f2088a;
            if (f13 > 0.0f) {
                float f14 = this.f2090c;
                if (f13 / f14 < f10) {
                    f10 = f13 / f14;
                }
                MotionLayout.this.C = f13 - (f14 * f10);
                f11 = (f13 * f10) - (((f14 * f10) * f10) / 2.0f);
                f12 = this.f2089b;
            } else {
                float f15 = this.f2090c;
                if ((-f13) / f15 < f10) {
                    f10 = (-f13) / f15;
                }
                MotionLayout.this.C = (f15 * f10) + f13;
                f11 = (f13 * f10) + (((f15 * f10) * f10) / 2.0f);
                f12 = this.f2089b;
            }
            return f11 + f12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f2092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f2093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float[] f2094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f2095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f2096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Paint f2097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Paint f2098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Paint f2099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Paint f2100i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float[] f2101j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        DashPathEffect f2107p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2108q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2111t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int f2102k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final int f2103l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final int f2104m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f2105n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f2106o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Rect f2109r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f2110s = false;

        d() {
            this.f2111t = 1;
            Paint paint = new Paint();
            this.f2096e = paint;
            paint.setAntiAlias(true);
            this.f2096e.setColor(-21965);
            this.f2096e.setStrokeWidth(2.0f);
            Paint paint2 = this.f2096e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f2097f = paint3;
            paint3.setAntiAlias(true);
            this.f2097f.setColor(-2067046);
            this.f2097f.setStrokeWidth(2.0f);
            this.f2097f.setStyle(style);
            Paint paint4 = new Paint();
            this.f2098g = paint4;
            paint4.setAntiAlias(true);
            this.f2098g.setColor(-13391360);
            this.f2098g.setStrokeWidth(2.0f);
            this.f2098g.setStyle(style);
            Paint paint5 = new Paint();
            this.f2099h = paint5;
            paint5.setAntiAlias(true);
            this.f2099h.setColor(-13391360);
            this.f2099h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2101j = new float[8];
            Paint paint6 = new Paint();
            this.f2100i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f2107p = dashPathEffect;
            this.f2098g.setPathEffect(dashPathEffect);
            this.f2094c = new float[100];
            this.f2093b = new int[50];
            if (this.f2110s) {
                this.f2096e.setStrokeWidth(8.0f);
                this.f2100i.setStrokeWidth(8.0f);
                this.f2097f.setStrokeWidth(8.0f);
                this.f2111t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f2092a, this.f2096e);
        }

        private void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f2108q; i10++) {
                int i11 = this.f2093b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f2092a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f2098g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f2098g);
        }

        private void f(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f2092a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            l(str, this.f2099h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f2109r.width() / 2)) + fMin, f11 - 20.0f, this.f2099h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f2098g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            l(str2, this.f2099h);
            canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f2109r.height() / 2)), this.f2099h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f2098g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f2092a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2098g);
        }

        private void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f2092a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            l(str, this.f2099h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f2109r.width() / 2), -20.0f, this.f2099h);
            canvas.drawLine(f10, f11, f19, f20, this.f2098g);
        }

        private void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            String str = "" + (((int) (((double) (((f10 - (i10 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i10))) + 0.5d)) / 100.0f);
            l(str, this.f2099h);
            canvas.drawText(str, ((f10 / 2.0f) - (this.f2109r.width() / 2)) + 0.0f, f11 - 20.0f, this.f2099h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f2098g);
            String str2 = "" + (((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i11))) + 0.5d)) / 100.0f);
            l(str2, this.f2099h);
            canvas.drawText(str2, 5.0f + f10, 0.0f - ((f11 / 2.0f) - (this.f2109r.height() / 2)), this.f2099h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f2098g);
        }

        private void j(Canvas canvas, m mVar) {
            this.f2095d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                mVar.e(i10 / 50, this.f2101j, 0);
                Path path = this.f2095d;
                float[] fArr = this.f2101j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2095d;
                float[] fArr2 = this.f2101j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2095d;
                float[] fArr3 = this.f2101j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2095d;
                float[] fArr4 = this.f2101j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2095d.close();
            }
            this.f2096e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2095d, this.f2096e);
            canvas.translate(-2.0f, -2.0f);
            this.f2096e.setColor(-65536);
            canvas.drawPath(this.f2095d, this.f2096e);
        }

        private void k(Canvas canvas, int i10, int i11, m mVar) {
            int width;
            int height;
            View view = mVar.f2271b;
            if (view != null) {
                width = view.getWidth();
                height = mVar.f2271b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i12 = 1; i12 < i11 - 1; i12++) {
                if (i10 != 4 || this.f2093b[i12 - 1] != 0) {
                    float[] fArr = this.f2094c;
                    int i13 = i12 * 2;
                    float f10 = fArr[i13];
                    float f11 = fArr[i13 + 1];
                    this.f2095d.reset();
                    this.f2095d.moveTo(f10, f11 + 10.0f);
                    this.f2095d.lineTo(f10 + 10.0f, f11);
                    this.f2095d.lineTo(f10, f11 - 10.0f);
                    this.f2095d.lineTo(f10 - 10.0f, f11);
                    this.f2095d.close();
                    int i14 = i12 - 1;
                    mVar.q(i14);
                    if (i10 == 4) {
                        int i15 = this.f2093b[i14];
                        if (i15 == 1) {
                            h(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 0) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 2) {
                            i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f2095d, this.f2100i);
                    }
                    if (i10 == 2) {
                        h(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 3) {
                        f(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f2095d, this.f2100i);
                }
            }
            float[] fArr2 = this.f2092a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2097f);
                float[] fArr3 = this.f2092a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2097f);
            }
        }

        public void a(Canvas canvas, HashMap map, int i10, int i11) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.F) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f2099h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f2096e);
            }
            for (m mVar : map.values()) {
                int iM = mVar.m();
                if (i11 > 0 && iM == 0) {
                    iM = 1;
                }
                if (iM != 0) {
                    this.f2108q = mVar.c(this.f2094c, this.f2093b);
                    if (iM >= 1) {
                        int i12 = i10 / 16;
                        float[] fArr = this.f2092a;
                        if (fArr == null || fArr.length != i12 * 2) {
                            this.f2092a = new float[i12 * 2];
                            this.f2095d = new Path();
                        }
                        int i13 = this.f2111t;
                        canvas.translate(i13, i13);
                        this.f2096e.setColor(1996488704);
                        this.f2100i.setColor(1996488704);
                        this.f2097f.setColor(1996488704);
                        this.f2098g.setColor(1996488704);
                        mVar.d(this.f2092a, i12);
                        b(canvas, iM, this.f2108q, mVar);
                        this.f2096e.setColor(-21965);
                        this.f2097f.setColor(-2067046);
                        this.f2100i.setColor(-2067046);
                        this.f2098g.setColor(-13391360);
                        int i14 = this.f2111t;
                        canvas.translate(-i14, -i14);
                        b(canvas, iM, this.f2108q, mVar);
                        if (iM == 5) {
                            j(canvas, mVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i10, int i11, m mVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, mVar);
        }

        void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f2109r);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        x.f f2113a = new x.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x.f f2114b = new x.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.c f2115c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.c f2116d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2118f;

        e() {
        }

        private void b(int i10, int i11) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.E == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                x.f fVar = this.f2114b;
                androidx.constraintlayout.widget.c cVar = this.f2116d;
                motionLayout2.x(fVar, optimizationLevel, (cVar == null || cVar.f2686e == 0) ? i10 : i11, (cVar == null || cVar.f2686e == 0) ? i11 : i10);
                androidx.constraintlayout.widget.c cVar2 = this.f2115c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    x.f fVar2 = this.f2113a;
                    int i12 = cVar2.f2686e;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout3.x(fVar2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.f2115c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                x.f fVar3 = this.f2113a;
                int i14 = cVar3.f2686e;
                motionLayout4.x(fVar3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            x.f fVar4 = this.f2114b;
            androidx.constraintlayout.widget.c cVar4 = this.f2116d;
            int i15 = (cVar4 == null || cVar4.f2686e == 0) ? i10 : i11;
            if (cVar4 == null || cVar4.f2686e == 0) {
                i10 = i11;
            }
            motionLayout5.x(fVar4, optimizationLevel, i15, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void j(x.f fVar, androidx.constraintlayout.widget.c cVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.a aVar = new Constraints.a(-2, -2);
            sparseArray.clear();
            int i10 = 0;
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            if (cVar != null && cVar.f2686e != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.x(this.f2114b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            ArrayList arrayListW1 = fVar.w1();
            int size = arrayListW1.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListW1.get(i11);
                i11++;
                x.e eVar = (x.e) obj;
                eVar.E0(true);
                sparseArray.put(((View) eVar.u()).getId(), eVar);
            }
            ArrayList arrayListW2 = fVar.w1();
            int size2 = arrayListW2.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i12 + 1;
                x.e eVar2 = (x.e) arrayListW2.get(i12);
                View view = (View) eVar2.u();
                cVar.l(view.getId(), aVar);
                eVar2.p1(cVar.B(view.getId()));
                eVar2.Q0(cVar.w(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.j((ConstraintHelper) view, eVar2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).w();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.e(false, view, eVar2, aVar, sparseArray);
                if (cVar.A(view.getId()) == 1) {
                    eVar2.o1(view.getVisibility());
                } else {
                    eVar2.o1(cVar.z(view.getId()));
                }
                i12 = i13;
            }
            ArrayList arrayListW3 = fVar.w1();
            int size3 = arrayListW3.size();
            while (i10 < size3) {
                Object obj2 = arrayListW3.get(i10);
                i10++;
                x.e eVar3 = (x.e) obj2;
                if (eVar3 instanceof x.m) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) eVar3.u();
                    x.i iVar = (x.i) eVar3;
                    constraintHelper.v(fVar, iVar, sparseArray);
                    ((x.m) iVar).z1();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:29:0x0102  */
        /* JADX WARN: Code duplicated, block: B:40:0x0130 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0130 A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x0102, please report this as an issue */
        public void a() {
            x.e eVarD;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.J.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = MotionLayout.this.getChildAt(i10);
                m mVar = new m(childAt);
                int id2 = childAt.getId();
                iArr[i10] = id2;
                sparseArray.put(id2, mVar);
                MotionLayout.this.J.put(childAt, mVar);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = MotionLayout.this.getChildAt(i11);
                m mVar2 = (m) MotionLayout.this.J.get(childAt2);
                if (mVar2 != null) {
                    if (this.f2115c != null) {
                        x.e eVarD2 = d(this.f2113a, childAt2);
                        if (eVarD2 != null) {
                            mVar2.F(MotionLayout.this.E0(eVarD2), this.f2115c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.W != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else {
                        if (MotionLayout.this.O0) {
                            android.support.v4.media.session.b.a(MotionLayout.this.Q0.get(childAt2));
                            MotionLayout motionLayout = MotionLayout.this;
                            mVar2.G(null, childAt2, motionLayout.P0, motionLayout.R0, MotionLayout.this.S0);
                        }
                        if (this.f2116d == null) {
                            eVarD = d(this.f2114b, childAt2);
                            if (eVarD != null) {
                                mVar2.C(MotionLayout.this.E0(eVarD), this.f2116d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.W != 0) {
                                Log.e("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    if (this.f2116d == null) {
                        eVarD = d(this.f2114b, childAt2);
                        if (eVarD != null) {
                            mVar2.C(MotionLayout.this.E0(eVarD), this.f2116d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.W != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                m mVar3 = (m) sparseArray.get(iArr[i12]);
                int iH = mVar3.h();
                if (iH != -1) {
                    mVar3.J((m) sparseArray.get(iH));
                }
            }
        }

        void c(x.f fVar, x.f fVar2) {
            x.e jVar;
            ArrayList arrayListW1 = fVar.w1();
            HashMap map = new HashMap();
            map.put(fVar, fVar2);
            fVar2.w1().clear();
            fVar2.n(fVar, map);
            int size = arrayListW1.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListW1.get(i11);
                i11++;
                x.e eVar = (x.e) obj;
                if (eVar instanceof x.a) {
                    jVar = new x.a();
                } else if (eVar instanceof x.h) {
                    jVar = new x.h();
                } else if (eVar instanceof x.g) {
                    jVar = new x.g();
                } else if (eVar instanceof x.l) {
                    jVar = new x.l();
                } else {
                    jVar = eVar instanceof x.i ? new x.j() : new x.e();
                }
                fVar2.b(jVar);
                map.put(eVar, jVar);
            }
            int size2 = arrayListW1.size();
            while (i10 < size2) {
                Object obj2 = arrayListW1.get(i10);
                i10++;
                x.e eVar2 = (x.e) obj2;
                ((x.e) map.get(eVar2)).n(eVar2, map);
            }
        }

        x.e d(x.f fVar, View view) {
            if (fVar.u() == view) {
                return fVar;
            }
            ArrayList arrayListW1 = fVar.w1();
            int size = arrayListW1.size();
            for (int i10 = 0; i10 < size; i10++) {
                x.e eVar = (x.e) arrayListW1.get(i10);
                if (eVar.u() == view) {
                    return eVar;
                }
            }
            return null;
        }

        void e(x.f fVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.f2115c = cVar;
            this.f2116d = cVar2;
            this.f2113a = new x.f();
            this.f2114b = new x.f();
            this.f2113a.b2(((ConstraintLayout) MotionLayout.this).f2551c.O1());
            this.f2114b.b2(((ConstraintLayout) MotionLayout.this).f2551c.O1());
            this.f2113a.z1();
            this.f2114b.z1();
            c(((ConstraintLayout) MotionLayout.this).f2551c, this.f2113a);
            c(((ConstraintLayout) MotionLayout.this).f2551c, this.f2114b);
            if (MotionLayout.this.N > 0.5d) {
                if (cVar != null) {
                    j(this.f2113a, cVar);
                }
                j(this.f2114b, cVar2);
            } else {
                j(this.f2114b, cVar2);
                if (cVar != null) {
                    j(this.f2113a, cVar);
                }
            }
            this.f2113a.e2(MotionLayout.this.t());
            this.f2113a.g2();
            this.f2114b.e2(MotionLayout.this.t());
            this.f2114b.g2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    x.f fVar2 = this.f2113a;
                    x.e.b bVar = x.e.b.WRAP_CONTENT;
                    fVar2.U0(bVar);
                    this.f2114b.U0(bVar);
                }
                if (layoutParams.height == -2) {
                    x.f fVar3 = this.f2113a;
                    x.e.b bVar2 = x.e.b.WRAP_CONTENT;
                    fVar3.l1(bVar2);
                    this.f2114b.l1(bVar2);
                }
            }
        }

        public boolean f(int i10, int i11) {
            return (i10 == this.f2117e && i11 == this.f2118f) ? false : true;
        }

        public void g(int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.F0 = mode;
            motionLayout.G0 = mode2;
            b(i10, i11);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i10, i11);
                MotionLayout.this.B0 = this.f2113a.Y();
                MotionLayout.this.C0 = this.f2113a.z();
                MotionLayout.this.D0 = this.f2114b.Y();
                MotionLayout.this.E0 = this.f2114b.z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.A0 = (motionLayout2.B0 == motionLayout2.D0 && motionLayout2.C0 == motionLayout2.E0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i12 = motionLayout3.B0;
            int i13 = motionLayout3.C0;
            int i14 = motionLayout3.F0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i12 = (int) (i12 + (motionLayout3.H0 * (motionLayout3.D0 - i12)));
            }
            int i15 = i12;
            int i16 = motionLayout3.G0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i13 = (int) (i13 + (motionLayout3.H0 * (motionLayout3.E0 - i13)));
            }
            MotionLayout.this.w(i10, i11, i15, i13, this.f2113a.W1() || this.f2114b.W1(), this.f2113a.U1() || this.f2114b.U1());
        }

        public void h() {
            g(MotionLayout.this.G, MotionLayout.this.H);
            MotionLayout.this.D0();
        }

        public void i(int i10, int i11) {
            this.f2117e = i10;
            this.f2118f = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected interface f {
        void a();

        void b(MotionEvent motionEvent);

        float c();

        float d();

        void e(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static g f2120b = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        VelocityTracker f2121a;

        private g() {
        }

        public static g f() {
            f2120b.f2121a = VelocityTracker.obtain();
            return f2120b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void a() {
            VelocityTracker velocityTracker = this.f2121a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2121a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f2121a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float c() {
            VelocityTracker velocityTracker = this.f2121a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float d() {
            VelocityTracker velocityTracker = this.f2121a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void e(int i10) {
            VelocityTracker velocityTracker = this.f2121a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f2122a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f2123b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2124c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2125d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f2126e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f2127f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f2128g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f2129h = "motion.EndState";

        h() {
        }

        void a() {
            int i10 = this.f2124c;
            if (i10 != -1 || this.f2125d != -1) {
                if (i10 == -1) {
                    MotionLayout.this.J0(this.f2125d);
                } else {
                    int i11 = this.f2125d;
                    if (i11 == -1) {
                        MotionLayout.this.B0(i10, -1, -1);
                    } else {
                        MotionLayout.this.C0(i10, i11);
                    }
                }
                MotionLayout.this.setState(j.SETUP);
            }
            if (Float.isNaN(this.f2123b)) {
                if (Float.isNaN(this.f2122a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f2122a);
            } else {
                MotionLayout.this.A0(this.f2122a, this.f2123b);
                this.f2122a = Float.NaN;
                this.f2123b = Float.NaN;
                this.f2124c = -1;
                this.f2125d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2122a);
            bundle.putFloat("motion.velocity", this.f2123b);
            bundle.putInt("motion.StartState", this.f2124c);
            bundle.putInt("motion.EndState", this.f2125d);
            return bundle;
        }

        public void c() {
            this.f2125d = MotionLayout.this.F;
            this.f2124c = MotionLayout.this.D;
            this.f2123b = MotionLayout.this.getVelocity();
            this.f2122a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f2125d = i10;
        }

        public void e(float f10) {
            this.f2122a = f10;
        }

        public void f(int i10) {
            this.f2124c = i10;
        }

        public void g(Bundle bundle) {
            this.f2122a = bundle.getFloat("motion.progress");
            this.f2123b = bundle.getFloat("motion.velocity");
            this.f2124c = bundle.getInt("motion.StartState");
            this.f2125d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f2123b = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface i {
        void a(MotionLayout motionLayout, int i10, int i11, float f10);

        void b(MotionLayout motionLayout, int i10);

        void c(MotionLayout motionLayout, int i10, int i11);

        void d(MotionLayout motionLayout, int i10, boolean z10, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = null;
        this.C = 0.0f;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = new HashMap();
        this.K = 0L;
        this.L = 1.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.P = 0.0f;
        this.R = false;
        this.S = false;
        this.W = 0;
        this.f2057b0 = false;
        this.f2059c0 = new z.b();
        this.f2061d0 = new c();
        this.f2063f0 = true;
        this.f2068k0 = false;
        this.f2073p0 = false;
        this.f2074q0 = null;
        this.f2075r0 = null;
        this.f2076s0 = null;
        this.f2077t0 = null;
        this.f2078u0 = 0;
        this.f2079v0 = -1L;
        this.f2080w0 = 0.0f;
        this.f2081x0 = 0;
        this.f2082y0 = 0.0f;
        this.f2084z0 = false;
        this.A0 = false;
        this.I0 = new v.d();
        this.J0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = 0;
        this.Q0 = new HashMap();
        this.U0 = new Rect();
        this.V0 = false;
        this.W0 = j.UNDEFINED;
        this.X0 = new e();
        this.Y0 = false;
        this.Z0 = new RectF();
        this.f2056a1 = null;
        this.f2058b1 = null;
        this.f2060c1 = new ArrayList();
        u0(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        int childCount = getChildCount();
        this.X0.a();
        this.R = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), (m) this.J.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iJ = this.f2083z.j();
        if (iJ != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                m mVar = (m) this.J.get(getChildAt(i12));
                if (mVar != null) {
                    mVar.D(iJ);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.J.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            m mVar2 = (m) this.J.get(getChildAt(i14));
            if (mVar2.h() != -1) {
                sparseBooleanArray.put(mVar2.h(), true);
                iArr[i13] = mVar2.h();
                i13++;
            }
        }
        if (this.f2076s0 != null) {
            for (int i15 = 0; i15 < i13; i15++) {
                m mVar3 = (m) this.J.get(findViewById(iArr[i15]));
                if (mVar3 != null) {
                    this.f2083z.t(mVar3);
                }
            }
            ArrayList arrayList = this.f2076s0;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ((MotionHelper) obj).D(this, this.J);
            }
            for (int i17 = 0; i17 < i13; i17++) {
                m mVar4 = (m) this.J.get(findViewById(iArr[i17]));
                if (mVar4 != null) {
                    mVar4.I(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < i13; i18++) {
                m mVar5 = (m) this.J.get(findViewById(iArr[i18]));
                if (mVar5 != null) {
                    this.f2083z.t(mVar5);
                    mVar5.I(width, height, this.L, getNanoTime());
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            m mVar6 = (m) this.J.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && mVar6 != null) {
                this.f2083z.t(mVar6);
                mVar6.I(width, height, this.L, getNanoTime());
            }
        }
        float fE = this.f2083z.E();
        if (fE != 0.0f) {
            boolean z10 = ((double) fE) < 0.0d;
            float fAbs = Math.abs(fE);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i20 = 0; i20 < childCount; i20++) {
                m mVar7 = (m) this.J.get(getChildAt(i20));
                if (!Float.isNaN(mVar7.f2282m)) {
                    for (int i21 = 0; i21 < childCount; i21++) {
                        m mVar8 = (m) this.J.get(getChildAt(i21));
                        if (!Float.isNaN(mVar8.f2282m)) {
                            fMin = Math.min(fMin, mVar8.f2282m);
                            fMax = Math.max(fMax, mVar8.f2282m);
                        }
                    }
                    while (i10 < childCount) {
                        m mVar9 = (m) this.J.get(getChildAt(i10));
                        if (!Float.isNaN(mVar9.f2282m)) {
                            mVar9.f2284o = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                mVar9.f2283n = fAbs - (((fMax - mVar9.f2282m) / (fMax - fMin)) * fAbs);
                            } else {
                                mVar9.f2283n = fAbs - (((mVar9.f2282m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float fN = mVar7.n();
                float fO = mVar7.o();
                float f10 = z10 ? fO - fN : fO + fN;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i10 < childCount) {
                m mVar10 = (m) this.J.get(getChildAt(i10));
                float fN2 = mVar10.n();
                float fO2 = mVar10.o();
                float f11 = z10 ? fO2 - fN2 : fO2 + fN2;
                mVar10.f2284o = 1.0f / (1.0f - fAbs);
                mVar10.f2283n = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect E0(x.e eVar) {
        this.U0.top = eVar.a0();
        this.U0.left = eVar.Z();
        Rect rect = this.U0;
        int iY = eVar.Y();
        Rect rect2 = this.U0;
        rect.right = iY + rect2.left;
        int iZ = eVar.z();
        Rect rect3 = this.U0;
        rect2.bottom = iZ + rect3.top;
        return rect3;
    }

    private static boolean P0(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    private boolean c0(View view, MotionEvent motionEvent, float f10, float f11) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f10, f11);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f10, -f11);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f10, f11);
        if (this.f2058b1 == null) {
            this.f2058b1 = new Matrix();
        }
        matrix.invert(this.f2058b1);
        motionEventObtain.transform(this.f2058b1);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void d0() {
        p pVar = this.f2083z;
        if (pVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iF = pVar.F();
        p pVar2 = this.f2083z;
        e0(iF, pVar2.l(pVar2.F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ArrayList arrayListO = this.f2083z.o();
        int size = arrayListO.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListO.get(i10);
            i10++;
            p.b bVar = (p.b) obj;
            if (bVar == this.f2083z.f2319c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            f0(bVar);
            int iA = bVar.A();
            int iY = bVar.y();
            String strC = androidx.constraintlayout.motion.widget.a.c(getContext(), iA);
            String strC2 = androidx.constraintlayout.motion.widget.a.c(getContext(), iY);
            if (sparseIntArray.get(iA) == iY) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC + "->" + strC2);
            }
            if (sparseIntArray2.get(iY) == iA) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC + "->" + strC2);
            }
            sparseIntArray.put(iA, iY);
            sparseIntArray2.put(iY, iA);
            if (this.f2083z.l(iA) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + strC);
            }
            if (this.f2083z.l(iY) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + strC);
            }
        }
    }

    private void e0(int i10, androidx.constraintlayout.widget.c cVar) {
        String strC = androidx.constraintlayout.motion.widget.a.c(getContext(), i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (cVar.v(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.a.d(childAt));
            }
        }
        int[] iArrX = cVar.x();
        for (int i12 = 0; i12 < iArrX.length; i12++) {
            int i13 = iArrX[i12];
            String strC2 = androidx.constraintlayout.motion.widget.a.c(getContext(), i13);
            if (findViewById(iArrX[i12]) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
            }
            if (cVar.w(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
            if (cVar.B(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void f0(p.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void g0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            m mVar = (m) this.J.get(childAt);
            if (mVar != null) {
                mVar.E(childAt);
            }
        }
    }

    private void j0() {
        boolean z10;
        float fSignum = Math.signum(this.P - this.N);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.A;
        float interpolation = this.N + (!(interpolator instanceof z.b) ? (((nanoTime - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f);
        if (this.Q) {
            interpolation = this.P;
        }
        if ((fSignum <= 0.0f || interpolation < this.P) && (fSignum > 0.0f || interpolation > this.P)) {
            z10 = false;
        } else {
            interpolation = this.P;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            interpolation = this.f2057b0 ? interpolator.getInterpolation((nanoTime - this.K) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.P) || (fSignum <= 0.0f && interpolation <= this.P)) {
            interpolation = this.P;
        }
        this.H0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.B;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            m mVar = (m) this.J.get(childAt);
            if (mVar != null) {
                mVar.x(childAt, f10, nanoTime2, this.I0);
            }
        }
        if (this.A0) {
            requestLayout();
        }
    }

    private void k0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.T == null && ((copyOnWriteArrayList = this.f2077t0) == null || copyOnWriteArrayList.isEmpty())) || this.f2082y0 == this.M) {
            return;
        }
        if (this.f2081x0 != -1) {
            m0();
            this.f2084z0 = true;
        }
        this.f2081x0 = -1;
        float f10 = this.M;
        this.f2082y0 = f10;
        i iVar = this.T;
        if (iVar != null) {
            iVar.a(this, this.D, this.F, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f2077t0;
        if (copyOnWriteArrayList2 != null) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(this, this.D, this.F, this.M);
            }
        }
        this.f2084z0 = true;
    }

    private void m0() {
        i iVar = this.T;
        if (iVar != null) {
            iVar.c(this, this.D, this.F);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2077t0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(this, this.D, this.F);
            }
        }
    }

    private boolean t0(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (t0((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            this.Z0.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.Z0.contains(motionEvent.getX(), motionEvent.getY())) && c0(view, motionEvent, -f10, -f11)) {
                return true;
            }
        }
        return z10;
    }

    private void u0(AttributeSet attributeSet) {
        p pVar;
        f2054d1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.O9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.f.R9) {
                    this.f2083z = new p(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.f.Q9) {
                    this.E = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.f.T9) {
                    this.P = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.R = true;
                } else if (index == androidx.constraintlayout.widget.f.P9) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == androidx.constraintlayout.widget.f.U9) {
                    if (this.W == 0) {
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.f.S9) {
                    this.W = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f2083z == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f2083z = null;
            }
        }
        if (this.W != 0) {
            d0();
        }
        if (this.E != -1 || (pVar = this.f2083z) == null) {
            return;
        }
        this.E = pVar.F();
        this.D = this.f2083z.F();
        this.F = this.f2083z.q();
    }

    private void y0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.T == null && ((copyOnWriteArrayList = this.f2077t0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i10 = 0;
        this.f2084z0 = false;
        ArrayList arrayList = this.f2060c1;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            i iVar = this.T;
            if (iVar != null) {
                iVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f2077t0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).b(this, num.intValue());
                }
            }
        }
        this.f2060c1.clear();
    }

    public void A0(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f10);
            this.K0.h(f11);
            return;
        }
        setProgress(f10);
        setState(j.MOVING);
        this.C = f11;
        if (f11 != 0.0f) {
            a0(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            a0(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void B0(int i10, int i11, int i12) {
        setState(j.SETUP);
        this.E = i10;
        this.D = -1;
        this.F = -1;
        androidx.constraintlayout.widget.b bVar = this.f2559k;
        if (bVar != null) {
            bVar.d(i10, i11, i12);
            return;
        }
        p pVar = this.f2083z;
        if (pVar != null) {
            pVar.l(i10).i(this);
        }
    }

    public void C0(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.f(i10);
            this.K0.d(i11);
            return;
        }
        p pVar = this.f2083z;
        if (pVar != null) {
            this.D = i10;
            this.F = i11;
            pVar.X(i10, i11);
            this.X0.e(this.f2551c, this.f2083z.l(i10), this.f2083z.l(i11));
            z0();
            this.N = 0.0f;
            I0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    public void F0(int i10, float f10, float f11) {
        float f12;
        if (this.f2083z == null || this.N == f10) {
            return;
        }
        this.f2057b0 = true;
        this.K = getNanoTime();
        this.L = this.f2083z.p() / 1000.0f;
        this.P = f10;
        this.R = true;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f12 = 0.0f;
            } else {
                if (i10 == 2 || i10 == 6) {
                    f10 = 1.0f;
                }
                f12 = f10;
            }
            if (this.f2083z.k() == 0) {
                this.f2059c0.b(this.N, f12, f11, this.L, this.f2083z.u(), this.f2083z.v());
            } else {
                this.f2059c0.d(this.N, f12, f11, this.f2083z.B(), this.f2083z.C(), this.f2083z.A(), this.f2083z.D(), this.f2083z.z());
            }
            int i11 = this.E;
            this.P = f12;
            this.E = i11;
            this.A = this.f2059c0;
        } else if (i10 == 4) {
            this.f2061d0.b(f11, this.N, this.f2083z.u());
            this.A = this.f2061d0;
        } else if (i10 != 5) {
            if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                }
                if (this.f2083z.k() == 0) {
                    this.f2059c0.b(this.N, f12, f11, this.L, this.f2083z.u(), this.f2083z.v());
                } else {
                    this.f2059c0.d(this.N, f12, f11, this.f2083z.B(), this.f2083z.C(), this.f2083z.A(), this.f2083z.D(), this.f2083z.z());
                }
                int i12 = this.E;
                this.P = f12;
                this.E = i12;
                this.A = this.f2059c0;
            }
        } else if (P0(f11, this.N, this.f2083z.u())) {
            this.f2061d0.b(f11, this.N, this.f2083z.u());
            this.A = this.f2061d0;
        } else {
            this.f2059c0.b(this.N, f10, f11, this.L, this.f2083z.u(), this.f2083z.v());
            this.C = 0.0f;
            int i13 = this.E;
            this.P = f10;
            this.E = i13;
            this.A = this.f2059c0;
        }
        this.Q = false;
        this.K = getNanoTime();
        invalidate();
    }

    public void G0() {
        a0(1.0f);
        this.L0 = null;
    }

    public void H0(Runnable runnable) {
        a0(1.0f);
        this.L0 = runnable;
    }

    public void I0() {
        a0(0.0f);
    }

    public void J0(int i10) {
        if (isAttachedToWindow()) {
            K0(i10, -1, -1);
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.d(i10);
    }

    public void K0(int i10, int i11, int i12) {
        L0(i10, i11, i12, -1);
    }

    public void L0(int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.widget.h hVar;
        int iA;
        p pVar = this.f2083z;
        if (pVar != null && (hVar = pVar.f2318b) != null && (iA = hVar.a(this.E, i10, i11, i12)) != -1) {
            i10 = iA;
        }
        int i14 = this.E;
        if (i14 == i10) {
            return;
        }
        if (this.D == i10) {
            a0(0.0f);
            if (i13 > 0) {
                this.L = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.F == i10) {
            a0(1.0f);
            if (i13 > 0) {
                this.L = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.F = i10;
        if (i14 != -1) {
            C0(i14, i10);
            a0(1.0f);
            this.N = 0.0f;
            G0();
            if (i13 > 0) {
                this.L = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f2057b0 = false;
        this.P = 1.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = getNanoTime();
        this.K = getNanoTime();
        this.Q = false;
        this.A = null;
        if (i13 == -1) {
            this.L = this.f2083z.p() / 1000.0f;
        }
        this.D = -1;
        this.f2083z.X(-1, this.F);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.L = this.f2083z.p() / 1000.0f;
        } else if (i13 > 0) {
            this.L = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        this.J.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            this.J.put(childAt, new m(childAt));
            sparseArray.put(childAt.getId(), (m) this.J.get(childAt));
        }
        this.R = true;
        this.X0.e(this.f2551c, null, this.f2083z.l(i10));
        z0();
        this.X0.a();
        g0();
        int width = getWidth();
        int height = getHeight();
        if (this.f2076s0 != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                m mVar = (m) this.J.get(getChildAt(i16));
                if (mVar != null) {
                    this.f2083z.t(mVar);
                }
            }
            ArrayList arrayList = this.f2076s0;
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayList.get(i17);
                i17++;
                ((MotionHelper) obj).D(this, this.J);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                m mVar2 = (m) this.J.get(getChildAt(i18));
                if (mVar2 != null) {
                    mVar2.I(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                m mVar3 = (m) this.J.get(getChildAt(i19));
                if (mVar3 != null) {
                    this.f2083z.t(mVar3);
                    mVar3.I(width, height, this.L, getNanoTime());
                }
            }
        }
        float fE = this.f2083z.E();
        if (fE != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i20 = 0; i20 < childCount; i20++) {
                m mVar4 = (m) this.J.get(getChildAt(i20));
                float fO = mVar4.o() + mVar4.n();
                fMin = Math.min(fMin, fO);
                fMax = Math.max(fMax, fO);
            }
            for (int i21 = 0; i21 < childCount; i21++) {
                m mVar5 = (m) this.J.get(getChildAt(i21));
                float fN = mVar5.n();
                float fO2 = mVar5.o();
                mVar5.f2284o = 1.0f / (1.0f - fE);
                mVar5.f2283n = fE - ((((fN + fO2) - fMin) * fE) / (fMax - fMin));
            }
        }
        this.M = 0.0f;
        this.N = 0.0f;
        this.R = true;
        invalidate();
    }

    public void M0() {
        this.X0.e(this.f2551c, this.f2083z.l(this.D), this.f2083z.l(this.F));
        z0();
    }

    public void N0(int i10, androidx.constraintlayout.widget.c cVar) {
        p pVar = this.f2083z;
        if (pVar != null) {
            pVar.U(i10, cVar);
        }
        M0();
        if (this.E == i10) {
            cVar.i(this);
        }
    }

    public void O0(int i10, View... viewArr) {
        p pVar = this.f2083z;
        if (pVar != null) {
            pVar.c0(i10, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    void a0(float f10) {
        p pVar = this.f2083z;
        if (pVar == null) {
            return;
        }
        float f11 = this.N;
        float f12 = this.M;
        if (f11 != f12 && this.Q) {
            this.N = f12;
        }
        float f13 = this.N;
        if (f13 == f10) {
            return;
        }
        this.f2057b0 = false;
        this.P = f10;
        this.L = pVar.p() / 1000.0f;
        setProgress(this.P);
        this.A = null;
        this.B = this.f2083z.s();
        this.Q = false;
        this.K = getNanoTime();
        this.R = true;
        this.M = f13;
        this.N = f13;
        invalidate();
    }

    public boolean b0(int i10, m mVar) {
        p pVar = this.f2083z;
        if (pVar != null) {
            return pVar.g(i10, mVar);
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        t tVar;
        ArrayList arrayList = this.f2076s0;
        int i10 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((MotionHelper) obj).C(canvas);
            }
        }
        i0(false);
        p pVar = this.f2083z;
        if (pVar != null && (tVar = pVar.f2334r) != null) {
            tVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f2083z == null) {
            return;
        }
        if ((this.W & 1) == 1 && !isInEditMode()) {
            this.f2078u0++;
            long nanoTime = getNanoTime();
            long j10 = this.f2079v0;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.f2080w0 = ((int) ((this.f2078u0 / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f2078u0 = 0;
                    this.f2079v0 = nanoTime;
                }
            } else {
                this.f2079v0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.f2080w0 + " fps " + androidx.constraintlayout.motion.widget.a.e(this, this.D) + " -> ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(androidx.constraintlayout.motion.widget.a.e(this, this.F));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i12 = this.E;
            sb2.append(i12 == -1 ? AdError.UNDEFINED_DOMAIN : androidx.constraintlayout.motion.widget.a.e(this, i12));
            String string = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.W > 1) {
            if (this.f2055a0 == null) {
                this.f2055a0 = new d();
            }
            this.f2055a0.a(canvas, this.J, this.f2083z.p(), this.W);
        }
        ArrayList arrayList2 = this.f2076s0;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((MotionHelper) obj2).B(canvas);
            }
        }
    }

    public int[] getConstraintSetIds() {
        p pVar = this.f2083z;
        if (pVar == null) {
            return null;
        }
        return pVar.n();
    }

    public int getCurrentState() {
        return this.E;
    }

    public ArrayList<p.b> getDefinedTransitions() {
        p pVar = this.f2083z;
        if (pVar == null) {
            return null;
        }
        return pVar.o();
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f2062e0 == null) {
            this.f2062e0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f2062e0;
    }

    public int getEndState() {
        return this.F;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.N;
    }

    public p getScene() {
        return this.f2083z;
    }

    public int getStartState() {
        return this.D;
    }

    public float getTargetPosition() {
        return this.P;
    }

    public Bundle getTransitionState() {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.c();
        return this.K0.b();
    }

    public long getTransitionTimeMs() {
        p pVar = this.f2083z;
        if (pVar != null) {
            this.L = pVar.p() / 1000.0f;
        }
        return (long) (this.L * 1000.0f);
    }

    public float getVelocity() {
        return this.C;
    }

    void h0(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m mVar = (m) this.J.get(getChildAt(i10));
            if (mVar != null) {
                mVar.f(z10);
            }
        }
    }

    @Override // n0.y
    public void i(View view, View view2, int i10, int i11) {
        this.f2071n0 = getNanoTime();
        this.f2072o0 = 0.0f;
        this.f2069l0 = 0.0f;
        this.f2070m0 = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0219  */
    /* JADX WARN: Code duplicated, block: B:180:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    void i0(boolean z10) {
        boolean z11;
        char c10;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        m mVar;
        boolean z12;
        if (this.O == -1) {
            this.O = getNanoTime();
        }
        float f10 = this.N;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.E = -1;
        }
        boolean z13 = false;
        if (this.f2073p0 || (this.R && (z10 || this.P != f10))) {
            float fSignum = Math.signum(this.P - f10);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.A;
            float f11 = !(interpolator3 instanceof n) ? (((nanoTime2 - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f;
            float f12 = this.N + f11;
            if (this.Q) {
                f12 = this.P;
            }
            if ((fSignum <= 0.0f || f12 < this.P) && (fSignum > 0.0f || f12 > this.P)) {
                z11 = false;
            } else {
                f12 = this.P;
                this.R = false;
                z11 = true;
            }
            this.N = f12;
            this.M = f12;
            this.O = nanoTime2;
            if (interpolator3 == null || z11) {
                this.C = f11;
            } else {
                if (this.f2057b0) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.K) * 1.0E-9f);
                    Interpolator interpolator4 = this.A;
                    z.b bVar = this.f2059c0;
                    c10 = interpolator4 == bVar ? bVar.c() ? (char) 2 : (char) 1 : (char) 0;
                    this.N = interpolation2;
                    this.O = nanoTime2;
                    Interpolator interpolator5 = this.A;
                    if (interpolator5 instanceof n) {
                        float fA = ((n) interpolator5).a();
                        this.C = fA;
                        if (Math.abs(fA) * this.L <= 1.0E-5f && c10 == 2) {
                            this.R = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.N = 1.0f;
                            this.R = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f12 = interpolation2;
                        } else {
                            this.N = 0.0f;
                            this.R = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f12);
                    Interpolator interpolator6 = this.A;
                    if (interpolator6 instanceof n) {
                        this.C = ((n) interpolator6).a();
                    } else {
                        this.C = ((interpolator6.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    }
                    f12 = interpolation3;
                }
                if (Math.abs(this.C) > 1.0E-5f) {
                    setState(j.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && f12 >= this.P) || (fSignum <= 0.0f && f12 <= this.P)) {
                        f12 = this.P;
                        this.R = false;
                    }
                    if (f12 < 1.0f || f12 <= 0.0f) {
                        this.R = false;
                        setState(j.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f2073p0 = false;
                nanoTime = getNanoTime();
                this.H0 = f12;
                interpolator = this.B;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.B;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.L) + f12);
                    this.C = interpolation4;
                    this.C = interpolation4 - this.B.getInterpolation(f12);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    mVar = (m) this.J.get(childAt);
                    if (mVar != null) {
                        this.f2073p0 |= mVar.x(childAt, interpolation, nanoTime, this.I0);
                    }
                }
                boolean z14 = (fSignum <= 0.0f && f12 >= this.P) || (fSignum <= 0.0f && f12 <= this.P);
                if (!this.f2073p0 && !this.R && z14) {
                    setState(j.FINISHED);
                }
                if (this.A0) {
                    requestLayout();
                }
                this.f2073p0 = (!z14) | this.f2073p0;
                if (f12 <= 0.0f && (i13 = this.D) != -1 && this.E != i13) {
                    this.E = i13;
                    this.f2083z.l(i13).g(this);
                    setState(j.FINISHED);
                    z13 = true;
                }
                if (f12 >= 1.0d) {
                    i11 = this.E;
                    i12 = this.F;
                    if (i11 != i12) {
                        this.E = i12;
                        this.f2083z.l(i12).g(this);
                        setState(j.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.f2073p0 || this.R) {
                    invalidate();
                } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                    setState(j.FINISHED);
                }
                if (!this.f2073p0 && !this.R && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                    x0();
                }
            }
            c10 = 0;
            if (Math.abs(this.C) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    f12 = this.P;
                    this.R = false;
                } else {
                    f12 = this.P;
                    this.R = false;
                }
                if (f12 < 1.0f) {
                    this.R = false;
                    setState(j.FINISHED);
                } else {
                    this.R = false;
                    setState(j.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f2073p0 = false;
            nanoTime = getNanoTime();
            this.H0 = f12;
            interpolator = this.B;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.B;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.L) + f12);
                this.C = interpolation5;
                this.C = interpolation5 - this.B.getInterpolation(f12);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                mVar = (m) this.J.get(childAt);
                if (mVar != null) {
                    this.f2073p0 |= mVar.x(childAt, interpolation, nanoTime, this.I0);
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f2073p0) {
                setState(j.FINISHED);
            }
            if (this.A0) {
                requestLayout();
            }
            this.f2073p0 = (!z14) | this.f2073p0;
            if (f12 <= 0.0f) {
                this.E = i13;
                this.f2083z.l(i13).g(this);
                setState(j.FINISHED);
                z13 = true;
            }
            if (f12 >= 1.0d) {
                i11 = this.E;
                i12 = this.F;
                if (i11 != i12) {
                    this.E = i12;
                    this.f2083z.l(i12).g(this);
                    setState(j.FINISHED);
                    z13 = true;
                }
            }
            if (this.f2073p0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f2073p0) {
                x0();
            }
        }
        float f13 = this.N;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.E;
                int i15 = this.D;
                z12 = i14 == i15 ? z13 : true;
                this.E = i15;
            }
            this.Y0 |= z13;
            if (z13 && !this.J0) {
                requestLayout();
            }
            this.M = this.N;
        }
        int i16 = this.E;
        int i17 = this.F;
        z12 = i16 == i17 ? z13 : true;
        this.E = i17;
        z13 = z12;
        this.Y0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.M = this.N;
    }

    @Override // n0.y
    public void j(View view, int i10) {
        p pVar = this.f2083z;
        if (pVar != null) {
            float f10 = this.f2072o0;
            if (f10 == 0.0f) {
                return;
            }
            pVar.Q(this.f2069l0 / f10, this.f2070m0 / f10);
        }
    }

    @Override // n0.y
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        p.b bVar;
        q qVarB;
        int iQ;
        p pVar = this.f2083z;
        if (pVar == null || (bVar = pVar.f2319c) == null || !bVar.C()) {
            return;
        }
        int i13 = -1;
        if (!bVar.C() || (qVarB = bVar.B()) == null || (iQ = qVarB.q()) == -1 || view.getId() == iQ) {
            if (pVar.w()) {
                q qVarB2 = bVar.B();
                if (qVarB2 != null && (qVarB2.e() & 4) != 0) {
                    i13 = i11;
                }
                float f10 = this.M;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float fX = pVar.x(i10, i11);
                float f11 = this.N;
                if ((f11 <= 0.0f && fX < 0.0f) || (f11 >= 1.0f && fX > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f12 = this.M;
            long nanoTime = getNanoTime();
            float f13 = i10;
            this.f2069l0 = f13;
            float f14 = i11;
            this.f2070m0 = f14;
            this.f2072o0 = (float) ((nanoTime - this.f2071n0) * 1.0E-9d);
            this.f2071n0 = nanoTime;
            pVar.P(f13, f14);
            if (f12 != this.M) {
                iArr[0] = i10;
                iArr[1] = i11;
            }
            i0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f2068k0 = true;
        }
    }

    protected void l0() {
        int iIntValue;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.f2077t0) != null && !copyOnWriteArrayList.isEmpty())) && this.f2081x0 == -1) {
            this.f2081x0 = this.E;
            if (this.f2060c1.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList arrayList = this.f2060c1;
                iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            }
            int i10 = this.E;
            if (iIntValue != i10 && i10 != -1) {
                this.f2060c1.add(Integer.valueOf(i10));
            }
        }
        y0();
        Runnable runnable = this.L0;
        if (runnable != null) {
            runnable.run();
            this.L0 = null;
        }
        int[] iArr = this.M0;
        if (iArr == null || this.N0 <= 0) {
            return;
        }
        J0(iArr[0]);
        int[] iArr2 = this.M0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.N0--;
    }

    @Override // n0.z
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f2068k0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f2068k0 = false;
    }

    public void n0(int i10, boolean z10, float f10) {
        i iVar = this.T;
        if (iVar != null) {
            iVar.d(this, i10, z10, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2077t0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(this, i10, z10, f10);
            }
        }
    }

    @Override // n0.y
    public boolean o(View view, View view2, int i10, int i11) {
        p.b bVar;
        p pVar = this.f2083z;
        return (pVar == null || (bVar = pVar.f2319c) == null || bVar.B() == null || (this.f2083z.f2319c.B().e() & 2) != 0) ? false : true;
    }

    void o0(int i10, float f10, float f11, float f12, float[] fArr) {
        String resourceName;
        HashMap map = this.J;
        View viewQ = q(i10);
        m mVar = (m) map.get(viewQ);
        if (mVar != null) {
            mVar.l(f10, f11, f12, fArr);
            float y10 = viewQ.getY();
            this.U = f10;
            this.V = y10;
            return;
        }
        if (viewQ == null) {
            resourceName = "" + i10;
        } else {
            resourceName = viewQ.getContext().getResources().getResourceName(i10);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        p.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.T0 = display.getRotation();
        }
        p pVar = this.f2083z;
        if (pVar != null && (i10 = this.E) != -1) {
            androidx.constraintlayout.widget.c cVarL = pVar.l(i10);
            this.f2083z.T(this);
            ArrayList arrayList = this.f2076s0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((MotionHelper) obj).A(this);
                }
            }
            if (cVarL != null) {
                cVarL.i(this);
            }
            this.D = this.E;
        }
        x0();
        h hVar = this.K0;
        if (hVar != null) {
            if (this.V0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        p pVar2 = this.f2083z;
        if (pVar2 == null || (bVar = pVar2.f2319c) == null || bVar.x() != 4) {
            return;
        }
        G0();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q qVarB;
        int iQ;
        RectF rectFP;
        p pVar = this.f2083z;
        if (pVar != null && this.I) {
            t tVar = pVar.f2334r;
            if (tVar != null) {
                tVar.h(motionEvent);
            }
            p.b bVar = this.f2083z.f2319c;
            if (bVar != null && bVar.C() && (qVarB = bVar.B()) != null && ((motionEvent.getAction() != 0 || (rectFP = qVarB.p(this, new RectF())) == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) && (iQ = qVarB.q()) != -1)) {
                View view = this.f2056a1;
                if (view == null || view.getId() != iQ) {
                    this.f2056a1 = findViewById(iQ);
                }
                View view2 = this.f2056a1;
                if (view2 != null) {
                    this.Z0.set(view2.getLeft(), this.f2056a1.getTop(), this.f2056a1.getRight(), this.f2056a1.getBottom());
                    if (this.Z0.contains(motionEvent.getX(), motionEvent.getY()) && !t0(this.f2056a1.getLeft(), this.f2056a1.getTop(), this.f2056a1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        MotionLayout motionLayout;
        this.J0 = true;
        try {
            if (this.f2083z == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.J0 = false;
                return;
            }
            motionLayout = this;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            try {
                if (motionLayout.f2066i0 != i14 || motionLayout.f2067j0 != i15) {
                    z0();
                    i0(true);
                }
                motionLayout.f2066i0 = i14;
                motionLayout.f2067j0 = i15;
                motionLayout.f2064g0 = i14;
                motionLayout.f2065h0 = i15;
                motionLayout.J0 = false;
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
        Throwable th4 = th;
        motionLayout.J0 = false;
        throw th4;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2083z == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.G == i10 && this.H == i11) ? false : true;
        if (this.Y0) {
            this.Y0 = false;
            x0();
            y0();
            z11 = true;
        }
        if (this.f2556h) {
            z11 = true;
        }
        this.G = i10;
        this.H = i11;
        int iF = this.f2083z.F();
        int iQ = this.f2083z.q();
        if ((z11 || this.X0.f(iF, iQ)) && this.D != -1) {
            super.onMeasure(i10, i11);
            this.X0.e(this.f2551c, this.f2083z.l(iF), this.f2083z.l(iQ));
            this.X0.h();
            this.X0.i(iF, iQ);
        } else {
            if (z11) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.A0 || z10) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iY = this.f2551c.Y() + getPaddingLeft() + getPaddingRight();
            int iZ = this.f2551c.z() + paddingTop;
            int i12 = this.F0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.B0;
                iY = (int) (i13 + (this.H0 * (this.D0 - i13)));
                requestLayout();
            }
            int i14 = this.G0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.C0;
                iZ = (int) (i15 + (this.H0 * (this.E0 - i15)));
                requestLayout();
            }
            setMeasuredDimension(iY, iZ);
        }
        j0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        p pVar = this.f2083z;
        if (pVar != null) {
            pVar.W(t());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p pVar = this.f2083z;
        if (pVar == null || !this.I || !pVar.b0()) {
            return super.onTouchEvent(motionEvent);
        }
        p.b bVar = this.f2083z.f2319c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f2083z.R(motionEvent, getCurrentState(), this);
        if (this.f2083z.f2319c.D(4)) {
            return this.f2083z.f2319c.B().r();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2077t0 == null) {
                this.f2077t0 = new CopyOnWriteArrayList();
            }
            this.f2077t0.add(motionHelper);
            if (motionHelper.z()) {
                if (this.f2074q0 == null) {
                    this.f2074q0 = new ArrayList();
                }
                this.f2074q0.add(motionHelper);
            }
            if (motionHelper.y()) {
                if (this.f2075r0 == null) {
                    this.f2075r0 = new ArrayList();
                }
                this.f2075r0.add(motionHelper);
            }
            if (motionHelper.x()) {
                if (this.f2076s0 == null) {
                    this.f2076s0 = new ArrayList();
                }
                this.f2076s0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f2074q0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f2075r0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public androidx.constraintlayout.widget.c p0(int i10) {
        p pVar = this.f2083z;
        if (pVar == null) {
            return null;
        }
        return pVar.l(i10);
    }

    m q0(int i10) {
        return (m) this.J.get(findViewById(i10));
    }

    public p.b r0(int i10) {
        return this.f2083z.G(i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        p pVar;
        p.b bVar;
        if (!this.A0 && this.E == -1 && (pVar = this.f2083z) != null && (bVar = pVar.f2319c) != null) {
            int iZ = bVar.z();
            if (iZ == 0) {
                return;
            }
            if (iZ == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ((m) this.J.get(getChildAt(i10))).z();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void s0(View view, float f10, float f11, float[] fArr, int i10) {
        float interpolation;
        float[] fArr2;
        float fA = this.C;
        float f12 = this.N;
        if (this.A != null) {
            float fSignum = Math.signum(this.P - f12);
            float interpolation2 = this.A.getInterpolation(this.N + 1.0E-5f);
            interpolation = this.A.getInterpolation(this.N);
            fA = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.L;
        } else {
            interpolation = f12;
        }
        Interpolator interpolator = this.A;
        if (interpolator instanceof n) {
            fA = ((n) interpolator).a();
        }
        m mVar = (m) this.J.get(view);
        if ((i10 & 1) == 0) {
            fArr2 = fArr;
            mVar.r(interpolation, view.getWidth(), view.getHeight(), f10, f11, fArr2);
        } else {
            fArr2 = fArr;
            mVar.l(interpolation, f10, f11, fArr2);
        }
        if (i10 < 2) {
            fArr2[0] = fArr2[0] * fA;
            fArr2[1] = fArr2[1] * fA;
        }
    }

    public void setDebugMode(int i10) {
        this.W = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.V0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.I = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f2083z != null) {
            setState(j.MOVING);
            Interpolator interpolatorS = this.f2083z.s();
            if (interpolatorS != null) {
                setProgress(interpolatorS.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList arrayList = this.f2075r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((MotionHelper) this.f2075r0.get(i10)).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList arrayList = this.f2074q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((MotionHelper) this.f2074q0.get(i10)).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.N == 1.0f && this.E == this.F) {
                setState(j.MOVING);
            }
            this.E = this.D;
            if (this.N == 0.0f) {
                setState(j.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.N == 0.0f && this.E == this.D) {
                setState(j.MOVING);
            }
            this.E = this.F;
            if (this.N == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.E = -1;
            setState(j.MOVING);
        }
        if (this.f2083z == null) {
            return;
        }
        this.Q = true;
        this.P = f10;
        this.M = f10;
        this.O = -1L;
        this.K = -1L;
        this.A = null;
        this.R = true;
        invalidate();
    }

    public void setScene(p pVar) {
        this.f2083z = pVar;
        pVar.W(t());
        z0();
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.E = i10;
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.f(i10);
        this.K0.d(i10);
    }

    void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.E == -1) {
            return;
        }
        j jVar3 = this.W0;
        this.W0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            k0();
        }
        int iOrdinal = jVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && jVar == jVar2) {
                l0();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            k0();
        }
        if (jVar == jVar2) {
            l0();
        }
    }

    public void setTransition(int i10) {
        float f10;
        if (this.f2083z != null) {
            p.b bVarR0 = r0(i10);
            this.D = bVarR0.A();
            this.F = bVarR0.y();
            if (!isAttachedToWindow()) {
                if (this.K0 == null) {
                    this.K0 = new h();
                }
                this.K0.f(this.D);
                this.K0.d(this.F);
                return;
            }
            int i11 = this.E;
            if (i11 == this.D) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.F ? 1.0f : Float.NaN;
            }
            this.f2083z.Y(bVarR0);
            this.X0.e(this.f2551c, this.f2083z.l(this.D), this.f2083z.l(this.F));
            z0();
            if (this.N != f10) {
                if (f10 == 0.0f) {
                    h0(true);
                    this.f2083z.l(this.D).i(this);
                } else if (f10 == 1.0f) {
                    h0(false);
                    this.f2083z.l(this.F).i(this);
                }
            }
            this.N = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
                return;
            }
            Log.v("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + " transitionToStart ");
            I0();
        }
    }

    public void setTransitionDuration(int i10) {
        p pVar = this.f2083z;
        if (pVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            pVar.V(i10);
        }
    }

    public void setTransitionListener(i iVar) {
        this.T = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.g(bundle);
        if (isAttachedToWindow()) {
            this.K0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.c(context, this.D) + "->" + androidx.constraintlayout.motion.widget.a.c(context, this.F) + " (pos:" + this.N + " Dpos/Dt:" + this.C;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void v(int i10) {
        this.f2559k = null;
    }

    public boolean v0() {
        return this.I;
    }

    protected f w0() {
        return g.f();
    }

    void x0() {
        p pVar = this.f2083z;
        if (pVar == null) {
            return;
        }
        if (pVar.h(this, this.E)) {
            requestLayout();
            return;
        }
        int i10 = this.E;
        if (i10 != -1) {
            this.f2083z.f(this, i10);
        }
        if (this.f2083z.b0()) {
            this.f2083z.Z();
        }
    }

    public void z0() {
        this.X0.h();
        invalidate();
    }

    protected void setTransition(p.b bVar) {
        this.f2083z.Y(bVar);
        setState(j.SETUP);
        if (this.E == this.f2083z.q()) {
            this.N = 1.0f;
            this.M = 1.0f;
            this.P = 1.0f;
        } else {
            this.N = 0.0f;
            this.M = 0.0f;
            this.P = 0.0f;
        }
        this.O = bVar.D(1) ? -1L : getNanoTime();
        int iF = this.f2083z.F();
        int iQ = this.f2083z.q();
        if (iF == this.D && iQ == this.F) {
            return;
        }
        this.D = iF;
        this.F = iQ;
        this.f2083z.X(iF, iQ);
        this.X0.e(this.f2551c, this.f2083z.l(this.D), this.f2083z.l(this.F));
        this.X0.i(this.D, this.F);
        this.X0.h();
        z0();
    }

    @Override // n0.y
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
