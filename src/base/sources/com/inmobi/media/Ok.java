package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ok {
    public static int a(String str) {
        if (bm.r.N(str, "track_", false, 2, null)) {
            str = str.substring(6);
            kotlin.jvm.internal.s.g(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
