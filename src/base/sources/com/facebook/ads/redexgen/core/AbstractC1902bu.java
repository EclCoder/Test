package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1902bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) (((double) (XW.A00().widthPixels - (AbstractC1911c3.A08 * 2))) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1883bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1911c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1901bt A03(ViewOnClickListenerC1396Kr viewOnClickListenerC1396Kr, String str) {
        return new ViewOnClickListenerC1901bt(viewOnClickListenerC1396Kr, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
