package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f2529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    MotionLayout f2530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float[] f2531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Matrix f2532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f2533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f2535r;

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2529l = new Paint();
        this.f2531n = new float[2];
        this.f2532o = new Matrix();
        this.f2533p = 0;
        this.f2534q = -65281;
        this.f2535r = 0.25f;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.Y9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.Z9) {
                    this.f2534q = typedArrayObtainStyledAttributes.getColor(index, this.f2534q);
                } else if (index == f.f2815ba) {
                    this.f2533p = typedArrayObtainStyledAttributes.getInt(index, this.f2533p);
                } else if (index == f.f2802aa) {
                    this.f2535r = typedArrayObtainStyledAttributes.getFloat(index, this.f2535r);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2529l.setColor(this.f2534q);
        this.f2529l.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2532o);
        if (this.f2530m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2530m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f10 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f11 = fArr[i11];
                this.f2530m.s0(this, f11, f10, this.f2531n, this.f2533p);
                this.f2532o.mapVectors(this.f2531n);
                float f12 = width * f11;
                float f13 = height * f10;
                float[] fArr2 = this.f2531n;
                float f14 = fArr2[0];
                float f15 = this.f2535r;
                float f16 = f13 - (fArr2[1] * f15);
                this.f2532o.mapVectors(fArr2);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, this.f2529l);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2488f = charSequence.toString();
        requestLayout();
    }
}
