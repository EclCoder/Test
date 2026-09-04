package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15019d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0264b f15021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f15022c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0264b {
        public final q0 a() {
            return new q0(h0.m(), null, 2, null);
        }
    }

    public b(SharedPreferences sharedPreferences, C0264b tokenCachingStrategyFactory) {
        kotlin.jvm.internal.s.h(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.s.h(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f15020a = sharedPreferences;
        this.f15021b = tokenCachingStrategyFactory;
    }

    private final com.facebook.a b() {
        String string = this.f15020a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return com.facebook.a.f14853l.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final com.facebook.a c() {
        Bundle bundleC = d().c();
        if (bundleC == null || !q0.f15985c.g(bundleC)) {
            return null;
        }
        return com.facebook.a.f14853l.c(bundleC);
    }

    private final q0 d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (this.f15022c == null) {
                synchronized (this) {
                    try {
                        if (this.f15022c == null) {
                            this.f15022c = this.f15021b.a();
                        }
                        fl.g0 g0Var = fl.g0.f38750a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            q0 q0Var = this.f15022c;
            if (q0Var != null) {
                return q0Var;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f15020a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return h0.L();
    }

    public final void a() {
        this.f15020a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final com.facebook.a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        com.facebook.a aVarC = c();
        if (aVarC != null) {
            g(aVarC);
            d().a();
        }
        return aVarC;
    }

    public final void g(com.facebook.a accessToken) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        try {
            this.f15020a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.u().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.s.g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new C0264b());
    }
}
