package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.focus.FocusRingDrawable;
import mc.p;
import mc.s;
import mc.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaskableFrameLayout extends FrameLayout implements g, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f19727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f19728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f19729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f19730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f19731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f19732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnHoverListener f19733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19734h;

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19727a = -1.0f;
        this.f19728b = new RectF();
        this.f19729c = new Rect();
        this.f19731e = t.a(this);
        this.f19732f = null;
        this.f19734h = false;
        setShapeAppearanceModel(p.l(context, attributeSet, i10, 0, 0).m());
    }

    public static /* synthetic */ mc.d a(mc.d dVar) {
        return dVar instanceof mc.a ? mc.c.b((mc.a) dVar) : dVar;
    }

    private void c(Drawable drawable, p pVar) {
        FocusRingDrawable focusRingDrawableN = FocusRingDrawable.n(drawable);
        if (focusRingDrawableN != null) {
            focusRingDrawableN.E(pVar);
        }
    }

    private void d() {
        this.f19731e.f(this, this.f19728b);
    }

    private void e() {
        if (this.f19727a != -1.0f) {
            float fB = tb.b.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f19727a);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f19731e.e(canvas, new xb.a.InterfaceC0873a() { // from class: yb.e
            @Override // xb.a.InterfaceC0873a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f19728b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f19728b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f19727a;
    }

    public p getShapeAppearanceModel() {
        return this.f19730d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f19732f;
        if (bool != null) {
            this.f19731e.h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f19732f = Boolean.valueOf(this.f19731e.c());
        this.f19731e.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f19728b.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.f19728b.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.f19734h && this.f19733g != null) {
                    motionEvent.setAction(10);
                    this.f19733g.onHover(this, motionEvent);
                }
                this.f19734h = false;
                return false;
            }
        }
        if (this.f19733g != null) {
            if (!this.f19734h && action == 7) {
                motionEvent.setAction(9);
                this.f19734h = true;
            }
            if (action == 7 || action == 9) {
                this.f19734h = true;
            }
            this.f19733g.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.f19729c);
        if (getX() > 0.0f) {
            Rect rect = this.f19729c;
            rect.left = (int) (rect.left + this.f19728b.left);
        }
        if (getY() > 0.0f) {
            Rect rect2 = this.f19729c;
            rect2.top = (int) (rect2.top + this.f19728b.top);
        }
        Rect rect3 = this.f19729c;
        rect3.right = rect3.left + Math.round(this.f19728b.width());
        Rect rect4 = this.f19729c;
        rect4.bottom = rect4.top + Math.round(this.f19728b.height());
        accessibilityNodeInfo.setBoundsInScreen(this.f19729c);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f19728b.isEmpty()) {
            if (!this.f19728b.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f19727a != -1.0f) {
            e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f19728b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f19728b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z10) {
        this.f19731e.h(this, z10);
    }

    @Override // com.google.android.material.carousel.g
    public void setMaskRectF(RectF rectF) {
        this.f19728b.set(rectF);
        d();
    }

    @Deprecated
    public void setMaskXPercentage(float f10) {
        float fA = h0.a.a(f10, 0.0f, 1.0f);
        if (this.f19727a != fA) {
            this.f19727a = fA;
            e();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.f19733g = onHoverListener;
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        p pVarG = pVar.G(new p.c() { // from class: yb.d
            @Override // mc.p.c
            public final mc.d a(mc.d dVar) {
                return MaskableFrameLayout.a(dVar);
            }
        });
        this.f19730d = pVarG;
        this.f19731e.g(this, pVarG);
        c(getBackground(), this.f19730d);
        c(getForeground(), this.f19730d);
    }

    public void setOnMaskChangedListener(yb.f fVar) {
    }
}
