package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.c0;
import gc.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f21508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f21509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f21512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f21516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f21518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f21519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f21520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f21521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f21524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21526t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.F);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.r(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f21526t = fc.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) i(2)) + c0.g(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i10 = i(this.f21526t);
        float f10 = width;
        float f11 = i10;
        float fCos = (((float) Math.cos(this.f21524r)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f21524r))) + f12;
        this.f21519m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f21517k, this.f21519m);
        double dSin = Math.sin(this.f21524r);
        double dCos = Math.cos(this.f21524r);
        double d10 = i10 - this.f21517k;
        this.f21519m.setStrokeWidth(this.f21521o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f21519m);
        canvas.drawCircle(f10, f12, this.f21518l, this.f21519m);
    }

    private int g(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int i(int i10) {
        return i10 == 2 ? Math.round(this.f21525s * 0.66f) : this.f21525s;
    }

    private Pair k(float f10) {
        float fH = h();
        if (Math.abs(fH - f10) > 180.0f) {
            if (fH > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fH < 180.0f && f10 > 180.0f) {
                fH += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fH), Float.valueOf(f10));
    }

    private boolean l(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fG = g(f10, f11);
        boolean z13 = false;
        boolean z14 = h() != fG;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f21510d) {
            z13 = true;
        }
        q(fG, z13);
        return true;
    }

    private void m() {
        this.f21509c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f21534a, valueAnimator);
            }
        });
        this.f21509c.addListener(new a());
    }

    private void r(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f21522p = f11;
        this.f21524r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fI = i(this.f21526t);
        float fCos = width + (((float) Math.cos(this.f21524r)) * fI);
        float fSin = height + (fI * ((float) Math.sin(this.f21524r)));
        RectF rectF = this.f21520n;
        int i10 = this.f21517k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f21516j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f21516j.add(bVar);
    }

    int e() {
        return this.f21526t;
    }

    public RectF f() {
        return this.f21520n;
    }

    public float h() {
        return this.f21522p;
    }

    public int j() {
        return this.f21517k;
    }

    public void n(int i10) {
        this.f21525s = i10;
        invalidate();
    }

    void o(int i10) {
        this.f21526t = i10;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f21509c.isRunning()) {
            return;
        }
        p(h());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f21511e = x10;
            this.f21512f = y10;
            this.f21513g = true;
            this.f21523q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f21511e);
            int i11 = (int) (y10 - this.f21512f);
            this.f21513g = (i10 * i10) + (i11 * i11) > this.f21514h;
            z11 = this.f21523q;
            boolean z13 = actionMasked == 1;
            if (this.f21515i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f21523q |= l(x10, y10, z11, z10, z12);
        return true;
    }

    public void p(float f10) {
        q(f10, false);
    }

    public void q(float f10, boolean z10) {
        this.f21509c.cancel();
        if (!z10) {
            r(f10, false);
            return;
        }
        Pair pairK = k(f10);
        this.f21509c.setFloatValues(((Float) pairK.first).floatValue(), ((Float) pairK.second).floatValue());
        this.f21509c.setDuration(this.f21507a);
        this.f21509c.setInterpolator(this.f21508b);
        this.f21509c.start();
    }

    void s(boolean z10) {
        if (this.f21515i && !z10) {
            this.f21526t = 1;
        }
        this.f21515i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21509c = new ValueAnimator();
        this.f21516j = new ArrayList();
        Paint paint = new Paint();
        this.f21519m = paint;
        this.f21520n = new RectF();
        this.f21526t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52130q2, i10, l.Z);
        this.f21507a = j.f(context, sb.c.K, 200);
        this.f21508b = j.g(context, sb.c.U, tb.b.f53276b);
        this.f21525s = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52160s2, 0);
        this.f21517k = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52175t2, 0);
        Resources resources = getResources();
        this.f21521o = resources.getDimensionPixelSize(sb.e.f51683g0);
        this.f21518l = resources.getDimensionPixelSize(sb.e.f51677e0);
        int color = typedArrayObtainStyledAttributes.getColor(m.f52145r2, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        p(0.0f);
        this.f21514h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        m();
    }
}
