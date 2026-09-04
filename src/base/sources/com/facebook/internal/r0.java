package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15352e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f15353f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.r0 f15354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f15356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15357d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized String f(String str) {
            String strI;
            strI = str;
            for (Map.Entry entry : r0.f15353f.entrySet()) {
                strI = bm.r.I(strI, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strI;
        }

        public final void a(com.facebook.r0 behavior, int i10, String tag, String string) {
            kotlin.jvm.internal.s.h(behavior, "behavior");
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(string, "string");
            if (com.facebook.h0.M(behavior)) {
                String strF = f(string);
                if (!bm.r.N(tag, "FacebookSDK.", false, 2, null)) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(i10, tag, strF);
                if (behavior == com.facebook.r0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(com.facebook.r0 behavior, String tag, String string) {
            kotlin.jvm.internal.s.h(behavior, "behavior");
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(com.facebook.r0 behavior, String tag, String format, Object... args) {
            kotlin.jvm.internal.s.h(behavior, "behavior");
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(format, "format");
            kotlin.jvm.internal.s.h(args, "args");
            if (com.facebook.h0.M(behavior)) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.s.g(str, "format(format, *args)");
                a(behavior, 3, tag, str);
            }
        }

        public final synchronized void d(String accessToken) {
            kotlin.jvm.internal.s.h(accessToken, "accessToken");
            if (!com.facebook.h0.M(com.facebook.r0.f15994b)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            kotlin.jvm.internal.s.h(original, "original");
            kotlin.jvm.internal.s.h(replace, "replace");
            r0.f15353f.put(original, replace);
        }

        private a() {
        }
    }

    public r0(com.facebook.r0 behavior, String tag) {
        kotlin.jvm.internal.s.h(behavior, "behavior");
        kotlin.jvm.internal.s.h(tag, "tag");
        this.f15357d = 3;
        this.f15354a = behavior;
        this.f15355b = "FacebookSDK." + f1.n(tag, "tag");
        this.f15356c = new StringBuilder();
    }

    private final boolean g() {
        return com.facebook.h0.M(this.f15354a);
    }

    public final void b(String string) {
        kotlin.jvm.internal.s.h(string, "string");
        if (g()) {
            this.f15356c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        kotlin.jvm.internal.s.h(format, "format");
        kotlin.jvm.internal.s.h(args, "args");
        if (g()) {
            StringBuilder sb2 = this.f15356c;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.s.g(str, "format(format, *args)");
            sb2.append(str);
        }
    }

    public final void d(String key, Object value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String string = this.f15356c.toString();
        kotlin.jvm.internal.s.g(string, "contents.toString()");
        f(string);
        this.f15356c = new StringBuilder();
    }

    public final void f(String string) {
        kotlin.jvm.internal.s.h(string, "string");
        f15352e.a(this.f15354a, this.f15357d, this.f15355b, string);
    }
}
