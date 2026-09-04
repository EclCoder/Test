package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3340u1 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27584c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f27586e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27582a = 90.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27585d = true;

    public C3340u1(float f10, float f11) {
        this.f27583b = f10;
        this.f27584c = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t10) {
        kotlin.jvm.internal.s.h(t10, "t");
        float f11 = ((this.f27582a - 0.0f) * f10) + 0.0f;
        float f12 = this.f27583b;
        float f13 = this.f27584c;
        Camera camera = this.f27586e;
        Matrix matrix = t10.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f27585d) {
                camera.translate(0.0f, 0.0f, f10 * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * 0.0f);
            }
            camera.rotateX(f11);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f27586e = new Camera();
    }
}
