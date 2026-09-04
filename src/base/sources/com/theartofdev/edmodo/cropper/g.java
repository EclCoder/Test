package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f35759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f35761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f35763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f35764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f35765j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f35756a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f35757b = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f35766k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f35767l = 1.0f;

    g() {
    }

    private boolean a() {
        return !s();
    }

    private h.b g(float f10, float f11) {
        float fWidth = this.f35756a.width() / 6.0f;
        RectF rectF = this.f35756a;
        float f12 = rectF.left;
        float f13 = f12 + fWidth;
        float f14 = f12 + (fWidth * 5.0f);
        float fHeight = rectF.height() / 6.0f;
        float f15 = this.f35756a.top;
        float f16 = f15 + fHeight;
        float f17 = f15 + (fHeight * 5.0f);
        if (f10 < f13) {
            if (f11 < f16) {
                return h.b.TOP_LEFT;
            }
            return f11 < f17 ? h.b.LEFT : h.b.BOTTOM_LEFT;
        }
        if (f10 < f14) {
            if (f11 < f16) {
                return h.b.TOP;
            }
            return f11 < f17 ? h.b.CENTER : h.b.BOTTOM;
        }
        if (f11 < f16) {
            return h.b.TOP_RIGHT;
        }
        return f11 < f17 ? h.b.RIGHT : h.b.BOTTOM_RIGHT;
    }

    private h.b i(float f10, float f11, float f12) {
        RectF rectF = this.f35756a;
        if (m(f10, f11, rectF.left, rectF.top, f12)) {
            return h.b.TOP_LEFT;
        }
        RectF rectF2 = this.f35756a;
        if (m(f10, f11, rectF2.right, rectF2.top, f12)) {
            return h.b.TOP_RIGHT;
        }
        RectF rectF3 = this.f35756a;
        if (m(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return h.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f35756a;
        if (m(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return h.b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f35756a;
        if (l(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && a()) {
            return h.b.CENTER;
        }
        RectF rectF6 = this.f35756a;
        if (n(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return h.b.TOP;
        }
        RectF rectF7 = this.f35756a;
        if (n(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return h.b.BOTTOM;
        }
        RectF rectF8 = this.f35756a;
        if (o(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return h.b.LEFT;
        }
        RectF rectF9 = this.f35756a;
        if (o(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return h.b.RIGHT;
        }
        RectF rectF10 = this.f35756a;
        if (!l(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || a()) {
            return null;
        }
        return h.b.CENTER;
    }

    private static boolean l(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    private static boolean m(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    private static boolean n(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    private static boolean o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    public float b() {
        return Math.min(this.f35761f, this.f35765j / this.f35767l);
    }

    public float c() {
        return Math.min(this.f35760e, this.f35764i / this.f35766k);
    }

    public float d() {
        return Math.max(this.f35759d, this.f35763h / this.f35767l);
    }

    public float e() {
        return Math.max(this.f35758c, this.f35762g / this.f35766k);
    }

    public h f(float f10, float f11, float f12, CropImageView.c cVar) {
        h.b bVarG = cVar == CropImageView.c.OVAL ? g(f10, f11) : i(f10, f11, f12);
        if (bVarG != null) {
            return new h(bVarG, this, f10, f11);
        }
        return null;
    }

    public RectF h() {
        this.f35757b.set(this.f35756a);
        return this.f35757b;
    }

    public float j() {
        return this.f35767l;
    }

    public float k() {
        return this.f35766k;
    }

    public void p(float f10, float f11, float f12, float f13) {
        this.f35760e = f10;
        this.f35761f = f11;
        this.f35766k = f12;
        this.f35767l = f13;
    }

    public void q(f fVar) {
        this.f35758c = fVar.f35753x;
        this.f35759d = fVar.f35754y;
        this.f35762g = fVar.f35755z;
        this.f35763h = fVar.A;
        this.f35764i = fVar.B;
        this.f35765j = fVar.C;
    }

    public void r(RectF rectF) {
        this.f35756a.set(rectF);
    }

    public boolean s() {
        return this.f35756a.width() >= 100.0f && this.f35756a.height() >= 100.0f;
    }
}
