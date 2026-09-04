package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k extends RecyclerView.p implements RecyclerView.u {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.v C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f6984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f6985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f6988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f6989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f6992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f6993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f6994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f6995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f6996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f6997p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f7000s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f7007z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6998q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6999r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7001t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7002u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7003v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7004w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f7005x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f7006y = new int[2];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.k(500);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends RecyclerView.v {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            k.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7010a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7010a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7010a) {
                this.f7010a = false;
                return;
            }
            if (((Float) k.this.f7007z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.s(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.f6984c.setAlpha(iFloatValue);
            k.this.f6985d.setAlpha(iFloatValue);
            k.this.p();
        }
    }

    k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7007z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f6984c = stateListDrawable;
        this.f6985d = drawable;
        this.f6988g = stateListDrawable2;
        this.f6989h = drawable2;
        this.f6986e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f6987f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f6990i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f6991j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f6982a = i11;
        this.f6983b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        d(recyclerView);
    }

    private void e() {
        this.f7000s.removeCallbacks(this.B);
    }

    private void f() {
        this.f7000s.k1(this);
        this.f7000s.l1(this);
        this.f7000s.m1(this.C);
        e();
    }

    private void g(Canvas canvas) {
        int i10 = this.f6999r;
        int i11 = this.f6990i;
        int i12 = i10 - i11;
        int i13 = this.f6996o;
        int i14 = this.f6995n;
        int i15 = i13 - (i14 / 2);
        this.f6988g.setBounds(0, 0, i14, i11);
        this.f6989h.setBounds(0, 0, this.f6998q, this.f6991j);
        canvas.translate(0.0f, i12);
        this.f6989h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f6988g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void h(Canvas canvas) {
        int i10 = this.f6998q;
        int i11 = this.f6986e;
        int i12 = i10 - i11;
        int i13 = this.f6993l;
        int i14 = this.f6992k;
        int i15 = i13 - (i14 / 2);
        this.f6984c.setBounds(0, 0, i11, i14);
        this.f6985d.setBounds(0, 0, this.f6987f, this.f6999r);
        if (!m()) {
            canvas.translate(i12, 0.0f);
            this.f6985d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f6984c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f6985d.draw(canvas);
        canvas.translate(this.f6986e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f6984c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f6986e, -i15);
    }

    private int[] i() {
        int[] iArr = this.f7006y;
        int i10 = this.f6983b;
        iArr[0] = i10;
        iArr[1] = this.f6998q - i10;
        return iArr;
    }

    private int[] j() {
        int[] iArr = this.f7005x;
        int i10 = this.f6983b;
        iArr[0] = i10;
        iArr[1] = this.f6999r - i10;
        return iArr;
    }

    private void l(float f10) {
        int[] iArrI = i();
        float fMax = Math.max(iArrI[0], Math.min(iArrI[1], f10));
        if (Math.abs(this.f6996o - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f6997p, fMax, iArrI, this.f7000s.computeHorizontalScrollRange(), this.f7000s.computeHorizontalScrollOffset(), this.f6998q);
        if (iR != 0) {
            this.f7000s.scrollBy(iR, 0);
        }
        this.f6997p = fMax;
    }

    private boolean m() {
        return this.f7000s.getLayoutDirection() == 1;
    }

    private void q(int i10) {
        e();
        this.f7000s.postDelayed(this.B, i10);
    }

    private int r(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void t() {
        this.f7000s.j(this);
        this.f7000s.m(this);
        this.f7000s.n(this.C);
    }

    private void w(float f10) {
        int[] iArrJ = j();
        float fMax = Math.max(iArrJ[0], Math.min(iArrJ[1], f10));
        if (Math.abs(this.f6993l - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f6994m, fMax, iArrJ, this.f7000s.computeVerticalScrollRange(), this.f7000s.computeVerticalScrollOffset(), this.f6999r);
        if (iR != 0) {
            this.f7000s.scrollBy(0, iR);
        }
        this.f6994m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f7003v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zO = o(motionEvent.getX(), motionEvent.getY());
            boolean zN = n(motionEvent.getX(), motionEvent.getY());
            if (zO || zN) {
                if (zN) {
                    this.f7004w = 1;
                    this.f6997p = (int) motionEvent.getX();
                } else if (zO) {
                    this.f7004w = 2;
                    this.f6994m = (int) motionEvent.getY();
                }
                s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7003v == 2) {
            this.f6994m = 0.0f;
            this.f6997p = 0.0f;
            s(1);
            this.f7004w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7003v == 2) {
            u();
            if (this.f7004w == 1) {
                l(motionEvent.getX());
            }
            if (this.f7004w == 2) {
                w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f7003v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zO = o(motionEvent.getX(), motionEvent.getY());
        boolean zN = n(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zO && !zN)) {
            return false;
        }
        if (zN) {
            this.f7004w = 1;
            this.f6997p = (int) motionEvent.getX();
        } else if (zO) {
            this.f7004w = 2;
            this.f6994m = (int) motionEvent.getY();
        }
        s(2);
        return true;
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7000s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f7000s = recyclerView;
        if (recyclerView != null) {
            t();
        }
    }

    void k(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f7007z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f7007z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f7007z.setDuration(i10);
        this.f7007z.start();
    }

    boolean n(float f10, float f11) {
        if (f11 < this.f6999r - this.f6990i) {
            return false;
        }
        int i10 = this.f6996o;
        int i11 = this.f6995n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean o(float f10, float f11) {
        if (m()) {
            if (f10 > this.f6986e) {
                return false;
            }
        } else if (f10 < this.f6998q - this.f6986e) {
            return false;
        }
        int i10 = this.f6993l;
        int i11 = this.f6992k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.f6998q != this.f7000s.getWidth() || this.f6999r != this.f7000s.getHeight()) {
            this.f6998q = this.f7000s.getWidth();
            this.f6999r = this.f7000s.getHeight();
            s(0);
        } else if (this.A != 0) {
            if (this.f7001t) {
                h(canvas);
            }
            if (this.f7002u) {
                g(canvas);
            }
        }
    }

    void p() {
        this.f7000s.invalidate();
    }

    void s(int i10) {
        if (i10 == 2 && this.f7003v != 2) {
            this.f6984c.setState(D);
            e();
        }
        if (i10 == 0) {
            p();
        } else {
            u();
        }
        if (this.f7003v == 2 && i10 != 2) {
            this.f6984c.setState(E);
            q(1200);
        } else if (i10 == 1) {
            q(1500);
        }
        this.f7003v = i10;
    }

    public void u() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f7007z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f7007z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f7007z.setDuration(500L);
        this.f7007z.setStartDelay(0L);
        this.f7007z.start();
    }

    void v(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f7000s.computeVerticalScrollRange();
        int i12 = this.f6999r;
        this.f7001t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f6982a;
        int iComputeHorizontalScrollRange = this.f7000s.computeHorizontalScrollRange();
        int i13 = this.f6998q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f6982a;
        this.f7002u = z10;
        boolean z11 = this.f7001t;
        if (!z11 && !z10) {
            if (this.f7003v != 0) {
                s(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f6993l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f6992k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f7002u) {
            float f11 = i13;
            this.f6996o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f6995n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f7003v;
        if (i14 == 0 || i14 == 1) {
            s(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void c(boolean z10) {
    }
}
