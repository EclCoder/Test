package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f2632a;

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
        super.setVisibility(8);
    }

    private void c() {
        Log.v("Constraints", " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f2632a == null) {
            this.f2632a = new c();
        }
        this.f2632a.q(this);
        return this.f2632a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f2633x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f2634y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public float f2635z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2633x0 = 1.0f;
            this.f2634y0 = false;
            this.f2635z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2633x0 = 1.0f;
            this.f2634y0 = false;
            this.f2635z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.N4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.O4) {
                    this.f2633x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2633x0);
                } else if (index == f.Z4) {
                    this.f2635z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2635z0);
                    this.f2634y0 = true;
                } else if (index == f.W4) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == f.X4) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == f.V4) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == f.T4) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == f.U4) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == f.P4) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == f.Q4) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == f.R4) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == f.S4) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == f.Y4) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
