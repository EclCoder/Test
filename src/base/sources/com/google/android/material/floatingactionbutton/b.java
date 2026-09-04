package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import m0.g;
import tb.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtendedFloatingActionButton f20104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f20105c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f20106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f20107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f20108f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int iAlpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            return Float.valueOf(iAlpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.i0(extendedFloatingActionButton.getOriginalTextColor());
            } else {
                int currentOriginalTextColor = extendedFloatingActionButton.getCurrentOriginalTextColor();
                extendedFloatingActionButton.i0(ColorStateList.valueOf(e0.a.k(currentOriginalTextColor, Math.round(tb.b.a(0.0f, Color.alpha(currentOriginalTextColor), f10.floatValue())))));
            }
        }
    }

    b(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f20104b = extendedFloatingActionButton;
        this.f20103a = extendedFloatingActionButton.getContext();
        this.f20106d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void a() {
        this.f20106d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public h c() {
        return this.f20108f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void e() {
        this.f20106d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void g(h hVar) {
        this.f20108f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet h() {
        return k(l());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final List i() {
        return this.f20105c;
    }

    AnimatorSet k(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.i("opacity")) {
            arrayList.add(hVar.f("opacity", this.f20104b, View.ALPHA));
        }
        if (hVar.i("scale")) {
            arrayList.add(hVar.f("scale", this.f20104b, View.SCALE_Y));
            arrayList.add(hVar.f("scale", this.f20104b, View.SCALE_X));
        }
        if (hVar.i("width")) {
            arrayList.add(hVar.f("width", this.f20104b, ExtendedFloatingActionButton.f20041o0));
        }
        if (hVar.i("height")) {
            arrayList.add(hVar.f("height", this.f20104b, ExtendedFloatingActionButton.f20042p0));
        }
        if (hVar.i("paddingStart")) {
            arrayList.add(hVar.f("paddingStart", this.f20104b, ExtendedFloatingActionButton.f20043q0));
        }
        if (hVar.i("paddingEnd")) {
            arrayList.add(hVar.f("paddingEnd", this.f20104b, ExtendedFloatingActionButton.f20044r0));
        }
        if (hVar.i("labelOpacity")) {
            arrayList.add(hVar.f("labelOpacity", this.f20104b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        tb.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final h l() {
        h hVar = this.f20108f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f20107e == null) {
            this.f20107e = h.d(this.f20103a, f());
        }
        return (h) g.g(this.f20107e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void onAnimationStart(Animator animator) {
        this.f20106d.c(animator);
    }
}
