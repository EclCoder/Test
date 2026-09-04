package vl;

import tn.xQIL.Saucuwx;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends b {
    public static int a(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static int b(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long d(float f10) {
        return c(f10);
    }

    public static double e(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            return d10;
        }
        return d10 > 0.0d ? Math.floor(d10) : Math.ceil(d10);
    }

    public static long c(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException(Saucuwx.MOchoxFKNpG);
    }
}
