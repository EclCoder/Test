package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Boolean f14640hn;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.as> hnj;
    private static Boolean qor;

    public static boolean hn() {
        try {
            if (qor == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.as.sk.hnj("iv_rv_load_show_new", 0) != 1) {
                    z10 = false;
                }
                qor = Boolean.valueOf(z10);
            }
            return qor.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean hnj() {
        try {
            if (f14640hn == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.as.sk.hnj("net_opt_multiple_domain_retry", 0) != 1) {
                    z10 = false;
                }
                f14640hn = Boolean.valueOf(z10);
            }
            return f14640hn.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.as qor() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.as> softReference = hnj;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            return;
        }
        hnj = new SoftReference<>(asVar);
    }
}
