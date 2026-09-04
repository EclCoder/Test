package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final La f25006a;

    public Ig(Context context, String sharePrefFile) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        this.f25006a = Ka.a(context, sharePrefFile);
    }

    public final String a(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        La la2 = this.f25006a;
        la2.getClass();
        kotlin.jvm.internal.s.h(key, "key");
        return la2.f25198a.getString(key, null);
    }
}
