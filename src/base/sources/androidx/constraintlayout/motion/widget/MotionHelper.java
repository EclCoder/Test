package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View[] f2053m;

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2050j = false;
        this.f2051k = false;
        o(attributeSet);
    }

    public float getProgress() {
        return this.f2052l;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.f2970n9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.f.f2996p9) {
                    this.f2050j = typedArrayObtainStyledAttributes.getBoolean(index, this.f2050j);
                } else if (index == androidx.constraintlayout.widget.f.f2983o9) {
                    this.f2051k = typedArrayObtainStyledAttributes.getBoolean(index, this.f2051k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f2052l = f10;
        int i10 = 0;
        if (this.f2540b > 0) {
            this.f2053m = n((ConstraintLayout) getParent());
            while (i10 < this.f2540b) {
                E(this.f2053m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                E(childAt, f10);
            }
            i10++;
        }
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return this.f2051k;
    }

    public boolean z() {
        return this.f2050j;
    }

    public void A(MotionLayout motionLayout) {
    }

    public void B(Canvas canvas) {
    }

    public void C(Canvas canvas) {
    }

    public void D(MotionLayout motionLayout, HashMap map) {
    }

    public void E(View view, float f10) {
    }

    public void b(MotionLayout motionLayout, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void c(MotionLayout motionLayout, int i10, int i11) {
    }

    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void d(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }
}
