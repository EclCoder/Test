package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f33967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f33968b;

    public static boolean b() {
        if (f33968b == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                f33968b = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f33968b != null && f33968b.booleanValue();
    }

    public static boolean a() {
        if (f33967a == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f33967a = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(NpmRNZ.PtFAHvMAU, "isChina", e10);
                }
            }
        }
        return f33967a != null && f33967a.booleanValue();
    }
}
