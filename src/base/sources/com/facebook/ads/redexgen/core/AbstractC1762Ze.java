package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1762Ze {
    public static String[] A00 = {"B", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (XX.A02 * 200.0f);
    public static final int A03 = (int) (XX.A02 * 200.0f);
    public static final int A02 = (int) (XX.A02 * 50.0f);

    public static NF A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return NF.A05;
        }
        return NF.A03;
    }

    public static AbstractC1761Zd A01(C2198gi c2198gi, VA va2, String str, View view) {
        if (view == null) {
            return null;
        }
        int w10 = view.getWidth();
        int height = view.getHeight();
        if (w10 >= A01 && height >= A01) {
            return new MC(c2198gi, va2, str);
        }
        if (w10 >= A03) {
            int i10 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i10) {
                return new MD(c2198gi, va2, str);
            }
        }
        return null;
    }

    public static ME A02(C2198gi c2198gi, VA va2, String str, C1468Nm c1468Nm, InterfaceC1740Yi interfaceC1740Yi, InterfaceC1739Yh interfaceC1739Yh) {
        return new ME(c2198gi, va2, str, c1468Nm, interfaceC1740Yi, interfaceC1739Yh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int i10;
        int h10;
        int w10;
        int w11;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w12 = A01;
        if (width < w12) {
            i10 = A03;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[0];
            h10 = str.length();
            w10 = str2.length();
            if (h10 != w10) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width >= i10) {
                w11 = A02;
                if (height < w11) {
                }
            }
            return true;
        }
        int w13 = A01;
        if (height < w13) {
            i10 = A03;
            String[] strArr3 = A00;
            String str3 = strArr3[1];
            String str4 = strArr3[0];
            h10 = str3.length();
            w10 = str4.length();
            if (h10 != w10) {
                throw new RuntimeException();
            }
            String[] strArr4 = A00;
            strArr4[1] = "e";
            strArr4[0] = "I";
            if (width >= i10) {
                w11 = A02;
                if (height < w11) {
                }
            }
            return true;
        }
        return false;
    }
}
