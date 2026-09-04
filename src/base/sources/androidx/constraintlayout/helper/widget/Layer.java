package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import x.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    private boolean A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ConstraintLayout f2027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected float f2030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f2031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f2032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f2033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected float f2034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected float f2035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f2036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    View[] f2037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f2039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2040z;

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2024j = Float.NaN;
        this.f2025k = Float.NaN;
        this.f2026l = Float.NaN;
        this.f2028n = 1.0f;
        this.f2029o = 1.0f;
        this.f2030p = Float.NaN;
        this.f2031q = Float.NaN;
        this.f2032r = Float.NaN;
        this.f2033s = Float.NaN;
        this.f2034t = Float.NaN;
        this.f2035u = Float.NaN;
        this.f2036v = true;
        this.f2037w = null;
        this.f2038x = 0.0f;
        this.f2039y = 0.0f;
    }

    private void y() {
        int i10;
        if (this.f2027m == null || (i10 = this.f2540b) == 0) {
            return;
        }
        View[] viewArr = this.f2037w;
        if (viewArr == null || viewArr.length != i10) {
            this.f2037w = new View[i10];
        }
        for (int i11 = 0; i11 < this.f2540b; i11++) {
            this.f2037w[i11] = this.f2027m.q(this.f2539a[i11]);
        }
    }

    private void z() {
        if (this.f2027m == null) {
            return;
        }
        if (this.f2037w == null) {
            y();
        }
        x();
        double radians = Float.isNaN(this.f2026l) ? 0.0d : Math.toRadians(this.f2026l);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f10 = this.f2028n;
        float f11 = f10 * fCos;
        float f12 = this.f2029o;
        float f13 = (-f12) * fSin;
        float f14 = f10 * fSin;
        float f15 = f12 * fCos;
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            View view = this.f2037w[i10];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f16 = left - this.f2030p;
            float f17 = top - this.f2031q;
            float f18 = (((f11 * f16) + (f13 * f17)) - f16) + this.f2038x;
            float f19 = (((f16 * f14) + (f15 * f17)) - f17) + this.f2039y;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f2029o);
            view.setScaleX(this.f2028n);
            if (!Float.isNaN(this.f2026l)) {
                view.setRotation(this.f2026l);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2543e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2949m1) {
                    this.f2040z = true;
                } else if (index == f.f3040t1) {
                    this.A = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2027m = (ConstraintLayout) getParent();
        if (this.f2040z || this.A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f2540b; i10++) {
                View viewQ = this.f2027m.q(this.f2539a[i10]);
                if (viewQ != null) {
                    if (this.f2040z) {
                        viewQ.setVisibility(visibility);
                    }
                    if (this.A && elevation > 0.0f) {
                        viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void r(ConstraintLayout constraintLayout) {
        y();
        this.f2030p = Float.NaN;
        this.f2031q = Float.NaN;
        e eVarB = ((ConstraintLayout.b) getLayoutParams()).b();
        eVarB.p1(0);
        eVarB.Q0(0);
        x();
        layout(((int) this.f2034t) - getPaddingLeft(), ((int) this.f2035u) - getPaddingTop(), ((int) this.f2032r) + getPaddingRight(), ((int) this.f2033s) + getPaddingBottom());
        z();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f10) {
        this.f2024j = f10;
        z();
    }

    @Override // android.view.View
    public void setPivotY(float f10) {
        this.f2025k = f10;
        z();
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.f2026l = f10;
        z();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        this.f2028n = f10;
        z();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        this.f2029o = f10;
        z();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        this.f2038x = f10;
        z();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        this.f2039y = f10;
        z();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void t(ConstraintLayout constraintLayout) {
        this.f2027m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f2026l = rotation;
        } else {
            if (Float.isNaN(this.f2026l)) {
                return;
            }
            this.f2026l = rotation;
        }
    }

    protected void x() {
        if (this.f2027m == null) {
            return;
        }
        if (this.f2036v || Float.isNaN(this.f2030p) || Float.isNaN(this.f2031q)) {
            if (!Float.isNaN(this.f2024j) && !Float.isNaN(this.f2025k)) {
                this.f2031q = this.f2025k;
                this.f2030p = this.f2024j;
                return;
            }
            View[] viewArrN = n(this.f2027m);
            int left = viewArrN[0].getLeft();
            int top = viewArrN[0].getTop();
            int right = viewArrN[0].getRight();
            int bottom = viewArrN[0].getBottom();
            for (int i10 = 0; i10 < this.f2540b; i10++) {
                View view = viewArrN[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f2032r = right;
            this.f2033s = bottom;
            this.f2034t = left;
            this.f2035u = top;
            if (Float.isNaN(this.f2024j)) {
                this.f2030p = (left + right) / 2;
            } else {
                this.f2030p = this.f2024j;
            }
            if (Float.isNaN(this.f2025k)) {
                this.f2031q = (top + bottom) / 2;
            } else {
                this.f2031q = this.f2025k;
            }
        }
    }
}
