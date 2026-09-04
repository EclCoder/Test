package bk;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class j {
    public static void a(RectF rectF, float[] fArr) {
        rectF.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i10 = 1; i10 < fArr.length; i10 += 2) {
            float fRound = Math.round(fArr[i10 - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i10] * 10.0f) / 10.0f;
            float f10 = rectF.left;
            if (fRound < f10) {
                f10 = fRound;
            }
            rectF.left = f10;
            float f11 = rectF.top;
            if (fRound2 < f11) {
                f11 = fRound2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (fRound <= f12) {
                fRound = f12;
            }
            rectF.right = fRound;
            float f13 = rectF.bottom;
            if (fRound2 <= f13) {
                fRound2 = f13;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
    }
}
