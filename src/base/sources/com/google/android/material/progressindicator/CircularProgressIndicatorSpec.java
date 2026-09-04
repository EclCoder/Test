package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicatorSpec extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20698u;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51608g);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f20693r);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(sb.e.f51669b1);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(sb.e.f51666a1);
        TypedArray typedArrayI = z.i(context, attributeSet, sb.m.f51995h2, i10, i11, new int[0]);
        this.f20694q = typedArrayI.getInt(sb.m.f52010i2, 0);
        this.f20695r = Math.max(jc.c.d(context, typedArrayI, sb.m.f52070m2, dimensionPixelSize), this.f20730a * 2);
        this.f20696s = jc.c.d(context, typedArrayI, sb.m.f52055l2, dimensionPixelSize2);
        this.f20697t = typedArrayI.getInt(sb.m.f52040k2, 0);
        this.f20698u = typedArrayI.getBoolean(sb.m.f52025j2, true);
        typedArrayI.recycle();
        h();
    }
}
