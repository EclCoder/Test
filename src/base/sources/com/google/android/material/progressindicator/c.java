package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class c extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f20751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f20753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f20755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f20756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Pair f20757q;

    c(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f20756p = new RectF();
        this.f20757q = new Pair(new h.b(), new h.b());
    }

    private void j(Path path, h.b bVar, h.b bVar2) {
        float f10 = (this.f20750j / 2.0f) * 0.48f;
        h.b bVar3 = new h.b(this, bVar);
        h.b bVar4 = new h.b(this, bVar2);
        bVar3.b(f10);
        bVar4.b(-f10);
        float[] fArr = bVar3.f20829a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float[] fArr2 = bVar4.f20829a;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = bVar2.f20829a;
        path.cubicTo(f11, f12, f13, f14, fArr3[0], fArr3[1]);
    }

    private void k(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        float f14 = this.f20748h * f12;
        int i10 = this.f20754n ? ((CircularProgressIndicatorSpec) this.f20816a).f20739j : ((CircularProgressIndicatorSpec) this.f20816a).f20740k;
        float f15 = this.f20749i;
        if (f15 != this.f20753m || (pathMeasure == this.f20819d && (f14 != this.f20751k || i10 != this.f20752l))) {
            this.f20751k = f14;
            this.f20752l = i10;
            this.f20753m = f15;
            g();
        }
        path.rewind();
        float f16 = 0.0f;
        float fA = h0.a.a(f11, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.f20816a).b(this.f20754n)) {
            float f17 = f13 / ((float) ((((double) this.f20749i) * 6.283185307179586d) / ((double) this.f20750j)));
            f10 += f17;
            f16 = 0.0f - (f17 * 360.0f);
        }
        float f18 = f10 % 1.0f;
        float length = (pathMeasure.getLength() * f18) / 2.0f;
        float length2 = ((f18 + fA) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        h.b bVar = (h.b) pair.first;
        bVar.c();
        pathMeasure.getPosTan(length, bVar.f20829a, bVar.f20830b);
        h.b bVar2 = (h.b) pair.second;
        bVar2.c();
        pathMeasure.getPosTan(length2, bVar2.f20829a, bVar2.f20830b);
        this.f20820e.reset();
        this.f20820e.setRotate(f16);
        bVar.d(f16);
        bVar2.d(f16);
        path.transform(this.f20820e);
    }

    private void l(PathMeasure pathMeasure, Path path, float f10) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.f20754n ? ((CircularProgressIndicatorSpec) this.f20816a).f20739j : ((CircularProgressIndicatorSpec) this.f20816a).f20740k)) / 2.0f)) * 2;
        this.f20750j = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iMax; i10++) {
            h.b bVar = new h.b();
            float f11 = i10;
            pathMeasure.getPosTan(this.f20750j * f11, bVar.f20829a, bVar.f20830b);
            h.b bVar2 = new h.b();
            float f12 = this.f20750j;
            pathMeasure.getPosTan((f11 * f12) + (f12 / 2.0f), bVar2.f20829a, bVar2.f20830b);
            arrayList.add(bVar);
            bVar2.a(f10 * 2.0f);
            arrayList.add(bVar2);
        }
        arrayList.add((h.b) arrayList.get(0));
        h.b bVar3 = (h.b) arrayList.get(0);
        float[] fArr = bVar3.f20829a;
        int i11 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i11 < arrayList.size()) {
            h.b bVar4 = (h.b) arrayList.get(i11);
            j(path, bVar3, bVar4);
            i11++;
            bVar3 = bVar4;
        }
    }

    private void m(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f15 = f10 % 1.0f;
        if (f15 < 0.0f) {
            f15 += 1.0f;
        }
        if (this.f20755o < 1.0f) {
            float f16 = f15 + f14;
            if (f16 > 1.0f) {
                m(canvas, paint, f15, 1.0f, i10, i11, 0, f12, f13, z10);
                m(canvas, paint, 1.0f, f16, i10, 0, i12, f12, f13, z10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f20747g / this.f20749i);
        float f17 = f14 - 0.99f;
        if (f17 >= 0.0f) {
            float f18 = ((f17 * degrees) / 180.0f) / 0.01f;
            f14 += f18;
            if (!z10) {
                f15 -= f18 / 2.0f;
            }
        }
        float fD = fc.a.d(1.0f - this.f20755o, 1.0f, f15);
        float fD2 = fc.a.d(0.0f, this.f20755o, f14);
        float degrees2 = (float) Math.toDegrees(i11 / this.f20749i);
        float degrees3 = ((fD2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f20749i));
        float f19 = (fD * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z11 = ((CircularProgressIndicatorSpec) this.f20816a).b(this.f20754n) && z10 && f12 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f20746f);
        float f20 = this.f20747g * 2.0f;
        float f21 = degrees * 2.0f;
        if (degrees3 < f21) {
            float f22 = degrees3 / f21;
            float f23 = f19 + (degrees * f22);
            h.b bVar = new h.b();
            if (z11) {
                float length = ((f23 / 360.0f) * this.f20819d.getLength()) / 2.0f;
                float f24 = this.f20748h * f12;
                float f25 = this.f20749i;
                if (f25 != this.f20753m || f24 != this.f20751k) {
                    this.f20751k = f24;
                    this.f20753m = f25;
                    g();
                }
                this.f20819d.getPosTan(length, bVar.f20829a, bVar.f20830b);
            } else {
                bVar.d(f23 + 90.0f);
                bVar.a(-this.f20749i);
            }
            paint.setStyle(Paint.Style.FILL);
            o(canvas, paint, bVar, f20, this.f20746f, f22);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.f20816a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f19 + degrees;
        float f27 = degrees3 - f21;
        ((h.b) this.f20757q.first).c();
        ((h.b) this.f20757q.second).c();
        if (z11) {
            k(this.f20819d, this.f20818c, this.f20757q, f26 / 360.0f, f27 / 360.0f, f12, f13);
            canvas.drawPath(this.f20818c, paint);
        } else {
            ((h.b) this.f20757q.first).d(f26 + 90.0f);
            ((h.b) this.f20757q.first).a(-this.f20749i);
            ((h.b) this.f20757q.second).d(f26 + f27 + 90.0f);
            ((h.b) this.f20757q.second).a(-this.f20749i);
            RectF rectF = this.f20756p;
            float f28 = this.f20749i;
            rectF.set(-f28, -f28, f28, f28);
            canvas.drawArc(this.f20756p, f26, f27, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.f20816a).g() || this.f20747g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        n(canvas, paint, (h.b) this.f20757q.first, f20, this.f20746f);
        n(canvas, paint, (h.b) this.f20757q.second, f20, this.f20746f);
    }

    private void n(Canvas canvas, Paint paint, h.b bVar, float f10, float f11) {
        o(canvas, paint, bVar, f10, f11, 1.0f);
    }

    private void o(Canvas canvas, Paint paint, h.b bVar, float f10, float f11, float f12) {
        float fMin = Math.min(f11, this.f20746f);
        float f13 = f10 / 2.0f;
        float fMin2 = Math.min(f13, (this.f20747g * fMin) / this.f20746f);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f13, fMin / 2.0f);
        canvas.save();
        float[] fArr = bVar.f20829a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i(bVar.f20830b));
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int p() {
        b bVar = this.f20816a;
        return ((CircularProgressIndicatorSpec) bVar).f20695r + (((CircularProgressIndicatorSpec) bVar).f20696s * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        b bVar = this.f20816a;
        float f11 = (((CircularProgressIndicatorSpec) bVar).f20695r / 2.0f) + ((CircularProgressIndicatorSpec) bVar).f20696s;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.f20816a).f20697t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        b bVar2 = this.f20816a;
        this.f20746f = ((CircularProgressIndicatorSpec) bVar2).f20730a * f10;
        this.f20747g = Math.min(((CircularProgressIndicatorSpec) bVar2).f20730a / 2, ((CircularProgressIndicatorSpec) bVar2).a()) * f10;
        b bVar3 = this.f20816a;
        this.f20748h = ((CircularProgressIndicatorSpec) bVar3).f20741l * f10;
        float f13 = (((CircularProgressIndicatorSpec) bVar3).f20695r - ((CircularProgressIndicatorSpec) bVar3).f20730a) / 2.0f;
        this.f20749i = f13;
        if (z10 || z11) {
            float f14 = ((1.0f - f10) * ((CircularProgressIndicatorSpec) bVar3).f20730a) / 2.0f;
            if ((z10 && ((CircularProgressIndicatorSpec) bVar3).f20736g == 2) || (z11 && ((CircularProgressIndicatorSpec) bVar3).f20737h == 1)) {
                this.f20749i = f13 + f14;
            } else if ((z10 && ((CircularProgressIndicatorSpec) bVar3).f20736g == 1) || (z11 && ((CircularProgressIndicatorSpec) bVar3).f20737h == 2)) {
                this.f20749i = f13 - f14;
            }
        }
        if (z11 && ((CircularProgressIndicatorSpec) bVar3).f20737h == 3) {
            this.f20755o = f10;
        } else {
            this.f20755o = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void c(Canvas canvas, Paint paint, h.a aVar, int i10) {
        int iA = ac.a.a(aVar.f20823c, i10);
        canvas.save();
        canvas.rotate(aVar.f20827g);
        this.f20754n = aVar.f20828h;
        float f10 = aVar.f20821a;
        float f11 = aVar.f20822b;
        int i11 = aVar.f20824d;
        m(canvas, paint, f10, f11, iA, i11, i11, aVar.f20825e, aVar.f20826f, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.h
    void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int iA = ac.a.a(i10, i11);
        this.f20754n = false;
        m(canvas, paint, f10, f11, iA, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.h
    int e() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.h
    int f() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.h
    void g() {
        this.f20817b.rewind();
        this.f20817b.moveTo(1.0f, 0.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f20817b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.f20817b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.f20817b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.f20817b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.f20820e.reset();
        Matrix matrix = this.f20820e;
        float f10 = this.f20749i;
        matrix.setScale(f10, f10);
        this.f20817b.transform(this.f20820e);
        if (((CircularProgressIndicatorSpec) this.f20816a).b(this.f20754n)) {
            this.f20819d.setPath(this.f20817b, false);
            l(this.f20819d, this.f20817b, this.f20751k);
        }
        this.f20819d.setPath(this.f20817b, false);
    }

    @Override // com.google.android.material.progressindicator.h
    void b(Canvas canvas, Paint paint, int i10, int i11) {
    }
}
