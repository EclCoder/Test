package bk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f9045b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f9046c = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f9047d = new float[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f9048e = new float[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f9049f = new float[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f9050g = new RectF();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f9051h = new Matrix();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9053j;

    public boolean d(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setRotate(-h());
        f(this.f9048e);
        l(this.f9049f, this.f9048e);
        matrix.mapPoints(this.f9046c, this.f9049f);
        matrix.mapPoints(this.f9047d, fArr);
        j.a(this.f9050g, this.f9046c);
        RectF rectF = this.f9050g;
        float[] fArr2 = this.f9047d;
        return rectF.contains(fArr2[0], fArr2[1]);
    }

    public abstract void e(Canvas canvas);

    public void f(float[] fArr) {
        if (this.f9052i) {
            if (this.f9053j) {
                fArr[0] = p();
                fArr[1] = i();
                fArr[2] = 0.0f;
                fArr[3] = i();
                fArr[4] = p();
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
                return;
            }
            fArr[0] = p();
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = p();
            fArr[5] = i();
            fArr[6] = 0.0f;
            fArr[7] = i();
            return;
        }
        if (this.f9053j) {
            fArr[0] = 0.0f;
            fArr[1] = i();
            fArr[2] = p();
            fArr[3] = i();
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = p();
            fArr[7] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = p();
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = i();
        fArr[6] = p();
        fArr[7] = i();
    }

    public void g(PointF pointF) {
        pointF.set((p() * 1.0f) / 2.0f, (i() * 1.0f) / 2.0f);
    }

    public float h() {
        return n(this.f9051h);
    }

    public abstract int i();

    public String j() {
        return this.f9044a;
    }

    public void k(PointF pointF, float[] fArr, float[] fArr2) {
        g(pointF);
        fArr2[0] = pointF.x;
        fArr2[1] = pointF.y;
        l(fArr, fArr2);
        pointF.set(fArr[0], fArr[1]);
    }

    public void l(float[] fArr, float[] fArr2) {
        this.f9051h.mapPoints(fArr, fArr2);
    }

    public Matrix m() {
        return this.f9051h;
    }

    public float n(Matrix matrix) {
        return (float) Math.toDegrees(-Math.atan2(o(matrix, 1), o(matrix, 0)));
    }

    public float o(Matrix matrix, int i10) {
        matrix.getValues(this.f9045b);
        return this.f9045b[i10];
    }

    public abstract int p();

    public boolean q() {
        return this.f9052i;
    }

    public boolean r() {
        return this.f9053j;
    }

    public h s(boolean z10) {
        this.f9052i = z10;
        return this;
    }

    public h t(boolean z10) {
        this.f9053j = z10;
        return this;
    }

    public h u(String str) {
        this.f9044a = str;
        return this;
    }

    public h v(Matrix matrix) {
        this.f9051h.set(matrix);
        return this;
    }
}
