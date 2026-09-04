package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DefaultTimeBar extends View implements c0 {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f18397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f18398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f18399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f18400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f18401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f18402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f18403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f18404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f18405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f18406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f18407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f18408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f18409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f18410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f18411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f18412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f18413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f18414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f18415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f18416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f18417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f18418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f18419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet f18420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f18421y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f18422z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f18397a);
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i10;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f18400d;
        int iQ = r0.q(rect.right, rect.left, this.f18398b.right);
        int iCenterY = this.f18400d.centerY();
        Drawable drawable = this.f18407k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i10 = this.f18414r;
            } else {
                i10 = isEnabled() ? this.f18412p : this.f18413q;
            }
            canvas.drawCircle(iQ, iCenterY, (int) ((i10 * this.F) / 2.0f), this.f18406j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f18407k.getIntrinsicHeight() * this.F)) / 2;
        this.f18407k.setBounds(iQ - intrinsicWidth, iCenterY - intrinsicHeight, iQ + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f18407k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f18398b.height();
        int iCenterY = this.f18398b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f18398b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f18403g);
            return;
        }
        Rect rect2 = this.f18399c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f18398b.left, i12), this.f18400d.right);
        int i13 = this.f18398b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f18403g);
        }
        int iMax2 = Math.max(i11, this.f18400d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f18402f);
        }
        if (this.f18400d.width() > 0) {
            Rect rect3 = this.f18400d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f18401e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) ob.a.e(this.N);
        boolean[] zArr = (boolean[]) ob.a.e(this.O);
        int i14 = this.f18411o / 2;
        for (int i15 = 0; i15 < this.M; i15++) {
            int iWidth = ((int) ((((long) this.f18398b.width()) * r0.r(jArr[i15], 0L, this.J)) / this.J)) - i14;
            Rect rect4 = this.f18398b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f18411o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f18411o, i10, zArr[i15] ? this.f18405i : this.f18404h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        long j11 = this.J;
        if (j11 == C.TIME_UNSET) {
            return 0L;
        }
        return j11 / ((long) this.A);
    }

    private String getProgressText() {
        return r0.k0(this.f18417u, this.f18418v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f18398b.width() <= 0 || this.J == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.f18400d.width()) * this.J) / ((long) this.f18398b.width());
    }

    private boolean j(float f10, float f11) {
        return this.f18397a.contains((int) f10, (int) f11);
    }

    private void k(float f10) {
        Rect rect = this.f18400d;
        Rect rect2 = this.f18398b;
        rect.right = r0.q((int) f10, rect2.left, rect2.right);
    }

    private static int l(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point m(MotionEvent motionEvent) {
        this.f18421y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f18421y;
    }

    private boolean n(long j10) {
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.H ? this.I : this.K;
        long jR = r0.r(j12 + j10, 0L, j11);
        if (jR == j12) {
            return false;
        }
        if (this.H) {
            x(jR);
        } else {
            t(jR);
        }
        v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return r0.f48425a >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i10) {
        return r0.f48425a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void q(int i10, int i11) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i10 && this.D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void t(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f18420x.iterator();
        while (it.hasNext()) {
            ((c0.a) it.next()).E(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z10) {
        removeCallbacks(this.f18419w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f18420x.iterator();
        while (it.hasNext()) {
            ((c0.a) it.next()).u(this, this.I, z10);
        }
    }

    private void v() {
        this.f18399c.set(this.f18398b);
        this.f18400d.set(this.f18398b);
        long j10 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f18398b.width()) * this.L) / this.J);
            Rect rect = this.f18399c;
            Rect rect2 = this.f18398b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f18398b.width()) * j10) / this.J);
            Rect rect3 = this.f18400d;
            Rect rect4 = this.f18398b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f18399c;
            int i10 = this.f18398b.left;
            rect5.right = i10;
            this.f18400d.right = i10;
        }
        invalidate(this.f18397a);
    }

    private void w() {
        Drawable drawable = this.f18407k;
        if (drawable != null && drawable.isStateful() && this.f18407k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void x(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator it = this.f18420x.iterator();
        while (it.hasNext()) {
            ((c0.a) it.next()).q(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public void a(c0.a aVar) {
        ob.a.e(aVar);
        this.f18420x.add(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public void b(long[] jArr, boolean[] zArr, int i10) {
        ob.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.M = i10;
        this.N = jArr;
        this.O = zArr;
        v();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public long getPreferredUpdateDelay() {
        int iL = l(this.f18422z, this.f18398b.width());
        if (iL == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.J;
        if (j10 == 0 || j10 == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j10 / ((long) iL);
    }

    public void h(long j10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, 0.0f);
        this.E.setDuration(j10);
        this.E.start();
    }

    public void i(boolean z10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z10;
        this.F = 0.0f;
        invalidate(this.f18397a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18407k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.H || z10) {
            return;
        }
        u(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (r0.f48425a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (n(positionIncrement)) {
                            removeCallbacks(this.f18419w);
                            postDelayed(this.f18419w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (n(positionIncrement)) {
                            removeCallbacks(this.f18419w);
                            postDelayed(this.f18419w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            u(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                u(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.G ? 0 : this.f18415s;
        if (this.f18410n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f18409m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f18408l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f18409m) / 2;
            iMax = (i15 - this.f18408l) / 2;
        }
        this.f18397a.set(paddingLeft, paddingBottom, paddingRight, this.f18409m + paddingBottom);
        Rect rect = this.f18398b;
        Rect rect2 = this.f18397a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f18408l + iMax);
        if (r0.f48425a >= 29) {
            q(i14, i15);
        }
        v();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f18409m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f18409m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f18407k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            Point pointM = m(motionEvent);
            int i10 = pointM.x;
            int i11 = pointM.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f10 = i10;
                if (j(f10, i11)) {
                    k(f10);
                    t(getScrubberPosition());
                    v();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    u(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        u(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i11 < this.f18416t) {
                    int i12 = this.C;
                    k(i12 + ((i10 - i12) / 3));
                } else {
                    this.C = i10;
                    k(i10);
                }
                x(getScrubberPosition());
                v();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (n(-getPositionIncrement())) {
                u(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (n(getPositionIncrement())) {
                u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void r() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.f18397a);
    }

    public void s(long j10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(j10);
        this.E.start();
    }

    public void setAdMarkerColor(int i10) {
        this.f18404h.setColor(i10);
        invalidate(this.f18397a);
    }

    public void setBufferedColor(int i10) {
        this.f18402f.setColor(i10);
        invalidate(this.f18397a);
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public void setBufferedPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        v();
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == C.TIME_UNSET) {
            u(true);
        }
        v();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.c0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.H || z10) {
            return;
        }
        u(true);
    }

    public void setKeyCountIncrement(int i10) {
        ob.a.a(i10 > 0);
        this.A = i10;
        this.B = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j10) {
        ob.a.a(j10 > 0);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f18405i.setColor(i10);
        invalidate(this.f18397a);
    }

    public void setPlayedColor(int i10) {
        this.f18401e.setColor(i10);
        invalidate(this.f18397a);
    }

    @Override // com.google.android.exoplayer2.ui.c0
    public void setPosition(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i10) {
        this.f18406j.setColor(i10);
        invalidate(this.f18397a);
    }

    public void setUnplayedColor(int i10) {
        this.f18403g.setColor(i10);
        invalidate(this.f18397a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f18397a = new Rect();
        this.f18398b = new Rect();
        this.f18399c = new Rect();
        this.f18400d = new Rect();
        Paint paint = new Paint();
        this.f18401e = paint;
        Paint paint2 = new Paint();
        this.f18402f = paint2;
        Paint paint3 = new Paint();
        this.f18403g = paint3;
        Paint paint4 = new Paint();
        this.f18404h = paint4;
        Paint paint5 = new Paint();
        this.f18405i = paint5;
        Paint paint6 = new Paint();
        this.f18406j = paint6;
        paint6.setAntiAlias(true);
        this.f18420x = new CopyOnWriteArraySet();
        this.f18421y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f18422z = f10;
        this.f18416t = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, mb.s.f45523e, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(mb.s.f45545p);
                this.f18407k = drawable;
                if (drawable != null) {
                    o(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f18408l = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45531i, iE);
                this.f18409m = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45549r, iE2);
                this.f18410n = typedArrayObtainStyledAttributes.getInt(mb.s.f45529h, 0);
                this.f18411o = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45527g, iE3);
                this.f18412p = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45547q, iE4);
                this.f18413q = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45541n, iE5);
                this.f18414r = typedArrayObtainStyledAttributes.getDimensionPixelSize(mb.s.f45543o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(mb.s.f45537l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(mb.s.f45539m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(mb.s.f45533j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(mb.s.f45551s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(mb.s.f45525f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(mb.s.f45535k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f18408l = iE;
            this.f18409m = iE2;
            this.f18410n = 0;
            this.f18411o = iE3;
            this.f18412p = iE4;
            this.f18413q = iE5;
            this.f18414r = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f18407k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f18417u = sb2;
        this.f18418v = new Formatter(sb2, Locale.getDefault());
        this.f18419w = new Runnable() { // from class: mb.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45419a.u(false);
            }
        };
        Drawable drawable2 = this.f18407k;
        if (drawable2 != null) {
            this.f18415s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f18415s = (Math.max(this.f18413q, Math.max(this.f18412p, this.f18414r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mb.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.c(this.f45420a, valueAnimator2);
            }
        });
        this.J = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
