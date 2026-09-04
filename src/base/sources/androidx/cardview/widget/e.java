package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f1886a = Math.cos(Math.toRadians(45.0d));

    static float a(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f1886a) * ((double) f11))) : f10;
    }

    static float b(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f1886a) * ((double) f11))) : f10 * 1.5f;
    }
}
