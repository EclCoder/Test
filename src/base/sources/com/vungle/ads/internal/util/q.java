package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q {
    public static final a Companion = new a(null);
    private static final bm.o IP_REGEX = new bm.o("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    private static boolean enabled;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int d(String tag, String message) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            if (q.enabled) {
                return Log.d(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final int e(String tag, String message) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            if (q.enabled) {
                return Log.e(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final /* synthetic */ void enable$vungle_ads_release(boolean z10) {
            q.enabled = z10;
        }

        public final /* synthetic */ String eraseSensitiveData$vungle_ads_release(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            return q.IP_REGEX.i(str, "xxx.xxx.xxx.xxx");
        }

        public final int i(String tag, String message) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            if (q.enabled) {
                return Log.i(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            if (q.enabled) {
                return Log.w(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        private a() {
        }

        public final int e(String tag, String message, Throwable throwable) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            kotlin.jvm.internal.s.h(throwable, "throwable");
            if (!q.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData$vungle_ads_release(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int w(String tag, tl.a message) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            if (q.enabled) {
                return Log.w(tag, eraseSensitiveData$vungle_ads_release((String) message.invoke()));
            }
            return -1;
        }
    }

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int i(String str, String str2) {
        return Companion.i(str, str2);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }

    public static final int e(String str, String str2, Throwable th2) {
        return Companion.e(str, str2, th2);
    }

    public static final int w(String str, tl.a aVar) {
        return Companion.w(str, aVar);
    }
}
