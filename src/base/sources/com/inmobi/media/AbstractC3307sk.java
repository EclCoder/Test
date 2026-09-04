package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3307sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final La f27476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f27477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f27478c;

    static {
        La laA;
        Context context = Xi.f26021a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            laA = Ka.a(context, "imtelemetrydboverflow");
        } else {
            laA = null;
        }
        f27476a = laA;
        f27477b = -1;
    }

    public static int a() {
        if (f27477b == -1) {
            La la2 = f27476a;
            int i10 = 0;
            if (la2 != null) {
                kotlin.jvm.internal.s.h("count", "key");
                i10 = la2.f25198a.getInt("count", 0);
            }
            f27477b = i10;
        }
        return f27477b;
    }
}
