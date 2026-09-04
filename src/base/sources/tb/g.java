package tb;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f53283a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f53284b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f53285c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f53283a);
        matrix2.getValues(this.f53284b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f53284b;
            float f11 = fArr[i10];
            float f12 = this.f53283a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f53285c.setValues(this.f53284b);
        return this.f53285c;
    }
}
