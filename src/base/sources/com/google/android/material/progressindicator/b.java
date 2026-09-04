package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f20734e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f20743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f20744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f20745p;

    protected b(Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(sb.e.f51672c1);
        TypedArray typedArrayI = z.i(context, attributeSet, sb.m.S, i10, i11, new int[0]);
        this.f20730a = jc.c.d(context, typedArrayI, sb.m.f51916c0, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayI.peekValue(sb.m.f51900b0);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                this.f20731b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayI.getResources().getDisplayMetrics()), this.f20730a / 2);
                this.f20733d = false;
            } else if (i12 == 6) {
                this.f20732c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f20733d = true;
            }
        }
        this.f20736g = typedArrayI.getInt(sb.m.Y, 0);
        this.f20737h = typedArrayI.getInt(sb.m.T, 0);
        this.f20738i = typedArrayI.getDimensionPixelSize(sb.m.W, 0);
        int iAbs = Math.abs(typedArrayI.getDimensionPixelSize(sb.m.f51993h0, 0));
        this.f20739j = Math.abs(typedArrayI.getDimensionPixelSize(sb.m.f52008i0, iAbs));
        this.f20740k = Math.abs(typedArrayI.getDimensionPixelSize(sb.m.f52023j0, iAbs));
        this.f20741l = Math.abs(typedArrayI.getDimensionPixelSize(sb.m.f51932d0, 0));
        this.f20742m = typedArrayI.getDimensionPixelSize(sb.m.f51978g0, 0);
        this.f20743n = typedArrayI.getFloat(sb.m.U, 1.0f);
        this.f20744o = typedArrayI.getFloat(sb.m.f51963f0, 0.1f);
        this.f20745p = typedArrayI.getFloat(sb.m.f51948e0, 0.9f);
        e(context, typedArrayI);
        f(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void e(Context context, TypedArray typedArray) {
        int i10 = sb.m.V;
        if (!typedArray.hasValue(i10)) {
            this.f20734e = new int[]{ac.a.b(context, h.a.f39870w, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f20734e = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f20734e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void f(Context context, TypedArray typedArray) {
        int i10 = sb.m.f51884a0;
        if (typedArray.hasValue(i10)) {
            this.f20735f = typedArray.getColor(i10, -1);
            return;
        }
        this.f20735f = this.f20734e[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f20735f = ac.a.a(this.f20735f, (int) (f10 * 255.0f));
    }

    public int a() {
        return this.f20733d ? (int) (this.f20730a * this.f20732c) : this.f20731b;
    }

    public boolean b(boolean z10) {
        if (this.f20741l <= 0) {
            return false;
        }
        if (z10 || this.f20740k <= 0) {
            return z10 && this.f20739j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.f20737h != 0;
    }

    public boolean d() {
        return this.f20736g != 0;
    }

    public boolean g() {
        return this.f20733d && this.f20732c == 0.5f;
    }

    void h() {
        if (this.f20738i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
