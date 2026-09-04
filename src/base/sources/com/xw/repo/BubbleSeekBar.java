package com.xw.repo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BubbleSeekBar extends View {
    private long A;
    private boolean B;
    private long C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private boolean N;
    private int O;
    private boolean P;
    private SparseArray Q;
    private float R;
    private boolean S;
    private k T;
    private float U;
    private float V;
    private Paint W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35942a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Rect f35943a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f35944b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private WindowManager f35945b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35946c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private i f35947c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35948d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f35949d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35950e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f35951e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35952f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f35953f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35954g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f35955g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35956h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private WindowManager.LayoutParams f35957h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35958i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int[] f35959i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35960j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f35961j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35962k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f35963k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35964l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private com.xw.repo.a f35965l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35966m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    float f35967m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f35979y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35980z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f35961j0 = false;
            BubbleSeekBar.this.z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.N = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.N = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.B) {
                    BubbleSeekBar.this.H();
                }
                BubbleSeekBar.this.N = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.B) {
                    BubbleSeekBar.this.H();
                }
                BubbleSeekBar.this.N = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f35947c0.animate().alpha(BubbleSeekBar.this.B ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.A).setListener(new a()).start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f35946c = bubbleSeekBar.C();
            if (BubbleSeekBar.this.D || BubbleSeekBar.this.f35947c0.getParent() == null) {
                BubbleSeekBar.this.N();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.f35955g0 = bubbleSeekBar2.B();
                BubbleSeekBar.this.f35957h0.x = (int) (BubbleSeekBar.this.f35955g0 + 0.5f);
                BubbleSeekBar.this.f35945b0.updateViewLayout(BubbleSeekBar.this.f35947c0, BubbleSeekBar.this.f35957h0);
                BubbleSeekBar.this.f35947c0.a(BubbleSeekBar.this.f35977w ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.T != null) {
                k kVar = BubbleSeekBar.this.T;
                BubbleSeekBar bubbleSeekBar3 = BubbleSeekBar.this;
                kVar.a(bubbleSeekBar3, bubbleSeekBar3.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.D && !BubbleSeekBar.this.B) {
                BubbleSeekBar.this.H();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f35946c = bubbleSeekBar.C();
            BubbleSeekBar.this.N = false;
            BubbleSeekBar.this.f35961j0 = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.D && !BubbleSeekBar.this.B) {
                BubbleSeekBar.this.H();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f35946c = bubbleSeekBar.C();
            BubbleSeekBar.this.N = false;
            BubbleSeekBar.this.f35961j0 = true;
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.T != null) {
                k kVar = BubbleSeekBar.this.T;
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                kVar.c(bubbleSeekBar2, bubbleSeekBar2.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.f35945b0.addView(BubbleSeekBar.this.f35947c0, BubbleSeekBar.this.f35957h0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.O();
            BubbleSeekBar.this.P = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f35990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Path f35991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f35992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Rect f35993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35994e;

        i(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        void a(String str) {
            if (str == null || this.f35994e.equals(str)) {
                return;
            }
            this.f35994e = str;
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f35991b.reset();
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() - (BubbleSeekBar.this.f35949d0 / 3.0f);
            this.f35991b.moveTo(measuredWidth, measuredHeight);
            float measuredWidth2 = (float) (((double) (getMeasuredWidth() / 2.0f)) - ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f35949d0)));
            float f10 = BubbleSeekBar.this.f35949d0 * 1.5f;
            this.f35991b.quadTo(measuredWidth2 - com.xw.repo.b.a(2), f10 - com.xw.repo.b.a(2), measuredWidth2, f10);
            this.f35991b.arcTo(this.f35992c, 150.0f, 240.0f);
            this.f35991b.quadTo(((float) (((double) (getMeasuredWidth() / 2.0f)) + ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f35949d0)))) + com.xw.repo.b.a(2), f10 - com.xw.repo.b.a(2), measuredWidth, measuredHeight);
            this.f35991b.close();
            this.f35990a.setColor(BubbleSeekBar.this.F);
            canvas.drawPath(this.f35991b, this.f35990a);
            this.f35990a.setTextSize(BubbleSeekBar.this.G);
            this.f35990a.setColor(BubbleSeekBar.this.H);
            Paint paint = this.f35990a;
            String str = this.f35994e;
            paint.getTextBounds(str, 0, str.length(), this.f35993d);
            Paint.FontMetrics fontMetrics = this.f35990a.getFontMetrics();
            float f11 = BubbleSeekBar.this.f35949d0;
            float f12 = fontMetrics.descent;
            canvas.drawText(this.f35994e, getMeasuredWidth() / 2.0f, (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12, this.f35990a);
        }

        @Override // android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setMeasuredDimension(BubbleSeekBar.this.f35949d0 * 3, BubbleSeekBar.this.f35949d0 * 3);
            this.f35992c.set((getMeasuredWidth() / 2.0f) - BubbleSeekBar.this.f35949d0, 0.0f, (getMeasuredWidth() / 2.0f) + BubbleSeekBar.this.f35949d0, BubbleSeekBar.this.f35949d0 * 2);
        }

        i(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        i(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f35994e = "";
            Paint paint = new Paint();
            this.f35990a = paint;
            paint.setAntiAlias(true);
            this.f35990a.setTextAlign(Paint.Align.CENTER);
            this.f35991b = new Path();
            this.f35992c = new RectF();
            this.f35993d = new Rect();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface j {
        SparseArray a(int i10, SparseArray sparseArray);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface k {
        void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void b(BubbleSeekBar bubbleSeekBar, int i10, float f10);

        void c(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float A(float f10) {
        float f11 = this.U;
        if (f10 <= f11) {
            return f11;
        }
        float f12 = this.V;
        if (f10 >= f12) {
            return f12;
        }
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f35964l) {
            float f14 = this.M;
            f13 = (i10 * f14) + this.U;
            if (f13 <= f10 && f10 - f13 <= f14) {
                break;
            }
            i10++;
        }
        float f15 = f10 - f13;
        float f16 = this.M;
        return f15 <= f16 / 2.0f ? f13 : ((i10 + 1) * f16) + this.U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        return this.E ? this.f35951e0 - ((this.L * (this.f35946c - this.f35942a)) / this.I) : this.f35951e0 + ((this.L * (this.f35946c - this.f35942a)) / this.I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float C() {
        float f10;
        float f11;
        if (this.E) {
            f10 = ((this.V - this.K) * this.I) / this.L;
            f11 = this.f35942a;
        } else {
            f10 = ((this.K - this.U) * this.I) / this.L;
            f11 = this.f35942a;
        }
        return f10 + f11;
    }

    private void D() {
        String strF;
        String strF2;
        this.W.setTextSize(this.G);
        if (this.f35977w) {
            strF = F(this.E ? this.f35944b : this.f35942a);
        } else if (this.E) {
            strF = this.f35948d ? F(this.f35944b) : String.valueOf((int) this.f35944b);
        } else {
            strF = this.f35948d ? F(this.f35942a) : String.valueOf((int) this.f35942a);
        }
        this.W.getTextBounds(strF, 0, strF.length(), this.f35943a0);
        int iWidth = (this.f35943a0.width() + (this.O * 2)) >> 1;
        if (this.f35977w) {
            strF2 = F(this.E ? this.f35942a : this.f35944b);
        } else if (this.E) {
            strF2 = this.f35948d ? F(this.f35942a) : String.valueOf((int) this.f35942a);
        } else {
            strF2 = this.f35948d ? F(this.f35944b) : String.valueOf((int) this.f35944b);
        }
        this.W.getTextBounds(strF2, 0, strF2.length(), this.f35943a0);
        int iWidth2 = (this.f35943a0.width() + (this.O * 2)) >> 1;
        int iA = com.xw.repo.b.a(14);
        this.f35949d0 = iA;
        this.f35949d0 = Math.max(iA, Math.max(iWidth, iWidth2)) + this.O;
    }

    private String F(float f10) {
        return String.valueOf(G(f10));
    }

    private float G(float f10) {
        return BigDecimal.valueOf(f10).setScale(1, 4).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        i iVar = this.f35947c0;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(8);
        if (this.f35947c0.getParent() != null) {
            this.f35945b0.removeViewImmediate(this.f35947c0);
        }
    }

    private void I() {
        if (this.f35942a == this.f35944b) {
            this.f35942a = 0.0f;
            this.f35944b = 100.0f;
        }
        float f10 = this.f35942a;
        float f11 = this.f35944b;
        if (f10 > f11) {
            this.f35944b = f10;
            this.f35942a = f11;
        }
        float f12 = this.f35946c;
        float f13 = this.f35942a;
        if (f12 < f13) {
            this.f35946c = f13;
        }
        float f14 = this.f35946c;
        float f15 = this.f35944b;
        if (f14 > f15) {
            this.f35946c = f15;
        }
        int i10 = this.f35952f;
        int i11 = this.f35950e;
        if (i10 < i11) {
            this.f35952f = i11 + com.xw.repo.b.a(2);
        }
        int i12 = this.f35954g;
        int i13 = this.f35952f;
        if (i12 <= i13) {
            this.f35954g = i13 + com.xw.repo.b.a(2);
        }
        int i14 = this.f35956h;
        int i15 = this.f35952f;
        if (i14 <= i15) {
            this.f35956h = i15 * 2;
        }
        if (this.f35964l <= 0) {
            this.f35964l = 10;
        }
        float f16 = this.f35944b - this.f35942a;
        this.I = f16;
        float f17 = f16 / this.f35964l;
        this.J = f17;
        if (f17 < 1.0f) {
            this.f35948d = true;
        }
        if (this.f35948d) {
            this.f35977w = true;
        }
        int i16 = this.f35972r;
        if (i16 != -1) {
            this.f35969o = true;
        }
        if (this.f35969o) {
            if (i16 == -1) {
                this.f35972r = 0;
            }
            if (this.f35972r == 2) {
                this.f35966m = true;
            }
        }
        if (this.f35973s < 1) {
            this.f35973s = 1;
        }
        J();
        if (this.f35979y) {
            this.f35980z = false;
            this.f35968n = false;
        }
        if (this.f35968n && !this.f35966m) {
            this.f35968n = false;
        }
        if (this.f35980z) {
            float f18 = this.f35942a;
            this.f35963k0 = f18;
            if (this.f35946c != f18) {
                this.f35963k0 = this.J;
            }
            this.f35966m = true;
            this.f35968n = true;
        }
        if (this.D) {
            this.B = false;
        }
        if (this.B) {
            setProgress(this.f35946c);
        }
        this.f35975u = (this.f35948d || this.f35980z || (this.f35969o && this.f35972r == 2)) ? this.f35970p : this.f35975u;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[PHI: r5
      0x004e: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x0049, B:27:0x004b, B:19:0x002e, B:24:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0059, please report this as an issue */
    private void J() {
        String strF;
        int i10 = 0;
        boolean z10 = this.f35972r == 2;
        boolean z11 = this.f35973s > 1 && this.f35964l % 2 == 0;
        while (true) {
            int i11 = this.f35964l;
            if (i10 > i11) {
                return;
            }
            boolean z12 = this.E;
            float f10 = z12 ? this.f35944b - (this.J * i10) : this.f35942a + (this.J * i10);
            if (z10) {
                if (!z11) {
                    SparseArray sparseArray = this.Q;
                    if (this.f35948d) {
                        strF = F(f10);
                    } else {
                        strF = ((int) f10) + "";
                    }
                    sparseArray.put(i10, strF);
                } else if (i10 % this.f35973s == 0) {
                    f10 = z12 ? this.f35944b - (this.J * i10) : this.f35942a + (this.J * i10);
                    SparseArray sparseArray2 = this.Q;
                    if (this.f35948d) {
                        strF = F(f10);
                    } else {
                        strF = ((int) f10) + "";
                    }
                    sparseArray2.put(i10, strF);
                }
            } else if (i10 == 0 || i10 == i11) {
                SparseArray sparseArray3 = this.Q;
                if (this.f35948d) {
                    strF = F(f10);
                } else {
                    strF = ((int) f10) + "";
                }
                sparseArray3.put(i10, strF);
            }
            i10++;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f10 = (this.L / this.I) * (this.f35946c - this.f35942a);
        float f11 = this.E ? this.V - f10 : this.U + f10;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        return ((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) <= (this.U + ((float) com.xw.repo.b.a(8))) * (this.U + ((float) com.xw.repo.b.a(8)));
    }

    private boolean L(MotionEvent motionEvent) {
        return isEnabled() && motionEvent.getX() >= ((float) getPaddingLeft()) && motionEvent.getX() <= ((float) (getMeasuredWidth() - getPaddingRight())) && motionEvent.getY() >= ((float) getPaddingTop()) && motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    private void M() {
        Window window;
        getLocationInWindow(this.f35959i0);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.f35959i0;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.E) {
            this.f35951e0 = (this.f35959i0[0] + this.V) - (this.f35947c0.getMeasuredWidth() / 2.0f);
        } else {
            this.f35951e0 = (this.f35959i0[0] + this.U) - (this.f35947c0.getMeasuredWidth() / 2.0f);
        }
        this.f35955g0 = B();
        float measuredHeight = this.f35959i0[1] - this.f35947c0.getMeasuredHeight();
        this.f35953f0 = measuredHeight;
        this.f35953f0 = measuredHeight - com.xw.repo.b.a(24);
        if (com.xw.repo.b.b()) {
            this.f35953f0 -= com.xw.repo.b.a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f35953f0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float N() {
        float f10 = this.f35946c;
        if (this.f35980z && this.S) {
            float f11 = this.J / 2.0f;
            if (this.f35978x) {
                if (f10 != this.f35942a && f10 != this.f35944b) {
                    for (int i10 = 0; i10 <= this.f35964l; i10++) {
                        float f12 = this.J;
                        float f13 = i10 * f12;
                        if (f13 < f10 && f13 + f12 >= f10) {
                            return f11 + f13 > f10 ? f13 : f13 + f12;
                        }
                    }
                }
            }
            float f14 = this.f35963k0;
            if (f10 >= f14) {
                if (f10 >= f11 + f14) {
                    float f15 = f14 + this.J;
                    this.f35963k0 = f15;
                    return f15;
                }
            } else if (f10 < f14 - f11) {
                float f16 = f14 - this.J;
                this.f35963k0 = f16;
                return f16;
            }
            return f14;
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        i iVar = this.f35947c0;
        if (iVar == null || iVar.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f35957h0;
        layoutParams.x = (int) (this.f35955g0 + 0.5f);
        layoutParams.y = (int) (this.f35953f0 + 0.5f);
        this.f35947c0.setAlpha(0.0f);
        this.f35947c0.setVisibility(0);
        this.f35947c0.animate().alpha(1.0f).setDuration(this.f35978x ? 0L : this.A).setListener(new g()).start();
        this.f35947c0.a(this.f35977w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ValueAnimator valueAnimatorOfFloat;
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f35964l) {
            float f11 = this.M;
            f10 = (i10 * f11) + this.U;
            float f12 = this.K;
            if (f10 <= f12 && f12 - f10 <= f11) {
                break;
            } else {
                i10++;
            }
        }
        boolean z10 = BigDecimal.valueOf((double) this.K).setScale(1, 4).floatValue() == f10;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z10) {
            valueAnimatorOfFloat = null;
        } else {
            float f13 = this.K;
            float f14 = f13 - f10;
            float f15 = this.M;
            valueAnimatorOfFloat = f14 <= f15 / 2.0f ? ValueAnimator.ofFloat(f13, f10) : ValueAnimator.ofFloat(f13, ((i10 + 1) * f15) + this.U);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new e());
        }
        if (!this.D) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35947c0, (Property<i, Float>) View.ALPHA, this.B ? 1.0f : 0.0f);
            if (z10) {
                animatorSet.setDuration(this.A).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.A).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z10) {
            animatorSet.setDuration(this.A).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new f());
        animatorSet.start();
    }

    void E(com.xw.repo.a aVar) {
        this.f35942a = aVar.f35996a;
        this.f35944b = aVar.f35997b;
        this.f35946c = aVar.f35998c;
        this.f35948d = aVar.f35999d;
        this.f35950e = aVar.f36000e;
        this.f35952f = aVar.f36001f;
        this.f35954g = aVar.f36002g;
        this.f35956h = aVar.f36003h;
        this.f35958i = aVar.f36004i;
        this.f35960j = aVar.f36005j;
        this.f35962k = aVar.f36006k;
        this.f35964l = aVar.f36007l;
        this.f35966m = aVar.f36008m;
        this.f35968n = aVar.f36009n;
        this.f35969o = aVar.f36010o;
        this.f35970p = aVar.f36011p;
        this.f35971q = aVar.f36012q;
        this.f35972r = aVar.f36013r;
        this.f35973s = aVar.f36014s;
        this.f35974t = aVar.f36015t;
        this.f35975u = aVar.f36016u;
        this.f35976v = aVar.f36017v;
        this.f35977w = aVar.f36018w;
        this.A = aVar.f36019x;
        this.f35978x = aVar.f36020y;
        this.f35979y = aVar.f36021z;
        this.f35980z = aVar.A;
        this.F = aVar.B;
        this.G = aVar.C;
        this.H = aVar.D;
        this.B = aVar.E;
        this.C = aVar.F;
        this.D = aVar.G;
        this.E = aVar.H;
        I();
        D();
        k kVar = this.T;
        if (kVar != null) {
            kVar.a(this, getProgress(), getProgressFloat(), false);
            this.T.c(this, getProgress(), getProgressFloat(), false);
        }
        this.f35965l0 = null;
        requestLayout();
    }

    public com.xw.repo.a getConfigBuilder() {
        if (this.f35965l0 == null) {
            this.f35965l0 = new com.xw.repo.a(this);
        }
        com.xw.repo.a aVar = this.f35965l0;
        aVar.f35996a = this.f35942a;
        aVar.f35997b = this.f35944b;
        aVar.f35998c = this.f35946c;
        aVar.f35999d = this.f35948d;
        aVar.f36000e = this.f35950e;
        aVar.f36001f = this.f35952f;
        aVar.f36002g = this.f35954g;
        aVar.f36003h = this.f35956h;
        aVar.f36004i = this.f35958i;
        aVar.f36005j = this.f35960j;
        aVar.f36006k = this.f35962k;
        aVar.f36007l = this.f35964l;
        aVar.f36008m = this.f35966m;
        aVar.f36009n = this.f35968n;
        aVar.f36010o = this.f35969o;
        aVar.f36011p = this.f35970p;
        aVar.f36012q = this.f35971q;
        aVar.f36013r = this.f35972r;
        aVar.f36014s = this.f35973s;
        aVar.f36015t = this.f35974t;
        aVar.f36016u = this.f35975u;
        aVar.f36017v = this.f35976v;
        aVar.f36018w = this.f35977w;
        aVar.f36019x = this.A;
        aVar.f36020y = this.f35978x;
        aVar.f36021z = this.f35979y;
        aVar.A = this.f35980z;
        aVar.B = this.F;
        aVar.C = this.G;
        aVar.D = this.H;
        aVar.E = this.B;
        aVar.F = this.C;
        aVar.G = this.D;
        aVar.H = this.E;
        return aVar;
    }

    public float getMax() {
        return this.f35944b;
    }

    public float getMin() {
        return this.f35942a;
    }

    public k getOnProgressChangedListener() {
        return this.T;
    }

    public int getProgress() {
        return Math.round(N());
    }

    public float getProgressFloat() {
        return G(N());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        H();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0258  */
    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop = getPaddingTop() + this.f35956h;
        if (this.f35969o) {
            this.W.setColor(this.f35971q);
            this.W.setTextSize(this.f35970p);
            this.W.getTextBounds("0123456789", 0, 10, this.f35943a0);
            int i10 = this.f35972r;
            if (i10 == 0) {
                float fHeight = (this.f35943a0.height() / 2.0f) + paddingTop;
                String str = (String) this.Q.get(0);
                this.W.getTextBounds(str, 0, str.length(), this.f35943a0);
                canvas.drawText(str, (this.f35943a0.width() / 2.0f) + paddingLeft, fHeight, this.W);
                paddingLeft += this.f35943a0.width() + this.O;
                String str2 = (String) this.Q.get(this.f35964l);
                this.W.getTextBounds(str2, 0, str2.length(), this.f35943a0);
                canvas.drawText(str2, measuredWidth - ((this.f35943a0.width() + 0.5f) / 2.0f), fHeight, this.W);
                measuredWidth -= this.f35943a0.width() + this.O;
            } else if (i10 >= 1) {
                float f12 = this.f35956h + paddingTop + this.O;
                String str3 = (String) this.Q.get(0);
                this.W.getTextBounds(str3, 0, str3.length(), this.f35943a0);
                float fHeight2 = f12 + this.f35943a0.height();
                float f13 = this.U;
                if (this.f35972r == 1) {
                    canvas.drawText(str3, f13, fHeight2, this.W);
                }
                String str4 = (String) this.Q.get(this.f35964l);
                this.W.getTextBounds(str4, 0, str4.length(), this.f35943a0);
                float f14 = this.V;
                if (this.f35972r == 1) {
                    canvas.drawText(str4, f14, fHeight2, this.W);
                }
                paddingLeft = f13;
                measuredWidth = f14;
            }
        } else if (this.f35974t && this.f35972r == -1) {
            paddingLeft = this.U;
            measuredWidth = this.V;
        }
        boolean z10 = this.f35969o;
        if ((!z10 && !this.f35974t) || this.f35972r == 0) {
            int i11 = this.f35956h;
            paddingLeft += i11;
            measuredWidth -= i11;
        }
        float f15 = paddingLeft;
        float f16 = measuredWidth;
        boolean z11 = z10 && this.f35972r == 2;
        if (z11 || this.f35966m) {
            this.W.setTextSize(this.f35970p);
            this.W.getTextBounds("0123456789", 0, 10, this.f35943a0);
            float fHeight3 = this.f35943a0.height() + paddingTop;
            int i12 = this.f35956h;
            float f17 = fHeight3 + i12 + this.O;
            float fA = (i12 - com.xw.repo.b.a(2)) / 2.0f;
            float fAbs = this.E ? this.V - ((this.L / this.I) * Math.abs(this.f35946c - this.f35942a)) : this.U + ((this.L / this.I) * Math.abs(this.f35946c - this.f35942a));
            for (int i13 = 0; i13 <= this.f35964l; i13++) {
                float f18 = (i13 * this.M) + f15;
                if (this.E) {
                    this.W.setColor(f18 <= fAbs ? this.f35958i : this.f35960j);
                } else {
                    this.W.setColor(f18 <= fAbs ? this.f35960j : this.f35958i);
                }
                canvas.drawCircle(f18, paddingTop, fA, this.W);
                if (z11) {
                    this.W.setColor(this.f35971q);
                    if (this.Q.get(i13, null) != null) {
                        canvas.drawText((String) this.Q.get(i13), f18, f17, this.W);
                    }
                }
            }
        }
        boolean z12 = this.N;
        if (!z12 || this.B) {
            if (this.E) {
                this.K = f16 - ((this.L / this.I) * (this.f35946c - this.f35942a));
            } else {
                this.K = ((this.L / this.I) * (this.f35946c - this.f35942a)) + f15;
            }
        }
        if (this.f35974t && !z12 && this.f35961j0) {
            this.W.setColor(this.f35976v);
            this.W.setTextSize(this.f35975u);
            this.W.getTextBounds("0123456789", 0, 10, this.f35943a0);
            float fHeight4 = this.f35943a0.height() + paddingTop + this.f35956h + this.O;
            if (this.f35948d) {
                canvas.drawText(String.valueOf(getProgressFloat()), this.K, fHeight4, this.W);
            } else {
                if (this.f35977w && this.f35972r == 1) {
                    float f19 = this.f35946c;
                    if (f19 != this.f35942a && f19 != this.f35944b) {
                        canvas.drawText(String.valueOf(getProgressFloat()), this.K, fHeight4, this.W);
                    }
                }
                canvas.drawText(String.valueOf(getProgress()), this.K, fHeight4, this.W);
            }
        }
        this.W.setColor(this.f35960j);
        this.W.setStrokeWidth(this.f35952f);
        if (this.E) {
            f10 = paddingTop;
            canvas.drawLine(f16, f10, this.K, f10, this.W);
            f11 = f15;
        } else {
            f10 = paddingTop;
            f11 = f15;
            canvas.drawLine(f11, f10, this.K, f10, this.W);
        }
        this.W.setColor(this.f35958i);
        this.W.setStrokeWidth(this.f35950e);
        if (this.E) {
            canvas2 = canvas;
            canvas2.drawLine(this.K, f10, f11, f10, this.W);
        } else {
            canvas2 = canvas;
            canvas2.drawLine(this.K, f10, f16, f10, this.W);
        }
        this.W.setColor(this.f35962k);
        canvas2.drawCircle(this.K, f10, this.N ? this.f35956h : this.f35954g, this.W);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.D) {
            return;
        }
        M();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = this.f35956h * 2;
        if (this.f35974t) {
            this.W.setTextSize(this.f35975u);
            this.W.getTextBounds("j", 0, 1, this.f35943a0);
            iMax += this.f35943a0.height();
        }
        if (this.f35969o && this.f35972r >= 1) {
            this.W.setTextSize(this.f35970p);
            this.W.getTextBounds("j", 0, 1, this.f35943a0);
            iMax = Math.max(iMax, (this.f35956h * 2) + this.f35943a0.height());
        }
        setMeasuredDimension(View.resolveSize(com.xw.repo.b.a(180), i10), iMax + (this.O * 2));
        this.U = getPaddingLeft() + this.f35956h;
        this.V = (getMeasuredWidth() - getPaddingRight()) - this.f35956h;
        if (this.f35969o) {
            this.W.setTextSize(this.f35970p);
            int i12 = this.f35972r;
            if (i12 == 0) {
                String str = (String) this.Q.get(0);
                this.W.getTextBounds(str, 0, str.length(), this.f35943a0);
                this.U += this.f35943a0.width() + this.O;
                String str2 = (String) this.Q.get(this.f35964l);
                this.W.getTextBounds(str2, 0, str2.length(), this.f35943a0);
                this.V -= this.f35943a0.width() + this.O;
            } else if (i12 >= 1) {
                String str3 = (String) this.Q.get(0);
                this.W.getTextBounds(str3, 0, str3.length(), this.f35943a0);
                this.U = getPaddingLeft() + Math.max(this.f35956h, this.f35943a0.width() / 2.0f) + this.O;
                String str4 = (String) this.Q.get(this.f35964l);
                this.W.getTextBounds(str4, 0, str4.length(), this.f35943a0);
                this.V = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f35956h, this.f35943a0.width() / 2.0f)) - this.O;
            }
        } else if (this.f35974t && this.f35972r == -1) {
            this.W.setTextSize(this.f35975u);
            String str5 = (String) this.Q.get(0);
            this.W.getTextBounds(str5, 0, str5.length(), this.f35943a0);
            this.U = getPaddingLeft() + Math.max(this.f35956h, this.f35943a0.width() / 2.0f) + this.O;
            String str6 = (String) this.Q.get(this.f35964l);
            this.W.getTextBounds(str6, 0, str6.length(), this.f35943a0);
            this.V = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f35956h, this.f35943a0.width() / 2.0f)) - this.O;
        }
        float f10 = this.V - this.U;
        this.L = f10;
        this.M = (f10 * 1.0f) / this.f35964l;
        if (this.D) {
            return;
        }
        this.f35947c0.measure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f35946c = bundle.getFloat(NotificationCompat.CATEGORY_PROGRESS);
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        i iVar = this.f35947c0;
        if (iVar != null) {
            iVar.a(this.f35977w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f35946c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat(NotificationCompat.CATEGORY_PROGRESS, this.f35946c);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        k kVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            performClick();
            getParent().requestDisallowInterceptTouchEvent(true);
            boolean zK = K(motionEvent);
            this.N = zK;
            if (zK) {
                if (this.f35980z && !this.S) {
                    this.S = true;
                }
                if (this.B && !this.P) {
                    this.P = true;
                }
                if (!this.D) {
                    O();
                }
                invalidate();
            } else if (this.f35978x && L(motionEvent)) {
                this.N = true;
                if (this.f35980z && !this.S) {
                    this.S = true;
                }
                if (this.B) {
                    H();
                    this.P = true;
                }
                if (this.f35979y) {
                    float fA = A(motionEvent.getX());
                    this.R = fA;
                    this.K = fA;
                } else {
                    float x10 = motionEvent.getX();
                    this.K = x10;
                    float f10 = this.U;
                    if (x10 < f10) {
                        this.K = f10;
                    }
                    float f11 = this.K;
                    float f12 = this.V;
                    if (f11 > f12) {
                        this.K = f12;
                    }
                }
                this.f35946c = C();
                if (!this.D) {
                    this.f35955g0 = B();
                    O();
                }
                invalidate();
            }
            this.f35967m0 = this.K - motionEvent.getX();
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f35968n) {
                if (this.f35978x) {
                    postDelayed(new b(), this.A);
                } else {
                    z();
                }
            } else if (this.N || this.f35978x) {
                if (this.D) {
                    ViewPropertyAnimator duration = animate().setDuration(this.A);
                    if (this.N && this.f35978x) {
                        j10 = 300;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).setListener(new c()).start();
                } else {
                    postDelayed(new d(), this.A);
                }
            }
            kVar = this.T;
            if (kVar != null) {
                kVar.a(this, getProgress(), getProgressFloat(), true);
                this.T.b(this, getProgress(), getProgressFloat());
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.f35968n) {
                    if (this.f35978x) {
                        postDelayed(new b(), this.A);
                    } else {
                        z();
                    }
                } else if (this.N) {
                    if (this.D) {
                        ViewPropertyAnimator duration2 = animate().setDuration(this.A);
                        if (this.N) {
                            j10 = 0;
                        } else {
                            j10 = 0;
                        }
                        duration2.setStartDelay(j10).setListener(new c()).start();
                    } else {
                        postDelayed(new d(), this.A);
                    }
                } else if (this.D) {
                    ViewPropertyAnimator duration3 = animate().setDuration(this.A);
                    if (this.N) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                    }
                    duration3.setStartDelay(j10).setListener(new c()).start();
                } else {
                    postDelayed(new d(), this.A);
                }
                kVar = this.T;
                if (kVar != null) {
                    kVar.a(this, getProgress(), getProgressFloat(), true);
                    this.T.b(this, getProgress(), getProgressFloat());
                }
            }
        } else if (this.N) {
            if (this.f35979y) {
                float fA2 = A(motionEvent.getX());
                if (fA2 != this.R) {
                    this.R = fA2;
                    this.K = fA2;
                }
            } else {
                float x11 = motionEvent.getX() + this.f35967m0;
                this.K = x11;
                float f13 = this.U;
                if (x11 < f13) {
                    this.K = f13;
                }
                float f14 = this.K;
                float f15 = this.V;
                if (f14 > f15) {
                    this.K = f15;
                }
            }
            this.f35946c = C();
            if (this.D || this.f35947c0.getParent() == null) {
                N();
            } else {
                float fB = B();
                this.f35955g0 = fB;
                WindowManager.LayoutParams layoutParams = this.f35957h0;
                layoutParams.x = (int) (fB + 0.5f);
                this.f35945b0.updateViewLayout(this.f35947c0, layoutParams);
                this.f35947c0.a(this.f35977w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
            }
            invalidate();
            k kVar2 = this.T;
            if (kVar2 != null) {
                kVar2.a(this, getProgress(), getProgressFloat(), true);
            }
        }
        return this.N || this.f35978x || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        if (this.D || !this.B) {
            return;
        }
        if (i10 != 0) {
            H();
        } else if (this.P) {
            O();
        }
        super.onVisibilityChanged(view, i10);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setBubbleColor(int i10) {
        if (this.F != i10) {
            this.F = i10;
            i iVar = this.f35947c0;
            if (iVar != null) {
                iVar.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(j jVar) {
        this.Q = jVar.a(this.f35964l, this.Q);
        for (int i10 = 0; i10 <= this.f35964l; i10++) {
            if (this.Q.get(i10) == null) {
                this.Q.put(i10, "");
            }
        }
        this.f35974t = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(k kVar) {
        this.T = kVar;
    }

    public void setProgress(float f10) {
        this.f35946c = f10;
        k kVar = this.T;
        if (kVar != null) {
            kVar.a(this, getProgress(), getProgressFloat(), false);
            this.T.c(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.D) {
            this.f35955g0 = B();
        }
        if (this.B) {
            H();
            postDelayed(new h(), this.C);
        }
        if (this.f35980z) {
            this.S = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(int i10) {
        if (this.f35960j != i10) {
            this.f35960j = i10;
            invalidate();
        }
    }

    public void setThumbColor(int i10) {
        if (this.f35962k != i10) {
            this.f35962k = i10;
            invalidate();
        }
    }

    public void setTrackColor(int i10) {
        if (this.f35958i != i10) {
            this.f35958i = i10;
            invalidate();
        }
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35972r = -1;
        this.Q = new SparseArray();
        this.f35959i0 = new int[2];
        this.f35961j0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ck.b.f10091p, i10, 0);
        this.f35942a = typedArrayObtainStyledAttributes.getFloat(ck.b.B, 0.0f);
        this.f35944b = typedArrayObtainStyledAttributes.getFloat(ck.b.A, 100.0f);
        this.f35946c = typedArrayObtainStyledAttributes.getFloat(ck.b.C, this.f35942a);
        this.f35948d = typedArrayObtainStyledAttributes.getBoolean(ck.b.f10111z, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.Y, com.xw.repo.b.a(2));
        this.f35950e = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.F, dimensionPixelSize + com.xw.repo.b.a(2));
        this.f35952f = dimensionPixelSize2;
        this.f35954g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.S, dimensionPixelSize2 + com.xw.repo.b.a(2));
        this.f35956h = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.T, this.f35952f * 2);
        this.f35964l = typedArrayObtainStyledAttributes.getInteger(ck.b.G, 10);
        this.f35958i = typedArrayObtainStyledAttributes.getColor(ck.b.X, androidx.core.content.a.getColor(context, ck.a.f10060b));
        int color = typedArrayObtainStyledAttributes.getColor(ck.b.E, androidx.core.content.a.getColor(context, ck.a.f10059a));
        this.f35960j = color;
        this.f35962k = typedArrayObtainStyledAttributes.getColor(ck.b.R, color);
        this.f35969o = typedArrayObtainStyledAttributes.getBoolean(ck.b.P, false);
        this.f35970p = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.K, com.xw.repo.b.c(14));
        this.f35971q = typedArrayObtainStyledAttributes.getColor(ck.b.H, this.f35958i);
        this.f35979y = typedArrayObtainStyledAttributes.getBoolean(ck.b.M, false);
        this.f35980z = typedArrayObtainStyledAttributes.getBoolean(ck.b.L, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(ck.b.J, -1);
        if (integer == 0) {
            this.f35972r = 0;
        } else if (integer == 1) {
            this.f35972r = 1;
        } else if (integer == 2) {
            this.f35972r = 2;
        } else {
            this.f35972r = -1;
        }
        this.f35973s = typedArrayObtainStyledAttributes.getInteger(ck.b.I, 1);
        this.f35974t = typedArrayObtainStyledAttributes.getBoolean(ck.b.Q, false);
        this.f35975u = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.V, com.xw.repo.b.c(14));
        this.f35976v = typedArrayObtainStyledAttributes.getColor(ck.b.U, this.f35960j);
        this.F = typedArrayObtainStyledAttributes.getColor(ck.b.f10103v, this.f35960j);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(ck.b.f10107x, com.xw.repo.b.c(14));
        this.H = typedArrayObtainStyledAttributes.getColor(ck.b.f10105w, -1);
        this.f35966m = typedArrayObtainStyledAttributes.getBoolean(ck.b.O, false);
        this.f35968n = typedArrayObtainStyledAttributes.getBoolean(ck.b.f10101u, false);
        this.f35977w = typedArrayObtainStyledAttributes.getBoolean(ck.b.N, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(ck.b.f10099t, -1);
        this.A = integer2 < 0 ? 200L : integer2;
        this.f35978x = typedArrayObtainStyledAttributes.getBoolean(ck.b.W, false);
        this.B = typedArrayObtainStyledAttributes.getBoolean(ck.b.f10095r, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(ck.b.f10097s, 0);
        this.C = integer3 < 0 ? 0L : integer3;
        this.D = typedArrayObtainStyledAttributes.getBoolean(ck.b.f10109y, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(ck.b.D, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(ck.b.f10093q, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.W = paint;
        paint.setAntiAlias(true);
        this.W.setStrokeCap(Paint.Cap.ROUND);
        this.W.setTextAlign(Paint.Align.CENTER);
        this.f35943a0 = new Rect();
        this.O = com.xw.repo.b.a(2);
        I();
        if (this.D) {
            return;
        }
        this.f35945b0 = (WindowManager) context.getSystemService("window");
        i iVar = new i(this, context);
        this.f35947c0 = iVar;
        iVar.a(this.f35977w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f35957h0 = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (com.xw.repo.b.b() || Build.VERSION.SDK_INT >= 25) {
            this.f35957h0.type = 2;
        } else {
            this.f35957h0.type = 2005;
        }
        D();
    }
}
