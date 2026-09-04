package com.google.android.material.loadingindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import l1.m;
import l1.u;
import l1.x;
import mc.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u[] f20513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m[] f20514e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LoadingIndicatorSpec f20515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Path f20516b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Matrix f20517c = new Matrix();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f20519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f20520c;

        protected a() {
        }
    }

    static {
        u[] uVarArr = {k.Q(k.E, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45649y, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45642r, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45638n, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45644t, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45646v, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), k.Q(k.f45637m, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        f20513d = uVarArr;
        f20514e = new m[uVarArr.length];
        int i10 = 0;
        while (true) {
            u[] uVarArr2 = f20513d;
            if (i10 >= uVarArr2.length) {
                return;
            }
            int i11 = i10 + 1;
            f20514e[i10] = new m(uVarArr2[i10], uVarArr2[i11 % uVarArr2.length]);
            i10 = i11;
        }
    }

    public c(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f20515a = loadingIndicatorSpec;
    }

    void a(Canvas canvas, Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.f20515a.f20488a) {
            float fMin = Math.min(rect.width() / e(), rect.height() / d());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-e()) / 2.0f, (-d()) / 2.0f, e() / 2.0f, d() / 2.0f);
        canvas.rotate(-90.0f);
    }

    void b(Canvas canvas, Paint paint, int i10, int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20515a;
        float fMin = Math.min(loadingIndicatorSpec.f20490c, loadingIndicatorSpec.f20491d) / 2.0f;
        paint.setColor(ac.a.a(i10, i11));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.f20515a;
        int i12 = loadingIndicatorSpec2.f20490c;
        int i13 = loadingIndicatorSpec2.f20491d;
        canvas.drawRoundRect(new RectF((-i12) / 2.0f, (-i13) / 2.0f, i12 / 2.0f, i13 / 2.0f), fMin, fMin, paint);
    }

    void c(Canvas canvas, Paint paint, a aVar, int i10) {
        paint.setColor(ac.a.a(aVar.f20518a, i10));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(aVar.f20520c);
        this.f20516b.rewind();
        int iFloor = (int) Math.floor(aVar.f20519b);
        m[] mVarArr = f20514e;
        x.b(mVarArr[fc.a.c(iFloor, mVarArr.length)], aVar.f20519b - iFloor, this.f20516b);
        Matrix matrix = this.f20517c;
        int i11 = this.f20515a.f20489b;
        matrix.setScale(i11 / 2.0f, i11 / 2.0f);
        this.f20516b.transform(this.f20517c);
        canvas.drawPath(this.f20516b, paint);
        canvas.restore();
    }

    int d() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20515a;
        return Math.max(loadingIndicatorSpec.f20490c, loadingIndicatorSpec.f20489b);
    }

    int e() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20515a;
        return Math.max(loadingIndicatorSpec.f20491d, loadingIndicatorSpec.f20489b);
    }
}
