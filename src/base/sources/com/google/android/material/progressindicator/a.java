package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.internal.z;
import f1.e;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends ProgressBar {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f20709q = sb.l.W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.material.progressindicator.b f20710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ic.a f20717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f20720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f1.e.p f20721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f20722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f20723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f20724o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f20725p;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0314a implements Runnable {
        RunnableC0314a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.l();
            a.this.f20716g = -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.r(aVar.f20711b, a.this.f20712c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.f20718i) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f20719j);
        }
    }

    protected a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, f20709q), attributeSet, i10);
        this.f20716g = -1L;
        this.f20718i = false;
        this.f20719j = 4;
        this.f20721l = new f1.e.p() { // from class: ic.b
            @Override // f1.e.p
            public final void a(e eVar, boolean z10, float f10, float f11) {
                com.google.android.material.progressindicator.a.a(this.f41321a, eVar, z10, f10, f11);
            }
        };
        this.f20722m = new RunnableC0314a();
        this.f20723n = new b();
        this.f20724o = new c();
        this.f20725p = new d();
        Context context2 = getContext();
        this.f20710a = j(context2, attributeSet);
        TypedArray typedArrayI = z.i(context2, attributeSet, sb.m.S, i10, i11, new int[0]);
        this.f20714e = typedArrayI.getInt(sb.m.Z, -1);
        this.f20715f = Math.min(typedArrayI.getInt(sb.m.X, -1), 1000);
        typedArrayI.recycle();
        this.f20717h = new ic.a();
        this.f20713d = true;
    }

    public static /* synthetic */ void a(a aVar, f1.e eVar, boolean z10, float f10, float f11) {
        if (aVar.getProgressDrawable() == null || aVar.getProgressDrawable().getLevel() != 10000) {
            return;
        }
        aVar.k();
    }

    private h getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().y();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ((g) getCurrentDrawable()).s(false, false, true);
        if (o()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f20715f > 0) {
            this.f20716g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean o() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void p() {
        q();
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.f20725p);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.f20725p);
        }
    }

    private void s() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u(this.f20725p);
            getIndeterminateDrawable().x().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().u(this.f20725p);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f20710a.f20737h;
    }

    public int[] getIndicatorColor() {
        return this.f20710a.f20734e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f20710a.f20738i;
    }

    public int getShowAnimationBehavior() {
        return this.f20710a.f20736g;
    }

    public int getTrackColor() {
        return this.f20710a.f20735f;
    }

    public int getTrackCornerRadius() {
        return this.f20710a.f20731b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f20710a.f20732c;
    }

    public int getTrackThickness() {
        return this.f20710a.f20730a;
    }

    public int getWaveAmplitude() {
        return this.f20710a.f20741l;
    }

    public int getWaveSpeed() {
        return this.f20710a.f20742m;
    }

    public int getWavelengthDeterminate() {
        return this.f20710a.f20739j;
    }

    public int getWavelengthIndeterminate() {
        return this.f20710a.f20740k;
    }

    protected void i(boolean z10) {
        if (this.f20713d) {
            ((g) getCurrentDrawable()).s(t(), false, z10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    abstract com.google.android.material.progressindicator.b j(Context context, AttributeSet attributeSet);

    public void k() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f20722m);
            return;
        }
        removeCallbacks(this.f20723n);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f20716g;
        int i10 = this.f20715f;
        if (jUptimeMillis >= i10) {
            this.f20723n.run();
        } else {
            postDelayed(this.f20723n, ((long) i10) - jUptimeMillis);
        }
    }

    boolean n() {
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

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        p();
        if (t()) {
            m();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f20723n);
        removeCallbacks(this.f20722m);
        ((g) getCurrentDrawable()).j();
        s();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            h currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        i(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        i(false);
    }

    void q() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().x().d(this.f20724o);
    }

    public void r(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f20711b = i10;
            this.f20712c = z10;
            this.f20718i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f20717h.a(getContext().getContentResolver()) == 0.0f) {
                this.f20724o.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().x().f();
            }
        }
    }

    public void setAnimatorDurationScaleProvider(ic.a aVar) {
        this.f20717h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f20800c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f20800c = aVar;
        }
    }

    public void setHideAfterMaxProgress(boolean z10) {
        if (getProgressDrawable() == null) {
            return;
        }
        if (z10) {
            getProgressDrawable().A(this.f20721l);
        } else {
            getProgressDrawable().I(this.f20721l);
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f20710a.f20737h = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.j();
            }
            super.setIndeterminate(z10);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.s(t(), false, false);
            }
            if ((gVar2 instanceof j) && t()) {
                ((j) gVar2).x().g();
            }
            this.f20718i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20743n != f10) {
            bVar.f20743n = f10;
            getIndeterminateDrawable().x().c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof j) {
            ((g) drawable).j();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f20720k) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ac.a.b(getContext(), h.a.f39870w, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f20710a.f20734e = iArr;
        getIndeterminateDrawable().x().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20738i != i10) {
            bVar.f20738i = i10;
            bVar.h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        r(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof f)) {
            if (this.f20720k) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            f fVar = (f) drawable;
            fVar.j();
            super.setProgressDrawable(fVar);
            fVar.N(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f20710a.f20736g = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20735f != i10) {
            bVar.f20735f = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20731b != i10) {
            bVar.f20731b = Math.min(i10, bVar.f20730a / 2);
            this.f20710a.f20733d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20732c != f10) {
            bVar.f20732c = Math.min(f10, 0.5f);
            this.f20710a.f20733d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20730a != i10) {
            bVar.f20730a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f20719j = i10;
    }

    public void setWaveAmplitude(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20741l != i10) {
            bVar.f20741l = Math.abs(i10);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f10) {
        getProgressDrawable().O(f10);
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f10) {
        getProgressDrawable().P(f10);
        invalidate();
    }

    public void setWaveSpeed(int i10) {
        this.f20710a.f20742m = i10;
        getProgressDrawable().L(this.f20710a.f20742m != 0);
    }

    public void setWavelength(int i10) {
        setWavelengthDeterminate(i10);
        setWavelengthIndeterminate(i10);
    }

    public void setWavelengthDeterminate(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20739j != i10) {
            bVar.f20739j = Math.abs(i10);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i10) {
        com.google.android.material.progressindicator.b bVar = this.f20710a;
        if (bVar.f20740k != i10) {
            bVar.f20740k = Math.abs(i10);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    boolean t() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && n();
    }

    @Override // android.widget.ProgressBar
    public j getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
