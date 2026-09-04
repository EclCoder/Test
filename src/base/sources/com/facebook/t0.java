package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16067b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16068a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public t0() {
        SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.s.g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f16068a = sharedPreferences;
    }

    public final void a() {
        this.f16068a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final s0 b() {
        String string = this.f16068a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new s0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(s0 profile) {
        kotlin.jvm.internal.s.h(profile, "profile");
        JSONObject jSONObjectF = profile.f();
        if (jSONObjectF != null) {
            this.f16068a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectF.toString()).apply();
        }
    }
}
