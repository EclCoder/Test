package com.facebook;

import android.content.Intent;
import com.facebook.internal.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16069d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile u0 f16070e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.a f16071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f16072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f16073c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized u0 a() {
            u0 u0Var;
            try {
                if (u0.f16070e == null) {
                    s1.a aVarB = s1.a.b(h0.m());
                    kotlin.jvm.internal.s.g(aVarB, "getInstance(applicationContext)");
                    u0.f16070e = new u0(aVarB, new t0());
                }
                u0Var = u0.f16070e;
                if (u0Var == null) {
                    kotlin.jvm.internal.s.w("instance");
                    u0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return u0Var;
        }

        public a() {
        }
    }

    public u0(s1.a localBroadcastManager, t0 profileCache) {
        kotlin.jvm.internal.s.h(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.s.h(profileCache, "profileCache");
        this.f16071a = localBroadcastManager;
        this.f16072b = profileCache;
    }

    private final void e(s0 s0Var, s0 s0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", s0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", s0Var2);
        this.f16071a.d(intent);
    }

    private final void g(s0 s0Var, boolean z10) {
        s0 s0Var2 = this.f16073c;
        this.f16073c = s0Var;
        if (z10) {
            if (s0Var != null) {
                this.f16072b.c(s0Var);
            } else {
                this.f16072b.a();
            }
        }
        if (e1.e(s0Var2, s0Var)) {
            return;
        }
        e(s0Var2, s0Var);
    }

    public final s0 c() {
        return this.f16073c;
    }

    public final boolean d() {
        s0 s0VarB = this.f16072b.b();
        if (s0VarB == null) {
            return false;
        }
        g(s0VarB, false);
        return true;
    }

    public final void f(s0 s0Var) {
        g(s0Var, true);
    }
}
