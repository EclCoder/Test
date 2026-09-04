package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f22209b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f22210c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f22211d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ge.a f22212a;

    private h(ge.a aVar) {
        this.f22212a = aVar;
    }

    public static h c() {
        return d(ge.b.a());
    }

    public static h d(ge.a aVar) {
        if (f22211d == null) {
            f22211d = new h(aVar);
        }
        return f22211d;
    }

    static boolean g(String str) {
        return f22210c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f22212a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(ee.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f22209b;
    }
}
