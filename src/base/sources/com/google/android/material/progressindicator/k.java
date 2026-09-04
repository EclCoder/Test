package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class k extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f20843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f20846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Pair f20847o;

    k(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f20838f = 300.0f;
        this.f20847o = new Pair(new h.b(), new h.b());
    }

    private void j(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        int i10 = this.f20845m ? ((LinearProgressIndicatorSpec) this.f20816a).f20739j : ((LinearProgressIndicatorSpec) this.f20816a).f20740k;
        if (pathMeasure == this.f20819d && i10 != this.f20844l) {
            this.f20844l = i10;
            g();
        }
        path.rewind();
        float f14 = (-this.f20838f) / 2.0f;
        boolean zB = ((LinearProgressIndicatorSpec) this.f20816a).b(this.f20845m);
        if (zB) {
            float f15 = this.f20838f;
            float f16 = this.f20843k;
            float f17 = f15 / f16;
            float f18 = f13 / f17;
            float f19 = f17 / (f17 + 1.0f);
            f10 = (f10 + f18) * f19;
            f11 = (f11 + f18) * f19;
            f14 -= f13 * f16;
        }
        float length = f10 * pathMeasure.getLength();
        float length2 = f11 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        h.b bVar = (h.b) pair.first;
        bVar.c();
        pathMeasure.getPosTan(length, bVar.f20829a, bVar.f20830b);
        h.b bVar2 = (h.b) pair.second;
        bVar2.c();
        pathMeasure.getPosTan(length2, bVar2.f20829a, bVar2.f20830b);
        this.f20820e.reset();
        this.f20820e.setTranslate(f14, 0.0f);
        bVar.f(f14, 0.0f);
        bVar2.f(f14, 0.0f);
        if (zB) {
            float f20 = this.f20842j * f12;
            this.f20820e.postScale(1.0f, f20);
            bVar.e(1.0f, f20);
            bVar2.e(1.0f, f20);
        }
        path.transform(this.f20820e);
    }

    private void k(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14;
        float fD;
        Paint paint2;
        Canvas canvas2;
        float fA = h0.a.a(f10, 0.0f, 1.0f);
        float fA2 = h0.a.a(f11, 0.0f, 1.0f);
        float fD2 = fc.a.d(1.0f - this.f20846n, 1.0f, fA);
        float fD3 = fc.a.d(1.0f - this.f20846n, 1.0f, fA2);
        int iA = (int) ((i11 * h0.a.a(fD2, 0.0f, 0.01f)) / 0.01f);
        int iA2 = (int) ((i12 * (1.0f - h0.a.a(fD3, 0.99f, 1.0f))) / 0.01f);
        float f15 = this.f20838f;
        int i13 = (int) ((fD2 * f15) + iA);
        int i14 = (int) ((fD3 * f15) - iA2);
        float f16 = this.f20840h;
        float f17 = this.f20841i;
        if (f16 != f17) {
            float fMax = Math.max(f16, f17);
            float f18 = this.f20838f;
            float f19 = fMax / f18;
            float fD4 = fc.a.d(this.f20840h, this.f20841i, h0.a.a(i13 / f18, 0.0f, f19) / f19);
            float f20 = this.f20840h;
            float f21 = this.f20841i;
            float f22 = this.f20838f;
            fD = fc.a.d(f20, f21, h0.a.a((f22 - i14) / f22, 0.0f, f19) / f19);
            f14 = fD4;
        } else {
            f14 = f16;
            fD = f14;
        }
        float f23 = (-this.f20838f) / 2.0f;
        boolean z11 = ((LinearProgressIndicatorSpec) this.f20816a).b(this.f20845m) && z10 && f12 > 0.0f;
        if (i13 <= i14) {
            float f24 = i13 + f14;
            float f25 = i14 - fD;
            float f26 = f14 * 2.0f;
            float f27 = 2.0f * fD;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f20839g);
            ((h.b) this.f20847o.first).c();
            ((h.b) this.f20847o.second).c();
            ((h.b) this.f20847o.first).f(f24 + f23, 0.0f);
            ((h.b) this.f20847o.second).f(f23 + f25, 0.0f);
            if (i13 == 0 && f25 + fD < f24 + f14) {
                Pair pair = this.f20847o;
                h.b bVar = (h.b) pair.first;
                float f28 = this.f20839g;
                m(canvas, paint, bVar, f26, f28, f14, (h.b) pair.second, f27, f28, fD, true);
                return;
            }
            if (f24 - f14 > f25 - fD) {
                Pair pair2 = this.f20847o;
                h.b bVar2 = (h.b) pair2.second;
                float f29 = this.f20839g;
                m(canvas, paint, bVar2, f27, f29, fD, (h.b) pair2.first, f26, f29, f14, false);
                return;
            }
            float f30 = fD;
            float f31 = f14;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.f20816a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z11) {
                paint2 = paint;
                PathMeasure pathMeasure = this.f20819d;
                Path path = this.f20818c;
                Pair pair3 = this.f20847o;
                float f32 = this.f20838f;
                j(pathMeasure, path, pair3, f24 / f32, f25 / f32, f12, f13);
                canvas2 = canvas;
                canvas2.drawPath(this.f20818c, paint2);
            } else {
                Pair pair4 = this.f20847o;
                Object obj = pair4.first;
                float f33 = ((h.b) obj).f20829a[0];
                float f34 = ((h.b) obj).f20829a[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f33, f34, ((h.b) obj2).f20829a[0], ((h.b) obj2).f20829a[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.f20816a).g()) {
                return;
            }
            if (f24 > 0.0f && f31 > 0.0f) {
                l(canvas2, paint2, (h.b) this.f20847o.first, f26, this.f20839g, f31);
            }
            if (f25 >= this.f20838f || f30 <= 0.0f) {
                return;
            }
            l(canvas, paint, (h.b) this.f20847o.second, f27, this.f20839g, f30);
        }
    }

    private void l(Canvas canvas, Paint paint, h.b bVar, float f10, float f11, float f12) {
        m(canvas, paint, bVar, f10, f11, f12, null, 0.0f, 0.0f, 0.0f, false);
    }

    private void m(Canvas canvas, Paint paint, h.b bVar, float f10, float f11, float f12, h.b bVar2, float f13, float f14, float f15, boolean z10) {
        char c10;
        float f16;
        float f17;
        float fMin = Math.min(f11, this.f20839g);
        float f18 = (-f10) / 2.0f;
        float f19 = (-fMin) / 2.0f;
        float f20 = f10 / 2.0f;
        float f21 = fMin / 2.0f;
        RectF rectF = new RectF(f18, f19, f20, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (bVar2 != null) {
            float fMin2 = Math.min(f14, this.f20839g);
            float fMin3 = Math.min(f13 / 2.0f, (f15 * fMin2) / this.f20839g);
            RectF rectF2 = new RectF();
            if (z10) {
                c10 = 0;
                float f22 = (bVar2.f20829a[0] - fMin3) - (bVar.f20829a[0] - f12);
                if (f22 > 0.0f) {
                    bVar2.f((-f22) / 2.0f, 0.0f);
                    f17 = f13 + f22;
                } else {
                    f17 = f13;
                }
                rectF2.set(0.0f, f19, f20, f21);
            } else {
                c10 = 0;
                float f23 = (bVar2.f20829a[0] + fMin3) - (bVar.f20829a[0] + f12);
                if (f23 < 0.0f) {
                    bVar2.f((-f23) / 2.0f, 0.0f);
                    f16 = f13 - f23;
                } else {
                    f16 = f13;
                }
                rectF2.set(f18, f19, 0.0f, f21);
                f17 = f16;
            }
            RectF rectF3 = new RectF((-f17) / 2.0f, (-fMin2) / 2.0f, f17 / 2.0f, fMin2 / 2.0f);
            float[] fArr = bVar2.f20829a;
            canvas.translate(fArr[c10], fArr[1]);
            canvas.rotate(i(bVar2.f20830b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(bVar2.f20830b));
            float[] fArr2 = bVar2.f20829a;
            canvas.translate(-fArr2[c10], -fArr2[1]);
            float[] fArr3 = bVar.f20829a;
            canvas.translate(fArr3[c10], fArr3[1]);
            canvas.rotate(i(bVar.f20830b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f12, f12, paint);
        } else {
            float[] fArr4 = bVar.f20829a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(bVar.f20830b));
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.h
    void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        if (this.f20838f != rect.width()) {
            this.f20838f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - fE) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f20816a).f20702s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f20838f / 2.0f;
        float f12 = fE / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        b bVar = this.f20816a;
        this.f20839g = ((LinearProgressIndicatorSpec) bVar).f20730a * f10;
        this.f20840h = Math.min(((LinearProgressIndicatorSpec) bVar).f20730a / 2, ((LinearProgressIndicatorSpec) bVar).a()) * f10;
        b bVar2 = this.f20816a;
        this.f20842j = ((LinearProgressIndicatorSpec) bVar2).f20741l * f10;
        this.f20841i = Math.min(((LinearProgressIndicatorSpec) bVar2).f20730a / 2.0f, ((LinearProgressIndicatorSpec) bVar2).j()) * f10;
        if (z10 || z11) {
            if ((z10 && ((LinearProgressIndicatorSpec) this.f20816a).f20736g == 2) || (z11 && ((LinearProgressIndicatorSpec) this.f20816a).f20737h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((LinearProgressIndicatorSpec) this.f20816a).f20737h != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f20816a).f20730a * (1.0f - f10)) / 2.0f);
            }
        }
        if (z11 && ((LinearProgressIndicatorSpec) this.f20816a).f20737h == 3) {
            this.f20846n = f10;
        } else {
            this.f20846n = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(Canvas canvas, Paint paint, int i10, int i11) {
        int iA = ac.a.a(i10, i11);
        this.f20845m = false;
        int i12 = ((LinearProgressIndicatorSpec) this.f20816a).i();
        if (i12 <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        b bVar = this.f20816a;
        float f10 = i12;
        l(canvas, paint, new h.b(new float[]{(this.f20838f / 2.0f) - (((LinearProgressIndicatorSpec) bVar).f20704u != null ? ((LinearProgressIndicatorSpec) bVar).f20704u.floatValue() + (((LinearProgressIndicatorSpec) this.f20816a).f20703t / 2.0f) : this.f20839g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f10, f10, (this.f20840h * f10) / this.f20839g);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(Canvas canvas, Paint paint, h.a aVar, int i10) {
        int iA = ac.a.a(aVar.f20823c, i10);
        this.f20845m = aVar.f20828h;
        float f10 = aVar.f20821a;
        float f11 = aVar.f20822b;
        int i11 = aVar.f20824d;
        k(canvas, paint, f10, f11, iA, i11, i11, aVar.f20825e, aVar.f20826f, true);
    }

    @Override // com.google.android.material.progressindicator.h
    void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int iA = ac.a.a(i10, i11);
        this.f20845m = false;
        k(canvas, paint, f10, f11, iA, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.h
    int e() {
        b bVar = this.f20816a;
        return ((LinearProgressIndicatorSpec) bVar).f20730a + (((LinearProgressIndicatorSpec) bVar).f20741l * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    int f() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.h
    void g() {
        this.f20817b.rewind();
        if (((LinearProgressIndicatorSpec) this.f20816a).b(this.f20845m)) {
            int i10 = this.f20845m ? ((LinearProgressIndicatorSpec) this.f20816a).f20739j : ((LinearProgressIndicatorSpec) this.f20816a).f20740k;
            float f10 = this.f20838f;
            int i11 = (int) (f10 / i10);
            this.f20843k = f10 / i11;
            for (int i12 = 0; i12 <= i11; i12++) {
                int i13 = i12 * 2;
                float f11 = i13 + 1;
                this.f20817b.cubicTo(i13 + 0.48f, 0.0f, f11 - 0.48f, 1.0f, f11, 1.0f);
                float f12 = i13 + 2;
                this.f20817b.cubicTo(f11 + 0.48f, 1.0f, f12 - 0.48f, 0.0f, f12, 0.0f);
            }
            this.f20820e.reset();
            this.f20820e.setScale(this.f20843k / 2.0f, -2.0f);
            this.f20820e.postTranslate(0.0f, 1.0f);
            this.f20817b.transform(this.f20820e);
        } else {
            this.f20817b.lineTo(this.f20838f, 0.0f);
        }
        this.f20819d.setPath(this.f20817b, false);
    }
}
