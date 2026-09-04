package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10458a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f10459b = 3000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f10460c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10461d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f10462e = true;

    static int a() {
        return f10461d;
    }

    static long b() {
        return f10460c;
    }

    static long c() {
        return f10459b;
    }

    static void d(long j10) {
        f10460c = j10;
    }

    static void e(int i10) {
        f10461d = i10;
    }

    static void f(long j10) {
        f10459b = j10;
    }

    static void g(boolean z10) {
        f10458a = z10;
    }

    static void h(boolean z10) {
        f10462e = z10;
    }

    static boolean i() {
        return f10462e;
    }
}
