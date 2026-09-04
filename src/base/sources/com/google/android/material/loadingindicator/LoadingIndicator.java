package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.internal.z;
import java.util.Arrays;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f20478h = l.f51882z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.loadingindicator.b f20479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoadingIndicatorSpec f20480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f20484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f20485g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingIndicator.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingIndicator.this.d();
            LoadingIndicator.this.f20483e = -1L;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoadingIndicator(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20478h;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20483e = -1L;
        this.f20484f = new a();
        this.f20485g = new b();
        Context context2 = getContext();
        com.google.android.material.loadingindicator.b bVarA = com.google.android.material.loadingindicator.b.a(context2, new LoadingIndicatorSpec(context2, attributeSet, i10));
        this.f20479a = bVarA;
        bVarA.setCallback(this);
        this.f20480b = bVarA.c().f20515a;
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52252y4, i10, i11, new int[0]);
        this.f20481c = typedArrayI.getInt(m.F4, -1);
        this.f20482d = Math.min(typedArrayI.getInt(m.E4, -1), 1000);
        typedArrayI.recycle();
        setAnimatorDurationScaleProvider(new ic.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        getDrawable().f(false, false, true);
        if (getDrawable().isVisible()) {
            return;
        }
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f20482d > 0) {
            this.f20483e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    boolean f() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    boolean g() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && f();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.f20480b.f20493f;
    }

    public int getContainerHeight() {
        return this.f20480b.f20491d;
    }

    public int getContainerWidth() {
        return this.f20480b.f20490c;
    }

    public com.google.android.material.loadingindicator.b getDrawable() {
        return this.f20479a;
    }

    public int[] getIndicatorColor() {
        return this.f20480b.f20492e;
    }

    public int getIndicatorSize() {
        return this.f20480b.f20489b;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            e();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.f20479a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        c cVarC = this.f20479a.c();
        int iE = cVarC.e() + getPaddingLeft() + getPaddingRight();
        int iD = cVarC.d() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(size, iE), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(iE, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, iD), 1073741824);
        } else if (mode2 == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(iD, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f20479a.setBounds(0, 0, i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f20479a.f(g(), false, i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f20479a.f(g(), false, i10 == 0);
    }

    public void setAnimatorDurationScaleProvider(ic.a aVar) {
        this.f20479a.f20505a = aVar;
    }

    public void setContainerColor(int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20480b;
        if (loadingIndicatorSpec.f20493f != i10) {
            loadingIndicatorSpec.f20493f = i10;
            invalidate();
        }
    }

    public void setContainerHeight(int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20480b;
        if (loadingIndicatorSpec.f20491d != i10) {
            loadingIndicatorSpec.f20491d = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20480b;
        if (loadingIndicatorSpec.f20490c != i10) {
            loadingIndicatorSpec.f20490c = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ac.a.b(getContext(), h.a.f39870w, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f20480b.f20492e = iArr;
        this.f20479a.b().h();
        invalidate();
    }

    public void setIndicatorSize(int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20480b;
        if (loadingIndicatorSpec.f20489b != i10) {
            loadingIndicatorSpec.f20489b = i10;
            requestLayout();
            invalidate();
        }
    }
}
