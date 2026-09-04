package com.bytedance.adsdk.hn.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static float hn(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float hnj(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int hnj(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fHn = hn(((i10 >> 16) & 255) / 255.0f);
        float fHn2 = hn(((i10 >> 8) & 255) / 255.0f);
        float fHn3 = hn((i10 & 255) / 255.0f);
        float fHn4 = hn(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fHn5 = fHn2 + ((hn(((i11 >> 8) & 255) / 255.0f) - fHn2) * f10);
        float fHn6 = fHn3 + (f10 * (hn((i11 & 255) / 255.0f) - fHn3));
        return (Math.round(hnj(fHn + ((fHn4 - fHn) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(hnj(fHn5) * 255.0f) << 8) | Math.round(hnj(fHn6) * 255.0f);
    }
}
