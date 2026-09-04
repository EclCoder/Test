package com.bytedance.adsdk.hn;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class jip implements Interpolator {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final float[] f12016hn;
    private final float[] hnj;

    jip(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.hnj = new float[i11];
        this.f12016hn = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.hnj[i12] = fArr[0];
            this.f12016hn[i12] = fArr[1];
        }
    }

    private static Path hnj(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.hnj.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.hnj[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.hnj;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f12016hn[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f12016hn;
        float f15 = fArr2[i10];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    jip(float f10, float f11, float f12, float f13) {
        this(hnj(f10, f11, f12, f13));
    }
}
