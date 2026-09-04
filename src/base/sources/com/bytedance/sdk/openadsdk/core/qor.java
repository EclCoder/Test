package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static volatile qor hnj;

    private qor() {
    }

    public static qor hnj() {
        if (hnj == null) {
            synchronized (qor.class) {
                try {
                    if (hnj == null) {
                        hnj = new qor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public String hn(String str, String str2) {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", str, str2);
    }

    public int hn(String str, int i10) {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str, i10);
    }

    public Long hn(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str, j10));
    }

    public void hnj(String str, String str2) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str, str2);
    }

    public void hnj(String str, int i10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void hnj(String str, long j10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str, Long.valueOf(j10));
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", str);
    }
}
