package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f19889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f19890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f19891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f19892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mc.p f19894f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, mc.p pVar, Rect rect) {
        m0.g.d(rect.left);
        m0.g.d(rect.top);
        m0.g.d(rect.right);
        m0.g.d(rect.bottom);
        this.f19889a = rect;
        this.f19890b = colorStateList2;
        this.f19891c = colorStateList;
        this.f19892d = colorStateList3;
        this.f19893e = i10;
        this.f19894f = pVar;
    }

    static b a(Context context, int i10) {
        m0.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, sb.m.Y5);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.Z5, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.f51906b6, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.f51890a6, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.f51922c6, 0));
        ColorStateList colorStateListA = jc.c.a(context, typedArrayObtainStyledAttributes, sb.m.f51938d6);
        ColorStateList colorStateListA2 = jc.c.a(context, typedArrayObtainStyledAttributes, sb.m.f52014i6);
        ColorStateList colorStateListA3 = jc.c.a(context, typedArrayObtainStyledAttributes, sb.m.f51984g6);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.f51999h6, 0);
        mc.p pVarM = mc.p.h(context, typedArrayObtainStyledAttributes.getResourceId(sb.m.f51954e6, 0), typedArrayObtainStyledAttributes.getResourceId(sb.m.f51969f6, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, pVarM, rect);
    }

    mc.p b() {
        return this.f19894f;
    }

    void c(TextView textView) {
        d(textView, null, null);
    }

    void d(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        mc.i iVar = new mc.i();
        mc.i iVar2 = new mc.i();
        iVar.setShapeAppearanceModel(this.f19894f);
        iVar2.setShapeAppearanceModel(this.f19894f);
        if (colorStateList == null) {
            colorStateList = this.f19891c;
        }
        iVar.l0(colorStateList);
        iVar.x0(this.f19893e, this.f19892d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f19890b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f19890b.withAlpha(30), iVar, iVar2);
        Rect rect = this.f19889a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
