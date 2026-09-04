package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ka {
    public static String a(String fileKey) {
        kotlin.jvm.internal.s.h(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static La a(Context context, String fileKey) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(fileKey, "fileKey");
        String strA = a(fileKey);
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La la2 = (La) concurrentHashMap.get(strA);
        if (la2 == null) {
            la2 = new La(context, strA);
            La la3 = (La) concurrentHashMap.putIfAbsent(strA, la2);
            if (la3 != null) {
                return la3;
            }
        }
        return la2;
    }
}
