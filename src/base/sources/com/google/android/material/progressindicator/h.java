package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.material.progressindicator.b f20816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Path f20817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Path f20818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final PathMeasure f20819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Matrix f20820e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f20821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f20822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f20824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f20825e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f20826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f20827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f20828h;

        protected a() {
        }
    }

    public h(com.google.android.material.progressindicator.b bVar) {
        Path path = new Path();
        this.f20817b = path;
        this.f20818c = new Path();
        this.f20819d = new PathMeasure(path, false);
        this.f20816a = bVar;
        this.f20820e = new Matrix();
    }

    abstract void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11);

    abstract void b(Canvas canvas, Paint paint, int i10, int i11);

    abstract void c(Canvas canvas, Paint paint, a aVar, int i10);

    abstract void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12);

    abstract int e();

    abstract int f();

    abstract void g();

    void h(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f20816a.h();
        a(canvas, rect, f10, z10, z11);
    }

    float i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f20829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float[] f20830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Matrix f20831c;

        public b() {
            this.f20829a = new float[2];
            this.f20830b = new float[]{1.0f, 0.0f};
            this.f20831c = new Matrix();
        }

        void a(float f10) {
            float[] fArr = this.f20830b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.f20829a;
            double d10 = f10;
            double d11 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d11) * d10));
            float[] fArr3 = this.f20829a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d10 * Math.sin(d11)));
        }

        void b(float f10) {
            float[] fArr = this.f20830b;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.f20829a;
            double d10 = f10;
            double d11 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d11) * d10));
            float[] fArr3 = this.f20829a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d10 * Math.sin(d11)));
        }

        public void c() {
            Arrays.fill(this.f20829a, 0.0f);
            Arrays.fill(this.f20830b, 0.0f);
            this.f20830b[0] = 1.0f;
            this.f20831c.reset();
        }

        public void d(float f10) {
            this.f20831c.reset();
            this.f20831c.setRotate(f10);
            this.f20831c.mapPoints(this.f20829a);
            this.f20831c.mapPoints(this.f20830b);
        }

        void e(float f10, float f11) {
            float[] fArr = this.f20829a;
            fArr[0] = fArr[0] * f10;
            fArr[1] = fArr[1] * f11;
            float[] fArr2 = this.f20830b;
            fArr2[0] = fArr2[0] * f10;
            fArr2[1] = fArr2[1] * f11;
        }

        void f(float f10, float f11) {
            float[] fArr = this.f20829a;
            fArr[0] = fArr[0] + f10;
            fArr[1] = fArr[1] + f11;
        }

        public b(h hVar, b bVar) {
            this(bVar.f20829a, bVar.f20830b);
        }

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f20829a = fArr3;
            this.f20830b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f20830b, 0, 2);
            this.f20831c = new Matrix();
        }
    }
}
