package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f19896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f19897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f19898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f19899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f19900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f19901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f19902h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(jc.b.j(context, sb.c.D, i.class.getCanonicalName()), sb.m.O5);
        this.f19895a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.S5, 0));
        this.f19901g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.Q5, 0));
        this.f19896b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.R5, 0));
        this.f19897c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.T5, 0));
        ColorStateList colorStateListA = jc.c.a(context, typedArrayObtainStyledAttributes, sb.m.U5);
        this.f19898d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.W5, 0));
        this.f19899e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.V5, 0));
        this.f19900f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.X5, 0));
        Paint paint = new Paint();
        this.f19902h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
