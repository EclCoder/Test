package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class o extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f1659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f1661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1664i;

    o(SeekBar seekBar) {
        super(seekBar);
        this.f1661f = null;
        this.f1662g = null;
        this.f1663h = false;
        this.f1664i = false;
        this.f1659d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1660e;
        if (drawable != null) {
            if (this.f1663h || this.f1664i) {
                Drawable drawableR = f0.a.r(drawable.mutate());
                this.f1660e = drawableR;
                if (this.f1663h) {
                    f0.a.o(drawableR, this.f1661f);
                }
                if (this.f1664i) {
                    f0.a.p(this.f1660e, this.f1662g);
                }
                if (this.f1660e.isStateful()) {
                    this.f1660e.setState(this.f1659d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.m
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1659d.getContext();
        int[] iArr = h.j.V;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1659d;
        n0.q0.k0(seekBar, seekBar.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        Drawable drawableH = o0VarV.h(h.j.W);
        if (drawableH != null) {
            this.f1659d.setThumb(drawableH);
        }
        j(o0VarV.g(h.j.X));
        int i11 = h.j.Z;
        if (o0VarV.s(i11)) {
            this.f1662g = y.e(o0VarV.k(i11, -1), this.f1662g);
            this.f1664i = true;
        }
        int i12 = h.j.Y;
        if (o0VarV.s(i12)) {
            this.f1661f = o0VarV.c(i12);
            this.f1663h = true;
        }
        o0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1660e != null) {
            int max = this.f1659d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1660e.getIntrinsicWidth();
                int intrinsicHeight = this.f1660e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1660e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1659d.getWidth() - this.f1659d.getPaddingLeft()) - this.f1659d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1659d.getPaddingLeft(), this.f1659d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1660e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1660e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1659d.getDrawableState())) {
            this.f1659d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1660e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1660e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1660e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1659d);
            f0.a.m(drawable, this.f1659d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f1659d.getDrawableState());
            }
            f();
        }
        this.f1659d.invalidate();
    }
}
