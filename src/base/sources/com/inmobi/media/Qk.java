package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.Qk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C3314t1 f25565a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Qk", "TAG");
            e10.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C3314t1 c3314t1 = f25565a;
            if (c3314t1 == null || (str = c3314t1.f27499b) == null) {
                return;
            }
            kotlin.jvm.internal.s.g("Qk", "TAG");
            Sb.a((byte) 2, "Qk", "Publisher device Id is " + str);
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Qk", "TAG");
            e10.getMessage();
        }
    }

    public static void c() {
        boolean z10;
        boolean zBooleanValue;
        C3314t1 c3314t1;
        try {
            Context context = Xi.f26021a;
            if (context != null) {
                C3314t1 c3314t2 = new C3314t1();
                try {
                    kotlin.jvm.internal.l0.b(AdvertisingIdClient.class).k();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        kotlin.jvm.internal.s.g(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c3314t2.f27499b = advertisingIdInfo.getId();
                        c3314t2.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f25565a = c3314t2;
                        Boolean bool = AbstractC2891ch.f26338b;
                        if (bool == null) {
                            Context context2 = Xi.f26021a;
                            z10 = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = La.f25197b;
                                La laA = Ka.a(context2, "user_info_store");
                                kotlin.jvm.internal.s.h("user_age_restricted", "key");
                                AbstractC2891ch.f26338b = Boolean.valueOf(laA.f25198a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC2891ch.f26338b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z10 || (c3314t1 = f25565a) == null) {
                                return;
                            }
                            c3314t1.f27499b = null;
                            return;
                            kotlin.jvm.internal.s.g("Qk", "TAG");
                            e.getMessage();
                        }
                        zBooleanValue = bool.booleanValue();
                        z10 = zBooleanValue;
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        kotlin.jvm.internal.s.g("Qk", "TAG");
                        th2.getMessage();
                        return;
                    }
                } catch (NoClassDefFoundError unused) {
                    return;
                }
                kotlin.jvm.internal.s.g("Qk", "TAG");
                e.getMessage();
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Qk", "TAG");
            e10.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z10) {
        C3314t1 c3314t1 = f25565a;
        if (c3314t1 == null) {
            return;
        }
        if (z10) {
            c3314t1.f27499b = null;
        } else if (c3314t1.f27499b == null) {
            Runnable runnable = new Runnable() { // from class: yh.u3
                @Override // java.lang.Runnable
                public final void run() {
                    Qk.d();
                }
            };
            Context context = Xi.f26021a;
            kotlin.jvm.internal.s.h(runnable, "runnable");
            Xi.f26027g.submit(runnable);
        }
    }
}
