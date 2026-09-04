package com.bytedance.adsdk.hn.dkl;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.hn.qor.hn.mjg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static final PointF hnj = new PointF();

    private static int hn(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static float hnj(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static boolean qor(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static int hnj(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static float hn(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static PointF hnj(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void hnj(mjg mjgVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFHnj = mjgVar.hnj();
        path.moveTo(pointFHnj.x, pointFHnj.y);
        hnj.set(pointFHnj.x, pointFHnj.y);
        int i10 = 0;
        while (i10 < mjgVar.qor().size()) {
            com.bytedance.adsdk.hn.qor.hnj hnjVar = mjgVar.qor().get(i10);
            PointF pointFHnj2 = hnjVar.hnj();
            PointF pointFHn = hnjVar.hn();
            PointF pointFQor = hnjVar.qor();
            PointF pointF = hnj;
            if (pointFHnj2.equals(pointF) && pointFHn.equals(pointFQor)) {
                path.lineTo(pointFQor.x, pointFQor.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFHnj2.x, pointFHnj2.y, pointFHn.x, pointFHn.y, pointFQor.x, pointFQor.y);
            }
            pointF.set(pointFQor.x, pointFQor.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (mjgVar.hn()) {
            path3.close();
        }
    }

    static int hnj(float f10, float f11) {
        return hnj((int) f10, (int) f11);
    }

    private static int hnj(int i10, int i11) {
        return i10 - (i11 * hn(i10, i11));
    }

    public static int hnj(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
