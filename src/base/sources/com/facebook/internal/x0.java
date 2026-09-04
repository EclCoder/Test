package com.facebook.internal;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f15469a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15470b = x0.class.getName();

    private x0() {
    }

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.h0.w()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection d() {
        return gl.r.o("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection e() {
        return gl.r.o("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.h0.w()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String g() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("%s", Arrays.copyOf(new Object[]{com.facebook.h0.x()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String h() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.h0.z()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String i(String subdomain) {
        kotlin.jvm.internal.s.h(subdomain, "subdomain");
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String j() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{com.facebook.h0.z()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public static final String k() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.h0.A()}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }
}
