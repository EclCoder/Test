package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    public static void hnj(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
