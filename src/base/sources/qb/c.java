package qb;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import ob.m0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f50526a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f50527b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f50528c = new m0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50529d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.j(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            GlUtil.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f50528c.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f50527b, fArr2);
        if (!this.f50529d) {
            a(this.f50526a, this.f50527b);
            this.f50529d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f50526a, 0, this.f50527b, 0);
        return true;
    }

    public void d() {
        this.f50528c.c();
        this.f50529d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f50528c.a(j10, fArr);
    }
}
