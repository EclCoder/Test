package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class B8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f24524a;

    static {
        String TAG = B8.class.getSimpleName();
        a(C9.a());
        kotlin.jvm.internal.s.g(TAG, "TAG");
        C9.a();
    }

    public static String a() {
        boolean zBooleanValue;
        Boolean bool = AbstractC2891ch.f26338b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "user_info_store");
                kotlin.jvm.internal.s.h("user_age_restricted", "key");
                AbstractC2891ch.f26338b = Boolean.valueOf(laA.f25198a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC2891ch.f26338b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            kotlin.jvm.internal.s.g("B8", "TAG");
            return null;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        if (gl.r.U(((RootConfig) c3136m5.a(RootConfig.class)).getIPAddrTPSupport(), Yi.f26090b)) {
            kotlin.jvm.internal.s.g("B8", "TAG");
            return f24524a;
        }
        kotlin.jvm.internal.s.g("B8", "TAG");
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c3136m5.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        boolean zBooleanValue;
        Boolean bool = AbstractC2891ch.f26338b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "user_info_store");
                kotlin.jvm.internal.s.h("user_age_restricted", "key");
                AbstractC2891ch.f26338b = Boolean.valueOf(laA.f25198a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC2891ch.f26338b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!zBooleanValue) {
            f24524a = str;
            C9.a(str);
        } else {
            f24524a = null;
            C9.a(null);
        }
    }
}
