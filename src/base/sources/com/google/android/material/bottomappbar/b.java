package com.google.android.material.bottomappbar;

import mc.g;
import mc.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class b extends g implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f19447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f19449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f19450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19452f = -1.0f;

    public b(float f10, float f11, float f12) {
        this.f19448b = f10;
        this.f19447a = f11;
        l(f12);
        this.f19451e = 0.0f;
    }

    @Override // mc.g
    public void c(float f10, float f11, float f12, r rVar) {
        float f13;
        float f14;
        float f15 = this.f19449c;
        if (f15 == 0.0f) {
            rVar.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f19448b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f19447a;
        float f18 = f11 + this.f19451e;
        float f19 = (this.f19450d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            rVar.m(f10, 0.0f);
            return;
        }
        float f20 = this.f19452f;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        rVar.m(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        rVar.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            rVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f19448b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            rVar.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f19448b;
            rVar.m(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f19448b;
            rVar.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        rVar.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        rVar.m(f10, 0.0f);
    }

    float e() {
        return this.f19450d;
    }

    public float f() {
        return this.f19452f;
    }

    float g() {
        return this.f19448b;
    }

    float i() {
        return this.f19447a;
    }

    public float j() {
        return this.f19449c;
    }

    public float k() {
        return this.f19451e;
    }

    void l(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f19450d = f10;
    }

    public void m(float f10) {
        this.f19452f = f10;
    }

    void n(float f10) {
        this.f19448b = f10;
    }

    void o(float f10) {
        this.f19447a = f10;
    }

    public void p(float f10) {
        this.f19449c = f10;
    }

    void q(float f10) {
        this.f19451e = f10;
    }
}
