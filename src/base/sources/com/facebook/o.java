package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15944b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15945a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public o(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.s.h(sharedPreferences, "sharedPreferences");
        this.f15945a = sharedPreferences;
    }

    public final void a() {
        this.f15945a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(n authenticationToken) {
        kotlin.jvm.internal.s.h(authenticationToken, "authenticationToken");
        try {
            this.f15945a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o() {
        SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.s.g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }
}
