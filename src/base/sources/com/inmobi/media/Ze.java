package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ze {
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    public static EnumC2931e6 a(ConnectivityManager connectivityManager) {
        long jElapsedRealtime;
        AdConfig.CustomNetworkValidation customNetworkValidationA;
        long nonValidatedExpiry;
        AdConfig.CustomNetworkValidation customNetworkValidationA2;
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return EnumC2931e6.f26459j;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return EnumC2931e6.f26459j;
        }
        kotlin.jvm.internal.s.g("Ze", "TAG");
        networkCapabilities.toString();
        if (!networkCapabilities.hasCapability(12)) {
            return EnumC2931e6.f26459j;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getSkipNetworkValidationFeatureEnabled() || networkCapabilities.hasCapability(16)) {
            return null;
        }
        Network network2 = C2930e5.f26446a;
        kotlin.jvm.internal.s.h(network, "network");
        AdConfig.CustomNetworkValidation customNetworkValidationA3 = C2930e5.a();
        if (!(customNetworkValidationA3 != null ? customNetworkValidationA3.getEnabled() : false)) {
            return EnumC2931e6.f26459j;
        }
        long j10 = C2930e5.f26449d;
        if (j10 != 0) {
            em.o0 o0Var = AbstractC3488zl.f28033a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j10;
            AdConfig.CustomNetworkValidation customNetworkValidationA4 = C2930e5.a();
            if (jElapsedRealtime2 >= (customNetworkValidationA4 != null ? customNetworkValidationA4.getRefreshDebounceTime() : 1000L)) {
                C2930e5.f26449d = SystemClock.elapsedRealtime();
                if (kotlin.jvm.internal.s.c(C2930e5.f26446a, network)) {
                    long j11 = C2930e5.f26448c;
                    em.o0 o0Var2 = AbstractC3488zl.f28033a;
                    jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
                    if (C2930e5.f26447b) {
                        customNetworkValidationA2 = C2930e5.a();
                        if (customNetworkValidationA2 != null) {
                            nonValidatedExpiry = customNetworkValidationA2.getValidatedExpiry();
                        } else {
                            nonValidatedExpiry = 120000;
                        }
                    } else {
                        customNetworkValidationA = C2930e5.a();
                        if (customNetworkValidationA != null) {
                            nonValidatedExpiry = customNetworkValidationA.getNonValidatedExpiry();
                        } else {
                            nonValidatedExpiry = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
                        }
                    }
                    if (jElapsedRealtime > nonValidatedExpiry) {
                        if (C2930e5.f26450e.compareAndSet(false, true)) {
                            em.k.d(H9.f24931d, null, null, new C2905d5(network, null), 3, null);
                        }
                    }
                } else if (C2930e5.f26450e.compareAndSet(false, true)) {
                    em.k.d(H9.f24931d, null, null, new C2905d5(network, null), 3, null);
                }
            }
        } else {
            C2930e5.f26449d = SystemClock.elapsedRealtime();
            if (kotlin.jvm.internal.s.c(C2930e5.f26446a, network)) {
                long j12 = C2930e5.f26448c;
                em.o0 o0Var3 = AbstractC3488zl.f28033a;
                jElapsedRealtime = SystemClock.elapsedRealtime() - j12;
                if (C2930e5.f26447b) {
                    customNetworkValidationA2 = C2930e5.a();
                    if (customNetworkValidationA2 != null) {
                        nonValidatedExpiry = customNetworkValidationA2.getValidatedExpiry();
                    } else {
                        nonValidatedExpiry = 120000;
                    }
                } else {
                    customNetworkValidationA = C2930e5.a();
                    if (customNetworkValidationA != null) {
                        nonValidatedExpiry = customNetworkValidationA.getNonValidatedExpiry();
                    } else {
                        nonValidatedExpiry = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
                    }
                }
                if (jElapsedRealtime > nonValidatedExpiry) {
                    if (C2930e5.f26450e.compareAndSet(false, true)) {
                        em.k.d(H9.f24931d, null, null, new C2905d5(network, null), 3, null);
                    }
                }
            } else if (C2930e5.f26450e.compareAndSet(false, true)) {
                em.k.d(H9.f24931d, null, null, new C2905d5(network, null), 3, null);
            }
        }
        if (C2930e5.f26447b) {
            return null;
        }
        return EnumC2931e6.f26464o;
    }

    public static boolean b() {
        Context context = Xi.f26021a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
            return false;
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Ze", "TAG");
            e10.getMessage();
            return false;
        }
    }

    public static EnumC2931e6 a() {
        EnumC2931e6 enumC2931e6A;
        Context context = Xi.f26021a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC2931e6A = a((ConnectivityManager) systemService);
            } catch (Exception e10) {
                kotlin.jvm.internal.s.g("Ze", "TAG");
                e10.getMessage();
                enumC2931e6A = EnumC2931e6.f26461l;
            }
            if (enumC2931e6A != null) {
                return enumC2931e6A;
            }
            if (b()) {
                return EnumC2931e6.f26458i;
            }
            return null;
        }
        return EnumC2931e6.f26457h;
    }
}
