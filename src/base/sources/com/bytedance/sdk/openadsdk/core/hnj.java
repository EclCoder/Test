package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class hnj {
    private static final String hnj = qor();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final String f13772hn = oj.gjv().gjv();

    public static String hn() {
        return new String(Base64.decode(f13772hn, 0)).substring(2);
    }

    public static String hnj() {
        return new String(Base64.decode(hnj, 0)).substring(2);
    }

    private static String qor() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i10 = 23; i10 >= 0; i10--) {
            cArr2[23 - i10] = (char) (cArr[i10] ^ 255);
        }
        return new String(cArr2);
    }
}
