package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static La f26133a;

    public static final La a() {
        La laA;
        if (f26133a == null) {
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                laA = Ka.a(context, "CrashSession-store");
            } else {
                laA = null;
            }
            f26133a = laA;
        }
        return f26133a;
    }
}
