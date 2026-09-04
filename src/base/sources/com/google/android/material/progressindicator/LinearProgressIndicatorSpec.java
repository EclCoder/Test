package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicatorSpec extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f20702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f20704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f20706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20708y;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51644y);
    }

    @Override // com.google.android.material.progressindicator.b
    public boolean g() {
        return super.g() && j() == a();
    }

    @Override // com.google.android.material.progressindicator.b
    void h() {
        super.h();
        if (this.f20703t < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f20700q == 0) {
            if ((a() > 0 || (this.f20708y && j() > 0)) && this.f20738i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f20734e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    int i() {
        return Math.min(this.f20703t, this.f20730a);
    }

    public int j() {
        if (this.f20708y) {
            return this.f20707x ? (int) (this.f20730a * this.f20706w) : this.f20705v;
        }
        return a();
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f20699r);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayI = z.i(context, attributeSet, sb.m.f52072m4, sb.c.f51644y, LinearProgressIndicator.f20699r, new int[0]);
        this.f20700q = typedArrayI.getInt(sb.m.f52087n4, 1);
        this.f20701r = typedArrayI.getInt(sb.m.f52102o4, 0);
        this.f20703t = typedArrayI.getDimensionPixelSize(sb.m.f52147r4, 0);
        int i12 = sb.m.f52132q4;
        if (typedArrayI.hasValue(i12)) {
            this.f20704u = Integer.valueOf(typedArrayI.getDimensionPixelSize(i12, 0));
        }
        TypedValue typedValuePeekValue = typedArrayI.peekValue(sb.m.f52117p4);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.f20705v = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayI.getResources().getDisplayMetrics()), this.f20730a / 2);
                this.f20707x = false;
                this.f20708y = true;
            } else if (i13 == 6) {
                this.f20706w = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f20707x = true;
                this.f20708y = true;
            }
        }
        typedArrayI.recycle();
        h();
        this.f20702s = this.f20701r == 1;
    }
}
