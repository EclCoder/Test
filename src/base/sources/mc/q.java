package mc;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r[] f45682a = new r[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f45683b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f45684c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f45685d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f45686e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f45687f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f45688g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f45689h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f45690i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f45691j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f45692k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45693l = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f45694a = new q();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(r rVar, Matrix matrix, int i10);

        void b(r rVar, Matrix matrix, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f45695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f45696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f45697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f45698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45699e;

        c(p pVar, float f10, RectF rectF, b bVar, Path path) {
            this.f45698d = bVar;
            this.f45695a = pVar;
            this.f45699e = f10;
            this.f45697c = rectF;
            this.f45696b = path;
        }
    }

    public q() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f45682a[i10] = new r();
            this.f45683b[i10] = new Matrix();
            this.f45684c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f45689h[0] = this.f45682a[i10].k();
        this.f45689h[1] = this.f45682a[i10].l();
        this.f45683b[i10].mapPoints(this.f45689h);
        if (i10 == 0) {
            Path path = cVar.f45696b;
            float[] fArr = this.f45689h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f45696b;
            float[] fArr2 = this.f45689h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f45682a[i10].d(this.f45683b[i10], cVar.f45696b);
        b bVar = cVar.f45698d;
        if (bVar != null) {
            bVar.a(this.f45682a[i10], this.f45683b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f45689h[0] = this.f45682a[i10].i();
        this.f45689h[1] = this.f45682a[i10].j();
        this.f45683b[i10].mapPoints(this.f45689h);
        this.f45690i[0] = this.f45682a[i11].k();
        this.f45690i[1] = this.f45682a[i11].l();
        this.f45683b[i11].mapPoints(this.f45690i);
        float[] fArr = this.f45689h;
        float f10 = fArr[0];
        float[] fArr2 = this.f45690i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fJ = j(cVar.f45697c, i10);
        this.f45688g.n(0.0f, 0.0f);
        g gVarK = k(i10, cVar.f45695a);
        gVarK.c(fMax, fJ, cVar.f45699e, this.f45688g);
        this.f45691j.reset();
        this.f45688g.d(this.f45684c[i10], this.f45691j);
        if (this.f45693l && (gVarK.b() || n(this.f45691j, i10) || n(this.f45691j, i11))) {
            Path path = this.f45691j;
            path.op(path, this.f45687f, Path.Op.DIFFERENCE);
            this.f45689h[0] = this.f45688g.k();
            this.f45689h[1] = this.f45688g.l();
            this.f45684c[i10].mapPoints(this.f45689h);
            Path path2 = this.f45686e;
            float[] fArr3 = this.f45689h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f45688g.d(this.f45684c[i10], this.f45686e);
        } else {
            this.f45688g.d(this.f45684c[i10], cVar.f45696b);
        }
        b bVar = cVar.f45698d;
        if (bVar != null) {
            bVar.b(this.f45688g, this.f45684c[i10], i10);
        }
    }

    private void g(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e i(int i10, p pVar) {
        if (i10 == 1) {
            return pVar.t();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.B() : pVar.z();
        }
        return pVar.r();
    }

    private float j(RectF rectF, int i10) {
        float[] fArr = this.f45689h;
        r rVar = this.f45682a[i10];
        fArr[0] = rVar.f45702c;
        fArr[1] = rVar.f45703d;
        this.f45683b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f45689h[0]) : Math.abs(rectF.centerY() - this.f45689h[1]);
    }

    private g k(int i10, p pVar) {
        if (i10 == 1) {
            return pVar.q();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.x() : pVar.y();
        }
        return pVar.w();
    }

    public static q l() {
        return a.f45694a;
    }

    public static q m() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? l() : new q();
    }

    private boolean n(Path path, int i10) {
        this.f45692k.reset();
        this.f45682a[i10].d(this.f45683b[i10], this.f45692k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f45692k.computeBounds(rectF, true);
        path.op(this.f45692k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void o(c cVar, int i10, float[] fArr) {
        i(i10, cVar.f45695a).b(this.f45682a[i10], 90.0f, cVar.f45699e, cVar.f45697c, fArr == null ? h(i10, cVar.f45695a) : new mc.c(fArr[i10]));
        float fA = a(i10);
        this.f45683b[i10].reset();
        g(i10, cVar.f45697c, this.f45685d);
        Matrix matrix = this.f45683b[i10];
        PointF pointF = this.f45685d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f45683b[i10].preRotate(fA);
    }

    private void p(int i10) {
        this.f45689h[0] = this.f45682a[i10].i();
        this.f45689h[1] = this.f45682a[i10].j();
        this.f45683b[i10].mapPoints(this.f45689h);
        float fA = a(i10);
        this.f45684c[i10].reset();
        Matrix matrix = this.f45684c[i10];
        float[] fArr = this.f45689h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f45684c[i10].preRotate(fA);
    }

    public void d(p pVar, float f10, RectF rectF, Path path) {
        e(pVar, f10, rectF, null, path);
    }

    public void e(p pVar, float f10, RectF rectF, b bVar, Path path) {
        f(pVar, null, f10, rectF, bVar, path);
    }

    public void f(p pVar, float[] fArr, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f45686e.rewind();
        this.f45687f.rewind();
        this.f45687f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(pVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            o(cVar, i10, fArr);
            p(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f45686e.close();
        if (this.f45686e.isEmpty()) {
            return;
        }
        path.op(this.f45686e, Path.Op.UNION);
    }

    d h(int i10, p pVar) {
        if (i10 == 1) {
            return pVar.u();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.C() : pVar.A();
        }
        return pVar.s();
    }
}
